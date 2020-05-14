package scurtu.machst.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.File;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@ToString(of = {"id", "name"})
@EqualsAndHashCode(of = {"id", "name"})
public class Task {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String rubric;
  private String description;
  private String address;
  private String timeStart;
  private String timeEnd;
  private String fixedDate;
  private String fixedTime;
  private Double price;
  private String priceFor;

  private String paymentMethod;
  @ElementCollection
  private List<String> anotherWork;
  private LocalDateTime creationDate;
  private Integer visitors;
  private int status;
  @Lob
  private Byte[] image;

//  private List<Image> images;
//  private Category category;
//  private User author;
//  private User executor;

  public Task() {
  }

  public Byte[] getImage() {
    return image;
  }

  public void setImage(Byte[] image) {
    this.image = image;
  }

  public List<String> getAnotherWork() {
    return anotherWork;
  }

  public void setAnotherWork(List<String> anotherWork) {
    this.anotherWork = anotherWork;
  }

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public Integer getVisitors() {
    return visitors;
  }

  public void setVisitors(Integer visitors) {
    this.visitors = visitors;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getFixedDate() {
    return fixedDate;
  }

  public void setFixedDate(String fixedDate) {
    this.fixedDate = fixedDate;
  }

  public String getFixedTime() {
    return fixedTime;
  }

  public void setFixedTime(String fixedTime) {
    this.fixedTime = fixedTime;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRubric() {
    return rubric;
  }

  public void setRubric(String rubric) {
    this.rubric = rubric;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTimeStart() {
    return timeStart;
  }

  public void setTimeStart(String timeStart) {
    this.timeStart = timeStart;
  }

  public String getTimeEnd() {
    return timeEnd;
  }

  public void setTimeEnd(String timeEnd) {
    this.timeEnd = timeEnd;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getPriceFor() {
    return priceFor;
  }

  public void setPriceFor(String priceFor) {
    this.priceFor = priceFor;
  }
}
