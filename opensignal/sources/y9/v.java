package y9;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.m1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class v extends oa.e implements qb.l {
    public final Context Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final xr.a f25997a1;

    /* renamed from: b1, reason: collision with root package name */
    public final s f25998b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f25999c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f26000d1;

    /* renamed from: e1, reason: collision with root package name */
    public Format f26001e1;

    /* renamed from: f1, reason: collision with root package name */
    public long f26002f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f26003g1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f26004h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f26005i1;

    /* renamed from: j1, reason: collision with root package name */
    public a0 f26006j1;

    public v(Context context, Handler handler, j jVar, s sVar) {
        super(1, 44100.0f);
        this.Z0 = context.getApplicationContext();
        this.f25998b1 = sVar;
        this.f25997a1 = new xr.a(handler, 2, jVar);
        sVar.f25982o = new u(0, this);
    }

    @Override // oa.e
    public final float H(float f10, Format[] formatArr) {
        int iMax = -1;
        for (Format format : formatArr) {
            int i10 = format.V;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // oa.e
    public final List I(oa.f fVar, Format format, boolean z10) {
        String str = format.H;
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        if (this.f25998b1.g(format) != 0) {
            List listD = oa.k.d("audio/raw", false, false);
            oa.c cVar = listD.isEmpty() ? null : (oa.c) listD.get(0);
            if (cVar != null) {
                return Collections.singletonList(cVar);
            }
        }
        fVar.getClass();
        ArrayList arrayList = new ArrayList(oa.k.d(str, z10, false));
        Collections.sort(arrayList, new e2.t(3, new io.sentry.android.replay.capture.e(20, format)));
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(oa.k.d("audio/eac3", z10, false));
            arrayList = arrayList2;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    @Override // oa.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final js.e K(oa.c r13, com.google.android.exoplayer2.Format r14, android.media.MediaCrypto r15, float r16) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.v.K(oa.c, com.google.android.exoplayer2.Format, android.media.MediaCrypto, float):js.e");
    }

    @Override // oa.e
    public final void P(Exception exc) {
        qb.b.q("MediaCodecAudioRenderer", "Audio codec error", exc);
        xr.a aVar = this.f25997a1;
        Handler handler = (Handler) aVar.f25482d;
        if (handler != null) {
            handler.post(new h(aVar, exc, 0));
        }
    }

    @Override // oa.e
    public final void Q(String str, long j, long j7) {
        xr.a aVar = this.f25997a1;
        Handler handler = (Handler) aVar.f25482d;
        if (handler != null) {
            handler.post(new f5.e(aVar, str, j, j7, 3));
        }
    }

    @Override // oa.e
    public final void R(String str) {
        xr.a aVar = this.f25997a1;
        Handler handler = (Handler) aVar.f25482d;
        if (handler != null) {
            handler.post(new s9.c(aVar, 5, str));
        }
    }

    @Override // oa.e
    public final z9.e S(io.sentry.internal.debugmeta.c cVar) throws com.google.android.exoplayer2.n {
        z9.e eVarS = super.S(cVar);
        Format format = (Format) cVar.f12354g;
        xr.a aVar = this.f25997a1;
        Handler handler = (Handler) aVar.f25482d;
        if (handler != null) {
            handler.post(new ch.a(aVar, format, eVarS, 19));
        }
        return eVarS;
    }

    @Override // oa.e
    public final void T(Format format, MediaFormat mediaFormat) throws com.google.android.exoplayer2.n {
        Format format2 = this.f26001e1;
        int[] iArr = null;
        if (format2 != null) {
            format = format2;
        } else if (this.f19183d0 != null) {
            String str = format.H;
            int i10 = format.U;
            int iT = format.W;
            if (!"audio/raw".equals(str)) {
                if (qb.v.f20828a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                    iT = mediaFormat.getInteger("pcm-encoding");
                } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                    iT = qb.v.t(mediaFormat.getInteger("v-bits-per-sample"));
                } else if (!"audio/raw".equals(format.H)) {
                    iT = 2;
                }
            }
            g0 g0Var = new g0();
            g0Var.k = "audio/raw";
            g0Var.f4165z = iT;
            g0Var.A = format.X;
            g0Var.B = format.Y;
            g0Var.f4163x = mediaFormat.getInteger("channel-count");
            g0Var.f4164y = mediaFormat.getInteger("sample-rate");
            format = new Format(g0Var);
            if (this.f26000d1 && format.U == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = i11;
                }
            }
        }
        try {
            this.f25998b1.b(format, iArr);
        } catch (k e4) {
            throw c(e4, e4.f25929a, false, 5001);
        }
    }

    @Override // oa.e
    public final void V() {
        this.f25998b1.D = true;
    }

    @Override // oa.e
    public final void W(z9.d dVar) {
        if (!this.f26003g1 || dVar.g(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(dVar.f26793y - this.f26002f1) > 500000) {
            this.f26002f1 = dVar.f26793y;
        }
        this.f26003g1 = false;
    }

    @Override // oa.e
    public final boolean Y(long j, long j7, l5.a0 a0Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j10, boolean z10, boolean z11, Format format) throws com.google.android.exoplayer2.n {
        byteBuffer.getClass();
        if (this.f26001e1 != null && (i11 & 2) != 0) {
            a0Var.getClass();
            a0Var.g(i10, false);
            return true;
        }
        s sVar = this.f25998b1;
        if (z10) {
            if (a0Var != null) {
                a0Var.g(i10, false);
            }
            this.U0.f26784c += i12;
            sVar.D = true;
            return true;
        }
        try {
            if (!sVar.k(byteBuffer, j10, i12)) {
                return false;
            }
            if (a0Var != null) {
                a0Var.g(i10, false);
            }
            this.U0.f26783b += i12;
            return true;
        } catch (l e4) {
            throw c(e4, e4.f25931d, e4.f25930a, 5001);
        } catch (m e10) {
            throw c(e10, format, e10.f25932a, 5002);
        }
    }

    @Override // qb.l, d5.f0
    public final long a() {
        if (this.f4140x == 2) {
            m0();
        }
        return this.f26002f1;
    }

    @Override // qb.l
    public final void b(b1 b1Var) {
        s sVar = this.f25998b1;
        sVar.getClass();
        b1 b1Var2 = new b1(qb.v.h(b1Var.f4070a, 0.1f, 8.0f), qb.v.h(b1Var.f4071b, 0.1f, 8.0f));
        if (!sVar.k || qb.v.f20828a < 23) {
            sVar.s(b1Var2, sVar.h().f25967b);
        } else {
            sVar.t(b1Var2);
        }
    }

    @Override // oa.e
    public final void b0() throws IllegalStateException, com.google.android.exoplayer2.n {
        try {
            s sVar = this.f25998b1;
            if (!sVar.P && sVar.n() && sVar.c()) {
                sVar.p();
                sVar.P = true;
            }
        } catch (m e4) {
            throw c(e4, e4.f25933d, e4.f25932a, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.g, com.google.android.exoplayer2.i1
    public final void e(int i10, Object obj) throws IllegalStateException {
        s sVar = this.f25998b1;
        if (i10 == 2) {
            float fFloatValue = ((Float) obj).floatValue();
            if (sVar.G != fFloatValue) {
                sVar.G = fFloatValue;
                if (sVar.n()) {
                    if (qb.v.f20828a >= 21) {
                        sVar.f25985r.setVolume(sVar.G);
                        return;
                    }
                    AudioTrack audioTrack = sVar.f25985r;
                    float f10 = sVar.G;
                    audioTrack.setStereoVolume(f10, f10);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            b bVar = (b) obj;
            if (sVar.f25986s.equals(bVar)) {
                return;
            }
            sVar.f25986s = bVar;
            if (sVar.V) {
                return;
            }
            sVar.d();
            return;
        }
        if (i10 == 5) {
            o oVar = (o) obj;
            if (sVar.U.equals(oVar)) {
                return;
            }
            oVar.getClass();
            if (sVar.f25985r != null) {
                sVar.U.getClass();
            }
            sVar.U = oVar;
            return;
        }
        switch (i10) {
            case 101:
                sVar.s(sVar.h().f25966a, ((Boolean) obj).booleanValue());
                break;
            case 102:
                int iIntValue = ((Integer) obj).intValue();
                if (sVar.T != iIntValue) {
                    sVar.T = iIntValue;
                    sVar.S = iIntValue != 0;
                    sVar.d();
                    break;
                }
                break;
            case 103:
                this.f26006j1 = (a0) obj;
                break;
        }
    }

    @Override // oa.e
    public final boolean g0(Format format) {
        return this.f25998b1.g(format) != 0;
    }

    @Override // com.google.android.exoplayer2.g, com.google.android.exoplayer2.l1
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // qb.l
    /* renamed from: getPlaybackParameters */
    public final b1 mo6getPlaybackParameters() {
        s sVar = this.f25998b1;
        return sVar.k ? sVar.f25989v : sVar.h().f25966a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    @Override // oa.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h0(oa.f r10, com.google.android.exoplayer2.Format r11) {
        /*
            r9 = this;
            java.lang.String r0 = r11.H
            boolean r0 = qb.m.h(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r0 = qb.v.f20828a
            r2 = 21
            if (r0 < r2) goto L13
            r0 = 32
            goto L14
        L13:
            r0 = r1
        L14:
            java.lang.Class r2 = r11.f4021a0
            r3 = 1
            if (r2 == 0) goto L1b
            r4 = r3
            goto L1c
        L1b:
            r4 = r1
        L1c:
            if (r2 == 0) goto L29
            java.lang.Class<ba.k> r5 = ba.k.class
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L27
            goto L29
        L27:
            r2 = r1
            goto L2a
        L29:
            r2 = r3
        L2a:
            java.lang.String r5 = "audio/raw"
            y9.s r6 = r9.f25998b1
            if (r2 == 0) goto L50
            int r7 = r6.g(r11)
            if (r7 == 0) goto L50
            if (r4 == 0) goto L4c
            java.util.List r4 = oa.k.d(r5, r1, r1)
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L44
            r4 = 0
            goto L4a
        L44:
            java.lang.Object r4 = r4.get(r1)
            oa.c r4 = (oa.c) r4
        L4a:
            if (r4 == 0) goto L50
        L4c:
            r10 = 12
        L4e:
            r10 = r10 | r0
            return r10
        L50:
            java.lang.String r4 = r11.H
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L5e
            int r4 = r6.g(r11)
            if (r4 == 0) goto La7
        L5e:
            int r4 = r11.U
            int r7 = r11.V
            com.google.android.exoplayer2.g0 r8 = new com.google.android.exoplayer2.g0
            r8.<init>()
            r8.k = r5
            r8.f4163x = r4
            r8.f4164y = r7
            r4 = 2
            r8.f4165z = r4
            com.google.android.exoplayer2.Format r5 = new com.google.android.exoplayer2.Format
            r5.<init>(r8)
            int r5 = r6.g(r5)
            if (r5 == 0) goto La7
            java.util.List r10 = r9.I(r10, r11, r1)
            boolean r5 = r10.isEmpty()
            if (r5 == 0) goto L86
            goto La7
        L86:
            if (r2 != 0) goto L89
            return r4
        L89:
            java.lang.Object r10 = r10.get(r1)
            oa.c r10 = (oa.c) r10
            boolean r1 = r10.c(r11)
            if (r1 == 0) goto L9e
            boolean r10 = r10.d(r11)
            if (r10 == 0) goto L9e
            r10 = 16
            goto La0
        L9e:
            r10 = 8
        La0:
            if (r1 == 0) goto La4
            r11 = 4
            goto La5
        La4:
            r11 = 3
        La5:
            r10 = r10 | r11
            goto L4e
        La7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.v.h0(oa.f, com.google.android.exoplayer2.Format):int");
    }

    @Override // oa.e, com.google.android.exoplayer2.g
    public final boolean i() {
        if (!this.Q0) {
            return false;
        }
        s sVar = this.f25998b1;
        if (sVar.n()) {
            return sVar.P && !sVar.l();
        }
        return true;
    }

    @Override // oa.e, com.google.android.exoplayer2.g
    public final boolean j() {
        return this.f25998b1.l() || super.j();
    }

    @Override // com.google.android.exoplayer2.g
    public final void k() {
        xr.a aVar = this.f25997a1;
        this.f26005i1 = true;
        try {
            this.f25998b1.d();
            try {
                this.U = null;
                this.V0 = -9223372036854775807L;
                this.W0 = -9223372036854775807L;
                this.X0 = 0;
                E();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                this.U = null;
                this.V0 = -9223372036854775807L;
                this.W0 = -9223372036854775807L;
                this.X0 = 0;
                E();
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.g
    public final void l(boolean z10, boolean z11) throws IllegalStateException {
        z9.b bVar = new z9.b();
        this.U0 = bVar;
        xr.a aVar = this.f25997a1;
        Handler handler = (Handler) aVar.f25482d;
        if (handler != null) {
            handler.post(new i(aVar, bVar, 0));
        }
        m1 m1Var = this.f4138g;
        m1Var.getClass();
        boolean z12 = m1Var.f4240a;
        s sVar = this.f25998b1;
        if (!z12) {
            if (sVar.V) {
                sVar.V = false;
                sVar.d();
                return;
            }
            return;
        }
        sVar.getClass();
        qb.b.j(qb.v.f20828a >= 21);
        qb.b.j(sVar.S);
        if (sVar.V) {
            return;
        }
        sVar.V = true;
        sVar.d();
    }

    public final int l0(oa.c cVar, Format format) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(cVar.f19169a) || (i10 = qb.v.f20828a) >= 24 || (i10 == 23 && qb.v.B(this.Z0))) {
            return format.I;
        }
        return -1;
    }

    @Override // oa.e, com.google.android.exoplayer2.g
    public final void m(long j, boolean z10) throws IllegalStateException, com.google.android.exoplayer2.n {
        super.m(j, z10);
        this.f25998b1.d();
        this.f26002f1 = j;
        this.f26003g1 = true;
        this.f26004h1 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0269 A[Catch: Exception -> 0x0284, TRY_LEAVE, TryCatch #0 {Exception -> 0x0284, blocks: (B:94:0x0244, B:96:0x0269), top: B:168:0x0244 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m0() {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.v.m0():void");
    }

    @Override // com.google.android.exoplayer2.g
    public final void n() throws IllegalStateException {
        s sVar = this.f25998b1;
        try {
            try {
                z();
                a0();
                b9.e eVar = this.X;
                if (eVar != null) {
                    eVar.D(null);
                }
                this.X = null;
            } catch (Throwable th2) {
                b9.e eVar2 = this.X;
                if (eVar2 != null) {
                    eVar2.D(null);
                }
                this.X = null;
                throw th2;
            }
        } finally {
            if (this.f26005i1) {
                this.f26005i1 = false;
                sVar.r();
            }
        }
    }

    @Override // com.google.android.exoplayer2.g
    public final void o() throws IllegalStateException {
        s sVar = this.f25998b1;
        sVar.R = true;
        if (sVar.n()) {
            f5.n nVar = sVar.f25978i.f25939f;
            nVar.getClass();
            nVar.a();
            sVar.f25985r.play();
        }
    }

    @Override // com.google.android.exoplayer2.g
    public final void p() throws IllegalStateException {
        m0();
        s sVar = this.f25998b1;
        sVar.R = false;
        if (sVar.n()) {
            n nVar = sVar.f25978i;
            nVar.f25943l = 0L;
            nVar.f25954w = 0;
            nVar.f25953v = 0;
            nVar.f25944m = 0L;
            nVar.C = 0L;
            nVar.F = 0L;
            nVar.k = false;
            if (nVar.f25955x == -9223372036854775807L) {
                f5.n nVar2 = nVar.f25939f;
                nVar2.getClass();
                nVar2.a();
                sVar.f25985r.pause();
            }
        }
    }

    @Override // oa.e
    public final z9.e x(oa.c cVar, Format format, Format format2) {
        z9.e eVarB = cVar.b(format, format2);
        int i10 = eVarB.f26798e;
        if (l0(cVar, format2) > this.f25999c1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new z9.e(cVar.f19169a, format, format2, i11 != 0 ? 0 : eVarB.f26797d, i11);
    }

    @Override // com.google.android.exoplayer2.g
    public final qb.l g() {
        return this;
    }
}
