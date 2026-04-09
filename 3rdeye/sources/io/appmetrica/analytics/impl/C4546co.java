package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.co, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4546co extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C4546co[] f40671b;

    /* renamed from: a, reason: collision with root package name */
    public Zn[] f40672a;

    public C4546co() {
        a();
    }

    public static C4546co[] b() {
        if (f40671b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40671b == null) {
                        f40671b = new C4546co[0];
                    }
                } finally {
                }
            }
        }
        return f40671b;
    }

    public final C4546co a() {
        this.f40672a = Zn.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        Zn[] znArr = this.f40672a;
        if (znArr != null && znArr.length > 0) {
            int i = 0;
            while (true) {
                Zn[] znArr2 = this.f40672a;
                if (i >= znArr2.length) {
                    break;
                }
                Zn zn = znArr2[i];
                if (zn != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, zn) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Zn[] znArr = this.f40672a;
        if (znArr != null && znArr.length > 0) {
            int i = 0;
            while (true) {
                Zn[] znArr2 = this.f40672a;
                if (i >= znArr2.length) {
                    break;
                }
                Zn zn = znArr2[i];
                if (zn != null) {
                    codedOutputByteBufferNano.writeMessage(1, zn);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4546co mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                Zn[] znArr = this.f40672a;
                int length = znArr == null ? 0 : znArr.length;
                int i = repeatedFieldArrayLength + length;
                Zn[] znArr2 = new Zn[i];
                if (length != 0) {
                    System.arraycopy(znArr, 0, znArr2, 0, length);
                }
                while (length < i - 1) {
                    Zn zn = new Zn();
                    znArr2[length] = zn;
                    codedInputByteBufferNano.readMessage(zn);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Zn zn2 = new Zn();
                znArr2[length] = zn2;
                codedInputByteBufferNano.readMessage(zn2);
                this.f40672a = znArr2;
            }
        }
        return this;
    }

    public static C4546co b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4546co().mergeFrom(codedInputByteBufferNano);
    }

    public static C4546co a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4546co) MessageNano.mergeFrom(new C4546co(), bArr);
    }
}
