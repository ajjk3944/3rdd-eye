package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class N extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile N[] f42514d;

    /* renamed from: a, reason: collision with root package name */
    public K f42515a;

    /* renamed from: b, reason: collision with root package name */
    public M f42516b;

    /* renamed from: c, reason: collision with root package name */
    public L f42517c;

    public N() {
        a();
    }

    public static N[] b() {
        if (f42514d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42514d == null) {
                        f42514d = new N[0];
                    }
                } finally {
                }
            }
        }
        return f42514d;
    }

    public final N a() {
        this.f42515a = null;
        this.f42516b = null;
        this.f42517c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        K k10 = this.f42515a;
        if (k10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, k10);
        }
        M m10 = this.f42516b;
        if (m10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, m10);
        }
        L l5 = this.f42517c;
        return l5 != null ? CodedOutputByteBufferNano.computeMessageSize(3, l5) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        K k10 = this.f42515a;
        if (k10 != null) {
            codedOutputByteBufferNano.writeMessage(1, k10);
        }
        M m10 = this.f42516b;
        if (m10 != null) {
            codedOutputByteBufferNano.writeMessage(2, m10);
        }
        L l5 = this.f42517c;
        if (l5 != null) {
            codedOutputByteBufferNano.writeMessage(3, l5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f42515a == null) {
                    this.f42515a = new K();
                }
                codedInputByteBufferNano.readMessage(this.f42515a);
            } else if (tag == 18) {
                if (this.f42516b == null) {
                    this.f42516b = new M();
                }
                codedInputByteBufferNano.readMessage(this.f42516b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f42517c == null) {
                    this.f42517c = new L();
                }
                codedInputByteBufferNano.readMessage(this.f42517c);
            }
        }
        return this;
    }

    public static N b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new N().mergeFrom(codedInputByteBufferNano);
    }

    public static N a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (N) MessageNano.mergeFrom(new N(), bArr);
    }
}
