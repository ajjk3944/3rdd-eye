package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.km, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4750km extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C4750km[] f41156b;

    /* renamed from: a, reason: collision with root package name */
    public C4724jm[] f41157a;

    public C4750km() {
        a();
    }

    public static C4750km[] b() {
        if (f41156b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41156b == null) {
                        f41156b = new C4750km[0];
                    }
                } finally {
                }
            }
        }
        return f41156b;
    }

    public final C4750km a() {
        this.f41157a = C4724jm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4724jm[] c4724jmArr = this.f41157a;
        if (c4724jmArr != null && c4724jmArr.length > 0) {
            int i = 0;
            while (true) {
                C4724jm[] c4724jmArr2 = this.f41157a;
                if (i >= c4724jmArr2.length) {
                    break;
                }
                C4724jm c4724jm = c4724jmArr2[i];
                if (c4724jm != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c4724jm) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4724jm[] c4724jmArr = this.f41157a;
        if (c4724jmArr != null && c4724jmArr.length > 0) {
            int i = 0;
            while (true) {
                C4724jm[] c4724jmArr2 = this.f41157a;
                if (i >= c4724jmArr2.length) {
                    break;
                }
                C4724jm c4724jm = c4724jmArr2[i];
                if (c4724jm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4724jm);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4750km mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C4724jm[] c4724jmArr = this.f41157a;
                int length = c4724jmArr == null ? 0 : c4724jmArr.length;
                int i = repeatedFieldArrayLength + length;
                C4724jm[] c4724jmArr2 = new C4724jm[i];
                if (length != 0) {
                    System.arraycopy(c4724jmArr, 0, c4724jmArr2, 0, length);
                }
                while (length < i - 1) {
                    C4724jm c4724jm = new C4724jm();
                    c4724jmArr2[length] = c4724jm;
                    codedInputByteBufferNano.readMessage(c4724jm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4724jm c4724jm2 = new C4724jm();
                c4724jmArr2[length] = c4724jm2;
                codedInputByteBufferNano.readMessage(c4724jm2);
                this.f41157a = c4724jmArr2;
            }
        }
        return this;
    }

    public static C4750km b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4750km().mergeFrom(codedInputByteBufferNano);
    }

    public static C4750km a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4750km) MessageNano.mergeFrom(new C4750km(), bArr);
    }
}
