package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.y9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5095y9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f42117d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f42118e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f42119f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f42120g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f42121h = 4;
    public static final int i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f42122j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f42123k = 7;

    /* renamed from: l, reason: collision with root package name */
    public static final int f42124l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final int f42125m = 9;

    /* renamed from: n, reason: collision with root package name */
    public static final int f42126n = 10;

    /* renamed from: o, reason: collision with root package name */
    public static final int f42127o = 11;

    /* renamed from: p, reason: collision with root package name */
    public static final int f42128p = 12;

    /* renamed from: q, reason: collision with root package name */
    public static volatile C5095y9[] f42129q;

    /* renamed from: a, reason: collision with root package name */
    public long f42130a;

    /* renamed from: b, reason: collision with root package name */
    public C5070x9 f42131b;

    /* renamed from: c, reason: collision with root package name */
    public C5045w9[] f42132c;

    public C5095y9() {
        a();
    }

    public static C5095y9[] b() {
        if (f42129q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42129q == null) {
                        f42129q = new C5095y9[0];
                    }
                } finally {
                }
            }
        }
        return f42129q;
    }

    public final C5095y9 a() {
        this.f42130a = 0L;
        this.f42131b = null;
        this.f42132c = C5045w9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f42130a) + super.computeSerializedSize();
        C5070x9 c5070x9 = this.f42131b;
        if (c5070x9 != null) {
            iComputeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c5070x9);
        }
        C5045w9[] c5045w9Arr = this.f42132c;
        if (c5045w9Arr != null && c5045w9Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5045w9[] c5045w9Arr2 = this.f42132c;
                if (i10 >= c5045w9Arr2.length) {
                    break;
                }
                C5045w9 c5045w9 = c5045w9Arr2[i10];
                if (c5045w9 != null) {
                    iComputeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c5045w9) + iComputeUInt64Size;
                }
                i10++;
            }
        }
        return iComputeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f42130a);
        C5070x9 c5070x9 = this.f42131b;
        if (c5070x9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5070x9);
        }
        C5045w9[] c5045w9Arr = this.f42132c;
        if (c5045w9Arr != null && c5045w9Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C5045w9[] c5045w9Arr2 = this.f42132c;
                if (i10 >= c5045w9Arr2.length) {
                    break;
                }
                C5045w9 c5045w9 = c5045w9Arr2[i10];
                if (c5045w9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c5045w9);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5095y9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f42130a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 18) {
                if (this.f42131b == null) {
                    this.f42131b = new C5070x9();
                }
                codedInputByteBufferNano.readMessage(this.f42131b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C5045w9[] c5045w9Arr = this.f42132c;
                int length = c5045w9Arr == null ? 0 : c5045w9Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5045w9[] c5045w9Arr2 = new C5045w9[i10];
                if (length != 0) {
                    System.arraycopy(c5045w9Arr, 0, c5045w9Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5045w9 c5045w9 = new C5045w9();
                    c5045w9Arr2[length] = c5045w9;
                    codedInputByteBufferNano.readMessage(c5045w9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5045w9 c5045w92 = new C5045w9();
                c5045w9Arr2[length] = c5045w92;
                codedInputByteBufferNano.readMessage(c5045w92);
                this.f42132c = c5045w9Arr2;
            }
        }
        return this;
    }

    public static C5095y9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5095y9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5095y9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5095y9) MessageNano.mergeFrom(new C5095y9(), bArr);
    }
}
