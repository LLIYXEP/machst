package scurtu.machst.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class TaskService {

  @Value("${upload.path}")
  private String uploadPath;

  public void uploadImage(MultipartFile image) throws IOException {
    System.out.println(image.getOriginalFilename());
    System.out.println(image.getSize());

    if (image != null && !image.getOriginalFilename().isEmpty()) {
      File uploadDir = new File(uploadPath);
      if (!uploadDir.exists()) {
        uploadDir.mkdir();
      }

      String uuidFile = UUID.randomUUID().toString();
      String resultFilename = uuidFile + "." + image.getOriginalFilename();

      image.transferTo(new File(uploadPath + "/" + resultFilename));
    }
  }

}
