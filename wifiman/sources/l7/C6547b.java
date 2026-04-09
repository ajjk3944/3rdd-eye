package l7;

import android.content.Context;
import android.graphics.Color;
import android.opengl.GLES20;
import g7.C5869b;
import g7.C5871d;
import h7.k;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: l7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6547b {

    /* renamed from: w, reason: collision with root package name */
    public static final a f52389w = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final m7.e f52390a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f52391b;

    /* renamed from: c, reason: collision with root package name */
    private int f52392c;

    /* renamed from: d, reason: collision with root package name */
    private int f52393d;

    /* renamed from: e, reason: collision with root package name */
    private int f52394e;

    /* renamed from: f, reason: collision with root package name */
    private int f52395f;

    /* renamed from: g, reason: collision with root package name */
    private int f52396g;

    /* renamed from: h, reason: collision with root package name */
    private int f52397h;

    /* renamed from: i, reason: collision with root package name */
    private float f52398i;

    /* renamed from: j, reason: collision with root package name */
    private float f52399j;

    /* renamed from: k, reason: collision with root package name */
    private float f52400k;

    /* renamed from: l, reason: collision with root package name */
    private float f52401l;

    /* renamed from: m, reason: collision with root package name */
    private long f52402m;

    /* renamed from: n, reason: collision with root package name */
    private float f52403n;

    /* renamed from: o, reason: collision with root package name */
    private float f52404o;

    /* renamed from: p, reason: collision with root package name */
    private float f52405p;

    /* renamed from: q, reason: collision with root package name */
    private float f52406q;

    /* renamed from: r, reason: collision with root package name */
    private float f52407r;

    /* renamed from: s, reason: collision with root package name */
    private FloatBuffer f52408s;

    /* renamed from: t, reason: collision with root package name */
    private final float[] f52409t;

    /* renamed from: u, reason: collision with root package name */
    private final float[] f52410u;

    /* renamed from: v, reason: collision with root package name */
    private final float[] f52411v;

    /* renamed from: l7.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6547b(m7.e mainRenderer, Context context) {
        AbstractC6492s.i(mainRenderer, "mainRenderer");
        AbstractC6492s.i(context, "context");
        this.f52390a = mainRenderer;
        this.f52391b = context;
        this.f52396g = -1;
        this.f52397h = Color.argb(255, 77, 152, 255);
        this.f52404o = 0.3f;
        this.f52405p = 2.0f;
        this.f52406q = 1.0f;
        this.f52408s = b(1281);
        float[] fArr = new float[4];
        C5869b c5869b = C5869b.f47724a;
        c5869b.a(this.f52397h, fArr);
        this.f52409t = fArr;
        float[] fArr2 = new float[4];
        c5869b.a(this.f52396g, fArr2);
        this.f52410u = fArr2;
        float[] fArr3 = new float[4];
        c5869b.a(Color.argb(0, 204, 204, 204), fArr3);
        this.f52411v = fArr3;
    }

    private final void a(float f10, float f11, float f12, float[] fArr) {
        this.f52408s.put(this.f52398i + f10);
        this.f52408s.put(this.f52399j + f11);
        this.f52408s.put(f12);
        this.f52408s.put(fArr);
    }

    private final FloatBuffer b(int i10) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i10 * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        AbstractC6492s.h(floatBufferAsFloatBuffer, "asFloatBuffer(...)");
        return floatBufferAsFloatBuffer;
    }

    private final void l() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f52402m;
        float f10 = (jCurrentTimeMillis - j10) / 500.0f;
        if (f10 >= 1.0f || j10 == 0) {
            this.f52398i = this.f52400k;
            this.f52399j = this.f52401l;
        } else {
            float f11 = this.f52398i;
            this.f52398i = f11 + ((this.f52400k - f11) * f10);
            float f12 = this.f52399j;
            this.f52399j = f12 + ((this.f52401l - f12) * f10);
        }
    }

    private final void m() {
        float f10;
        float f11;
        int i10;
        l();
        int i11 = 0;
        this.f52408s.position(0);
        double d10 = 90;
        double d11 = 38;
        double radians = Math.toRadians((this.f52407r - d10) - d11);
        double radians2 = Math.toRadians((this.f52407r - d10) + d11);
        a((float) (Math.cos(radians) * this.f52405p * this.f52406q), (float) (Math.sin(radians) * this.f52405p * this.f52406q), this.f52403n, this.f52411v);
        a((float) (Math.cos(radians2) * this.f52405p * this.f52406q), (float) (Math.sin(radians2) * this.f52405p * this.f52406q), this.f52403n, this.f52411v);
        a(0.0f, 0.0f, this.f52403n, this.f52410u);
        int i12 = 0;
        while (true) {
            f10 = 240.0f;
            f11 = 120.0f;
            i10 = 360;
            if (i12 >= 30) {
                break;
            }
            double d12 = (i12 / d10) * 360;
            double radians3 = Math.toRadians(d12);
            double radians4 = Math.toRadians(120.0f + d12);
            double radians5 = Math.toRadians(d12 + 240.0f);
            a((float) (Math.cos(radians3) * this.f52404o * this.f52406q), (float) (Math.sin(radians3) * this.f52404o * this.f52406q), this.f52403n, this.f52410u);
            a((float) (Math.cos(radians4) * this.f52404o * this.f52406q), (float) (Math.sin(radians4) * this.f52404o * this.f52406q), this.f52403n, this.f52410u);
            a((float) (Math.cos(radians5) * this.f52404o * this.f52406q), (float) (Math.sin(radians5) * this.f52404o * this.f52406q), this.f52403n, this.f52410u);
            i12++;
        }
        float f12 = this.f52404o * 0.85f;
        while (i11 < 30) {
            double d13 = (i11 / d10) * i10;
            double radians6 = Math.toRadians(d13);
            double radians7 = Math.toRadians(f11 + d13);
            double radians8 = Math.toRadians(d13 + f10);
            double d14 = f12;
            a((float) (Math.cos(radians6) * d14 * this.f52406q), (float) (Math.sin(radians6) * d14 * this.f52406q), this.f52403n, this.f52409t);
            a((float) (Math.cos(radians7) * d14 * this.f52406q), (float) (Math.sin(radians7) * d14 * this.f52406q), this.f52403n, this.f52409t);
            a((float) (Math.cos(radians8) * d14 * this.f52406q), (float) (Math.sin(radians8) * d14 * this.f52406q), this.f52403n, this.f52409t);
            i11++;
            d10 = d10;
            f12 = f12;
            f10 = 240.0f;
            f11 = 120.0f;
            i10 = 360;
        }
    }

    public void c() {
        m();
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 1);
        GLES20.glUseProgram(this.f52395f);
        this.f52408s.position(0);
        if (this.f52408s.hasRemaining()) {
            int iRemaining = this.f52408s.remaining() / 7;
            this.f52408s.position(0);
            GLES20.glVertexAttribPointer(this.f52393d, 3, 5126, false, 28, (Buffer) this.f52408s);
            GLES20.glEnableVertexAttribArray(this.f52393d);
            this.f52408s.position(3);
            GLES20.glVertexAttribPointer(this.f52394e, 4, 5126, false, 28, (Buffer) this.f52408s);
            GLES20.glEnableVertexAttribArray(this.f52394e);
            GLES20.glUniformMatrix4fv(this.f52392c, 1, false, this.f52390a.c(), 0);
            GLES20.glDrawArrays(4, 0, iRemaining);
            GLES20.glDisableVertexAttribArray(this.f52393d);
            GLES20.glDisableVertexAttribArray(this.f52394e);
            GLES20.glDisable(3042);
        }
    }

    public final float d() {
        return this.f52400k;
    }

    public final float e() {
        return this.f52401l;
    }

    public final float f() {
        return this.f52407r;
    }

    public void g() {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f52395f = iGlCreateProgram;
        if (iGlCreateProgram != 0) {
            C5871d c5871d = C5871d.f47726a;
            GLES20.glAttachShader(iGlCreateProgram, c5871d.a(35633, c5871d.b(this.f52391b, k.f48503d)));
            GLES20.glAttachShader(this.f52395f, c5871d.a(35632, c5871d.b(this.f52391b, k.f48502c)));
            GLES20.glBindAttribLocation(this.f52395f, 0, "a_Position");
            GLES20.glBindAttribLocation(this.f52395f, 1, "a_Color");
            GLES20.glLinkProgram(this.f52395f);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f52395f, 35714, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteProgram(this.f52395f);
                this.f52395f = 0;
            }
        }
        int i10 = this.f52395f;
        if (i10 == 0) {
            throw new RuntimeException("Error creating program.");
        }
        this.f52392c = GLES20.glGetUniformLocation(i10, "u_MVPMatrix");
        this.f52393d = GLES20.glGetAttribLocation(this.f52395f, "a_Position");
        this.f52394e = GLES20.glGetAttribLocation(this.f52395f, "a_Color");
    }

    public final void h(float f10, float f11, boolean z10) {
        this.f52400k = f10;
        this.f52401l = f11;
        if (z10) {
            this.f52402m = System.currentTimeMillis();
        }
    }

    public final void i(float f10) {
        this.f52406q = f10;
    }

    public final void j(float f10) {
        this.f52407r = f10;
    }

    public final void k(float f10) {
        this.f52405p = f10;
    }
}
