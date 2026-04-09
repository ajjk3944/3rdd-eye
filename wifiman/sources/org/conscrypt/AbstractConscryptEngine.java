package org.conscrypt;

import java.nio.ByteBuffer;
import java.security.PrivateKey;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes3.dex */
abstract class AbstractConscryptEngine extends SSLEngine {
    AbstractConscryptEngine() {
    }

    abstract byte[] exportKeyingMaterial(String str, byte[] bArr, int i10) throws SSLException;

    @Override // javax.net.ssl.SSLEngine
    public abstract String getApplicationProtocol();

    abstract String[] getApplicationProtocols();

    abstract byte[] getChannelId() throws SSLException;

    @Override // javax.net.ssl.SSLEngine
    public abstract String getHandshakeApplicationProtocol();

    @Override // javax.net.ssl.SSLEngine
    public final SSLSession getHandshakeSession() {
        return handshakeSession();
    }

    abstract String getHostname();

    @Override // javax.net.ssl.SSLEngine
    public abstract String getPeerHost();

    @Override // javax.net.ssl.SSLEngine
    public abstract int getPeerPort();

    abstract byte[] getTlsUnique();

    abstract SSLSession handshakeSession();

    abstract int maxSealOverhead();

    abstract void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector);

    abstract void setApplicationProtocols(String[] strArr);

    abstract void setBufferAllocator(BufferAllocator bufferAllocator);

    abstract void setChannelIdEnabled(boolean z10);

    abstract void setChannelIdPrivateKey(PrivateKey privateKey);

    abstract void setHandshakeListener(HandshakeListener handshakeListener);

    abstract void setHostname(String str);

    abstract void setUseSessionTickets(boolean z10);

    @Override // javax.net.ssl.SSLEngine
    public abstract SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws SSLException;

    @Override // javax.net.ssl.SSLEngine
    public abstract SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) throws SSLException;

    @Override // javax.net.ssl.SSLEngine
    public abstract SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i10, int i11) throws SSLException;

    abstract SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, int i10, int i11, ByteBuffer[] byteBufferArr2, int i12, int i13) throws SSLException;

    abstract SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) throws SSLException;

    @Override // javax.net.ssl.SSLEngine
    public abstract SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws SSLException;

    @Override // javax.net.ssl.SSLEngine
    public abstract SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i10, int i11, ByteBuffer byteBuffer) throws SSLException;
}
