package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.t6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4967t6 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C4967t6[] f41664g;

    /* renamed from: a, reason: collision with root package name */
    public String f41665a;

    /* renamed from: b, reason: collision with root package name */
    public int f41666b;

    /* renamed from: c, reason: collision with root package name */
    public long f41667c;

    /* renamed from: d, reason: collision with root package name */
    public String f41668d;

    /* renamed from: e, reason: collision with root package name */
    public int f41669e;

    /* renamed from: f, reason: collision with root package name */
    public C4941s6[] f41670f;

    public C4967t6() {
        a();
    }

    public static C4967t6[] b() {
        if (f41664g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41664g == null) {
                        f41664g = new C4967t6[0];
                    }
                } finally {
                }
            }
        }
        return f41664g;
    }

    public final C4967t6 a() {
        this.f41665a = "";
        this.f41666b = 0;
        this.f41667c = 0L;
        this.f41668d = "";
        this.f41669e = 0;
        this.f41670f = C4941s6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f41667c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f41666b) + CodedOutputByteBufferNano.computeStringSize(1, this.f41665a) + super.computeSerializedSize();
        if (!this.f41668d.equals("")) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f41668d);
        }
        int i = this.f41669e;
        if (i != 0) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i);
        }
        C4941s6[] c4941s6Arr = this.f41670f;
        if (c4941s6Arr != null && c4941s6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4941s6[] c4941s6Arr2 = this.f41670f;
                if (i10 >= c4941s6Arr2.length) {
                    break;
                }
                C4941s6 c4941s6 = c4941s6Arr2[i10];
                if (c4941s6 != null) {
                    iComputeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, c4941s6) + iComputeSInt64Size;
                }
                i10++;
            }
        }
        return iComputeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f41665a);
        codedOutputByteBufferNano.writeSInt32(2, this.f41666b);
        codedOutputByteBufferNano.writeSInt64(3, this.f41667c);
        if (!this.f41668d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f41668d);
        }
        int i = this.f41669e;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i);
        }
        C4941s6[] c4941s6Arr = this.f41670f;
        if (c4941s6Arr != null && c4941s6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4941s6[] c4941s6Arr2 = this.f41670f;
                if (i10 >= c4941s6Arr2.length) {
                    break;
                }
                C4941s6 c4941s6 = c4941s6Arr2[i10];
                if (c4941s6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c4941s6);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4967t6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4967t6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4967t6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f41665a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f41666b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f41667c = codedInputByteBufferNano.readSInt64();
            } else if (tag == 34) {
                this.f41668d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f41669e = codedInputByteBufferNano.readUInt32();
            } else if (tag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C4941s6[] c4941s6Arr = this.f41670f;
                int length = c4941s6Arr == null ? 0 : c4941s6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4941s6[] c4941s6Arr2 = new C4941s6[i];
                if (length != 0) {
                    System.arraycopy(c4941s6Arr, 0, c4941s6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4941s6 c4941s6 = new C4941s6();
                    c4941s6Arr2[length] = c4941s6;
                    codedInputByteBufferNano.readMessage(c4941s6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4941s6 c4941s62 = new C4941s6();
                c4941s6Arr2[length] = c4941s62;
                codedInputByteBufferNano.readMessage(c4941s62);
                this.f41670f = c4941s6Arr2;
            }
        }
        return this;
    }

    public static C4967t6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4967t6) MessageNano.mergeFrom(new C4967t6(), bArr);
    }
}
