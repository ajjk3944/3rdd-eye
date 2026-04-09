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
public final class r extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f41503l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f41504m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f41505n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f41506o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f41507p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f41508q = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f41509r = 6;

    /* renamed from: s, reason: collision with root package name */
    public static final int f41510s = 7;

    /* renamed from: t, reason: collision with root package name */
    public static volatile r[] f41511t;

    /* renamed from: u, reason: collision with root package name */
    public static byte[] f41512u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile boolean f41513v;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f41514a;

    /* renamed from: b, reason: collision with root package name */
    public C4883q f41515b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f41516c;

    /* renamed from: d, reason: collision with root package name */
    public int f41517d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f41518e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f41519f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f41520g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f41521h;
    public byte[] i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f41522j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f41523k;

    public r() {
        if (!f41513v) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f41513v) {
                        f41512u = InternalNano.bytesDefaultValue("manual");
                        f41513v = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static r[] b() {
        if (f41511t == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41511t == null) {
                        f41511t = new r[0];
                    }
                } finally {
                }
            }
        }
        return f41511t;
    }

    public final r a() {
        this.f41514a = (byte[]) f41512u.clone();
        this.f41515b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f41516c = bArr;
        this.f41517d = 0;
        this.f41518e = bArr;
        this.f41519f = bArr;
        this.f41520g = bArr;
        this.f41521h = bArr;
        this.i = bArr;
        this.f41522j = bArr;
        this.f41523k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f41514a, f41512u)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f41514a);
        }
        C4883q c4883q = this.f41515b;
        if (c4883q != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4883q);
        }
        byte[] bArr = this.f41516c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f41516c);
        }
        int i = this.f41517d;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        if (!Arrays.equals(this.f41518e, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f41518e);
        }
        if (!Arrays.equals(this.f41519f, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f41519f);
        }
        if (!Arrays.equals(this.f41520g, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f41520g);
        }
        if (!Arrays.equals(this.f41521h, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f41521h);
        }
        if (!Arrays.equals(this.i, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        if (!Arrays.equals(this.f41522j, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f41522j);
        }
        return !Arrays.equals(this.f41523k, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(11, this.f41523k) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f41514a, f41512u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f41514a);
        }
        C4883q c4883q = this.f41515b;
        if (c4883q != null) {
            codedOutputByteBufferNano.writeMessage(2, c4883q);
        }
        byte[] bArr = this.f41516c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f41516c);
        }
        int i = this.f41517d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        if (!Arrays.equals(this.f41518e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f41518e);
        }
        if (!Arrays.equals(this.f41519f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f41519f);
        }
        if (!Arrays.equals(this.f41520g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f41520g);
        }
        if (!Arrays.equals(this.f41521h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f41521h);
        }
        if (!Arrays.equals(this.i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        if (!Arrays.equals(this.f41522j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f41522j);
        }
        if (!Arrays.equals(this.f41523k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f41523k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static r b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new r().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f41514a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f41515b == null) {
                        this.f41515b = new C4883q();
                    }
                    codedInputByteBufferNano.readMessage(this.f41515b);
                    break;
                case 26:
                    this.f41516c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f41517d = int32;
                            break;
                    }
                case 42:
                    this.f41518e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f41519f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f41520g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f41521h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f41522j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    this.f41523k = codedInputByteBufferNano.readBytes();
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

    public static r a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (r) MessageNano.mergeFrom(new r(), bArr);
    }
}
