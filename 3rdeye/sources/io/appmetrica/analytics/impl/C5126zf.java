package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5126zf extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f42181c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f42182d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f42183e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f42184f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C5126zf[] f42185g;

    /* renamed from: a, reason: collision with root package name */
    public C5076xf f42186a;

    /* renamed from: b, reason: collision with root package name */
    public C5101yf[] f42187b;

    public C5126zf() {
        a();
    }

    public static C5126zf[] b() {
        if (f42185g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42185g == null) {
                        f42185g = new C5126zf[0];
                    }
                } finally {
                }
            }
        }
        return f42185g;
    }

    public final C5126zf a() {
        this.f42186a = null;
        this.f42187b = C5101yf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5076xf c5076xf = this.f42186a;
        if (c5076xf != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5076xf);
        }
        C5101yf[] c5101yfArr = this.f42187b;
        if (c5101yfArr != null && c5101yfArr.length > 0) {
            int i = 0;
            while (true) {
                C5101yf[] c5101yfArr2 = this.f42187b;
                if (i >= c5101yfArr2.length) {
                    break;
                }
                C5101yf c5101yf = c5101yfArr2[i];
                if (c5101yf != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c5101yf) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5076xf c5076xf = this.f42186a;
        if (c5076xf != null) {
            codedOutputByteBufferNano.writeMessage(1, c5076xf);
        }
        C5101yf[] c5101yfArr = this.f42187b;
        if (c5101yfArr != null && c5101yfArr.length > 0) {
            int i = 0;
            while (true) {
                C5101yf[] c5101yfArr2 = this.f42187b;
                if (i >= c5101yfArr2.length) {
                    break;
                }
                C5101yf c5101yf = c5101yfArr2[i];
                if (c5101yf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c5101yf);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5126zf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f42186a == null) {
                    this.f42186a = new C5076xf();
                }
                codedInputByteBufferNano.readMessage(this.f42186a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C5101yf[] c5101yfArr = this.f42187b;
                int length = c5101yfArr == null ? 0 : c5101yfArr.length;
                int i = repeatedFieldArrayLength + length;
                C5101yf[] c5101yfArr2 = new C5101yf[i];
                if (length != 0) {
                    System.arraycopy(c5101yfArr, 0, c5101yfArr2, 0, length);
                }
                while (length < i - 1) {
                    C5101yf c5101yf = new C5101yf();
                    c5101yfArr2[length] = c5101yf;
                    codedInputByteBufferNano.readMessage(c5101yf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5101yf c5101yf2 = new C5101yf();
                c5101yfArr2[length] = c5101yf2;
                codedInputByteBufferNano.readMessage(c5101yf2);
                this.f42187b = c5101yfArr2;
            }
        }
        return this;
    }

    public static C5126zf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5126zf().mergeFrom(codedInputByteBufferNano);
    }

    public static C5126zf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5126zf) MessageNano.mergeFrom(new C5126zf(), bArr);
    }
}
