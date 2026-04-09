package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.u6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4992u6 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C4992u6[] f41708f;

    /* renamed from: a, reason: collision with root package name */
    public String f41709a;

    /* renamed from: b, reason: collision with root package name */
    public String f41710b;

    /* renamed from: c, reason: collision with root package name */
    public C4941s6[] f41711c;

    /* renamed from: d, reason: collision with root package name */
    public C4992u6 f41712d;

    /* renamed from: e, reason: collision with root package name */
    public C4992u6[] f41713e;

    public C4992u6() {
        a();
    }

    public static C4992u6[] b() {
        if (f41708f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41708f == null) {
                        f41708f = new C4992u6[0];
                    }
                } finally {
                }
            }
        }
        return f41708f;
    }

    public final C4992u6 a() {
        this.f41709a = "";
        this.f41710b = "";
        this.f41711c = C4941s6.b();
        this.f41712d = null;
        this.f41713e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f41709a) + super.computeSerializedSize();
        if (!this.f41710b.equals("")) {
            iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f41710b);
        }
        C4941s6[] c4941s6Arr = this.f41711c;
        int i = 0;
        if (c4941s6Arr != null && c4941s6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4941s6[] c4941s6Arr2 = this.f41711c;
                if (i10 >= c4941s6Arr2.length) {
                    break;
                }
                C4941s6 c4941s6 = c4941s6Arr2[i10];
                if (c4941s6 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c4941s6) + iComputeStringSize;
                }
                i10++;
            }
        }
        C4992u6 c4992u6 = this.f41712d;
        if (c4992u6 != null) {
            iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c4992u6);
        }
        C4992u6[] c4992u6Arr = this.f41713e;
        if (c4992u6Arr != null && c4992u6Arr.length > 0) {
            while (true) {
                C4992u6[] c4992u6Arr2 = this.f41713e;
                if (i >= c4992u6Arr2.length) {
                    break;
                }
                C4992u6 c4992u62 = c4992u6Arr2[i];
                if (c4992u62 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c4992u62) + iComputeStringSize;
                }
                i++;
            }
        }
        return iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f41709a);
        if (!this.f41710b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f41710b);
        }
        C4941s6[] c4941s6Arr = this.f41711c;
        int i = 0;
        if (c4941s6Arr != null && c4941s6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4941s6[] c4941s6Arr2 = this.f41711c;
                if (i10 >= c4941s6Arr2.length) {
                    break;
                }
                C4941s6 c4941s6 = c4941s6Arr2[i10];
                if (c4941s6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c4941s6);
                }
                i10++;
            }
        }
        C4992u6 c4992u6 = this.f41712d;
        if (c4992u6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4992u6);
        }
        C4992u6[] c4992u6Arr = this.f41713e;
        if (c4992u6Arr != null && c4992u6Arr.length > 0) {
            while (true) {
                C4992u6[] c4992u6Arr2 = this.f41713e;
                if (i >= c4992u6Arr2.length) {
                    break;
                }
                C4992u6 c4992u62 = c4992u6Arr2[i];
                if (c4992u62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c4992u62);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4992u6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4992u6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4992u6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f41709a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f41710b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C4941s6[] c4941s6Arr = this.f41711c;
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
                this.f41711c = c4941s6Arr2;
            } else if (tag == 34) {
                if (this.f41712d == null) {
                    this.f41712d = new C4992u6();
                }
                codedInputByteBufferNano.readMessage(this.f41712d);
            } else if (tag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C4992u6[] c4992u6Arr = this.f41713e;
                int length2 = c4992u6Arr == null ? 0 : c4992u6Arr.length;
                int i10 = repeatedFieldArrayLength2 + length2;
                C4992u6[] c4992u6Arr2 = new C4992u6[i10];
                if (length2 != 0) {
                    System.arraycopy(c4992u6Arr, 0, c4992u6Arr2, 0, length2);
                }
                while (length2 < i10 - 1) {
                    C4992u6 c4992u6 = new C4992u6();
                    c4992u6Arr2[length2] = c4992u6;
                    codedInputByteBufferNano.readMessage(c4992u6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C4992u6 c4992u62 = new C4992u6();
                c4992u6Arr2[length2] = c4992u62;
                codedInputByteBufferNano.readMessage(c4992u62);
                this.f41713e = c4992u6Arr2;
            }
        }
        return this;
    }

    public static C4992u6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4992u6) MessageNano.mergeFrom(new C4992u6(), bArr);
    }
}
