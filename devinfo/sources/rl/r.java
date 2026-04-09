package rl;

import java.io.EOFException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r extends x {

    /* renamed from: f, reason: collision with root package name */
    public static final p f33128f;
    public static final p g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f33129h;

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f33130i;
    public static final byte[] j;

    /* renamed from: b, reason: collision with root package name */
    public final hm.h f33131b;

    /* renamed from: c, reason: collision with root package name */
    public final List f33132c;

    /* renamed from: d, reason: collision with root package name */
    public final p f33133d;

    /* renamed from: e, reason: collision with root package name */
    public long f33134e;

    static {
        vk.h hVar = p.f33121d;
        f33128f = u6.t.k("multipart/mixed");
        u6.t.k("multipart/alternative");
        u6.t.k("multipart/digest");
        u6.t.k("multipart/parallel");
        g = u6.t.k("multipart/form-data");
        f33129h = new byte[]{58, 32};
        f33130i = new byte[]{13, 10};
        j = new byte[]{45, 45};
    }

    public r(hm.h hVar, p pVar, List list) {
        nk.k.e(hVar, "boundaryByteString");
        nk.k.e(pVar, "type");
        this.f33131b = hVar;
        this.f33132c = list;
        vk.h hVar2 = p.f33121d;
        this.f33133d = u6.t.k(pVar + "; boundary=" + hVar.j());
        this.f33134e = -1L;
    }

    @Override // rl.x
    public final long a() throws EOFException {
        long j8 = this.f33134e;
        if (j8 != -1) {
            return j8;
        }
        long jE = e(null, true);
        this.f33134e = jE;
        return jE;
    }

    @Override // rl.x
    public final p b() {
        return this.f33133d;
    }

    @Override // rl.x
    public final boolean c() {
        List list = this.f33132c;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((q) it.next()).f33127b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // rl.x
    public final void d(hm.f fVar) throws EOFException {
        e(fVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(hm.f fVar, boolean z3) throws EOFException {
        hm.e eVar;
        hm.f eVar2;
        if (z3) {
            eVar2 = new hm.e();
            eVar = eVar2;
        } else {
            eVar = 0;
            eVar2 = fVar;
        }
        List list = this.f33132c;
        int size = list.size();
        long j8 = 0;
        int i4 = 0;
        while (true) {
            hm.h hVar = this.f33131b;
            byte[] bArr = j;
            byte[] bArr2 = f33130i;
            if (i4 >= size) {
                nk.k.b(eVar2);
                eVar2.write(bArr);
                eVar2.J(hVar);
                eVar2.write(bArr);
                eVar2.write(bArr2);
                if (!z3) {
                    return j8;
                }
                nk.k.b(eVar);
                long j9 = j8 + eVar.f25174b;
                eVar.e();
                return j9;
            }
            q qVar = (q) list.get(i4);
            m mVar = qVar.f33126a;
            x xVar = qVar.f33127b;
            nk.k.b(eVar2);
            eVar2.write(bArr);
            eVar2.J(hVar);
            eVar2.write(bArr2);
            int size2 = mVar.size();
            for (int i10 = 0; i10 < size2; i10++) {
                eVar2.writeUtf8(mVar.c(i10)).write(f33129h).writeUtf8(mVar.f(i10)).write(bArr2);
            }
            p pVarB = xVar.b();
            if (pVarB != null) {
                eVar2.writeUtf8("Content-Type: ").writeUtf8(pVarB.f33123a).write(bArr2);
            }
            long jA = xVar.a();
            if (jA == -1 && z3) {
                nk.k.b(eVar);
                eVar.e();
                return -1L;
            }
            eVar2.write(bArr2);
            if (z3) {
                j8 += jA;
            } else {
                xVar.d(eVar2);
            }
            eVar2.write(bArr2);
            i4++;
        }
    }
}
