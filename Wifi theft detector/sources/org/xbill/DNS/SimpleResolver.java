package org.xbill.DNS;

import com.mbridge.msdk.MBridgeConstans;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class SimpleResolver implements Resolver {
    public static final int DEFAULT_EDNS_PAYLOADSIZE = 1280;
    public static final int DEFAULT_PORT = 53;
    private static final short DEFAULT_UDPSIZE = 512;
    private static String defaultResolver = "localhost";
    private static int uniqueID;
    private InetSocketAddress address;
    private boolean ignoreTruncation;
    private InetSocketAddress localAddress;
    private OPTRecord queryOPT;
    private long timeoutValue;
    private TSIG tsig;
    private boolean useTCP;

    public SimpleResolver(String str) throws UnknownHostException {
        this.timeoutValue = 10000L;
        if (str == null && (str = ResolverConfig.getCurrentConfig().server()) == null) {
            str = defaultResolver;
        }
        this.address = new InetSocketAddress(str.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL) ? InetAddress.getLocalHost() : InetAddress.getByName(str), 53);
    }

    private void applyEDNS(Message message) {
        if (this.queryOPT == null || message.getOPT() != null) {
            return;
        }
        message.addRecord(this.queryOPT, 3);
    }

    private int maxUDPSize(Message message) {
        OPTRecord opt = message.getOPT();
        if (opt == null) {
            return 512;
        }
        return opt.getPayloadSize();
    }

    private Message parseMessage(byte[] bArr) throws WireParseException {
        try {
            return new Message(bArr);
        } catch (IOException e10) {
            e = e10;
            if (Options.check("verbose")) {
                e.printStackTrace();
            }
            if (!(e instanceof WireParseException)) {
                e = new WireParseException("Error parsing message");
            }
            throw ((WireParseException) e);
        }
    }

    private Message sendAXFR(Message message) throws IOException {
        ZoneTransferIn zoneTransferInNewAXFR = ZoneTransferIn.newAXFR(message.getQuestion().getName(), this.address, this.tsig);
        zoneTransferInNewAXFR.setTimeout((int) (getTimeout() / 1000));
        zoneTransferInNewAXFR.setLocalAddress(this.localAddress);
        try {
            zoneTransferInNewAXFR.run();
            List axfr = zoneTransferInNewAXFR.getAXFR();
            Message message2 = new Message(message.getHeader().getID());
            message2.getHeader().setFlag(5);
            message2.getHeader().setFlag(0);
            message2.addRecord(message.getQuestion(), 0);
            Iterator it = axfr.iterator();
            while (it.hasNext()) {
                message2.addRecord((Record) it.next(), 1);
            }
            return message2;
        } catch (ZoneTransferException e10) {
            throw new WireParseException(e10.getMessage());
        }
    }

    public static void setDefaultResolver(String str) {
        defaultResolver = str;
    }

    private void verifyTSIG(Message message, Message message2, byte[] bArr, TSIG tsig) {
        if (tsig == null) {
            return;
        }
        int iVerify = tsig.verify(message2, bArr, message.getTSIG());
        if (Options.check("verbose")) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("TSIG verify: ");
            stringBuffer.append(Rcode.TSIGstring(iVerify));
            printStream.println(stringBuffer.toString());
        }
    }

    public InetSocketAddress getAddress() {
        return this.address;
    }

    public TSIG getTSIGKey() {
        return this.tsig;
    }

    public long getTimeout() {
        return this.timeoutValue;
    }

    @Override // org.xbill.DNS.Resolver
    public Message send(Message message) throws IOException {
        Message message2;
        Record question;
        if (Options.check("verbose")) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Sending to ");
            stringBuffer.append(this.address.getAddress().getHostAddress());
            stringBuffer.append(":");
            stringBuffer.append(this.address.getPort());
            printStream.println(stringBuffer.toString());
        }
        if (message.getHeader().getOpcode() == 0 && (question = message.getQuestion()) != null && question.getType() == 252) {
            return sendAXFR(message);
        }
        Message message3 = (Message) message.clone();
        applyEDNS(message3);
        TSIG tsig = this.tsig;
        if (tsig != null) {
            tsig.apply(message3, null);
        }
        byte[] wire = message3.toWire(65535);
        int iMaxUDPSize = maxUDPSize(message3);
        long jCurrentTimeMillis = this.timeoutValue + System.currentTimeMillis();
        boolean z10 = false;
        while (true) {
            boolean z11 = (this.useTCP || wire.length > iMaxUDPSize) ? true : z10;
            byte[] bArrSendrecv = z11 ? TCPClient.sendrecv(this.localAddress, this.address, wire, jCurrentTimeMillis) : UDPClient.sendrecv(this.localAddress, this.address, wire, iMaxUDPSize, jCurrentTimeMillis);
            if (bArrSendrecv.length < 12) {
                throw new WireParseException("invalid DNS header - too short");
            }
            int i10 = ((bArrSendrecv[0] & 255) << 8) + (bArrSendrecv[1] & 255);
            int id = message3.getHeader().getID();
            if (i10 != id) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("invalid message id: expected ");
                stringBuffer2.append(id);
                stringBuffer2.append("; got id ");
                stringBuffer2.append(i10);
                String string = stringBuffer2.toString();
                if (z11) {
                    throw new WireParseException(string);
                }
                if (Options.check("verbose")) {
                    System.err.println(string);
                }
                z10 = z11;
            } else {
                message2 = parseMessage(bArrSendrecv);
                verifyTSIG(message3, message2, bArrSendrecv, this.tsig);
                if (z11 || this.ignoreTruncation || !message2.getHeader().getFlag(6)) {
                    break;
                }
                z10 = true;
            }
        }
        return message2;
    }

    @Override // org.xbill.DNS.Resolver
    public Object sendAsync(Message message, ResolverListener resolverListener) {
        Integer num;
        synchronized (this) {
            int i10 = uniqueID;
            uniqueID = i10 + 1;
            num = new Integer(i10);
        }
        Record question = message.getQuestion();
        String string = question != null ? question.getName().toString() : "(none)";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass());
        stringBuffer.append(": ");
        stringBuffer.append(string);
        String string2 = stringBuffer.toString();
        ResolveThread resolveThread = new ResolveThread(this, message, num, resolverListener);
        resolveThread.setName(string2);
        resolveThread.setDaemon(true);
        resolveThread.start();
        return num;
    }

    public void setAddress(InetSocketAddress inetSocketAddress) {
        this.address = inetSocketAddress;
    }

    @Override // org.xbill.DNS.Resolver
    public void setEDNS(int i10, int i11, int i12, List list) {
        if (i10 != 0 && i10 != -1) {
            throw new IllegalArgumentException("invalid EDNS level - must be 0 or -1");
        }
        if (i11 == 0) {
            i11 = DEFAULT_EDNS_PAYLOADSIZE;
        }
        this.queryOPT = new OPTRecord(i11, 0, i10, i12, list);
    }

    @Override // org.xbill.DNS.Resolver
    public void setIgnoreTruncation(boolean z10) {
        this.ignoreTruncation = z10;
    }

    public void setLocalAddress(InetSocketAddress inetSocketAddress) {
        this.localAddress = inetSocketAddress;
    }

    @Override // org.xbill.DNS.Resolver
    public void setPort(int i10) {
        this.address = new InetSocketAddress(this.address.getAddress(), i10);
    }

    @Override // org.xbill.DNS.Resolver
    public void setTCP(boolean z10) {
        this.useTCP = z10;
    }

    @Override // org.xbill.DNS.Resolver
    public void setTSIGKey(TSIG tsig) {
        this.tsig = tsig;
    }

    @Override // org.xbill.DNS.Resolver
    public void setTimeout(int i10, int i11) {
        this.timeoutValue = (i10 * 1000) + i11;
    }

    public void setAddress(InetAddress inetAddress) {
        this.address = new InetSocketAddress(inetAddress, this.address.getPort());
    }

    public void setLocalAddress(InetAddress inetAddress) {
        this.localAddress = new InetSocketAddress(inetAddress, 0);
    }

    @Override // org.xbill.DNS.Resolver
    public void setTimeout(int i10) {
        setTimeout(i10, 0);
    }

    @Override // org.xbill.DNS.Resolver
    public void setEDNS(int i10) {
        setEDNS(i10, 0, 0, null);
    }

    public SimpleResolver() throws UnknownHostException {
        this(null);
    }
}
