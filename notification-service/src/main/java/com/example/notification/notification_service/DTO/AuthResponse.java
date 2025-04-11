package com.example.notification.notification_service.DTO;

public class AuthResponse {
	 private boolean valid;
	    private String message;
	    private String userId;
	    private String role;

	    public AuthResponse() {}

	    public AuthResponse(boolean valid, String message, String userId, String role) {
	        this.valid = valid;
	        this.message = message;
	        this.userId = userId;
	        this.role = role;
	    }

		public boolean isValid() {
			return valid;
		}

		public void setValid(boolean valid) {
			this.valid = valid;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}
}
