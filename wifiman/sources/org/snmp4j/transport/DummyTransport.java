package org.snmp4j.transport;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.TransportStateReference;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.security.SecurityLevel;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.IpAddress;
import org.snmp4j.smi.OctetString;
import org.snmp4j.util.WorkerTask;

/* loaded from: classes2.dex */
public class DummyTransport<A extends IpAddress> extends AbstractTransportMapping<A> {
    private static final LogAdapter logger = LogFactory.getLogger(DummyTransport.class);
    private A listenAddress;
    private WorkerTask listenThread;
    private boolean listening;
    private A receiverAddress;
    private final Queue<DummyTransport<A>.MessageContainer> requests;
    private final Queue<DummyTransport<A>.MessageContainer> responses;
    private long sessionID;

    public class DummyTransportResponder extends AbstractTransportMapping<A> {
        private WorkerTask listenThread;
        private boolean listening;

        public DummyTransportResponder() {
        }

        @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
        public void close() throws IOException {
            this.listening = false;
            WorkerTask workerTask = this.listenThread;
            if (workerTask != null) {
                workerTask.terminate();
                try {
                    this.listenThread.join();
                } catch (InterruptedException unused) {
                }
            }
            DummyTransport.this.requests.clear();
        }

        @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
        public Class<? extends Address> getSupportedAddressClass() {
            return DummyTransport.this.getSupportedAddressClass();
        }

        @Override // org.snmp4j.TransportMapping
        public boolean isListening() {
            return this.listening;
        }

        @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
        public void listen() throws IOException {
            this.listening = true;
            DummyTransport.access$108(DummyTransport.this);
            DummyTransport dummyTransport = DummyTransport.this;
            QueueProcessor queueProcessor = new QueueProcessor(dummyTransport.requests, this);
            WorkerTask workerTaskCreateWorkerThread = SNMP4JSettings.getThreadFactory().createWorkerThread("DummyResponseTransportMapping_" + getListenAddress(), queueProcessor, true);
            this.listenThread = workerTaskCreateWorkerThread;
            workerTaskCreateWorkerThread.run();
        }

        @Override // org.snmp4j.TransportMapping
        public A getListenAddress() {
            return (A) DummyTransport.this.receiverAddress;
        }

        @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
        public void sendMessage(A a10, byte[] bArr, TransportStateReference transportStateReference) throws IOException {
            if (DummyTransport.logger.isDebugEnabled()) {
                DummyTransport.logger.debug("Send response message to '" + a10 + "': " + new OctetString(bArr).toHexString());
            }
            DummyTransport.this.responses.add(new MessageContainer(a10, new OctetString(bArr)));
        }
    }

    private class MessageContainer {
        private OctetString payload;
        private Address sourceAddress;

        public MessageContainer(Address address, OctetString octetString) {
            this.payload = octetString;
            this.sourceAddress = address;
        }

        public OctetString getPayload() {
            return this.payload;
        }

        public Address getSourceAddress() {
            return this.sourceAddress;
        }
    }

    private class QueueProcessor implements WorkerTask {
        private Queue<DummyTransport<A>.MessageContainer> queue;
        private volatile boolean stop;
        private AbstractTransportMapping tm;

        public QueueProcessor(Queue<DummyTransport<A>.MessageContainer> queue, AbstractTransportMapping abstractTransportMapping) {
            this.queue = queue;
            this.tm = abstractTransportMapping;
        }

        @Override // org.snmp4j.util.WorkerTask
        public void interrupt() {
            this.stop = true;
        }

        @Override // org.snmp4j.util.WorkerTask
        public void join() throws InterruptedException {
            this.stop = true;
            synchronized (this) {
            }
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            while (!this.stop) {
                DummyTransport<A>.MessageContainer messageContainerPoll = this.queue.poll();
                if (messageContainerPoll != null) {
                    DummyTransport dummyTransport = DummyTransport.this;
                    IpAddress ipAddress = dummyTransport.listenAddress;
                    SecurityLevel securityLevel = SecurityLevel.undefined;
                    this.tm.fireProcessMessage(DummyTransport.this.listenAddress, ByteBuffer.wrap(messageContainerPoll.getPayload().getValue()), new TransportStateReference(dummyTransport, ipAddress, null, securityLevel, securityLevel, false, Long.valueOf(DummyTransport.this.sessionID)));
                } else {
                    try {
                        Thread.sleep(50L);
                    } catch (InterruptedException e10) {
                        DummyTransport.logger.warn("Interrupted QueueProcessor: " + e10.getMessage());
                    }
                }
            }
        }

        @Override // org.snmp4j.util.WorkerTask
        public void terminate() {
            this.stop = true;
        }
    }

    public DummyTransport() {
        this.requests = new ConcurrentLinkedQueue();
        this.responses = new ConcurrentLinkedQueue();
        this.sessionID = 0L;
        this.listening = false;
    }

    static /* synthetic */ long access$108(DummyTransport dummyTransport) {
        long j10 = dummyTransport.sessionID;
        dummyTransport.sessionID = 1 + j10;
        return j10;
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public void close() throws IOException {
        if (this.listening) {
            this.listening = false;
            this.listenThread.terminate();
            try {
                this.listenThread.join();
            } catch (InterruptedException unused) {
            }
        }
        this.responses.clear();
    }

    public AbstractTransportMapping<A> getResponder(A a10) {
        this.receiverAddress = a10;
        return new DummyTransportResponder();
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public Class<? extends Address> getSupportedAddressClass() {
        return IpAddress.class;
    }

    @Override // org.snmp4j.TransportMapping
    public boolean isListening() {
        return this.listening;
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public void listen() throws IOException {
        this.listening = true;
        this.sessionID++;
        QueueProcessor queueProcessor = new QueueProcessor(this.responses, this);
        WorkerTask workerTaskCreateWorkerThread = SNMP4JSettings.getThreadFactory().createWorkerThread("DummyTransportMapping_" + getListenAddress(), queueProcessor, true);
        this.listenThread = workerTaskCreateWorkerThread;
        workerTaskCreateWorkerThread.run();
    }

    public void setListenAddress(A a10) {
        this.listenAddress = a10;
    }

    public String toString() {
        return "DummyTransport{requests=" + this.requests + ", responses=" + this.responses + ", listening=" + this.listening + ", listenAddress=" + this.listenAddress + ", receiverAddress=" + this.receiverAddress + ", listenThread=" + this.listenThread + ", sessionID=" + this.sessionID + '}';
    }

    @Override // org.snmp4j.TransportMapping
    public A getListenAddress() {
        return this.listenAddress;
    }

    @Override // org.snmp4j.transport.AbstractTransportMapping, org.snmp4j.TransportMapping
    public void sendMessage(A a10, byte[] bArr, TransportStateReference transportStateReference) throws IOException {
        synchronized (this.requests) {
            try {
                LogAdapter logAdapter = logger;
                if (logAdapter.isDebugEnabled()) {
                    logAdapter.debug("Send request message to '" + a10 + "': " + new OctetString(bArr).toHexString());
                }
                this.requests.add(new MessageContainer(a10, new OctetString(bArr)));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public DummyTransport(A a10) {
        this.requests = new ConcurrentLinkedQueue();
        this.responses = new ConcurrentLinkedQueue();
        this.sessionID = 0L;
        this.listenAddress = a10;
    }

    public DummyTransport(A a10, A a11) {
        this.requests = new ConcurrentLinkedQueue();
        this.responses = new ConcurrentLinkedQueue();
        this.sessionID = 0L;
        this.listenAddress = a10;
        this.receiverAddress = a11;
    }
}
