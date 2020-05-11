package scurtu.machst.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

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
  private String timeStart;
  private String timeEnd;
  private String fixedTime;
  private Double price;
  private String priceFor;

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
