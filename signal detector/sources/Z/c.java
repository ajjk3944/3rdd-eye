package z;

import A.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o4.AbstractC2763b;
import x.AbstractC2984e;
import x.C2985f;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f24285b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24286c;

    /* renamed from: d, reason: collision with root package name */
    public final d f24287d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24288e;

    /* renamed from: f, reason: collision with root package name */
    public c f24289f;
    public C2985f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f24284a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f24290g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f24291h = LinearLayoutManager.INVALID_OFFSET;

    public c(d dVar, int i) {
        this.f24287d = dVar;
        this.f24288e = i;
    }

    public final void a(c cVar, int i) {
        b(cVar, i, LinearLayoutManager.INVALID_OFFSET, false);
    }

    public final boolean b(c cVar, int i, int i3, boolean z6) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z6 && !i(cVar)) {
            return false;
        }
        this.f24289f = cVar;
        if (cVar.f24284a == null) {
            cVar.f24284a = new HashSet();
        }
        HashSet hashSet = this.f24289f.f24284a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f24290g = i;
        this.f24291h = i3;
        return true;
    }

    public final void c(int i, o oVar, ArrayList arrayList) {
        HashSet hashSet = this.f24284a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                A.i.b(((c) it.next()).f24287d, i, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (this.f24286c) {
            return this.f24285b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f24287d.f24329g0 == 8) {
            return 0;
        }
        int i = this.f24291h;
        return (i == Integer.MIN_VALUE || (cVar = this.f24289f) == null || cVar.f24287d.f24329g0 != 8) ? this.f24290g : i;
    }

    public final c f() {
        int i = this.f24288e;
        int iC = AbstractC2984e.c(i);
        d dVar = this.f24287d;
        switch (iC) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f24302K;
            case 2:
                return dVar.f24303L;
            case 3:
                return dVar.f24300I;
            case 4:
                return dVar.f24301J;
            default:
                throw new AssertionError(AbstractC2763b.i(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f24284a;
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
        return this.f24289f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(z.c r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto L65
        L5:
            z.d r1 = r11.f24287d
            int r11 = r11.f24288e
            r2 = 6
            int r3 = r10.f24288e
            r4 = 1
            if (r11 != r3) goto L1c
            if (r3 != r2) goto L63
            boolean r11 = r1.f24296E
            if (r11 == 0) goto L65
            z.d r11 = r10.f24287d
            boolean r11 = r11.f24296E
            if (r11 != 0) goto L63
            goto L65
        L1c:
            int r5 = x.AbstractC2984e.c(r3)
            r6 = 8
            r7 = 9
            r8 = 4
            r9 = 2
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
            java.lang.String r0 = o4.AbstractC2763b.i(r3)
            r11.<init>(r0)
            throw r11
        L33:
            if (r11 == r2) goto L65
            if (r11 == r6) goto L65
            if (r11 == r7) goto L65
            goto L63
        L3a:
            if (r11 == r9) goto L65
            if (r11 != r8) goto L63
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
            boolean r1 = r1 instanceof z.h
            if (r1 == 0) goto L52
            if (r2 != 0) goto L63
            if (r11 != r7) goto L65
            goto L63
        L52:
            return r2
        L53:
            if (r11 == r9) goto L5a
            if (r11 != r8) goto L58
            goto L5a
        L58:
            r2 = r0
            goto L5b
        L5a:
            r2 = r4
        L5b:
            boolean r1 = r1 instanceof z.h
            if (r1 == 0) goto L64
            if (r2 != 0) goto L63
            if (r11 != r6) goto L65
        L63:
            return r4
        L64:
            return r2
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.c.i(z.c):boolean");
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f24289f;
        if (cVar != null && (hashSet = cVar.f24284a) != null) {
            hashSet.remove(this);
            if (this.f24289f.f24284a.size() == 0) {
                this.f24289f.f24284a = null;
            }
        }
        this.f24284a = null;
        this.f24289f = null;
        this.f24290g = 0;
        this.f24291h = LinearLayoutManager.INVALID_OFFSET;
        this.f24286c = false;
        this.f24285b = 0;
    }

    public final void k() {
        C2985f c2985f = this.i;
        if (c2985f == null) {
            this.i = new C2985f(1);
        } else {
            c2985f.c();
        }
    }

    public final void l(int i) {
        this.f24285b = i;
        this.f24286c = true;
    }

    public final String toString() {
        return this.f24287d.f24331h0 + ":" + AbstractC2763b.i(this.f24288e);
    }
}
