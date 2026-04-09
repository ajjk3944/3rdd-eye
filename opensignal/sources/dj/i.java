package dj;

import ca.l;
import ca.m;
import ca.u;
import ca.x;
import cc.s;
import cj.n;
import h9.p;
import hk.k;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import oe.f0;
import oe.h0;
import oe.u0;
import u5.a0;

/* loaded from: classes.dex */
public final class i implements n, l, m, n6.b, u5.l, u5.m, dd.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7403a;

    /* renamed from: d, reason: collision with root package name */
    public long f7404d;

    /* renamed from: g, reason: collision with root package name */
    public Object f7405g;

    public /* synthetic */ i(int i10, long j, Object obj) {
        this.f7403a = i10;
        this.f7404d = j;
        this.f7405g = obj;
    }

    public int A(int i10) {
        i iVar = (i) this.f7405g;
        if (iVar == null) {
            return i10 >= 64 ? Long.bitCount(this.f7404d) : Long.bitCount(this.f7404d & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f7404d & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f7404d) + iVar.A(i10 - 64);
    }

    public void B() {
        if (((i) this.f7405g) == null) {
            this.f7405g = new i();
        }
    }

    public boolean C(int i10) {
        if (i10 < 64) {
            return (this.f7404d & (1 << i10)) != 0;
        }
        B();
        return ((i) this.f7405g).C(i10 - 64);
    }

    public void D(int i10, boolean z10) {
        if (i10 >= 64) {
            B();
            ((i) this.f7405g).D(i10 - 64, z10);
            return;
        }
        long j = this.f7404d;
        boolean z11 = (Long.MIN_VALUE & j) != 0;
        long j7 = (1 << i10) - 1;
        this.f7404d = ((j & (~j7)) << 1) | (j & j7);
        if (z10) {
            G(i10);
        } else {
            z(i10);
        }
        if (z11 || ((i) this.f7405g) != null) {
            B();
            ((i) this.f7405g).D(0, z11);
        }
    }

    public boolean E(int i10) {
        if (i10 >= 64) {
            B();
            return ((i) this.f7405g).E(i10 - 64);
        }
        long j = 1 << i10;
        long j7 = this.f7404d;
        boolean z10 = (j7 & j) != 0;
        long j10 = j7 & (~j);
        this.f7404d = j10;
        long j11 = j - 1;
        this.f7404d = (j10 & j11) | Long.rotateRight((~j11) & j10, 1);
        i iVar = (i) this.f7405g;
        if (iVar != null) {
            if (iVar.C(0)) {
                G(63);
            }
            ((i) this.f7405g).E(0);
        }
        return z10;
    }

    public void F() {
        this.f7404d = 0L;
        i iVar = (i) this.f7405g;
        if (iVar != null) {
            iVar.F();
        }
    }

    public void G(int i10) {
        if (i10 < 64) {
            this.f7404d |= 1 << i10;
        } else {
            B();
            ((i) this.f7405g).G(i10 - 64);
        }
    }

    @Override // n6.b
    public int a(long j) {
        return this.f7404d > j ? 0 : -1;
    }

    @Override // ca.l
    public boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        switch (this.f7403a) {
            case 1:
                return ((l) this.f7405g).b(bArr, 0, i11, z10);
            default:
                return ((u5.l) this.f7405g).b(bArr, 0, i11, z10);
        }
    }

    @Override // ca.l
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        switch (this.f7403a) {
            case 1:
                return ((l) this.f7405g).c(bArr, i10, i11, z10);
            default:
                return ((u5.l) this.f7405g).c(bArr, i10, i11, z10);
        }
    }

    @Override // ca.l
    public long d() {
        long jD;
        long j;
        switch (this.f7403a) {
            case 1:
                jD = ((l) this.f7405g).d();
                j = this.f7404d;
                break;
            default:
                jD = ((u5.l) this.f7405g).d();
                j = this.f7404d;
                break;
        }
        return jD - j;
    }

    @Override // n6.b
    public long e(int i10) {
        a5.a.e(i10 == 0);
        return this.f7404d;
    }

    @Override // n6.b
    public List f(long j) {
        if (j >= this.f7404d) {
            return (h0) this.f7405g;
        }
        f0 f0Var = h0.f19336d;
        return u0.f19383x;
    }

    @Override // ca.l
    public void g(int i10) {
        switch (this.f7403a) {
            case 1:
                ((l) this.f7405g).g(i10);
                break;
            default:
                ((u5.l) this.f7405g).g(i10);
                break;
        }
    }

    @Override // ca.l
    public long getLength() {
        long length;
        long j;
        switch (this.f7403a) {
            case 1:
                length = ((l) this.f7405g).getLength();
                j = this.f7404d;
                break;
            default:
                length = ((u5.l) this.f7405g).getLength();
                j = this.f7404d;
                break;
        }
        return length - j;
    }

    @Override // ca.l
    public long getPosition() {
        long position;
        long j;
        switch (this.f7403a) {
            case 1:
                position = ((l) this.f7405g).getPosition();
                j = this.f7404d;
                break;
            default:
                position = ((u5.l) this.f7405g).getPosition();
                j = this.f7404d;
                break;
        }
        return position - j;
    }

    @Override // n6.b
    public int h() {
        return 1;
    }

    @Override // ca.l
    public int i(byte[] bArr, int i10, int i11) {
        switch (this.f7403a) {
            case 1:
                return ((l) this.f7405g).i(bArr, i10, i11);
            default:
                return ((u5.l) this.f7405g).i(bArr, i10, i11);
        }
    }

    @Override // ca.m
    public void j() {
        switch (this.f7403a) {
            case 2:
                ((m) this.f7405g).j();
                break;
            default:
                ((u5.m) this.f7405g).j();
                break;
        }
    }

    @Override // ca.l
    public void l() {
        switch (this.f7403a) {
            case 1:
                ((l) this.f7405g).l();
                break;
            default:
                ((u5.l) this.f7405g).l();
                break;
        }
    }

    @Override // ca.l
    public void m(int i10) {
        switch (this.f7403a) {
            case 1:
                ((l) this.f7405g).m(i10);
                break;
            default:
                ((u5.l) this.f7405g).m(i10);
                break;
        }
    }

    @Override // ca.m
    public x n(int i10, int i11) {
        return ((m) this.f7405g).n(i10, i11);
    }

    @Override // ca.l
    public void p(byte[] bArr, int i10, int i11) {
        switch (this.f7403a) {
            case 1:
                ((l) this.f7405g).p(bArr, i10, i11);
                break;
            default:
                ((u5.l) this.f7405g).p(bArr, i10, i11);
                break;
        }
    }

    @Override // ca.m
    public void r(u uVar) {
        ((m) this.f7405g).r(new ga.d(this, uVar));
    }

    @Override // pb.k
    public int read(byte[] bArr, int i10, int i11) {
        switch (this.f7403a) {
            case 1:
                return ((l) this.f7405g).read(bArr, i10, i11);
            default:
                return ((u5.l) this.f7405g).read(bArr, i10, i11);
        }
    }

    @Override // ca.l
    public void readFully(byte[] bArr, int i10, int i11) {
        switch (this.f7403a) {
            case 1:
                ((l) this.f7405g).readFully(bArr, i10, i11);
                break;
            default:
                ((u5.l) this.f7405g).readFully(bArr, i10, i11);
                break;
        }
    }

    @Override // cj.n
    public void run() {
        Object next;
        StringBuilder sb2 = new StringBuilder("Running StopTaskCommand for task: ");
        long j = this.f7404d;
        sb2.append(j);
        ch.n.b("StopTaskCommand", sb2.toString());
        Iterator it = ((p) ch.l.f3962t5.P0().f10472g).c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((hk.h) next).f10804a == j) {
                    break;
                }
            }
        }
        hk.h hVar = (hk.h) next;
        if (hVar == null) {
            ch.n.c("StopTaskCommand", "Can't find task " + j + " in currently running tasks list. Won't stop.");
            return;
        }
        k kVarQ0 = ((ch.d) this.f7405g).Q0();
        ch.n.b("TaskScheduler", c7.a.o(hVar, new StringBuilder(), " Stopping task and its jobs"));
        hVar.k(true);
        kVarQ0.z(hVar);
        hVar.Q = null;
    }

    public String toString() {
        switch (this.f7403a) {
            case 3:
                if (((i) this.f7405g) == null) {
                    return Long.toBinaryString(this.f7404d);
                }
                return ((i) this.f7405g).toString() + "xx" + Long.toBinaryString(this.f7404d);
            default:
                return super.toString();
        }
    }

    @Override // u5.m
    public void u(u5.x xVar) {
        ((u5.m) this.f7405g).u(new z5.c(this, xVar));
    }

    @Override // u5.l
    public int v(int i10) {
        return ((u5.l) this.f7405g).v(i10);
    }

    @Override // ca.l
    public int x() {
        return ((l) this.f7405g).x();
    }

    @Override // dd.d
    public /* synthetic */ void y(Exception exc) {
        qm.c cVar = (qm.c) this.f7405g;
        ((AtomicLong) cVar.f20920r).set(this.f7404d);
    }

    public void z(int i10) {
        if (i10 < 64) {
            this.f7404d &= ~(1 << i10);
            return;
        }
        i iVar = (i) this.f7405g;
        if (iVar != null) {
            iVar.z(i10 - 64);
        }
    }

    public /* synthetic */ i(qm.c cVar, long j) {
        this.f7403a = 8;
        this.f7405g = cVar;
        this.f7404d = j;
    }

    @Override // u5.m
    /* renamed from: n, reason: collision with other method in class */
    public a0 mo36n(int i10, int i11) {
        return ((u5.m) this.f7405g).mo36n(i10, i11);
    }

    public i(gc.a aVar) {
        this.f7403a = 9;
        s.h(aVar);
        this.f7405g = aVar;
    }

    public i(ch.d dVar, long j) {
        this.f7403a = 0;
        br.l.e(dVar, "serviceLocator");
        this.f7405g = dVar;
        this.f7404d = j;
    }

    public i(cv.i iVar) {
        this.f7403a = 5;
        br.l.e(iVar, "source");
        this.f7405g = iVar;
        this.f7404d = 262144L;
    }

    public i(l lVar, long j) {
        this.f7403a = 1;
        this.f7405g = lVar;
        qb.b.g(lVar.getPosition() >= j);
        this.f7404d = j;
    }

    public i(u5.l lVar, long j) {
        this.f7403a = 6;
        this.f7405g = lVar;
        a5.a.e(lVar.getPosition() >= j);
        this.f7404d = j;
    }

    public i() {
        this.f7403a = 3;
        this.f7404d = 0L;
    }
}
