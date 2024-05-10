import axios from 'axios';

const axiosInstance = axios.create({
  baseURL: 'http://localhost:8080/v1/', // Replace with your base URL
  // timeout: 5000, // Timeout after 5 seconds
  withCredentials: true,
  headers: {
    'Content-Type': 'application/json',
  },
});

export default axiosInstance;