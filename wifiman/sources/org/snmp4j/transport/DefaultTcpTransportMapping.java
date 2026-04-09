package org.snmp4j.transport;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.TransportStateReference;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.security.SecurityLevel;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.TcpAddress;
import org.snmp4j.util.CommonTimer;
import org.snmp4j.util.WorkerTask;

/* loaded from: classes2.dex */
public class DefaultTcpTransportMapping extends TcpTransportMapping {
    public static final int DEFAULT_MAX_BUSY_LOOPS = 100;
    private static final int MIN_SNMP_HEADER_LENGTH = 6;
    private static final LogAdapter logger = LogFactory.getLogger(DefaultTcpTransportMapping.class);
    private long connectionTimeout;
    private int maxBusyLoops;
    protected MessageLengthDecoder messageLengthDecoder;
    protected WorkerTask server;
    private boolean serverEnabled;
    protected ServerThread serverThread;
    protected CommonTimer socketCleaner;
    protected Map<Address, SocketEntry> sockets;

    protected class ServerThread implements WorkerTask {
        protected byte[] buf;
        private ServerSocketChannel ssc;
        private volatile boolean stop = false;
        private Throwable lastError = null;
        private LinkedList<SocketEntry> pending = new LinkedList<>();
        protected Selector selector = Selector.open();

        public ServerThread() throws IOException {
            this.buf = new byte[DefaultTcpTransportMapping.this.getMaxInboundMessageSize()];
            if (DefaultTcpTransportMapping.this.serverEnabled) {
                ServerSocketChannel serverSocketChannelOpen = ServerSocketChannel.open();
                this.ssc = serverSocketChannelOpen;
                try {
                    serverSocketChannelOpen.configureBlocking(false);
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(DefaultTcpTransportMapping.this.tcpAddress.getInetAddress(), DefaultTcpTransportMapping.this.tcpAddress.getPort());
                    DefaultTcpTransportMapping.this.setSocketOptions(this.ssc.socket());
                    this.ssc.socket().bind(inetSocketAddress);
                    this.ssc.register(this.selector, 16);
                } catch (IOException e10) {
                    DefaultTcpTransportMapping.logger.warn("Socket bind failed for " + DefaultTcpTransportMapping.this.tcpAddress + ": " + e10.getMessage());
                    try {
                        this.ssc.close();
                    } catch (IOException e11) {
                        DefaultTcpTransportMapping.logger.warn("Socket close failed after bind failure for " + DefaultTcpTransportMapping.this.tcpAddress + ": " + e11.getMessage());
                    }
                    throw e10;
                }
            }
        }

        private void closeChannel(SelectableChannel selectableChannel) throws IOException {
            try {
                selectableChannel.close();
            } catch (IOException e10) {
                DefaultTcpTransportMapping.logger.warn(e10);
            }
        }

        private void connectChannel(SelectionKey selectionKey, TcpAddress tcpAddress) throws IOException {
            SocketEntry socketEntry = (SocketEntry) selectionKey.attachment();
            try {
                SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                if (!socketChannel.isConnected()) {
                    if (socketChannel.finishConnect()) {
                        socketChannel.configureBlocking(false);
                        DefaultTcpTransportMapping.logger.debug("Connected to " + socketEntry.getPeerAddress());
                        DefaultTcpTransportMapping.this.timeoutSocket(socketEntry);
                        socketEntry.removeRegistration(this.selector, 8);
                        socketEntry.addRegistration(this.selector, 4);
                    } else {
                        socketEntry = null;
                    }
                }
                if (socketEntry != null) {
                    if (tcpAddress == null) {
                        tcpAddress = socketEntry.getPeerAddress();
                    }
                    DefaultTcpTransportMapping.logger.debug("Fire connected event for " + tcpAddress);
                    DefaultTcpTransportMapping.this.fireConnectionStateChanged(new TransportStateEvent(DefaultTcpTransportMapping.this, tcpAddress, 1, null));
                }
            } catch (IOException e10) {
                DefaultTcpTransportMapping.logger.warn(e10);
                DefaultTcpTransportMapping.this.cancelNonServerSelectionKey(selectionKey);
                closeChannel(selectionKey.channel());
                if (socketEntry != null) {
                    this.pending.remove(socketEntry);
                }
            }
        }

