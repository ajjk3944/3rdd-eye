package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class K extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile K[] f42505b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f42506a;

    public K() {
        a();
    }

    public static K[] b() {
        if (f42505b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42505b == null) {
                        f42505b = new K[0];
                    }
                } finally {
                }
            }
        }
        return f42505b;
    }

    public final K a() {
        this.f42506a = true;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f42506a;
        return !z10 ? CodedOutputByteBufferNano.computeBoolSize(1, z10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f42506a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f42506a = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static K a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (K) MessageNano.mergeFrom(new K(), bArr);
    }

    public static K b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new K().mergeFrom(codedInputByteBufferNano);
    }
}
