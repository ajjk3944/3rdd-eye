package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class AE {

    /* renamed from: c, reason: collision with root package name */
    public static final AE f6956c;

    /* renamed from: d, reason: collision with root package name */
    public static final AE f6957d;

    /* renamed from: e, reason: collision with root package name */
    public static final AE f6958e;

    /* renamed from: f, reason: collision with root package name */
    public static final AE f6959f;

    /* renamed from: g, reason: collision with root package name */
    public static final AE f6960g;

    /* renamed from: h, reason: collision with root package name */
    public static final AE f6961h;
    public static final AE i;

    /* renamed from: j, reason: collision with root package name */
    public static final AE f6962j;

    /* renamed from: k, reason: collision with root package name */
    public static final AE f6963k;

    /* renamed from: l, reason: collision with root package name */
    public static final AE f6964l;

    /* renamed from: m, reason: collision with root package name */
    public static final AE f6965m;

    /* renamed from: n, reason: collision with root package name */
    public static final AE f6966n;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6967a;

    /* renamed from: b, reason: collision with root package name */
    public String f6968b;

    static {
        int i3 = 0;
        f6956c = new AE("TINK", i3);
        f6957d = new AE("CRUNCHY", i3);
        f6958e = new AE("NO_PREFIX", i3);
        int i6 = 1;
        f6959f = new AE("TINK", i6);
        f6960g = new AE("NO_PREFIX", i6);
        int i7 = 2;
        f6961h = new AE("TINK", i7);
        i = new AE("CRUNCHY", i7);
        f6962j = new AE("NO_PREFIX", i7);
        int i8 = 3;
        f6963k = new AE("TINK", i8);
        f6964l = new AE("CRUNCHY", i8);
        f6965m = new AE("LEGACY", i8);
        f6966n = new AE("NO_PREFIX", i8);
    }

    public String toString() {
        switch (this.f6967a) {
            case 0:
                return this.f6968b;
            case 1:
                return this.f6968b;
            case 2:
                return this.f6968b;
            case 3:
                return this.f6968b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ AE(String str, int i3) {
        this.f6967a = i3;
        this.f6968b = str;
    }
}
