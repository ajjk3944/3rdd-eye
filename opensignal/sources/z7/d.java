package z7;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import h7.c1;

/* loaded from: classes.dex */
public final class d extends c1 {

    /* renamed from: a, reason: collision with root package name */
    public f f26691a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f26692b;

    /* renamed from: c, reason: collision with root package name */
    public final m f26693c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f26694d;

    /* renamed from: e, reason: collision with root package name */
    public int f26695e;

    /* renamed from: f, reason: collision with root package name */
    public int f26696f;

    /* renamed from: g, reason: collision with root package name */
    public final lb.c f26697g;

    /* renamed from: h, reason: collision with root package name */
    public int f26698h;

    /* renamed from: i, reason: collision with root package name */
    public int f26699i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f26700l;

    public d(ViewPager2 viewPager2) {
        this.f26692b = viewPager2;
        m mVar = viewPager2.E;
        this.f26693c = mVar;
        this.f26694d = (LinearLayoutManager) mVar.getLayoutManager();
        this.f26697g = new lb.c();
        d();
    }

    @Override // h7.c1
    public final void a(int i10) {
        f fVar;
        f fVar2;
        int i11 = this.f26695e;
        if (!(i11 == 1 && this.f26696f == 1) && i10 == 1) {
            this.f26695e = 1;
            int i12 = this.f26699i;
            if (i12 != -1) {
                this.f26698h = i12;
                this.f26699i = -1;
            } else if (this.f26698h == -1) {
                this.f26698h = this.f26694d.N0();
            }
            c(1);
            return;
        }
        if ((i11 == 1 || i11 == 4) && i10 == 2) {
            if (this.k) {
                c(2);
                this.j = true;
                return;
            }
            return;
        }
        lb.c cVar = this.f26697g;
        if ((i11 == 1 || i11 == 4) && i10 == 0) {
            e();
            if (!this.k) {
                int i13 = cVar.f15083b;
                if (i13 != -1 && (fVar2 = this.f26691a) != null) {
                    fVar2.b(i13, 0.0f, 0);
                }
            } else if (cVar.f15084c == 0) {
                int i14 = this.f26698h;
                int i15 = cVar.f15083b;
                if (i14 != i15 && (fVar = this.f26691a) != null) {
                    fVar.c(i15);
                }
            }
            c(0);
            d();
        }
        if (this.f26695e == 2 && i10 == 0 && this.f26700l) {
            e();
            if (cVar.f15084c == 0) {
                int i16 = this.f26699i;
                int i17 = cVar.f15083b;
                if (i16 != i17) {
                    if (i17 == -1) {
                        i17 = 0;
                    }
                    f fVar3 = this.f26691a;
                    if (fVar3 != null) {
                        fVar3.c(i17);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    @Override // h7.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.k = r6
            r5.e()
            boolean r0 = r5.j
            r1 = -1
            lb.c r2 = r5.f26697g
            r3 = 0
            if (r0 == 0) goto L40
            r5.j = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f26692b
            z7.h r8 = r8.f2155y
            int r8 = r8.C()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r2.f15084c
            if (r7 == 0) goto L30
            int r7 = r2.f15083b
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r2.f15083b
        L32:
            r5.f26699i = r7
            int r8 = r5.f26698h
            if (r8 == r7) goto L50
            z7.f r8 = r5.f26691a
            if (r8 == 0) goto L50
            r8.c(r7)
            goto L50
        L40:
            int r7 = r5.f26695e
            if (r7 != 0) goto L50
            int r7 = r2.f15083b
            if (r7 != r1) goto L49
            r7 = r3
        L49:
            z7.f r8 = r5.f26691a
            if (r8 == 0) goto L50
            r8.c(r7)
        L50:
            int r7 = r2.f15083b
            if (r7 != r1) goto L55
            r7 = r3
        L55:
            float r8 = r2.f15082a
            int r0 = r2.f15084c
            z7.f r4 = r5.f26691a
            if (r4 == 0) goto L60
            r4.b(r7, r8, r0)
        L60:
            int r7 = r2.f15083b
            int r8 = r5.f26699i
            if (r7 == r8) goto L68
            if (r8 != r1) goto L76
        L68:
            int r7 = r2.f15084c
            if (r7 != 0) goto L76
            int r7 = r5.f26696f
            if (r7 == r6) goto L76
            r5.c(r3)
            r5.d()
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.d.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i10) {
        if ((this.f26695e == 3 && this.f26696f == 0) || this.f26696f == i10) {
            return;
        }
        this.f26696f = i10;
        f fVar = this.f26691a;
        if (fVar != null) {
            fVar.a(i10);
        }
    }

    public final void d() {
        this.f26695e = 0;
        this.f26696f = 0;
        lb.c cVar = this.f26697g;
        cVar.f15083b = -1;
        cVar.f15082a = 0.0f;
        cVar.f15084c = 0;
        this.f26698h = -1;
        this.f26699i = -1;
        this.j = false;
        this.k = false;
        this.f26700l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.d.e():void");
    }
}
