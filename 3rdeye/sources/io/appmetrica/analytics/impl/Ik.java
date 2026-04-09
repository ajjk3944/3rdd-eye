package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class Ik extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Ik[] f39649b;

    /* renamed from: a, reason: collision with root package name */
    public Jk[] f39650a;

    public Ik() {
        a();
    }

    public static Ik[] b() {
        if (f39649b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39649b == null) {
                        f39649b = new Ik[0];
                    }
                } finally {
                }
            }
        }
        return f39649b;
    }

    public final Ik a() {
        this.f39650a = Jk.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        Jk[] jkArr = this.f39650a;
        if (jkArr != null && jkArr.length > 0) {
            int i = 0;
            while (true) {
                Jk[] jkArr2 = this.f39650a;
                if (i >= jkArr2.length) {
                    break;
                }
                Jk jk = jkArr2[i];
                if (jk != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, jk) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Jk[] jkArr = this.f39650a;
        if (jkArr != null && jkArr.length > 0) {
            int i = 0;
            while (true) {
                Jk[] jkArr2 = this.f39650a;
                if (i >= jkArr2.length) {
                    break;
                }
                Jk jk = jkArr2[i];
                if (jk != null) {
                    codedOutputByteBufferNano.writeMessage(1, jk);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ik mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                Jk[] jkArr = this.f39650a;
                int length = jkArr == null ? 0 : jkArr.length;
                int i = repeatedFieldArrayLength + length;
                Jk[] jkArr2 = new Jk[i];
                if (length != 0) {
                    System.arraycopy(jkArr, 0, jkArr2, 0, length);
                }
                while (length < i - 1) {
                    Jk jk = new Jk();
                    jkArr2[length] = jk;
                    codedInputByteBufferNano.readMessage(jk);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Jk jk2 = new Jk();
                jkArr2[length] = jk2;
                codedInputByteBufferNano.readMessage(jk2);
                this.f39650a = jkArr2;
            }
        }
        return this;
    }

    public static Ik b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ik().mergeFrom(codedInputByteBufferNano);
    }

    public static Ik a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ik) MessageNano.mergeFrom(new Ik(), bArr);
    }
}
