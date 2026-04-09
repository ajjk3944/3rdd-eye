package yh;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26305a = false;

    /* renamed from: b, reason: collision with root package name */
    public double f26306b;

    /* renamed from: c, reason: collision with root package name */
    public double f26307c;

    /* renamed from: d, reason: collision with root package name */
    public double f26308d;

    /* renamed from: e, reason: collision with root package name */
    public double f26309e;

    /* renamed from: f, reason: collision with root package name */
    public double f26310f;

    /* renamed from: g, reason: collision with root package name */
    public double f26311g;

    /* renamed from: h, reason: collision with root package name */
    public int f26312h;

    /* renamed from: i, reason: collision with root package name */
    public int f26313i;
    public double j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public double f26314l;

    /* renamed from: m, reason: collision with root package name */
    public final int f26315m;

    /* renamed from: n, reason: collision with root package name */
    public final int f26316n;

    /* renamed from: o, reason: collision with root package name */
    public final int f26317o;

    /* renamed from: p, reason: collision with root package name */
    public int f26318p;

    /* renamed from: q, reason: collision with root package name */
    public final String f26319q;

    /* renamed from: r, reason: collision with root package name */
    public String f26320r;

    /* renamed from: s, reason: collision with root package name */
    public int f26321s;

    /* renamed from: t, reason: collision with root package name */
    public String f26322t;

    /* renamed from: u, reason: collision with root package name */
    public String f26323u;

    /* renamed from: v, reason: collision with root package name */
    public String f26324v;

    /* renamed from: w, reason: collision with root package name */
    public List f26325w;

    /* renamed from: x, reason: collision with root package name */
    public List f26326x;

    public j(String str, int i10, int i11, int i12, int i13) {
        this.f26315m = i10;
        this.f26316n = i11;
        this.f26317o = i12;
        this.f26319q = str;
        this.f26321s = i13;
    }

    public final void a(long[] jArr, long[] jArr2, int[] iArr) {
        if (jArr == null) {
            jArr = new long[0];
        }
        this.f26322t = Arrays.toString(jArr).replaceAll("\\s+", "");
        if (jArr2 == null) {
            jArr2 = new long[0];
        }
        this.f26323u = Arrays.toString(jArr2).replaceAll("\\s+", "");
        if (iArr == null) {
            iArr = new int[0];
        }
        this.f26324v = Arrays.toString(iArr).replaceAll("\\s+", "");
    }
}
