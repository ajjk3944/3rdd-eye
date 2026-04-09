package sb;

import a5.a0;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class j implements GLSurfaceView.Renderer, c {
    public float B;
    public float D;
    public final /* synthetic */ l G;

    /* renamed from: a, reason: collision with root package name */
    public final i f21975a;

    /* renamed from: r, reason: collision with root package name */
    public final float[] f21978r;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f21979x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f21980y;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f21976d = new float[16];

    /* renamed from: g, reason: collision with root package name */
    public final float[] f21977g = new float[16];
    public final float[] E = new float[16];
    public final float[] F = new float[16];

    public j(l lVar, i iVar) {
        this.G = lVar;
        float[] fArr = new float[16];
        this.f21978r = fArr;
        float[] fArr2 = new float[16];
        this.f21979x = fArr2;
        float[] fArr3 = new float[16];
        this.f21980y = fArr3;
        this.f21975a = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.D = 3.1415927f;
    }

    @Override // sb.c
    public final synchronized void a(float[] fArr, float f10) {
        float[] fArr2 = this.f21978r;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f11 = -f10;
        this.D = f11;
        Matrix.setRotateM(this.f21979x, 0, -this.B, (float) Math.cos(f11), (float) Math.sin(this.D), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Object objD;
        Object objD2;
        Object objD3;
        float[] fArr;
        synchronized (this) {
            Matrix.multiplyMM(this.F, 0, this.f21978r, 0, this.f21980y, 0);
            Matrix.multiplyMM(this.E, 0, this.f21979x, 0, this.F, 0);
        }
        Matrix.multiplyMM(this.f21977g, 0, this.f21976d, 0, this.E, 0);
        i iVar = this.f21975a;
        float[] fArr2 = this.f21977g;
        GLES20.glClear(16384);
        qb.b.h();
        if (iVar.f21969a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = iVar.F;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            qb.b.h();
            if (iVar.f21970d.compareAndSet(true, false)) {
                Matrix.setIdentityM(iVar.B, 0);
            }
            long timestamp = iVar.F.getTimestamp();
            a0 a0Var = iVar.f21973x;
            synchronized (a0Var) {
                objD = a0Var.d(timestamp, false);
            }
            Long l10 = (Long) objD;
            if (l10 != null) {
                d8.a aVar = iVar.f21972r;
                float[] fArr3 = iVar.B;
                long jLongValue = l10.longValue();
                a0 a0Var2 = (a0) aVar.f7150d;
                synchronized (a0Var2) {
                    objD3 = a0Var2.d(jLongValue, true);
                }
                float[] fArr4 = (float[]) objD3;
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) aVar.f7147a;
                    float f10 = fArr4[0];
                    float f11 = -fArr4[1];
                    float f12 = -fArr4[2];
                    float length = Matrix.length(f10, f11, f12);
                    if (length != 0.0f) {
                        fArr = fArr3;
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
                    } else {
                        fArr = fArr3;
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!aVar.f7148b) {
                        d8.a.d((float[]) aVar.f7149c, (float[]) aVar.f7147a);
                        aVar.f7148b = true;
                    }
                    Matrix.multiplyMM(fArr, 0, (float[]) aVar.f7149c, 0, (float[]) aVar.f7147a, 0);
                }
            }
            a0 a0Var3 = iVar.f21974y;
            synchronized (a0Var3) {
                objD2 = a0Var3.d(timestamp, true);
            }
            f fVar = (f) objD2;
            if (fVar != null) {
                g gVar = iVar.f21971g;
                gVar.getClass();
                if (g.a(fVar)) {
                    gVar.f21960a = fVar.f21955c;
                    b5.m mVar = fVar.f21953a.f21952a[0];
                    b5.m mVar2 = new b5.m();
                    float[] fArr6 = (float[]) mVar.f2459g;
                    mVar2.f2457a = fArr6.length / 3;
                    mVar2.f2459g = qb.b.p(fArr6);
                    mVar2.f2460r = qb.b.p((float[]) mVar.f2460r);
                    int i10 = mVar.f2458d;
                    if (i10 == 1) {
                        mVar2.f2458d = 5;
                    } else if (i10 != 2) {
                        mVar2.f2458d = 4;
                    } else {
                        mVar2.f2458d = 6;
                    }
                    gVar.f21961b = mVar2;
                    if (!fVar.f21956d) {
                        b5.m mVar3 = fVar.f21954b.f21952a[0];
                        float[] fArr7 = (float[]) mVar3.f2459g;
                        int length2 = fArr7.length;
                        qb.b.p(fArr7);
                        qb.b.p((float[]) mVar3.f2460r);
                    }
                }
            }
        }
        Matrix.multiplyMM(iVar.D, 0, fArr2, 0, iVar.B, 0);
        g gVar2 = iVar.f21971g;
        int i11 = iVar.E;
        float[] fArr8 = iVar.D;
        b5.m mVar4 = gVar2.f21961b;
        if (mVar4 == null) {
            return;
        }
        GLES20.glUseProgram(gVar2.f21962c);
        qb.b.h();
        GLES20.glEnableVertexAttribArray(gVar2.f21965f);
        GLES20.glEnableVertexAttribArray(gVar2.f21966g);
        qb.b.h();
        int i12 = gVar2.f21960a;
        GLES20.glUniformMatrix3fv(gVar2.f21964e, 1, false, i12 == 1 ? g.f21958l : i12 == 2 ? g.f21959m : g.k, 0);
        GLES20.glUniformMatrix4fv(gVar2.f21963d, 1, false, fArr8, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i11);
        GLES20.glUniform1i(gVar2.f21967h, 0);
        qb.b.h();
        GLES20.glVertexAttribPointer(gVar2.f21965f, 3, 5126, false, 12, (Buffer) mVar4.f2459g);
        qb.b.h();
        GLES20.glVertexAttribPointer(gVar2.f21966g, 2, 5126, false, 8, (Buffer) mVar4.f2460r);
        qb.b.h();
        GLES20.glDrawArrays(mVar4.f2458d, 0, mVar4.f2457a);
        qb.b.h();
        GLES20.glDisableVertexAttribArray(gVar2.f21965f);
        GLES20.glDisableVertexAttribArray(gVar2.f21966g);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        Matrix.perspectiveM(this.f21976d, 0, f10 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d) : 90.0f, f10, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        l lVar = this.G;
        lVar.f21985x.post(new s9.c(lVar, 1, this.f21975a.d()));
    }
}
