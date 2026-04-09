package org.xbill.DNS;

import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import org.xbill.DNS.utils.hexdump;

/* loaded from: classes4.dex */
class Client {
    private static PacketLogger packetLogger;
    protected long endTime;
    protected SelectionKey key;

    public Client(SelectableChannel selectableChannel, long j10) throws Throwable {
        Selector selectorOpen;
        this.endTime = j10;
        try {
            selectorOpen = Selector.open();
        } catch (Throwable th) {
            th = th;
            selectorOpen = null;
        }
        try {
            selectableChannel.configureBlocking(false);
            this.key = selectableChannel.register(selectorOpen, 1);
        } catch (Throwable th2) {
            th = th2;
            if (selectorOpen != null) {
                selectorOpen.close();
            }
            selectableChannel.close();
            throw th;
        }
    }

    public static void blockUntil(SelectionKey selectionKey, long j10) throws IOException {
        long jCurrentTimeMillis = j10 - System.currentTimeMillis();
        if ((jCurrentTimeMillis > 0 ? selectionKey.selector().select(jCurrentTimeMillis) : jCurrentTimeMillis == 0 ? selectionKey.selector().selectNow() : 0) == 0) {
            throw new SocketTimeoutException();
        }
    }

    public static void setPacketLogger(PacketLogger packetLogger2) {
        packetLogger = packetLogger2;
    }

    public static void verboseLog(String str, SocketAddress socketAddress, SocketAddress socketAddress2, byte[] bArr) {
        if (Options.check("verbosemsg")) {
            System.err.println(hexdump.dump(str, bArr));
        }
        PacketLogger packetLogger2 = packetLogger;
        if (packetLogger2 != null) {
            packetLogger2.log(str, socketAddress, socketAddress2, bArr);
        }
    }

    public void cleanup() throws IOException {
        this.key.selector().close();
        this.key.channel().close();
    }
}
