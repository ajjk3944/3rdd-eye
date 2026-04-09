package a0;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.c;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import z.c;

/* loaded from: classes.dex */
public class k implements Comparable {
    public static String[] D = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: c, reason: collision with root package name */
    public int f17c;

    /* renamed from: p, reason: collision with root package name */
    public v.c f30p;

    /* renamed from: r, reason: collision with root package name */
    public float f32r;

    /* renamed from: s, reason: collision with root package name */
    public float f33s;

    /* renamed from: t, reason: collision with root package name */
    public float f34t;

    /* renamed from: u, reason: collision with root package name */
    public float f35u;

    /* renamed from: v, reason: collision with root package name */
    public float f36v;

    /* renamed from: a, reason: collision with root package name */
    public float f15a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f16b = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18d = false;

    /* renamed from: e, reason: collision with root package name */
    public float f19e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f20f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f21g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f22h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f23i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f24j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f25k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f26l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f27m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f28n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    public float f29o = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    public int f31q = 0;

    /* renamed from: w, reason: collision with root package name */
    public float f37w = Float.NaN;

    /* renamed from: x, reason: collision with root package name */
    public float f38x = Float.NaN;

    /* renamed from: y, reason: collision with root package name */
    public int f39y = -1;

    /* renamed from: z, reason: collision with root package name */
    public LinkedHashMap f40z = new LinkedHashMap();
    public int A = 0;
    public double[] B = new double[18];
    public double[] C = new double[18];

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(HashMap map, int i10) {
        for (String str : map.keySet()) {
            z.c cVar = (z.c) map.get(str);
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c10 = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c10 = '\r';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    cVar.b(i10, Float.isNaN(this.f21g) ? 0.0f : this.f21g);
                    break;
                case 1:
                    cVar.b(i10, Float.isNaN(this.f22h) ? 0.0f : this.f22h);
                    break;
                case 2:
                    cVar.b(i10, Float.isNaN(this.f27m) ? 0.0f : this.f27m);
                    break;
                case 3:
                    cVar.b(i10, Float.isNaN(this.f28n) ? 0.0f : this.f28n);
                    break;
                case 4:
                    cVar.b(i10, Float.isNaN(this.f29o) ? 0.0f : this.f29o);
                    break;
                case 5:
                    cVar.b(i10, Float.isNaN(this.f38x) ? 0.0f : this.f38x);
                    break;
                case 6:
                    cVar.b(i10, Float.isNaN(this.f23i) ? 1.0f : this.f23i);
                    break;
                case 7:
                    cVar.b(i10, Float.isNaN(this.f24j) ? 1.0f : this.f24j);
                    break;
                case '\b':
                    cVar.b(i10, Float.isNaN(this.f25k) ? 0.0f : this.f25k);
                    break;
                case '\t':
                    cVar.b(i10, Float.isNaN(this.f26l) ? 0.0f : this.f26l);
                    break;
                case '\n':
                    cVar.b(i10, Float.isNaN(this.f20f) ? 0.0f : this.f20f);
                    break;
                case 11:
                    cVar.b(i10, Float.isNaN(this.f19e) ? 0.0f : this.f19e);
                    break;
                case '\f':
                    cVar.b(i10, Float.isNaN(this.f37w) ? 0.0f : this.f37w);
                    break;
                case '\r':
                    cVar.b(i10, Float.isNaN(this.f15a) ? 1.0f : this.f15a);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f40z.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f40z.get(str2);
                            if (cVar instanceof c.b) {
                                ((c.b) cVar).h(i10, constraintAttribute);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + constraintAttribute.c() + cVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    public void b(View view) {
        this.f17c = view.getVisibility();
        this.f15a = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f18d = false;
        this.f19e = view.getElevation();
        this.f20f = view.getRotation();
        this.f21g = view.getRotationX();
        this.f22h = view.getRotationY();
        this.f23i = view.getScaleX();
        this.f24j = view.getScaleY();
        this.f25k = view.getPivotX();
        this.f26l = view.getPivotY();
        this.f27m = view.getTranslationX();
        this.f28n = view.getTranslationY();
        this.f29o = view.getTranslationZ();
    }

    public void c(c.a aVar) {
        c.d dVar = aVar.f2200c;
        int i10 = dVar.f2278c;
        this.f16b = i10;
        int i11 = dVar.f2277b;
        this.f17c = i11;
        this.f15a = (i11 == 0 || i10 != 0) ? dVar.f2279d : 0.0f;
        c.e eVar = aVar.f2203f;
        this.f18d = eVar.f2294m;
        this.f19e = eVar.f2295n;
        this.f20f = eVar.f2283b;
        this.f21g = eVar.f2284c;
        this.f22h = eVar.f2285d;
        this.f23i = eVar.f2286e;
        this.f24j = eVar.f2287f;
        this.f25k = eVar.f2288g;
        this.f26l = eVar.f2289h;
        this.f27m = eVar.f2291j;
        this.f28n = eVar.f2292k;
        this.f29o = eVar.f2293l;
        this.f30p = v.c.c(aVar.f2201d.f2265d);
        c.C0014c c0014c = aVar.f2201d;
        this.f37w = c0014c.f2270i;
        this.f31q = c0014c.f2267f;
        this.f39y = c0014c.f2263b;
        this.f38x = aVar.f2200c.f2280e;
        for (String str : aVar.f2204g.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) aVar.f2204g.get(str);
            if (constraintAttribute.e()) {
                this.f40z.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        return Float.compare(this.f32r, kVar.f32r);
    }

    public final boolean f(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) != Float.isNaN(f11) : Math.abs(f10 - f11) > 1.0E-6f;
    }

    public void g(k kVar, HashSet hashSet) {
        if (f(this.f15a, kVar.f15a)) {
            hashSet.add("alpha");
        }
        if (f(this.f19e, kVar.f19e)) {
            hashSet.add("elevation");
        }
        int i10 = this.f17c;
        int i11 = kVar.f17c;
        if (i10 != i11 && this.f16b == 0 && (i10 == 0 || i11 == 0)) {
            hashSet.add("alpha");
        }
        if (f(this.f20f, kVar.f20f)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f37w) || !Float.isNaN(kVar.f37w)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f38x) || !Float.isNaN(kVar.f38x)) {
            hashSet.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (f(this.f21g, kVar.f21g)) {
            hashSet.add("rotationX");
        }
        if (f(this.f22h, kVar.f22h)) {
            hashSet.add("rotationY");
        }
        if (f(this.f25k, kVar.f25k)) {
            hashSet.add("transformPivotX");
        }
        if (f(this.f26l, kVar.f26l)) {
            hashSet.add("transformPivotY");
        }
        if (f(this.f23i, kVar.f23i)) {
            hashSet.add("scaleX");
        }
        if (f(this.f24j, kVar.f24j)) {
            hashSet.add("scaleY");
        }
        if (f(this.f27m, kVar.f27m)) {
            hashSet.add("translationX");
        }
        if (f(this.f28n, kVar.f28n)) {
            hashSet.add("translationY");
        }
        if (f(this.f29o, kVar.f29o)) {
            hashSet.add("translationZ");
        }
    }

    public void h(float f10, float f11, float f12, float f13) {
        this.f33s = f10;
        this.f34t = f11;
        this.f35u = f12;
        this.f36v = f13;
    }

    public void i(Rect rect, androidx.constraintlayout.widget.c cVar, int i10, int i11) {
        h(rect.left, rect.top, rect.width(), rect.height());
        c(cVar.y(i11));
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                }
            }
            float f10 = this.f20f + 90.0f;
            this.f20f = f10;
            if (f10 > 180.0f) {
                this.f20f = f10 - 360.0f;
                return;
            }
            return;
        }
        this.f20f -= 90.0f;
    }

    public void j(View view) {
        h(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        b(view);
    }
}
