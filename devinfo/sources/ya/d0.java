package ya;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements za.c, com.bumptech.glide.load.data.c, e4.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f37431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37432b;

    public /* synthetic */ d0(Object obj, Object obj2) {
        this.f37431a = obj;
        this.f37432b = obj2;
    }

    @Override // com.bumptech.glide.load.data.c
    public void c(Exception exc) {
        z7.b0 b0Var = (z7.b0) this.f37432b;
        d8.u uVar = (d8.u) this.f37431a;
        d8.u uVar2 = b0Var.f37989f;
        if (uVar2 == null || uVar2 != uVar) {
            return;
        }
        z7.b0 b0Var2 = (z7.b0) this.f37432b;
        d8.u uVar3 = (d8.u) this.f37431a;
        z7.h hVar = b0Var2.f37985b;
        z7.d dVar = b0Var2.g;
        com.bumptech.glide.load.data.d dVar2 = uVar3.f22049c;
        hVar.b(dVar, exc, dVar2, dVar2.d());
    }

    @Override // com.bumptech.glide.load.data.c
    public void f(Object obj) {
        z7.b0 b0Var = (z7.b0) this.f37432b;
        d8.u uVar = (d8.u) this.f37431a;
        d8.u uVar2 = b0Var.f37989f;
        if (uVar2 == null || uVar2 != uVar) {
            return;
        }
        z7.b0 b0Var2 = (z7.b0) this.f37432b;
        d8.u uVar3 = (d8.u) this.f37431a;
        z7.j jVar = b0Var2.f37984a.f38013p;
        if (obj != null && jVar.a(uVar3.f22049c.d())) {
            b0Var2.f37988e = obj;
            b0Var2.f37985b.o(2);
        } else {
            z7.h hVar = b0Var2.f37985b;
            x7.e eVar = uVar3.f22047a;
            com.bumptech.glide.load.data.d dVar = uVar3.f22049c;
            hVar.c(eVar, obj, dVar, dVar.d(), b0Var2.g);
        }
    }

    @Override // za.c
    public za.k g(String str) {
        b0 b0Var = f0.f37440l;
        f0 f0Var = ua.j.C.f35261c;
        new u((Context) this.f37431a, (String) this.f37432b, str, null).A();
        return za.k.f38156a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    @Override // e4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e4.c2 j(android.view.View r20, e4.c2 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.Object r3 = r0.f37431a
            a4.d r3 = (a4.d) r3
            java.lang.Object r4 = r0.f37432b
            com.google.android.gms.internal.ads.h0 r4 = (com.google.android.gms.internal.ads.h0) r4
            int r5 = r4.f11671a
            int r6 = r4.f11672b
            int r4 = r4.f11673c
            e4.z1 r7 = r2.f22315a
            r8 = 519(0x207, float:7.27E-43)
            v3.b r8 = r7.g(r8)
            r9 = 32
            v3.b r7 = r7.g(r9)
            java.lang.Object r9 = r3.f189b
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            int r10 = r8.f35794b
            int r11 = r8.f35795c
            int r12 = r8.f35793a
            r9.f20377w = r10
            int r10 = r1.getLayoutDirection()
            r14 = 1
            if (r10 != r14) goto L37
            r10 = r14
            goto L38
        L37:
            r10 = 0
        L38:
            int r15 = r1.getPaddingBottom()
            int r16 = r1.getPaddingLeft()
            int r17 = r1.getPaddingRight()
            boolean r13 = r9.f20369o
            if (r13 == 0) goto L4f
            int r15 = r2.a()
            r9.f20376v = r15
            int r15 = r15 + r4
        L4f:
            boolean r4 = r9.f20370p
            if (r4 == 0) goto L5a
            if (r10 == 0) goto L57
            r4 = r6
            goto L58
        L57:
            r4 = r5
        L58:
            int r16 = r4 + r12
        L5a:
            r4 = r16
            boolean r14 = r9.f20371q
            if (r14 == 0) goto L66
            if (r10 == 0) goto L63
            goto L64
        L63:
            r5 = r6
        L64:
            int r17 = r5 + r11
        L66:
            r5 = r17
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            boolean r10 = r9.f20373s
            if (r10 == 0) goto L7b
            int r10 = r6.leftMargin
            if (r10 == r12) goto L7b
            r6.leftMargin = r12
            r18 = 1
            goto L7d
        L7b:
            r18 = 0
        L7d:
            boolean r10 = r9.f20374t
            if (r10 == 0) goto L89
            int r10 = r6.rightMargin
            if (r10 == r11) goto L89
            r6.rightMargin = r11
            r18 = 1
        L89:
            boolean r10 = r9.f20375u
            if (r10 == 0) goto L97
            int r10 = r6.topMargin
            int r8 = r8.f35794b
            if (r10 == r8) goto L97
            r6.topMargin = r8
            r14 = 1
            goto L99
        L97:
            r14 = r18
        L99:
            if (r14 == 0) goto L9e
            r1.setLayoutParams(r6)
        L9e:
            int r6 = r1.getPaddingTop()
            r1.setPadding(r4, r6, r5, r15)
            boolean r1 = r3.f188a
            if (r1 == 0) goto Lad
            int r3 = r7.f35796d
            r9.f20367m = r3
        Lad:
            if (r13 != 0) goto Lb3
            if (r1 == 0) goto Lb2
            goto Lb3
        Lb2:
            return r2
        Lb3:
            r9.Q()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.d0.j(android.view.View, e4.c2):e4.c2");
    }

    public d0(z7.b0 b0Var, d8.u uVar) {
        this.f37432b = b0Var;
        this.f37431a = uVar;
    }
}
