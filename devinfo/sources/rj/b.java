package rj;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final String f32989a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f32990b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32991c;

    /* renamed from: d, reason: collision with root package name */
    public Long f32992d;

    /* renamed from: e, reason: collision with root package name */
    public int f32993e;

    public b(String str, ArrayList arrayList) {
        nk.k.e(str, "md5");
        this.f32989a = str;
        this.f32990b = arrayList;
        b();
    }

    @Override // rj.c
    public final long a() {
        if (this.f32992d == null) {
            ArrayList arrayList = this.f32990b;
            int size = arrayList.size();
            long j = 0;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                j += ((a) obj).f32986c.f406a;
            }
            this.f32992d = Long.valueOf(j);
        }
        Long l10 = this.f32992d;
        nk.k.b(l10);
        return l10.longValue();
    }

    public final void b() {
        int i4 = 0;
        this.f32993e = 0;
        ArrayList arrayList = this.f32990b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int i11 = i4 + 1;
            if (i4 < 0) {
                cm.g.N();
                throw null;
            }
            a aVar = (a) obj;
            aVar.f32987d = i4;
            if (aVar.f32988e) {
                this.f32993e++;
            }
            i4 = i11;
        }
    }

    public final void c(boolean z3) {
        ArrayList arrayList = this.f32990b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((a) obj).f32988e = z3;
        }
        this.f32993e = z3 ? arrayList.size() : 0;
    }

    public final void d(int i4, boolean z3) {
        ArrayList arrayList = this.f32990b;
        if (((a) arrayList.get(i4)).f32988e == z3) {
            return;
        }
        ((a) arrayList.get(i4)).f32988e = z3;
        this.f32993e += z3 ? 1 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return nk.k.a(this.f32989a, bVar.f32989a) && this.f32990b.equals(bVar.f32990b);
    }

    public final int hashCode() {
        return this.f32990b.hashCode() + (this.f32989a.hashCode() * 31);
    }

    public final String toString() {
        return "GroupItem(md5=" + this.f32989a + ", children=" + this.f32990b + ")";
    }
}
