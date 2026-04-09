package d5;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.Metadata;
import androidx.media3.common.e1;
import androidx.media3.common.g1;
import androidx.media3.common.h1;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.s1;
import com.google.android.gms.internal.measurement.h4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.a1;
import o5.b1;

/* loaded from: classes.dex */
public final class z extends androidx.lifecycle.o implements ExoPlayer, g, n, m, l {
    public c A0;
    public final z B;
    public c B0;
    public int C0;
    public final u0[] D;
    public androidx.media3.common.f D0;
    public final androidx.media3.exoplayer.trackselection.b0 E;
    public float E0;
    public final a5.z F;
    public boolean F0;
    public final s G;
    public z4.c G0;
    public final e0 H;
    public s5.d H0;
    public final a5.m I;
    public t5.a I0;
    public final CopyOnWriteArraySet J;
    public final boolean J0;
    public final androidx.media3.common.y0 K;
    public boolean K0;
    public final ArrayList L;
    public boolean L0;
    public final boolean M;
    public androidx.media3.common.m M0;
    public final o5.y N;
    public h1 N0;
    public final AnalyticsCollector O;
    public androidx.media3.common.g0 O0;
    public final Looper P;
    public p0 P0;
    public final r5.d Q;
    public int Q0;
    public final long R;
    public long R0;
    public final long S;
    public final a5.x T;
    public final w U;
    public final x V;
    public final h4 W;
    public final a X;
    public final s1 Y;
    public final z0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final z0 f7111a0;

    /* renamed from: b0, reason: collision with root package name */
    public final long f7112b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f7113c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f7114d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f7115e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f7116f0;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.c0 f7117g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f7118g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f7119h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f7120i0;

    /* renamed from: j0, reason: collision with root package name */
    public x0 f7121j0;

    /* renamed from: k0, reason: collision with root package name */
    public b1 f7122k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f7123l0;

    /* renamed from: m0, reason: collision with root package name */
    public androidx.media3.common.o0 f7124m0;

    /* renamed from: n0, reason: collision with root package name */
    public androidx.media3.common.g0 f7125n0;

    /* renamed from: o0, reason: collision with root package name */
    public androidx.media3.common.g0 f7126o0;

    /* renamed from: p0, reason: collision with root package name */
    public androidx.media3.common.r f7127p0;

    /* renamed from: q0, reason: collision with root package name */
    public androidx.media3.common.r f7128q0;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.media3.common.o0 f7129r;

    /* renamed from: r0, reason: collision with root package name */
    public AudioTrack f7130r0;

    /* renamed from: s0, reason: collision with root package name */
    public Object f7131s0;

    /* renamed from: t0, reason: collision with root package name */
    public Surface f7132t0;

    /* renamed from: u0, reason: collision with root package name */
    public SurfaceHolder f7133u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f7134v0;

    /* renamed from: w0, reason: collision with root package name */
    public TextureView f7135w0;

    /* renamed from: x, reason: collision with root package name */
    public final a5.d f7136x;

    /* renamed from: x0, reason: collision with root package name */
    public int f7137x0;

    /* renamed from: y, reason: collision with root package name */
    public final Context f7138y;

    /* renamed from: y0, reason: collision with root package name */
    public int f7139y0;

    /* renamed from: z0, reason: collision with root package name */
    public a5.w f7140z0;

    static {
        MediaLibraryInfo.registerModule("media3.exoplayer");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(k kVar) {
        super(1);
        int i10 = 1;
        this.f7136x = new a5.d(0);
        try {
            Integer.toHexString(System.identityHashCode(this));
            int i11 = a5.d0.f105a;
            a5.a.t();
            Context context = kVar.f7005a;
            a5.x xVar = kVar.f7006b;
            this.f7138y = context.getApplicationContext();
            this.O = new DefaultAnalyticsCollector(xVar);
            this.D0 = kVar.f7013i;
            this.f7137x0 = kVar.j;
            this.f7139y0 = 0;
            this.F0 = false;
            this.f7112b0 = kVar.f7019q;
            w wVar = new w(this);
            this.U = wVar;
            this.V = new x();
            Handler handler = new Handler(kVar.f7012h);
            u0[] u0VarArrV = ((bm.e) kVar.f7007c.get()).v(handler, wVar, wVar, wVar, wVar);
            this.D = u0VarArrV;
            a5.a.i(u0VarArrV.length > 0);
            this.E = (androidx.media3.exoplayer.trackselection.b0) kVar.f7009e.get();
            this.N = (o5.y) kVar.f7008d.get();
            this.Q = (r5.d) kVar.f7011g.get();
            this.M = kVar.k;
            this.f7121j0 = kVar.f7014l;
            this.R = kVar.f7015m;
            this.S = kVar.f7016n;
            this.f7123l0 = false;
            Looper looper = kVar.f7012h;
            this.P = looper;
            this.T = xVar;
            this.B = this;
            this.I = new a5.m(looper, xVar, new s(this, i10));
            this.J = new CopyOnWriteArraySet();
            this.L = new ArrayList();
            this.f7122k0 = new a1();
            this.f7117g = new androidx.media3.exoplayer.trackselection.c0(new w0[u0VarArrV.length], new androidx.media3.exoplayer.trackselection.v[u0VarArrV.length], g1.f1687d, null);
            this.K = new androidx.media3.common.y0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i12 = 0; i12 < 21; i12++) {
                int i13 = iArr[i12];
                a5.a.i(!false);
                sparseBooleanArray.append(i13, true);
            }
            if (this.E.isSetParametersSupported()) {
                a5.a.i(!false);
                sparseBooleanArray.append(29, true);
            }
            a5.a.i(!false);
            androidx.media3.common.p pVar = new androidx.media3.common.p(sparseBooleanArray);
            this.f7129r = new androidx.media3.common.o0(pVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i14 = 0; i14 < pVar.f1732a.size(); i14++) {
                int iA = pVar.a(i14);
                a5.a.i(!false);
                sparseBooleanArray2.append(iA, true);
            }
            a5.a.i(!false);
            sparseBooleanArray2.append(4, true);
            a5.a.i(!false);
            sparseBooleanArray2.append(10, true);
            a5.a.i(!false);
            this.f7124m0 = new androidx.media3.common.o0(new androidx.media3.common.p(sparseBooleanArray2));
            this.F = this.T.a(this.P, null);
            s sVar = new s(this, 2);
            this.G = sVar;
            this.P0 = p0.h(this.f7117g);
            this.O.setPlayer(this.B, this.P);
            int i15 = a5.d0.f105a;
            this.H = new e0(this.D, this.E, this.f7117g, (e) kVar.f7010f.get(), this.Q, this.f7113c0, this.f7114d0, this.O, this.f7121j0, kVar.f7017o, kVar.f7018p, this.f7123l0, this.P, this.T, sVar, i15 < 31 ? new e5.o0() : t.a(this.f7138y, this, kVar.f7020r));
            this.E0 = 1.0f;
            this.f7113c0 = 0;
            androidx.media3.common.g0 g0Var = androidx.media3.common.g0.f1655e0;
            this.f7125n0 = g0Var;
            this.f7126o0 = g0Var;
            this.O0 = g0Var;
            int iGenerateAudioSessionId = -1;
            this.Q0 = -1;
            if (i15 < 21) {
                this.C0 = B1(0);
            } else {
                AudioManager audioManager = (AudioManager) this.f7138y.getSystemService("audio");
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.C0 = iGenerateAudioSessionId;
            }
            this.G0 = z4.c.f26652d;
            this.J0 = true;
            addListener(this.O);
            this.Q.c(new Handler(this.P), this.O);
            addAudioOffloadListener(this.U);
            w wVar2 = this.U;
            h4 h4Var = new h4();
            h4Var.f5056d = context.getApplicationContext();
            h4Var.f5057g = new com.google.android.exoplayer2.a(h4Var, handler, wVar2, 1);
            this.W = h4Var;
            h4Var.l(false);
            a aVar = new a(context, handler, this.U);
            this.X = aVar;
            aVar.b(null);
            s1 s1Var = new s1(context, handler, this.U);
            this.Y = s1Var;
            s1Var.c(a5.d0.y(this.D0.f1621g));
            z0 z0Var = new z0(context, 0);
            this.Z = z0Var;
            z0Var.d(false);
            z0 z0Var2 = new z0(context, 1);
            this.f7111a0 = z0Var2;
            z0Var2.d(false);
            AudioManager audioManager2 = s1Var.f4447d;
            this.M0 = new androidx.media3.common.m(0, i15 >= 28 ? audioManager2.getStreamMinVolume(s1Var.f4448e) : 0, audioManager2.getStreamMaxVolume(s1Var.f4448e));
            this.N0 = h1.f1694x;
            this.f7140z0 = a5.w.f168c;
            this.E.setAudioAttributes(this.D0);
            J1(1, 10, Integer.valueOf(this.C0));
            J1(2, 10, Integer.valueOf(this.C0));
            J1(1, 3, this.D0);
            J1(2, 4, Integer.valueOf(this.f7137x0));
            J1(2, 5, Integer.valueOf(this.f7139y0));
            J1(1, 9, Boolean.valueOf(this.F0));
            J1(2, 7, this.V);
            J1(6, 8, this.V);
            this.f7136x.d();
        } catch (Throwable th2) {
            this.f7136x.d();
            throw th2;
        }
    }

    public static long A1(p0 p0Var) {
        androidx.media3.common.z0 z0Var = new androidx.media3.common.z0();
        androidx.media3.common.y0 y0Var = new androidx.media3.common.y0();
        p0Var.f7057a.g(p0Var.f7058b.f1689a, y0Var);
        long j = p0Var.f7059c;
        return j == -9223372036854775807L ? p0Var.f7057a.m(y0Var.f1829g, z0Var, 0L).I : y0Var.f1831x + j;
    }

    public static boolean C1(p0 p0Var) {
        return p0Var.f7061e == 3 && p0Var.f7066l && p0Var.f7067m == 0;
    }

    public final int B1(int i10) {
        AudioTrack audioTrack = this.f7130r0;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.f7130r0.release();
            this.f7130r0 = null;
        }
        if (this.f7130r0 == null) {
            this.f7130r0 = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.f7130r0.getAudioSessionId();
    }

