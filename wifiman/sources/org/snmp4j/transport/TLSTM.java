package org.snmp4j.transport;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.TransportStateReference;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.event.CounterEvent;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.mp.CounterSupport;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.security.SecurityLevel;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.TcpAddress;
import org.snmp4j.smi.TlsAddress;
import org.snmp4j.transport.tls.TLSTMExtendedTrustManagerFactory;
import org.snmp4j.transport.tls.TlsTmSecurityCallback;
import org.snmp4j.transport.tls.TlsTrustManager;
import org.snmp4j.util.CommonTimer;
import org.snmp4j.util.SnmpConfigurator;
import org.snmp4j.util.WorkerTask;

/* loaded from: classes2.dex */
public class TLSTM extends TcpTransportMapping {
    public static final String DEFAULT_TLSTM_PROTOCOLS = "TLSv1";
    public static final int MAX_TLS_PAYLOAD_SIZE = 32768;
    public static final int TLS_MAX_FRAGMENT_SIZE = 16384;
    private static final LogAdapter logger = LogFactory.getLogger(TLSTM.class);
    private long connectionTimeout;
    private CounterSupport counterSupport;
    private String keyStore;
    private String keyStorePassword;
    private String localCertificateAlias;
    private long nextSessionID;
    private TlsTmSecurityCallback<X509Certificate> securityCallback;
    private WorkerTask server;
    private boolean serverEnabled;
    private ServerThread serverThread;
    private CommonTimer socketCleaner;
    private Map<Address, SocketEntry> sockets;
    private SSLEngineConfigurator sslEngineConfigurator;
    private int tlsMaxFragmentSize;
    private String[] tlsProtocols;
    private TLSTMTrustManagerFactory trustManagerFactory;
    private String trustStore;
    private String trustStorePassword;

