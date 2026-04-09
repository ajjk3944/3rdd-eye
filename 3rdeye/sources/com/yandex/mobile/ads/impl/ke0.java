package com.yandex.mobile.ads.impl;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes3.dex */
public final class ke0 {

    /* renamed from: a, reason: collision with root package name */
    private static final le0 f29637a = hm1.c();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f29638b = 0;

    public static void a() {
        int i = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            rs0.b("GlUtil", "glError: " + GLU.gluErrorString(iGlGetError));
            i = iGlGetError;
        }
        if (i != 0) {
            rs0.b("GlUtil", "glError: " + GLU.gluErrorString(i));
        }
    }

    public static int b() {
        if (s82.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            rs0.b("GlUtil", "No current context");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        a();
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        a();
        GLES20.glTexParameteri(36197, 10240, 9729);
        a();
        GLES20.glTexParameteri(36197, 10241, 9729);
        a();
        GLES20.glTexParameteri(36197, 10242, 33071);
        a();
        GLES20.glTexParameteri(36197, 10243, 33071);
        a();
        return i;
    }

    public static boolean c() {
        String strEglQueryString;
        return s82.f32899a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static FloatBuffer a(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (new java.lang.String(r3, r6).equals(com.yandex.mobile.ads.impl.s82.f32902d) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r7) {
        /*
            int r0 = com.yandex.mobile.ads.impl.s82.f32899a
            r1 = 24
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            r1 = 26
            if (r0 >= r1) goto L42
            com.yandex.mobile.ads.impl.le0 r3 = com.yandex.mobile.ads.impl.ke0.f29637a
            r3.getClass()
            java.lang.String r3 = "c2Ftc3VuZw=="
            byte[] r3 = android.util.Base64.decode(r3, r2)
            java.lang.String r4 = "decode(...)"
            kotlin.jvm.internal.l.e(r3, r4)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = y9.C5819a.f48359b
            r5.<init>(r3, r6)
            java.lang.String r3 = com.yandex.mobile.ads.impl.s82.f32901c
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L41
            java.lang.String r3 = "WFQxNjUw"
            byte[] r3 = android.util.Base64.decode(r3, r2)
            kotlin.jvm.internal.l.e(r3, r4)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3, r6)
            java.lang.String r3 = com.yandex.mobile.ads.impl.s82.f32902d
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L42
        L41:
            return r2
        L42:
            if (r0 >= r1) goto L51
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            java.lang.String r0 = "android.hardware.vr.high_performance"
            boolean r7 = r7.hasSystemFeature(r0)
            if (r7 != 0) goto L51
            return r2
        L51:
            android.opengl.EGLDisplay r7 = android.opengl.EGL14.eglGetDisplay(r2)
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r7 = android.opengl.EGL14.eglQueryString(r7, r0)
            if (r7 == 0) goto L67
            java.lang.String r0 = "EGL_EXT_protected_content"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L67
            r7 = 1
            return r7
        L67:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ke0.a(android.content.Context):boolean");
    }

    public static void a(String str) {
        rs0.b("GlUtil", str);
    }
}
