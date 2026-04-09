package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4880pm extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C4880pm[] f41434g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f41435a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41436b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41437c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41438d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41439e;

    /* renamed from: f, reason: collision with root package name */
    public int f41440f;

    public C4880pm() {
        a();
    }

    public static C4880pm[] b() {
        if (f41434g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41434g == null) {
                        f41434g = new C4880pm[0];
                    }
                } finally {
                }
            }
        }
        return f41434g;
    }

    public final C4880pm a() {
        this.f41435a = false;
        this.f41436b = false;
        this.f41437c = false;
        this.f41438d = false;
        this.f41439e = false;
        this.f41440f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f41438d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f41437c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f41436b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f41435a) + super.computeSerializedSize();
        boolean z10 = this.f41439e;
        if (z10) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z10);
        }
        int i = this.f41440f;
        return i != -1 ? CodedOutputByteBufferNano.computeInt32Size(6, i) + iComputeBoolSize : iComputeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f41435a);
        codedOutputByteBufferNano.writeBool(2, this.f41436b);
        codedOutputByteBufferNano.writeBool(3, this.f41437c);
        codedOutputByteBufferNano.writeBool(4, this.f41438d);
        boolean z10 = this.f41439e;
        if (z10) {
            codedOutputByteBufferNano.writeBool(5, z10);
        }
        int i = this.f41440f;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(6, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4880pm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4880pm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4880pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f41435a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f41436b = codedInputByteBufferNano.readBool();
            } else if (tag == 24) {
                this.f41437c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f41438d = codedInputByteBufferNano.readBool();
            } else if (tag == 40) {
                this.f41439e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f41440f = int32;
                }
            }
        }
        return this;
    }

    public static C4880pm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4880pm) MessageNano.mergeFrom(new C4880pm(), bArr);
    }
}
