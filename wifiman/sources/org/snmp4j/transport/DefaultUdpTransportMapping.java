package org.snmp4j.transport;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.TransportStateReference;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.security.SecurityLevel;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.util.WorkerTask;

/* loaded from: classes2.dex */
public class DefaultUdpTransportMapping extends UdpTransportMapping {
    private static final LogAdapter logger = LogFactory.getLogger(DefaultUdpTransportMapping.class);
    protected WorkerTask listener;
    protected ListenThread listenerThread;
    private int receiveBufferSize;
    protected DatagramSocket socket;
    private int socketTimeout;

    class ListenThread implements WorkerTask {
        private byte[] buf;
        private volatile boolean stop = false;

        public ListenThread() throws SocketException {
            this.buf = new byte[DefaultUdpTransportMapping.this.getMaxInboundMessageSize()];
        }

        public void close() {
            this.stop = true;
        }

        @Override // org.snmp4j.util.WorkerTask
        public void interrupt() {
            if (DefaultUdpTransportMapping.logger.isDebugEnabled()) {
                DefaultUdpTransportMapping.logger.debug("Interrupting worker task: " + getClass().getName());
            }
            close();
        }

        @Override // org.snmp4j.util.WorkerTask
        public void join() throws InterruptedException {
            if (DefaultUdpTransportMapping.logger.isDebugEnabled()) {
                DefaultUdpTransportMapping.logger.debug("Joining worker task: " + getClass().getName());
            }
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            ByteBuffer byteBufferWrap;
            DefaultUdpTransportMapping defaultUdpTransportMapping = DefaultUdpTransportMapping.this;
            DatagramSocket datagramSocket = defaultUdpTransportMapping.socket;
            if (datagramSocket != null) {
                try {
                    datagramSocket.setSoTimeout(defaultUdpTransportMapping.getSocketTimeout());
                    if (DefaultUdpTransportMapping.this.receiveBufferSize > 0) {
                        datagramSocket.setReceiveBufferSize(Math.max(DefaultUdpTransportMapping.this.receiveBufferSize, DefaultUdpTransportMapping.this.maxInboundMessageSize));
                    }
                    if (DefaultUdpTransportMapping.logger.isDebugEnabled()) {
                        DefaultUdpTransportMapping.logger.debug("UDP receive buffer size for socket " + DefaultUdpTransportMapping.this.getAddress() + " is set to: " + datagramSocket.getReceiveBufferSize());
                    }
                } catch (SocketException e10) {
                    DefaultUdpTransportMapping.logger.error(e10);
                    DefaultUdpTransportMapping.this.setSocketTimeout(0);
                }
            }
            while (!this.stop) {
                byte[] bArr = this.buf;
                DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, DefaultUdpTransportMapping.this.udpAddress.getInetAddress(), DefaultUdpTransportMapping.this.udpAddress.getPort());
                try {
                    try {
                        datagramSocket = DefaultUdpTransportMapping.this.socket;
                    } catch (PortUnreachableException e11) {
                        synchronized (DefaultUdpTransportMapping.this) {
                            DefaultUdpTransportMapping.this.listener = null;
                            DefaultUdpTransportMapping.logger.error(e11);
                            if (DefaultUdpTransportMapping.logger.isDebugEnabled()) {
                                e11.printStackTrace();
                            }
                            if (!this.stop && SNMP4JSettings.isForwardRuntimeExceptions()) {
                                throw new RuntimeException(e11);
                            }
                        }
                    } catch (SocketException e12) {
                        if (!this.stop) {
                            DefaultUdpTransportMapping.logger.warn("Socket for transport mapping " + toString() + " error: " + e12.getMessage());
                        }
                        if (!this.stop && SNMP4JSettings.isForwardRuntimeExceptions()) {
                            this.stop = true;
                            throw new RuntimeException(e12);
                        }
                        if (this.stop) {
                            continue;
                        } else {
                            try {
                                DatagramSocket datagramSocketRenewSocketAfterException = DefaultUdpTransportMapping.this.renewSocketAfterException(e12, datagramSocket);
                                if (datagramSocketRenewSocketAfterException == null) {
                                    throw e12;
                                }
                                DefaultUdpTransportMapping.this.socket = datagramSocketRenewSocketAfterException;
                            } catch (SocketException e13) {
                                this.stop = true;
                                DefaultUdpTransportMapping.this.socket = null;
                                DefaultUdpTransportMapping.logger.error("Socket renewal for transport mapping " + toString() + " failed with: " + e13.getMessage(), e13);
                            }
                        }
                    } catch (IOException e14) {
                        DefaultUdpTransportMapping.logger.warn(e14);
                        if (DefaultUdpTransportMapping.logger.isDebugEnabled()) {
                            e14.printStackTrace();
                        }
                        if (this.stop) {
                            continue;
                        } else if (SNMP4JSettings.isForwardRuntimeExceptions()) {
                            throw new RuntimeException(e14);
                        }
                    }
                } catch (SocketTimeoutException unused) {
                }
                if (datagramSocket == null) {
                    try {
                        this.stop = true;
                    } catch (InterruptedIOException e15) {
                        if (e15.bytesTransferred <= 0) {
                        }
                    }
                } else {
                    datagramSocket.receive(datagramPacket);
                }
                if (DefaultUdpTransportMapping.logger.isDebugEnabled()) {
                    DefaultUdpTransportMapping.logger.debug("Received message from " + datagramPacket.getAddress() + MqttTopic.TOPIC_LEVEL_SEPARATOR + datagramPacket.getPort() + " with length " + datagramPacket.getLength() + ": " + new OctetString(datagramPacket.getData(), 0, datagramPacket.getLength()).toHexString());
                }
                if (DefaultUdpTransportMapping.this.isAsyncMsgProcessingSupported()) {
                    int length = datagramPacket.getLength();
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(datagramPacket.getData(), 0, bArr2, 0, length);
                    byteBufferWrap = ByteBuffer.wrap(bArr2);
                } else {
                    byteBufferWrap = ByteBuffer.wrap(datagramPacket.getData());
                }
                DefaultUdpTransportMapping defaultUdpTransportMapping2 = DefaultUdpTransportMapping.this;
                UdpAddress udpAddress = defaultUdpTransportMapping2.udpAddress;
                SecurityLevel securityLevel = SecurityLevel.undefined;
                DefaultUdpTransportMapping.this.fireProcessMessage(new UdpAddress(datagramPacket.getAddress(), datagramPacket.getPort()), byteBufferWrap, new TransportStateReference(defaultUdpTransportMapping2, udpAddress, null, securityLevel, securityLevel, false, datagramSocket));
            }
            synchronized (DefaultUdpTransportMapping.this) {
                try {
                    DefaultUdpTransportMapping.this.listener = null;
                    this.stop = true;
                    DatagramSocket datagramSocket2 = DefaultUdpTransportMapping.this.socket;
                    if (datagramSocket2 != null && !datagramSocket2.isClosed()) {
                        datagramSocket2.close();
                    }
                    DefaultUdpTransportMapping.this.socket = null;
                } finally {
                }
            }
            if (DefaultUdpTransportMapping.logger.isDebugEnabled()) {
                DefaultUdpTransportMapping.logger.debug("Worker task stopped:" + getClass().getName());
            }
        }

