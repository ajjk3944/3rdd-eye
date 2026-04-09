package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class L extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile L[] f42507d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f42508a;

    /* renamed from: b, reason: collision with root package name */
    public long f42509b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f42510c;

    public L() {
        a();
    }

    public static L[] b() {
        if (f42507d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42507d == null) {
                        f42507d = new L[0];
                    }
                } finally {
                }
            }
        }
        return f42507d;
    }

    public final L a() {
        this.f42508a = true;
        this.f42509b = 5L;
        this.f42510c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f42508a;
        if (!z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        long j4 = this.f42509b;
        if (j4 != 5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j4);
        }
        String[] strArr = this.f42510c;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i = 0;
        int iComputeStringSizeNoTag = 0;
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f42510c;
            if (i >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i10;
            }
            String str = strArr2[i];
            if (str != null) {
                i10++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f42508a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        long j4 = this.f42509b;
        if (j4 != 5) {
            codedOutputByteBufferNano.writeInt64(2, j4);
        }
        String[] strArr = this.f42510c;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f42510c;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f42508a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f42509b = codedInputByteBufferNano.readInt64();
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f42510c;
                int length = strArr == null ? 0 : strArr.length;
                int i = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[i];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f42510c = strArr2;
            }
        }
        return this;
    }

    public static L b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new L().mergeFrom(codedInputByteBufferNano);
    }

    public static L a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (L) MessageNano.mergeFrom(new L(), bArr);
    }
}
