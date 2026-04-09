package org.msgpack.core.buffer;

import org.msgpack.core.g;

/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private MessageBuffer f56976a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f56977b;

    public a(MessageBuffer messageBuffer) {
        this.f56976a = messageBuffer;
        if (messageBuffer == null) {
            this.f56977b = true;
        } else {
            this.f56977b = false;
        }
    }

    @Override // org.msgpack.core.buffer.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f56976a = null;
        this.f56977b = true;
    }

    @Override // org.msgpack.core.buffer.d
    public MessageBuffer next() {
        if (this.f56977b) {
            return null;
        }
        this.f56977b = true;
        return this.f56976a;
    }

    public a(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public a(byte[] bArr, int i10, int i11) {
        this(MessageBuffer.wrap((byte[]) g.d(bArr, "input array is null"), i10, i11));
    }
}
