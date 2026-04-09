package i2;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import m0.C5313f;
import n2.C5350d;
import n2.C5354h;
import u2.C5624c;
import u2.C5629h;

/* compiled from: LottieComposition.java */
/* renamed from: i2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4448h {

    /* renamed from: c, reason: collision with root package name */
    public HashMap f38347c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f38348d;

    /* renamed from: e, reason: collision with root package name */
    public float f38349e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f38350f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f38351g;

    /* renamed from: h, reason: collision with root package name */
    public m0.j<C5350d> f38352h;
    public C5313f<q2.e> i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f38353j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f38354k;

    /* renamed from: l, reason: collision with root package name */
    public float f38355l;

    /* renamed from: m, reason: collision with root package name */
    public float f38356m;

    /* renamed from: n, reason: collision with root package name */
    public float f38357n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f38358o;

    /* renamed from: a, reason: collision with root package name */
    public final C4437J f38345a = new C4437J();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet<String> f38346b = new HashSet<>();

    /* renamed from: p, reason: collision with root package name */
    public int f38359p = 0;

    public final void a(String str) {
        C5624c.b(str);
        this.f38346b.add(str);
    }

    public final float b() {
        return (long) (((this.f38356m - this.f38355l) / this.f38357n) * 1000.0f);
    }

    public final Map<String, C4430C> c() {
        float fC = C5629h.c();
        if (fC != this.f38349e) {
            for (Map.Entry entry : this.f38348d.entrySet()) {
                HashMap map = this.f38348d;
                String str = (String) entry.getKey();
                C4430C c4430c = (C4430C) entry.getValue();
                float f10 = this.f38349e / fC;
                int i = (int) (c4430c.f38283a * f10);
                int i10 = (int) (c4430c.f38284b * f10);
                C4430C c4430c2 = new C4430C(c4430c.f38285c, i, c4430c.f38286d, i10, c4430c.f38287e);
                Bitmap bitmap = c4430c.f38288f;
                if (bitmap != null) {
                    c4430c2.f38288f = Bitmap.createScaledBitmap(bitmap, i, i10, true);
                }
                map.put(str, c4430c2);
            }
        }
        this.f38349e = fC;
        return this.f38348d;
    }

    public final C5354h d(String str) {
        int size = this.f38351g.size();
        for (int i = 0; i < size; i++) {
            C5354h c5354h = (C5354h) this.f38351g.get(i);
            String str2 = c5354h.f44274a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return c5354h;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f38353j.iterator();
        while (it.hasNext()) {
            sb.append(((q2.e) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
