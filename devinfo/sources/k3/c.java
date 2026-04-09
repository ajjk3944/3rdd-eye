package k3;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import je.u;
import l3.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f27832b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27833c;

    /* renamed from: d, reason: collision with root package name */
    public final d f27834d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27835e;

    /* renamed from: f, reason: collision with root package name */
    public c f27836f;

    /* renamed from: i, reason: collision with root package name */
    public i3.f f27838i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f27831a = null;
    public int g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f27837h = LinearLayoutManager.INVALID_OFFSET;

    public c(d dVar, int i4) {
        this.f27834d = dVar;
        this.f27835e = i4;
    }

    public final void a(c cVar, int i4) {
        b(cVar, i4, LinearLayoutManager.INVALID_OFFSET, false);
    }

    public final boolean b(c cVar, int i4, int i10, boolean z3) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z3 && !i(cVar)) {
            return false;
        }
        this.f27836f = cVar;
        if (cVar.f27831a == null) {
            cVar.f27831a = new HashSet();
        }
        HashSet hashSet = this.f27836f.f27831a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i4;
        this.f27837h = i10;
        return true;
    }

    public final void c(int i4, ArrayList arrayList, m mVar) {
        HashSet hashSet = this.f27831a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                l3.g.b(((c) it.next()).f27834d, i4, arrayList, mVar);
            }
        }
    }

    public final int d() {
        if (this.f27833c) {
            return this.f27832b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f27834d.f27851g0 == 8) {
            return 0;
        }
        int i4 = this.f27837h;
        return (i4 == Integer.MIN_VALUE || (cVar = this.f27836f) == null || cVar.f27834d.f27851g0 != 8) ? this.g : i4;
    }

    public final c f() {
        int i4 = this.f27835e;
        int iC = i3.e.c(i4);
        d dVar = this.f27834d;
        switch (iC) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.K;
            case 2:
                return dVar.L;
            case 3:
                return dVar.I;
            case 4:
                return dVar.J;
            default:
                throw new AssertionError(u.C(i4));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f27831a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f27836f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(k3.c r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto L65
        L5:
            k3.d r1 = r11.f27834d
            int r11 = r11.f27835e
            r2 = 6
            int r3 = r10.f27835e
            r4 = 1
            if (r11 != r3) goto L1c
            if (r3 != r2) goto L63
            boolean r11 = r1.E
            if (r11 == 0) goto L65
            k3.d r11 = r10.f27834d
            boolean r11 = r11.E
            if (r11 != 0) goto L63
            goto L65
        L1c:
            int r5 = i3.e.c(r3)
            r6 = 4
            r7 = 2
            r8 = 9
            r9 = 8
            switch(r5) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = je.u.C(r3)
            r11.<init>(r0)
            throw r11
        L33:
            if (r11 == r2) goto L65
            if (r11 == r9) goto L65
            if (r11 == r8) goto L65
            goto L63
        L3a:
            if (r11 == r7) goto L65
            if (r11 != r6) goto L63
            goto L65
        L3f:
            r2 = 3
            if (r11 == r2) goto L48
            r2 = 5
            if (r11 != r2) goto L46
            goto L48
        L46:
            r2 = r0
            goto L49
        L48:
            r2 = r4
        L49:
            boolean r1 = r1 instanceof k3.h
            if (r1 == 0) goto L52
            if (r2 != 0) goto L63
            if (r11 != r8) goto L65
            goto L63
        L52:
            return r2
        L53:
            if (r11 == r7) goto L5a
            if (r11 != r6) goto L58
            goto L5a
        L58:
            r2 = r0
            goto L5b
        L5a:
            r2 = r4
        L5b:
            boolean r1 = r1 instanceof k3.h
            if (r1 == 0) goto L64
            if (r2 != 0) goto L63
            if (r11 != r9) goto L65
        L63:
            return r4
        L64:
            return r2
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.c.i(k3.c):boolean");
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f27836f;
        if (cVar != null && (hashSet = cVar.f27831a) != null) {
            hashSet.remove(this);
            if (this.f27836f.f27831a.size() == 0) {
                this.f27836f.f27831a = null;
            }
        }
        this.f27831a = null;
        this.f27836f = null;
        this.g = 0;
        this.f27837h = LinearLayoutManager.INVALID_OFFSET;
        this.f27833c = false;
        this.f27832b = 0;
    }

    public final void k() {
        i3.f fVar = this.f27838i;
        if (fVar == null) {
            this.f27838i = new i3.f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i4) {
        this.f27832b = i4;
        this.f27833c = true;
    }

    public final String toString() {
        return this.f27834d.f27853h0 + ":" + u.C(this.f27835e);
    }
}