    public final p0 D1(p0 p0Var, androidx.media3.common.a1 a1Var, Pair pair) {
        List list;
        a5.a.e(a1Var.p() || pair != null);
        androidx.media3.common.a1 a1Var2 = p0Var.f7057a;
        p0 p0VarG = p0Var.g(a1Var);
        if (a1Var.p()) {
            o5.z zVar = p0.f7056s;
            long jG = a5.d0.G(this.R0);
            p0 p0VarA = p0VarG.b(zVar, jG, jG, jG, 0L, o5.h1.f18956r, this.f7117g, oe.u0.f19383x).a(zVar);
            p0VarA.f7070p = p0VarA.f7072r;
            return p0VarA;
        }
        Object obj = p0VarG.f7058b.f1689a;
        int i10 = a5.d0.f105a;
        boolean zEquals = obj.equals(pair.first);
        o5.z zVar2 = !zEquals ? new o5.z(pair.first) : p0VarG.f7058b;
        long jLongValue = ((Long) pair.second).longValue();
        long jG2 = a5.d0.G(getContentPosition());
        if (!a1Var2.p()) {
            jG2 -= a1Var2.g(obj, this.K).f1831x;
        }
        if (!zEquals || jLongValue < jG2) {
            o5.z zVar3 = zVar2;
            a5.a.i(!zVar3.a());
            o5.h1 h1Var = !zEquals ? o5.h1.f18956r : p0VarG.f7064h;
            androidx.media3.exoplayer.trackselection.c0 c0Var = !zEquals ? this.f7117g : p0VarG.f7065i;
            if (zEquals) {
                list = p0VarG.j;
            } else {
                oe.f0 f0Var = oe.h0.f19336d;
                list = oe.u0.f19383x;
            }
            p0 p0VarA2 = p0VarG.b(zVar3, jLongValue, jLongValue, jLongValue, 0L, h1Var, c0Var, list).a(zVar3);
            p0VarA2.f7070p = jLongValue;
            return p0VarA2;
        }
        if (jLongValue != jG2) {
            o5.z zVar4 = zVar2;
            a5.a.i(!zVar4.a());
            long jMax = Math.max(0L, p0VarG.f7071q - (jLongValue - jG2));
            long j = p0VarG.f7070p;
            if (p0VarG.k.equals(p0VarG.f7058b)) {
                j = jLongValue + jMax;
            }
            p0 p0VarB = p0VarG.b(zVar4, jLongValue, jLongValue, jLongValue, jMax, p0VarG.f7064h, p0VarG.f7065i, p0VarG.j);
            p0VarB.f7070p = j;
            return p0VarB;
        }
        int iB = a1Var.b(p0VarG.k.f1689a);
        if (iB != -1 && a1Var.f(iB, this.K, false).f1829g == a1Var.g(zVar2.f1689a, this.K).f1829g) {
            return p0VarG;
        }
        a1Var.g(zVar2.f1689a, this.K);
        long jA = zVar2.a() ? this.K.a(zVar2.f1690b, zVar2.f1691c) : this.K.f1830r;
        o5.z zVar5 = zVar2;
        p0 p0VarA3 = p0VarG.b(zVar5, p0VarG.f7072r, p0VarG.f7072r, p0VarG.f7060d, jA - p0VarG.f7072r, p0VarG.f7064h, p0VarG.f7065i, p0VarG.j).a(zVar5);
        p0VarA3.f7070p = jA;
        return p0VarA3;
    }

    public final Pair E1(androidx.media3.common.a1 a1Var, int i10, long j) {
        if (a1Var.p()) {
            this.Q0 = i10;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.R0 = j;
            return null;
        }
        if (i10 == -1 || i10 >= a1Var.o()) {
            i10 = a1Var.a(this.f7114d0);
            j = a5.d0.P(a1Var.m(i10, (androidx.media3.common.z0) this.f1504d, 0L).I);
        }
        return a1Var.i((androidx.media3.common.z0) this.f1504d, this.K, i10, a5.d0.G(j));
    }

    public final void F1(final int i10, final int i11) {
        a5.w wVar = this.f7140z0;
        if (i10 == wVar.f169a && i11 == wVar.f170b) {
            return;
        }
        this.f7140z0 = new a5.w(i10, i11);
        this.I.f(24, new a5.j() { // from class: d5.r
            @Override // a5.j
            public final void a(Object obj) {
                ((androidx.media3.common.q0) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
    }

    public final p0 G1(int i10, int i11) {
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        androidx.media3.common.a1 currentTimeline = getCurrentTimeline();
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        this.f7115e0++;
        H1(i10, i11);
        t0 t0Var = new t0(arrayList, this.f7122k0);
        p0 p0VarD1 = D1(this.P0, t0Var, z1(currentTimeline, t0Var));
        int i12 = p0VarD1.f7061e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && currentMediaItemIndex >= p0VarD1.f7057a.o()) {
            p0VarD1 = p0VarD1.f(4);
        }
        b1 b1Var = this.f7122k0;
        a5.z zVar = this.H.D;
        zVar.getClass();
        a5.y yVarC = a5.z.c();
        yVarC.f171a = zVar.f173a.obtainMessage(20, i10, i11, b1Var);
        yVarC.b();
        return p0VarD1;
    }

    public final void H1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.L.remove(i12);
        }
        a1 a1Var = (a1) this.f7122k0;
        int i13 = i11 - i10;
        int[] iArr = a1Var.f18892b;
        int[] iArr2 = new int[iArr.length - i13];
        int i14 = 0;
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            if (i16 < i10 || i16 >= i11) {
                int i17 = i15 - i14;
                if (i16 >= i10) {
                    i16 -= i13;
                }
                iArr2[i17] = i16;
            } else {
                i14++;
            }
        }
        this.f7122k0 = new a1(iArr2, new Random(a1Var.f18891a.nextLong()));
    }

