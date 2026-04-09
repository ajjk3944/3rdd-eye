package j7;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import g7.C5871d;
import h7.k;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.InterfaceC6546a;
import m7.e;
import oh.AbstractC7137b;

/* renamed from: j7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6257a {

    /* renamed from: r, reason: collision with root package name */
    public static final C1864a f50137r = new C1864a(null);

    /* renamed from: a, reason: collision with root package name */
    private final e f50138a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f50139b;

    /* renamed from: c, reason: collision with root package name */
    private int f50140c;

    /* renamed from: d, reason: collision with root package name */
    private int f50141d;

    /* renamed from: e, reason: collision with root package name */
    private int f50142e;

    /* renamed from: f, reason: collision with root package name */
    private int f50143f;

    /* renamed from: g, reason: collision with root package name */
    private int f50144g;

    /* renamed from: h, reason: collision with root package name */
    private int f50145h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f50146i;

    /* renamed from: j, reason: collision with root package name */
    private float f50147j;

    /* renamed from: k, reason: collision with root package name */
    private final int f50148k;

    /* renamed from: l, reason: collision with root package name */
    private final int f50149l;

    /* renamed from: m, reason: collision with root package name */
    private FloatBuffer f50150m;

    /* renamed from: n, reason: collision with root package name */
    private ByteBuffer f50151n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f50152o;

    /* renamed from: p, reason: collision with root package name */
    private final FloatBuffer f50153p;

    /* renamed from: q, reason: collision with root package name */
    private ConcurrentLinkedQueue f50154q;

    /* renamed from: j7.a$a, reason: collision with other inner class name */
    public static final class C1864a {
        public /* synthetic */ C1864a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1864a() {
        }
    }

    /* renamed from: j7.a$b */
    private static abstract class b {

        /* renamed from: j7.a$b$a, reason: collision with other inner class name */
        public static final class C1865a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1865a f50155a = new C1865a();

            private C1865a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1865a);
            }

            public int hashCode() {
                return 1654717169;
            }

            public String toString() {
                return "Clear";
            }
        }

        /* renamed from: j7.a$b$b, reason: collision with other inner class name */
        public static final class C1866b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final List f50156a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1866b(List tiles) {
                super(null);
                AbstractC6492s.i(tiles, "tiles");
                this.f50156a = tiles;
            }

            public final List a() {
                return this.f50156a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1866b) && AbstractC6492s.d(this.f50156a, ((C1866b) obj).f50156a);
            }

            public int hashCode() {
                return this.f50156a.hashCode();
            }

            public String toString() {
                return "DataChange(tiles=" + this.f50156a + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C6257a(e mainRenderer, Context context, int i10, int i11) {
        AbstractC6492s.i(mainRenderer, "mainRenderer");
        AbstractC6492s.i(context, "context");
        this.f50138a = mainRenderer;
        this.f50139b = context;
        RectF rectF = new RectF();
        float f10 = (-i10) / 2.0f;
        rectF.left = f10;
        rectF.top = f10;
        float f11 = i10 / 2.0f;
        rectF.right = f11;
        rectF.bottom = f11;
        this.f50146i = rectF;
        int iD = AbstractC7137b.d(i10 / i11);
        this.f50148k = iD;
        this.f50149l = iD * iD * 4;
        this.f50152o = new Rect();
        FloatBuffer floatBufferA = a(12);
        floatBufferA.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f});
        this.f50153p = floatBufferA;
        this.f50154q = new ConcurrentLinkedQueue();
    }

    private final FloatBuffer a(int i10) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i10 * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        AbstractC6492s.h(floatBufferAsFloatBuffer, "asFloatBuffer(...)");
        return floatBufferAsFloatBuffer;
    }

    private final void b() {
        GLES20.glBindTexture(3553, this.f50143f);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        int i10 = this.f50148k;
        ByteBuffer byteBuffer = this.f50151n;
        if (byteBuffer == null) {
            AbstractC6492s.v("textureBuffer");
            byteBuffer = null;
        }
        GLES20.glTexImage2D(3553, 0, 6408, i10, i10, 0, 6408, 5121, byteBuffer);
        GLES20.glBindTexture(3553, 0);
    }

    private final int d(int i10) {
        return Color.argb(Color.red(i10), Color.green(i10), Color.blue(i10), Color.alpha(i10));
    }

    private final void f() {
        FloatBuffer floatBuffer;
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 1);
        GLES20.glUseProgram(this.f50145h);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f50143f);
        GLES20.glUniform1i(this.f50142e, 0);
        this.f50153p.position(0);
        GLES20.glVertexAttribPointer(this.f50144g, 2, 5126, false, 0, (Buffer) this.f50153p);
        GLES20.glEnableVertexAttribArray(this.f50144g);
        FloatBuffer floatBuffer2 = this.f50150m;
        if (floatBuffer2 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer2 = null;
        }
        floatBuffer2.position(0);
        FloatBuffer floatBuffer3 = this.f50150m;
        if (floatBuffer3 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer3 = null;
        }
        if (floatBuffer3.hasRemaining()) {
            FloatBuffer floatBuffer4 = this.f50150m;
            if (floatBuffer4 == null) {
                AbstractC6492s.v("vertexBuffer");
                floatBuffer4 = null;
            }
            int iRemaining = floatBuffer4.remaining() / 3;
            FloatBuffer floatBuffer5 = this.f50150m;
            if (floatBuffer5 == null) {
                AbstractC6492s.v("vertexBuffer");
                floatBuffer5 = null;
            }
            floatBuffer5.position(0);
            int i10 = this.f50141d;
            FloatBuffer floatBuffer6 = this.f50150m;
            if (floatBuffer6 == null) {
                AbstractC6492s.v("vertexBuffer");
                floatBuffer = null;
            } else {
                floatBuffer = floatBuffer6;
            }
            GLES20.glVertexAttribPointer(i10, 3, 5126, false, 12, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f50141d);
            GLES20.glUniformMatrix4fv(this.f50140c, 1, false, this.f50138a.c(), 0);
            GLES20.glDrawArrays(4, 0, iRemaining);
            GLES20.glDisableVertexAttribArray(this.f50141d);
            GLES20.glDisable(3042);
        }
    }

    private final int h(InterfaceC6546a interfaceC6546a) {
        int iB = interfaceC6546a.c().b();
        int i10 = this.f50148k;
        int iA = (((iB + (i10 / 2)) * i10) + interfaceC6546a.c().a() + (this.f50148k / 2)) * 4;
        if (iA < 0 || iA >= this.f50149l - 4) {
            return -1;
        }
        return iA;
    }

    private final void j() {
        FloatBuffer floatBufferA = a(18);
        this.f50150m = floatBufferA;
        FloatBuffer floatBuffer = null;
        if (floatBufferA == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBufferA = null;
        }
        floatBufferA.position(0);
        FloatBuffer floatBuffer2 = this.f50150m;
        if (floatBuffer2 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer2 = null;
        }
        floatBuffer2.put(this.f50146i.left);
        FloatBuffer floatBuffer3 = this.f50150m;
        if (floatBuffer3 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer3 = null;
        }
        floatBuffer3.put(this.f50146i.bottom);
        FloatBuffer floatBuffer4 = this.f50150m;
        if (floatBuffer4 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer4 = null;
        }
        floatBuffer4.put(this.f50147j);
        FloatBuffer floatBuffer5 = this.f50150m;
        if (floatBuffer5 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer5 = null;
        }
        floatBuffer5.put(this.f50146i.right);
        FloatBuffer floatBuffer6 = this.f50150m;
        if (floatBuffer6 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer6 = null;
        }
        floatBuffer6.put(this.f50146i.bottom);
        FloatBuffer floatBuffer7 = this.f50150m;
        if (floatBuffer7 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer7 = null;
        }
        floatBuffer7.put(this.f50147j);
        FloatBuffer floatBuffer8 = this.f50150m;
        if (floatBuffer8 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer8 = null;
        }
        floatBuffer8.put(this.f50146i.left);
        FloatBuffer floatBuffer9 = this.f50150m;
        if (floatBuffer9 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer9 = null;
        }
        floatBuffer9.put(this.f50146i.top);
        FloatBuffer floatBuffer10 = this.f50150m;
        if (floatBuffer10 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer10 = null;
        }
        floatBuffer10.put(this.f50147j);
        FloatBuffer floatBuffer11 = this.f50150m;
        if (floatBuffer11 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer11 = null;
        }
        floatBuffer11.put(this.f50146i.left);
        FloatBuffer floatBuffer12 = this.f50150m;
        if (floatBuffer12 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer12 = null;
        }
        floatBuffer12.put(this.f50146i.top);
        FloatBuffer floatBuffer13 = this.f50150m;
        if (floatBuffer13 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer13 = null;
        }
        floatBuffer13.put(this.f50147j);
        FloatBuffer floatBuffer14 = this.f50150m;
        if (floatBuffer14 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer14 = null;
        }
        floatBuffer14.put(this.f50146i.right);
        FloatBuffer floatBuffer15 = this.f50150m;
        if (floatBuffer15 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer15 = null;
        }
        floatBuffer15.put(this.f50146i.top);
        FloatBuffer floatBuffer16 = this.f50150m;
        if (floatBuffer16 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer16 = null;
        }
        floatBuffer16.put(this.f50147j);
        FloatBuffer floatBuffer17 = this.f50150m;
        if (floatBuffer17 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer17 = null;
        }
        floatBuffer17.put(this.f50146i.right);
        FloatBuffer floatBuffer18 = this.f50150m;
        if (floatBuffer18 == null) {
            AbstractC6492s.v("vertexBuffer");
            floatBuffer18 = null;
        }
        floatBuffer18.put(this.f50146i.bottom);
        FloatBuffer floatBuffer19 = this.f50150m;
        if (floatBuffer19 == null) {
            AbstractC6492s.v("vertexBuffer");
        } else {
            floatBuffer = floatBuffer19;
        }
        floatBuffer.put(this.f50147j);
        this.f50151n = ByteBuffer.allocateDirect(this.f50149l);
    }

    private final void k() {
        ByteBuffer byteBuffer;
        Iterator it = this.f50154q.iterator();
        AbstractC6492s.h(it, "iterator(...)");
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar instanceof b.C1865a) {
                j();
                Rect rect = this.f50152o;
                rect.left = 0;
                rect.right = 0;
                rect.top = 0;
                rect.bottom = 0;
            } else {
                if (!(bVar instanceof b.C1866b)) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator it2 = ((b.C1866b) bVar).a().iterator();
                while (true) {
                    byteBuffer = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC6546a interfaceC6546a = (InterfaceC6546a) it2.next();
                    Integer numValueOf = Integer.valueOf(interfaceC6546a.b());
                    int iH = h(interfaceC6546a);
                    if (iH != -1) {
                        ByteBuffer byteBuffer2 = this.f50151n;
                        if (byteBuffer2 == null) {
                            AbstractC6492s.v("textureBuffer");
                            byteBuffer2 = null;
                        }
                        byteBuffer2.position(iH);
                        ByteBuffer byteBuffer3 = this.f50151n;
                        if (byteBuffer3 == null) {
                            AbstractC6492s.v("textureBuffer");
                        } else {
                            byteBuffer = byteBuffer3;
                        }
                        byteBuffer.putInt(d(numValueOf.intValue()));
                    }
                    Rect rect2 = this.f50152o;
                    if (interfaceC6546a.c().a() < rect2.left) {
                        rect2.left = interfaceC6546a.c().a();
                    }
                    if (interfaceC6546a.c().a() > rect2.right) {
                        rect2.right = interfaceC6546a.c().a();
                    }
                    if (interfaceC6546a.c().b() > rect2.top) {
                        rect2.top = interfaceC6546a.c().b();
                    }
                    if (interfaceC6546a.c().b() < rect2.bottom) {
                        rect2.bottom = interfaceC6546a.c().b();
                    }
                }
                ByteBuffer byteBuffer4 = this.f50151n;
                if (byteBuffer4 == null) {
                    AbstractC6492s.v("textureBuffer");
                } else {
                    byteBuffer = byteBuffer4;
                }
                byteBuffer.position(0);
            }
            it.remove();
        }
        b();
    }

    public final void c() {
        this.f50154q.clear();
        this.f50154q.add(b.C1865a.f50155a);
    }

    public void e() {
        k();
        f();
    }

    public Rect g() {
        return this.f50152o;
    }

    public void i() {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f50145h = iGlCreateProgram;
        if (iGlCreateProgram != 0) {
            C5871d c5871d = C5871d.f47726a;
            GLES20.glAttachShader(iGlCreateProgram, c5871d.a(35633, c5871d.b(this.f50139b, k.f48505f)));
            GLES20.glAttachShader(this.f50145h, c5871d.a(35632, c5871d.b(this.f50139b, k.f48504e)));
            GLES20.glBindAttribLocation(this.f50145h, 0, "a_Position");
            GLES20.glLinkProgram(this.f50145h);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f50145h, 35714, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteProgram(this.f50145h);
                this.f50145h = 0;
            }
        }
        int i10 = this.f50145h;
        if (i10 == 0) {
            throw new RuntimeException("Error creating program.");
        }
        this.f50140c = GLES20.glGetUniformLocation(i10, "u_MVPMatrix");
        this.f50141d = GLES20.glGetAttribLocation(this.f50145h, "a_Position");
        this.f50142e = GLES20.glGetUniformLocation(this.f50145h, "u_Texture");
        this.f50144g = GLES20.glGetAttribLocation(this.f50145h, "a_TexCoordinate");
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        this.f50143f = iArr2[0];
        j();
        b();
    }

    public final void l(List tiles) {
        AbstractC6492s.i(tiles, "tiles");
        this.f50154q.add(new b.C1866b(tiles));
    }
}
