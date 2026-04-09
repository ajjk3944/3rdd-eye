package com.ui.binme;

import Zg.U;
import com.ui.binme.BinaryMessage;
import com.ui.binme.compress.Compressor;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.q;
import sh.AbstractC7978m;

/* loaded from: classes3.dex */
public final class a implements BinaryMessage.e {

    /* renamed from: b, reason: collision with root package name */
    private final Compressor f41073b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41074c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f41075d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f41076e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f41077f;

    /* renamed from: com.ui.binme.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1278a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41078a;

        static {
            int[] iArr = new int[BinaryMessage.b.values().length];
            try {
                iArr[BinaryMessage.b.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BinaryMessage.b.ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41078a = iArr;
        }
    }

    static final class b extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f41079a = new b();

        b() {
            super(3);
        }

        @Override // mh.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BinaryMessage.d.a s(BinaryMessage.c format, BinaryMessage.b compression, byte[] content) {
            AbstractC6492s.i(format, "format");
            AbstractC6492s.i(compression, "compression");
            AbstractC6492s.i(content, "content");
            return new BinaryMessage.d.a(format, compression, content);
        }
    }

    static final class c extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final c f41080a = new c();

        c() {
            super(3);
        }

        @Override // mh.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BinaryMessage.d.b s(BinaryMessage.c format, BinaryMessage.b compression, byte[] content) {
            AbstractC6492s.i(format, "format");
            AbstractC6492s.i(compression, "compression");
            AbstractC6492s.i(content, "content");
            return new BinaryMessage.d.b(format, compression, content);
        }
    }

    public a(Compressor compressor) {
        AbstractC6492s.i(compressor, "compressor");
        this.f41073b = compressor;
        this.f41074c = 8;
        BinaryMessage.f[] fVarArrValues = BinaryMessage.f.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(fVarArrValues.length), 16));
        for (BinaryMessage.f fVar : fVarArrValues) {
            linkedHashMap.put(Byte.valueOf(fVar.getId$binme_release()), fVar);
        }
        this.f41075d = linkedHashMap;
        BinaryMessage.c[] cVarArrValues = BinaryMessage.c.values();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC7978m.d(U.d(cVarArrValues.length), 16));
        for (BinaryMessage.c cVar : cVarArrValues) {
            linkedHashMap2.put(Byte.valueOf(cVar.getId$binme_release()), cVar);
        }
        this.f41076e = linkedHashMap2;
        BinaryMessage.b[] bVarArrValues = BinaryMessage.b.values();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC7978m.d(U.d(bVarArrValues.length), 16));
        for (BinaryMessage.b bVar : bVarArrValues) {
            linkedHashMap3.put(Byte.valueOf(bVar.getId$binme_release()), bVar);
        }
        this.f41077f = linkedHashMap3;
    }

    private final byte[] c(BinaryMessage.d dVar) {
        try {
            int i10 = C1278a.f41078a[dVar.a().ordinal()];
            if (i10 == 1) {
                return dVar.b();
            }
            if (i10 == 2) {
                return this.f41073b.b(dVar.b());
            }
            throw new NoWhenBranchMatchedException();
        } catch (Compressor.CompressionError e10) {
            throw new BinaryMessage.Error.Compression("Binary message (fragment type: '" + ((int) dVar.d().getId$binme_release()) + "') content compression failed", e10);
        }
    }

    private final BinaryMessage.b d(ByteBuffer byteBuffer) {
        try {
            byte b10 = byteBuffer.get();
            BinaryMessage.b bVar = (BinaryMessage.b) this.f41077f.get(Byte.valueOf(b10));
            if (bVar != null) {
                return bVar;
            }
            throw new BinaryMessage.Error.InvalidFormat("Unknown Message compression " + ((int) b10), null, 2, null);
        } catch (BufferUnderflowException e10) {
            throw new BinaryMessage.Error.InvalidFormat("Message compression couldn't be parsed", e10);
        }
    }

    private final byte[] e(ByteBuffer byteBuffer) {
        Integer numValueOf = null;
        try {
            int i10 = byteBuffer.getInt();
            numValueOf = Integer.valueOf(i10);
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        } catch (BufferUnderflowException e10) {
            throw new BinaryMessage.Error.InvalidFormat("Message content couldn't be parsed (length " + numValueOf + ")", e10);
        }
    }

    private final BinaryMessage.c f(ByteBuffer byteBuffer) {
        try {
            byte b10 = byteBuffer.get();
            BinaryMessage.c cVar = (BinaryMessage.c) this.f41076e.get(Byte.valueOf(b10));
            if (cVar != null) {
                return cVar;
            }
            throw new BinaryMessage.Error.InvalidFormat("Unknown Message format " + ((int) b10), null, 2, null);
        } catch (BufferUnderflowException e10) {
            throw new BinaryMessage.Error.InvalidFormat("Message format couldn't be parsed", e10);
        }
    }

    private final BinaryMessage.f g(ByteBuffer byteBuffer) {
        try {
            byte b10 = byteBuffer.get();
            BinaryMessage.f fVar = (BinaryMessage.f) this.f41075d.get(Byte.valueOf(b10));
            if (fVar != null) {
                return fVar;
            }
            throw new BinaryMessage.Error.InvalidFormat("Unknown Message type " + ((int) b10), null, 2, null);
        } catch (BufferUnderflowException e10) {
            throw new BinaryMessage.Error.InvalidFormat("Message type couldn't be parsed", e10);
        }
    }

    private final BinaryMessage.d h(ByteBuffer byteBuffer, q qVar) {
        BinaryMessage.c cVarF = f(byteBuffer);
        BinaryMessage.b bVarD = d(byteBuffer);
        i(byteBuffer);
        byte[] bArrE = e(byteBuffer);
        try {
            int i10 = C1278a.f41078a[bVarD.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bArrE = this.f41073b.a(bArrE);
            }
            return (BinaryMessage.d) qVar.s(cVarF, bVarD, bArrE);
        } catch (Compressor.CompressionError e10) {
            throw new BinaryMessage.Error.Compression("Binary message content decompression failed", e10);
        }
    }

    private final void i(ByteBuffer byteBuffer) {
        try {
            byteBuffer.get();
        } catch (BufferUnderflowException e10) {
            throw new BinaryMessage.Error.InvalidFormat("Message doesn't contain reserved byte", e10);
        }
    }

    @Override // com.ui.binme.BinaryMessage.e
    public byte[] a(BinaryMessage message) {
        AbstractC6492s.i(message, "message");
        byte[] bArrC = c(message.b());
        byte[] bArrC2 = c(message.a());
        int i10 = this.f41074c;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrC.length + i10 + i10 + bArrC2.length);
        byteBufferAllocate.order(BinaryMessage.f41053c.a());
        byteBufferAllocate.put(message.b().d().getId$binme_release());
        byteBufferAllocate.put(message.b().c().getId$binme_release());
        byteBufferAllocate.put(message.b().a().getId$binme_release());
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putInt(bArrC.length);
        byteBufferAllocate.put(bArrC);
        byteBufferAllocate.put(message.a().d().getId$binme_release());
        byteBufferAllocate.put(message.a().c().getId$binme_release());
        byteBufferAllocate.put(message.a().a().getId$binme_release());
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putInt(bArrC2.length);
        byteBufferAllocate.put(bArrC2);
        byte[] bArrArray = byteBufferAllocate.array();
        AbstractC6492s.h(bArrArray, "buffer.array()");
        return bArrArray;
    }

    @Override // com.ui.binme.BinaryMessage.e
    public BinaryMessage b(byte[] bytes) {
        AbstractC6492s.i(bytes, "bytes");
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        buffer.order(BinaryMessage.f41053c.a());
        AbstractC6492s.h(buffer, "buffer");
        if (g(buffer) != BinaryMessage.f.HEADER) {
            throw new BinaryMessage.Error.InvalidFormat("Binary message must always start with header", null, 2, null);
        }
        BinaryMessage.d.b bVar = (BinaryMessage.d.b) h(buffer, c.f41080a);
        if (g(buffer) == BinaryMessage.f.BODY) {
            return new BinaryMessage(bVar, (BinaryMessage.d.a) h(buffer, b.f41079a));
        }
        throw new BinaryMessage.Error.InvalidFormat("Binary message must always contain body", null, 2, null);
    }
}
