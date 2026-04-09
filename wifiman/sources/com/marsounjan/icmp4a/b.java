package com.marsounjan.icmp4a;

import Yg.H;
import Yg.n;
import com.marsounjan.icmp4a.Icmp;
import com.marsounjan.icmp4a.IcmpMessageSerializer;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.text.C6510d;
import mh.InterfaceC6824a;
import qh.AbstractC7510c;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f39206a;

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f39207b;

    /* renamed from: c, reason: collision with root package name */
    private short f39208c;

    /* renamed from: d, reason: collision with root package name */
    private final short f39209d;

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final byte[] invoke() {
            int iD = b.this.d();
            byte[] bArr = new byte[iD];
            for (int i10 = 0; i10 < iD; i10++) {
                bArr[i10] = b.this.f39206a[i10 % b.this.f39206a.length];
            }
            return bArr;
        }
    }

    public b() {
        byte[] bytes = "abcdefghijklmnopqrstuvwxyz".getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "this as java.lang.String).getBytes(charset)");
        this.f39206a = bytes;
        this.f39207b = n.b(new a());
        this.f39209d = (short) AbstractC7510c.f59421a.d();
    }

    private final byte[] b() {
        return (byte[]) this.f39207b.getValue();
    }

    public abstract byte[] c();

    protected abstract int d();

    protected abstract Object e(short s10, short s11);

    protected final short f() {
        return this.f39208c;
    }

    protected abstract IcmpMessageSerializer g();

    protected abstract boolean h(Object obj);

    public final ByteBuffer i() {
        IcmpMessageSerializer icmpMessageSerializerG = g();
        short sB = H.b((short) (this.f39208c + 1));
        this.f39208c = sB;
        return icmpMessageSerializerG.e(e(sB, this.f39209d), c(), b());
    }

    protected abstract Icmp.c j(Object obj, int i10, long j10);

    public final Icmp.c k(ByteBuffer buffer, int i10, long j10) throws IcmpMessageSerializer.InvalidMessageContentException {
        AbstractC6492s.i(buffer, "buffer");
        Object objA = g().a(buffer);
        if (!h(objA)) {
            objA = null;
        }
        if (objA != null) {
            return j(objA, i10, j10);
        }
        return null;
    }
}