    /* renamed from: org.snmp4j.transport.TLSTM$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus;
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$Status;

        static {
            int[] iArr = new int[SSLEngineResult.HandshakeStatus.values().length];
            $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus = iArr;
            try {
                iArr[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[SSLEngineResult.Status.values().length];
            $SwitchMap$javax$net$ssl$SSLEngineResult$Status = iArr2;
            try {
                iArr2[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$Status[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$Status[SSLEngineResult.Status.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$Status[SSLEngineResult.Status.OK.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    protected class DefaultSSLEngineConfiguration implements SSLEngineConfigurator {
        private TrustManager[] trustManagers;

        protected DefaultSSLEngineConfiguration() {
        }

        private void filterCertificates(KeyStore keyStore, TransportStateReference transportStateReference) throws KeyStoreException {
            String localCertificateAlias = TLSTM.this.localCertificateAlias;
            if (TLSTM.this.securityCallback != null && transportStateReference != null && (localCertificateAlias = TLSTM.this.securityCallback.getLocalCertificateAlias(transportStateReference.getAddress())) == null) {
                localCertificateAlias = TLSTM.this.localCertificateAlias;
            }
            if (localCertificateAlias != null) {
                try {
                    Certificate[] certificateChain = keyStore.getCertificateChain(localCertificateAlias);
                    if (certificateChain == null) {
                        TLSTM.logger.warn("Local certificate with alias '" + localCertificateAlias + "' not found. Known aliases are: " + Collections.list(keyStore.aliases()));
                        return;
                    }
                    ArrayList arrayList = new ArrayList(certificateChain.length);
                    for (Certificate certificate : certificateChain) {
                        String certificateAlias = keyStore.getCertificateAlias(certificate);
                        if (certificateAlias != null) {
                            arrayList.add(certificateAlias);
                        }
                    }
                    Iterator it = Collections.list(keyStore.aliases()).iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!arrayList.contains(str)) {
                            keyStore.deleteEntry(str);
                        }
                    }
                } catch (KeyStoreException e10) {
                    TLSTM.logger.error("Failed to get certificate chain for alias " + localCertificateAlias + ": " + e10.getMessage(), e10);
                }
            }
        }

        @Override // org.snmp4j.transport.TLSTM.SSLEngineConfigurator
        public void configure(SSLEngine sSLEngine) {
            TLSTM.logger.debug("Configuring SSL engine, supported protocols are " + Arrays.asList(sSLEngine.getSupportedProtocols()) + ", supported ciphers are " + Arrays.asList(sSLEngine.getSupportedCipherSuites()) + ", https defaults are " + System.getProperty("https.cipherSuites"));
            String[] enabledCipherSuites = sSLEngine.getEnabledCipherSuites();
            ArrayList arrayList = new ArrayList(enabledCipherSuites.length);
            for (String str : enabledCipherSuites) {
                if (!str.contains("_anon_") && !str.contains("_NULL_")) {
                    arrayList.add(str);
                }
            }
            sSLEngine.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            sSLEngine.setEnabledProtocols(TLSTM.this.getTlsProtocols());
            if (!sSLEngine.getUseClientMode()) {
                sSLEngine.setNeedClientAuth(true);
                sSLEngine.setWantClientAuth(true);
                TLSTM.logger.info("Need client authentication set to true");
            }
            TLSTM.logger.info("Configured SSL engine, enabled protocols are " + Arrays.asList(sSLEngine.getEnabledProtocols()) + ", enabled ciphers are " + Arrays.asList(sSLEngine.getEnabledCipherSuites()));
        }

        @Override // org.snmp4j.transport.TLSTM.SSLEngineConfigurator
        public SSLContext getSSLContext(boolean z10, TransportStateReference transportStateReference) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, KeyManagementException {
            try {
                String str = TLSTM.DEFAULT_TLSTM_PROTOCOLS;
                if (TLSTM.this.getTlsProtocols() != null && TLSTM.this.getTlsProtocols().length > 0) {
                    str = TLSTM.this.getTlsProtocols()[0];
                }
                SSLContext sSLContext = SSLContext.getInstance(str);
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                try {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(TLSTM.this.getKeyStore());
                            FileInputStream fileInputStream2 = new FileInputStream(TLSTM.this.getTrustStore());
                            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                            keyStore.load(fileInputStream, TLSTM.this.getKeyStorePassword() != null ? TLSTM.this.getKeyStorePassword().toCharArray() : null);
                            if (TLSTM.logger.isInfoEnabled()) {
                                TLSTM.logger.info("KeyStore '" + TLSTM.this.getKeyStore() + "' contains: " + Collections.list(keyStore.aliases()));
                            }
                            filterCertificates(keyStore, transportStateReference);
                            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                            keyManagerFactory.init(keyStore, TLSTM.this.getKeyStorePassword() != null ? TLSTM.this.getKeyStorePassword().toCharArray() : null);
                            KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
                            keyStore2.load(fileInputStream2, TLSTM.this.getTrustStorePassword() != null ? TLSTM.this.getTrustStorePassword().toCharArray() : null);
                            if (TLSTM.logger.isInfoEnabled()) {
                                TLSTM.logger.info("TrustStore '" + TLSTM.this.trustStore + "' contains: " + Collections.list(keyStore2.aliases()));
                            }
                            trustManagerFactory.init(keyStore2);
                            this.trustManagers = trustManagerFactory.getTrustManagers();
                            if (TLSTM.logger.isDebugEnabled()) {
                                TLSTM.logger.debug("SSL context initializing with TrustManagers: " + Arrays.asList(this.trustManagers) + " and factory " + TLSTM.this.trustManagerFactory.getClass().getName());
                            }
                            sSLContext.init(keyManagerFactory.getKeyManagers(), new TrustManager[]{TLSTM.this.trustManagerFactory.create((X509TrustManager) this.trustManagers[0], z10, transportStateReference)}, null);
                            return sSLContext;
                        } catch (KeyManagementException e10) {
                            TLSTM.logger.error("Failed to initialize SSLContext because of a KeyManagementException: " + e10.getMessage(), e10);
                            return null;
                        } catch (CertificateException e11) {
                            TLSTM.logger.error("Failed to initialize SSLContext because of a CertificateException: " + e11.getMessage(), e11);
                            return null;
                        }
                    } catch (IOException e12) {
                        TLSTM.logger.error("Failed to initialize SSLContext because of an IOException: " + e12.getMessage(), e12);
                        return null;
                    } catch (KeyStoreException e13) {
                        TLSTM.logger.error("Failed to initialize SSLContext because of a KeyStoreException: " + e13.getMessage(), e13);
                        return null;
                    }
                } catch (FileNotFoundException e14) {
                    TLSTM.logger.error("Failed to initialize SSLContext because of a FileNotFoundException: " + e14.getMessage(), e14);
                    return null;
                } catch (UnrecoverableKeyException e15) {
                    TLSTM.logger.error("Failed to initialize SSLContext because of an UnrecoverableKeyException: " + e15.getMessage(), e15);
                    return null;
                }
            } catch (NoSuchAlgorithmException e16) {
                TLSTM.logger.error("Failed to initialize SSLContext because of an NoSuchAlgorithmException: " + e16.getMessage(), e16);
            }
        }
    }

    private class DefaultTLSTMTrustManagerFactory implements TLSTMTrustManagerFactory {
        private DefaultTLSTMTrustManagerFactory() {
        }

        @Override // org.snmp4j.transport.TLSTM.TLSTMTrustManagerFactory
        public X509TrustManager create(X509TrustManager x509TrustManager, boolean z10, TransportStateReference transportStateReference) {
            return new TlsTrustManager(x509TrustManager, z10, transportStateReference, TLSTM.this.counterSupport, TLSTM.this.securityCallback);
        }

        /* synthetic */ DefaultTLSTMTrustManagerFactory(TLSTM tlstm, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    interface SSLEngineConfigurator {
        void configure(SSLEngine sSLEngine);

        SSLContext getSSLContext(boolean z10, TransportStateReference transportStateReference);
    }

    class ServerThread implements WorkerTask {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private ServerSocketChannel ssc;
        private volatile boolean stop = false;
        private Throwable lastError = null;
        private LinkedList<SocketEntry> pending = new LinkedList<>();
        private BlockingQueue<SocketEntry> outQueue = new LinkedBlockingQueue();
        private BlockingQueue<SocketEntry> inQueue = new LinkedBlockingQueue();
        private Selector selector = Selector.open();

        public ServerThread() throws NoSuchAlgorithmException, IOException {
            if (TLSTM.this.serverEnabled) {
                ServerSocketChannel serverSocketChannelOpen = ServerSocketChannel.open();
                this.ssc = serverSocketChannelOpen;
                serverSocketChannelOpen.configureBlocking(false);
                InetSocketAddress inetSocketAddress = new InetSocketAddress(TLSTM.this.tcpAddress.getInetAddress(), TLSTM.this.tcpAddress.getPort());
                TLSTM.this.setSocketOptions(this.ssc.socket());
                this.ssc.socket().bind(inetSocketAddress);
                this.ssc.register(this.selector, 16);
            }
        }

        private void closeChannel(SelectableChannel selectableChannel) throws IOException {
            try {
                selectableChannel.close();
            } catch (IOException e10) {
                TLSTM.logger.warn(e10);
            }
        }

        private void connectChannel(SelectionKey selectionKey, TcpAddress tcpAddress) throws IOException {
            SocketEntry socketEntry = (SocketEntry) selectionKey.attachment();
            try {
                SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                if (!socketChannel.isConnected()) {
                    if (socketChannel.finishConnect()) {
                        socketChannel.configureBlocking(false);
                        TLSTM.logger.debug("Connected to " + socketEntry.getPeerAddress());
                        TLSTM.this.timeoutSocket(socketEntry);
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
                    TLSTM.logger.debug("Fire connected event for " + tcpAddress);
                    TLSTM.this.fireConnectionStateChanged(new TransportStateEvent(TLSTM.this, tcpAddress, 1, null));
                }
            } catch (IOException e10) {
                TLSTM.logger.warn(e10);
                selectionKey.cancel();
                closeChannel(selectionKey.channel());
                if (socketEntry != null) {
                    this.pending.remove(socketEntry);
                }
            }
        }

        private ByteBuffer createBufferCopy(ByteBuffer byteBuffer) {
            byte[] bArr = new byte[byteBuffer.limit()];
            int iLimit = byteBuffer.limit() - byteBuffer.remaining();
            byteBuffer.flip();
            byteBuffer.get(bArr, 0, iLimit);
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.position(iLimit);
            return byteBufferWrap;
        }

        private void dispatchMessage(TcpAddress tcpAddress, ByteBuffer byteBuffer, long j10, Object obj, TransportStateReference transportStateReference) {
            ByteBuffer byteBufferWrap;
            byteBuffer.flip();
            if (TLSTM.logger.isDebugEnabled()) {
                TLSTM.logger.debug("Received message from " + tcpAddress + " with length " + j10 + ": " + new OctetString(byteBuffer.array(), 0, (int) j10).toHexString());
            }
            if (TLSTM.this.isAsyncMsgProcessingSupported()) {
                int i10 = (int) j10;
                byte[] bArr = new byte[i10];
                System.arraycopy(byteBuffer.array(), 0, bArr, 0, i10);
                byteBufferWrap = ByteBuffer.wrap(bArr);
            } else {
                byteBufferWrap = ByteBuffer.wrap(byteBuffer.array(), 0, (int) j10);
            }
            TLSTM.this.fireProcessMessage(tcpAddress, byteBufferWrap, transportStateReference);
        }

        private boolean isConnectionClosed(SocketEntry socketEntry, IOException iOException) throws IOException {
            if (!TLSTM.isEngineClosed(socketEntry.sslEngine)) {
                return false;
            }
            if (TLSTM.logger.isInfoEnabled()) {
                TLSTM.logger.info("TLS connection to " + socketEntry.getPeerAddress() + " is closed");
            }
            closeChannel(socketEntry.socket.getChannel());
            TLSTM.this.removeSocketEntry(socketEntry.getPeerAddress());
            TLSTM.this.fireConnectionStateChanged(new TransportStateEvent(TLSTM.this, socketEntry.getPeerAddress(), 4, iOException));
            return true;
        }

        private void processPending() {
            synchronized (this.pending) {
                int i10 = 0;
                while (i10 < this.pending.size()) {
                    try {
                        SocketEntry first = this.pending.getFirst();
                        if (first.hasMessage()) {
                            try {
                                if (!first.getSocket().isConnected()) {
                                    first.addRegistration(this.selector, 8);
                                } else if (first.isHandshakeFinished()) {
                                    first.addRegistration(this.selector, 4);
                                }
                            } catch (IOException e10) {
                                TLSTM.logger.error(e10);
                                this.pending.remove(first);
                                try {
                                    first.getSocket().getChannel().close();
                                    TLSTM.this.fireConnectionStateChanged(new TransportStateEvent(TLSTM.this, first.getPeerAddress(), 4, e10));
                                } catch (IOException e11) {
                                    TLSTM.logger.error(e11);
                                }
                                this.lastError = e10;
                                if (SNMP4JSettings.isForwardRuntimeExceptions()) {
                                    throw new RuntimeException(e10);
                                }
                            } catch (CancelledKeyException e12) {
                                TLSTM.logger.warn(e12);
                                this.pending.remove(first);
                                try {
                                    first.getSocket().getChannel().close();
                                    TLSTM.this.fireConnectionStateChanged(new TransportStateEvent(TLSTM.this, first.getPeerAddress(), 4, null));
                                } catch (IOException e13) {
                                    TLSTM.logger.error(e13);
                                }
                            }
                        } else {
                            if (TLSTM.logger.isDebugEnabled()) {
                                TLSTM.logger.debug("Idle socket entry removed from pending message queue: " + first);
                            }
                            this.pending.remove(first);
                            i10--;
                        }
                        i10++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        private synchronized void processQueues() {
            SocketEntry socketEntryTake;
            IOException e10;
            SocketEntry socketEntryTake2;
            while (true) {
                if (!this.outQueue.isEmpty() || !this.inQueue.isEmpty()) {
                    while (!this.outQueue.isEmpty()) {
                        try {
                            try {
                                socketEntryTake2 = this.outQueue.take();
                            } catch (InterruptedException e11) {
                                TLSTM.logger.error("SSL processing interrupted: " + e11.getMessage(), e11);
                                return;
                            }
                        } catch (IOException e12) {
                            e10 = e12;
                            socketEntryTake2 = null;
                        }
                        try {
                            SSLEngineResult sSLEngineResultSendNetMessage = TLSTM.this.sendNetMessage(socketEntryTake2);
                            if (sSLEngineResultSendNetMessage != null && runDelegatedTasks(sSLEngineResultSendNetMessage, socketEntryTake2) && socketEntryTake2.isAppOutPending()) {
                                writeMessage(socketEntryTake2, socketEntryTake2.getSocket().getChannel());
                            }
                            isConnectionClosed(socketEntryTake2, null);
                        } catch (IOException e13) {
                            e10 = e13;
                            TLSTM.logger.error("IO exception caught while SSL processing: " + e10.getMessage(), e10);
                            while (this.inQueue.remove(socketEntryTake2)) {
                            }
                        }
                    }
                    while (!this.inQueue.isEmpty()) {
                        try {
                            try {
                                socketEntryTake = this.inQueue.take();
                                try {
                                    synchronized (socketEntryTake.inboundLock) {
                                        try {
                                            if (socketEntryTake.getInNetBuffer().position() > 0) {
                                                socketEntryTake.inNetBuffer.flip();
                                                TLSTM.logger.debug("TLS inNetBuffer = " + socketEntryTake.inNetBuffer);
                                                SSLEngineResult sSLEngineResultUnwrap = socketEntryTake.sslEngine.unwrap(socketEntryTake.inNetBuffer, socketEntryTake.inAppBuffer);
                                                TLSTM.this.adjustInNetBuffer(socketEntryTake, sSLEngineResultUnwrap);
                                                if (runDelegatedTasks(sSLEngineResultUnwrap, socketEntryTake)) {
                                                    int i10 = AnonymousClass1.$SwitchMap$javax$net$ssl$SSLEngineResult$Status[sSLEngineResultUnwrap.getStatus().ordinal()];
                                                    if (i10 == 1) {
                                                        socketEntryTake.inNetBuffer.position(socketEntryTake.inNetBuffer.limit());
                                                        socketEntryTake.inNetBuffer.limit(socketEntryTake.inNetBuffer.capacity());
                                                        socketEntryTake.addRegistration(this.selector, 1);
                                                    } else if (i10 == 3) {
                                                        isConnectionClosed(socketEntryTake, null);
                                                    } else if (i10 == 4) {
                                                        if (socketEntryTake.isAppOutPending()) {
                                                            writeMessage(socketEntryTake, socketEntryTake.getSocket().getChannel());
                                                        }
                                                        socketEntryTake.inAppBuffer.flip();
                                                        TLSTM.logger.debug("Dispatching inAppBuffer=" + socketEntryTake.inAppBuffer);
                                                        if (socketEntryTake.inAppBuffer.limit() > 0) {
                                                            dispatchMessage(socketEntryTake.getPeerAddress(), socketEntryTake.inAppBuffer, socketEntryTake.inAppBuffer.limit(), Long.valueOf(socketEntryTake.sessionID), socketEntryTake.tmStateReference);
                                                        }
                                                        socketEntryTake.inAppBuffer.clear();
                                                    }
                                                }
                                            } else if (!isConnectionClosed(socketEntryTake, null)) {
                                                socketEntryTake.addRegistration(this.selector, 1);
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                } catch (IOException e14) {
                                    e = e14;
                                    TLSTM.logger.error("IO exception caught while SSL processing: " + e.getMessage(), e);
                                    while (this.inQueue.remove(socketEntryTake)) {
                                    }
                                    isConnectionClosed(socketEntryTake, e);
                                }
                            } catch (IOException e15) {
                                e = e15;
                                socketEntryTake = null;
                            }
                        } catch (InterruptedException e16) {
                            TLSTM.logger.error("SSL processing interrupted: " + e16.getMessage(), e16);
                            return;
                        }
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

        private void readMessage(SelectionKey selectionKey, SocketChannel socketChannel, TcpAddress tcpAddress, SocketEntry socketEntry) throws IOException {
            SSLEngineResult sSLEngineResultUnwrap;
            SocketEntry socketEntry2 = (SocketEntry) selectionKey.attachment();
            if (socketEntry2 != null) {
                socketEntry = socketEntry2;
            }
            if (socketEntry == null) {
                TLSTM.logger.error("SocketEntry null in readMessage");
            }
            socketEntry.used();
            ByteBuffer inNetBuffer = socketEntry.getInNetBuffer();
            ByteBuffer inAppBuffer = socketEntry.getInAppBuffer();
            try {
                long j10 = socketChannel.read(inNetBuffer);
                if (TLSTM.logger.isDebugEnabled()) {
                    TLSTM.logger.debug("Read " + j10 + " bytes from " + tcpAddress);
                    LogAdapter logAdapter = TLSTM.logger;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("TLS inNetBuffer: ");
                    sb2.append(inNetBuffer);
                    logAdapter.debug(sb2.toString());
                }
                if (j10 < 0) {
                    TLSTM.logger.debug("Socket closed remotely");
                    selectionKey.cancel();
                    socketChannel.close();
                    TLSTM.this.fireConnectionStateChanged(new TransportStateEvent(TLSTM.this, tcpAddress, 2, null));
                    return;
                }
                if (j10 > 0) {
                    synchronized (socketEntry.inboundLock) {
                        do {
                            try {
                                inNetBuffer.flip();
                                sSLEngineResultUnwrap = socketEntry.sslEngine.unwrap(inNetBuffer, inAppBuffer);
                                TLSTM.this.adjustInNetBuffer(socketEntry, sSLEngineResultUnwrap);
                            } catch (IOException e10) {
                                socketEntry.inAppBuffer.position(socketEntry.inAppBuffer.limit());
                                socketEntry.inAppBuffer.limit(socketEntry.inAppBuffer.capacity());
                                if (TLSTM.logger.isDebugEnabled()) {
                                    TLSTM.logger.debug("Waiting for rest of packet because: " + e10.getMessage() + ", inAppBuffer=" + socketEntry.inAppBuffer);
                                }
                            } finally {
                            }
                            if (AnonymousClass1.$SwitchMap$javax$net$ssl$SSLEngineResult$Status[sSLEngineResultUnwrap.getStatus().ordinal()] == 2) {
                                throw new IOException("BUFFER_OVERFLOW");
                            }
                            if (!runDelegatedTasks(sSLEngineResultUnwrap, socketEntry)) {
                                break;
                            }
                            if (sSLEngineResultUnwrap.bytesProduced() > 0) {
                                socketEntry.inAppBuffer.flip();
                                if (TLSTM.logger.isDebugEnabled()) {
                                    TLSTM.logger.debug("Reading inappBuffer=" + socketEntry.inAppBuffer);
                                }
                                if (socketEntry.inAppBuffer.remaining() % TLSTM.this.tlsMaxFragmentSize == 0) {
                                    if (TLSTM.logger.isDebugEnabled()) {
                                        TLSTM.logger.debug("Checking PDU header for fragmented message: " + socketEntry);
                                    }
                                    BER.decodeHeader(new BERInputStream(socketEntry.inAppBuffer.asReadOnlyBuffer()), new BER.MutableByte(), true);
                                }
                                socketEntry.checkTransportStateReference();
                                dispatchMessage(tcpAddress, inAppBuffer, inAppBuffer.limit(), Long.valueOf(socketEntry.sessionID), socketEntry.tmStateReference);
                                socketEntry.getInAppBuffer().clear();
                                break;
                            }
                            if (socketEntry.isAppOutPending()) {
                                writeMessage(socketEntry, socketEntry.getSocket().getChannel());
                            }
                            if (inNetBuffer.position() <= 0) {
                                break;
                            }
                        } while (inNetBuffer.remaining() > 0);
                    }
                }
            } catch (ClosedChannelException unused) {
                selectionKey.cancel();
                if (TLSTM.logger.isDebugEnabled()) {
                    TLSTM.logger.debug("Read channel not open, no bytes read from " + tcpAddress);
                }
            }
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
                        TLSTM.logger.warn(e10);
                        TLSTM.this.fireConnectionStateChanged(new TransportStateEvent(TLSTM.this, tcpAddress2, 2, e10));
                        closeChannel(selectionKey.channel());
                        return tcpAddress2;
                    }
                }
                if (socketEntry != null) {
                    writeMessage(socketEntry, socketChannel);
                } else {
                    selectionKey.cancel();
                    TLSTM.logger.warn("Key was writable for incoming address " + tcpAddress2 + " but SocketEntry is null, key is canceled");
                }
            } catch (IOException e12) {
                tcpAddress2 = tcpAddress;
                e10 = e12;
            }
            return tcpAddress2;
        }

        private void writeMessage(SocketEntry socketEntry, SocketChannel socketChannel) throws IOException {
            int iPosition;
            synchronized (socketEntry.outboundLock) {
                while (true) {
                    try {
                        if (socketEntry.outAppBuffer == null) {
                            byte[] bArrNextMessage = socketEntry.nextMessage();
                            if (bArrNextMessage == null) {
                                socketEntry.removeRegistration(this.selector, 4);
                                if (socketEntry.hasMessage() && !socketEntry.isRegistered(4)) {
                                    socketEntry.addRegistration(this.selector, 4);
                                    TLSTM.logger.debug("Waking up selector");
                                    this.selector.wakeup();
                                }
                                socketEntry.addRegistration(this.selector, 1);
                                return;
                            }
                            socketEntry.outAppBuffer = ByteBuffer.wrap(bArrNextMessage);
                            if (TLSTM.logger.isDebugEnabled()) {
                                TLSTM.logger.debug("Sending message with length " + bArrNextMessage.length + " to " + socketEntry.getPeerAddress() + ": " + new OctetString(bArrNextMessage).toHexString());
                            }
                            iPosition = 0;
                        } else {
                            iPosition = socketEntry.outAppBuffer.position();
                        }
                        SSLEngineResult sSLEngineResultWrap = socketEntry.sslEngine.wrap(socketEntry.outAppBuffer, socketEntry.outNetBuffer);
                        if (sSLEngineResultWrap.getStatus() == SSLEngineResult.Status.OK) {
                            if (sSLEngineResultWrap.bytesProduced() > 0) {
                                TLSTM.this.writeNetBuffer(socketEntry, socketChannel);
                            } else if (TLSTM.logger.isDebugEnabled()) {
                                TLSTM.logger.debug("SSL Engine status of wrap is ok, but 0 NET bytes produced, handshake status is " + sSLEngineResultWrap.getHandshakeStatus());
                            }
                        }
                        if (sSLEngineResultWrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_TASK && runDelegatedTasks(sSLEngineResultWrap, socketEntry)) {
                            TLSTM.logger.debug("SSL session OK");
                        }
                        if (sSLEngineResultWrap.bytesConsumed() < socketEntry.outAppBuffer.limit() - iPosition) {
                            if (sSLEngineResultWrap.bytesConsumed() <= 0) {
                                break;
                            }
                            TLSTM.logger.debug("Fragment of size " + sSLEngineResultWrap.bytesConsumed() + " sent: " + socketEntry);
                        } else {
                            TLSTM.logger.debug("Payload sent completely");
                            socketEntry.outAppBuffer = null;
                            break;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (TLSTM.logger.isDebugEnabled()) {
                    TLSTM.logger.debug("Message sent for " + socketEntry);
                }
                socketEntry.addRegistration(this.selector, 1);
            }
        }

        public void close() {
            this.stop = true;
            WorkerTask workerTask = TLSTM.this.server;
            if (workerTask != null) {
                workerTask.terminate();
            }
        }

        protected void connectSocketToSendMessage(Address address, byte[] bArr, Socket socket, SocketEntry socketEntry, Map<Address, SocketEntry> map) throws IOException {
            SocketEntry socketEntryPutIfAbsent = map.putIfAbsent(address, socketEntry);
            if (socketEntryPutIfAbsent != null && socketEntryPutIfAbsent.getSocket().isConnected()) {
                if (TLSTM.logger.isDebugEnabled()) {
                    TLSTM.logger.debug("Concurrent connection attempt detected, canceling this one to " + address);
                }
                socketEntryPutIfAbsent.addMessage(bArr);
                try {
                    socket.close();
                } catch (IOException e10) {
                    TLSTM.logger.error("Failed to close recently opened socket for '" + address + "', with " + e10.getMessage(), e10);
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
                    TLSTM.logger.error("Failed to close socket for '" + address + "', with " + e11.getMessage(), e11);
                }
            }
            queueNewMessage(socketEntry);
            TLSTM.logger.debug("Trying to connect to " + address);
        }

        public Throwable getLastError() {
            return this.lastError;
        }

        @Override // org.snmp4j.util.WorkerTask
        public void interrupt() {
            this.stop = true;
            if (TLSTM.logger.isDebugEnabled()) {
                TLSTM.logger.debug("Interrupting worker task: " + getClass().getName());
            }
            this.selector.wakeup();
        }

        @Override // org.snmp4j.util.WorkerTask
        public void join() {
            if (TLSTM.logger.isDebugEnabled()) {
                TLSTM.logger.debug("Joining worker task: " + getClass().getName());
            }
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            SocketChannel channel;
            TcpAddress tcpAddress;
            SocketEntry socketEntry;
            while (!this.stop) {
                try {
                    try {
                        processQueues();
                        if (this.selector.select() <= 0) {
                            continue;
                        } else {
                            if (this.stop) {
                                break;
                            }
                            Iterator<SelectionKey> it = this.selector.selectedKeys().iterator();
                            while (it.hasNext()) {
                                try {
                                    SelectionKey next = it.next();
                                    it.remove();
                                    if (next.isAcceptable()) {
                                        TLSTM.logger.debug("Key is acceptable");
                                        Socket socket = ((ServerSocketChannel) next.channel()).accept().socket();
                                        channel = socket.getChannel();
                                        channel.configureBlocking(false);
                                        tcpAddress = new TcpAddress(socket.getInetAddress(), socket.getPort());
                                        socketEntry = TLSTM.this.new SocketEntry(tcpAddress, socket, false, null);
                                        socketEntry.addRegistration(this.selector, 1);
                                        TLSTM.this.sockets.put(tcpAddress, socketEntry);
                                        TLSTM.this.timeoutSocket(socketEntry);
                                        TransportStateEvent transportStateEvent = new TransportStateEvent(TLSTM.this, tcpAddress, 1, null);
                                        TLSTM.this.fireConnectionStateChanged(transportStateEvent);
                                        if (transportStateEvent.isCancelled()) {
                                            TLSTM.logger.warn("Incoming connection cancelled");
                                            socket.close();
                                            TLSTM.this.removeSocketEntry(tcpAddress);
                                            channel = null;
                                        }
                                    } else if (next.isWritable()) {
                                        TLSTM.logger.debug("Key is writable");
                                        tcpAddress = writeData(next, null);
                                        channel = null;
                                        socketEntry = null;
                                    } else if (next.isReadable()) {
                                        TLSTM.logger.debug("Key is readable");
                                        channel = (SocketChannel) next.channel();
                                        tcpAddress = new TcpAddress(channel.socket().getInetAddress(), channel.socket().getPort());
                                        socketEntry = null;
                                    } else {
                                        if (next.isConnectable()) {
                                            TLSTM.logger.debug("Key is connectable");
                                            connectChannel(next, null);
                                        }
                                        channel = null;
                                        tcpAddress = null;
                                        socketEntry = null;
                                    }
                                    if (channel != null) {
                                        TLSTM.logger.debug("Key is reading");
                                        try {
                                            readMessage(next, channel, tcpAddress, socketEntry);
                                        } catch (IOException e10) {
                                            TLSTM.logger.warn(e10);
                                            e10.printStackTrace();
                                            next.cancel();
                                            channel.close();
                                            TLSTM.this.fireConnectionStateChanged(new TransportStateEvent(TLSTM.this, tcpAddress, 2, e10));
                                        }
                                    }
                                } catch (CancelledKeyException unused) {
                                    if (TLSTM.logger.isDebugEnabled()) {
                                        TLSTM.logger.debug("Selection key cancelled, skipping it");
                                    }
                                } catch (NoSuchAlgorithmException e11) {
                                    TLSTM.logger.error("NoSuchAlgorithm while reading from server socket: " + e11.getMessage(), e11);
                                }
                            }
                        }
                    } catch (NullPointerException e12) {
                        e12.printStackTrace();
                        TLSTM.logger.warn("NullPointerException within select()?");
                        this.stop = true;
                    }
                    processPending();
                } catch (IOException e13) {
                    TLSTM.logger.error(e13);
                    this.lastError = e13;
                }
            }
            ServerSocketChannel serverSocketChannel = this.ssc;
            if (serverSocketChannel != null) {
                serverSocketChannel.close();
            }
            Selector selector = this.selector;
            if (selector != null) {
                selector.close();
            }
            if (!this.stop) {
                this.stop = true;
                synchronized (TLSTM.this) {
                    TLSTM.this.server = null;
                }
            }
            if (TLSTM.logger.isDebugEnabled()) {
                TLSTM.logger.debug("Worker task finished: " + getClass().getName());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        
            if (r0 != 4) goto L37;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean runDelegatedTasks(javax.net.ssl.SSLEngineResult r6, org.snmp4j.transport.TLSTM.SocketEntry r7) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 279
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.transport.TLSTM.ServerThread.runDelegatedTasks(javax.net.ssl.SSLEngineResult, org.snmp4j.transport.TLSTM$SocketEntry):boolean");
        }

        public void sendMessage(Address address, byte[] bArr, TransportStateReference transportStateReference) throws IOException {
            Socket socket;
            SocketChannel socketChannelOpen;
            SocketEntry socketEntry = (SocketEntry) TLSTM.this.sockets.get(address);
            if (TLSTM.logger.isDebugEnabled()) {
                TLSTM.logger.debug("Looking up connection for destination '" + address + "' returned: " + socketEntry);
                TLSTM.logger.debug(TLSTM.this.sockets.toString());
            }
            if (socketEntry == null) {
                socket = null;
            } else {
                if (transportStateReference != null && transportStateReference.getSessionID() != null && !transportStateReference.getSessionID().equals(Long.valueOf(socketEntry.getSessionID()))) {
                    TLSTM.this.counterSupport.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionNoSessions));
                    throw new IOException("Session " + transportStateReference.getSessionID() + " not available");
                }
                socket = socketEntry.getSocket();
            }
            if (socket != null && !socket.isClosed() && socket.isConnected()) {
                if (TLSTM.this.matchingStateReferences(transportStateReference, socketEntry.tmStateReference)) {
                    socketEntry.addMessage(bArr);
                    synchronized (this.pending) {
                        this.pending.addFirst(socketEntry);
                    }
                    TLSTM.logger.debug("Waking up selector for new message");
                    this.selector.wakeup();
                    return;
                }
                TLSTM.logger.error("TransportStateReferences refNew=" + transportStateReference + ",refOld=" + socketEntry.tmStateReference + " do not match, message dropped");
                throw new IOException("Transport state reference does not match existing reference for this session/target");
            }
            if (TLSTM.logger.isDebugEnabled()) {
                TLSTM.logger.debug("Socket for address '" + address + "' is closed, opening it...");
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
                    TLSTM.this.counterSupport.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionOpens));
                } else {
                    socketChannelOpen = socket.getChannel();
                    socketChannelOpen.configureBlocking(false);
                    if (socketChannelOpen.isConnectionPending()) {
                        if (TLSTM.this.matchingStateReferences(transportStateReference, socketEntry.tmStateReference)) {
                            socketEntry.addMessage(bArr);
                            synchronized (this.pending) {
                                this.pending.add(socketEntry);
                            }
                            this.selector.wakeup();
                            return;
                        }
                        TLSTM.logger.error("TransportStateReferences refNew=" + transportStateReference + ",refOld=" + socketEntry.tmStateReference + " do not match, message dropped");
                        throw new IOException("Transport state reference does not match existing reference for this session/target");
                    }
                    socketChannelOpen.connect(inetSocketAddress);
                    TLSTM.this.counterSupport.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionOpens));
                }
                SocketEntry socketEntry2 = TLSTM.this.new SocketEntry((TcpAddress) address, socketChannelOpen.socket(), true, transportStateReference);
                socketEntry2.addMessage(bArr);
                TLSTM.this.sockets.put(address, socketEntry2);
                synchronized (this.pending) {
                    this.pending.add(socketEntry2);
                }
                this.selector.wakeup();
                TLSTM.logger.debug("Trying to connect to " + address);
            } catch (IOException e10) {
                TLSTM.logger.error(e10);
                throw e10;
            } catch (NoSuchAlgorithmException e11) {
                TLSTM.logger.error("NoSuchAlgorithmException while sending message to " + address + ": " + e11.getMessage(), e11);
            }
        }

        @Override // org.snmp4j.util.WorkerTask
        public void terminate() {
            this.stop = true;
            if (TLSTM.logger.isDebugEnabled()) {
                TLSTM.logger.debug("Terminated worker task: " + getClass().getName());
            }
        }
    }

    class SocketEntry {
        private boolean handshakeFinished;
        private ByteBuffer inAppBuffer;
        private ByteBuffer inNetBuffer;
        private ByteBuffer outAppBuffer;
        private ByteBuffer outNetBuffer;
        private TcpAddress peerAddress;
        private long sessionID;
        private Socket socket;
        private SocketTimeout socketTimeout;
        private SSLEngine sslEngine;
        private TransportStateReference tmStateReference;
        private LinkedList<byte[]> message = new LinkedList<>();
        private volatile int registrations = 0;
        private final Object outboundLock = new Object();
        private final Object inboundLock = new Object();
        private long lastUse = System.nanoTime();

        public SocketEntry(TcpAddress tcpAddress, Socket socket, boolean z10, TransportStateReference transportStateReference) throws NoSuchAlgorithmException {
            this.inAppBuffer = ByteBuffer.allocate(TLSTM.this.getMaxInboundMessageSize());
            this.inNetBuffer = ByteBuffer.allocate(TLSTM.this.getMaxInboundMessageSize());
            this.outNetBuffer = ByteBuffer.allocate(TLSTM.this.getMaxInboundMessageSize());
            this.peerAddress = tcpAddress;
            this.tmStateReference = transportStateReference;
            this.socket = socket;
            if (transportStateReference == null) {
                TLSTM.this.counterSupport.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionAccepts));
            }
            SSLEngine sSLEngineCreateSSLEngine = TLSTM.this.sslEngineConfigurator.getSSLContext(z10, transportStateReference).createSSLEngine(tcpAddress.getInetAddress().getHostName(), tcpAddress.getPort());
            this.sslEngine = sSLEngineCreateSSLEngine;
            sSLEngineCreateSSLEngine.setUseClientMode(z10);
            TLSTM.this.sslEngineConfigurator.configure(this.sslEngine);
            synchronized (TLSTM.this) {
                this.sessionID = TLSTM.access$408(TLSTM.this);
            }
        }

        public synchronized void addMessage(byte[] bArr) {
            this.message.add(bArr);
        }

        public synchronized void addRegistration(Selector selector, int i10) throws ClosedChannelException {
            try {
                if ((this.registrations & i10) == 0) {
                    this.registrations |= i10;
                    if (TLSTM.logger.isDebugEnabled()) {
                        TLSTM.logger.debug("Adding operation " + i10 + " for: " + toString());
                    }
                    this.socket.getChannel().register(selector, this.registrations, this);
                } else if (!this.socket.getChannel().isRegistered()) {
                    this.registrations = i10;
                    if (TLSTM.logger.isDebugEnabled()) {
                        TLSTM.logger.debug("Registering new operation " + i10 + " for: " + toString());
                    }
                    this.socket.getChannel().register(selector, i10, this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public void checkTransportStateReference() {
            OctetString securityName;
            TransportStateReference transportStateReference = this.tmStateReference;
            if (transportStateReference != null) {
                if (transportStateReference.getTransportSecurityLevel().equals(SecurityLevel.undefined)) {
                    this.tmStateReference.setTransportSecurityLevel(SecurityLevel.authPriv);
                    return;
                }
                return;
            }
            TLSTM tlstm = TLSTM.this;
            TcpAddress tcpAddress = this.peerAddress;
            OctetString octetString = new OctetString();
            SecurityLevel securityLevel = SecurityLevel.authPriv;
            this.tmStateReference = new TransportStateReference(tlstm, tcpAddress, octetString, securityLevel, securityLevel, true, Long.valueOf(this.sessionID));
            if (TLSTM.this.securityCallback != null) {
                try {
                    securityName = TLSTM.this.securityCallback.getSecurityName((X509Certificate[]) this.sslEngine.getSession().getPeerCertificates());
                } catch (SSLPeerUnverifiedException e10) {
                    TLSTM.logger.error("SSL peer '" + this.peerAddress + "' is not verified: " + e10.getMessage(), e10);
                    this.sslEngine.setEnableSessionCreation(false);
                }
            } else {
                securityName = null;
            }
            this.tmStateReference.setSecurityName(securityName);
        }

        public void closeSession() {
            SSLEngineResult sSLEngineResultSendNetMessage;
            if (TLSTM.logger.isInfoEnabled()) {
                TLSTM.logger.info("Closing TLSTM session " + this.sessionID);
            }
            try {
                this.sslEngine.closeOutbound();
                TLSTM.this.counterSupport.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionServerCloses));
                do {
                    sSLEngineResultSendNetMessage = TLSTM.this.sendNetMessage(this);
                    if (sSLEngineResultSendNetMessage == null || sSLEngineResultSendNetMessage.getStatus() == SSLEngineResult.Status.CLOSED) {
                        return;
                    }
                } while (sSLEngineResultSendNetMessage.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP);
            } catch (IOException e10) {
                TLSTM.logger.error("IOException while closing outbound channel of " + this + ": " + e10.getMessage(), e10);
            }
        }

        public ByteBuffer getInAppBuffer() {
            return this.inAppBuffer;
        }

        public ByteBuffer getInNetBuffer() {
            return this.inNetBuffer;
        }

        public long getLastUse() {
            return this.lastUse;
        }

        public ByteBuffer getOutNetBuffer() {
            return this.outNetBuffer;
        }

        public TcpAddress getPeerAddress() {
            return this.peerAddress;
        }

        public long getSessionID() {
            return this.sessionID;
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

        public boolean isAppOutPending() {
            boolean z10;
            synchronized (this.outboundLock) {
                try {
                    ByteBuffer byteBuffer = this.outAppBuffer;
                    z10 = byteBuffer != null && byteBuffer.limit() > 0;
                } finally {
                }
            }
            return z10;
        }

        public boolean isHandshakeFinished() {
            return this.handshakeFinished;
        }

        public synchronized boolean isRegistered(int i10) {
            return (this.registrations & i10) == i10;
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

        public void setHandshakeFinished(boolean z10) {
            this.handshakeFinished = z10;
        }

        public void setInAppBuffer(ByteBuffer byteBuffer) {
            this.inAppBuffer = byteBuffer;
        }

        public void setInNetBuffer(ByteBuffer byteBuffer) {
            this.inNetBuffer = byteBuffer;
        }

        public void setOutNetBuffer(ByteBuffer byteBuffer) {
            this.outNetBuffer = byteBuffer;
        }

        public void setSocketTimeout(SocketTimeout socketTimeout) {
            this.socketTimeout = socketTimeout;
        }

        public String toString() {
            return "SocketEntry[peerAddress=" + this.peerAddress + ",socket=" + this.socket + ",lastUse=" + new Date(this.lastUse / 1000000) + ",inNetBuffer=" + this.inNetBuffer + ",inAppBuffer=" + this.inAppBuffer + ",outNetBuffer=" + this.outNetBuffer + ",socketTimeout=" + this.socketTimeout + "]";
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

        @Override // java.util.TimerTask
        public boolean cancel() {
            boolean zCancel = super.cancel();
            this.entry = null;
            return zCancel;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            long jNanoTime = System.nanoTime();
            if (TLSTM.this.socketCleaner != null && (jNanoTime - this.entry.getLastUse()) / 1000000 < TLSTM.this.connectionTimeout) {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((jNanoTime - this.entry.getLastUse()) / 1000000) + TLSTM.this.connectionTimeout;
                if (TLSTM.logger.isDebugEnabled()) {
                    TLSTM.logger.debug("Scheduling " + jCurrentTimeMillis);
                }
                SocketTimeout socketTimeout = TLSTM.this.new SocketTimeout(this.entry);
                this.entry.setSocketTimeout(socketTimeout);
                TLSTM.this.socketCleaner.schedule(socketTimeout, jCurrentTimeMillis);
                return;
            }
            if (TLSTM.logger.isDebugEnabled()) {
                TLSTM.logger.debug("Socket has not been used for " + (jNanoTime - this.entry.getLastUse()) + " milliseconds, closing it");
            }
            TLSTM.this.removeSocketEntry(this.entry.getPeerAddress());
            SocketEntry socketEntry = this.entry;
            try {
                synchronized (socketEntry) {
                    socketEntry.getSocket().close();
                }
                TLSTM.logger.info("Socket to " + socketEntry.getPeerAddress() + " closed due to timeout");
            } catch (IOException e10) {
                TLSTM.logger.error(e10);
            }
        }
    }

    public interface TLSTMTrustManagerFactory {
        X509TrustManager create(X509TrustManager x509TrustManager, boolean z10, TransportStateReference transportStateReference);
    }

    public TLSTM() throws UnknownHostException {
        super(new TlsAddress(InetAddress.getLocalHost(), 0));
        this.sockets = new Hashtable();
        this.connectionTimeout = 60000L;
        this.serverEnabled = false;
        this.nextSessionID = 1L;
        this.sslEngineConfigurator = new DefaultSSLEngineConfiguration();
        this.trustManagerFactory = new DefaultTLSTMTrustManagerFactory(this, null);
        this.tlsMaxFragmentSize = TLS_MAX_FRAGMENT_SIZE;
        this.counterSupport = CounterSupport.getInstance();
        this.maxInboundMessageSize = 32768;
    }

    static /* synthetic */ long access$408(TLSTM tlstm) {
        long j10 = tlstm.nextSessionID;
        tlstm.nextSessionID = 1 + j10;
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adjustInNetBuffer(SocketEntry socketEntry, SSLEngineResult sSLEngineResult) {
        if (sSLEngineResult.getStatus() == SSLEngineResult.Status.OK) {
            if (sSLEngineResult.bytesConsumed() == socketEntry.inNetBuffer.limit()) {
                socketEntry.inNetBuffer.clear();
            } else if (sSLEngineResult.bytesConsumed() > 0) {
                socketEntry.inNetBuffer.compact();
            }
        }
    }

    public static OctetString getFingerprint(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        try {
            String sigAlgName = x509Certificate.getSigAlgName();
            if (sigAlgName.contains("with")) {
                sigAlgName = sigAlgName.substring(0, sigAlgName.indexOf("with"));
                if (sigAlgName.startsWith("SHA") && !sigAlgName.contains("-")) {
                    sigAlgName = "SHA-" + sigAlgName.substring(3);
                }
            }
            MessageDigest messageDigest = MessageDigest.getInstance(sigAlgName);
            messageDigest.update(x509Certificate.getEncoded());
            return new OctetString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            logger.error("No such digest algorithm exception while getting fingerprint from " + x509Certificate + ": " + e10.getMessage(), e10);
            return null;
        } catch (CertificateEncodingException e11) {
            logger.error("Certificate encoding exception while getting fingerprint from " + x509Certificate + ": " + e11.getMessage(), e11);
            return null;
        }
    }

    public static Object getSubjAltName(Collection<List<?>> collection, int i10) {
        if (collection == null) {
            return null;
        }
        for (List<?> list : collection) {
            if (((Integer) list.get(0)).intValue() == i10) {
                return list.get(1);
            }
        }
        return null;
    }

    protected static boolean isEngineClosed(SSLEngine sSLEngine) {
        return sSLEngine.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING && sSLEngine.isOutboundDone() && sSLEngine.isInboundDone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean matchingStateReferences(TransportStateReference transportStateReference, TransportStateReference transportStateReference2) {
        if (transportStateReference2 == null || transportStateReference == null) {
            logger.error("Failed to compare TransportStateReferences refNew=" + transportStateReference + ",refOld=" + transportStateReference2);
            return false;
        }
        if (transportStateReference.getSecurityName() != null && transportStateReference2.getSecurityName() != null) {
            return transportStateReference.getSecurityName().equals(transportStateReference2.getSecurityName());
        }
        logger.error("Could not match TransportStateReferences refNew=" + transportStateReference + ",refOld=" + transportStateReference2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SSLEngineResult sendNetMessage(SocketEntry socketEntry) throws IOException {
        synchronized (socketEntry.outboundLock) {
            try {
                if (!socketEntry.outNetBuffer.hasRemaining()) {
                    return null;
                }
                SSLEngineResult sSLEngineResultWrap = socketEntry.sslEngine.wrap(ByteBuffer.allocate(0), socketEntry.outNetBuffer);
                socketEntry.outNetBuffer.flip();
                logger.debug("TLS outNetBuffer = " + socketEntry.outNetBuffer);
                socketEntry.socket.getChannel().write(socketEntry.outNetBuffer);
                socketEntry.outNetBuffer.clear();
                return sSLEngineResultWrap;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void timeoutSocket(SocketEntry socketEntry) {
        if (this.connectionTimeout > 0) {
            SocketTimeout socketTimeout = new SocketTimeout(socketEntry);
            socketEntry.setSocketTimeout(socketTimeout);
            this.socketCleaner.schedule(socketTimeout, this.connectionTimeout);
        }
    }

    public long getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public CounterSupport getCounterSupport() {
        return this.counterSupport;
    }

    public String getKeyStore() {
        String str = this.keyStore;
        return str == null ? System.getProperty("javax.net.ssl.keyStore") : str;
    }

    public String getKeyStorePassword() {
        String str = this.keyStorePassword;
        return str == null ? System.getProperty("javax.net.ssl.keyStorePassword") : str;
    }

    public String getLocalCertificateAlias() {
        String str = this.localCertificateAlias;
        return str == null ? System.getProperty(SnmpConfigurator.P_TLS_LOCAL_ID, null) : str;
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public int getMaxInboundMessageSize() {
        return super.getMaxInboundMessageSize();
    }

    @Override // org.snmp4j.transport.TcpTransportMapping, org.snmp4j.transport.ConnectionOrientedTransportMapping
    public MessageLengthDecoder getMessageLengthDecoder() {
        return null;
    }

    public TlsTmSecurityCallback<X509Certificate> getSecurityCallback() {
        return this.securityCallback;
    }

    @Override // org.snmp4j.transport.TcpTransportMapping, org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public Class<? extends Address> getSupportedAddressClass() {
        return TlsAddress.class;
    }

    public String getThreadName() {
        Object obj = this.server;
        if (obj != null) {
            return ((Thread) obj).getName();
        }
        return null;
    }

    public String[] getTlsProtocols() {
        String[] strArr = this.tlsProtocols;
        return strArr == null ? System.getProperty(SnmpConfigurator.P_TLS_VERSION, DEFAULT_TLSTM_PROTOCOLS).split(",") : strArr;
    }

    public TLSTMTrustManagerFactory getTrustManagerFactory() {
        return this.trustManagerFactory;
    }

    public String getTrustStore() {
        String str = this.trustStore;
        return str == null ? System.getProperty("javax.net.ssl.trustStore") : str;
    }

    public String getTrustStorePassword() {
        String str = this.trustStorePassword;
        return str == null ? System.getProperty("javax.net.ssl.trustStorePassword") : str;
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
        if (this.server != null) {
            throw new SocketException("Port already listening");
        }
        try {
            this.serverThread = new ServerThread();
            LogAdapter logAdapter = logger;
            if (logAdapter.isInfoEnabled()) {
                logAdapter.info("TCP address " + getListenAddress() + " bound successfully");
            }
            this.server = SNMP4JSettings.getThreadFactory().createWorkerThread("TLSTM_" + getAddress(), this.serverThread, true);
            if (this.connectionTimeout > 0) {
                this.socketCleaner = SNMP4JSettings.getTimerFactory().createTimer();
            }
            this.server.run();
        } catch (NoSuchAlgorithmException e10) {
            throw new IOException("SSL not available: " + e10.getMessage(), e10);
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

    public void setKeyStore(String str) {
        this.keyStore = str;
    }

    public void setKeyStorePassword(String str) {
        this.keyStorePassword = str;
    }

    public void setLocalCertificateAlias(String str) {
        this.localCertificateAlias = str;
    }

    public void setMaxInboundMessageSize(int i10) {
        this.maxInboundMessageSize = i10;
    }

    @Override // org.snmp4j.transport.TcpTransportMapping, org.snmp4j.transport.ConnectionOrientedTransportMapping
    public void setMessageLengthDecoder(MessageLengthDecoder messageLengthDecoder) {
    }

    public void setSecurityCallback(TlsTmSecurityCallback<X509Certificate> tlsTmSecurityCallback) {
        this.securityCallback = tlsTmSecurityCallback;
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

    public void setTlsProtocols(String[] strArr) {
        this.tlsProtocols = strArr;
    }

    public void setTrustManagerFactory(TLSTMTrustManagerFactory tLSTMTrustManagerFactory) {
        tLSTMTrustManagerFactory.getClass();
        this.trustManagerFactory = tLSTMTrustManagerFactory;
    }

    public void setTrustStore(String str) {
        this.trustStore = str;
    }

    public void setTrustStorePassword(String str) {
        this.trustStorePassword = str;
    }

    void writeNetBuffer(SocketEntry socketEntry, SocketChannel socketChannel) throws IOException {
        socketEntry.outNetBuffer.flip();
        while (socketEntry.outNetBuffer.hasRemaining()) {
            LogAdapter logAdapter = logger;
            logAdapter.debug("Writing TLS outNetBuffer(PAYLOAD): " + socketEntry.outNetBuffer);
            int iWrite = socketChannel.write(socketEntry.outNetBuffer);
            logAdapter.debug("Wrote TLS " + iWrite + " bytes from outNetBuffer(PAYLOAD)");
            if (iWrite == -1) {
                throw new IOException("TLS connection closed");
            }
            if (iWrite == 0) {
                socketEntry.outNetBuffer.compact();
                return;
            }
        }
        socketEntry.outNetBuffer.clear();
    }

    @Override // org.snmp4j.transport.TcpTransportMapping, org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public void close() throws IOException {
        for (SocketEntry socketEntry : this.sockets.values()) {
            socketEntry.closeSession();
            fireConnectionStateChanged(new TransportStateEvent(this, socketEntry.getPeerAddress(), 4, null));
        }
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
            for (SocketEntry socketEntry2 : this.sockets.values()) {
                Socket socket = socketEntry2.getSocket();
                if (socket != null) {
                    try {
                        SocketChannel channel = socket.getChannel();
                        socket.close();
                        LogAdapter logAdapter = logger;
                        if (logAdapter.isDebugEnabled()) {
                            logAdapter.debug("Socket to " + socketEntry2.getPeerAddress() + " closed");
                        }
                        if (channel != null) {
                            channel.close();
                            if (logAdapter.isDebugEnabled()) {
                                logAdapter.debug("Socket channel to " + socketEntry2.getPeerAddress() + " closed");
                            }
                        }
                    } catch (IOException e11) {
                        logger.debug(e11);
                    }
                }
            }
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
            port = this.serverThread.ssc.socket().getLocalPort();
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

    public TLSTM(TlsAddress tlsAddress) throws ClassNotFoundException, IOException {
        super(tlsAddress);
        this.sockets = new Hashtable();
        this.connectionTimeout = 60000L;
        this.serverEnabled = false;
        this.nextSessionID = 1L;
        this.sslEngineConfigurator = new DefaultSSLEngineConfiguration();
        this.trustManagerFactory = new DefaultTLSTMTrustManagerFactory(this, null);
        this.tlsMaxFragmentSize = TLS_MAX_FRAGMENT_SIZE;
        this.maxInboundMessageSize = 32768;
        this.serverEnabled = true;
        this.counterSupport = CounterSupport.getInstance();
        try {
            Class.forName("javax.net.ssl.X509ExtendedTrustManager");
            setTrustManagerFactory((TLSTMTrustManagerFactory) TLSTMExtendedTrustManagerFactory.class.getConstructors()[0].newInstance(CounterSupport.getInstance(), this.securityCallback));
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e10) {
            throw new IOException("Failed to access TLSTMTrustManagerFactory: " + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new IOException("Failed to setup TLSTMTrustManagerFactory: " + e11.getMessage(), e11);
        } catch (InstantiationException e12) {
            throw new IOException("Failed to instantiate TLSTMTrustManagerFactory: " + e12.getMessage(), e12);
        } catch (InvocationTargetException e13) {
            throw new IOException("Failed to init TLSTMTrustManagerFactory: " + e13.getMessage(), e13);
        }
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

    public TLSTM(TlsTmSecurityCallback<X509Certificate> tlsTmSecurityCallback, TlsAddress tlsAddress) throws IOException {
        this(tlsTmSecurityCallback, tlsAddress, CounterSupport.getInstance());
    }

    public TLSTM(TlsTmSecurityCallback<X509Certificate> tlsTmSecurityCallback, TlsAddress tlsAddress, CounterSupport counterSupport) throws IOException {
        super(tlsAddress);
        this.sockets = new Hashtable();
        this.connectionTimeout = 60000L;
        this.serverEnabled = false;
        this.nextSessionID = 1L;
        this.sslEngineConfigurator = new DefaultSSLEngineConfiguration();
        this.trustManagerFactory = new DefaultTLSTMTrustManagerFactory(this, null);
        this.tlsMaxFragmentSize = TLS_MAX_FRAGMENT_SIZE;
        this.maxInboundMessageSize = 32768;
        this.serverEnabled = true;
        this.securityCallback = tlsTmSecurityCallback;
        this.counterSupport = counterSupport;
    }
}
