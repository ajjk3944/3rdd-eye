package N;

import C.C;
import C.RunnableC0615b;
import C.S;
import C.T;
import C.V;
import C.d0;
import C.g0;
import C.k0;
import P.d;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import o0.b;
import v.RunnableC5655j;

/* compiled from: DefaultSurfaceProcessor.java */
/* loaded from: classes.dex */
public final class j implements u, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: b, reason: collision with root package name */
    public final l f4397b;

    /* renamed from: c, reason: collision with root package name */
    public final HandlerThread f4398c;

    /* renamed from: d, reason: collision with root package name */
    public final H.c f4399d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f4400e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f4401f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f4402g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f4403h;
    public final LinkedHashMap i;

    /* renamed from: j, reason: collision with root package name */
    public int f4404j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4405k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4406l;

    /* compiled from: DefaultSurfaceProcessor.java */
    public static abstract class a {
        public abstract b.a<Void> a();

        public abstract int b();

        public abstract int c();
    }

    public j(C c10) {
        Map map = Collections.EMPTY_MAP;
        this.f4401f = new AtomicBoolean(false);
        this.f4402g = new float[16];
        this.f4403h = new float[16];
        this.i = new LinkedHashMap();
        this.f4404j = 0;
        this.f4405k = false;
        this.f4406l = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f4398c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f4400e = handler;
        this.f4399d = new H.c(handler);
        this.f4397b = new l();
        try {
            try {
                o0.b.a(new F3.k(this, c10)).get();
            } catch (InterruptedException | ExecutionException e4) {
                e = e4;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e10) {
            release();
            throw e10;
        }
    }

    @Override // N.u
    public final void a(k0 k0Var) {
        if (this.f4401f.get()) {
            k0Var.d();
        } else {
            e(new T(7, this, k0Var), new V(k0Var, 2));
        }
    }

    @Override // N.u
    public final void b(d0 d0Var) throws IOException {
        if (this.f4401f.get()) {
            d0Var.close();
            return;
        }
        RunnableC0615b runnableC0615b = new RunnableC0615b(7, this, d0Var);
        Objects.requireNonNull(d0Var);
        e(runnableC0615b, new g0(d0Var, 5));
    }

    @Override // N.u
    public final A4.a<Void> c(final int i, final int i10) {
        return I.j.f(o0.b.a(new b.c() { // from class: N.e
            @Override // o0.b.c
            public final Object i(b.a aVar) {
                j jVar = this.f4380b;
                jVar.getClass();
                jVar.e(new B.c(5, jVar, new a(i, i10, aVar)), new C2.h(aVar, 4));
                return "DefaultSurfaceProcessor#snapshot";
            }
        }));
    }

    public final void d() {
        if (this.f4405k && this.f4404j == 0) {
            LinkedHashMap linkedHashMap = this.i;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((d0) it.next()).close();
            }
            Iterator it2 = this.f4406l.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).a().d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            l lVar = this.f4397b;
            if (lVar.f4408a.getAndSet(false)) {
                P.d.c(lVar.f4410c);
                lVar.h();
            }
            this.f4398c.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.f4399d.execute(new d(this, runnable2, runnable, 0));
        } catch (RejectedExecutionException e4) {
            S.h("DefaultSurfaceProcessor", "Unable to executor runnable", e4);
            runnable2.run();
        }
    }

    public final void f(Exception exc) {
        ArrayList arrayList = this.f4406l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a().d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap g(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        B7.d.v(fArr2, i);
        B7.d.w(fArr2);
        Size sizeG = G.o.g(size, i);
        l lVar = this.f4397b;
        lVar.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeG.getHeight() * sizeG.getWidth() * 4);
        A2.l.k("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeG.getHeight() * sizeG.getWidth()) * 4);
        A2.l.k("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = P.d.f10545a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        P.d.b("glGenTextures");
        int i10 = iArr2[0];
        GLES20.glActiveTexture(33985);
        P.d.b("glActiveTexture");
        GLES20.glBindTexture(3553, i10);
        P.d.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeG.getWidth(), sizeG.getHeight(), 0, 6407, 5121, null);
        P.d.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        P.d.b("glGenFramebuffers");
        int i11 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i11);
        P.d.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i10, 0);
        P.d.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        P.d.b("glActiveTexture");
        GLES20.glBindTexture(36197, lVar.f4419m);
        P.d.b("glBindTexture");
        lVar.i = null;
        GLES20.glViewport(0, 0, sizeG.getWidth(), sizeG.getHeight());
        GLES20.glScissor(0, 0, sizeG.getWidth(), sizeG.getHeight());
        d.f fVar = lVar.f4417k;
        fVar.getClass();
        if (fVar instanceof d.g) {
            GLES20.glUniformMatrix4fv(((d.g) fVar).f10559f, 1, false, fArr2, 0);
            P.d.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        P.d.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeG.getWidth(), sizeG.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        P.d.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        P.d.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i11}, 0);
        P.d.b("glDeleteFramebuffers");
        int i12 = lVar.f4419m;
        GLES20.glActiveTexture(33984);
        P.d.b("glActiveTexture");
        GLES20.glBindTexture(36197, i12);
        P.d.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeG.getWidth(), sizeG.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.e(bitmapCreateBitmap, byteBufferAllocateDirect, sizeG.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void h(b9.q<Surface, Size, float[]> qVar) throws IOException {
        ArrayList arrayList = this.f4406l;
        if (arrayList.isEmpty()) {
            return;
        }
        if (qVar == null) {
            f(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int iC = -1;
                int iB = -1;
                Bitmap bitmapG = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (iC != aVar.c() || bitmapG == null) {
                        iC = aVar.c();
                        if (bitmapG != null) {
                            bitmapG.recycle();
                        }
                        bitmapG = g(qVar.f18094c, qVar.f18095d, iC);
                        iB = -1;
                    }
                    if (iB != aVar.b()) {
                        byteArrayOutputStream.reset();
                        iB = aVar.b();
                        bitmapG.compress(Bitmap.CompressFormat.JPEG, iB, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = qVar.f18093b;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.f(byteArray, surface);
                    aVar.a().b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e4) {
            f(e4);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        if (this.f4401f.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f4402g;
        surfaceTexture.getTransformMatrix(fArr);
        b9.q<Surface, Size, float[]> qVar = null;
        for (Map.Entry entry : this.i.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            d0 d0Var = (d0) entry.getKey();
            float[] fArr2 = this.f4403h;
            d0Var.i(fArr2, fArr);
            if (d0Var.getFormat() == 34) {
                try {
                    this.f4397b.j(surfaceTexture.getTimestamp(), fArr2, surface);
                } catch (RuntimeException e4) {
                    S.c("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e4);
                }
            } else {
                A2.l.q("Unsupported format: " + d0Var.getFormat(), d0Var.getFormat() == 256);
                A2.l.q("Only one JPEG output is supported.", qVar == null);
                qVar = new b9.q<>(surface, d0Var.getSize(), (float[]) fArr2.clone());
            }
        }
        try {
            h(qVar);
        } catch (RuntimeException e10) {
            f(e10);
        }
    }

    @Override // N.u
    public final void release() {
        if (this.f4401f.getAndSet(true)) {
            return;
        }
        e(new C2.h(this, 5), new RunnableC5655j(0));
    }
}
