package mu;

import java.util.List;

/* loaded from: classes.dex */
public final class q extends o {
    public final lu.w j;
    public final List k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17028l;

    /* renamed from: m, reason: collision with root package name */
    public int f17029m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(lu.c cVar, lu.w wVar) {
        super(cVar, wVar, (String) null, 12);
        br.l.e(cVar, "json");
        this.j = wVar;
        List listQ0 = mq.o.Q0(wVar.f15960a.keySet());
        this.k = listQ0;
        this.f17028l = listQ0.size() * 2;
        this.f17029m = -1;
    }

    @Override // mu.o, mu.a
    public final lu.l E(String str) {
        br.l.e(str, "tag");
        if (this.f17029m % 2 != 0) {
            return (lu.l) mq.b0.O(this.j, str);
        }
        ku.a0 a0Var = lu.m.f15950a;
        return new lu.p(str, true);
    }

    @Override // mu.o, mu.a
    public final String Q(iu.e eVar, int i10) {
        br.l.e(eVar, "descriptor");
        return (String) this.k.get(i10 / 2);
    }

    @Override // mu.o, mu.a
    public final lu.l S() {
        return this.j;
    }

    @Override // mu.o
    /* renamed from: X */
    public final lu.w S() {
        return this.j;
    }

    @Override // mu.o, mu.a, ju.a
    public final void c(iu.e eVar) {
        br.l.e(eVar, "descriptor");
    }

    @Override // mu.o, ju.a
    public final int t(iu.e eVar) {
        br.l.e(eVar, "descriptor");
        int i10 = this.f17029m;
        if (i10 >= this.f17028l - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f17029m = i11;
        return i11;
    }
}
