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
public final class F7 extends MessageNano {

    /* renamed from: s, reason: collision with root package name */
    public static volatile F7[] f39413s;

    /* renamed from: a, reason: collision with root package name */
    public int f39414a;

    /* renamed from: b, reason: collision with root package name */
    public String f39415b;

    /* renamed from: c, reason: collision with root package name */
    public String f39416c;

    /* renamed from: d, reason: collision with root package name */
    public long f39417d;

    /* renamed from: e, reason: collision with root package name */
    public G7 f39418e;

    /* renamed from: f, reason: collision with root package name */
    public String f39419f;

    /* renamed from: g, reason: collision with root package name */
    public String f39420g;

    /* renamed from: h, reason: collision with root package name */
    public long f39421h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f39422j;

    /* renamed from: k, reason: collision with root package name */
    public String f39423k;

    /* renamed from: l, reason: collision with root package name */
    public int f39424l;

    /* renamed from: m, reason: collision with root package name */
    public String f39425m;

    /* renamed from: n, reason: collision with root package name */
    public int f39426n;

    /* renamed from: o, reason: collision with root package name */
    public int f39427o;

    /* renamed from: p, reason: collision with root package name */
    public int f39428p;

    /* renamed from: q, reason: collision with root package name */
    public int f39429q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f39430r;

    public F7() {
        a();
    }

    public static F7[] b() {
        if (f39413s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39413s == null) {
                        f39413s = new F7[0];
                    }
                } finally {
                }
            }
        }
        return f39413s;
    }

    public final F7 a() {
        this.f39414a = -1;
        this.f39415b = "";
        this.f39416c = "";
        this.f39417d = -1L;
        this.f39418e = null;
        this.f39419f = "";
        this.f39420g = "";
        this.f39421h = -1L;
        this.i = -1;
        this.f39422j = -1;
        this.f39423k = "";
        this.f39424l = -1;
        this.f39425m = "";
        this.f39426n = -1;
        this.f39427o = -1;
        this.f39428p = -1;
        this.f39429q = -1;
        this.f39430r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f39414a;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        if (!this.f39415b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f39415b);
        }
        if (!this.f39416c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f39416c);
        }
        long j4 = this.f39417d;
        if (j4 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j4);
        }
        G7 g72 = this.f39418e;
        if (g72 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, g72);
        }
        if (!this.f39419f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f39419f);
        }
        if (!this.f39420g.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f39420g);
        }
        long j10 = this.f39421h;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j10);
        }
        int i10 = this.i;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i10);
        }
        int i11 = this.f39422j;
        if (i11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i11);
        }
        if (!this.f39423k.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f39423k);
        }
        int i12 = this.f39424l;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i12);
        }
        if (!this.f39425m.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f39425m);
        }
        int i13 = this.f39426n;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i13);
        }
        int i14 = this.f39427o;
        if (i14 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i14);
        }
        int i15 = this.f39428p;
        if (i15 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i15);
        }
        int i16 = this.f39429q;
        if (i16 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i16);
        }
        return !Arrays.equals(this.f39430r, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(18, this.f39430r) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f39414a;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!this.f39415b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f39415b);
        }
        if (!this.f39416c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f39416c);
        }
        long j4 = this.f39417d;
        if (j4 != -1) {
            codedOutputByteBufferNano.writeInt64(4, j4);
        }
        G7 g72 = this.f39418e;
        if (g72 != null) {
            codedOutputByteBufferNano.writeMessage(5, g72);
        }
        if (!this.f39419f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f39419f);
        }
        if (!this.f39420g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f39420g);
        }
        long j10 = this.f39421h;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j10);
        }
        int i10 = this.i;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i10);
        }
        int i11 = this.f39422j;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i11);
        }
        if (!this.f39423k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f39423k);
        }
        int i12 = this.f39424l;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i12);
        }
        if (!this.f39425m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f39425m);
        }
        int i13 = this.f39426n;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i13);
        }
        int i14 = this.f39427o;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i14);
        }
        int i15 = this.f39428p;
        if (i15 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i15);
        }
        int i16 = this.f39429q;
        if (i16 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i16);
        }
        if (!Arrays.equals(this.f39430r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f39430r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static F7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new F7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f39414a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f39415b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    this.f39416c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f39417d = codedInputByteBufferNano.readInt64();
                    break;
                case 42:
                    if (this.f39418e == null) {
                        this.f39418e = new G7();
                    }
                    codedInputByteBufferNano.readMessage(this.f39418e);
                    break;
                case 50:
                    this.f39419f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f39420g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.f39421h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f39422j = codedInputByteBufferNano.readInt32();
                    break;
                case 90:
                    this.f39423k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f39424l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f39425m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f39426n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f39427o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.f39428p = int32;
                        break;
                    }
                    break;
                case 136:
                    this.f39429q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f39430r = codedInputByteBufferNano.readBytes();
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

    public static F7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (F7) MessageNano.mergeFrom(new F7(), bArr);
    }
}
