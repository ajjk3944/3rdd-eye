package h7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import g7.C5870c;
import j7.C6257a;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.C6547b;
import l7.C6551f;
import m7.AbstractC6776a;
import org.snmp4j.transport.TLSTM;

/* renamed from: h7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5954a extends AbstractC6776a {

    /* renamed from: E, reason: collision with root package name */
    public static final C1793a f48459E = new C1793a(null);

    /* renamed from: A, reason: collision with root package name */
    private final C6547b f48460A;

    /* renamed from: B, reason: collision with root package name */
    private final int f48461B;

    /* renamed from: C, reason: collision with root package name */
    private final C6257a f48462C;

    /* renamed from: D, reason: collision with root package name */
    private final k7.f f48463D;

    /* renamed from: v, reason: collision with root package name */
    private final Context f48464v;

    /* renamed from: w, reason: collision with root package name */
    private final b f48465w;

    /* renamed from: x, reason: collision with root package name */
    private final int f48466x;

    /* renamed from: y, reason: collision with root package name */
    private final int f48467y;

    /* renamed from: z, reason: collision with root package name */
    private final C6551f f48468z;

    /* renamed from: h7.a$a, reason: collision with other inner class name */
    public static final class C1793a {
        public /* synthetic */ C1793a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1793a() {
        }
    }

    public C5954a(Context context, b params) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(params, "params");
        this.f48464v = context;
        this.f48465w = params;
        this.f48466x = L(params.a());
        this.f48467y = L(params.b());
        this.f48468z = new C6551f(this, context);
        this.f48460A = new C6547b(this, context);
        int iB = params.b() / params.a();
        this.f48461B = iB;
        this.f48462C = new C6257a(this, context, params.d(), iB);
        this.f48463D = new k7.f(this, context);
    }

    private final void P() {
        if (t() > 10.0f) {
            this.f48468z.u(1.0f);
        } else {
            this.f48468z.u(0.95f);
        }
    }

    @Override // m7.AbstractC6776a
    protected void F(float f10) {
        super.F(f10);
        P();
        this.f48463D.k();
    }

    public void K() {
        this.f48462C.c();
    }

    public final int L(int i10) {
        return (int) (i10 * this.f48464v.getResources().getDisplayMetrics().density);
    }

    public final Bitmap M(int i10, int i11) {
        Rect rectM = this.f48468z.m();
        Rect rectG = this.f48462C.g();
        int i12 = rectG.left;
        int i13 = this.f48461B;
        rectG.left = i12 * i13;
        rectG.right *= i13;
        rectG.top *= i13;
        rectG.bottom *= i13;
        Rect rectI = this.f48463D.i();
        Rect rect = new Rect();
        rect.left = Math.min(rectM.left, Math.min(rectG.left, rectI.left));
        rect.right = Math.max(rectM.right, Math.max(rectG.right, rectI.right));
        rect.top = Math.max(rectM.top, Math.max(rectG.top, rectI.top));
        rect.bottom = Math.min(rectM.bottom, Math.min(rectG.bottom, rectI.bottom));
        return super.l(i10, i11, rect);
    }

    public final int N() {
        return this.f48467y;
    }

    public final C6547b O() {
        return this.f48460A;
    }

    public void Q(List tiles) {
        AbstractC6492s.i(tiles, "tiles");
        this.f48462C.l(tiles);
    }

    public void R(List tiles) {
        AbstractC6492s.i(tiles, "tiles");
        this.f48463D.p(tiles);
    }

    public void S(List tiles) {
        AbstractC6492s.i(tiles, "tiles");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f48468z.y(tiles);
        Z7.b.h("Update tiles took " + (System.currentTimeMillis() - jCurrentTimeMillis), null, 2, null);
    }

    @Override // m7.AbstractC6776a, android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        super.onSurfaceCreated(gl10, eGLConfig);
        this.f48468z.r();
        this.f48460A.g();
        this.f48462C.i();
        this.f48463D.j();
    }

    @Override // m7.AbstractC6776a
    public int r() {
        return this.f48466x;
    }

    @Override // m7.AbstractC6776a
    public float t() {
        return super.t();
    }

    @Override // m7.AbstractC6776a
    protected void v() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(TLSTM.TLS_MAX_FRAGMENT_SIZE);
        this.f48468z.t(false);
        this.f48468z.j();
        C5870c.c("Floorplan", "Draw tiles");
        this.f48462C.e();
        C5870c.c("Floorplan", "Draw heatmap");
        this.f48463D.g();
        C5870c.c("Floorplan", "Draw heatmap");
    }

    @Override // m7.AbstractC6776a
    protected void w() {
        super.w();
        this.f48468z.t(true);
        this.f48468z.j();
        C5870c.c("Floorplan", "Draw tiles");
        this.f48462C.e();
        C5870c.c("Floorplan", "Draw heatmap");
        this.f48463D.g();
        C5870c.c("Floorplan", "Draw heatmap");
        if (this.f48465w.c()) {
            this.f48460A.i(t());
            this.f48460A.c();
        }
        C5870c.c("Floorplan", "Draw pointer");
    }

    /* renamed from: h7.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f48469a;

        /* renamed from: b, reason: collision with root package name */
        private final int f48470b;

        /* renamed from: c, reason: collision with root package name */
        private final int f48471c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f48472d;

        public b(int i10, int i11, int i12, boolean z10) {
            this.f48469a = i10;
            this.f48470b = i11;
            this.f48471c = i12;
            this.f48472d = z10;
        }

        public final int a() {
            return this.f48469a;
        }

        public final int b() {
            return this.f48470b;
        }

        public final boolean c() {
            return this.f48472d;
        }

        public final int d() {
            return this.f48471c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f48469a == bVar.f48469a && this.f48470b == bVar.f48470b && this.f48471c == bVar.f48471c && this.f48472d == bVar.f48472d;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f48469a) * 31) + Integer.hashCode(this.f48470b)) * 31) + Integer.hashCode(this.f48471c)) * 31) + Boolean.hashCode(this.f48472d);
        }

        public String toString() {
            return "Params(floorTileSizeDp=" + this.f48469a + ", heatmapTileSizeDp=" + this.f48470b + ", wholeCoordinateSystemSize=" + this.f48471c + ", positionPointerEnabled=" + this.f48472d + ")";
        }

        public /* synthetic */ b(int i10, int i11, int i12, boolean z10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 30 : i10, (i13 & 2) != 0 ? 150 : i11, (i13 & 4) != 0 ? 2000 : i12, (i13 & 8) != 0 ? true : z10);
        }
    }
}
