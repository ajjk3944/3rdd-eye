package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class T3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f40148c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f40149d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f40150e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f40151f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile T3[] f40152g;

    /* renamed from: a, reason: collision with root package name */
    public Q3 f40153a;

    /* renamed from: b, reason: collision with root package name */
    public Q3[] f40154b;

    public T3() {
        a();
    }

    public static T3[] b() {
        if (f40152g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40152g == null) {
                        f40152g = new T3[0];
                    }
                } finally {
                }
            }
        }
        return f40152g;
    }

    public final T3 a() {
        this.f40153a = null;
        this.f40154b = Q3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        Q3 q32 = this.f40153a;
        if (q32 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, q32);
        }
        Q3[] q3Arr = this.f40154b;
        if (q3Arr != null && q3Arr.length > 0) {
            int i = 0;
            while (true) {
                Q3[] q3Arr2 = this.f40154b;
                if (i >= q3Arr2.length) {
                    break;
                }
                Q3 q33 = q3Arr2[i];
                if (q33 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, q33) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Q3 q32 = this.f40153a;
        if (q32 != null) {
            codedOutputByteBufferNano.writeMessage(1, q32);
        }
        Q3[] q3Arr = this.f40154b;
        if (q3Arr != null && q3Arr.length > 0) {
            int i = 0;
            while (true) {
                Q3[] q3Arr2 = this.f40154b;
                if (i >= q3Arr2.length) {
                    break;
                }
                Q3 q33 = q3Arr2[i];
                if (q33 != null) {
                    codedOutputByteBufferNano.writeMessage(2, q33);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f40153a == null) {
                    this.f40153a = new Q3();
                }
                codedInputByteBufferNano.readMessage(this.f40153a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                Q3[] q3Arr = this.f40154b;
                int length = q3Arr == null ? 0 : q3Arr.length;
                int i = repeatedFieldArrayLength + length;
                Q3[] q3Arr2 = new Q3[i];
                if (length != 0) {
                    System.arraycopy(q3Arr, 0, q3Arr2, 0, length);
                }
                while (length < i - 1) {
                    Q3 q32 = new Q3();
                    q3Arr2[length] = q32;
                    codedInputByteBufferNano.readMessage(q32);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Q3 q33 = new Q3();
                q3Arr2[length] = q33;
                codedInputByteBufferNano.readMessage(q33);
                this.f40154b = q3Arr2;
            }
        }
        return this;
    }

    public static T3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new T3().mergeFrom(codedInputByteBufferNano);
    }

    public static T3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (T3) MessageNano.mergeFrom(new T3(), bArr);
    }
}
