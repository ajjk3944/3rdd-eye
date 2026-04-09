package k7;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import g7.AbstractC5868a;
import g7.C5871d;
import g7.C5872e;
import h7.k;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import k7.InterfaceC6398a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oh.AbstractC7137b;

/* loaded from: classes3.dex */
public final class f extends AbstractC5868a {

    /* renamed from: s, reason: collision with root package name */
    public static final a f51274s = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final m7.e f51275b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f51276c;

    /* renamed from: d, reason: collision with root package name */
    private int f51277d;

    /* renamed from: e, reason: collision with root package name */
    private int f51278e;

    /* renamed from: f, reason: collision with root package name */
    private int f51279f;

    /* renamed from: g, reason: collision with root package name */
    private int f51280g;

    /* renamed from: h, reason: collision with root package name */
    private int f51281h;

    /* renamed from: i, reason: collision with root package name */
    private final float[] f51282i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f51283j;

    /* renamed from: k, reason: collision with root package name */
    private final float[] f51284k;

    /* renamed from: l, reason: collision with root package name */
    private final float[] f51285l;

    /* renamed from: m, reason: collision with root package name */
    private float f51286m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f51287n;

    /* renamed from: o, reason: collision with root package name */
    private HashMap f51288o;

    /* renamed from: p, reason: collision with root package name */
    private HashMap f51289p;

    /* renamed from: q, reason: collision with root package name */
    private ConcurrentLinkedQueue f51290q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f51291r;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC6398a f51292a;

        /* renamed from: b, reason: collision with root package name */
        private final c f51293b;

        /* renamed from: c, reason: collision with root package name */
        private final FloatBuffer f51294c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f51295d;

        public b(f fVar, InterfaceC6398a obj, c texture) {
            AbstractC6492s.i(obj, "obj");
            AbstractC6492s.i(texture, "texture");
            this.f51295d = fVar;
            this.f51292a = obj;
            this.f51293b = texture;
            this.f51294c = fVar.a(18);
        }

        private final RectF f(InterfaceC6398a interfaceC6398a, C5872e.a aVar) {
            float fB;
            float fC = 1.0f;
            if (aVar.b() > aVar.c()) {
                fC = 1.0f - (1.0f - (aVar.c() / aVar.b()));
                fB = 1.0f;
            } else {
                fB = aVar.b() < aVar.c() ? 1.0f - (1.0f - (aVar.b() / aVar.c())) : 1.0f;
            }
            RectF rectF = new RectF();
            m7.e eVar = this.f51295d.f51275b;
            AbstractC6492s.f(interfaceC6398a.e());
            float fA = eVar.a(r3.a());
            float f10 = (fC * fA) / 2.0f;
            rectF.left = interfaceC6398a.c().a() - f10;
            float f11 = (fA * fB) / 2.0f;
            rectF.top = interfaceC6398a.c().b() - f11;
            rectF.right = interfaceC6398a.c().a() + f10;
            rectF.bottom = interfaceC6398a.c().b() + f11;
            return rectF;
        }

        public final InterfaceC6398a a() {
            return this.f51292a;
        }

        public final RectF b() {
            return f(this.f51292a, this.f51293b.c());
        }

        public final c c() {
            return this.f51293b;
        }

        public final FloatBuffer d() {
            return this.f51294c;
        }

