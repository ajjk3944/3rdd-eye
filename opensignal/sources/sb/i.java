package sb;

import a5.a0;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements rb.l, a {
    public int E;
    public SurfaceTexture F;
    public byte[] I;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f21969a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f21970d = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    public final g f21971g = new g();

    /* renamed from: r, reason: collision with root package name */
    public final d8.a f21972r = new d8.a(7, false);

    /* renamed from: x, reason: collision with root package name */
    public final a0 f21973x = new a0(1);

    /* renamed from: y, reason: collision with root package name */
    public final a0 f21974y = new a0(1);
    public final float[] B = new float[16];
    public final float[] D = new float[16];
    public volatile int G = 0;
    public int H = -1;

    @Override // sb.a
    public final void a(long j, float[] fArr) {
        ((a0) this.f21972r.f7150d).a(fArr, j);
    }

    @Override // sb.a
    public final void b() {
        this.f21973x.b();
        d8.a aVar = this.f21972r;
        ((a0) aVar.f7150d).b();
        aVar.f7148b = false;
        this.f21970d.set(true);
    }

    @Override // rb.l
    public final void c(long j, long j7, Format format, MediaFormat mediaFormat) {
        int i10;
        ArrayList arrayListO;
        int iD;
        this.f21973x.a(Long.valueOf(j), j7);
        byte[] bArr = format.R;
        int i11 = format.S;
        byte[] bArr2 = this.I;
        int i12 = this.H;
        this.I = bArr;
        if (i11 == -1) {
            i11 = this.G;
        }
        this.H = i11;
        if (i12 == i11 && Arrays.equals(bArr2, this.I)) {
            return;
        }
        byte[] bArr3 = this.I;
        f fVar = null;
        if (bArr3 != null) {
            int i13 = this.H;
            fb.f fVar2 = new fb.f(bArr3);
            try {
                fVar2.z(4);
                iD = fVar2.d();
                fVar2.y(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iD == 1886547818) {
                fVar2.z(8);
                int i14 = fVar2.f8801b;
                int i15 = fVar2.f8802c;
                while (i14 < i15) {
                    int iD2 = fVar2.d() + i14;
                    if (iD2 > i14 && iD2 <= i15) {
                        int iD3 = fVar2.d();
                        if (iD3 != 2037673328 && iD3 != 1836279920) {
                            fVar2.y(iD2);
                            i14 = iD2;
                        }
                        fVar2.x(iD2);
                        arrayListO = xu.l.O(fVar2);
                        break;
                    }
                    break;
                }
                arrayListO = null;
            } else {
                arrayListO = xu.l.O(fVar2);
            }
            if (arrayListO != null) {
                int size = arrayListO.size();
                if (size == 1) {
                    e eVar = (e) arrayListO.get(0);
                    fVar = new f(eVar, eVar, i13);
                } else if (size == 2) {
                    fVar = new f((e) arrayListO.get(0), (e) arrayListO.get(1), i13);
                }
            }
        }
        if (fVar == null || !g.a(fVar)) {
            int i16 = this.H;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f10 = radians / 36;
            float f11 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 36; i17 < i20; i20 = 36) {
                float f12 = radians / 2.0f;
                float f13 = (i17 * f10) - f12;
                int i21 = i17 + 1;
                float f14 = (i21 * f10) - f12;
                int i22 = 0;
                while (i22 < 73) {
                    int i23 = i21;
                    float f15 = f14;
                    float f16 = radians;
                    int i24 = i18;
                    int i25 = i19;
                    int i26 = 0;
                    int i27 = 2;
                    while (i26 < i27) {
                        float f17 = i26 == 0 ? f13 : f15;
                        float f18 = radians2;
                        float f19 = i22 * f11;
                        float f20 = f13;
                        float f21 = f10;
                        double d6 = 50.0f;
                        double d10 = (f19 + 3.1415927f) - (f18 / 2.0f);
                        double d11 = f17;
                        fArr[i24] = -((float) (Math.cos(d11) * Math.sin(d10) * d6));
                        fArr[i24 + 1] = (float) (Math.sin(d11) * d6);
                        int i28 = i24 + 3;
                        fArr[i24 + 2] = (float) (Math.cos(d11) * Math.cos(d10) * d6);
                        fArr2[i25] = f19 / f18;
                        int i29 = i25 + 2;
                        fArr2[i25 + 1] = ((i17 + i26) * f21) / f16;
                        if ((i22 == 0 && i26 == 0) || (i22 == 72 && i26 == 1)) {
                            System.arraycopy(fArr, i24, fArr, i28, 3);
                            i24 += 6;
                            i10 = 2;
                            System.arraycopy(fArr2, i25, fArr2, i29, 2);
                            i25 += 4;
                        } else {
                            i10 = 2;
                            i24 = i28;
                            i25 = i29;
                        }
                        i26++;
                        i27 = i10;
                        radians2 = f18;
                        f13 = f20;
                        f10 = f21;
                    }
                    i22++;
                    i18 = i24;
                    i19 = i25;
                    i21 = i23;
                    f14 = f15;
                    radians = f16;
                    radians2 = radians2;
                    f10 = f10;
                }
                i17 = i21;
            }
            e eVar2 = new e(new b5.m(0, 1, fArr, fArr2));
            fVar = new f(eVar2, eVar2, i16);
        }
        this.f21974y.a(fVar, j7);
    }

    public final SurfaceTexture d() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        qb.b.h();
        g gVar = this.f21971g;
        gVar.getClass();
        int iO = qb.b.o(TextUtils.join("\n", g.f21957i), TextUtils.join("\n", g.j));
        gVar.f21962c = iO;
        gVar.f21963d = GLES20.glGetUniformLocation(iO, "uMvpMatrix");
        gVar.f21964e = GLES20.glGetUniformLocation(gVar.f21962c, "uTexMatrix");
        gVar.f21965f = GLES20.glGetAttribLocation(gVar.f21962c, "aPosition");
        gVar.f21966g = GLES20.glGetAttribLocation(gVar.f21962c, "aTexCoords");
        gVar.f21967h = GLES20.glGetUniformLocation(gVar.f21962c, "uTexture");
        qb.b.h();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        qb.b.h();
        this.E = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.E);
        this.F = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: sb.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f21968a.f21969a.set(true);
            }
        });
        return this.F;
    }
}
