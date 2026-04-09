package tt;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public int f22979a = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f22980d;

    /* renamed from: g, reason: collision with root package name */
    public int f22981g;

    /* renamed from: r, reason: collision with root package name */
    public hr.d f22982r;

    /* renamed from: x, reason: collision with root package name */
    public int f22983x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f22984y;

    public b(c cVar) {
        this.f22984y = cVar;
        int iH = vc.e.h(0, 0, cVar.f22985a.length());
        this.f22980d = iH;
        this.f22981g = iH;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.f22981g
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f22979a = r1
            r0 = 0
            r7.f22982r = r0
            return
        Lb:
            tt.c r2 = r7.f22984y
            int r3 = r2.f22986b
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f22983x
            int r6 = r6 + r5
            r7.f22983x = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f22985a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            hr.d r0 = new hr.d
            int r1 = r7.f22980d
            java.lang.CharSequence r2 = r2.f22985a
            int r2 = tt.l.x0(r2)
            r0.<init>(r1, r2, r5)
            r7.f22982r = r0
            r7.f22981g = r4
            goto L79
        L34:
            ar.n r0 = r2.f22987c
            java.lang.CharSequence r3 = r2.f22985a
            int r6 = r7.f22981g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.w(r3, r6)
            lq.l r0 = (lq.l) r0
            if (r0 != 0) goto L58
            hr.d r0 = new hr.d
            int r1 = r7.f22980d
            java.lang.CharSequence r2 = r2.f22985a
            int r2 = tt.l.x0(r2)
            r0.<init>(r1, r2, r5)
            r7.f22982r = r0
            r7.f22981g = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f15571a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f15572d
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f22980d
            hr.d r3 = vc.e.T(r3, r2)
            r7.f22982r = r3
            int r2 = r2 + r0
            r7.f22980d = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.f22981g = r2
        L79:
            r7.f22979a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tt.b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f22979a == -1) {
            a();
        }
        return this.f22979a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f22979a == -1) {
            a();
        }
        if (this.f22979a == 0) {
            throw new NoSuchElementException();
        }
        hr.d dVar = this.f22982r;
        br.l.c(dVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f22982r = null;
        this.f22979a = -1;
        return dVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
