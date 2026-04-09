package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.im, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4698im extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C4698im[] f41091b;

    /* renamed from: a, reason: collision with root package name */
    public String f41092a;

    public C4698im() {
        a();
    }

    public static C4698im[] b() {
        if (f41091b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41091b == null) {
                        f41091b = new C4698im[0];
                    }
                } finally {
                }
            }
        }
        return f41091b;
    }

    public final C4698im a() {
        this.f41092a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !this.f41092a.equals("") ? CodedOutputByteBufferNano.computeStringSize(1, this.f41092a) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f41092a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f41092a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4698im mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f41092a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C4698im a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4698im) MessageNano.mergeFrom(new C4698im(), bArr);
    }

    public static C4698im b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4698im().mergeFrom(codedInputByteBufferNano);
    }
}
