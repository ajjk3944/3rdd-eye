package Q1;

import Q1.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollEventAdapter.java */
/* loaded from: classes.dex */
public final class e extends RecyclerView.u {

    /* renamed from: a, reason: collision with root package name */
    public c f10868a;

    /* renamed from: b, reason: collision with root package name */
    public final f f10869b;

    /* renamed from: c, reason: collision with root package name */
    public final f.i f10870c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f10871d;

    /* renamed from: e, reason: collision with root package name */
    public int f10872e;

    /* renamed from: f, reason: collision with root package name */
    public int f10873f;

    /* renamed from: g, reason: collision with root package name */
    public final a f10874g;

    /* renamed from: h, reason: collision with root package name */
    public int f10875h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10876j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10877k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10878l;

    /* compiled from: ScrollEventAdapter.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f10879a;

        /* renamed from: b, reason: collision with root package name */
        public float f10880b;

        /* renamed from: c, reason: collision with root package name */
        public int f10881c;
    }

    public e(f fVar) {
        this.f10869b = fVar;
        f.i iVar = fVar.f10890k;
        this.f10870c = iVar;
        this.f10871d = (LinearLayoutManager) iVar.getLayoutManager();
        this.f10874g = new a();
        d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void a(RecyclerView recyclerView, int i) {
        c cVar;
        c cVar2;
        int i10 = this.f10872e;
        boolean z10 = true;
        if (!(i10 == 1 && this.f10873f == 1) && i == 1) {
            this.f10872e = 1;
            int i11 = this.i;
            if (i11 != -1) {
                this.f10875h = i11;
                this.i = -1;
            } else if (this.f10875h == -1) {
                this.f10875h = this.f10871d.i1();
            }
            c(1);
            return;
        }
        if ((i10 == 1 || i10 == 4) && i == 2) {
            if (this.f10877k) {
                c(2);
                this.f10876j = true;
                return;
            }
            return;
        }
        if (i10 != 1 && i10 != 4) {
            z10 = false;
        }
        a aVar = this.f10874g;
        if (z10 && i == 0) {
            e();
            if (!this.f10877k) {
                int i12 = aVar.f10879a;
                if (i12 != -1 && (cVar2 = this.f10868a) != null) {
                    cVar2.onPageScrolled(i12, 0.0f, 0);
                }
            } else if (aVar.f10881c == 0) {
                int i13 = this.f10875h;
                int i14 = aVar.f10879a;
                if (i13 != i14 && (cVar = this.f10868a) != null) {
                    cVar.onPageSelected(i14);
                }
            }
            c(0);
            d();
        }
        if (this.f10872e == 2 && i == 0 && this.f10878l) {
            e();
            if (aVar.f10881c == 0) {
                int i15 = this.i;
                int i16 = aVar.f10879a;
                if (i15 != i16) {
                    if (i16 == -1) {
                        i16 = 0;
                    }
                    c cVar3 = this.f10868a;
                    if (cVar3 != null) {
                        cVar3.onPageSelected(i16);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f10877k = r6
            r5.e()
            boolean r0 = r5.f10876j
            Q1.e$a r1 = r5.f10874g
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L40
            r5.f10876j = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            Q1.f r8 = r5.f10869b
            Q1.f$d r8 = r8.f10888h
            int r8 = r8.W()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r1.f10881c
            if (r7 == 0) goto L30
            int r7 = r1.f10879a
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r1.f10879a
        L32:
            r5.i = r7
            int r8 = r5.f10875h
            if (r8 == r7) goto L50
            Q1.c r8 = r5.f10868a
            if (r8 == 0) goto L50
            r8.onPageSelected(r7)
            goto L50
        L40:
            int r7 = r5.f10872e
            if (r7 != 0) goto L50
            int r7 = r1.f10879a
            if (r7 != r2) goto L49
            r7 = r3
        L49:
            Q1.c r8 = r5.f10868a
            if (r8 == 0) goto L50
            r8.onPageSelected(r7)
        L50:
            int r7 = r1.f10879a
            if (r7 != r2) goto L55
            r7 = r3
        L55:
            float r8 = r1.f10880b
            int r0 = r1.f10881c
            Q1.c r4 = r5.f10868a
            if (r4 == 0) goto L60
            r4.onPageScrolled(r7, r8, r0)
        L60:
            int r7 = r1.f10879a
            int r8 = r5.i
            if (r7 == r8) goto L68
            if (r8 != r2) goto L76
        L68:
            int r7 = r1.f10881c
            if (r7 != 0) goto L76
            int r7 = r5.f10873f
            if (r7 == r6) goto L76
            r5.c(r3)
            r5.d()
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.e.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i) {
        if ((this.f10872e == 3 && this.f10873f == 0) || this.f10873f == i) {
            return;
        }
        this.f10873f = i;
        c cVar = this.f10868a;
        if (cVar != null) {
            cVar.onPageScrollStateChanged(i);
        }
    }

    public final void d() {
        this.f10872e = 0;
        this.f10873f = 0;
        a aVar = this.f10874g;
        aVar.f10879a = -1;
        aVar.f10880b = 0.0f;
        aVar.f10881c = 0;
        this.f10875h = -1;
        this.i = -1;
        this.f10876j = false;
        this.f10877k = false;
        this.f10878l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.e.e():void");
    }
}
