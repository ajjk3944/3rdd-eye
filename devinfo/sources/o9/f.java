package o9;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends c implements s9.a {
    public final float A;
    public final float B;
    public final float C;
    public final ja.c D;
    public boolean E;
    public boolean F;

    /* renamed from: o, reason: collision with root package name */
    public int f30456o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30457p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f30458q;

    /* renamed from: r, reason: collision with root package name */
    public float f30459r;

    /* renamed from: s, reason: collision with root package name */
    public final int f30460s;

    /* renamed from: t, reason: collision with root package name */
    public GradientDrawable f30461t;

    /* renamed from: u, reason: collision with root package name */
    public final int f30462u;

    /* renamed from: v, reason: collision with root package name */
    public float f30463v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f30464w;

    /* renamed from: x, reason: collision with root package name */
    public int f30465x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f30466y;

    /* renamed from: z, reason: collision with root package name */
    public final int f30467z;

    public f(String str, ArrayList arrayList) {
        super(arrayList, str);
        this.f30456o = Color.rgb(255, 187, 115);
        this.f30457p = true;
        this.f30458q = true;
        this.f30459r = 0.5f;
        this.f30459r = w9.g.c(0.5f);
        this.f30460s = Color.rgb(140, 234, 255);
        this.f30462u = 85;
        this.f30463v = 2.5f;
        this.f30464w = false;
        this.f30465x = 1;
        this.f30466y = null;
        this.f30467z = -1;
        this.A = 8.0f;
        this.B = 4.0f;
        this.C = 0.2f;
        this.D = new ja.c();
        this.E = true;
        this.F = true;
        ArrayList arrayList2 = new ArrayList();
        this.f30466y = arrayList2;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(Color.rgb(140, 234, 255)));
    }
}