        public final void e() {
            RectF rectFB = b();
            this.f51294c.position(0);
            this.f51294c.put(rectFB.left);
            this.f51294c.put(rectFB.bottom);
            this.f51294c.put(this.f51295d.f51286m);
            this.f51294c.put(rectFB.right);
            this.f51294c.put(rectFB.bottom);
            this.f51294c.put(this.f51295d.f51286m);
            this.f51294c.put(rectFB.left);
            this.f51294c.put(rectFB.top);
            this.f51294c.put(this.f51295d.f51286m);
            this.f51294c.put(rectFB.left);
            this.f51294c.put(rectFB.top);
            this.f51294c.put(this.f51295d.f51286m);
            this.f51294c.put(rectFB.right);
            this.f51294c.put(rectFB.top);
            this.f51294c.put(this.f51295d.f51286m);
            this.f51294c.put(rectFB.right);
            this.f51294c.put(rectFB.bottom);
            this.f51294c.put(this.f51295d.f51286m);
        }
    }

    private final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f51296a;

        /* renamed from: b, reason: collision with root package name */
        private final C5872e.a f51297b;

        /* renamed from: c, reason: collision with root package name */
        private FloatBuffer f51298c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f51299d;

        public c(f fVar, String id2, int i10, int i11) {
            AbstractC6492s.i(id2, "id");
            this.f51299d = fVar;
            this.f51296a = id2;
            this.f51297b = C5872e.f47727a.c(fVar.f51276c, i10, Integer.valueOf(i11));
            FloatBuffer floatBufferA = fVar.a(b().length);
            floatBufferA.put(b());
            this.f51298c = floatBufferA;
        }

        private final float[] b() {
            return new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        }

        public final FloatBuffer a() {
            return this.f51298c;
        }

        public final C5872e.a c() {
            return this.f51297b;
        }
    }

    private static abstract class d {

        public static final class a extends d {

            /* renamed from: a, reason: collision with root package name */
            private final List f51300a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List objs) {
                super(null);
                AbstractC6492s.i(objs, "objs");
                this.f51300a = objs;
            }

            public final List a() {
                return this.f51300a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f51300a, ((a) obj).f51300a);
            }

            public int hashCode() {
                return this.f51300a.hashCode();
            }

            public String toString() {
                return "DataChange(objs=" + this.f51300a + ")";
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public f(m7.e mainRenderer, Context context) {
        AbstractC6492s.i(mainRenderer, "mainRenderer");
        AbstractC6492s.i(context, "context");
        this.f51275b = mainRenderer;
        this.f51276c = context;
        this.f51282i = new float[16];
        this.f51283j = new float[16];
        this.f51284k = new float[16];
        this.f51285l = new float[16];
        this.f51288o = new HashMap();
        this.f51289p = new HashMap();
        this.f51290q = new ConcurrentLinkedQueue();
        this.f51291r = new Rect();
    }

    private final void h() {
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 1);
        GLES20.glUseProgram(this.f51281h);
        Iterator it = this.f51289p.entrySet().iterator();
        while (it.hasNext()) {
            b bVar = (b) ((Map.Entry) it.next()).getValue();
            n(bVar);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, bVar.c().c().a());
            GLES20.glUniform1i(this.f51279f, 0);
            bVar.c().a().position(0);
            GLES20.glVertexAttribPointer(this.f51280g, 2, 5126, false, 0, (Buffer) bVar.c().a());
            GLES20.glEnableVertexAttribArray(this.f51280g);
            bVar.d().position(0);
            int iRemaining = bVar.d().remaining() / 3;
            bVar.d().position(0);
            GLES20.glVertexAttribPointer(this.f51278e, 3, 5126, false, 12, (Buffer) bVar.d());
            GLES20.glEnableVertexAttribArray(this.f51278e);
            GLES20.glUniformMatrix4fv(this.f51277d, 1, false, this.f51283j, 0);
            GLES20.glDrawArrays(4, 0, iRemaining);
            GLES20.glDisableVertexAttribArray(this.f51278e);
        }
        GLES20.glDisable(3042);
    }

    private final void l() {
        Iterator it = this.f51290q.iterator();
        AbstractC6492s.h(it, "iterator(...)");
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (!(dVar instanceof d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it2 = ((d.a) dVar).a().iterator();
            while (it2.hasNext()) {
                o((InterfaceC6398a) it2.next());
            }
            it.remove();
        }
    }

    private final void m() {
        if (this.f51287n) {
            Iterator it = this.f51289p.entrySet().iterator();
            while (it.hasNext()) {
                o(((b) ((Map.Entry) it.next()).getValue()).a());
            }
            this.f51287n = false;
        }
    }

    private final void n(b bVar) {
        Matrix.setIdentityM(this.f51282i, 0);
        float fA = bVar.a().c().a();
        float fB = bVar.a().c().b();
        Matrix.setIdentityM(this.f51284k, 0);
        Matrix.translateM(this.f51284k, 0, fA, fB, 0.0f);
        Matrix.rotateM(this.f51284k, 0, this.f51275b.h(), 0.0f, 0.0f, 1.0f);
        Matrix.translateM(this.f51284k, 0, -fA, -fB, 0.0f);
        Matrix.setIdentityM(this.f51285l, 0);
        Matrix.rotateM(this.f51285l, 0, -this.f51275b.h(), 0.0f, 0.0f, 1.0f);
        Matrix.translateM(this.f51285l, 0, -this.f51275b.f(), -this.f51275b.g(), 0.0f);
        Matrix.multiplyMM(this.f51282i, 0, this.f51285l, 0, this.f51284k, 0);
        Matrix.multiplyMM(this.f51283j, 0, this.f51275b.e(), 0, this.f51282i, 0);
        Matrix.multiplyMM(this.f51283j, 0, this.f51275b.d(), 0, this.f51283j, 0);
    }

    private final void o(InterfaceC6398a interfaceC6398a) {
        if (interfaceC6398a.e() == null) {
            this.f51289p.remove(interfaceC6398a.getId());
            return;
        }
        InterfaceC6398a.InterfaceC1895a interfaceC1895aE = interfaceC6398a.e();
        AbstractC6492s.f(interfaceC1895aE);
        String str = "txt" + interfaceC1895aE.b();
        HashMap map = this.f51288o;
        Object cVar = map.get(str);
        if (cVar == null) {
            InterfaceC6398a.InterfaceC1895a interfaceC1895aE2 = interfaceC6398a.e();
            AbstractC6492s.f(interfaceC1895aE2);
            int iB = interfaceC1895aE2.b();
            InterfaceC6398a.InterfaceC1895a interfaceC1895aE3 = interfaceC6398a.e();
            AbstractC6492s.f(interfaceC1895aE3);
            cVar = new c(this, str, iB, interfaceC1895aE3.a());
            map.put(str, cVar);
        }
        c cVar2 = (c) cVar;
        HashMap map2 = this.f51289p;
        String id2 = interfaceC6398a.getId();
        Object bVar = map2.get(id2);
        if (bVar == null) {
            bVar = new b(this, interfaceC6398a, cVar2);
            map2.put(id2, bVar);
        }
        b bVar2 = (b) bVar;
        bVar2.e();
        Rect rect = this.f51291r;
        RectF rectFB = bVar2.b();
        float f10 = rectFB.left;
        if (f10 < rect.left) {
            rect.left = AbstractC7137b.e(f10);
        }
        float f11 = rectFB.right;
        if (f11 > rect.right) {
            rect.right = AbstractC7137b.e(f11);
        }
        float f12 = rectFB.top;
        if (f12 > rect.top) {
            rect.top = AbstractC7137b.e(f12);
        }
        float f13 = rectFB.bottom;
        if (f13 < rect.bottom) {
            rect.bottom = AbstractC7137b.e(f13);
        }
    }

    public void g() {
        l();
        m();
        h();
    }

    public Rect i() {
        return this.f51291r;
    }

    public void j() {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f51281h = iGlCreateProgram;
        if (iGlCreateProgram != 0) {
            C5871d c5871d = C5871d.f47726a;
            GLES20.glAttachShader(iGlCreateProgram, c5871d.a(35633, c5871d.b(this.f51276c, k.f48505f)));
            GLES20.glAttachShader(this.f51281h, c5871d.a(35632, c5871d.b(this.f51276c, k.f48504e)));
            GLES20.glBindAttribLocation(this.f51281h, 0, "a_Position");
            GLES20.glLinkProgram(this.f51281h);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f51281h, 35714, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteProgram(this.f51281h);
                this.f51281h = 0;
            }
        }
        int i10 = this.f51281h;
        if (i10 == 0) {
            throw new RuntimeException("Error creating program.");
        }
        this.f51277d = GLES20.glGetUniformLocation(i10, "u_MVPMatrix");
        this.f51278e = GLES20.glGetAttribLocation(this.f51281h, "a_Position");
        this.f51279f = GLES20.glGetUniformLocation(this.f51281h, "u_Texture");
        this.f51280g = GLES20.glGetAttribLocation(this.f51281h, "a_TexCoordinate");
    }

    public final void k() {
        this.f51287n = true;
    }

    public final void p(List tiles) {
        AbstractC6492s.i(tiles, "tiles");
        this.f51290q.add(new d.a(tiles));
    }
}
