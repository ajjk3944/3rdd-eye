package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ao, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4494ao extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4494ao[] f40553c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f40554a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40555b;

    public C4494ao() {
        a();
    }

    public static C4494ao[] b() {
        if (f40553c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40553c == null) {
                        f40553c = new C4494ao[0];
                    }
                } finally {
                }
            }
        }
        return f40553c;
    }

    public final C4494ao a() {
        this.f40554a = false;
        this.f40555b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f40554a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        boolean z11 = this.f40555b;
        return z11 ? CodedOutputByteBufferNano.computeBoolSize(2, z11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f40554a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        boolean z11 = this.f40555b;
        if (z11) {
            codedOutputByteBufferNano.writeBool(2, z11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4494ao mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f40554a = codedInputByteBufferNano.readBool();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f40555b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C4494ao b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4494ao().mergeFrom(codedInputByteBufferNano);
    }

    public static C4494ao a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4494ao) MessageNano.mergeFrom(new C4494ao(), bArr);
    }
}
