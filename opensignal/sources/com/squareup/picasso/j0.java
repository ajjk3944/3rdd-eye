package com.squareup.picasso;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5910a;

    /* renamed from: b, reason: collision with root package name */
    public int f5911b;

    /* renamed from: c, reason: collision with root package name */
    public int f5912c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5913d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5914e;

    public j0(al.b bVar, dj.g gVar) {
        this.f5913d = bVar;
        this.f5910a = -1;
        this.f5911b = -1;
        fj.g gVarB = gVar.b();
        this.f5914e = gVarB;
        this.f5910a = bVar.e();
        this.f5911b = gVarB.l();
        a();
        ch.n.b("ConnectionSwitcher", "Init currentNetworkConnectionType: " + this.f5910a);
        ch.n.b("ConnectionSwitcher", "Init currentNetworkType: " + this.f5911b);
        ch.n.b("ConnectionSwitcher", "Init currentState: " + this.f5912c);
    }

    public static int c(wh.d dVar) {
        ch.n.b("ConnectionSwitcher", "updateFromGenerationThree() with [" + dVar + ']');
        int i10 = di.a.f7384a[dVar.ordinal()];
        if (i10 == 1) {
            return 10;
        }
        if (i10 == 2 || i10 == 3) {
            return 3;
        }
        return i10 != 4 ? 8 : 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.j0.a():int");
    }

    public void b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Height must be positive number or 0.");
        }
        if (i11 == 0 && i10 == 0) {
            throw new IllegalArgumentException("At least one dimension has to be positive number.");
        }
        this.f5911b = i10;
        this.f5912c = i11;
    }
}
