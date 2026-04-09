package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.jm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4724jm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4724jm[] f41122c;

    /* renamed from: a, reason: collision with root package name */
    public String f41123a;

    /* renamed from: b, reason: collision with root package name */
    public C4698im f41124b;

    public C4724jm() {
        a();
    }

    public static C4724jm[] b() {
        if (f41122c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41122c == null) {
                        f41122c = new C4724jm[0];
                    }
                } finally {
                }
            }
        }
        return f41122c;
    }

    public final C4724jm a() {
        this.f41123a = "";
        this.f41124b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f41123a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f41123a);
        }
        C4698im c4698im = this.f41124b;
        return c4698im != null ? CodedOutputByteBufferNano.computeMessageSize(2, c4698im) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f41123a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f41123a);
        }
        C4698im c4698im = this.f41124b;
        if (c4698im != null) {
            codedOutputByteBufferNano.writeMessage(2, c4698im);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4724jm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f41123a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f41124b == null) {
                    this.f41124b = new C4698im();
                }
                codedInputByteBufferNano.readMessage(this.f41124b);
            }
        }
        return this;
    }

    public static C4724jm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4724jm().mergeFrom(codedInputByteBufferNano);
    }

    public static C4724jm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4724jm) MessageNano.mergeFrom(new C4724jm(), bArr);
    }
}