        @Override // org.snmp4j.util.WorkerTask
        public void terminate() {
            close();
            if (DefaultUdpTransportMapping.logger.isDebugEnabled()) {
                DefaultUdpTransportMapping.logger.debug("Terminated worker task: " + getClass().getName());
            }
        }
    }

    public DefaultUdpTransportMapping() throws IOException {
        super(new UdpAddress("0.0.0.0/0"));
        this.socket = null;
        this.socketTimeout = 0;
        this.receiveBufferSize = 0;
        this.socket = new DatagramSocket(this.udpAddress.getPort());
    }

    private synchronized DatagramSocket ensureSocket() throws SocketException {
        DatagramSocket datagramSocket;
        datagramSocket = this.socket;
        if (datagramSocket == null) {
            datagramSocket = new DatagramSocket(this.udpAddress.getPort());
            datagramSocket.setSoTimeout(this.socketTimeout);
            this.socket = datagramSocket;
        }
        return datagramSocket;
    }

    @Override // org.snmp4j.transport.UdpTransportMapping, org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public void close() throws IOException {
        WorkerTask workerTask = this.listener;
        boolean z10 = true;
        boolean z11 = false;
        if (workerTask != null) {
            workerTask.terminate();
            workerTask.interrupt();
            if (this.socketTimeout > 0) {
                try {
                    workerTask.join();
                } catch (InterruptedException e10) {
                    logger.warn(e10);
                    z11 = true;
                }
            }
            this.listener = null;
        }
        DatagramSocket datagramSocket = this.socket;
        if (datagramSocket != null && !datagramSocket.isClosed()) {
            datagramSocket.close();
        }
        this.socket = null;
        if (workerTask == null || this.socketTimeout > 0) {
            z10 = z11;
        } else {
            try {
                workerTask.join();
                z10 = z11;
            } catch (InterruptedException e11) {
                logger.warn(e11);
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public int getPriority() {
        Object obj = this.listener;
        if (obj instanceof Thread) {
            return ((Thread) obj).getPriority();
        }
        return 5;
    }

    public int getReceiveBufferSize() {
        return this.receiveBufferSize;
    }

    public int getSocketTimeout() {
        return this.socketTimeout;
    }

    public String getThreadName() {
        Object obj = this.listener;
        if (obj instanceof Thread) {
            return ((Thread) obj).getName();
        }
        return null;
    }

    @Override // org.snmp4j.TransportMapping
    public boolean isListening() {
        return this.listener != null;
    }

    @Override // org.snmp4j.transport.UdpTransportMapping, org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public synchronized void listen() throws IOException {
        if (this.listener != null) {
            throw new SocketException("Port already listening");
        }
        ensureSocket();
        this.listenerThread = new ListenThread();
        WorkerTask workerTaskCreateWorkerThread = SNMP4JSettings.getThreadFactory().createWorkerThread("DefaultUDPTransportMapping_" + getAddress(), this.listenerThread, true);
        this.listener = workerTaskCreateWorkerThread;
        workerTaskCreateWorkerThread.run();
    }

    protected DatagramSocket renewSocketAfterException(SocketException socketException, DatagramSocket datagramSocket) throws SocketException {
        if (datagramSocket != null && !datagramSocket.isClosed()) {
            datagramSocket.close();
        }
        DatagramSocket datagramSocket2 = new DatagramSocket(this.udpAddress.getPort(), this.udpAddress.getInetAddress());
        datagramSocket2.setSoTimeout(this.socketTimeout);
        return datagramSocket2;
    }

    public void setMaxInboundMessageSize(int i10) {
        this.maxInboundMessageSize = i10;
    }

    public void setPriority(int i10) {
        Object obj = this.listener;
        if (obj instanceof Thread) {
            ((Thread) obj).setPriority(i10);
        }
    }

    public void setReceiveBufferSize(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Receive buffer size must be > 0");
        }
        this.receiveBufferSize = i10;
    }

    public void setSocketTimeout(int i10) throws SocketException {
        this.socketTimeout = i10;
        DatagramSocket datagramSocket = this.socket;
        if (datagramSocket != null) {
            try {
                datagramSocket.setSoTimeout(i10);
            } catch (SocketException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void setThreadName(String str) {
        Object obj = this.listener;
        if (obj instanceof Thread) {
            ((Thread) obj).setName(str);
        }
    }

    @Override // org.snmp4j.transport.UdpTransportMapping, org.snmp4j.TransportMapping
    public UdpAddress getListenAddress() {
        DatagramSocket datagramSocket = this.socket;
        if (datagramSocket != null) {
            return new UdpAddress(datagramSocket.getLocalAddress(), datagramSocket.getLocalPort());
        }
        return null;
    }

    @Override // org.snmp4j.transport.UdpTransportMapping, org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public void sendMessage(UdpAddress udpAddress, byte[] bArr, TransportStateReference transportStateReference) throws IOException {
        InetSocketAddress inetSocketAddress = new InetSocketAddress(udpAddress.getInetAddress(), udpAddress.getPort());
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug("Sending message to " + udpAddress + " with length " + bArr.length + ": " + new OctetString(bArr).toHexString());
        }
        ensureSocket().send(new DatagramPacket(bArr, bArr.length, inetSocketAddress));
    }

    public DefaultUdpTransportMapping(UdpAddress udpAddress, boolean z10) throws IOException {
        super(udpAddress);
        this.socket = null;
        this.socketTimeout = 0;
        this.receiveBufferSize = 0;
        DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
        this.socket = datagramSocket;
        datagramSocket.setReuseAddress(z10);
        this.socket.bind(new InetSocketAddress(udpAddress.getInetAddress(), udpAddress.getPort()));
    }

    public DefaultUdpTransportMapping(UdpAddress udpAddress) throws IOException {
        super(udpAddress);
        this.socket = null;
        this.socketTimeout = 0;
        this.receiveBufferSize = 0;
        this.socket = new DatagramSocket(udpAddress.getPort(), udpAddress.getInetAddress());
    }
}