    public final void I1() {
        TextureView textureView = this.f7135w0;
        w wVar = this.U;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != wVar) {
                a5.a.B("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f7135w0.setSurfaceTextureListener(null);
            }
            this.f7135w0 = null;
        }
        SurfaceHolder surfaceHolder = this.f7133u0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(wVar);
            this.f7133u0 = null;
        }
    }

    public final void J1(int i10, int i11, Object obj) {
        for (u0 u0Var : this.D) {
            if (((b) u0Var).f6925a == i10) {
                s0 s0VarW1 = w1(u0Var);
                s0VarW1.e(i11);
                s0VarW1.d(obj);
                s0VarW1.c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K1(java.util.List r16, int r17, long r18, boolean r20) {
        /*
            r15 = this;
            r1 = r17
            int r2 = r15.y1()
            long r3 = r15.getCurrentPosition()
            int r5 = r15.f7115e0
            r6 = 1
            int r5 = r5 + r6
            r15.f7115e0 = r5
            java.util.ArrayList r5 = r15.L
            boolean r7 = r5.isEmpty()
            r8 = 0
            if (r7 != 0) goto L20
            int r7 = r5.size()
            r15.H1(r8, r7)
        L20:
            r7 = r16
            java.util.ArrayList r10 = r15.t1(r8, r7)
            d5.t0 r7 = new d5.t0
            o5.b1 r9 = r15.f7122k0
            r7.<init>(r5, r9)
            boolean r5 = r7.p()
            int r9 = r7.f7089r
            if (r5 != 0) goto L3e
            if (r1 >= r9) goto L38
            goto L3e
        L38:
            androidx.media3.common.u r1 = new androidx.media3.common.u
            r1.<init>()
            throw r1
        L3e:
            r5 = -1
            if (r20 == 0) goto L4e
            boolean r1 = r15.f7114d0
            int r1 = r7.a(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4c:
            r12 = r1
            goto L56
        L4e:
            if (r1 != r5) goto L53
            r12 = r2
            r2 = r3
            goto L56
        L53:
            r2 = r18
            goto L4c
        L56:
            d5.p0 r1 = r15.P0
            android.util.Pair r4 = r15.E1(r7, r12, r2)
            d5.p0 r1 = r15.D1(r1, r7, r4)
            int r4 = r1.f7061e
            if (r12 == r5) goto L72
            if (r4 == r6) goto L72
            boolean r4 = r7.p()
            if (r4 != 0) goto L71
            if (r12 < r9) goto L6f
            goto L71
        L6f:
            r4 = 2
            goto L72
        L71:
            r4 = 4
        L72:
            d5.p0 r1 = r1.f(r4)
            long r13 = a5.d0.G(r2)
            o5.b1 r11 = r15.f7122k0
            d5.e0 r2 = r15.H
            a5.z r2 = r2.D
            d5.b0 r9 = new d5.b0
            r9.<init>(r10, r11, r12, r13)
            r3 = 17
            a5.y r2 = r2.b(r3, r9)
            r2.b()
            d5.p0 r2 = r15.P0
            o5.z r2 = r2.f7058b
            java.lang.Object r2 = r2.f1689a
            o5.z r3 = r1.f7058b
            java.lang.Object r3 = r3.f1689a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Laa
            d5.p0 r2 = r15.P0
            androidx.media3.common.a1 r2 = r2.f7057a
            boolean r2 = r2.p()
            if (r2 != 0) goto Laa
            r5 = r6
            goto Lab
        Laa:
            r5 = r8
        Lab:
            long r7 = r15.x1(r1)
            r9 = -1
            r10 = 0
            r2 = 0
            r3 = 1
            r4 = 0
            r6 = 4
            r0 = r15
            r0.P1(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.z.K1(java.util.List, int, long, boolean):void");
    }

    public final void L1(Surface surface) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        u0[] u0VarArr = this.D;
        int length = u0VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            u0 u0Var = u0VarArr[i10];
            if (((b) u0Var).f6925a == 2) {
                s0 s0VarW1 = w1(u0Var);
                s0VarW1.e(1);
                s0VarW1.d(surface);
                s0VarW1.c();
                arrayList.add(s0VarW1);
            }
            i10++;
        }
        Object obj = this.f7131s0;
        if (obj == null || obj == surface) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((s0) it.next()).a(this.f7112b0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj2 = this.f7131s0;
            Surface surface2 = this.f7132t0;
            if (obj2 == surface2) {
                surface2.release();
                this.f7132t0 = null;
            }
        }
        this.f7131s0 = surface;
        if (z10) {
            M1(false, new f(2, new bf.n(3), 1003));
        }
    }

    public final void M1(boolean z10, f fVar) {
        p0 p0VarA;
        if (z10) {
            p0VarA = G1(0, this.L.size()).d(null);
        } else {
            p0 p0Var = this.P0;
            p0VarA = p0Var.a(p0Var.f7058b);
            p0VarA.f7070p = p0VarA.f7072r;
            p0VarA.f7071q = 0L;
        }
        p0 p0VarF = p0VarA.f(1);
        if (fVar != null) {
            p0VarF = p0VarF.d(fVar);
        }
        p0 p0Var2 = p0VarF;
        this.f7115e0++;
        a5.z zVar = this.H.D;
        zVar.getClass();
        a5.y yVarC = a5.z.c();
        yVarC.f171a = zVar.f173a.obtainMessage(6);
        yVarC.b();
        P1(p0Var2, 0, 1, false, p0Var2.f7057a.p() && !this.P0.f7057a.p(), 4, x1(p0Var2), -1, false);
    }

    public final void N1() {
        androidx.media3.common.o0 o0Var = this.f7124m0;
        int i10 = a5.d0.f105a;
        z zVar = this.B;
        boolean zIsPlayingAd = zVar.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = zVar.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = zVar.hasPreviousMediaItem();
        boolean zHasNextMediaItem = zVar.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = zVar.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = zVar.isCurrentMediaItemDynamic();
        boolean zP = zVar.getCurrentTimeline().p();
        int i11 = 3;
        a2.g gVar = new a2.g(3);
        androidx.media3.common.o oVar = (androidx.media3.common.o) gVar.f31a;
        androidx.media3.common.p pVar = this.f7129r.f1731a;
        oVar.getClass();
        for (int i12 = 0; i12 < pVar.f1732a.size(); i12++) {
            oVar.a(pVar.a(i12));
        }
        boolean z10 = !zIsPlayingAd;
        gVar.b(4, z10);
        gVar.b(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        gVar.b(6, zHasPreviousMediaItem && !zIsPlayingAd);
        gVar.b(7, !zP && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd);
        gVar.b(8, zHasNextMediaItem && !zIsPlayingAd);
        gVar.b(9, !zP && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd);
        gVar.b(10, z10);
        gVar.b(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        gVar.b(12, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        androidx.media3.common.o0 o0Var2 = new androidx.media3.common.o0(oVar.b());
        this.f7124m0 = o0Var2;
        if (o0Var2.equals(o0Var)) {
            return;
        }
        this.I.c(13, new s(this, i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void O1(int i10, boolean z10, int i11) {
        int i12 = 0;
        ?? r42 = (!z10 || i10 == -1) ? 0 : 1;
        if (r42 != 0 && i10 != 1) {
            i12 = 1;
        }
        p0 p0Var = this.P0;
        if (p0Var.f7066l == r42 && p0Var.f7067m == i12) {
            return;
        }
        this.f7115e0++;
        p0 p0VarC = p0Var.c(i12, r42);
        this.H.D.a(1, r42, i12).b();
        P1(p0VarC, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
    }

    public final void P1(final p0 p0Var, final int i10, final int i11, boolean z10, boolean z11, int i12, long j, int i13, boolean z12) {
        Pair pair;
        int i14;
        androidx.media3.common.e0 e0Var;
        boolean z13;
        boolean z14;
        boolean z15;
        int i15;
        Object obj;
        androidx.media3.common.e0 e0Var2;
        Object obj2;
        int i16;
        long j7;
        long j10;
        long jA1;
        long jA12;
        Object obj3;
        androidx.media3.common.e0 e0Var3;
        Object obj4;
        int i17;
        p0 p0Var2 = this.P0;
        this.P0 = p0Var;
        boolean zEquals = p0Var2.f7057a.equals(p0Var.f7057a);
        androidx.media3.common.z0 z0Var = (androidx.media3.common.z0) this.f1504d;
        androidx.media3.common.y0 y0Var = this.K;
        androidx.media3.common.a1 a1Var = p0Var2.f7057a;
        o5.z zVar = p0Var2.f7058b;
        androidx.media3.common.a1 a1Var2 = p0Var.f7057a;
        o5.z zVar2 = p0Var.f7058b;
        if (a1Var2.p() && a1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (a1Var2.p() != a1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (a1Var.m(a1Var.g(zVar.f1689a, y0Var).f1829g, z0Var, 0L).f1842a.equals(a1Var2.m(a1Var2.g(zVar2.f1689a, y0Var).f1829g, z0Var, 0L).f1842a)) {
            pair = (z11 && i12 == 0 && zVar.f1692d < zVar2.f1692d) ? new Pair(Boolean.TRUE, 0) : (z11 && i12 == 1 && z12) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z11 && i12 == 0) {
                i14 = 1;
            } else if (z11 && i12 == 1) {
                i14 = 2;
            } else {
                if (zEquals) {
                    throw new IllegalStateException();
                }
                i14 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i14));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        androidx.media3.common.g0 g0VarU1 = this.f7125n0;
        if (zBooleanValue) {
            e0Var = !p0Var.f7057a.p() ? p0Var.f7057a.m(p0Var.f7057a.g(p0Var.f7058b.f1689a, this.K).f1829g, (androidx.media3.common.z0) this.f1504d, 0L).f1844g : null;
            this.O0 = androidx.media3.common.g0.f1655e0;
        } else {
            e0Var = null;
        }
        if (zBooleanValue || !p0Var2.j.equals(p0Var.j)) {
            androidx.media3.common.f0 f0VarA = this.O0.a();
            List list = p0Var.j;
            for (int i18 = 0; i18 < list.size(); i18++) {
                Metadata metadata = (Metadata) list.get(i18);
                int i19 = 0;
                while (true) {
                    Metadata.Entry[] entryArr = metadata.f1549a;
                    if (i19 < entryArr.length) {
                        entryArr[i19].k(f0VarA);
                        i19++;
                    }
                }
            }
            this.O0 = new androidx.media3.common.g0(f0VarA);
            g0VarU1 = u1();
        }
        boolean zEquals2 = g0VarU1.equals(this.f7125n0);
        this.f7125n0 = g0VarU1;
        boolean z16 = p0Var2.f7066l != p0Var.f7066l;
        boolean z17 = p0Var2.f7061e != p0Var.f7061e;
        if (z17 || z16) {
            Q1();
        }
        boolean z18 = p0Var2.f7063g != p0Var.f7063g;
        if (!zEquals) {
            final int i20 = 0;
            this.I.c(0, new a5.j() { // from class: d5.o
                @Override // a5.j
                public final void a(Object obj5) {
                    androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) obj5;
                    switch (i20) {
                        case 0:
                            q0Var.onTimelineChanged(p0Var.f7057a, i10);
                            break;
                        default:
                            q0Var.onPlayWhenReadyChanged(p0Var.f7066l, i10);
                            break;
                    }
                }
            });
        }
        if (z11) {
            androidx.media3.common.y0 y0Var2 = new androidx.media3.common.y0();
            if (p0Var2.f7057a.p()) {
                z13 = zBooleanValue;
                z14 = z16;
                z15 = zEquals2;
                i15 = i13;
                obj = null;
                e0Var2 = null;
                obj2 = null;
                i16 = -1;
            } else {
                Object obj5 = p0Var2.f7058b.f1689a;
                p0Var2.f7057a.g(obj5, y0Var2);
                int i21 = y0Var2.f1829g;
                int iB = p0Var2.f7057a.b(obj5);
                z13 = zBooleanValue;
                z14 = z16;
                z15 = zEquals2;
                obj = p0Var2.f7057a.m(i21, (androidx.media3.common.z0) this.f1504d, 0L).f1842a;
                e0Var2 = ((androidx.media3.common.z0) this.f1504d).f1844g;
                obj2 = obj5;
                i15 = i21;
                i16 = iB;
            }
            if (i12 == 0) {
                if (p0Var2.f7058b.a()) {
                    o5.z zVar3 = p0Var2.f7058b;
                    jA1 = y0Var2.a(zVar3.f1690b, zVar3.f1691c);
                    jA12 = A1(p0Var2);
                } else if (p0Var2.f7058b.f1693e != -1) {
                    jA1 = A1(this.P0);
                    jA12 = jA1;
                } else {
                    j7 = y0Var2.f1831x;
                    j10 = y0Var2.f1830r;
                    jA1 = j7 + j10;
                    jA12 = jA1;
                }
            } else if (p0Var2.f7058b.a()) {
                jA1 = p0Var2.f7072r;
                jA12 = A1(p0Var2);
            } else {
                j7 = y0Var2.f1831x;
                j10 = p0Var2.f7072r;
                jA1 = j7 + j10;
                jA12 = jA1;
            }
            long jP = a5.d0.P(jA1);
            long jP2 = a5.d0.P(jA12);
            o5.z zVar4 = p0Var2.f7058b;
            androidx.media3.common.r0 r0Var = new androidx.media3.common.r0(obj, i15, e0Var2, obj2, i16, jP, jP2, zVar4.f1690b, zVar4.f1691c);
            androidx.media3.common.z0 z0Var2 = (androidx.media3.common.z0) this.f1504d;
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            if (this.P0.f7057a.p()) {
                obj3 = null;
                e0Var3 = null;
                obj4 = null;
                i17 = -1;
            } else {
                p0 p0Var3 = this.P0;
                Object obj6 = p0Var3.f7058b.f1689a;
                p0Var3.f7057a.g(obj6, this.K);
                int iB2 = this.P0.f7057a.b(obj6);
                Object obj7 = this.P0.f7057a.m(currentMediaItemIndex, z0Var2, 0L).f1842a;
                e0Var3 = z0Var2.f1844g;
                i17 = iB2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jP3 = a5.d0.P(j);
            long jP4 = this.P0.f7058b.a() ? a5.d0.P(A1(this.P0)) : jP3;
            o5.z zVar5 = this.P0.f7058b;
            this.I.c(11, new com.google.android.exoplayer2.w(i12, r0Var, new androidx.media3.common.r0(obj3, currentMediaItemIndex, e0Var3, obj4, i17, jP3, jP4, zVar5.f1690b, zVar5.f1691c), 1));
        } else {
            z13 = zBooleanValue;
            z14 = z16;
            z15 = zEquals2;
        }
        if (z13) {
            this.I.c(1, new com.google.android.exoplayer2.r(iIntValue, 1, e0Var));
        }
        if (p0Var2.f7062f != p0Var.f7062f) {
            final int i22 = 7;
            this.I.c(10, new a5.j() { // from class: d5.p
                @Override // a5.j
                public final void a(Object obj8) {
                    androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) obj8;
                    switch (i22) {
                        case 0:
                            q0Var.onTracksChanged(p0Var.f7065i.f1880d);
                            break;
                        case 1:
                            p0 p0Var4 = p0Var;
                            q0Var.onLoadingChanged(p0Var4.f7063g);
                            q0Var.onIsLoadingChanged(p0Var4.f7063g);
                            break;
                        case 2:
                            p0 p0Var5 = p0Var;
                            q0Var.onPlayerStateChanged(p0Var5.f7066l, p0Var5.f7061e);
                            break;
                        case 3:
                            q0Var.onPlaybackStateChanged(p0Var.f7061e);
                            break;
                        case 4:
                            q0Var.onPlaybackSuppressionReasonChanged(p0Var.f7067m);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            q0Var.onIsPlayingChanged(z.C1(p0Var));
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            q0Var.onPlaybackParametersChanged(p0Var.f7068n);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            q0Var.onPlayerErrorChanged(p0Var.f7062f);
                            break;
                        default:
                            q0Var.onPlayerError(p0Var.f7062f);
                            break;
                    }
                }
            });
            if (p0Var.f7062f != null) {
                final int i23 = 8;
                this.I.c(10, new a5.j() { // from class: d5.p
                    @Override // a5.j
                    public final void a(Object obj8) {
                        androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) obj8;
                        switch (i23) {
                            case 0:
                                q0Var.onTracksChanged(p0Var.f7065i.f1880d);
                                break;
                            case 1:
                                p0 p0Var4 = p0Var;
                                q0Var.onLoadingChanged(p0Var4.f7063g);
                                q0Var.onIsLoadingChanged(p0Var4.f7063g);
                                break;
                            case 2:
                                p0 p0Var5 = p0Var;
                                q0Var.onPlayerStateChanged(p0Var5.f7066l, p0Var5.f7061e);
                                break;
                            case 3:
                                q0Var.onPlaybackStateChanged(p0Var.f7061e);
                                break;
                            case 4:
                                q0Var.onPlaybackSuppressionReasonChanged(p0Var.f7067m);
                                break;
                            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                                q0Var.onIsPlayingChanged(z.C1(p0Var));
                                break;
                            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                q0Var.onPlaybackParametersChanged(p0Var.f7068n);
                                break;
                            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                                q0Var.onPlayerErrorChanged(p0Var.f7062f);
                                break;
                            default:
                                q0Var.onPlayerError(p0Var.f7062f);
                                break;
                        }
                    }
                });
            }
        }
        androidx.media3.exoplayer.trackselection.c0 c0Var = p0Var2.f7065i;
        androidx.media3.exoplayer.trackselection.c0 c0Var2 = p0Var.f7065i;
        if (c0Var != c0Var2) {
            this.E.onSelectionActivated(c0Var2.f1881e);
            final int i24 = 0;
            this.I.c(2, new a5.j() { // from class: d5.p
                @Override // a5.j
                public final void a(Object obj8) {
                    androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) obj8;
                    switch (i24) {
                        case 0:
                            q0Var.onTracksChanged(p0Var.f7065i.f1880d);
                            break;
                        case 1:
                            p0 p0Var4 = p0Var;
                            q0Var.onLoadingChanged(p0Var4.f7063g);
                            q0Var.onIsLoadingChanged(p0Var4.f7063g);
                            break;
                        case 2:
                            p0 p0Var5 = p0Var;
                            q0Var.onPlayerStateChanged(p0Var5.f7066l, p0Var5.f7061e);
                            break;
                        case 3:
                            q0Var.onPlaybackStateChanged(p0Var.f7061e);
                            break;
                        case 4:
                            q0Var.onPlaybackSuppressionReasonChanged(p0Var.f7067m);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            q0Var.onIsPlayingChanged(z.C1(p0Var));
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            q0Var.onPlaybackParametersChanged(p0Var.f7068n);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            q0Var.onPlayerErrorChanged(p0Var.f7062f);
                            break;
                        default:
                            q0Var.onPlayerError(p0Var.f7062f);
                            break;
                    }
                }
            });
        }
        if (!z15) {
            this.I.c(14, new bf.a(3, this.f7125n0));
        }
        if (z18) {
            final int i25 = 1;
            this.I.c(3, new a5.j() { // from class: d5.p
                @Override // a5.j
                public final void a(Object obj8) {
                    androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) obj8;
                    switch (i25) {
                        case 0:
                            q0Var.onTracksChanged(p0Var.f7065i.f1880d);
                            break;
                        case 1:
                            p0 p0Var4 = p0Var;
                            q0Var.onLoadingChanged(p0Var4.f7063g);
                            q0Var.onIsLoadingChanged(p0Var4.f7063g);
                            break;
                        case 2:
                            p0 p0Var5 = p0Var;
                            q0Var.onPlayerStateChanged(p0Var5.f7066l, p0Var5.f7061e);
                            break;
                        case 3:
                            q0Var.onPlaybackStateChanged(p0Var.f7061e);
                            break;
                        case 4:
                            q0Var.onPlaybackSuppressionReasonChanged(p0Var.f7067m);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            q0Var.onIsPlayingChanged(z.C1(p0Var));
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            q0Var.onPlaybackParametersChanged(p0Var.f7068n);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            q0Var.onPlayerErrorChanged(p0Var.f7062f);
                            break;
                        default:
                            q0Var.onPlayerError(p0Var.f7062f);
                            break;
                    }
                }
            });
        }
        if (z17 || z14) {
            final int i26 = 2;
            this.I.c(-1, new a5.j() { // from class: d5.p
                @Override // a5.j
                public final void a(Object obj8) {
                    androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) obj8;
                    switch (i26) {
                        case 0:
                            q0Var.onTracksChanged(p0Var.f7065i.f1880d);
                            break;
                        case 1:
                            p0 p0Var4 = p0Var;
                            q0Var.onLoadingChanged(p0Var4.f7063g);
                            q0Var.onIsLoadingChanged(p0Var4.f7063g);
                            break;
                        case 2:
                            p0 p0Var5 = p0Var;
                            q0Var.onPlayerStateChanged(p0Var5.f7066l, p0Var5.f7061e);
                            break;
                        case 3:
                            q0Var.onPlaybackStateChanged(p0Var.f7061e);
                            break;
                        case 4:
                            q0Var.onPlaybackSuppressionReasonChanged(p0Var.f7067m);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            q0Var.onIsPlayingChanged(z.C1(p0Var));
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            q0Var.onPlaybackParametersChanged(p0Var.f7068n);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            q0Var.onPlayerErrorChanged(p0Var.f7062f);
                            break;
                        default:
                            q0Var.onPlayerError(p0Var.f7062f);
                            break;
                    }
                }
            });
        }
        if (z17) {
            final int i27 = 3;
            this.I.c(4, new a5.j() { // from class: d5.p
                @Override // a5.j
                public final void a(Object obj8) {
                    androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) obj8;
                    switch (i27) {
                        case 0:
                            q0Var.onTracksChanged(p0Var.f7065i.f1880d);
                            break;
                        case 1:
                            p0 p0Var4 = p0Var;
                            q0Var.onLoadingChanged(p0Var4.f7063g);
                            q0Var.onIsLoadingChanged(p0Var4.f7063g);
                            break;
                        case 2:
                            p0 p0Var5 = p0Var;
                            q0Var.onPlayerStateChanged(p0Var5.f7066l, p0Var5.f7061e);
                            break;
                        case 3:
                            q0Var.onPlaybackStateChanged(p0Var.f7061e);
                            break;
                        case 4:
                            q0Var.onPlaybackSuppressionReasonChanged(p0Var.f7067m);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            q0Var.onIsPlayingChanged(z.C1(p0Var));
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            q0Var.onPlaybackParametersChanged(p0Var.f7068n);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            q0Var.onPlayerErrorChanged(p0Var.f7062f);
                            break;
                        default:
                            q0Var.onPlayerError(p0Var.f7062f);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i28 = 1;
            this.I.c(5, new a5.j() { // from class: d5.o
                @Override // a5.j
                public final void a(Object obj52) {
                    androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) obj52;
                    switch (i28) {
                        case 0:
                            q0Var.onTimelineChanged(p0Var.f7057a, i11);
                            break;
                        default:
                            q0Var.onPlayWhenReadyChanged(p0Var.f7066l, i11);
                            break;
                    }
                }
            });
        }
        if (p0Var2.f7067m != p0Var.f7067m) {
            final int i29 = 4;
            this.I.c(6, new a5.j() { // from class: d5.p
                @Override // a5.j
                public final void a(Object obj8) {
                    androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) obj8;
                    switch (i29) {
                        case 0:
                            q0Var.onTracksChanged(p0Var.f7065i.f1880d);
                            break;
                        case 1:
                            p0 p0Var4 = p0Var;
                            q0Var.onLoadingChanged(p0Var4.f7063g);
                            q0Var.onIsLoadingChanged(p0Var4.f7063g);
                            break;
                        case 2:
                            p0 p0Var5 = p0Var;
                            q0Var.onPlayerStateChanged(p0Var5.f7066l, p0Var5.f7061e);
                            break;
                        case 3:
                            q0Var.onPlaybackStateChanged(p0Var.f7061e);
                            break;
                        case 4:
                            q0Var.onPlaybackSuppressionReasonChanged(p0Var.f7067m);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            q0Var.onIsPlayingChanged(z.C1(p0Var));
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            q0Var.onPlaybackParametersChanged(p0Var.f7068n);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            q0Var.onPlayerErrorChanged(p0Var.f7062f);
                            break;
                        default:
                            q0Var.onPlayerError(p0Var.f7062f);
                            break;
                    }
                }
            });
        }
        if (C1(p0Var2) != C1(p0Var)) {
            final int i30 = 5;
            this.I.c(7, new a5.j() { // from class: d5.p
                @Override // a5.j
                public final void a(Object obj8) {
                    androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) obj8;
                    switch (i30) {
                        case 0:
                            q0Var.onTracksChanged(p0Var.f7065i.f1880d);
                            break;
                        case 1:
                            p0 p0Var4 = p0Var;
                            q0Var.onLoadingChanged(p0Var4.f7063g);
                            q0Var.onIsLoadingChanged(p0Var4.f7063g);
                            break;
                        case 2:
                            p0 p0Var5 = p0Var;
                            q0Var.onPlayerStateChanged(p0Var5.f7066l, p0Var5.f7061e);
                            break;
                        case 3:
                            q0Var.onPlaybackStateChanged(p0Var.f7061e);
                            break;
                        case 4:
                            q0Var.onPlaybackSuppressionReasonChanged(p0Var.f7067m);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            q0Var.onIsPlayingChanged(z.C1(p0Var));
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            q0Var.onPlaybackParametersChanged(p0Var.f7068n);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            q0Var.onPlayerErrorChanged(p0Var.f7062f);
                            break;
                        default:
                            q0Var.onPlayerError(p0Var.f7062f);
                            break;
                    }
                }
            });
        }
        if (!p0Var2.f7068n.equals(p0Var.f7068n)) {
            final int i31 = 6;
            this.I.c(12, new a5.j() { // from class: d5.p
                @Override // a5.j
                public final void a(Object obj8) {
                    androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) obj8;
                    switch (i31) {
                        case 0:
                            q0Var.onTracksChanged(p0Var.f7065i.f1880d);
                            break;
                        case 1:
                            p0 p0Var4 = p0Var;
                            q0Var.onLoadingChanged(p0Var4.f7063g);
                            q0Var.onIsLoadingChanged(p0Var4.f7063g);
                            break;
                        case 2:
                            p0 p0Var5 = p0Var;
                            q0Var.onPlayerStateChanged(p0Var5.f7066l, p0Var5.f7061e);
                            break;
                        case 3:
                            q0Var.onPlaybackStateChanged(p0Var.f7061e);
                            break;
                        case 4:
                            q0Var.onPlaybackSuppressionReasonChanged(p0Var.f7067m);
                            break;
                        case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            q0Var.onIsPlayingChanged(z.C1(p0Var));
                            break;
                        case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            q0Var.onPlaybackParametersChanged(p0Var.f7068n);
                            break;
                        case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            q0Var.onPlayerErrorChanged(p0Var.f7062f);
                            break;
                        default:
                            q0Var.onPlayerError(p0Var.f7062f);
                            break;
                    }
                }
            });
        }
        if (z10) {
            this.I.c(-1, new ab.c(29));
        }
        N1();
        this.I.b();
        if (p0Var2.f7069o != p0Var.f7069o) {
            Iterator it = this.J.iterator();
            while (it.hasNext()) {
                ((w) ((h) it.next())).f7095a.Q1();
            }
        }
    }

    public final void Q1() {
        int playbackState = getPlaybackState();
        z0 z0Var = this.f7111a0;
        z0 z0Var2 = this.Z;
        boolean z10 = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean zExperimentalIsSleepingForOffload = experimentalIsSleepingForOffload();
                if (getPlayWhenReady() && !zExperimentalIsSleepingForOffload) {
                    z10 = true;
                }
                z0Var2.f7143c = z10;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) z0Var2.f7145e;
                if (wakeLock != null) {
                    if (z0Var2.f7142b && z10) {
                        wakeLock.acquire();
                    } else {
                        wakeLock.release();
                    }
                }
                boolean playWhenReady = getPlayWhenReady();
                z0Var.f7143c = playWhenReady;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) z0Var.f7145e;
                if (wifiLock == null) {
                    return;
                }
                if (z0Var.f7142b && playWhenReady) {
                    wifiLock.acquire();
                    return;
                } else {
                    wifiLock.release();
                    return;
                }
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        z0Var2.f7143c = false;
        PowerManager.WakeLock wakeLock2 = (PowerManager.WakeLock) z0Var2.f7145e;
        if (wakeLock2 != null) {
            wakeLock2.release();
        }
        z0Var.f7143c = false;
        WifiManager.WifiLock wifiLock2 = (WifiManager.WifiLock) z0Var.f7145e;
        if (wifiLock2 == null) {
            return;
        }
        wifiLock2.release();
    }

    public final void R1() {
        a5.d dVar = this.f7136x;
        synchronized (dVar) {
            boolean z10 = false;
            while (!dVar.f104d) {
                try {
                    dVar.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.P.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.P.getThread().getName();
            int i10 = a5.d0.f105a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.J0) {
                throw new IllegalStateException(str);
            }
            a5.a.C("ExoPlayerImpl", str, this.K0 ? null : new IllegalStateException());
            this.K0 = true;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addAnalyticsListener(e5.c cVar) {
        cVar.getClass();
        this.O.addListener(cVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addAudioOffloadListener(h hVar) {
        this.J.add(hVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addListener(androidx.media3.common.q0 q0Var) {
        q0Var.getClass();
        this.I.a(q0Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addMediaItems(int i10, List list) {
        R1();
        addMediaSources(i10, v1(list));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addMediaSource(o5.b0 b0Var) {
        R1();
        addMediaSources(Collections.singletonList(b0Var));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addMediaSources(List list) {
        R1();
        addMediaSources(this.L.size(), list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void clearAuxEffectInfo() {
        R1();
        setAuxEffectInfo(new androidx.media3.common.g());
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void clearCameraMotionListener(t5.a aVar) {
        R1();
        if (this.I0 != aVar) {
            return;
        }
        s0 s0VarW1 = w1(this.V);
        s0VarW1.e(8);
        s0VarW1.d(null);
        s0VarW1.c();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void clearVideoFrameMetadataListener(s5.d dVar) {
        R1();
        if (this.H0 != dVar) {
            return;
        }
        s0 s0VarW1 = w1(this.V);
        s0VarW1.e(7);
        s0VarW1.d(null);
        s0VarW1.c();
    }

    @Override // com.google.android.exoplayer2.g1
    public final void clearVideoSurface() {
        R1();
        I1();
        L1(null);
        F1(0, 0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        R1();
        if (surfaceHolder == null || surfaceHolder != this.f7133u0) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.g1
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        R1();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.google.android.exoplayer2.g1
    public final void clearVideoTextureView(TextureView textureView) {
        R1();
        if (textureView == null || textureView != this.f7135w0) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final s0 createMessage(r0 r0Var) {
        R1();
        return w1(r0Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void decreaseDeviceVolume() {
        R1();
        s1 s1Var = this.Y;
        int i10 = s1Var.f4449f;
        AudioManager audioManager = s1Var.f4447d;
        if (i10 <= (a5.d0.f105a >= 28 ? audioManager.getStreamMinVolume(s1Var.f4448e) : 0)) {
            return;
        }
        audioManager.adjustStreamVolume(s1Var.f4448e, -1, 1);
        s1Var.d();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean experimentalIsSleepingForOffload() {
        R1();
        return this.P0.f7069o;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void experimentalSetOffloadSchedulingEnabled(boolean z10) {
        R1();
        this.H.D.a(24, z10 ? 1 : 0, 0).b();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            ((h) it.next()).getClass();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final AnalyticsCollector getAnalyticsCollector() {
        R1();
        return this.O;
    }

    @Override // com.google.android.exoplayer2.g1
    public final Looper getApplicationLooper() {
        return this.P;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final androidx.media3.common.f getAudioAttributes() {
        R1();
        return this.D0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final g getAudioComponent() {
        R1();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final c getAudioDecoderCounters() {
        R1();
        return this.B0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final androidx.media3.common.r getAudioFormat() {
        R1();
        return this.f7128q0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getAudioSessionId() {
        R1();
        return this.C0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final androidx.media3.common.o0 getAvailableCommands() {
        R1();
        return this.f7124m0;
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getBufferedPosition() {
        R1();
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        p0 p0Var = this.P0;
        return p0Var.k.equals(p0Var.f7058b) ? a5.d0.P(this.P0.f7070p) : getDuration();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final a5.b getClock() {
        return this.T;
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getContentBufferedPosition() {
        R1();
        if (this.P0.f7057a.p()) {
            return this.R0;
        }
        p0 p0Var = this.P0;
        if (p0Var.k.f1692d != p0Var.f7058b.f1692d) {
            return a5.d0.P(p0Var.f7057a.m(getCurrentMediaItemIndex(), (androidx.media3.common.z0) this.f1504d, 0L).J);
        }
        long j = p0Var.f7070p;
        if (this.P0.k.a()) {
            p0 p0Var2 = this.P0;
            androidx.media3.common.y0 y0VarG = p0Var2.f7057a.g(p0Var2.k.f1689a, this.K);
            long jD = y0VarG.d(this.P0.k.f1690b);
            j = jD == Long.MIN_VALUE ? y0VarG.f1830r : jD;
        }
        p0 p0Var3 = this.P0;
        androidx.media3.common.a1 a1Var = p0Var3.f7057a;
        Object obj = p0Var3.k.f1689a;
        androidx.media3.common.y0 y0Var = this.K;
        a1Var.g(obj, y0Var);
        return a5.d0.P(j + y0Var.f1831x);
    }

    @Override // androidx.media3.common.s0
    public final long getContentPosition() {
        R1();
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        p0 p0Var = this.P0;
        androidx.media3.common.a1 a1Var = p0Var.f7057a;
        Object obj = p0Var.f7058b.f1689a;
        androidx.media3.common.y0 y0Var = this.K;
        a1Var.g(obj, y0Var);
        p0 p0Var2 = this.P0;
        if (p0Var2.f7059c == -9223372036854775807L) {
            return a5.d0.P(p0Var2.f7057a.m(getCurrentMediaItemIndex(), (androidx.media3.common.z0) this.f1504d, 0L).I);
        }
        return a5.d0.P(this.P0.f7059c) + a5.d0.P(y0Var.f1831x);
    }

    @Override // androidx.media3.common.s0
    public final int getCurrentAdGroupIndex() {
        R1();
        if (isPlayingAd()) {
            return this.P0.f7058b.f1690b;
        }
        return -1;
    }

    @Override // androidx.media3.common.s0
    public final int getCurrentAdIndexInAdGroup() {
        R1();
        if (isPlayingAd()) {
            return this.P0.f7058b.f1691c;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final z4.c getCurrentCues() {
        R1();
        return this.G0;
    }

    @Override // androidx.media3.common.s0
    public final int getCurrentMediaItemIndex() {
        R1();
        int iY1 = y1();
        if (iY1 == -1) {
            return 0;
        }
        return iY1;
    }

    @Override // androidx.media3.common.s0
    public final int getCurrentPeriodIndex() {
        R1();
        if (this.P0.f7057a.p()) {
            return 0;
        }
        p0 p0Var = this.P0;
        return p0Var.f7057a.b(p0Var.f7058b.f1689a);
    }

    @Override // androidx.media3.common.s0
    public final long getCurrentPosition() {
        R1();
        return a5.d0.P(x1(this.P0));
    }

    @Override // androidx.media3.common.s0
    public final androidx.media3.common.a1 getCurrentTimeline() {
        R1();
        return this.P0.f7057a;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final o5.h1 getCurrentTrackGroups() {
        R1();
        return this.P0.f7064h;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final androidx.media3.exoplayer.trackselection.z getCurrentTrackSelections() {
        R1();
        return new androidx.media3.exoplayer.trackselection.z(this.P0.f7065i.f1879c);
    }

    @Override // androidx.media3.common.s0
    public final g1 getCurrentTracks() {
        R1();
        return this.P0.f7065i.f1880d;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final l getDeviceComponent() {
        R1();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final androidx.media3.common.m getDeviceInfo() {
        R1();
        return this.M0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getDeviceVolume() {
        R1();
        return this.Y.f4449f;
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getDuration() {
        R1();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        p0 p0Var = this.P0;
        o5.z zVar = p0Var.f7058b;
        androidx.media3.common.a1 a1Var = p0Var.f7057a;
        Object obj = zVar.f1689a;
        androidx.media3.common.y0 y0Var = this.K;
        a1Var.g(obj, y0Var);
        return a5.d0.P(y0Var.a(zVar.f1690b, zVar.f1691c));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final long getMaxSeekToPreviousPosition() {
        R1();
        return 3000L;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final androidx.media3.common.g0 getMediaMetadata() {
        R1();
        return this.f7125n0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean getPauseAtEndOfMediaItems() {
        R1();
        return this.f7123l0;
    }

    @Override // androidx.media3.common.s0
    public final boolean getPlayWhenReady() {
        R1();
        return this.P0.f7066l;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final Looper getPlaybackLooper() {
        return this.H.F;
    }

    @Override // androidx.media3.common.s0
    public final androidx.media3.common.n0 getPlaybackParameters() {
        R1();
        return this.P0.f7068n;
    }

    @Override // androidx.media3.common.s0
    public final int getPlaybackState() {
        R1();
        return this.P0.f7061e;
    }

    @Override // androidx.media3.common.s0
    public final int getPlaybackSuppressionReason() {
        R1();
        return this.P0.f7067m;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final androidx.media3.common.g0 getPlaylistMetadata() {
        R1();
        return this.f7126o0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final u0 getRenderer(int i10) {
        R1();
        return this.D[i10];
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getRendererCount() {
        R1();
        return this.D.length;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getRendererType(int i10) {
        R1();
        return ((b) this.D[i10]).f6925a;
    }

    @Override // com.google.android.exoplayer2.g1
    public final int getRepeatMode() {
        R1();
        return this.f7113c0;
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getSeekBackIncrement() {
        R1();
        return this.R;
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getSeekForwardIncrement() {
        R1();
        return this.S;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final x0 getSeekParameters() {
        R1();
        return this.f7121j0;
    }

    @Override // com.google.android.exoplayer2.g1
    public final boolean getShuffleModeEnabled() {
        R1();
        return this.f7114d0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean getSkipSilenceEnabled() {
        R1();
        return this.F0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final a5.w getSurfaceSize() {
        R1();
        return this.f7140z0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final m getTextComponent() {
        R1();
        return this;
    }

    @Override // androidx.media3.common.s0
    public final long getTotalBufferedDuration() {
        R1();
        return a5.d0.P(this.P0.f7071q);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final e1 getTrackSelectionParameters() {
        R1();
        return this.E.getParameters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final androidx.media3.exoplayer.trackselection.b0 getTrackSelector() {
        R1();
        return this.E;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getVideoChangeFrameRateStrategy() {
        R1();
        return this.f7139y0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final n getVideoComponent() {
        R1();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final c getVideoDecoderCounters() {
        R1();
        return this.A0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final androidx.media3.common.r getVideoFormat() {
        R1();
        return this.f7127p0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getVideoScalingMode() {
        R1();
        return this.f7137x0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final h1 getVideoSize() {
        R1();
        return this.N0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final float getVolume() {
        R1();
        return this.E0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void increaseDeviceVolume() {
        R1();
        s1 s1Var = this.Y;
        int i10 = s1Var.f4449f;
        AudioManager audioManager = s1Var.f4447d;
        if (i10 >= audioManager.getStreamMaxVolume(s1Var.f4448e)) {
            return;
        }
        audioManager.adjustStreamVolume(s1Var.f4448e, 1, 1);
        s1Var.d();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isDeviceMuted() {
        R1();
        return this.Y.f4450g;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isLoading() {
        R1();
        return this.P0.f7063g;
    }

    @Override // androidx.media3.common.s0
    public final boolean isPlayingAd() {
        R1();
        return this.P0.f7058b.a();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isTunnelingEnabled() {
        R1();
        for (w0 w0Var : this.P0.f7065i.f1878b) {
            if (w0Var != null && w0Var.f7097a) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void moveMediaItems(int i10, int i11, int i12) {
        R1();
        a5.a.e(i10 >= 0 && i10 <= i11 && i12 >= 0);
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        int iMin = Math.min(i11, size);
        int iMin2 = Math.min(i12, size - (iMin - i10));
        if (i10 >= size || i10 == iMin || i10 == iMin2) {
            return;
        }
        androidx.media3.common.a1 currentTimeline = getCurrentTimeline();
        this.f7115e0++;
        a5.d0.F(arrayList, i10, iMin, iMin2);
        t0 t0Var = new t0(arrayList, this.f7122k0);
        p0 p0VarD1 = D1(this.P0, t0Var, z1(currentTimeline, t0Var));
        b1 b1Var = this.f7122k0;
        e0 e0Var = this.H;
        e0Var.getClass();
        e0Var.D.b(19, new c0(i10, iMin, iMin2, b1Var)).b();
        P1(p0VarD1, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.lifecycle.o
    public final void o1(int i10, long j, boolean z10) {
        R1();
        a5.a.e(i10 >= 0);
        this.O.notifySeekStarted();
        androidx.media3.common.a1 a1Var = this.P0.f7057a;
        if (a1Var.p() || i10 < a1Var.o()) {
            this.f7115e0++;
            if (isPlayingAd()) {
                a5.a.B("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                com.google.android.exoplayer2.c0 c0Var = new com.google.android.exoplayer2.c0(1, this.P0);
                c0Var.a(1);
                z zVar = this.G.f7077d;
                zVar.F.d(new a5.o(zVar, 11, c0Var));
                return;
            }
            int i11 = getPlaybackState() != 1 ? 2 : 1;
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            p0 p0VarD1 = D1(this.P0.f(i11), a1Var, E1(a1Var, i10, j));
            this.H.D.b(3, new d0(a1Var, i10, a5.d0.G(j))).b();
            P1(p0VarD1, 0, 1, true, true, 1, x1(p0VarD1), currentMediaItemIndex, z10);
        }
    }

    @Override // com.google.android.exoplayer2.g1
    public final void prepare() {
        R1();
        boolean playWhenReady = getPlayWhenReady();
        int iD = this.X.d(2, playWhenReady);
        O1(iD, playWhenReady, (!playWhenReady || iD == 1) ? 1 : 2);
        p0 p0Var = this.P0;
        if (p0Var.f7061e != 1) {
            return;
        }
        p0 p0VarD = p0Var.d(null);
        p0 p0VarF = p0VarD.f(p0VarD.f7057a.p() ? 4 : 2);
        this.f7115e0++;
        a5.z zVar = this.H.D;
        zVar.getClass();
        a5.y yVarC = a5.z.c();
        yVarC.f171a = zVar.f173a.obtainMessage(0);
        yVarC.b();
        P1(p0VarF, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.g1
    public final void release() {
        boolean z10;
        AudioTrack audioTrack;
        Integer.toHexString(System.identityHashCode(this));
        int i10 = a5.d0.f105a;
        MediaLibraryInfo.registeredModules();
        a5.a.t();
        R1();
        if (a5.d0.f105a < 21 && (audioTrack = this.f7130r0) != null) {
            audioTrack.release();
            this.f7130r0 = null;
        }
        this.W.l(false);
        s1 s1Var = this.Y;
        a5.s sVar = (a5.s) s1Var.f4452i;
        if (sVar != null) {
            try {
                s1Var.f4445b.unregisterReceiver(sVar);
            } catch (RuntimeException e4) {
                a5.a.C("StreamVolumeManager", "Error unregistering stream volume receiver", e4);
            }
            s1Var.f4452i = null;
        }
        z0 z0Var = this.Z;
        z0Var.f7143c = false;
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) z0Var.f7145e;
        if (wakeLock != null) {
            wakeLock.release();
        }
        z0 z0Var2 = this.f7111a0;
        z0Var2.f7143c = false;
        WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) z0Var2.f7145e;
        if (wifiLock != null) {
            wifiLock.release();
        }
        a aVar = this.X;
        aVar.f6918c = null;
        aVar.a();
        e0 e0Var = this.H;
        synchronized (e0Var) {
            if (e0Var.U || !e0Var.F.getThread().isAlive()) {
                z10 = true;
            } else {
                e0Var.D.e(7);
                e0Var.g0(new com.google.android.exoplayer2.z(4, e0Var), e0Var.Q);
                z10 = e0Var.U;
            }
        }
        if (!z10) {
            this.I.f(10, new ab.c(28));
        }
        this.I.d();
        this.F.f173a.removeCallbacksAndMessages(null);
        this.Q.e(this.O);
        p0 p0VarF = this.P0.f(1);
        this.P0 = p0VarF;
        p0 p0VarA = p0VarF.a(p0VarF.f7058b);
        this.P0 = p0VarA;
        p0VarA.f7070p = p0VarA.f7072r;
        this.P0.f7071q = 0L;
        this.O.release();
        this.E.release();
        I1();
        Surface surface = this.f7132t0;
        if (surface != null) {
            surface.release();
            this.f7132t0 = null;
        }
        this.G0 = z4.c.f26652d;
        this.L0 = true;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void removeAnalyticsListener(e5.c cVar) {
        R1();
        cVar.getClass();
        this.O.removeListener(cVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void removeAudioOffloadListener(h hVar) {
        R1();
        this.J.remove(hVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void removeListener(androidx.media3.common.q0 q0Var) {
        R1();
        q0Var.getClass();
        this.I.e(q0Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void removeMediaItems(int i10, int i11) {
        R1();
        a5.a.e(i10 >= 0 && i11 >= i10);
        int size = this.L.size();
        int iMin = Math.min(i11, size);
        if (i10 >= size || i10 == iMin) {
            return;
        }
        p0 p0VarG1 = G1(i10, iMin);
        P1(p0VarG1, 0, 1, false, !p0VarG1.f7058b.f1689a.equals(this.P0.f7058b.f1689a), 4, x1(p0VarG1), -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void retry() {
        R1();
        prepare();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setAudioAttributes(androidx.media3.common.f fVar, boolean z10) {
        R1();
        if (this.L0) {
            return;
        }
        boolean zA = a5.d0.a(this.D0, fVar);
        int i10 = 1;
        a5.m mVar = this.I;
        if (!zA) {
            this.D0 = fVar;
            J1(1, 3, fVar);
            this.Y.c(a5.d0.y(fVar.f1621g));
            mVar.c(20, new bf.a(4, fVar));
        }
        androidx.media3.common.f fVar2 = z10 ? fVar : null;
        a aVar = this.X;
        aVar.b(fVar2);
        this.E.setAudioAttributes(fVar);
        boolean playWhenReady = getPlayWhenReady();
        int iD = aVar.d(getPlaybackState(), playWhenReady);
        if (playWhenReady && iD != 1) {
            i10 = 2;
        }
        O1(iD, playWhenReady, i10);
        mVar.b();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setAudioSessionId(int i10) {
        R1();
        if (this.C0 == i10) {
            return;
        }
        if (i10 == 0) {
            if (a5.d0.f105a < 21) {
                i10 = B1(0);
            } else {
                AudioManager audioManager = (AudioManager) this.f7138y.getSystemService("audio");
                i10 = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
        } else if (a5.d0.f105a < 21) {
            B1(i10);
        }
        this.C0 = i10;
        J1(1, 10, Integer.valueOf(i10));
        J1(2, 10, Integer.valueOf(i10));
        this.I.f(21, new com.google.android.exoplayer2.u(i10, 1));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setAuxEffectInfo(androidx.media3.common.g gVar) {
        R1();
        J1(1, 6, gVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setCameraMotionListener(t5.a aVar) {
        R1();
        this.I0 = aVar;
        s0 s0VarW1 = w1(this.V);
        s0VarW1.e(8);
        s0VarW1.d(aVar);
        s0VarW1.c();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setDeviceMuted(boolean z10) {
        R1();
        s1 s1Var = this.Y;
        AudioManager audioManager = s1Var.f4447d;
        if (a5.d0.f105a >= 23) {
            audioManager.adjustStreamVolume(s1Var.f4448e, z10 ? -100 : 100, 1);
        } else {
            audioManager.setStreamMute(s1Var.f4448e, z10);
        }
        s1Var.d();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setDeviceVolume(int i10) {
        R1();
        s1 s1Var = this.Y;
        s1Var.getClass();
        AudioManager audioManager = s1Var.f4447d;
        if (i10 < (a5.d0.f105a >= 28 ? audioManager.getStreamMinVolume(s1Var.f4448e) : 0) || i10 > audioManager.getStreamMaxVolume(s1Var.f4448e)) {
            return;
        }
        audioManager.setStreamVolume(s1Var.f4448e, i10, 1);
        s1Var.d();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setForegroundMode(boolean z10) {
        boolean z11;
        R1();
        if (this.f7120i0 != z10) {
            this.f7120i0 = z10;
            e0 e0Var = this.H;
            synchronized (e0Var) {
                z11 = true;
                if (!e0Var.U && e0Var.F.getThread().isAlive()) {
                    if (z10) {
                        e0Var.D.a(13, 1, 0).b();
                    } else {
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        a5.z zVar = e0Var.D;
                        zVar.getClass();
                        a5.y yVarC = a5.z.c();
                        yVarC.f171a = zVar.f173a.obtainMessage(13, 0, 0, atomicBoolean);
                        yVarC.b();
                        e0Var.g0(new com.google.android.exoplayer2.z(5, atomicBoolean), e0Var.f6979k0);
                        z11 = atomicBoolean.get();
                    }
                }
            }
            if (z11) {
                return;
            }
            M1(false, new f(2, new bf.n(2), 1003));
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setHandleAudioBecomingNoisy(boolean z10) {
        R1();
        if (this.L0) {
            return;
        }
        this.W.l(z10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setHandleWakeLock(boolean z10) {
        R1();
        setWakeMode(z10 ? 1 : 0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaItems(List list, boolean z10) {
        R1();
        setMediaSources(v1(list), z10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSource(o5.b0 b0Var) {
        R1();
        setMediaSources(Collections.singletonList(b0Var));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSources(List list) {
        R1();
        setMediaSources(list, true);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPauseAtEndOfMediaItems(boolean z10) {
        R1();
        if (this.f7123l0 == z10) {
            return;
        }
        this.f7123l0 = z10;
        this.H.D.a(23, z10 ? 1 : 0, 0).b();
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setPlayWhenReady(boolean z10) {
        R1();
        int iD = this.X.d(getPlaybackState(), z10);
        int i10 = 1;
        if (z10 && iD != 1) {
            i10 = 2;
        }
        O1(iD, z10, i10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPlaybackParameters(androidx.media3.common.n0 n0Var) {
        R1();
        if (n0Var == null) {
            n0Var = androidx.media3.common.n0.f1724r;
        }
        if (this.P0.f7068n.equals(n0Var)) {
            return;
        }
        p0 p0VarE = this.P0.e(n0Var);
        this.f7115e0++;
        this.H.D.b(4, n0Var).b();
        P1(p0VarE, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPlaylistMetadata(androidx.media3.common.g0 g0Var) {
        R1();
        g0Var.getClass();
        if (g0Var.equals(this.f7126o0)) {
            return;
        }
        this.f7126o0 = g0Var;
        this.I.f(15, new s(this, 0));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo) {
        R1();
        J1(1, 12, audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPriorityTaskManager(androidx.media3.common.t0 t0Var) {
        R1();
        int i10 = a5.d0.f105a;
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setRepeatMode(int i10) {
        R1();
        if (this.f7113c0 != i10) {
            this.f7113c0 = i10;
            this.H.D.a(11, i10, 0).b();
            com.google.android.exoplayer2.u uVar = new com.google.android.exoplayer2.u(i10, 2);
            a5.m mVar = this.I;
            mVar.c(8, uVar);
            N1();
            mVar.b();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setSeekParameters(x0 x0Var) {
        R1();
        if (x0Var == null) {
            x0Var = x0.f7100c;
        }
        if (this.f7121j0.equals(x0Var)) {
            return;
        }
        this.f7121j0 = x0Var;
        this.H.D.b(5, x0Var).b();
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setShuffleModeEnabled(boolean z10) {
        R1();
        if (this.f7114d0 != z10) {
            this.f7114d0 = z10;
            this.H.D.a(12, z10 ? 1 : 0, 0).b();
            com.google.android.exoplayer2.q qVar = new com.google.android.exoplayer2.q(2, z10);
            a5.m mVar = this.I;
            mVar.c(9, qVar);
            N1();
            mVar.b();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setShuffleOrder(b1 b1Var) {
        R1();
        this.f7122k0 = b1Var;
        t0 t0Var = new t0(this.L, this.f7122k0);
        p0 p0VarD1 = D1(this.P0, t0Var, E1(t0Var, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.f7115e0++;
        this.H.D.b(21, b1Var).b();
        P1(p0VarD1, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setSkipSilenceEnabled(boolean z10) {
        R1();
        if (this.F0 == z10) {
            return;
        }
        this.F0 = z10;
        J1(1, 9, Boolean.valueOf(z10));
        this.I.f(23, new com.google.android.exoplayer2.q(1, z10));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setTrackSelectionParameters(e1 e1Var) {
        R1();
        androidx.media3.exoplayer.trackselection.b0 b0Var = this.E;
        if (!b0Var.isSetParametersSupported() || e1Var.equals(b0Var.getParameters())) {
            return;
        }
        b0Var.setParameters(e1Var);
        this.I.f(19, new bf.a(5, e1Var));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setVideoChangeFrameRateStrategy(int i10) {
        R1();
        if (this.f7139y0 == i10) {
            return;
        }
        this.f7139y0 = i10;
        J1(2, 5, Integer.valueOf(i10));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setVideoFrameMetadataListener(s5.d dVar) {
        R1();
        this.H0 = dVar;
        s0 s0VarW1 = w1(this.V);
        s0VarW1.e(7);
        s0VarW1.d(dVar);
        s0VarW1.c();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setVideoScalingMode(int i10) {
        R1();
        this.f7137x0 = i10;
        J1(2, 4, Integer.valueOf(i10));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setVideoSurface(Surface surface) {
        R1();
        I1();
        L1(surface);
        int i10 = surface == null ? 0 : -1;
        F1(i10, i10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        R1();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        I1();
        this.f7134v0 = true;
        this.f7133u0 = surfaceHolder;
        surfaceHolder.addCallback(this.U);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            L1(null);
            F1(0, 0);
        } else {
            L1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            F1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        R1();
        setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setVideoTextureView(TextureView textureView) {
        R1();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        I1();
        this.f7135w0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            a5.a.B("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.U);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            L1(null);
            F1(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            L1(surface);
            this.f7132t0 = surface;
            F1(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setVolume(float f10) {
        R1();
        final float fG = a5.d0.g(f10, 0.0f, 1.0f);
        if (this.E0 == fG) {
            return;
        }
        this.E0 = fG;
        J1(1, 2, Float.valueOf(this.X.f6922g * fG));
        this.I.f(22, new a5.j() { // from class: d5.q
            @Override // a5.j
            public final void a(Object obj) {
                ((androidx.media3.common.q0) obj).onVolumeChanged(fG);
            }
        });
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setWakeMode(int i10) {
        R1();
        z0 z0Var = this.f7111a0;
        z0 z0Var2 = this.Z;
        if (i10 == 0) {
            z0Var2.d(false);
            z0Var.d(false);
        } else if (i10 == 1) {
            z0Var2.d(true);
            z0Var.d(false);
        } else {
            if (i10 != 2) {
                return;
            }
            z0Var2.d(true);
            z0Var.d(true);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void stop() {
        R1();
        stop(false);
    }

    public final ArrayList t1(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            n0 n0Var = new n0((o5.b0) list.get(i11), this.M);
            arrayList.add(n0Var);
            y yVar = new y(n0Var.f7037b, n0Var.f7036a.f19066h);
            this.L.add(i11 + i10, yVar);
        }
        this.f7122k0 = ((a1) this.f7122k0).a(i10, arrayList.size());
        return arrayList;
    }

    public final androidx.media3.common.g0 u1() {
        androidx.media3.common.a1 currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return this.O0;
        }
        androidx.media3.common.e0 e0Var = currentTimeline.m(getCurrentMediaItemIndex(), (androidx.media3.common.z0) this.f1504d, 0L).f1844g;
        androidx.media3.common.f0 f0VarA = this.O0.a();
        androidx.media3.common.g0 g0Var = e0Var.f1610r;
        if (g0Var != null) {
            CharSequence charSequence = g0Var.f1677a;
            if (charSequence != null) {
                f0VarA.f1625a = charSequence;
            }
            CharSequence charSequence2 = g0Var.f1681d;
            if (charSequence2 != null) {
                f0VarA.f1626b = charSequence2;
            }
            CharSequence charSequence3 = g0Var.f1683g;
            if (charSequence3 != null) {
                f0VarA.f1627c = charSequence3;
            }
            CharSequence charSequence4 = g0Var.f1684r;
            if (charSequence4 != null) {
                f0VarA.f1628d = charSequence4;
            }
            CharSequence charSequence5 = g0Var.f1685x;
            if (charSequence5 != null) {
                f0VarA.f1629e = charSequence5;
            }
            CharSequence charSequence6 = g0Var.f1686y;
            if (charSequence6 != null) {
                f0VarA.f1630f = charSequence6;
            }
            CharSequence charSequence7 = g0Var.B;
            if (charSequence7 != null) {
                f0VarA.f1631g = charSequence7;
            }
            androidx.media3.common.u0 u0Var = g0Var.D;
            if (u0Var != null) {
                f0VarA.f1632h = u0Var;
            }
            androidx.media3.common.u0 u0Var2 = g0Var.E;
            if (u0Var2 != null) {
                f0VarA.f1633i = u0Var2;
            }
            byte[] bArr = g0Var.F;
            if (bArr != null) {
                Integer num = g0Var.G;
                f0VarA.j = (byte[]) bArr.clone();
                f0VarA.k = num;
            }
            Uri uri = g0Var.H;
            if (uri != null) {
                f0VarA.f1634l = uri;
            }
            Integer num2 = g0Var.I;
            if (num2 != null) {
                f0VarA.f1635m = num2;
            }
            Integer num3 = g0Var.J;
            if (num3 != null) {
                f0VarA.f1636n = num3;
            }
            Integer num4 = g0Var.K;
            if (num4 != null) {
                f0VarA.f1637o = num4;
            }
            Boolean bool = g0Var.L;
            if (bool != null) {
                f0VarA.f1638p = bool;
            }
            Boolean bool2 = g0Var.M;
            if (bool2 != null) {
                f0VarA.f1639q = bool2;
            }
            Integer num5 = g0Var.N;
            if (num5 != null) {
                f0VarA.f1640r = num5;
            }
            Integer num6 = g0Var.O;
            if (num6 != null) {
                f0VarA.f1640r = num6;
            }
            Integer num7 = g0Var.P;
            if (num7 != null) {
                f0VarA.f1641s = num7;
            }
            Integer num8 = g0Var.Q;
            if (num8 != null) {
                f0VarA.f1642t = num8;
            }
            Integer num9 = g0Var.R;
            if (num9 != null) {
                f0VarA.f1643u = num9;
            }
            Integer num10 = g0Var.S;
            if (num10 != null) {
                f0VarA.f1644v = num10;
            }
            Integer num11 = g0Var.T;
            if (num11 != null) {
                f0VarA.f1645w = num11;
            }
            CharSequence charSequence8 = g0Var.U;
            if (charSequence8 != null) {
                f0VarA.f1646x = charSequence8;
            }
            CharSequence charSequence9 = g0Var.V;
            if (charSequence9 != null) {
                f0VarA.f1647y = charSequence9;
            }
            CharSequence charSequence10 = g0Var.W;
            if (charSequence10 != null) {
                f0VarA.f1648z = charSequence10;
            }
            Integer num12 = g0Var.X;
            if (num12 != null) {
                f0VarA.A = num12;
            }
            Integer num13 = g0Var.Y;
            if (num13 != null) {
                f0VarA.B = num13;
            }
            CharSequence charSequence11 = g0Var.Z;
            if (charSequence11 != null) {
                f0VarA.C = charSequence11;
            }
            CharSequence charSequence12 = g0Var.f1678a0;
            if (charSequence12 != null) {
                f0VarA.D = charSequence12;
            }
            CharSequence charSequence13 = g0Var.f1679b0;
            if (charSequence13 != null) {
                f0VarA.E = charSequence13;
            }
            Integer num14 = g0Var.f1680c0;
            if (num14 != null) {
                f0VarA.F = num14;
            }
            Bundle bundle = g0Var.f1682d0;
            if (bundle != null) {
                f0VarA.G = bundle;
            }
        }
        return new androidx.media3.common.g0(f0VarA);
    }

    public final ArrayList v1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.N.createMediaSource((androidx.media3.common.e0) list.get(i10)));
        }
        return arrayList;
    }

    public final s0 w1(r0 r0Var) {
        int iY1 = y1();
        androidx.media3.common.a1 a1Var = this.P0.f7057a;
        if (iY1 == -1) {
            iY1 = 0;
        }
        a5.x xVar = this.T;
        e0 e0Var = this.H;
        return new s0(e0Var, r0Var, a1Var, iY1, xVar, e0Var.F);
    }

    public final long x1(p0 p0Var) {
        if (p0Var.f7057a.p()) {
            return a5.d0.G(this.R0);
        }
        if (p0Var.f7058b.a()) {
            return p0Var.f7072r;
        }
        androidx.media3.common.a1 a1Var = p0Var.f7057a;
        o5.z zVar = p0Var.f7058b;
        long j = p0Var.f7072r;
        Object obj = zVar.f1689a;
        androidx.media3.common.y0 y0Var = this.K;
        a1Var.g(obj, y0Var);
        return j + y0Var.f1831x;
    }

    public final int y1() {
        if (this.P0.f7057a.p()) {
            return this.Q0;
        }
        p0 p0Var = this.P0;
        return p0Var.f7057a.g(p0Var.f7058b.f1689a, this.K).f1829g;
    }

    public final Pair z1(androidx.media3.common.a1 a1Var, t0 t0Var) {
        long contentPosition = getContentPosition();
        if (a1Var.p() || t0Var.p()) {
            boolean z10 = !a1Var.p() && t0Var.p();
            int iY1 = z10 ? -1 : y1();
            if (z10) {
                contentPosition = -9223372036854775807L;
            }
            return E1(t0Var, iY1, contentPosition);
        }
        Pair pairI = a1Var.i((androidx.media3.common.z0) this.f1504d, this.K, getCurrentMediaItemIndex(), a5.d0.G(contentPosition));
        Object obj = pairI.first;
        if (t0Var.b(obj) != -1) {
            return pairI;
        }
        Object objG = e0.G((androidx.media3.common.z0) this.f1504d, this.K, this.f7113c0, this.f7114d0, obj, a1Var, t0Var);
        if (objG == null) {
            return E1(t0Var, -1, -9223372036854775807L);
        }
        androidx.media3.common.y0 y0Var = this.K;
        t0Var.g(objG, y0Var);
        int i10 = y0Var.f1829g;
        androidx.media3.common.z0 z0Var = (androidx.media3.common.z0) this.f1504d;
        t0Var.m(i10, z0Var, 0L);
        return E1(t0Var, i10, a5.d0.P(z0Var.I));
    }

    @Override // androidx.media3.common.s0
    public final f getPlayerError() {
        R1();
        return this.P0.f7062f;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addMediaSource(int i10, o5.b0 b0Var) {
        R1();
        addMediaSources(i10, Collections.singletonList(b0Var));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addMediaSources(int i10, List list) {
        R1();
        a5.a.e(i10 >= 0);
        ArrayList arrayList = this.L;
        int iMin = Math.min(i10, arrayList.size());
        androidx.media3.common.a1 currentTimeline = getCurrentTimeline();
        this.f7115e0++;
        ArrayList arrayListT1 = t1(iMin, list);
        t0 t0Var = new t0(arrayList, this.f7122k0);
        p0 p0VarD1 = D1(this.P0, t0Var, z1(currentTimeline, t0Var));
        b1 b1Var = this.f7122k0;
        a5.z zVar = this.H.D;
        b0 b0Var = new b0(arrayListT1, b1Var, -1, -9223372036854775807L);
        zVar.getClass();
        a5.y yVarC = a5.z.c();
        yVarC.f171a = zVar.f173a.obtainMessage(18, iMin, 0, b0Var);
        yVarC.b();
        P1(p0VarD1, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaItems(List list, int i10, long j) {
        R1();
        setMediaSources(v1(list), i10, j);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSource(o5.b0 b0Var, long j) {
        R1();
        setMediaSources(Collections.singletonList(b0Var), 0, j);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSources(List list, boolean z10) {
        R1();
        K1(list, -1, -9223372036854775807L, z10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void stop(boolean z10) {
        R1();
        this.X.d(1, getPlayWhenReady());
        M1(z10, null);
        this.G0 = new z4.c(this.P0.f7072r, oe.u0.f19383x);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void clearVideoSurface(Surface surface) {
        R1();
        if (surface == null || surface != this.f7131s0) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSources(List list, int i10, long j) {
        R1();
        K1(list, i10, j, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSource(o5.b0 b0Var, boolean z10) {
        R1();
        setMediaSources(Collections.singletonList(b0Var), z10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void prepare(o5.b0 b0Var) {
        R1();
        setMediaSource(b0Var);
        prepare();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void prepare(o5.b0 b0Var, boolean z10, boolean z11) {
        R1();
        setMediaSource(b0Var, z10);
        prepare();
    }
}
