package O;

import C.C;
import C.Q;
import C.S;
import C.d0;
import N.l;
import P.d;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: DualOpenGlRenderer.java */
/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: n, reason: collision with root package name */
    public int f10136n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f10137o = -1;

    /* renamed from: p, reason: collision with root package name */
    public final Q f10138p;

    /* renamed from: q, reason: collision with root package name */
    public final Q f10139q;

    public c(Q q10, Q q11) {
        this.f10138p = q10;
        this.f10139q = q11;
    }

    @Override // N.l
    public final P.a e(C c10) {
        Map map = Collections.EMPTY_MAP;
        P.a aVarE = super.e(c10);
        this.f10136n = P.d.h();
        this.f10137o = P.d.h();
        return aVarE;
    }

    public final void l(long j4, Surface surface, d0 d0Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        P.d.d(true, this.f4408a);
        P.d.c(this.f4410c);
        HashMap map = this.f4409b;
        A2.l.q("The surface is not registered.", map.containsKey(surface));
        P.g gVarB = (P.g) map.get(surface);
        Objects.requireNonNull(gVarB);
        if (gVarB == P.d.f10553j) {
            gVarB = b(surface);
            if (gVarB == null) {
                return;
            } else {
                map.put(surface, gVarB);
            }
        }
        P.g gVar = gVarB;
        if (surface != this.i) {
            f(gVar.a());
            this.i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        m(gVar, d0Var, surfaceTexture, this.f10138p, this.f10136n);
        m(gVar, d0Var, surfaceTexture2, this.f10139q, this.f10137o);
        EGLExt.eglPresentationTimeANDROID(this.f4411d, gVar.a(), j4);
        if (EGL14.eglSwapBuffers(this.f4411d, gVar.a())) {
            return;
        }
        S.g("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        i(surface, false);
    }

    public final void m(P.g gVar, d0 d0Var, SurfaceTexture surfaceTexture, Q q10, int i) {
        k(i);
        GLES20.glViewport(0, 0, gVar.c(), gVar.b());
        GLES20.glScissor(0, 0, gVar.c(), gVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        d0Var.M(fArr2, fArr);
        d.f fVar = this.f4417k;
        fVar.getClass();
        if (fVar instanceof d.g) {
            GLES20.glUniformMatrix4fv(((d.g) fVar).f10559f, 1, false, fArr2, 0);
            P.d.b("glUniformMatrix4fv");
        }
        float fC = gVar.c();
        q10.getClass();
        Size size = new Size((int) (fC * 1.0f), (int) (gVar.b() * 1.0f));
        Size size2 = new Size(gVar.c(), gVar.b());
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArr4, 0, 0.0f, 0.0f, 0.0f);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(fVar.f10555b, 1, false, fArr5, 0);
        P.d.b("glUniformMatrix4fv");
        GLES20.glUniform1f(fVar.f10556c, 1.0f);
        P.d.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        P.d.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
