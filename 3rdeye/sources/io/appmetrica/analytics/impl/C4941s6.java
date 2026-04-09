package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.s6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4941s6 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C4941s6[] f41619g;

    /* renamed from: a, reason: collision with root package name */
    public String f41620a;

    /* renamed from: b, reason: collision with root package name */
    public String f41621b;

    /* renamed from: c, reason: collision with root package name */
    public int f41622c;

    /* renamed from: d, reason: collision with root package name */
    public String f41623d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41624e;

    /* renamed from: f, reason: collision with root package name */
    public int f41625f;

    public C4941s6() {
        a();
    }

    public static C4941s6[] b() {
        if (f41619g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41619g == null) {
                        f41619g = new C4941s6[0];
                    }
                } finally {
                }
            }
        }
        return f41619g;
    }

    public final C4941s6 a() {
        this.f41620a = "";
        this.f41621b = "";
        this.f41622c = -1;
        this.f41623d = "";
        this.f41624e = false;
        this.f41625f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f41620a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f41620a);
        }
        if (!this.f41621b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f41621b);
        }
        int i = this.f41622c;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i);
        }
        if (!this.f41623d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f41623d);
        }
        boolean z10 = this.f41624e;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z10);
        }
        int i10 = this.f41625f;
        return i10 != -1 ? CodedOutputByteBufferNano.computeSInt32Size(6, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f41620a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f41620a);
        }
        if (!this.f41621b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f41621b);
        }
        int i = this.f41622c;
        if (i != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i);
        }
        if (!this.f41623d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f41623d);
        }
        boolean z10 = this.f41624e;
        if (z10) {
            codedOutputByteBufferNano.writeBool(5, z10);
        }
        int i10 = this.f41625f;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4941s6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4941s6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4941s6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f41620a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f41621b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f41622c = codedInputByteBufferNano.readSInt32();
            } else if (tag == 34) {
                this.f41623d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f41624e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f41625f = codedInputByteBufferNano.readSInt32();
            }
        }
        return this;
    }

    public static C4941s6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4941s6) MessageNano.mergeFrom(new C4941s6(), bArr);
    }
}
