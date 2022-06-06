package com.portfolio.backend.model;
/**
 *
 * @author Nickler Federico
 */
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseMessage {
  private String message;
  public ResponseMessage(String message) {
    this.message = message;
  }
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
}
