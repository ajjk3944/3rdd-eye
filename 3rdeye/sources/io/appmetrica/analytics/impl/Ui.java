package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class Ui extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Ui[] f40244d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f40245a;

    /* renamed from: b, reason: collision with root package name */
    public Ti f40246b;

    /* renamed from: c, reason: collision with root package name */
    public Si f40247c;

    public Ui() {
        a();
    }

    public static Ui[] b() {
        if (f40244d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40244d == null) {
                        f40244d = new Ui[0];
                    }
                } finally {
                }
            }
        }
        return f40244d;
    }

    public final Ui a() {
        this.f40245a = false;
        this.f40246b = null;
        this.f40247c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f40245a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        Ti ti = this.f40246b;
        if (ti != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ti);
        }
        Si si = this.f40247c;
        return si != null ? CodedOutputByteBufferNano.computeMessageSize(3, si) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f40245a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        Ti ti = this.f40246b;
        if (ti != null) {
            codedOutputByteBufferNano.writeMessage(2, ti);
        }
        Si si = this.f40247c;
        if (si != null) {
            codedOutputByteBufferNano.writeMessage(3, si);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ui mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f40245a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f40246b == null) {
                    this.f40246b = new Ti();
                }
                codedInputByteBufferNano.readMessage(this.f40246b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f40247c == null) {
                    this.f40247c = new Si();
                }
                codedInputByteBufferNano.readMessage(this.f40247c);
            }
        }
        return this;
    }

    public static Ui b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ui().mergeFrom(codedInputByteBufferNano);
    }

    public static Ui a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ui) MessageNano.mergeFrom(new Ui(), bArr);
    }
}
