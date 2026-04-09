package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class Tb extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile Tb[] f40170f;

    /* renamed from: a, reason: collision with root package name */
    public String f40171a;

    /* renamed from: b, reason: collision with root package name */
    public String f40172b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40173c;

    /* renamed from: d, reason: collision with root package name */
    public String f40174d;

    /* renamed from: e, reason: collision with root package name */
    public String f40175e;

    public Tb() {
        a();
    }

    public static Tb[] b() {
        if (f40170f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40170f == null) {
                        f40170f = new Tb[0];
                    }
                } finally {
                }
            }
        }
        return f40170f;
    }

    public final Tb a() {
        this.f40171a = "";
        this.f40172b = "";
        this.f40173c = false;
        this.f40174d = "";
        this.f40175e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f40171a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f40171a);
        }
        if (!this.f40172b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f40172b);
        }
        boolean z10 = this.f40173c;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z10);
        }
        if (!this.f40174d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f40174d);
        }
        return !this.f40175e.equals("") ? CodedOutputByteBufferNano.computeStringSize(26, this.f40175e) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f40171a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f40171a);
        }
        if (!this.f40172b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f40172b);
        }
        boolean z10 = this.f40173c;
        if (z10) {
            codedOutputByteBufferNano.writeBool(22, z10);
        }
        if (!this.f40174d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f40174d);
        }
        if (!this.f40175e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f40175e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Tb b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Tb().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Tb mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f40171a = codedInputByteBufferNano.readString();
            } else if (tag == 154) {
                this.f40172b = codedInputByteBufferNano.readString();
            } else if (tag == 176) {
                this.f40173c = codedInputByteBufferNano.readBool();
            } else if (tag == 202) {
                this.f40174d = codedInputByteBufferNano.readString();
            } else if (tag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f40175e = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Tb a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Tb) MessageNano.mergeFrom(new Tb(), bArr);
    }
}
