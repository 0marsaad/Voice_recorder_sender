# Directorial structure and packages

Voice_Recorder_Sender/
│
├── src/                         # Main source folder
│   ├── client/                  # Client-side code
│   │   ├── audio/               # Audio handling for the client
│   │   │   ├── Audio_recorder.java
│   │   │   ├── Audio_rlayer.java
│   │   │   ├── AudioUtils.java  # Helper methods for audio processing
│   │   ├── network/             # Network handling for the client
│   │   │   ├── ClientSocket.java
│   │   │   ├── Packet_handler.java
│   │   ├── gui/                 # GUI (Frontend) for the client
│   │   │   ├── MainFrame.java
│   │   │   ├── ChatWindow.java
│   │   │   ├── Settings_panel.java
│   │   ├── MainClient.java      # Entry point for the client application
│   │
│   ├── server/                  # Server-side code
│   │   ├── audio/               # Optional: Audio handling for server if needed
│   │   │   ├── AudioForwarder.java  # Server relaying audio (optional)
│   │   ├── network/             # Network handling for the server
│   │   │   ├── ServerSocket.java
│   │   │   ├── ClientHandler.java
│   │   ├── MainServer.java      # Entry point for the server application
│   │
│   ├── common/                  # Shared utilities between client and server
│       ├── Constants.java       # Port numbers, buffer sizes, etc.
│       ├── AudioPacket.java     # Serializable audio data packets
│       ├── Logger.java          # Logging utility
│
├── lib/                         # External libraries
│ 
│
├── test/                        # Unit tests
│   ├── client/
│   │   ├── AudioRecorderTest.java
│   │   ├── ClientSocketTest.java
│   ├── server/
│   │   ├── ServerSocketTest.java
│
├── bin/                       # Compiled Java classes
├── docs/                        # Documentation
|
│   ├── API.md                   # API documentation
│   ├── DESIGN.md                # Design documentation
│
├── resources/                   # Configuration files, audio samples
│   ├── config.properties
│   ├── sample.wav
│
├── .gitignore                   # Ignore file for Git
├── README.md                    # Project overview and setup instructions
├── pom.xml                      # Maven configuration (if using Maven)
└── build.gradle                 # Gradle configuration (if using Gradle)
