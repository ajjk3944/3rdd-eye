package ed;

import android.graphics.Bitmap;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.z7;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class f implements a8.b, b8.a, si.g, cb.b, cm.l, ga.b, ec.v {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f f23280b = new f(2);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f f23281c = new f(13);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f f23282d = new f(14);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f f23283e = new f(15);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f f23284f = new f(16);
    public static final /* synthetic */ f g = new f(17);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f f23285h = new f(18);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ f f23286i = new f(19);
    public static final /* synthetic */ f j = new f(20);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ f f23287k = new f(21);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ f f23288l = new f(22);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ f f23289m = new f(23);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ f f23290n = new f(24);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ f f23291o = new f(25);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ f f23292p = new f(26);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ f f23293q = new f(27);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ f f23294r = new f(28);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ f f23295s = new f(29);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23296a;

    public /* synthetic */ f(int i4) {
        this.f23296a = i4;
    }

    public static final float k(float f10, float[] fArr, float[] fArr2) {
        float f11;
        float f12;
        float f13;
        float f14;
        float fAbs = Math.abs(f10);
        float fSignum = Math.signum(f10);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i4 = -(iBinarySearch + 1);
        int i10 = i4 - 1;
        if (i10 >= fArr.length - 1) {
            float f15 = fArr[fArr.length - 1];
            float f16 = fArr2[fArr.length - 1];
            if (f15 == 0.0f) {
                return 0.0f;
            }
            return (f16 / f15) * f10;
        }
        if (i10 == -1) {
            float f17 = fArr[0];
            f13 = fArr2[0];
            f14 = f17;
            f12 = 0.0f;
            f11 = 0.0f;
        } else {
            float f18 = fArr[i10];
            float f19 = fArr[i4];
            f11 = fArr2[i10];
            f12 = f18;
            f13 = fArr2[i4];
            f14 = f19;
        }
        return (((f13 - f11) * Math.max(0.0f, Math.min(1.0f, f12 == f14 ? 0.0f : (fAbs - f12) / (f14 - f12)))) + f11) * fSignum;
    }

    @Override // a8.b
    public Bitmap a(int i4, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i4, i10, config);
    }

    @Override // ec.v
    public Object b() {
        switch (this.f23296a) {
            case 13:
                return new Boolean(((Boolean) k7.f19808a.b()).booleanValue());
            case 14:
                return new Boolean(((Boolean) z7.f20069a.b()).booleanValue());
            case 15:
                List list = ec.d0.f22616a;
                p8.f19864b.get();
                Boolean bool = (Boolean) r8.f19905c.b();
                bool.getClass();
                return bool;
            case 16:
                List list2 = ec.d0.f22616a;
                c7.f19649b.get();
                return (String) e7.f19685e.b();
            case 17:
                List list3 = ec.d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19698l0.b()).longValue());
            case 18:
                List list4 = ec.d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19708q0.b()).longValue());
            case 19:
                List list5 = ec.d0.f22616a;
                c7.f19649b.get();
                return (String) e7.f19701n.b();
            case 20:
                List list6 = ec.d0.f22616a;
                c7.f19649b.get();
                Long l10 = (Long) e7.T.b();
                l10.getClass();
                return l10;
            case 21:
                List list7 = ec.d0.f22616a;
                c7.f19649b.get();
                Long l11 = (Long) e7.J.b();
                l11.getClass();
                return l11;
            case 22:
                List list8 = ec.d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.P.b()).longValue());
            case 23:
                List list9 = ec.d0.f22616a;
                c7.f19649b.get();
                Long l12 = (Long) e7.R.b();
                l12.getClass();
                return l12;
            case 24:
                List list10 = ec.d0.f22616a;
                c7.f19649b.get();
                Long l13 = (Long) e7.f19687f.b();
                l13.getClass();
                return l13;
            case 25:
                List list11 = ec.d0.f22616a;
                c7.f19649b.get();
                Long l14 = (Long) e7.f19691h0.b();
                l14.getClass();
                return l14;
            case 26:
                List list12 = ec.d0.f22616a;
                c7.f19649b.get();
                Long l15 = (Long) e7.f19723z.b();
                l15.getClass();
                return l15;
            case 27:
                List list13 = ec.d0.f22616a;
                c7.f19649b.get();
                Long l16 = (Long) e7.F.b();
                l16.getClass();
                return l16;
            case 28:
                List list14 = ec.d0.f22616a;
                c7.f19649b.get();
                Long l17 = (Long) e7.f19714t0.b();
                l17.getClass();
                return l17;
            default:
                List list15 = ec.d0.f22616a;
                c7.f19649b.get();
                Long l18 = (Long) e7.f19699m.b();
                l18.getClass();
                return l18;
        }
    }

    @Override // cm.l
    public cm.n create(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new cm.e(superclass);
    }

    @Override // a8.b
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // a8.b
    public Bitmap e(int i4, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i4, i10, config);
    }

    @Override // b8.a
    public File f(x7.e eVar) {
        return null;
    }

    @Override // xj.a
    public Object get() {
        return new d7.b(1, Executors.newSingleThreadExecutor());
    }

    @Override // si.g
    public void h(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (nk.k.a(((si.c) it.next()).f33798a, "devinfo_vip")) {
                ah.o.f400d.a();
                return;
            }
        }
    }

    public boolean l() {
        return this instanceof g;
    }

    public void m(float f10, float f11, float f12, x xVar) {
        xVar.c(f10, 0.0f);
    }

    @Override // cm.l
    public boolean matchesSocket(SSLSocket sSLSocket) {
        return vk.p.w0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // si.g
    public void c() {
    }

    @Override // a8.b
    public void j() {
    }

    @Override // a8.b
    public void i(int i4) {
    }

    @Override // b8.a
    public void g(x7.e eVar, w4.m mVar) {
    }
}
