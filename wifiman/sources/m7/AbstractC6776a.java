package m7;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oh.AbstractC7137b;
import org.snmp4j.transport.TLSTM;

/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6776a extends e {

    /* renamed from: u, reason: collision with root package name */
    public static final C1951a f53149u = new C1951a(null);

    /* renamed from: g, reason: collision with root package name */
    private float f53155g;

    /* renamed from: h, reason: collision with root package name */
    private float f53156h;

    /* renamed from: i, reason: collision with root package name */
    private float f53157i;

    /* renamed from: m, reason: collision with root package name */
    private float f53161m;

    /* renamed from: n, reason: collision with root package name */
    private float f53162n;

    /* renamed from: o, reason: collision with root package name */
    private float f53163o;

    /* renamed from: r, reason: collision with root package name */
    private long f53166r;

    /* renamed from: s, reason: collision with root package name */
    private float f53167s;

    /* renamed from: t, reason: collision with root package name */
    private b f53168t;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f53150b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f53151c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f53152d = new float[16];

    /* renamed from: e, reason: collision with root package name */
    private final float[] f53153e = new float[16];

    /* renamed from: f, reason: collision with root package name */
    private float f53154f = 20.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f53158j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f53159k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final int f53160l = 30;

    /* renamed from: p, reason: collision with root package name */
    private long f53164p = Long.MIN_VALUE;

    /* renamed from: q, reason: collision with root package name */
    private long f53165q = 500;

    /* renamed from: m7.a$a, reason: collision with other inner class name */
    public static final class C1951a {
        public /* synthetic */ C1951a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1951a() {
        }
    }

    /* renamed from: m7.a$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f53169a;

        /* renamed from: b, reason: collision with root package name */
        private final int f53170b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f53171c;

        public b(int i10, int i11, Rect contentRect) {
            AbstractC6492s.i(contentRect, "contentRect");
            this.f53169a = i10;
            this.f53170b = i11;
            this.f53171c = contentRect;
        }

        public final Rect a() {
            return this.f53171c;
        }

        public final int b() {
            return this.f53170b;
        }

        public final int c() {
            return this.f53169a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f53169a == bVar.f53169a && this.f53170b == bVar.f53170b && AbstractC6492s.d(this.f53171c, bVar.f53171c);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f53169a) * 31) + Integer.hashCode(this.f53170b)) * 31) + this.f53171c.hashCode();
        }

        public String toString() {
            return "DumpBitmapParams(width=" + this.f53169a + ", height=" + this.f53170b + ", contentRect=" + this.f53171c + ")";
        }
    }

    private final void G() {
        Matrix.setLookAtM(e(), 0, 0.0f, 0.0f, 5.5f, 0.0f, 0.0f, 5.0f, 0.0f, -1.0f, 0.0f);
    }

    private final void H() {
        Matrix.multiplyMM(c(), 0, e(), 0, q(), 0);
        Matrix.multiplyMM(c(), 0, d(), 0, c(), 0);
    }

    private final void I() {
        Matrix.setIdentityM(q(), 0);
        Matrix.rotateM(q(), 0, -h(), 0.0f, 0.0f, 1.0f);
        Matrix.translateM(q(), 0, -f(), -g(), 0.0f);
    }

    private final void J() {
        float fR = this.f53159k / r();
        float f10 = this.f53158j / this.f53159k;
        Matrix.frustumM(d(), 0, (((-f10) * fR) / 2.0f) * t(), ((f10 * fR) / 2.0f) * t(), ((-fR) / 2.0f) * t(), (fR / 2.0f) * t(), 5.0f, 10.0f);
    }

    public static /* synthetic */ void j(AbstractC6776a abstractC6776a, float f10, float f11, float f12, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animatedViewportChange");
        }
        if ((i10 & 8) != 0) {
            j10 = abstractC6776a.f53165q;
        }
        abstractC6776a.i(f10, f11, f12, j10);
    }

    private final void k() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(TLSTM.TLS_MAX_FRAGMENT_SIZE);
    }

    private final int m(Rect rect) {
        return rect.right - AbstractC7137b.e((r0 - rect.left) / 2.0f);
    }

    private final int n(Rect rect) {
        return rect.top - AbstractC7137b.e((r0 - rect.bottom) / 2.0f);
    }

    private final int o(Rect rect) {
        return rect.top - rect.bottom;
    }

    private final int p(Rect rect) {
        return rect.right - rect.left;
    }

    private final boolean s() {
        return System.currentTimeMillis() < this.f53164p;
    }

    private final void u(b bVar) {
        C(m(bVar.a()));
        D(n(bVar.a()));
        int iP = p(bVar.a());
        int iO = o(bVar.a());
        if ((bVar.b() > bVar.c() && o(bVar.a()) < p(bVar.a())) || (bVar.b() < bVar.c() && o(bVar.a()) > p(bVar.a()))) {
            E(90.0f);
            iP = o(bVar.a());
            iO = p(bVar.a());
        }
        if (bVar.c() < bVar.b()) {
            F(iP / (this.f53158j / r()));
        } else {
            F(iO / (this.f53159k / r()));
        }
        F(Math.max(30.0f, t()));
        G();
        J();
        I();
        H();
        v();
    }

    private final void y() {
        if (s()) {
            this.f53166r = System.currentTimeMillis();
            this.f53167s = (this.f53164p - r0) / this.f53165q;
            C(f() + ((this.f53161m - f()) * 0.3f * this.f53167s));
            D(g() + ((this.f53162n - g()) * 0.3f * this.f53167s));
            float fH = h();
            float fH2 = this.f53163o - h();
            if (fH2 > 180.0f) {
                fH2 -= 360;
            } else if (fH2 < -180.0f) {
                fH2 = -(fH2 + 180.0f);
            }
            E(fH + (fH2 * 0.3f * this.f53167s));
        }
    }

    public void A(float f10) {
        if (s()) {
            this.f53163o = f10;
        } else {
            E(f10);
        }
    }

    public void B(float f10) {
        F(Math.min(100.0f, Math.max(5.0f, f10)));
    }

    public void C(float f10) {
        this.f53155g = f10;
    }

    public void D(float f10) {
        this.f53156h = f10;
    }

    public void E(float f10) {
        this.f53157i = f10;
    }

    protected void F(float f10) {
        this.f53154f = f10;
        x();
    }

    @Override // m7.e
    public float a(float f10) {
        return (f10 / r()) * t();
    }

    @Override // m7.e
    public PointF b(PointF displayVectorPx) {
        AbstractC6492s.i(displayVectorPx, "displayVectorPx");
        PointF pointF = new PointF(a(displayVectorPx.x), a(displayVectorPx.y));
        double radians = Math.toRadians(h());
        return new PointF((float) ((pointF.x * Math.cos(radians)) - (pointF.y * Math.sin(radians))), (float) ((pointF.x * Math.sin(radians)) + (pointF.y * Math.cos(radians))));
    }

    @Override // m7.e
    public float[] c() {
        return this.f53153e;
    }

    @Override // m7.e
    public float[] d() {
        return this.f53152d;
    }

    @Override // m7.e
    public float[] e() {
        return this.f53151c;
    }

    @Override // m7.e
    public float f() {
        return this.f53155g;
    }

    @Override // m7.e
    public float g() {
        return this.f53156h;
    }

    @Override // m7.e
    public float h() {
        return this.f53157i;
    }

    public final void i(float f10, float f11, float f12, long j10) {
        this.f53161m = f10;
        this.f53162n = f11;
        this.f53163o = f12;
        this.f53164p = System.currentTimeMillis() + j10;
    }

    public Bitmap l(int i10, int i11, Rect contentRect) {
        AbstractC6492s.i(contentRect, "contentRect");
        Xg.a aVar = new Xg.a(i10, i11);
        this.f53168t = new b(i10, i11, contentRect);
        aVar.d(this);
        Bitmap bitmapC = aVar.c();
        this.f53168t = null;
        AbstractC6492s.f(bitmapC);
        return bitmapC;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        b bVar = this.f53168t;
        if (bVar != null) {
            AbstractC6492s.f(bVar);
            u(bVar);
            return;
        }
        y();
        G();
        J();
        I();
        H();
        w();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.f53158j = i10;
        this.f53159k = i11;
        J();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k();
        G();
    }

    public float[] q() {
        return this.f53150b;
    }

    public abstract int r();

    public float t() {
        return this.f53154f;
    }

    protected abstract void v();

    protected void w() {
    }

    protected void x() {
    }

    public void z(float f10, float f11) {
        if (s()) {
            this.f53161m = f10;
            this.f53162n = f11;
        } else {
            C(f10);
            D(f11);
        }
    }
}
