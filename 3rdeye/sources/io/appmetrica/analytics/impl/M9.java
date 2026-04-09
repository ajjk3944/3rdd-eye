package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class M9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile M9[] f39852e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f39853a;

    /* renamed from: b, reason: collision with root package name */
    public int f39854b;

    /* renamed from: c, reason: collision with root package name */
    public int f39855c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f39856d;

    public M9() {
        a();
    }

    public static M9[] b() {
        if (f39852e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39852e == null) {
                        f39852e = new M9[0];
                    }
                } finally {
                }
            }
        }
        return f39852e;
    }

    public final M9 a() {
        this.f39853a = false;
        this.f39854b = 0;
        this.f39855c = 0;
        this.f39856d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f39855c) + CodedOutputByteBufferNano.computeUInt32Size(2, this.f39854b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f39853a) + super.computeSerializedSize();
        int[] iArr = this.f39856d;
        if (iArr == null || iArr.length <= 0) {
            return iComputeUInt32Size;
        }
        int i = 0;
        int iComputeInt32SizeNoTag = 0;
        while (true) {
            int[] iArr2 = this.f39856d;
            if (i >= iArr2.length) {
                return iComputeUInt32Size + iComputeInt32SizeNoTag + iArr2.length;
            }
            iComputeInt32SizeNoTag += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i]);
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f39853a);
        codedOutputByteBufferNano.writeUInt32(2, this.f39854b);
        codedOutputByteBufferNano.writeUInt32(3, this.f39855c);
        int[] iArr = this.f39856d;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.f39856d;
                if (i >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, iArr2[i]);
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final M9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f39853a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f39854b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 24) {
                this.f39855c = codedInputByteBufferNano.readUInt32();
            } else if (tag == 32) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] iArr = this.f39856d;
                int length = iArr == null ? 0 : iArr.length;
                int i = repeatedFieldArrayLength + length;
                int[] iArr2 = new int[i];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i - 1) {
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                iArr2[length] = codedInputByteBufferNano.readInt32();
                this.f39856d = iArr2;
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i10 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    i10++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f39856d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i11 = i10 + length2;
                int[] iArr4 = new int[i11];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i11) {
                    iArr4[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f39856d = iArr4;
                codedInputByteBufferNano.popLimit(iPushLimit);
            }
        }
        return this;
    }

    public static M9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new M9().mergeFrom(codedInputByteBufferNano);
    }

    public static M9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (M9) MessageNano.mergeFrom(new M9(), bArr);
    }
}
