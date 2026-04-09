package U9;

import java.util.concurrent.TimeUnit;

/* compiled from: CacheControl.kt */
/* renamed from: U9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1607d {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f12631n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12632a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12633b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12634c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12635d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12636e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12637f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12638g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12639h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f12640j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f12641k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12642l;

    /* renamed from: m, reason: collision with root package name */
    public String f12643m;

    /* compiled from: CacheControl.kt */
    /* renamed from: U9.d$a */
    public static final class a {
    }

    /* compiled from: CacheControl.kt */
    /* renamed from: U9.d$b */
    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static U9.C1607d a(U9.s r26) {
            /*
                Method dump skipped, instructions count: 479
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: U9.C1607d.b.a(U9.s):U9.d");
        }
    }

    static {
        new a();
        new a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        kotlin.jvm.internal.l.f(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public C1607d(boolean z10, boolean z11, int i, int i10, boolean z12, boolean z13, boolean z14, int i11, int i12, boolean z15, boolean z16, boolean z17, String str) {
        this.f12632a = z10;
        this.f12633b = z11;
        this.f12634c = i;
        this.f12635d = i10;
        this.f12636e = z12;
        this.f12637f = z13;
        this.f12638g = z14;
        this.f12639h = i11;
        this.i = i12;
        this.f12640j = z15;
        this.f12641k = z16;
        this.f12642l = z17;
        this.f12643m = str;
    }

    public final String toString() {
        String str = this.f12643m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f12632a) {
            sb.append("no-cache, ");
        }
        if (this.f12633b) {
            sb.append("no-store, ");
        }
        int i = this.f12634c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i10 = this.f12635d;
        if (i10 != -1) {
            sb.append("s-maxage=");
            sb.append(i10);
            sb.append(", ");
        }
        if (this.f12636e) {
            sb.append("private, ");
        }
        if (this.f12637f) {
            sb.append("public, ");
        }
        if (this.f12638g) {
            sb.append("must-revalidate, ");
        }
        int i11 = this.f12639h;
        if (i11 != -1) {
            sb.append("max-stale=");
            sb.append(i11);
            sb.append(", ");
        }
        int i12 = this.i;
        if (i12 != -1) {
            sb.append("min-fresh=");
            sb.append(i12);
            sb.append(", ");
        }
        if (this.f12640j) {
            sb.append("only-if-cached, ");
        }
        if (this.f12641k) {
            sb.append("no-transform, ");
        }
        if (this.f12642l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "StringBuilder().apply(builderAction).toString()");
        this.f12643m = string;
        return string;
    }
}
