package javax.jmdns.impl;

import java.io.IOException;
import java.net.DatagramPacket;
import javax.jmdns.impl.constants.DNSConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes4.dex */
class SocketListener extends Thread {
    static Logger logger = LoggerFactory.getLogger(SocketListener.class.getName());
    private final JmDNSImpl _jmDNSImpl;

    public SocketListener(JmDNSImpl jmDNSImpl) {
        StringBuilder sb = new StringBuilder();
        sb.append("SocketListener(");
        sb.append(jmDNSImpl != null ? jmDNSImpl.getName() : "");
        sb.append(")");
        super(sb.toString());
        setDaemon(true);
        this._jmDNSImpl = jmDNSImpl;
    }

    public JmDNSImpl getDns() {
        return this._jmDNSImpl;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws IOException {
        try {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[DNSConstants.MAX_MSG_ABSOLUTE], DNSConstants.MAX_MSG_ABSOLUTE);
            while (!this._jmDNSImpl.isCanceling() && !this._jmDNSImpl.isCanceled()) {
                datagramPacket.setLength(DNSConstants.MAX_MSG_ABSOLUTE);
                this._jmDNSImpl.getSocket().receive(datagramPacket);
                if (this._jmDNSImpl.isCanceling() || this._jmDNSImpl.isCanceled() || this._jmDNSImpl.isClosing() || this._jmDNSImpl.isClosed()) {
                    break;
                }
                try {
                    if (!this._jmDNSImpl.getLocalHost().shouldIgnorePacket(datagramPacket)) {
                        DNSIncoming dNSIncoming = new DNSIncoming(datagramPacket);
                        if (dNSIncoming.isValidResponseCode()) {
                            if (logger.isTraceEnabled()) {
                                logger.trace(getName() + ".run() JmDNS in:" + dNSIncoming.print(true));
                            }
                            if (dNSIncoming.isQuery()) {
                                int port = datagramPacket.getPort();
                                int i10 = DNSConstants.MDNS_PORT;
                                if (port != i10) {
                                    this._jmDNSImpl.handleQuery(dNSIncoming, datagramPacket.getAddress(), datagramPacket.getPort());
                                }
                                JmDNSImpl jmDNSImpl = this._jmDNSImpl;
                                jmDNSImpl.handleQuery(dNSIncoming, jmDNSImpl.getGroup(), i10);
                            } else {
                                this._jmDNSImpl.handleResponse(dNSIncoming);
                            }
                        } else if (logger.isDebugEnabled()) {
                            logger.debug(getName() + ".run() JmDNS in message with error code:" + dNSIncoming.print(true));
                        }
                    }
                } catch (IOException e10) {
                    logger.warn(getName() + ".run() exception ", (Throwable) e10);
                }
            }
        } catch (IOException e11) {
            if (!this._jmDNSImpl.isCanceling() && !this._jmDNSImpl.isCanceled() && !this._jmDNSImpl.isClosing() && !this._jmDNSImpl.isClosed()) {
                logger.warn(getName() + ".run() exception ", (Throwable) e11);
                this._jmDNSImpl.recover();
            }
        }
        if (logger.isTraceEnabled()) {
            logger.trace(getName() + ".run() exiting.");
        }
    }
}