        private void dispatchMessage(TcpAddress tcpAddress, ByteBuffer byteBuffer, long j10, Object obj) {
            ByteBuffer byteBufferWrap;
            byteBuffer.flip();
            if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                DefaultTcpTransportMapping.logger.debug("Received message from " + tcpAddress + " with length " + j10 + ": " + new OctetString(byteBuffer.array(), 0, (int) j10).toHexString());
            }
            if (DefaultTcpTransportMapping.this.isAsyncMsgProcessingSupported()) {
                int i10 = (int) j10;
                byte[] bArr = new byte[i10];
                System.arraycopy(byteBuffer.array(), 0, bArr, 0, i10);
                byteBufferWrap = ByteBuffer.wrap(bArr);
            } else {
                byteBufferWrap = ByteBuffer.wrap(byteBuffer.array(), 0, (int) j10);
            }
            DefaultTcpTransportMapping defaultTcpTransportMapping = DefaultTcpTransportMapping.this;
            SecurityLevel securityLevel = SecurityLevel.undefined;
            DefaultTcpTransportMapping.this.fireProcessMessage(tcpAddress, byteBufferWrap, new TransportStateReference(defaultTcpTransportMapping, tcpAddress, null, securityLevel, securityLevel, false, obj));
        }

        private void processPending() {
            synchronized (this.pending) {
                for (int i10 = 0; i10 < this.pending.size(); i10++) {
                    try {
                        SocketEntry socketEntry = this.pending.get(i10);
                        try {
                            if (socketEntry.getSocket().isConnected()) {
                                socketEntry.addRegistration(this.selector, 4);
                            } else {
                                socketEntry.addRegistration(this.selector, 8);
                            }
                        } catch (IOException e10) {
                            DefaultTcpTransportMapping.logger.error(e10);
                            this.pending.remove(socketEntry);
                            try {
                                socketEntry.getSocket().getChannel().close();
                                DefaultTcpTransportMapping.this.fireConnectionStateChanged(new TransportStateEvent(DefaultTcpTransportMapping.this, socketEntry.getPeerAddress(), 4, e10, socketEntry.message));
                            } catch (IOException e11) {
                                DefaultTcpTransportMapping.logger.error(e11);
                            }
                            this.lastError = e10;
                            if (SNMP4JSettings.isForwardRuntimeExceptions()) {
                                throw new RuntimeException(e10);
                            }
                        } catch (CancelledKeyException e12) {
                            DefaultTcpTransportMapping.logger.warn(e12);
                            this.pending.remove(socketEntry);
                            try {
                                socketEntry.getSocket().getChannel().close();
                                DefaultTcpTransportMapping.this.fireConnectionStateChanged(new TransportStateEvent(DefaultTcpTransportMapping.this, socketEntry.getPeerAddress(), 4, null, socketEntry.message));
                            } catch (IOException e13) {
                                DefaultTcpTransportMapping.logger.error(e13);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        private void queueNewMessage(SocketEntry socketEntry) {
            synchronized (this.pending) {
                this.pending.add(socketEntry);
            }
            this.selector.wakeup();
        }

        private TcpAddress writeData(SelectionKey selectionKey, TcpAddress tcpAddress) throws IOException {
            TcpAddress tcpAddress2;
            IOException e10;
            SocketEntry socketEntry = (SocketEntry) selectionKey.attachment();
            try {
                SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                tcpAddress2 = new TcpAddress(socketChannel.socket().getInetAddress(), socketChannel.socket().getPort());
                if (socketEntry != null) {
                    try {
                        if (!socketEntry.hasMessage()) {
                            synchronized (this.pending) {
                                this.pending.remove(socketEntry);
                                socketEntry.removeRegistration(this.selector, 4);
                            }
                        }
                    } catch (IOException e11) {
                        e10 = e11;
                        DefaultTcpTransportMapping.logger.warn(e10);
                        DefaultTcpTransportMapping.this.fireConnectionStateChanged(new TransportStateEvent(DefaultTcpTransportMapping.this, tcpAddress2, 2, e10));
                        closeChannel(selectionKey.channel());
                        return tcpAddress2;
                    }
                }
                if (socketEntry != null) {
                    writeMessage(socketEntry, socketChannel);
                }
            } catch (IOException e12) {
                tcpAddress2 = tcpAddress;
                e10 = e12;
            }
            return tcpAddress2;
        }

        private void writeMessage(SocketEntry socketEntry, SocketChannel socketChannel) throws IOException {
            byte[] bArrNextMessage = socketEntry.nextMessage();
            if (bArrNextMessage == null) {
                socketEntry.removeRegistration(this.selector, 4);
                if (!socketEntry.hasMessage() || socketEntry.isRegistered(4)) {
                    return;
                }
                socketEntry.addRegistration(this.selector, 4);
                DefaultTcpTransportMapping.logger.debug("Waking up selector");
                this.selector.wakeup();
                return;
            }
            socketChannel.write(ByteBuffer.wrap(bArrNextMessage));
            if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                DefaultTcpTransportMapping.logger.debug("Sent message with length " + bArrNextMessage.length + " to " + socketEntry.getPeerAddress() + ": " + new OctetString(bArrNextMessage).toHexString());
            }
            socketEntry.addRegistration(this.selector, 1);
        }

        public void close() {
            this.stop = true;
            WorkerTask workerTask = DefaultTcpTransportMapping.this.server;
            if (workerTask != null) {
                workerTask.terminate();
            }
        }

        protected void connectSocketToSendMessage(Address address, byte[] bArr, Socket socket, SocketEntry socketEntry, Map<Address, SocketEntry> map) throws IOException {
            SocketEntry socketEntryPutIfAbsent = map.putIfAbsent(address, socketEntry);
            if (socketEntryPutIfAbsent != null && socketEntryPutIfAbsent.getSocket().isConnected()) {
                if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                    DefaultTcpTransportMapping.logger.debug("Concurrent connection attempt detected, canceling this one to " + address);
                }
                socketEntryPutIfAbsent.addMessage(bArr);
                try {
                    socket.close();
                } catch (IOException e10) {
                    DefaultTcpTransportMapping.logger.error("Failed to close recently opened socket for '" + address + "', with " + e10.getMessage(), e10);
                }
                if (socketEntryPutIfAbsent.getSocket().isConnected()) {
                    queueNewMessage(socketEntryPutIfAbsent);
                    return;
                }
                socketEntry = socketEntryPutIfAbsent;
            } else if (socketEntryPutIfAbsent != null && !socketEntryPutIfAbsent.getSocket().isConnected()) {
                socketEntry.insertMessages(socketEntryPutIfAbsent.message);
                map.put(address, socketEntry);
                try {
                    socketEntryPutIfAbsent.getSocket().close();
                } catch (IOException e11) {
                    DefaultTcpTransportMapping.logger.error("Failed to close socket for '" + address + "', with " + e11.getMessage(), e11);
                }
            }
            queueNewMessage(socketEntry);
            DefaultTcpTransportMapping.logger.debug("Trying to connect to " + address);
        }

        public Throwable getLastError() {
            return this.lastError;
        }

        @Override // org.snmp4j.util.WorkerTask
        public void interrupt() {
            this.stop = true;
            if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                DefaultTcpTransportMapping.logger.debug("Interrupting worker task: " + getClass().getName());
            }
            this.selector.wakeup();
        }

        @Override // org.snmp4j.util.WorkerTask
        public void join() {
            if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                DefaultTcpTransportMapping.logger.debug("Joining worker task: " + getClass().getName());
            }
        }

        protected boolean readMessage(SelectionKey selectionKey, SocketChannel socketChannel, TcpAddress tcpAddress) throws IOException {
            SocketEntry socketEntry = (SocketEntry) selectionKey.attachment();
            if (socketEntry == null) {
                socketEntry = DefaultTcpTransportMapping.this.sockets.get(tcpAddress);
            }
            if (socketEntry != null) {
                socketEntry.used();
                ByteBuffer readBuffer = socketEntry.getReadBuffer();
                if (readBuffer != null) {
                    int i10 = socketChannel.read(readBuffer);
                    if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                        DefaultTcpTransportMapping.logger.debug("Read " + i10 + " bytes from " + tcpAddress);
                    }
                    if (i10 >= 0 && (readBuffer.hasRemaining() || readBuffer.position() < DefaultTcpTransportMapping.this.messageLengthDecoder.getMinHeaderLength())) {
                        socketEntry.addRegistration(this.selector, 1);
                    } else if (i10 < 0) {
                        DefaultTcpTransportMapping.this.socketClosedRemotely(selectionKey, socketChannel, tcpAddress);
                    } else {
                        readSnmpMessagePayload(socketChannel, tcpAddress, socketEntry, readBuffer);
                    }
                    if (i10 == 0) {
                        return false;
                    }
                    socketEntry.resetBusyLoops();
                    return true;
                }
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.buf);
            byteBufferWrap.limit(DefaultTcpTransportMapping.this.messageLengthDecoder.getMinHeaderLength());
            if (!socketChannel.isOpen()) {
                DefaultTcpTransportMapping.this.cancelNonServerSelectionKey(selectionKey);
                if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                    DefaultTcpTransportMapping.logger.debug("Read channel not open, no bytes read from " + tcpAddress);
                }
                return false;
            }
            try {
                long j10 = socketChannel.read(byteBufferWrap);
                if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                    DefaultTcpTransportMapping.logger.debug("Reading header " + j10 + " bytes from " + tcpAddress);
                }
                if (byteBufferWrap.position() >= DefaultTcpTransportMapping.this.messageLengthDecoder.getMinHeaderLength()) {
                    readSnmpMessagePayload(socketChannel, tcpAddress, socketEntry, byteBufferWrap);
                } else if (j10 < 0) {
                    DefaultTcpTransportMapping.this.socketClosedRemotely(selectionKey, socketChannel, tcpAddress);
                } else if (socketEntry != null && j10 > 0) {
                    DefaultTcpTransportMapping.this.addBufferToReadBuffer(socketEntry, byteBufferWrap);
                    socketEntry.addRegistration(this.selector, 1);
                } else if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                    DefaultTcpTransportMapping.logger.debug("No socket entry found for incoming address " + tcpAddress + " for incomplete message with length " + j10);
                }
                if (socketEntry == null || j10 == 0) {
                    return false;
                }
                socketEntry.resetBusyLoops();
                return true;
            } catch (ClosedChannelException unused) {
                DefaultTcpTransportMapping.this.cancelNonServerSelectionKey(selectionKey);
                if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                    DefaultTcpTransportMapping.logger.debug("Read channel not open, no bytes read from " + tcpAddress);
                }
                return false;
            }
        }

        protected void readSnmpMessagePayload(SocketChannel socketChannel, TcpAddress tcpAddress, SocketEntry socketEntry, ByteBuffer byteBuffer) throws IOException {
            Socket socket;
            MessageLength messageLength = DefaultTcpTransportMapping.this.messageLengthDecoder.getMessageLength(ByteBuffer.wrap(byteBuffer.array()));
            if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                DefaultTcpTransportMapping.logger.debug("Message length is " + messageLength);
            }
            if (messageLength.getMessageLength() > DefaultTcpTransportMapping.this.getMaxInboundMessageSize() || messageLength.getMessageLength() <= 0) {
                DefaultTcpTransportMapping.logger.error("Received message length " + messageLength + " is greater than inboundBufferSize " + DefaultTcpTransportMapping.this.getMaxInboundMessageSize());
                if (socketEntry == null || (socket = socketEntry.getSocket()) == null) {
                    return;
                }
                socket.close();
                DefaultTcpTransportMapping.logger.info("Socket to " + socketEntry.getPeerAddress() + " closed due to an error");
                return;
            }
            int messageLength2 = messageLength.getMessageLength();
            if (byteBuffer.position() < messageLength2) {
                if (byteBuffer.capacity() < messageLength2) {
                    if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                        DefaultTcpTransportMapping.logger.debug("Extending message buffer size according to message length to " + messageLength2);
                    }
                    byte[] bArr = new byte[messageLength2];
                    int iPosition = byteBuffer.position();
                    byteBuffer.flip();
                    byteBuffer.get(bArr, 0, iPosition);
                    byteBuffer = ByteBuffer.wrap(bArr);
                    byteBuffer.position(iPosition);
                    if (socketEntry != null) {
                        byteBuffer.limit(messageLength2);
                        socketEntry.setReadBuffer(byteBuffer);
                    }
                } else {
                    byteBuffer.limit(messageLength2);
                }
                socketChannel.read(byteBuffer);
            }
            ByteBuffer byteBuffer2 = byteBuffer;
            long jPosition = byteBuffer2.position();
            if (jPosition >= messageLength2) {
                if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                    DefaultTcpTransportMapping.logger.debug("Message completed with " + jPosition + " bytes and " + byteBuffer2.limit() + " buffer limit");
                }
                if (socketEntry != null) {
                    socketEntry.setReadBuffer(null);
                }
                dispatchMessage(tcpAddress, byteBuffer2, jPosition, socketEntry);
            } else if (socketEntry != null && byteBuffer2 != socketEntry.getReadBuffer()) {
                if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                    DefaultTcpTransportMapping.logger.debug("Adding buffer content to read buffer of entry " + socketEntry + ", buffer " + byteBuffer2);
                }
                DefaultTcpTransportMapping.this.addBufferToReadBuffer(socketEntry, byteBuffer2);
            }
            if (socketEntry != null) {
                socketEntry.addRegistration(this.selector, 1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x001e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x00f8 A[SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 475
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.transport.DefaultTcpTransportMapping.ServerThread.run():void");
        }

        public void sendMessage(Address address, byte[] bArr, TransportStateReference transportStateReference) throws IOException {
            Socket socket;
            SocketChannel socketChannelOpen;
            SocketEntry socketEntry = DefaultTcpTransportMapping.this.sockets.get(address);
            if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                DefaultTcpTransportMapping.logger.debug("Looking up connection for destination '" + address + "' returned: " + socketEntry);
                DefaultTcpTransportMapping.logger.debug(DefaultTcpTransportMapping.this.sockets.toString());
            }
            if (socketEntry != null) {
                synchronized (socketEntry) {
                    socketEntry.used();
                    socket = socketEntry.getSocket();
                }
            } else {
                socket = null;
            }
            if (socket != null && !socket.isClosed() && socket.isConnected()) {
                socketEntry.addMessage(bArr);
                synchronized (this.pending) {
                    this.pending.add(socketEntry);
                }
                DefaultTcpTransportMapping.logger.debug("Waking up selector for new message");
                this.selector.wakeup();
                return;
            }
            if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                DefaultTcpTransportMapping.logger.debug("Socket for address '" + address + "' is closed, opening it...");
            }
            synchronized (this.pending) {
                this.pending.remove(socketEntry);
            }
            try {
                InetSocketAddress inetSocketAddress = new InetSocketAddress(((TcpAddress) address).getInetAddress(), ((TcpAddress) address).getPort());
                if (socket == null || socket.isClosed()) {
                    socketChannelOpen = SocketChannel.open();
                    socketChannelOpen.configureBlocking(false);
                    socketChannelOpen.connect(inetSocketAddress);
                } else {
                    socketChannelOpen = socket.getChannel();
                    socketChannelOpen.configureBlocking(false);
                    if (!socketChannelOpen.isConnectionPending()) {
                        socketChannelOpen.connect(inetSocketAddress);
                    }
                }
                SocketEntry socketEntry2 = DefaultTcpTransportMapping.this.new SocketEntry((TcpAddress) address, socketChannelOpen.socket());
                socketEntry2.addMessage(bArr);
                DefaultTcpTransportMapping.this.sockets.put(address, socketEntry2);
                synchronized (this.pending) {
                    this.pending.add(socketEntry2);
                }
                this.selector.wakeup();
                DefaultTcpTransportMapping.logger.debug("Trying to connect to " + address);
            } catch (IOException e10) {
                DefaultTcpTransportMapping.logger.error(e10);
                throw e10;
            }
        }

        @Override // org.snmp4j.util.WorkerTask
        public void terminate() {
            this.stop = true;
            if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                DefaultTcpTransportMapping.logger.debug("Terminated worker task: " + getClass().getName());
            }
        }
    }

    public static class SnmpMesssageLengthDecoder implements MessageLengthDecoder {
        @Override // org.snmp4j.transport.MessageLengthDecoder
        public MessageLength getMessageLength(ByteBuffer byteBuffer) throws IOException {
            BER.MutableByte mutableByte = new BER.MutableByte();
            BERInputStream bERInputStream = new BERInputStream(byteBuffer);
            return new MessageLength((int) bERInputStream.getPosition(), BER.decodeHeader(bERInputStream, mutableByte, false));
        }

        @Override // org.snmp4j.transport.MessageLengthDecoder
        public int getMinHeaderLength() {
            return 6;
        }
    }

    class SocketEntry {
        private TcpAddress peerAddress;
        private Socket socket;
        private SocketTimeout socketTimeout;
        private LinkedList<byte[]> message = new LinkedList<>();
        private ByteBuffer readBuffer = null;
        private volatile int registrations = 0;
        private volatile int busyLoops = 0;
        private long lastUse = System.nanoTime();

        public SocketEntry(TcpAddress tcpAddress, Socket socket) {
            this.peerAddress = tcpAddress;
            this.socket = socket;
        }

        public synchronized void addMessage(byte[] bArr) {
            this.message.add(bArr);
        }

        public synchronized void addRegistration(Selector selector, int i10) throws ClosedChannelException {
            try {
                if ((this.registrations & i10) == 0) {
                    this.registrations |= i10;
                    if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                        DefaultTcpTransportMapping.logger.debug("Adding operation " + i10 + " for: " + toString());
                    }
                    this.socket.getChannel().register(selector, this.registrations, this);
                } else if (!this.socket.getChannel().isRegistered()) {
                    this.registrations = i10;
                    if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                        DefaultTcpTransportMapping.logger.debug("Registering new operation " + i10 + " for: " + toString());
                    }
                    this.socket.getChannel().register(selector, i10, this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public long getLastUse() {
            return this.lastUse;
        }

        public TcpAddress getPeerAddress() {
            return this.peerAddress;
        }

        public ByteBuffer getReadBuffer() {
            return this.readBuffer;
        }

        public Socket getSocket() {
            return this.socket;
        }

        public SocketTimeout getSocketTimeout() {
            return this.socketTimeout;
        }

        public synchronized boolean hasMessage() {
            return !this.message.isEmpty();
        }

        public synchronized void insertMessages(List<byte[]> list) {
            this.message.addAll(0, list);
        }

        public synchronized boolean isRegistered(int i10) {
            return (this.registrations & i10) == i10;
        }

        public int nextBusyLoop() {
            int i10 = this.busyLoops + 1;
            this.busyLoops = i10;
            return i10;
        }

        public synchronized byte[] nextMessage() {
            if (this.message.size() <= 0) {
                return null;
            }
            return this.message.removeFirst();
        }

        public synchronized void removeRegistration(Selector selector, int i10) throws ClosedChannelException {
            if ((this.registrations & i10) == i10) {
                this.registrations = (~i10) & this.registrations;
                this.socket.getChannel().register(selector, this.registrations, this);
            }
        }

        public void resetBusyLoops() {
            this.busyLoops = 0;
        }

        public void setReadBuffer(ByteBuffer byteBuffer) {
            this.readBuffer = byteBuffer;
        }

        public void setSocketTimeout(SocketTimeout socketTimeout) {
            this.socketTimeout = socketTimeout;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SocketEntry[peerAddress=");
            sb2.append(this.peerAddress);
            sb2.append(",socket=");
            sb2.append(this.socket);
            sb2.append(",lastUse=");
            sb2.append(new Date(this.lastUse / 1000000));
            sb2.append(",readBufferPosition=");
            ByteBuffer byteBuffer = this.readBuffer;
            sb2.append(byteBuffer == null ? -1 : byteBuffer.position());
            sb2.append(",socketTimeout=");
            sb2.append(this.socketTimeout);
            sb2.append("]");
            return sb2.toString();
        }

        public void used() {
            this.lastUse = System.nanoTime();
        }
    }

    class SocketTimeout extends TimerTask {
        private SocketEntry entry;

        public SocketTimeout(SocketEntry socketEntry) {
            this.entry = socketEntry;
        }

        private void rescheduleCleanup(long j10, SocketEntry socketEntry) {
            long j11 = DefaultTcpTransportMapping.this.connectionTimeout - j10;
            if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                DefaultTcpTransportMapping.logger.debug("Scheduling " + j11);
            }
            SocketTimeout socketTimeout = DefaultTcpTransportMapping.this.new SocketTimeout(socketEntry);
            socketEntry.setSocketTimeout(socketTimeout);
            DefaultTcpTransportMapping.this.socketCleaner.schedule(socketTimeout, j11);
        }

        @Override // java.util.TimerTask
        public boolean cancel() {
            boolean zCancel = super.cancel();
            this.entry = null;
            return zCancel;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            long jNanoTime = System.nanoTime();
            SocketEntry socketEntry = this.entry;
            if (socketEntry == null) {
                return;
            }
            long lastUse = (jNanoTime - socketEntry.getLastUse()) / 1000000;
            DefaultTcpTransportMapping defaultTcpTransportMapping = DefaultTcpTransportMapping.this;
            if (defaultTcpTransportMapping.socketCleaner != null && lastUse < defaultTcpTransportMapping.connectionTimeout) {
                rescheduleCleanup(lastUse, socketEntry);
                return;
            }
            if (DefaultTcpTransportMapping.logger.isDebugEnabled()) {
                DefaultTcpTransportMapping.logger.debug("Socket has not been used for " + lastUse + " milliseconds, closing it");
            }
            try {
                synchronized (socketEntry) {
                    try {
                        if (lastUse >= DefaultTcpTransportMapping.this.connectionTimeout) {
                            DefaultTcpTransportMapping.this.removeSocketEntry(socketEntry.getPeerAddress());
                            socketEntry.getSocket().close();
                            if (DefaultTcpTransportMapping.logger.isInfoEnabled()) {
                                DefaultTcpTransportMapping.logger.info("Socket to " + socketEntry.getPeerAddress() + " closed due to timeout");
                            }
                        } else {
                            rescheduleCleanup(lastUse, socketEntry);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                DefaultTcpTransportMapping.logger.error(e10);
            }
        }
    }

    public DefaultTcpTransportMapping() throws IOException {
        super(new TcpAddress(InetAddress.getLocalHost(), 0));
        this.sockets = new Hashtable();
        this.connectionTimeout = 60000L;
        this.serverEnabled = false;
        this.messageLengthDecoder = new SnmpMesssageLengthDecoder();
        this.maxBusyLoops = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void timeoutSocket(SocketEntry socketEntry) {
        if (this.connectionTimeout > 0) {
            SocketTimeout socketTimeout = new SocketTimeout(socketEntry);
            socketEntry.setSocketTimeout(socketTimeout);
            this.socketCleaner.schedule(socketTimeout, this.connectionTimeout);
        }
    }

    protected void addBufferToReadBuffer(SocketEntry socketEntry, ByteBuffer byteBuffer) {
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug("Adding data " + byteBuffer + " to read buffer " + socketEntry.getReadBuffer());
        }
        int iPosition = byteBuffer.position();
        if (socketEntry.getReadBuffer() != null) {
            socketEntry.getReadBuffer().put(byteBuffer.array(), 0, iPosition);
            return;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.flip();
        byteBuffer.get(bArr, 0, iPosition);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.position(iPosition);
        socketEntry.setReadBuffer(byteBufferWrap);
    }

    public long getConnectionTimeout() {
        return this.connectionTimeout;
    }

    protected int getMaxBusyLoops() {
        return this.maxBusyLoops;
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public int getMaxInboundMessageSize() {
        return super.getMaxInboundMessageSize();
    }

    @Override // org.snmp4j.transport.TcpTransportMapping, org.snmp4j.transport.ConnectionOrientedTransportMapping
    public MessageLengthDecoder getMessageLengthDecoder() {
        return this.messageLengthDecoder;
    }

    public int getPriority() {
        Object obj = this.server;
        if (obj instanceof Thread) {
            return ((Thread) obj).getPriority();
        }
        return 5;
    }

    public String getThreadName() {
        Object obj = this.server;
        if (obj != null) {
            return ((Thread) obj).getName();
        }
        return null;
    }

    @Override // org.snmp4j.TransportMapping
    public boolean isListening() {
        return this.server != null;
    }

    public boolean isServerEnabled() {
        return this.serverEnabled;
    }

    @Override // org.snmp4j.transport.TcpTransportMapping, org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public synchronized void listen() throws IOException {
        try {
            if (this.server != null) {
                throw new SocketException("Port already listening");
            }
            this.serverThread = new ServerThread();
            LogAdapter logAdapter = logger;
            if (logAdapter.isInfoEnabled()) {
                logAdapter.info("TCP address " + getListenAddress() + " bound successfully");
            }
            this.server = SNMP4JSettings.getThreadFactory().createWorkerThread("DefaultTCPTransportMapping_" + getAddress(), this.serverThread, true);
            if (this.connectionTimeout > 0) {
                this.socketCleaner = SNMP4JSettings.getTimerFactory().createTimer();
            }
            this.server.run();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.snmp4j.transport.TcpTransportMapping
    protected Object removeSocketEntry(TcpAddress tcpAddress) {
        return this.sockets.remove(tcpAddress);
    }

    @Override // org.snmp4j.transport.TcpTransportMapping, org.snmp4j.transport.ConnectionOrientedTransportMapping
    public void setConnectionTimeout(long j10) {
        this.connectionTimeout = j10;
    }

    protected void setMaxBusyLoops(int i10) {
        this.maxBusyLoops = i10;
    }

    public void setMaxInboundMessageSize(int i10) {
        this.maxInboundMessageSize = i10;
    }

    @Override // org.snmp4j.transport.TcpTransportMapping, org.snmp4j.transport.ConnectionOrientedTransportMapping
    public void setMessageLengthDecoder(MessageLengthDecoder messageLengthDecoder) {
        messageLengthDecoder.getClass();
        this.messageLengthDecoder = messageLengthDecoder;
    }

    public void setPriority(int i10) {
        Object obj = this.server;
        if (obj instanceof Thread) {
            ((Thread) obj).setPriority(i10);
        }
    }

    public void setServerEnabled(boolean z10) {
        this.serverEnabled = z10;
    }

    protected void setSocketOptions(ServerSocket serverSocket) {
    }

    public void setThreadName(String str) {
        Object obj = this.server;
        if (obj instanceof Thread) {
            ((Thread) obj).setName(str);
        }
    }

    protected void socketClosedRemotely(SelectionKey selectionKey, SocketChannel socketChannel, TcpAddress tcpAddress) throws IOException {
        logger.debug("Socket closed remotely");
        cancelNonServerSelectionKey(selectionKey);
        socketChannel.close();
        fireConnectionStateChanged(new TransportStateEvent(this, tcpAddress, 2, null));
        removeSocketEntry(tcpAddress);
    }

    @Override // org.snmp4j.transport.TcpTransportMapping, org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public void close() throws IOException {
        WorkerTask workerTask = this.server;
        if (workerTask != null) {
            workerTask.terminate();
            workerTask.interrupt();
            try {
                workerTask.join();
            } catch (InterruptedException e10) {
                logger.warn(e10);
            }
            this.server = null;
            for (SocketEntry socketEntry : this.sockets.values()) {
                Socket socket = socketEntry.getSocket();
                if (socket != null) {
                    try {
                        SocketChannel channel = socket.getChannel();
                        socket.close();
                        LogAdapter logAdapter = logger;
                        if (logAdapter.isDebugEnabled()) {
                            logAdapter.debug("Socket to " + socketEntry.getPeerAddress() + " closed");
                        }
                        if (channel != null) {
                            channel.close();
                            if (logAdapter.isDebugEnabled()) {
                                logAdapter.debug("Socket channel to " + socketEntry.getPeerAddress() + " closed");
                            }
                        }
                    } catch (IOException e11) {
                        logger.debug(e11);
                    }
                }
            }
            this.sockets.clear();
            CommonTimer commonTimer = this.socketCleaner;
            if (commonTimer != null) {
                commonTimer.cancel();
            }
            this.socketCleaner = null;
        }
    }

    @Override // org.snmp4j.transport.TcpTransportMapping, org.snmp4j.TransportMapping
    public TcpAddress getListenAddress() {
        int port = this.tcpAddress.getPort();
        try {
            port = ((InetSocketAddress) this.serverThread.ssc.getLocalAddress()).getPort();
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (NullPointerException unused) {
        }
        return new TcpAddress(this.tcpAddress.getInetAddress(), port);
    }

    @Override // org.snmp4j.transport.TcpTransportMapping, org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public void sendMessage(TcpAddress tcpAddress, byte[] bArr, TransportStateReference transportStateReference) throws IOException {
        if (this.server == null || this.serverThread == null) {
            if (isOpenSocketOnSending()) {
                listen();
            } else {
                handleDroppedMessageToSend(tcpAddress, bArr, transportStateReference);
            }
        }
        if (this.serverThread != null) {
            if (this.suspendedAddresses.size() <= 0 || !this.suspendedAddresses.contains(tcpAddress)) {
                this.serverThread.sendMessage(tcpAddress, bArr, transportStateReference);
            } else {
                handleDroppedMessageToSend(tcpAddress, bArr, transportStateReference);
            }
        }
    }

    public DefaultTcpTransportMapping(TcpAddress tcpAddress) throws IOException {
        super(tcpAddress);
        this.sockets = new Hashtable();
        this.connectionTimeout = 60000L;
        this.serverEnabled = false;
        this.messageLengthDecoder = new SnmpMesssageLengthDecoder();
        this.maxBusyLoops = 100;
        this.serverEnabled = true;
    }

    @Override // org.snmp4j.transport.ConnectionOrientedTransportMapping
    public synchronized boolean close(TcpAddress tcpAddress) throws IOException {
        try {
            LogAdapter logAdapter = logger;
            if (logAdapter.isDebugEnabled()) {
                logAdapter.debug("Closing socket for peer address " + tcpAddress);
            }
            SocketEntry socketEntry = (SocketEntry) removeSocketEntry(tcpAddress);
            if (socketEntry == null) {
                return false;
            }
            if (socketEntry.getSocketTimeout() != null) {
                socketEntry.getSocketTimeout().cancel();
            }
            if (socketEntry.getSocket() != null) {
                SocketChannel channel = socketEntry.getSocket().getChannel();
                socketEntry.getSocket().close();
                if (logAdapter.isInfoEnabled()) {
                    logAdapter.info("Socket to " + socketEntry.getPeerAddress() + " closed");
                }
                if (channel != null) {
                    channel.close();
                    if (logAdapter.isDebugEnabled()) {
                        logAdapter.debug("Closed socket channel for peer address " + tcpAddress);
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
