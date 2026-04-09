package com.yandex.mobile.ads.impl;

import android.opengl.GLES20;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class je0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f29114a;

    /* renamed from: b, reason: collision with root package name */
    private final a[] f29115b;

    /* renamed from: c, reason: collision with root package name */
    private final b[] f29116c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f29117d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f29118e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f29119a;

        private a(String str) {
            this.f29119a = str;
        }

        public static a a(int i, int i10) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i11 = iArr[0];
            byte[] bArr = new byte[i11];
            GLES20.glGetActiveAttrib(i, i10, i11, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                if (bArr[i12] == 0) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
            String str = new String(bArr, 0, i11);
            GLES20.glGetAttribLocation(i, str);
            return new a(str);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f29120a;

        private b(String str) {
            this.f29120a = str;
        }

        public static b a(int i, int i10) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int i11 = iArr[0];
            byte[] bArr = new byte[i11];
            GLES20.glGetActiveUniform(i, i10, i11, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                if (bArr[i12] == 0) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
            String str = new String(bArr, 0, i11);
            GLES20.glGetUniformLocation(i, str);
            return new b(str);
        }
    }

    public je0() {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f29114a = iGlCreateProgram;
        ke0.a();
        a(iGlCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        a(iGlCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            ke0.a("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        }
        GLES20.glUseProgram(iGlCreateProgram);
        this.f29117d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f29115b = new a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            a aVarA = a.a(this.f29114a, i);
            this.f29115b[i] = aVarA;
            this.f29117d.put(aVarA.f29119a, aVarA);
        }
        this.f29118e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f29114a, 35718, iArr3, 0);
        this.f29116c = new b[iArr3[0]];
        for (int i10 = 0; i10 < iArr3[0]; i10++) {
            b bVarA = b.a(this.f29114a, i10);
            this.f29116c[i10] = bVarA;
            this.f29118e.put(bVarA.f29120a, bVarA);
        }
        ke0.a();
    }

    private static void a(int i, int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String str2 = GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str;
            int i11 = ke0.f29638b;
            rs0.b("GlUtil", str2);
        }
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        ke0.a();
    }

    public final int b(String str) {
        return GLES20.glGetUniformLocation(this.f29114a, str);
    }

    public final int a(String str) {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f29114a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        ke0.a();
        return iGlGetAttribLocation;
    }
}
