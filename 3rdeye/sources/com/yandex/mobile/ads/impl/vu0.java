package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.gv0;
import com.yandex.mobile.ads.impl.oh;
import com.yandex.mobile.ads.impl.ph;
import com.yandex.mobile.ads.impl.so1;
import com.yandex.mobile.ads.impl.xj0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class vu0 extends av0 implements tu0 {

    /* renamed from: S0, reason: collision with root package name */
    private static final wu0 f34695S0 = hm1.d();

    /* renamed from: H0, reason: collision with root package name */
    private final Context f34696H0;

    /* renamed from: I0, reason: collision with root package name */
    private final oh.a f34697I0;

    /* renamed from: J0, reason: collision with root package name */
    private final ph f34698J0;

    /* renamed from: K0, reason: collision with root package name */
    private int f34699K0;

    /* renamed from: L0, reason: collision with root package name */
    private boolean f34700L0;

    /* renamed from: M0, reason: collision with root package name */
    private dc0 f34701M0;

    /* renamed from: N0, reason: collision with root package name */
    private long f34702N0;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f34703O0;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f34704P0;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f34705Q0;

    /* renamed from: R0, reason: collision with root package name */
    private so1.a f34706R0;

    public final class a implements ph.c {
        public /* synthetic */ a(vu0 vu0Var, int i) {
            this();
        }

        public final void a(Exception exc) {
            rs0.a("MediaCodecAudioRenderer", "Audio sink error", exc);
            vu0.this.f34697I0.b(exc);
        }

        public final void b() {
            so1.a aVar = vu0.this.f34706R0;
            if (aVar != null) {
                aVar.a();
            }
        }

        public final void c() {
            vu0.this.f34704P0 = true;
        }

        private a() {
        }

        public final void a() {
            so1.a aVar = vu0.this.f34706R0;
            if (aVar != null) {
                aVar.b();
            }
        }

        public final void a(long j4) {
            vu0.this.f34697I0.b(j4);
        }

        public final void a(boolean z10) {
            vu0.this.f34697I0.b(z10);
        }

        public final void a(int i, long j4, long j10) {
            vu0.this.f34697I0.b(i, j4, j10);
        }
    }

    public vu0(Context context, a00 a00Var, cv0 cv0Var, Handler handler, oh ohVar, cz czVar) {
        super(1, a00Var, cv0Var, 44100.0f);
        this.f34696H0 = context.getApplicationContext();
        this.f34698J0 = czVar;
        this.f34697I0 = new oh.a(handler, ohVar);
        czVar.a(new a(this, 0));
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void L() {
        this.f34698J0.g();
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void O() throws h60 {
        try {
            this.f34698J0.d();
        } catch (ph.e e4) {
            throw a(5002, e4.f31753d, e4, e4.f31752c);
        }
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final oy a(yu0 yu0Var, dc0 dc0Var, dc0 dc0Var2) throws NumberFormatException {
        oy oyVarA = yu0Var.a(dc0Var, dc0Var2);
        int i = oyVarA.f31526e;
        if (a(dc0Var2, yu0Var) > this.f34699K0) {
            i |= 64;
        }
        int i10 = i;
        return new oy(yu0Var.f35980a, dc0Var, dc0Var2, i10 != 0 ? 0 : oyVarA.f31525d, i10);
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void b(my myVar) {
        if (!this.f34703O0 || myVar.e()) {
            return;
        }
        if (Math.abs(myVar.f30574f - this.f34702N0) > 500000) {
            this.f34702N0 = myVar.f30574f;
        }
        this.f34703O0 = false;
    }

    @Override // com.yandex.mobile.ads.impl.av0, com.yandex.mobile.ads.impl.so1
    public final boolean d() {
        return this.f34698J0.e() || super.d();
    }

    @Override // com.yandex.mobile.ads.impl.so1, com.yandex.mobile.ads.impl.to1
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.tu0
    public final vh1 getPlaybackParameters() {
        return this.f34698J0.getPlaybackParameters();
    }

    @Override // com.yandex.mobile.ads.impl.av0, com.yandex.mobile.ads.impl.mk
    public final void u() {
        this.f34705Q0 = true;
        try {
            this.f34698J0.flush();
            try {
                super.u();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.u();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.av0, com.yandex.mobile.ads.impl.mk
    public final void v() {
        try {
            super.v();
        } finally {
            if (this.f34705Q0) {
                this.f34705Q0 = false;
                this.f34698J0.b();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public final void w() {
        this.f34698J0.play();
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public final void x() {
        long jA = this.f34698J0.a(a());
        if (jA != Long.MIN_VALUE) {
            if (!this.f34704P0) {
                jA = Math.max(this.f34702N0, jA);
            }
            this.f34702N0 = jA;
            this.f34704P0 = false;
        }
        this.f34698J0.pause();
    }

    @Override // com.yandex.mobile.ads.impl.tu0
    public final long o() {
        if (getState() == 2) {
            long jA = this.f34698J0.a(a());
            if (jA != Long.MIN_VALUE) {
                if (!this.f34704P0) {
                    jA = Math.max(this.f34702N0, jA);
                }
                this.f34702N0 = jA;
                this.f34704P0 = false;
            }
        }
        return this.f34702N0;
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final boolean b(dc0 dc0Var) {
        return this.f34698J0.a(dc0Var);
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final float a(float f10, dc0[] dc0VarArr) {
        int iMax = -1;
        for (dc0 dc0Var : dc0VarArr) {
            int i = dc0Var.f26066A;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    private static xj0 a(cv0 cv0Var, dc0 dc0Var, boolean z10, ph phVar) throws gv0.b {
        String str = dc0Var.f26083m;
        if (str == null) {
            return xj0.h();
        }
        if (phVar.a(dc0Var)) {
            List<yu0> listA = gv0.a("audio/raw", false, false);
            yu0 yu0Var = listA.isEmpty() ? null : listA.get(0);
            if (yu0Var != null) {
                return xj0.a(yu0Var);
            }
        }
        List<yu0> listA2 = cv0Var.a(str, z10, false);
        String strA = gv0.a(dc0Var);
        if (strA == null) {
            return xj0.a((Collection) listA2);
        }
        List<yu0> listA3 = cv0Var.a(strA, z10, false);
        int i = xj0.f35328d;
        return new xj0.a().b((List) listA2).b((List) listA3).a();
    }

    @Override // com.yandex.mobile.ads.impl.mk, com.yandex.mobile.ads.impl.so1
    public final tu0 l() {
        return this;
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final ArrayList a(cv0 cv0Var, dc0 dc0Var, boolean z10) throws gv0.b {
        return gv0.a(a(cv0Var, dc0Var, z10, this.f34698J0), dc0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    @Override // com.yandex.mobile.ads.impl.av0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.uu0.a a(com.yandex.mobile.ads.impl.yu0 r11, com.yandex.mobile.ads.impl.dc0 r12, android.media.MediaCrypto r13, float r14) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.vu0.a(com.yandex.mobile.ads.impl.yu0, com.yandex.mobile.ads.impl.dc0, android.media.MediaCrypto, float):com.yandex.mobile.ads.impl.uu0$a");
    }

    @Override // com.yandex.mobile.ads.impl.mk, com.yandex.mobile.ads.impl.hi1.b
    public final void a(int i, Object obj) throws h60 {
        if (i == 2) {
            this.f34698J0.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.f34698J0.a((ih) obj);
            return;
        }
        if (i != 6) {
            switch (i) {
                case 9:
                    this.f34698J0.b(((Boolean) obj).booleanValue());
                    break;
                case 10:
                    this.f34698J0.a(((Integer) obj).intValue());
                    break;
                case 11:
                    this.f34706R0 = (so1.a) obj;
                    break;
            }
            return;
        }
        this.f34698J0.a((ci) obj);
    }

    @Override // com.yandex.mobile.ads.impl.av0, com.yandex.mobile.ads.impl.mk, com.yandex.mobile.ads.impl.so1
    public final boolean a() {
        return super.a() && this.f34698J0.a();
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void a(Exception exc) {
        rs0.a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f34697I0.a(exc);
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void a(String str, long j4, long j10) {
        this.f34697I0.a(str, j4, j10);
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void a(String str) {
        this.f34697I0.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.av0, com.yandex.mobile.ads.impl.mk
    public final void a(boolean z10, boolean z11) throws h60 {
        super.a(z10, z11);
        this.f34697I0.b(this.f24856B0);
        if (p().f34171a) {
            this.f34698J0.c();
        } else {
            this.f34698J0.f();
        }
        this.f34698J0.a(r());
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final oy a(ec0 ec0Var) throws h60 {
        oy oyVarA = super.a(ec0Var);
        this.f34697I0.a(ec0Var.f26789b, oyVarA);
        return oyVarA;
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void a(dc0 dc0Var, MediaFormat mediaFormat) throws h60 {
        int iB;
        int i;
        dc0 dc0Var2 = this.f34701M0;
        int[] iArr = null;
        if (dc0Var2 != null) {
            dc0Var = dc0Var2;
        } else if (E() != null) {
            if ("audio/raw".equals(dc0Var.f26083m)) {
                iB = dc0Var.f26067B;
            } else if (s82.f32899a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iB = mediaFormat.getInteger("pcm-encoding");
            } else {
                iB = mediaFormat.containsKey("v-bits-per-sample") ? s82.b(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            dc0 dc0VarA = new dc0.a().e("audio/raw").i(iB).d(dc0Var.f26068C).e(dc0Var.f26069D).c(mediaFormat.getInteger("channel-count")).l(mediaFormat.getInteger("sample-rate")).a();
            if (this.f34700L0 && dc0VarA.f26096z == 6 && (i = dc0Var.f26096z) < 6) {
                iArr = new int[i];
                for (int i10 = 0; i10 < dc0Var.f26096z; i10++) {
                    iArr[i10] = i10;
                }
            }
            dc0Var = dc0VarA;
        }
        try {
            this.f34698J0.a(dc0Var, iArr);
        } catch (ph.a e4) {
            throw a(e4, e4.f31747b, 5001);
        }
    }

    @Override // com.yandex.mobile.ads.impl.av0, com.yandex.mobile.ads.impl.mk
    public final void a(long j4, boolean z10) throws h60 {
        super.a(j4, z10);
        this.f34698J0.flush();
        this.f34702N0 = j4;
        this.f34703O0 = true;
        this.f34704P0 = true;
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final boolean a(long j4, long j10, uu0 uu0Var, ByteBuffer byteBuffer, int i, int i10, int i11, long j11, boolean z10, boolean z11, dc0 dc0Var) throws h60 {
        byteBuffer.getClass();
        if (this.f34701M0 != null && (i10 & 2) != 0) {
            uu0Var.getClass();
            uu0Var.a(false, i);
            return true;
        }
        if (z10) {
            if (uu0Var != null) {
                uu0Var.a(false, i);
            }
            this.f24856B0.f29814f += i11;
            this.f34698J0.g();
            return true;
        }
        try {
            if (!this.f34698J0.a(byteBuffer, j11, i11)) {
                return false;
            }
            if (uu0Var != null) {
                uu0Var.a(false, i);
            }
            this.f24856B0.f29813e += i11;
            return true;
        } catch (ph.b e4) {
            throw a(5001, e4.f31750d, e4, e4.f31749c);
        } catch (ph.e e10) {
            throw a(5002, dc0Var, e10, e10.f31752c);
        }
    }

    @Override // com.yandex.mobile.ads.impl.tu0
    public final void a(vh1 vh1Var) {
        this.f34698J0.a(vh1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if ((r4.isEmpty() ? null : r4.get(0)) != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.av0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.yandex.mobile.ads.impl.cv0 r13, com.yandex.mobile.ads.impl.dc0 r14) throws com.yandex.mobile.ads.impl.gv0.b {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.vu0.a(com.yandex.mobile.ads.impl.cv0, com.yandex.mobile.ads.impl.dc0):int");
    }

    private int a(dc0 dc0Var, yu0 yu0Var) {
        int i;
        if (!f34695S0.e().equals(yu0Var.f35980a) || (i = s82.f32899a) >= 24 || (i == 23 && s82.d(this.f34696H0))) {
            return dc0Var.f26084n;
        }
        return -1;
    }
}
