package org.xbill.DNS;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/* loaded from: classes4.dex */
final class TCPClient extends Client {
    public TCPClient(long j10) throws IOException {
        super(SocketChannel.open(), j10);
    }

    private byte[] _recv(int i10) throws IOException {
        SocketChannel socketChannel = (SocketChannel) this.key.channel();
        byte[] bArr = new byte[i10];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.key.interestOps(1);
        int i11 = 0;
        while (i11 < i10) {
            try {
                if (this.key.isReadable()) {
                    long j10 = socketChannel.read(byteBufferWrap);
                    if (j10 < 0) {
                        throw new EOFException();
                    }
                    i11 += (int) j10;
                    if (i11 < i10 && System.currentTimeMillis() > this.endTime) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    Client.blockUntil(this.key, this.endTime);
                }
            } catch (Throwable th) {
                if (this.key.isValid()) {
                    this.key.interestOps(0);
                }
                throw th;
            }
        }
        if (this.key.isValid()) {
            this.key.interestOps(0);
        }
        return bArr;
    }

    public static byte[] sendrecv(SocketAddress socketAddress, SocketAddress socketAddress2, byte[] bArr, long j10) throws IOException {
        TCPClient tCPClient = new TCPClient(j10);
        if (socketAddress != null) {
            try {
                tCPClient.bind(socketAddress);
            } catch (Throwable th) {
                tCPClient.cleanup();
                throw th;
            }
        }
        tCPClient.connect(socketAddress2);
        tCPClient.send(bArr);
        byte[] bArrRecv = tCPClient.recv();
        tCPClient.cleanup();
        return bArrRecv;
    }

    public void bind(SocketAddress socketAddress) throws IOException {
        ((SocketChannel) this.key.channel()).socket().bind(socketAddress);
    }

    public void connect(SocketAddress socketAddress) throws IOException {
        SocketChannel socketChannel = (SocketChannel) this.key.channel();
        if (socketChannel.connect(socketAddress)) {
            return;
        }
        this.key.interestOps(8);
        while (true) {
            try {
                if (socketChannel.finishConnect()) {
                    break;
                } else if (!this.key.isConnectable()) {
                    Client.blockUntil(this.key, this.endTime);
                }
            } finally {
                if (this.key.isValid()) {
                    this.key.interestOps(0);
                }
            }
        }
    }

    public byte[] recv() throws IOException {
        byte[] bArr_recv = _recv(2);
        byte[] bArr_recv2 = _recv(((bArr_recv[0] & 255) << 8) + (bArr_recv[1] & 255));
        SocketChannel socketChannel = (SocketChannel) this.key.channel();
        Client.verboseLog("TCP read", socketChannel.socket().getLocalSocketAddress(), socketChannel.socket().getRemoteSocketAddress(), bArr_recv2);
        return bArr_recv2;
    }

    public void send(byte[] bArr) throws IOException {
        SocketChannel socketChannel = (SocketChannel) this.key.channel();
        Client.verboseLog("TCP write", socketChannel.socket().getLocalSocketAddress(), socketChannel.socket().getRemoteSocketAddress(), bArr);
        ByteBuffer[] byteBufferArr = {ByteBuffer.wrap(new byte[]{(byte) (bArr.length >>> 8), (byte) (bArr.length & 255)}), ByteBuffer.wrap(bArr)};
        this.key.interestOps(4);
        int i10 = 0;
        while (i10 < bArr.length + 2) {
            try {
                if (this.key.isWritable()) {
                    long jWrite = socketChannel.write(byteBufferArr);
                    if (jWrite < 0) {
                        throw new EOFException();
                    }
                    i10 += (int) jWrite;
                    if (i10 < bArr.length + 2 && System.currentTimeMillis() > this.endTime) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    Client.blockUntil(this.key, this.endTime);
                }
            } catch (Throwable th) {
                if (this.key.isValid()) {
                    this.key.interestOps(0);
                }
                throw th;
            }
        }
        if (this.key.isValid()) {
            this.key.interestOps(0);
        }
    }

    public static byte[] sendrecv(SocketAddress socketAddress, byte[] bArr, long j10) throws IOException {
        return sendrecv(null, socketAddress, bArr, j10);
    }
}
