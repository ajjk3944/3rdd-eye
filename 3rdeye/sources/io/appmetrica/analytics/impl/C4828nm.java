package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4828nm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4828nm[] f41316c;

    /* renamed from: a, reason: collision with root package name */
    public String f41317a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f41318b;

    public C4828nm() {
        a();
    }

    public static C4828nm[] b() {
        if (f41316c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41316c == null) {
                        f41316c = new C4828nm[0];
                    }
                } finally {
                }
            }
        }
        return f41316c;
    }

    public final C4828nm a() {
        this.f41317a = "";
        this.f41318b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f41317a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f41317a);
        }
        String[] strArr = this.f41318b;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i = 0;
        int iComputeStringSizeNoTag = 0;
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f41318b;
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
        if (!this.f41317a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f41317a);
        }
        String[] strArr = this.f41318b;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f41318b;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4828nm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f41317a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f41318b;
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
                this.f41318b = strArr2;
            }
        }
        return this;
    }

    public static C4828nm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4828nm().mergeFrom(codedInputByteBufferNano);
    }

    public static C4828nm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4828nm) MessageNano.mergeFrom(new C4828nm(), bArr);
    }
}
