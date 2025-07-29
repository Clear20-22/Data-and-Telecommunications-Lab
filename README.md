# Data and Telecommunications Lab

This repository contains practical implementations and experiments related to data communication and networking concepts. The projects cover various encoding schemes, bit manipulation techniques, and socket programming implementations.

## 📁 Repository Structure

### Encoding/Decoding Implementations
- **AMI Encoding Decoding** - Alternate Mark Inversion encoding and decoding implementation
- **Manchester Encoding Decoding** - Manchester encoding scheme implementation with visualization
- **MLT-3 Encoding Decoding** - Multi-Level Transmit 3 encoding implementation
- **NRZ-I Encoding Decoding** - Non-Return-to-Zero Inverted encoding scheme
- **NRZ-L Encoding Decoding** - Non-Return-to-Zero Level encoding scheme  
- **Pseudoternary Encoding Decoding** - Pseudoternary encoding implementation

### Network Programming
- **Implementing Bit Stuffing and De-stuffing Using Socket Programming**
  - Server-Client communication implementation
  - Bit stuffing algorithm for frame synchronization
  - String-based communication examples

### Reference Materials
- **Data and Telecommunication**
  - Author slides (Chapters 1-32)
  - Textbook: "Data Communications and Networking" by Behrouz A. Forouzan
  - Additional lecture slides

## 🚀 Getting Started

### Prerequisites
- **Python 3.x** (for Jupyter notebooks)
- **Java JDK 8+** (for socket programming examples)
- **Jupyter Notebook** or **VS Code** with Jupyter extension
- **matplotlib** library for visualizations

### Installation

1. Clone the repository:
```bash
git clone https://github.com/Clear20-22/Data-and-Telecommunications-Lab.git
cd Data-and-Telecommunications-Lab
```

2. Install Python dependencies:
```bash
pip install matplotlib numpy jupyter
```

## 📊 Features

### Digital Encoding Schemes
Each encoding implementation includes:
- ✅ Encoding algorithm implementation
- ✅ Signal visualization using matplotlib
- ✅ Interactive Jupyter notebook environment
- ✅ Example data and test cases

**Supported Encoding Types:**
- **AMI (Alternate Mark Inversion)** - Binary 1s alternate between +V and -V
- **Manchester** - Each bit period divided into two intervals
- **MLT-3** - Multi-level encoding using three voltage levels
- **NRZ-I** - Signal inverts for binary 1, stays same for 0
- **NRZ-L** - Direct voltage representation of binary data
- **Pseudoternary** - Binary 0s alternate between +V and -V

### Socket Programming
- **Client-Server Architecture** - Basic TCP socket communication
- **Bit Stuffing Algorithm** - Frame synchronization technique
- **String Communication** - Text-based message exchange
- **File I/O Integration** - Reading data from external files

## 🛠️ Usage

### Running Encoding Examples

1. Navigate to any encoding directory:
```bash
cd "AMI Encoding Decoding"
```

2. Open the Jupyter notebook:
```bash
jupyter notebook AMI_encoding_decoding.ipynb
```

3. Run the cells to see encoding visualization

### Running Socket Programming Examples

1. Navigate to the socket programming directory:
```bash
cd "Implementing Bit Stuffing and De-stuffing Using Socket Programming/Server Client Communication"
```

2. Compile Java files:
```bash
javac Server.java
javac Client.java
```

3. Run server (in one terminal):
```bash
java Server
```

4. Run client (in another terminal):
```bash
java Client
```

## 📈 Example Output

### Digital Signal Visualization
The notebooks generate visual representations of:
- Original binary data
- Encoded signal waveforms
- Timing diagrams
- Comparative analysis between encoding schemes

### Socket Communication
- Real-time client-server message exchange
- Bit stuffing demonstration
- Network port information
- Connection status updates

## 🎓 Learning Objectives

This lab helps understand:
- **Physical Layer Concepts** - How data is encoded for transmission
- **Signal Processing** - Digital signal representation and manipulation
- **Network Programming** - Socket-based communication
- **Frame Synchronization** - Bit stuffing for reliable data transmission
- **Protocol Implementation** - Practical networking concepts

## 📚 Reference Materials

- **Textbook**: "Data Communications and Networking" by Behrouz A. Forouzan (5th Edition)
- **Slides**: Complete chapter-wise presentation slides (Ch01-Ch32)
- **Examples**: Practical implementation examples for each concept

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-encoding`)
3. Commit your changes (`git commit -am 'Add new encoding scheme'`)
4. Push to the branch (`git push origin feature/new-encoding`)
5. Create a Pull Request

## 📄 License

This project is for educational purposes as part of Data Communication and Networking coursework.

## 👥 Authors

- **Jubayer Ahmed Sojib** - Implementation and documentation

## 🔗 Useful Links

- [Data Communications and Networking Textbook](https://www.mheducation.com/)
- [Socket Programming in Java](https://docs.oracle.com/javase/tutorial/networking/sockets/)
- [Matplotlib Documentation](https://matplotlib.org/stable/contents.html)

---
*Last Updated: July 2025*
