package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Wi extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f40341l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f40342m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f40343n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f40344o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f40345p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static volatile Wi[] f40346q;

    /* renamed from: a, reason: collision with root package name */
    public int f40347a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f40348b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f40349c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f40350d;

    /* renamed from: e, reason: collision with root package name */
    public Ri f40351e;

    /* renamed from: f, reason: collision with root package name */
    public long f40352f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40353g;

    /* renamed from: h, reason: collision with root package name */
    public int f40354h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Vi f40355j;

    /* renamed from: k, reason: collision with root package name */
    public Ui f40356k;

    public Wi() {
        a();
    }

    public static Wi[] b() {
        if (f40346q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40346q == null) {
                        f40346q = new Wi[0];
                    }
                } finally {
                }
            }
        }
        return f40346q;
    }

    public final Wi a() {
        this.f40347a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f40348b = bArr;
        this.f40349c = bArr;
        this.f40350d = bArr;
        this.f40351e = null;
        this.f40352f = 0L;
        this.f40353g = false;
        this.f40354h = 0;
        this.i = 1;
        this.f40355j = null;
        this.f40356k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f40347a;
        if (i != 1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f40348b) + iComputeSerializedSize;
        byte[] bArr = this.f40349c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f40349c);
        }
        if (!Arrays.equals(this.f40350d, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f40350d);
        }
        Ri ri = this.f40351e;
        if (ri != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, ri);
        }
        long j4 = this.f40352f;
        if (j4 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j4);
        }
        boolean z10 = this.f40353g;
        if (z10) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z10);
        }
        int i10 = this.f40354h;
        if (i10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i10);
        }
        int i11 = this.i;
        if (i11 != 1) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i11);
        }
        Vi vi = this.f40355j;
        if (vi != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, vi);
        }
        Ui ui = this.f40356k;
        return ui != null ? CodedOutputByteBufferNano.computeMessageSize(12, ui) + iComputeBytesSize : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f40347a;
        if (i != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f40348b);
        byte[] bArr = this.f40349c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f40349c);
        }
        if (!Arrays.equals(this.f40350d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f40350d);
        }
        Ri ri = this.f40351e;
        if (ri != null) {
            codedOutputByteBufferNano.writeMessage(6, ri);
        }
        long j4 = this.f40352f;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j4);
        }
        boolean z10 = this.f40353g;
        if (z10) {
            codedOutputByteBufferNano.writeBool(8, z10);
        }
        int i10 = this.f40354h;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i10);
        }
        int i11 = this.i;
        if (i11 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i11);
        }
        Vi vi = this.f40355j;
        if (vi != null) {
            codedOutputByteBufferNano.writeMessage(11, vi);
        }
        Ui ui = this.f40356k;
        if (ui != null) {
            codedOutputByteBufferNano.writeMessage(12, ui);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Wi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Wi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Wi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f40347a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f40348b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f40349c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.f40350d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f40351e == null) {
                        this.f40351e = new Ri();
                    }
                    codedInputByteBufferNano.readMessage(this.f40351e);
                    break;
                case 56:
                    this.f40352f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f40353g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != 0 && int32 != 1 && int32 != 2) {
                        break;
                    } else {
                        this.f40354h = int32;
                        break;
                    }
                    break;
                case 80:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != 1 && int322 != 2) {
                        break;
                    } else {
                        this.i = int322;
                        break;
                    }
                    break;
                case 90:
                    if (this.f40355j == null) {
                        this.f40355j = new Vi();
                    }
                    codedInputByteBufferNano.readMessage(this.f40355j);
                    break;
                case 98:
                    if (this.f40356k == null) {
                        this.f40356k = new Ui();
                    }
                    codedInputByteBufferNano.readMessage(this.f40356k);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    public static Wi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Wi) MessageNano.mergeFrom(new Wi(), bArr);
    }
}
