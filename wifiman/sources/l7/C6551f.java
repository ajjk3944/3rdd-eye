package l7;

import Yg.J;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import g7.AbstractC5868a;
import g7.C5869b;
import g7.C5871d;
import h7.k;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import l7.C6551f;
import mh.InterfaceC6839p;
import oh.AbstractC7137b;

/* renamed from: l7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6551f extends AbstractC5868a {

    /* renamed from: t, reason: collision with root package name */
    public static final a f52421t = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final m7.e f52422b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f52423c;

    /* renamed from: d, reason: collision with root package name */
    private int f52424d;

    /* renamed from: e, reason: collision with root package name */
    private int f52425e;

    /* renamed from: f, reason: collision with root package name */
    private int f52426f;

    /* renamed from: g, reason: collision with root package name */
    private int f52427g;

    /* renamed from: h, reason: collision with root package name */
    private float f52428h;

    /* renamed from: i, reason: collision with root package name */
    private float f52429i;

    /* renamed from: j, reason: collision with root package name */
    private float f52430j;

    /* renamed from: k, reason: collision with root package name */
    private final int f52431k;

    /* renamed from: l, reason: collision with root package name */
    private final int f52432l;

    /* renamed from: m, reason: collision with root package name */
    private final float f52433m;

    /* renamed from: n, reason: collision with root package name */
    private final HashMap f52434n;

    /* renamed from: o, reason: collision with root package name */
    private final HashMap f52435o;

    /* renamed from: p, reason: collision with root package name */
    private FloatBuffer f52436p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f52437q;

    /* renamed from: r, reason: collision with root package name */
    private final RectF f52438r;

    /* renamed from: s, reason: collision with root package name */
    private final float[] f52439s;

    /* renamed from: l7.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l7.f$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f52440a;

        /* renamed from: b, reason: collision with root package name */
        private int f52441b;

        /* renamed from: c, reason: collision with root package name */
        private float f52442c;

        /* renamed from: d, reason: collision with root package name */
        private long f52443d;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC6839p f52444e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f52445f;

        public b(int i10, int i11, float f10, long j10, InterfaceC6839p animationUpdater, boolean z10) {
            AbstractC6492s.i(animationUpdater, "animationUpdater");
            this.f52440a = i10;
            this.f52441b = i11;
            this.f52442c = f10;
            this.f52443d = j10;
            this.f52444e = animationUpdater;
            this.f52445f = z10;
        }

        public final boolean a() {
            return this.f52445f;
        }

        public final InterfaceC6839p b() {
            return this.f52444e;
        }

        public final int c() {
            return this.f52440a;
        }

        public final int d() {
            return this.f52441b;
        }

        public final float e() {
            return this.f52442c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f52440a == bVar.f52440a && this.f52441b == bVar.f52441b && Float.compare(this.f52442c, bVar.f52442c) == 0 && this.f52443d == bVar.f52443d && AbstractC6492s.d(this.f52444e, bVar.f52444e) && this.f52445f == bVar.f52445f;
        }

        public final void f(boolean z10) {
            this.f52445f = z10;
        }

        public final void g(InterfaceC6839p interfaceC6839p) {
            AbstractC6492s.i(interfaceC6839p, "<set-?>");
            this.f52444e = interfaceC6839p;
        }

        public final void h(int i10) {
            this.f52441b = i10;
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.f52440a) * 31) + Integer.hashCode(this.f52441b)) * 31) + Float.hashCode(this.f52442c)) * 31) + Long.hashCode(this.f52443d)) * 31) + this.f52444e.hashCode()) * 31) + Boolean.hashCode(this.f52445f);
        }

        public final void i(long j10) {
            this.f52443d = j10;
        }

        public final void j(float f10) {
            this.f52442c = f10;
        }

        public String toString() {
            return "TileRenderState(bufferIndex=" + this.f52440a + ", color=" + this.f52441b + ", zCoordinate=" + this.f52442c + ", tileUpdateAt=" + this.f52443d + ", animationUpdater=" + this.f52444e + ", animating=" + this.f52445f + ")";
        }
    }

    public C6551f(m7.e mainRenderer, Context context) {
        AbstractC6492s.i(mainRenderer, "mainRenderer");
        AbstractC6492s.i(context, "context");
        this.f52422b = mainRenderer;
        this.f52423c = context;
        this.f52428h = 0.95f;
        this.f52429i = 0.95f / 2.0f;
        this.f52430j = 0.95f;
        this.f52431k = Color.argb(0, 255, 255, 255);
        this.f52432l = Color.argb(255, 255, 255, 255);
        this.f52433m = -0.1f;
        this.f52434n = new HashMap(1000);
        this.f52435o = new HashMap(1000);
        this.f52436p = a(o(100));
        this.f52437q = new Rect();
        this.f52438r = new RectF();
        this.f52439s = new float[4];
    }

    private final b e(InterfaceC6548c interfaceC6548c, int i10, long j10, boolean z10) {
        final int iN = n(interfaceC6548c);
        final K k10 = new K();
        final long j11 = j10 + 900;
        return new b(i10, z10 ? this.f52431k : this.f52432l, z10 ? this.f52433m : 0.0f, j10, new InterfaceC6839p() { // from class: l7.e
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return C6551f.f(j11, k10, this, iN, ((Long) obj).longValue(), (C6551f.b) obj2);
            }
        }, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(long j10, K k10, C6551f c6551f, int i10, long j11, b renderState) {
        AbstractC6492s.i(renderState, "renderState");
        if (j11 < j10) {
            float fG = c6551f.g(j11, j10);
            k10.f51686a = fG;
            renderState.j(c6551f.f52433m * (1 - fG));
            float f10 = k10.f51686a;
            if (f10 <= 0.5f) {
                renderState.h(c6551f.i(c6551f.f52431k, c6551f.f52432l, f10 * 2.0f));
            } else {
                renderState.h(c6551f.i(c6551f.f52432l, i10, (f10 - 0.5f) * 2));
            }
        } else {
            renderState.j(0.0f);
            renderState.h(i10);
            renderState.f(false);
        }
        return J.f24997a;
    }

    private final float g(long j10, long j11) {
        return Math.min(1.0f, 1.0f - ((j11 - j10) / 900.0f));
    }

    private final void h(int i10) {
        int iCapacity = this.f52436p.capacity();
        while (iCapacity < i10) {
            iCapacity *= 2;
        }
        if (iCapacity != this.f52436p.capacity()) {
            Z7.b.h("Extending floorplan matrix buffer capacity to " + iCapacity, null, 2, null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f52436p = b(this.f52436p, iCapacity);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            Z7.b.h("Extended floorplan matrix buffer to " + this.f52436p.capacity() + " capacity - took " + jCurrentTimeMillis2, null, 2, null);
        }
    }

    private final int i(int i10, int i11, float f10) {
        return Color.argb((int) (Color.alpha(i10) + ((Color.alpha(i11) - Color.alpha(i10)) * f10)), (int) (Color.red(i10) + ((Color.red(i11) - Color.red(i10)) * f10)), (int) (Color.green(i10) + ((Color.green(i11) - Color.green(i10)) * f10)), (int) (Color.blue(i10) + ((Color.blue(i11) - Color.blue(i10)) * f10)));
    }

    private final void k() {
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 1);
        GLES20.glUseProgram(this.f52427g);
        this.f52436p.position(0);
        if (this.f52436p.hasRemaining()) {
            int iRemaining = this.f52436p.remaining() / 7;
            this.f52436p.position(0);
            GLES20.glVertexAttribPointer(this.f52425e, 3, 5126, false, 28, (Buffer) this.f52436p);
            GLES20.glEnableVertexAttribArray(this.f52425e);
            this.f52436p.position(3);
            GLES20.glVertexAttribPointer(this.f52426f, 4, 5126, false, 28, (Buffer) this.f52436p);
            GLES20.glEnableVertexAttribArray(this.f52426f);
            GLES20.glUniformMatrix4fv(this.f52424d, 1, false, this.f52422b.c(), 0);
            GLES20.glDrawArrays(4, 0, iRemaining);
            GLES20.glDisableVertexAttribArray(this.f52425e);
            GLES20.glDisableVertexAttribArray(this.f52426f);
            GLES20.glDisable(3042);
        }
    }

    private final int l(b bVar) {
        return o(bVar.c());
    }

    private final int n(InterfaceC6548c interfaceC6548c) {
        return interfaceC6548c.a().e() ? interfaceC6548c.b() : this.f52431k;
    }

    private final int o(int i10) {
        return i10 * 42;
    }

    private final void p(int i10, float[] fArr) {
        C5869b.f47724a.a(i10, fArr);
    }

    private final void q(W7.d dVar, RectF rectF) {
        rectF.left = dVar.a() - this.f52429i;
        rectF.top = dVar.b() - this.f52429i;
        rectF.right = dVar.a() + this.f52429i;
        rectF.bottom = dVar.b() + this.f52429i;
    }

    private final void s(boolean z10) {
        synchronized (this.f52434n) {
            try {
                h(o(this.f52435o.size() + this.f52434n.size()));
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (Map.Entry entry : this.f52434n.entrySet()) {
                    W7.d dVar = (W7.d) entry.getKey();
                    InterfaceC6548c interfaceC6548c = (InterfaceC6548c) entry.getValue();
                    Object objE = this.f52435o.get(dVar);
                    if (objE == null) {
                        objE = e(interfaceC6548c, this.f52435o.size(), jCurrentTimeMillis, z10);
                        HashMap map = this.f52435o;
                        AbstractC6492s.f(objE);
                        map.put(dVar, objE);
                    } else {
                        v((b) objE, interfaceC6548c, jCurrentTimeMillis);
                    }
                    x(dVar, (b) objE);
                }
                this.f52434n.clear();
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void v(b bVar, InterfaceC6548c interfaceC6548c, long j10) {
        final int iD = bVar.d();
        final int iN = n(interfaceC6548c);
        final K k10 = new K();
        final long j11 = j10 + 900;
        bVar.i(interfaceC6548c.a().c());
        bVar.j(0.0f);
        bVar.g(new InterfaceC6839p() { // from class: l7.d
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return C6551f.w(j11, k10, this, iD, iN, ((Long) obj).longValue(), (C6551f.b) obj2);
            }
        });
        bVar.f(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J w(long j10, K k10, C6551f c6551f, int i10, int i11, long j11, b renderState) {
        AbstractC6492s.i(renderState, "renderState");
        if (j11 < j10) {
            float fG = c6551f.g(j11, j10);
            k10.f51686a = fG;
            renderState.h(c6551f.i(i10, i11, fG));
        } else {
            renderState.h(i11);
            renderState.f(false);
        }
        return J.f24997a;
    }

    private final void x(W7.d dVar, b bVar) {
        this.f52436p.position(l(bVar));
        q(dVar, this.f52438r);
        p(bVar.d(), this.f52439s);
        this.f52436p.put(this.f52438r.left);
        this.f52436p.put(this.f52438r.top);
        this.f52436p.put(bVar.e());
        this.f52436p.put(this.f52439s);
        this.f52436p.put(this.f52438r.left);
        this.f52436p.put(this.f52438r.bottom);
        this.f52436p.put(bVar.e());
        this.f52436p.put(this.f52439s);
        this.f52436p.put(this.f52438r.right);
        this.f52436p.put(this.f52438r.top);
        this.f52436p.put(bVar.e());
        this.f52436p.put(this.f52439s);
        this.f52436p.put(this.f52438r.left);
        this.f52436p.put(this.f52438r.bottom);
        this.f52436p.put(bVar.e());
        this.f52436p.put(this.f52439s);
        this.f52436p.put(this.f52438r.right);
        this.f52436p.put(this.f52438r.top);
        this.f52436p.put(bVar.e());
        this.f52436p.put(this.f52439s);
        this.f52436p.put(this.f52438r.right);
        this.f52436p.put(this.f52438r.bottom);
        this.f52436p.put(bVar.e());
        this.f52436p.put(this.f52439s);
        Rect rect = this.f52437q;
        float f10 = this.f52438r.left;
        if (f10 < rect.left) {
            rect.left = AbstractC7137b.e(f10);
        }
        float f11 = this.f52438r.right;
        if (f11 > rect.right) {
            rect.right = AbstractC7137b.e(f11);
        }
        float f12 = this.f52438r.top;
        if (f12 > rect.top) {
            rect.top = AbstractC7137b.e(f12);
        }
        float f13 = this.f52438r.bottom;
        if (f13 < rect.bottom) {
            rect.bottom = AbstractC7137b.e(f13);
        }
    }

    public void j() {
        k();
    }

    public Rect m() {
        return this.f52437q;
    }

    public void r() {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f52427g = iGlCreateProgram;
        if (iGlCreateProgram != 0) {
            C5871d c5871d = C5871d.f47726a;
            GLES20.glAttachShader(iGlCreateProgram, c5871d.a(35633, c5871d.b(this.f52423c, k.f48503d)));
            GLES20.glAttachShader(this.f52427g, c5871d.a(35632, c5871d.b(this.f52423c, k.f48502c)));
            GLES20.glBindAttribLocation(this.f52427g, 0, "a_Position");
            GLES20.glBindAttribLocation(this.f52427g, 1, "a_Color");
            GLES20.glLinkProgram(this.f52427g);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f52427g, 35714, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteProgram(this.f52427g);
                this.f52427g = 0;
            }
        }
        int i10 = this.f52427g;
        if (i10 == 0) {
            throw new RuntimeException("Error creating program.");
        }
        this.f52424d = GLES20.glGetUniformLocation(i10, "u_MVPMatrix");
        this.f52425e = GLES20.glGetAttribLocation(this.f52427g, "a_Position");
        this.f52426f = GLES20.glGetAttribLocation(this.f52427g, "a_Color");
    }

    public final void t(boolean z10) {
        if (this.f52430j != this.f52428h) {
            for (Map.Entry entry : this.f52435o.entrySet()) {
                x((W7.d) entry.getKey(), (b) entry.getValue());
            }
            this.f52430j = this.f52428h;
        }
        s(z10);
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Map.Entry entry2 : this.f52435o.entrySet()) {
            W7.d dVar = (W7.d) entry2.getKey();
            b bVar = (b) entry2.getValue();
            if (bVar.a()) {
                bVar.b().invoke(Long.valueOf(jCurrentTimeMillis), bVar);
                x(dVar, bVar);
            }
        }
    }

    public final void u(float f10) {
        this.f52428h = f10;
        this.f52429i = f10 / 2.0f;
    }

    public final void y(List tiles) {
        AbstractC6492s.i(tiles, "tiles");
        synchronized (this.f52434n) {
            try {
                Iterator it = tiles.iterator();
                while (it.hasNext()) {
                    InterfaceC6548c interfaceC6548c = (InterfaceC6548c) it.next();
                    this.f52434n.put(interfaceC6548c.c(), interfaceC6548c);
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
