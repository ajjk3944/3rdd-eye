package P;

import A2.l;
import C.C;
import C.S;
import N.n;
import N7.C1154e9;
import N7.G8;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.view.Surface;
import g0.C4356c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: GLUtils.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f10545a = {12344};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f10546b = {12445, 13632, 12344};

    /* renamed from: c, reason: collision with root package name */
    public static final String f10547c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f10548d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f10549e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f10550f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f10551g;

    /* renamed from: h, reason: collision with root package name */
    public static final FloatBuffer f10552h;
    public static final FloatBuffer i;

    /* renamed from: j, reason: collision with root package name */
    public static final P.c f10553j;

    /* compiled from: GLUtils.java */
    public class a implements n {
        @Override // N.n
        public final String a() {
            Locale locale = Locale.US;
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
        }
    }

    /* compiled from: GLUtils.java */
    public class b implements n {
        @Override // N.n
        public final String a() {
            Locale locale = Locale.US;
            return "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
        }
    }

    /* compiled from: GLUtils.java */
    public class c implements n {
        @Override // N.n
        public final String a() {
            Locale locale = Locale.US;
            return "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
        }
    }

    /* compiled from: GLUtils.java */
    /* renamed from: P.d$d, reason: collision with other inner class name */
    public static class C0119d extends f {
    }

    /* compiled from: GLUtils.java */
    public enum e {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    /* compiled from: GLUtils.java */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f10554a;

        /* renamed from: b, reason: collision with root package name */
        public int f10555b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f10556c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f10557d = -1;

        /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public f(java.lang.String r8, java.lang.String r9) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.String r0 = "glAttachShader"
                java.lang.String r1 = "Could not link program: "
                r7.<init>()
                r2 = -1
                r7.f10555b = r2
                r7.f10556c = r2
                r7.f10557d = r2
                r3 = 35633(0x8b31, float:4.9932E-41)
                int r8 = P.d.k(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalStateException -> L71
                r3 = 35632(0x8b30, float:4.9931E-41)
                int r9 = P.d.k(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L67 java.lang.IllegalStateException -> L6b
                int r3 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L62 java.lang.IllegalStateException -> L65
                java.lang.String r4 = "glCreateProgram"
                P.d.b(r4)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                android.opengl.GLES20.glAttachShader(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                P.d.b(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                android.opengl.GLES20.glAttachShader(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                P.d.b(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                android.opengl.GLES20.glLinkProgram(r3)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r0 = 1
                int[] r4 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r5 = 35714(0x8b82, float:5.0046E-41)
                r6 = 0
                android.opengl.GLES20.glGetProgramiv(r3, r5, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r4 = r4[r6]     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                if (r4 != r0) goto L4c
                r7.f10554a = r3     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r7.a()
                return
            L48:
                r0 = move-exception
                goto L73
            L4a:
                r0 = move-exception
                goto L73
            L4c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r4.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r3)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r4.append(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                java.lang.String r1 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                throw r0     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            L62:
                r0 = move-exception
            L63:
                r3 = r2
                goto L73
            L65:
                r0 = move-exception
                goto L63
            L67:
                r0 = move-exception
            L68:
                r9 = r2
            L69:
                r3 = r9
                goto L73
            L6b:
                r0 = move-exception
                goto L68
            L6d:
                r0 = move-exception
            L6e:
                r8 = r2
                r9 = r8
                goto L69
            L71:
                r0 = move-exception
                goto L6e
            L73:
                if (r8 == r2) goto L78
                android.opengl.GLES20.glDeleteShader(r8)
            L78:
                if (r9 == r2) goto L7d
                android.opengl.GLES20.glDeleteShader(r9)
            L7d:
                if (r3 == r2) goto L82
                android.opengl.GLES20.glDeleteProgram(r3)
            L82:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: P.d.f.<init>(java.lang.String, java.lang.String):void");
        }

        public final void a() {
            int i = this.f10554a;
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
            this.f10557d = iGlGetAttribLocation;
            d.e(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
            this.f10555b = iGlGetUniformLocation;
            d.e(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
            this.f10556c = iGlGetUniformLocation2;
            d.e(iGlGetUniformLocation2, "uAlphaScale");
        }

        public void b() {
            GLES20.glUseProgram(this.f10554a);
            d.b("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.f10557d);
            d.b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f10557d, 2, 5126, false, 0, (Buffer) d.f10552h);
            d.b("glVertexAttribPointer");
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            GLES20.glUniformMatrix4fv(this.f10555b, 1, false, fArr, 0);
            d.b("glUniformMatrix4fv");
            GLES20.glUniform1f(this.f10556c, 1.0f);
            d.b("glUniform1f");
        }
    }

    static {
        Locale locale = Locale.US;
        f10547c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f10548d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f10549e = new a();
        f10550f = new b();
        f10551g = new c();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        f10552h = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        i = floatBufferAsFloatBuffer2;
        f10553j = new P.c(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbV = G8.v(str, ": EGL error: 0x");
        sbV.append(Integer.toHexString(iEglGetError));
        throw new IllegalStateException(sbV.toString());
    }

    public static void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbV = G8.v(str, ": GL error 0x");
        sbV.append(Integer.toHexString(iGlGetError));
        throw new IllegalStateException(sbV.toString());
    }

    public static void c(Thread thread) {
        l.q("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static void d(boolean z10, AtomicBoolean atomicBoolean) {
        l.q(z10 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z10 == atomicBoolean.get());
    }

    public static void e(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalStateException(C1154e9.i("Unable to locate '", str, "' in program"));
        }
    }

    public static int[] f(String str, C c10) {
        int[] iArr = f10545a;
        if (c10.f621a == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return f10546b;
            }
            S.g("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static HashMap g(C c10) {
        Object gVar;
        e eVar;
        Map map = Collections.EMPTY_MAP;
        HashMap map2 = new HashMap();
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        for (int i10 = 0; i10 < length; i10++) {
            e eVar2 = eVarArrValues[i10];
            n nVar = (n) map.get(eVar2);
            if (nVar != null) {
                gVar = new g(c10, nVar);
            } else if (eVar2 == e.YUV || eVar2 == (eVar = e.DEFAULT)) {
                gVar = new g(c10, eVar2);
            } else {
                l.q("Unhandled input format: " + eVar2, eVar2 == e.UNKNOWN);
                if (c10.a()) {
                    gVar = new C0119d("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    n nVar2 = (n) map.get(eVar);
                    gVar = nVar2 != null ? new g(c10, nVar2) : new g(c10, eVar);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + eVar2 + " created: " + gVar);
            map2.put(eVar2, gVar);
        }
        return map2;
    }

    public static int h() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        b("glBindTexture " + i10);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i10;
    }

    public static EGLSurface i(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static String j() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return B4.g.o(strGroup, ".", strGroup2);
    }

    public static int k(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        b("glCreateShader type=" + i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        S.g("GLUtils", "Could not compile shader: " + str);
        GLES20.glDeleteShader(iGlCreateShader);
        StringBuilder sbJ = C4356c.j(i10, "Could not compile shader type ", StringUtils.PROCESS_POSTFIX_DELIMITER);
        sbJ.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        throw new IllegalStateException(sbJ.toString());
    }

    /* compiled from: GLUtils.java */
    public static class g extends f {

        /* renamed from: e, reason: collision with root package name */
        public final int f10558e;

        /* renamed from: f, reason: collision with root package name */
        public final int f10559f;

        /* renamed from: g, reason: collision with root package name */
        public final int f10560g;

        /* JADX WARN: Illegal instructions before constructor call */
        public g(C c10, n nVar) {
            String str = c10.a() ? d.f10548d : d.f10547c;
            try {
                String strA = nVar.a();
                if (!strA.contains("vTextureCoord") || !strA.contains("sTexture")) {
                    throw new IllegalArgumentException("Invalid fragment shader");
                }
                super(str, strA);
                this.f10558e = -1;
                this.f10559f = -1;
                this.f10560g = -1;
                a();
                int i = this.f10554a;
                int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "sTexture");
                this.f10558e = iGlGetUniformLocation;
                d.e(iGlGetUniformLocation, "sTexture");
                int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aTextureCoord");
                this.f10560g = iGlGetAttribLocation;
                d.e(iGlGetAttribLocation, "aTextureCoord");
                int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
                this.f10559f = iGlGetUniformLocation2;
                d.e(iGlGetUniformLocation2, "uTexMatrix");
            } catch (Throwable th) {
                if (!(th instanceof IllegalArgumentException)) {
                    throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
                }
                throw th;
            }
        }

        @Override // P.d.f
        public final void b() {
            super.b();
            GLES20.glUniform1i(this.f10558e, 0);
            GLES20.glEnableVertexAttribArray(this.f10560g);
            d.b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f10560g, 2, 5126, false, 0, (Buffer) d.i);
            d.b("glVertexAttribPointer");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public g(C c10, e eVar) {
            n nVar;
            if (c10.a()) {
                l.k("No default sampler shader available for" + eVar, eVar != e.UNKNOWN);
                if (eVar == e.YUV) {
                    nVar = d.f10551g;
                } else {
                    nVar = d.f10550f;
                }
            } else {
                nVar = d.f10549e;
            }
            this(c10, nVar);
        }
    }
}
