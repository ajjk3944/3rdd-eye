package ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y implements b0 {
    public boolean A;
    public boolean B;

    /* renamed from: e, reason: collision with root package name */
    public long f35483e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35484f;

    /* renamed from: h, reason: collision with root package name */
    public int f35485h;

    /* renamed from: i, reason: collision with root package name */
    public int f35486i;

    /* renamed from: m, reason: collision with root package name */
    public String[] f35489m;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f35495s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f35499w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f35500x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f35501y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f35502z;

    /* renamed from: a, reason: collision with root package name */
    public String f35479a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f35480b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f35481c = "";

    /* renamed from: d, reason: collision with root package name */
    public String f35482d = "";
    public String g = "";
    public String j = "";

    /* renamed from: k, reason: collision with root package name */
    public String f35487k = "";

    /* renamed from: l, reason: collision with root package name */
    public String f35488l = "";

    /* renamed from: n, reason: collision with root package name */
    public String f35490n = "";

    /* renamed from: o, reason: collision with root package name */
    public String f35491o = "";

    /* renamed from: p, reason: collision with root package name */
    public String f35492p = "";

    /* renamed from: q, reason: collision with root package name */
    public String f35493q = "";

    /* renamed from: r, reason: collision with root package name */
    public String f35494r = "";

    /* renamed from: t, reason: collision with root package name */
    public String f35496t = "";

    /* renamed from: u, reason: collision with root package name */
    public String f35497u = "";

    /* renamed from: v, reason: collision with root package name */
    public String f35498v = "";
    public String C = "";
    public final yj.n D = a.a.u(new r0.i0(8));

    public static void b(View view, int i4, int i10, boolean z3) {
        String string = view.getContext().getString(i4);
        nk.k.d(string, "getString(...)");
        String string2 = view.getContext().getString(i10);
        nk.k.d(string2, "getString(...)");
        c(view, z3, string, string2);
    }

    public static void c(View view, boolean z3, String str, String str2) {
        if (!z3) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            view.setOnClickListener(new hh.a(view, str, str2, 2));
        }
    }

    @Override // ui.b0
    public final b5.z a() {
        return (b5.z) this.D.getValue();
    }

    @Override // ui.b0
    public final String getName() {
        String string = a.a.f2b.getString(R.string.appi_general);
        nk.k.d(string, "getString(...)");
        return string;
    }
}
