package a8;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import b5.g1;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.fx;
import d8.b0;
import d8.d0;
import d8.v;
import d8.w;
import ec.l1;
import ec.s0;
import ec.w1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import je.u;
import p.o1;
import p.t0;
import pb.y;
import t8.m;
import u0.l0;
import va.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a implements w, w1, l7.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217a;

    /* renamed from: b, reason: collision with root package name */
    public Object f218b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f217a = i4;
        this.f218b = obj;
    }

    public vd.b A() {
        return fx.f11274a.c((o1) this.f218b);
    }

    public void B() {
        l1 l1Var = ((ec.o1) this.f218b).g;
        ec.o1.m(l1Var);
        l1Var.B();
    }

    @Override // ec.w1
    public s0 a() {
        throw null;
    }

    @Override // ec.w1
    public l1 b() {
        throw null;
    }

    @Override // ec.w1
    public b7.h c() {
        throw null;
    }

    @Override // ec.w1
    public Context d() {
        throw null;
    }

    @Override // ec.w1
    public tb.a f() {
        throw null;
    }

    @Override // l7.f
    public List h() {
        return (List) this.f218b;
    }

    @Override // d8.w
    public v i(b0 b0Var) {
        return new d8.c(2, (d0) this.f218b);
    }

    @Override // l7.f
    public boolean j() {
        List list = (List) this.f218b;
        return list.isEmpty() || (list.size() == 1 && ((s7.a) list.get(0)).c());
    }

    public void k(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb2 = new StringBuilder(str2.length() + 108);
            sb2.append("Value ");
            sb2.append(str2);
            sb2.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            za.i.h(sb2.toString());
        }
        ((Bundle) ((t0) this.f218b).f30870h).putString(str, str2);
    }

    public a l(Bundle bundle) {
        t0 t0Var = (t0) this.f218b;
        ((Bundle) t0Var.f30868e).putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            ((HashSet) t0Var.g).remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return w();
    }

    public boolean m(int i4, l0 l0Var, Object obj) {
        ArrayList arrayList = l0Var.f34852a;
        if (arrayList == null) {
            n(i4, l0Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof u0.a) {
                if (obj2.equals(obj)) {
                    n(0, l0Var, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof l0)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (m(i4, (l0) obj2, obj)) {
                    n(0, l0Var, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    public void n(int i4, l0 l0Var, Object obj) {
        ((ArrayList) this.f218b).add(new h1.b(i4, null, null));
    }

    public abstract void o(o oVar);

    public com.facebook.shimmer.c p() {
        com.facebook.shimmer.c cVar = (com.facebook.shimmer.c) this.f218b;
        int[] iArr = cVar.f8944b;
        int i4 = cVar.f8948f;
        if (i4 != 1) {
            int i10 = cVar.f8947e;
            iArr[0] = i10;
            int i11 = cVar.f8946d;
            iArr[1] = i11;
            iArr[2] = i11;
            iArr[3] = i10;
        } else {
            int i12 = cVar.f8946d;
            iArr[0] = i12;
            iArr[1] = i12;
            int i13 = cVar.f8947e;
            iArr[2] = i13;
            iArr[3] = i13;
        }
        float[] fArr = cVar.f8943a;
        if (i4 != 1) {
            fArr[0] = Math.max(((1.0f - cVar.f8951k) - cVar.f8952l) / 2.0f, 0.0f);
            fArr[1] = Math.max(((1.0f - cVar.f8951k) - 0.001f) / 2.0f, 0.0f);
            fArr[2] = Math.min(((cVar.f8951k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((cVar.f8951k + 1.0f) + cVar.f8952l) / 2.0f, 1.0f);
            return cVar;
        }
        fArr[0] = 0.0f;
        fArr[1] = Math.min(cVar.f8951k, 1.0f);
        fArr[2] = Math.min(cVar.f8951k + cVar.f8952l, 1.0f);
        fArr[3] = 1.0f;
        return cVar;
    }

    public a q(TypedArray typedArray) {
        com.facebook.shimmer.c cVar = (com.facebook.shimmer.c) this.f218b;
        if (typedArray.hasValue(3)) {
            cVar.f8954n = typedArray.getBoolean(3, cVar.f8954n);
        }
        if (typedArray.hasValue(0)) {
            cVar.f8955o = typedArray.getBoolean(0, cVar.f8955o);
        }
        if (typedArray.hasValue(1)) {
            cVar.f8947e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (cVar.f8947e & 16777215);
        }
        if (typedArray.hasValue(11)) {
            cVar.f8946d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (16777215 & cVar.f8946d);
        }
        if (typedArray.hasValue(7)) {
            long j = typedArray.getInt(7, (int) cVar.f8959s);
            if (j < 0) {
                throw new IllegalArgumentException(a0.g.j(j, "Given a negative duration: "));
            }
            cVar.f8959s = j;
        }
        if (typedArray.hasValue(14)) {
            cVar.f8957q = typedArray.getInt(14, cVar.f8957q);
        }
        if (typedArray.hasValue(15)) {
            long j8 = typedArray.getInt(15, (int) cVar.f8960t);
            if (j8 < 0) {
                throw new IllegalArgumentException(a0.g.j(j8, "Given a negative repeat delay: "));
            }
            cVar.f8960t = j8;
        }
        if (typedArray.hasValue(16)) {
            cVar.f8958r = typedArray.getInt(16, cVar.f8958r);
        }
        if (typedArray.hasValue(5)) {
            int i4 = typedArray.getInt(5, cVar.f8945c);
            if (i4 == 1) {
                cVar.f8945c = 1;
            } else if (i4 == 2) {
                cVar.f8945c = 2;
            } else if (i4 != 3) {
                cVar.f8945c = 0;
            } else {
                cVar.f8945c = 3;
            }
        }
        if (typedArray.hasValue(17)) {
            if (typedArray.getInt(17, cVar.f8948f) != 1) {
                cVar.f8948f = 0;
            } else {
                cVar.f8948f = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            float f10 = typedArray.getFloat(6, cVar.f8952l);
            if (f10 < 0.0f) {
                throw new IllegalArgumentException("Given invalid dropoff value: " + f10);
            }
            cVar.f8952l = f10;
        }
        if (typedArray.hasValue(9)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, cVar.g);
            if (dimensionPixelSize < 0) {
                throw new IllegalArgumentException(u.r(dimensionPixelSize, "Given invalid width: "));
            }
            cVar.g = dimensionPixelSize;
        }
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, cVar.f8949h);
            if (dimensionPixelSize2 < 0) {
                throw new IllegalArgumentException(u.r(dimensionPixelSize2, "Given invalid height: "));
            }
            cVar.f8949h = dimensionPixelSize2;
        }
        if (typedArray.hasValue(13)) {
            float f11 = typedArray.getFloat(13, cVar.f8951k);
            if (f11 < 0.0f) {
                throw new IllegalArgumentException("Given invalid intensity value: " + f11);
            }
            cVar.f8951k = f11;
        }
        if (typedArray.hasValue(19)) {
            float f12 = typedArray.getFloat(19, cVar.f8950i);
            if (f12 < 0.0f) {
                throw new IllegalArgumentException("Given invalid width ratio: " + f12);
            }
            cVar.f8950i = f12;
        }
        if (typedArray.hasValue(10)) {
            float f13 = typedArray.getFloat(10, cVar.j);
            if (f13 < 0.0f) {
                throw new IllegalArgumentException("Given invalid height ratio: " + f13);
            }
            cVar.j = f13;
        }
        if (typedArray.hasValue(18)) {
            cVar.f8953m = typedArray.getFloat(18, cVar.f8953m);
        }
        return s();
    }

    public abstract String r();

    public abstract a s();

    public boolean t() {
        int i4;
        g1 g1Var = (g1) this.f218b;
        View view = g1Var.f1801c.H;
        if (view != null) {
            i4 = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i4 = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(u.r(visibility, "Unknown visibility "));
                    }
                    i4 = 3;
                }
            }
        } else {
            i4 = 0;
        }
        int i10 = g1Var.f1799a;
        if (i4 != i10) {
            return (i4 == 2 || i10 == 2) ? false : true;
        }
        return true;
    }

    public String toString() {
        switch (this.f217a) {
            case 6:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f218b;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(i iVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f218b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(iVar);
        }
    }

    public void v(int i4, Object obj, l0 l0Var, Object obj2) {
        if (nk.k.a(obj, u0.l.f34851a)) {
            n(i4, l0Var, null);
        }
    }

    public abstract a w();

    public void x(String str) {
        y.i(str, "Content URL must be non-null.");
        y.f(str, "Content URL must be non-empty.");
        int length = str.length();
        Object[] objArr = {512, Integer.valueOf(str.length())};
        if (!(length <= 512)) {
            throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
        }
        ((t0) this.f218b).j = str;
    }

    public void y(ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) ((t0) this.f218b).f30872k;
        arrayList2.clear();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                za.i.h("neighboring content URL should not be null or empty");
            } else {
                arrayList2.add(str);
            }
        }
    }

    public abstract void z();

    public a(ec.o1 o1Var) {
        this.f217a = 4;
        y.h(o1Var);
        this.f218b = o1Var;
    }

    public a(int i4) {
        this.f217a = i4;
        int i10 = 20;
        switch (i4) {
            case 2:
                this.f218b = new com.facebook.shimmer.c();
                break;
            case 3:
            case 4:
            case 6:
            case 9:
            default:
                char[] cArr = m.f34520a;
                this.f218b = new ArrayDeque(20);
                break;
            case 5:
                this.f218b = new ArrayList();
                break;
            case 7:
                t0 t0Var = new t0();
                this.f218b = t0Var;
                ((HashSet) t0Var.g).add("B3EEABB8EE11C2BE770B684D95219ECB");
                break;
            case 8:
                break;
            case 10:
                this.f218b = new o1(i10, this);
                break;
        }
    }

    public a(g1 g1Var) {
        this.f217a = 1;
        nk.k.e(g1Var, "operation");
        this.f218b = g1Var;
    }
}
