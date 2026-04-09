package S0;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.U;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class d extends U {

    /* renamed from: a, reason: collision with root package name */
    public R0.c f3453a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f3454b;

    /* renamed from: c, reason: collision with root package name */
    public final l f3455c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f3456d;

    /* renamed from: e, reason: collision with root package name */
    public int f3457e;

    /* renamed from: f, reason: collision with root package name */
    public int f3458f;

    /* renamed from: g, reason: collision with root package name */
    public final c f3459g;

    /* renamed from: h, reason: collision with root package name */
    public int f3460h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3461j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3462k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3463l;

    public d(ViewPager2 viewPager2) {
        this.f3454b = viewPager2;
        l lVar = viewPager2.f5653j;
        this.f3455c = lVar;
        this.f3456d = (LinearLayoutManager) lVar.getLayoutManager();
        this.f3459g = new c();
        c();
    }

    public final void a(int i) {
        R0.c cVar = this.f3453a;
        if (cVar != null) {
            cVar.c(i);
        }
    }

    public final void b(int i) {
        if ((this.f3457e == 3 && this.f3458f == 0) || this.f3458f == i) {
            return;
        }
        this.f3458f = i;
        R0.c cVar = this.f3453a;
        if (cVar != null) {
            cVar.a(i);
        }
    }

    public final void c() {
        this.f3457e = 0;
        this.f3458f = 0;
        c cVar = this.f3459g;
        cVar.f3451b = -1;
        cVar.f3450a = 0.0f;
        cVar.f3452c = 0;
        this.f3460h = -1;
        this.i = -1;
        this.f3461j = false;
        this.f3462k = false;
        this.f3463l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.d.d():void");
    }

    @Override // androidx.recyclerview.widget.U
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        R0.c cVar;
        int i3 = this.f3457e;
        if (!(i3 == 1 && this.f3458f == 1) && i == 1) {
            this.f3457e = 1;
            int i6 = this.i;
            if (i6 != -1) {
                this.f3460h = i6;
                this.i = -1;
            } else if (this.f3460h == -1) {
                this.f3460h = this.f3456d.findFirstVisibleItemPosition();
            }
            b(1);
            return;
        }
        if ((i3 == 1 || i3 == 4) && i == 2) {
            if (this.f3462k) {
                b(2);
                this.f3461j = true;
                return;
            }
            return;
        }
        c cVar2 = this.f3459g;
        if ((i3 == 1 || i3 == 4) && i == 0) {
            d();
            if (!this.f3462k) {
                int i7 = cVar2.f3451b;
                if (i7 != -1 && (cVar = this.f3453a) != null) {
                    cVar.b(i7, 0.0f, 0);
                }
            } else if (cVar2.f3452c == 0) {
                int i8 = this.f3460h;
                int i9 = cVar2.f3451b;
                if (i8 != i9) {
                    a(i9);
                }
            }
            b(0);
            c();
        }
        if (this.f3457e == 2 && i == 0 && this.f3463l) {
            d();
            if (cVar2.f3452c == 0) {
                int i10 = this.i;
                int i11 = cVar2.f3451b;
                if (i10 != i11) {
                    if (i11 == -1) {
                        i11 = 0;
                    }
                    a(i11);
                }
                b(0);
                c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    @Override // androidx.recyclerview.widget.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f3462k = r6
            r5.d()
            boolean r0 = r5.f3461j
            r1 = -1
            S0.c r2 = r5.f3459g
            r3 = 0
            if (r0 == 0) goto L3c
            r5.f3461j = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f3454b
            S0.h r8 = r8.f5651g
            int r8 = r8.getLayoutDirection()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r2.f3452c
            if (r7 == 0) goto L30
            int r7 = r2.f3451b
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r2.f3451b
        L32:
            r5.i = r7
            int r8 = r5.f3460h
            if (r8 == r7) goto L48
            r5.a(r7)
            goto L48
        L3c:
            int r7 = r5.f3457e
            if (r7 != 0) goto L48
            int r7 = r2.f3451b
            if (r7 != r1) goto L45
            r7 = r3
        L45:
            r5.a(r7)
        L48:
            int r7 = r2.f3451b
            if (r7 != r1) goto L4d
            r7 = r3
        L4d:
            float r8 = r2.f3450a
            int r0 = r2.f3452c
            R0.c r4 = r5.f3453a
            if (r4 == 0) goto L58
            r4.b(r7, r8, r0)
        L58:
            int r7 = r2.f3451b
            int r8 = r5.i
            if (r7 == r8) goto L60
            if (r8 != r1) goto L6e
        L60:
            int r7 = r2.f3452c
            if (r7 != 0) goto L6e
            int r7 = r5.f3458f
            if (r7 == r6) goto L6e
            r5.b(r3)
            r5.c()
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.d.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
