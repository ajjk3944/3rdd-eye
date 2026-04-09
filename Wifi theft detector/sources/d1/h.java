package d1;

import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.appcompat.app.z;
import androidx.core.view.ViewCompat;
import d1.c;
import java.util.ArrayList;
import org.xbill.DNS.TTL;

/* loaded from: classes.dex */
public abstract class h implements c.InterfaceC0382c {

    /* renamed from: d, reason: collision with root package name */
    public final Object f20636d;

    /* renamed from: e, reason: collision with root package name */
    public final d1.i f20637e;

    /* renamed from: j, reason: collision with root package name */
    public float f20642j;

    /* renamed from: m, reason: collision with root package name */
    public d1.c f20645m;

    /* renamed from: n, reason: collision with root package name */
    public static final p f20620n = new f("translationX");

    /* renamed from: o, reason: collision with root package name */
    public static final p f20621o = new g("translationY");

    /* renamed from: p, reason: collision with root package name */
    public static final p f20622p = new C0383h("translationZ");

    /* renamed from: q, reason: collision with root package name */
    public static final p f20623q = new i("scaleX");

    /* renamed from: r, reason: collision with root package name */
    public static final p f20624r = new j("scaleY");

    /* renamed from: s, reason: collision with root package name */
    public static final p f20625s = new k("rotation");

    /* renamed from: t, reason: collision with root package name */
    public static final p f20626t = new l("rotationX");

    /* renamed from: u, reason: collision with root package name */
    public static final p f20627u = new m("rotationY");

    /* renamed from: v, reason: collision with root package name */
    public static final p f20628v = new n("x");

    /* renamed from: w, reason: collision with root package name */
    public static final p f20629w = new a("y");

    /* renamed from: x, reason: collision with root package name */
    public static final p f20630x = new b("z");

    /* renamed from: y, reason: collision with root package name */
    public static final p f20631y = new c("alpha");

    /* renamed from: z, reason: collision with root package name */
    public static final p f20632z = new d("scrollX");
    public static final p A = new e("scrollY");

    /* renamed from: a, reason: collision with root package name */
    public float f20633a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f20634b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20635c = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20638f = false;

    /* renamed from: g, reason: collision with root package name */
    public float f20639g = Float.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public float f20640h = -Float.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public long f20641i = 0;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f20643k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f20644l = new ArrayList();

    public class a extends p {
        public a(String str) {
            super(str, null);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    public class b extends p {
        public b(String str) {
            super(str, null);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return ViewCompat.L(view);
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            ViewCompat.B0(view, f10);
        }
    }

    public class c extends p {
        public c(String str) {
            super(str, null);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    public class d extends p {
        public d(String str) {
            super(str, null);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    public class e extends p {
        public e(String str) {
            super(str, null);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    public class f extends p {
        public f(String str) {
            super(str, null);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    public class g extends p {
        public g(String str) {
            super(str, null);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    /* renamed from: d1.h$h, reason: collision with other inner class name */
    public class C0383h extends p {
        public C0383h(String str) {
            super(str, null);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return ViewCompat.I(view);
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            ViewCompat.z0(view, f10);
        }
    }

    public class i extends p {
        public i(String str) {
            super(str, null);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    public class j extends p {
        public j(String str) {
            super(str, null);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    public class k extends p {
        public k(String str) {
            super(str, null);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    public class l extends p {
        public l(String str) {
            super(str, null);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    public class m extends p {
        public m(String str) {
            super(str, null);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    public class n extends p {
        public n(String str) {
            super(str, null);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    public static class o {

        /* renamed from: a, reason: collision with root package name */
        public float f20646a;

        /* renamed from: b, reason: collision with root package name */
        public float f20647b;
    }

    public static abstract class p extends d1.i {
        public /* synthetic */ p(String str, f fVar) {
            this(str);
        }

        public p(String str) {
            super(str);
        }
    }

    public h(Object obj, d1.i iVar) {
        this.f20636d = obj;
        this.f20637e = iVar;
        if (iVar == f20625s || iVar == f20626t || iVar == f20627u) {
            this.f20642j = 0.1f;
            return;
        }
        if (iVar == f20631y) {
            this.f20642j = 0.00390625f;
        } else if (iVar == f20623q || iVar == f20624r) {
            this.f20642j = 0.002f;
        } else {
            this.f20642j = 1.0f;
        }
    }

    public static void g(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // d1.c.InterfaceC0382c
    public boolean a(long j10) {
        long j11 = this.f20641i;
        if (j11 == 0) {
            this.f20641i = j10;
            h(this.f20634b);
            return false;
        }
        long j12 = j10 - j11;
        this.f20641i = j10;
        float fG = c().g();
        boolean zK = k(fG == 0.0f ? TTL.MAX_VALUE : (long) (j12 / fG));
        float fMin = Math.min(this.f20634b, this.f20639g);
        this.f20634b = fMin;
        float fMax = Math.max(fMin, this.f20640h);
        this.f20634b = fMax;
        h(fMax);
        if (zK) {
            b(false);
        }
        return zK;
    }

    public final void b(boolean z10) {
        this.f20638f = false;
        c().k(this);
        this.f20641i = 0L;
        this.f20635c = false;
        for (int i10 = 0; i10 < this.f20643k.size(); i10++) {
            if (this.f20643k.get(i10) != null) {
                z.a(this.f20643k.get(i10));
                throw null;
            }
        }
        g(this.f20643k);
    }

    public d1.c c() {
        d1.c cVar = this.f20645m;
        return cVar != null ? cVar : d1.c.h();
    }

    public final float d() {
        return this.f20637e.a(this.f20636d);
    }

    public float e() {
        return this.f20642j * 0.75f;
    }

    public boolean f() {
        return this.f20638f;
    }

    public void h(float f10) {
        this.f20637e.b(this.f20636d, f10);
        for (int i10 = 0; i10 < this.f20644l.size(); i10++) {
            if (this.f20644l.get(i10) != null) {
                z.a(this.f20644l.get(i10));
                throw null;
            }
        }
        g(this.f20644l);
    }

    public void i() {
        if (!c().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f20638f) {
            return;
        }
        j();
    }

    public final void j() {
        if (this.f20638f) {
            return;
        }
        this.f20638f = true;
        if (!this.f20635c) {
            this.f20634b = d();
        }
        float f10 = this.f20634b;
        if (f10 > this.f20639g || f10 < this.f20640h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        c().d(this, 0L);
    }

    public abstract boolean k(long j10);
}
