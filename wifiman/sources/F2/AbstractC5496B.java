package f2;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.AbstractC6507a;

/* renamed from: f2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5496B {

    /* renamed from: c, reason: collision with root package name */
    public static final q f46666c = new q(null);

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC5496B f46667d = new i();

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC5496B f46668e = new m();

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC5496B f46669f = new g();

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC5496B f46670g = new h();

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC5496B f46671h = new l();

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC5496B f46672i = new j();

    /* renamed from: j, reason: collision with root package name */
    public static final AbstractC5496B f46673j = new k();

    /* renamed from: k, reason: collision with root package name */
    public static final AbstractC5496B f46674k = new f();

    /* renamed from: l, reason: collision with root package name */
    public static final AbstractC5496B f46675l = new d();

    /* renamed from: m, reason: collision with root package name */
    public static final AbstractC5496B f46676m = new e();

    /* renamed from: n, reason: collision with root package name */
    public static final AbstractC5496B f46677n = new c();

    /* renamed from: o, reason: collision with root package name */
    public static final AbstractC5496B f46678o = new a();

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC5496B f46679p = new b();

    /* renamed from: q, reason: collision with root package name */
    public static final AbstractC5496B f46680q = new p();

    /* renamed from: r, reason: collision with root package name */
    public static final AbstractC5496B f46681r = new n();

    /* renamed from: s, reason: collision with root package name */
    public static final AbstractC5496B f46682s = new o();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f46683a;

    /* renamed from: b, reason: collision with root package name */
    private final String f46684b = "nav_type";

    /* renamed from: f2.B$a */
    public static final class a extends AbstractC5504c {
        a() {
            super(true);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "boolean[]";
        }

        @Override // f2.AbstractC5504c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean[] k() {
            return new boolean[0];
        }

        @Override // f2.AbstractC5496B
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean[] a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // f2.AbstractC5496B
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean[] l(String value) {
            AbstractC6492s.i(value, "value");
            return new boolean[]{((Boolean) AbstractC5496B.f46677n.l(value)).booleanValue()};
        }

        @Override // f2.AbstractC5496B
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean[] g(String value, boolean[] zArr) {
            boolean[] zArrF;
            AbstractC6492s.i(value, "value");
            return (zArr == null || (zArrF = AbstractC3682n.F(zArr, f(value))) == null) ? f(value) : zArrF;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, boolean[] zArr) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putBooleanArray(key, zArr);
        }

        @Override // f2.AbstractC5504c
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List l(boolean[] zArr) {
            List listF1;
            if (zArr == null || (listF1 = AbstractC3682n.f1(zArr)) == null) {
                return AbstractC3689v.l();
            }
            List list = listF1;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(boolean[] zArr, boolean[] zArr2) {
            return AbstractC3682n.c(zArr != null ? AbstractC3682n.K(zArr) : null, zArr2 != null ? AbstractC3682n.K(zArr2) : null);
        }
    }

    /* renamed from: f2.B$b */
    public static final class b extends AbstractC5504c {
        b() {
            super(true);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "List<Boolean>";
        }

        @Override // f2.AbstractC5504c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List k() {
            return AbstractC3689v.l();
        }

        @Override // f2.AbstractC5496B
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            boolean[] zArr = (boolean[]) bundle.get(key);
            if (zArr != null) {
                return AbstractC3682n.f1(zArr);
            }
            return null;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List l(String value) {
            AbstractC6492s.i(value, "value");
            return AbstractC3689v.e(AbstractC5496B.f46677n.l(value));
        }

        @Override // f2.AbstractC5496B
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List g(String value, List list) {
            List listM0;
            AbstractC6492s.i(value, "value");
            return (list == null || (listM0 = AbstractC3689v.M0(list, f(value))) == null) ? f(value) : listM0;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List list) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putBooleanArray(key, list != null ? AbstractC3689v.c1(list) : null);
        }

        @Override // f2.AbstractC5504c
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List l(List list) {
            if (list == null) {
                return AbstractC3689v.l();
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List list, List list2) {
            return AbstractC3682n.c(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
        }
    }

    /* renamed from: f2.B$c */
    public static final class c extends AbstractC5496B {
        c() {
            super(false);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "boolean";
        }

        @Override // f2.AbstractC5496B
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            m(bundle, str, ((Boolean) obj).booleanValue());
        }

        @Override // f2.AbstractC5496B
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            return (Boolean) bundle.get(key);
        }

        @Override // f2.AbstractC5496B
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Boolean l(String value) {
            boolean z10;
            AbstractC6492s.i(value, "value");
            if (AbstractC6492s.d(value, "true")) {
                z10 = true;
            } else {
                if (!AbstractC6492s.d(value, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        public void m(Bundle bundle, String key, boolean z10) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putBoolean(key, z10);
        }
    }

    /* renamed from: f2.B$d */
    public static final class d extends AbstractC5504c {
        d() {
            super(true);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "float[]";
        }

        @Override // f2.AbstractC5504c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public float[] k() {
            return new float[0];
        }

        @Override // f2.AbstractC5496B
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public float[] a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // f2.AbstractC5496B
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public float[] l(String value) {
            AbstractC6492s.i(value, "value");
            return new float[]{((Number) AbstractC5496B.f46674k.l(value)).floatValue()};
        }

        @Override // f2.AbstractC5496B
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public float[] g(String value, float[] fArr) {
            float[] fArrZ;
            AbstractC6492s.i(value, "value");
            return (fArr == null || (fArrZ = AbstractC3682n.z(fArr, f(value))) == null) ? f(value) : fArrZ;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, float[] fArr) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putFloatArray(key, fArr);
        }

        @Override // f2.AbstractC5504c
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List l(float[] fArr) {
            List listA1;
            if (fArr == null || (listA1 = AbstractC3682n.a1(fArr)) == null) {
                return AbstractC3689v.l();
            }
            List list = listA1;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(float[] fArr, float[] fArr2) {
            return AbstractC3682n.c(fArr != null ? AbstractC3682n.L(fArr) : null, fArr2 != null ? AbstractC3682n.L(fArr2) : null);
        }
    }

    /* renamed from: f2.B$e */
    public static final class e extends AbstractC5504c {
        e() {
            super(true);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "List<Float>";
        }

        @Override // f2.AbstractC5504c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List k() {
            return AbstractC3689v.l();
        }

        @Override // f2.AbstractC5496B
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            float[] fArr = (float[]) bundle.get(key);
            if (fArr != null) {
                return AbstractC3682n.a1(fArr);
            }
            return null;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List l(String value) {
            AbstractC6492s.i(value, "value");
            return AbstractC3689v.e(AbstractC5496B.f46674k.l(value));
        }

        @Override // f2.AbstractC5496B
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List g(String value, List list) {
            List listM0;
            AbstractC6492s.i(value, "value");
            return (list == null || (listM0 = AbstractC3689v.M0(list, f(value))) == null) ? f(value) : listM0;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List list) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putFloatArray(key, list != null ? AbstractC3689v.f1(list) : null);
        }

        @Override // f2.AbstractC5504c
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List l(List list) {
            if (list == null) {
                return AbstractC3689v.l();
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List list, List list2) {
            return AbstractC3682n.c(list != null ? (Float[]) list.toArray(new Float[0]) : null, list2 != null ? (Float[]) list2.toArray(new Float[0]) : null);
        }
    }

    /* renamed from: f2.B$f */
    public static final class f extends AbstractC5496B {
        f() {
            super(false);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "float";
        }

        @Override // f2.AbstractC5496B
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            m(bundle, str, ((Number) obj).floatValue());
        }

        @Override // f2.AbstractC5496B
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            Object obj = bundle.get(key);
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Float l(String value) {
            AbstractC6492s.i(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        public void m(Bundle bundle, String key, float f10) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putFloat(key, f10);
        }
    }

    /* renamed from: f2.B$g */
    public static final class g extends AbstractC5504c {
        g() {
            super(true);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "integer[]";
        }

        @Override // f2.AbstractC5504c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public int[] k() {
            return new int[0];
        }

        @Override // f2.AbstractC5496B
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public int[] a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // f2.AbstractC5496B
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int[] l(String value) {
            AbstractC6492s.i(value, "value");
            return new int[]{((Number) AbstractC5496B.f46667d.l(value)).intValue()};
        }

        @Override // f2.AbstractC5496B
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public int[] g(String value, int[] iArr) {
            int[] iArrB;
            AbstractC6492s.i(value, "value");
            return (iArr == null || (iArrB = AbstractC3682n.B(iArr, f(value))) == null) ? f(value) : iArrB;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, int[] iArr) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putIntArray(key, iArr);
        }

        @Override // f2.AbstractC5504c
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List l(int[] iArr) {
            List listB1;
            if (iArr == null || (listB1 = AbstractC3682n.b1(iArr)) == null) {
                return AbstractC3689v.l();
            }
            List list = listB1;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(int[] iArr, int[] iArr2) {
            return AbstractC3682n.c(iArr != null ? AbstractC3682n.M(iArr) : null, iArr2 != null ? AbstractC3682n.M(iArr2) : null);
        }
    }

    /* renamed from: f2.B$h */
    public static final class h extends AbstractC5504c {
        h() {
            super(true);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "List<Int>";
        }

        @Override // f2.AbstractC5504c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List k() {
            return AbstractC3689v.l();
        }

        @Override // f2.AbstractC5496B
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            int[] iArr = (int[]) bundle.get(key);
            if (iArr != null) {
                return AbstractC3682n.b1(iArr);
            }
            return null;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List l(String value) {
            AbstractC6492s.i(value, "value");
            return AbstractC3689v.e(AbstractC5496B.f46667d.l(value));
        }

        @Override // f2.AbstractC5496B
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List g(String value, List list) {
            List listM0;
            AbstractC6492s.i(value, "value");
            return (list == null || (listM0 = AbstractC3689v.M0(list, f(value))) == null) ? f(value) : listM0;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List list) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putIntArray(key, list != null ? AbstractC3689v.h1(list) : null);
        }

        @Override // f2.AbstractC5504c
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List l(List list) {
            if (list == null) {
                return AbstractC3689v.l();
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List list, List list2) {
            return AbstractC3682n.c(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
        }
    }

    /* renamed from: f2.B$i */
    public static final class i extends AbstractC5496B {
        i() {
            super(false);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "integer";
        }

        @Override // f2.AbstractC5496B
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            m(bundle, str, ((Number) obj).intValue());
        }

        @Override // f2.AbstractC5496B
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            Object obj = bundle.get(key);
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer l(String value) throws NumberFormatException {
            int i10;
            AbstractC6492s.i(value, "value");
            if (kotlin.text.t.P(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                AbstractC6492s.h(strSubstring, "substring(...)");
                i10 = Integer.parseInt(strSubstring, AbstractC6507a.a(16));
            } else {
                i10 = Integer.parseInt(value);
            }
            return Integer.valueOf(i10);
        }

        public void m(Bundle bundle, String key, int i10) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putInt(key, i10);
        }
    }

    /* renamed from: f2.B$j */
    public static final class j extends AbstractC5504c {
        j() {
            super(true);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "long[]";
        }

        @Override // f2.AbstractC5504c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public long[] k() {
            return new long[0];
        }

        @Override // f2.AbstractC5496B
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public long[] a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // f2.AbstractC5496B
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public long[] l(String value) {
            AbstractC6492s.i(value, "value");
            return new long[]{((Number) AbstractC5496B.f46671h.l(value)).longValue()};
        }

        @Override // f2.AbstractC5496B
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public long[] g(String value, long[] jArr) {
            long[] jArrC;
            AbstractC6492s.i(value, "value");
            return (jArr == null || (jArrC = AbstractC3682n.C(jArr, f(value))) == null) ? f(value) : jArrC;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, long[] jArr) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putLongArray(key, jArr);
        }

        @Override // f2.AbstractC5504c
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List l(long[] jArr) {
            List listC1;
            if (jArr == null || (listC1 = AbstractC3682n.c1(jArr)) == null) {
                return AbstractC3689v.l();
            }
            List list = listC1;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(long[] jArr, long[] jArr2) {
            return AbstractC3682n.c(jArr != null ? AbstractC3682n.N(jArr) : null, jArr2 != null ? AbstractC3682n.N(jArr2) : null);
        }
    }

    /* renamed from: f2.B$k */
    public static final class k extends AbstractC5504c {
        k() {
            super(true);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "List<Long>";
        }

        @Override // f2.AbstractC5504c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List k() {
            return AbstractC3689v.l();
        }

        @Override // f2.AbstractC5496B
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            long[] jArr = (long[]) bundle.get(key);
            if (jArr != null) {
                return AbstractC3682n.c1(jArr);
            }
            return null;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List l(String value) {
            AbstractC6492s.i(value, "value");
            return AbstractC3689v.e(AbstractC5496B.f46671h.l(value));
        }

        @Override // f2.AbstractC5496B
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List g(String value, List list) {
            List listM0;
            AbstractC6492s.i(value, "value");
            return (list == null || (listM0 = AbstractC3689v.M0(list, f(value))) == null) ? f(value) : listM0;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List list) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putLongArray(key, list != null ? AbstractC3689v.j1(list) : null);
        }

        @Override // f2.AbstractC5504c
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List l(List list) {
            if (list == null) {
                return AbstractC3689v.l();
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List list, List list2) {
            return AbstractC3682n.c(list != null ? (Long[]) list.toArray(new Long[0]) : null, list2 != null ? (Long[]) list2.toArray(new Long[0]) : null);
        }
    }

    /* renamed from: f2.B$l */
    public static final class l extends AbstractC5496B {
        l() {
            super(false);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "long";
        }

        @Override // f2.AbstractC5496B
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            m(bundle, str, ((Number) obj).longValue());
        }

        @Override // f2.AbstractC5496B
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Long a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            Object obj = bundle.get(key);
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Long l(String value) throws NumberFormatException {
            String strSubstring;
            long j10;
            AbstractC6492s.i(value, "value");
            if (kotlin.text.t.B(value, "L", false, 2, null)) {
                strSubstring = value.substring(0, value.length() - 1);
                AbstractC6492s.h(strSubstring, "substring(...)");
            } else {
                strSubstring = value;
            }
            if (kotlin.text.t.P(value, "0x", false, 2, null)) {
                String strSubstring2 = strSubstring.substring(2);
                AbstractC6492s.h(strSubstring2, "substring(...)");
                j10 = Long.parseLong(strSubstring2, AbstractC6507a.a(16));
            } else {
                j10 = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j10);
        }

        public void m(Bundle bundle, String key, long j10) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putLong(key, j10);
        }
    }

    /* renamed from: f2.B$m */
    public static final class m extends AbstractC5496B {
        m() {
            super(false);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "reference";
        }

        @Override // f2.AbstractC5496B
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            m(bundle, str, ((Number) obj).intValue());
        }

        @Override // f2.AbstractC5496B
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            Object obj = bundle.get(key);
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer l(String value) throws NumberFormatException {
            int i10;
            AbstractC6492s.i(value, "value");
            if (kotlin.text.t.P(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                AbstractC6492s.h(strSubstring, "substring(...)");
                i10 = Integer.parseInt(strSubstring, AbstractC6507a.a(16));
            } else {
                i10 = Integer.parseInt(value);
            }
            return Integer.valueOf(i10);
        }

        public void m(Bundle bundle, String key, int i10) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putInt(key, i10);
        }
    }

    /* renamed from: f2.B$n */
    public static final class n extends AbstractC5504c {
        n() {
            super(true);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "string[]";
        }

        @Override // f2.AbstractC5504c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public String[] k() {
            return new String[0];
        }

        @Override // f2.AbstractC5496B
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public String[] a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // f2.AbstractC5496B
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public String[] l(String value) {
            AbstractC6492s.i(value, "value");
            return new String[]{value};
        }

        @Override // f2.AbstractC5496B
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public String[] g(String value, String[] strArr) {
            String[] strArr2;
            AbstractC6492s.i(value, "value");
            return (strArr == null || (strArr2 = (String[]) AbstractC3682n.E(strArr, f(value))) == null) ? f(value) : strArr2;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, String[] strArr) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putStringArray(key, strArr);
        }

        @Override // f2.AbstractC5504c
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List l(String[] strArr) {
            if (strArr == null) {
                return AbstractC3689v.l();
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(Uri.encode(str));
            }
            return arrayList;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(String[] strArr, String[] strArr2) {
            return AbstractC3682n.c(strArr, strArr2);
        }
    }

    /* renamed from: f2.B$o */
    public static final class o extends AbstractC5504c {
        o() {
            super(true);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "List<String>";
        }

        @Override // f2.AbstractC5504c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List k() {
            return AbstractC3689v.l();
        }

        @Override // f2.AbstractC5496B
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            String[] strArr = (String[]) bundle.get(key);
            if (strArr != null) {
                return AbstractC3682n.d1(strArr);
            }
            return null;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List l(String value) {
            AbstractC6492s.i(value, "value");
            return AbstractC3689v.e(value);
        }

        @Override // f2.AbstractC5496B
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List g(String value, List list) {
            List listM0;
            AbstractC6492s.i(value, "value");
            return (list == null || (listM0 = AbstractC3689v.M0(list, f(value))) == null) ? f(value) : listM0;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List list) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putStringArray(key, list != null ? (String[]) list.toArray(new String[0]) : null);
        }

        @Override // f2.AbstractC5504c
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List l(List list) {
            if (list == null) {
                return AbstractC3689v.l();
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.encode((String) it.next()));
            }
            return arrayList;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List list, List list2) {
            return AbstractC3682n.c(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
        }
    }

    /* renamed from: f2.B$p */
    public static final class p extends AbstractC5496B {
        p() {
            super(true);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            return "string";
        }

        @Override // f2.AbstractC5496B
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public String a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            return (String) bundle.get(key);
        }

        @Override // f2.AbstractC5496B
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public String l(String value) {
            AbstractC6492s.i(value, "value");
            if (AbstractC6492s.d(value, "null")) {
                return null;
            }
            return value;
        }

        @Override // f2.AbstractC5496B
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, String str) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            bundle.putString(key, str);
        }

        @Override // f2.AbstractC5496B
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public String i(String str) {
            String strEncode = str != null ? Uri.encode(str) : null;
            return strEncode == null ? "null" : strEncode;
        }
    }

    /* renamed from: f2.B$q */
    public static final class q {
        public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final f2.AbstractC5496B a(java.lang.Object r4) {
            /*
                Method dump skipped, instructions count: 298
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.AbstractC5496B.q.a(java.lang.Object):f2.B");
        }

        private q() {
        }
    }

    /* renamed from: f2.B$r */
    public static final class r extends v {

        /* renamed from: u, reason: collision with root package name */
        private final Class f46685u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Class type) {
            super(false, type);
            AbstractC6492s.i(type, "type");
            if (type.isEnum()) {
                this.f46685u = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // f2.AbstractC5496B.v, f2.AbstractC5496B
        public String b() {
            String name = this.f46685u.getName();
            AbstractC6492s.h(name, "type.name");
            return name;
        }

        @Override // f2.AbstractC5496B.v
        /* renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Enum l(String value) {
            Object obj;
            AbstractC6492s.i(value, "value");
            Object[] enumConstants = this.f46685u.getEnumConstants();
            AbstractC6492s.h(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    obj = null;
                    break;
                }
                obj = enumConstants[i10];
                if (kotlin.text.t.C(((Enum) obj).name(), value, true)) {
                    break;
                }
                i10++;
            }
            Enum r32 = (Enum) obj;
            if (r32 != null) {
                return r32;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.f46685u.getName() + '.');
        }
    }

    /* renamed from: f2.B$s */
    public static final class s extends AbstractC5496B {

        /* renamed from: t, reason: collision with root package name */
        private final Class f46686t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Class type) throws ClassNotFoundException {
            super(true);
            AbstractC6492s.i(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                Class<?> cls = Class.forName("[L" + type.getName() + ';');
                AbstractC6492s.g(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.f46686t = cls;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // f2.AbstractC5496B
        public String b() {
            String name = this.f46686t.getName();
            AbstractC6492s.h(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !AbstractC6492s.d(s.class, obj.getClass())) {
                return false;
            }
            return AbstractC6492s.d(this.f46686t, ((s) obj).f46686t);
        }

        public int hashCode() {
            return this.f46686t.hashCode();
        }

        @Override // f2.AbstractC5496B
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Parcelable[] a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            return (Parcelable[]) bundle.get(key);
        }

        @Override // f2.AbstractC5496B
        public Parcelable[] l(String value) {
            AbstractC6492s.i(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // f2.AbstractC5496B
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, Parcelable[] parcelableArr) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            this.f46686t.cast(parcelableArr);
            bundle.putParcelableArray(key, parcelableArr);
        }

        @Override // f2.AbstractC5496B
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean j(Parcelable[] parcelableArr, Parcelable[] parcelableArr2) {
            return AbstractC3682n.c(parcelableArr, parcelableArr2);
        }
    }

    /* renamed from: f2.B$t */
    public static final class t extends AbstractC5496B {

        /* renamed from: t, reason: collision with root package name */
        private final Class f46687t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Class type) {
            super(true);
            AbstractC6492s.i(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.f46687t = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // f2.AbstractC5496B
        public Object a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            return bundle.get(key);
        }

        @Override // f2.AbstractC5496B
        public String b() {
            String name = this.f46687t.getName();
            AbstractC6492s.h(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !AbstractC6492s.d(t.class, obj.getClass())) {
                return false;
            }
            return AbstractC6492s.d(this.f46687t, ((t) obj).f46687t);
        }

        @Override // f2.AbstractC5496B
        /* renamed from: f */
        public Object l(String value) {
            AbstractC6492s.i(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // f2.AbstractC5496B
        public void h(Bundle bundle, String key, Object obj) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            this.f46687t.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) obj);
            }
        }

        public int hashCode() {
            return this.f46687t.hashCode();
        }
    }

    /* renamed from: f2.B$u */
    public static final class u extends AbstractC5496B {

        /* renamed from: t, reason: collision with root package name */
        private final Class f46688t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Class type) throws ClassNotFoundException {
            super(true);
            AbstractC6492s.i(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                Class<?> cls = Class.forName("[L" + type.getName() + ';');
                AbstractC6492s.g(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.f46688t = cls;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // f2.AbstractC5496B
        public String b() {
            String name = this.f46688t.getName();
            AbstractC6492s.h(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !AbstractC6492s.d(u.class, obj.getClass())) {
                return false;
            }
            return AbstractC6492s.d(this.f46688t, ((u) obj).f46688t);
        }

        public int hashCode() {
            return this.f46688t.hashCode();
        }

        @Override // f2.AbstractC5496B
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Serializable[] a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            return (Serializable[]) bundle.get(key);
        }

        @Override // f2.AbstractC5496B
        public Serializable[] l(String value) {
            AbstractC6492s.i(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f2.AbstractC5496B
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, Serializable[] serializableArr) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            this.f46688t.cast(serializableArr);
            bundle.putSerializable(key, serializableArr);
        }

        @Override // f2.AbstractC5496B
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean j(Serializable[] serializableArr, Serializable[] serializableArr2) {
            return AbstractC3682n.c(serializableArr, serializableArr2);
        }
    }

    public AbstractC5496B(boolean z10) {
        this.f46683a = z10;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public boolean c() {
        return this.f46683a;
    }

    public final Object d(Bundle bundle, String key, String value) {
        AbstractC6492s.i(bundle, "bundle");
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(value, "value");
        Object objL = l(value);
        h(bundle, key, objL);
        return objL;
    }

    public final Object e(Bundle bundle, String key, String str, Object obj) {
        AbstractC6492s.i(bundle, "bundle");
        AbstractC6492s.i(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if (str == null) {
            return obj;
        }
        Object objG = g(str, obj);
        h(bundle, key, objG);
        return objG;
    }

    /* renamed from: f */
    public abstract Object l(String str);

    public Object g(String value, Object obj) {
        AbstractC6492s.i(value, "value");
        return l(value);
    }

    public abstract void h(Bundle bundle, String str, Object obj);

    public String i(Object obj) {
        return String.valueOf(obj);
    }

    public boolean j(Object obj, Object obj2) {
        return AbstractC6492s.d(obj, obj2);
    }

    public String toString() {
        return b();
    }

    /* renamed from: f2.B$v */
    public static class v extends AbstractC5496B {

        /* renamed from: t, reason: collision with root package name */
        private final Class f46689t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Class type) {
            super(true);
            AbstractC6492s.i(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.f46689t = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // f2.AbstractC5496B
        public String b() {
            String name = this.f46689t.getName();
            AbstractC6492s.h(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof v) {
                return AbstractC6492s.d(this.f46689t, ((v) obj).f46689t);
            }
            return false;
        }

        public int hashCode() {
            return this.f46689t.hashCode();
        }

        @Override // f2.AbstractC5496B
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Serializable a(Bundle bundle, String key) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            return (Serializable) bundle.get(key);
        }

        @Override // f2.AbstractC5496B
        public Serializable l(String value) {
            AbstractC6492s.i(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // f2.AbstractC5496B
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, Serializable value) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC6492s.i(key, "key");
            AbstractC6492s.i(value, "value");
            this.f46689t.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(boolean z10, Class type) {
            super(z10);
            AbstractC6492s.i(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.f46689t = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }
}
