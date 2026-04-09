package org.msgpack.core.buffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final List f56978a;

    /* renamed from: b, reason: collision with root package name */
    private final int f56979b;

    /* renamed from: c, reason: collision with root package name */
    private MessageBuffer f56980c;

    public b() {
        this(8192);
    }

    @Override // org.msgpack.core.buffer.e
    public void B(int i10) {
        this.f56978a.add(this.f56980c.slice(0, i10));
        if (this.f56980c.size() - i10 <= this.f56979b / 4) {
            this.f56980c = null;
        } else {
            MessageBuffer messageBuffer = this.f56980c;
            this.f56980c = messageBuffer.slice(i10, messageBuffer.size() - i10);
        }
    }

    @Override // org.msgpack.core.buffer.e
    public MessageBuffer L(int i10) {
        MessageBuffer messageBuffer = this.f56980c;
        if (messageBuffer != null && messageBuffer.size() > i10) {
            return this.f56980c;
        }
        MessageBuffer messageBufferAllocate = MessageBuffer.allocate(Math.max(this.f56979b, i10));
        this.f56980c = messageBufferAllocate;
        return messageBufferAllocate;
    }

    public int a() {
        Iterator it = this.f56978a.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((MessageBuffer) it.next()).size();
        }
        return size;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public byte[] g() {
        byte[] bArr = new byte[a()];
        int size = 0;
        for (MessageBuffer messageBuffer : this.f56978a) {
            messageBuffer.getBytes(0, bArr, size, messageBuffer.size());
            size += messageBuffer.size();
        }
        return bArr;
    }

    @Override // org.msgpack.core.buffer.e
    public void write(byte[] bArr, int i10, int i11) {
        MessageBuffer messageBufferAllocate = MessageBuffer.allocate(i11);
        messageBufferAllocate.putBytes(0, bArr, i10, i11);
        this.f56978a.add(messageBufferAllocate);
    }

    public b(int i10) {
        this.f56979b = i10;
        this.f56978a = new ArrayList();
    }
}
