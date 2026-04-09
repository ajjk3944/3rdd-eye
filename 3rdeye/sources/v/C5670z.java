package v;

import C.C0635w;
import C.J;
import I.m;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.EnumC1714t;
import androidx.camera.core.impl.EnumC1718v;
import androidx.camera.core.impl.EnumC1719w;
import androidx.camera.core.impl.EnumC1720x;
import androidx.camera.core.impl.S;
import b2.C1841v;
import com.applovin.impl.D0;
import com.applovin.impl.F0;
import com.applovin.impl.G0;
import com.yandex.mobile.ads.impl.U5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;
import u.C5616a;
import v.C5658m;
import w.C5698l;
import z.C5834d;
import z.C5839i;
import z.C5847q;

/* compiled from: Camera2CapturePipeline.java */
/* renamed from: v.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5670z {

    /* renamed from: a, reason: collision with root package name */
    public final C5658m f46953a;

    /* renamed from: b, reason: collision with root package name */
    public final C5847q f46954b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f46955c;

    /* renamed from: d, reason: collision with root package name */
    public final C0 f46956d;

    /* renamed from: e, reason: collision with root package name */
    public final H.g f46957e;

    /* renamed from: f, reason: collision with root package name */
    public final H.c f46958f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f46959g;

    /* renamed from: h, reason: collision with root package name */
    public int f46960h = 1;

    /* compiled from: Camera2CapturePipeline.java */
    /* renamed from: v.z$a */
    public static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final C5658m f46961a;

        /* renamed from: b, reason: collision with root package name */
        public final C5839i f46962b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46963c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f46964d = false;

        public a(C5658m c5658m, int i, C5839i c5839i) {
            this.f46961a = c5658m;
            this.f46963c = i;
            this.f46962b = c5839i;
        }

        @Override // v.C5670z.e
        public final A4.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (!C5670z.c(totalCaptureResult, this.f46963c)) {
                return I.j.e(Boolean.FALSE);
            }
            C.S.a("Camera2CapturePipeline", "Trigger AE");
            this.f46964d = true;
            I.d dVarA = I.d.a(o0.b.a(new D7.c(this, 22)));
            C1841v c1841v = new C1841v(4);
            H.b bVarY = E.u.y();
            dVarA.getClass();
            return I.j.j(dVarA, new H6.I(c1841v, 2), bVarY);
        }

        @Override // v.C5670z.e
        public final boolean b() {
            return this.f46963c == 0;
        }

        @Override // v.C5670z.e
        public final void c() {
            if (this.f46964d) {
                C.S.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f46961a.f46758h.a(false, true);
                this.f46962b.f48393b = false;
            }
        }
    }

    /* compiled from: Camera2CapturePipeline.java */
    /* renamed from: v.z$b */
    public static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final C5658m f46965a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f46966b = false;

        public b(C5658m c5658m) {
            this.f46965a = c5658m;
        }

        @Override // v.C5670z.e
        public final A4.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            m.c cVarE = I.j.e(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                C.S.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C.S.a("Camera2CapturePipeline", "Trigger AF");
                    this.f46966b = true;
                    i0 i0Var = this.f46965a.f46758h;
                    if (i0Var.f46713c) {
                        S.a aVar = new S.a();
                        aVar.f14950c = i0Var.f46714d;
                        aVar.f14953f = true;
                        C1710q0 c1710q0K = C1710q0.K();
                        c1710q0K.N(C5616a.J(CaptureRequest.CONTROL_AF_TRIGGER), 1);
                        aVar.c(new C5616a(C1717u0.J(c1710q0K)));
                        aVar.b(new h0());
                        i0Var.f46711a.u(Collections.singletonList(aVar.d()));
                    }
                }
            }
            return cVarE;
        }

        @Override // v.C5670z.e
        public final boolean b() {
            return true;
        }

        @Override // v.C5670z.e
        public final void c() {
            if (this.f46966b) {
                C.S.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f46965a.f46758h.a(true, false);
            }
        }
    }

    /* compiled from: Camera2CapturePipeline.java */
    /* renamed from: v.z$c */
    public static class c implements E.i {

        /* renamed from: a, reason: collision with root package name */
        public final H.g f46967a;

        /* renamed from: b, reason: collision with root package name */
        public final d f46968b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46969c;

        public c(d dVar, H.g gVar, int i) {
            this.f46968b = dVar;
            this.f46967a = gVar;
            this.f46969c = i;
        }

        @Override // E.i
        public final A4.a<Void> a() {
            C.S.a("Camera2CapturePipeline", "invokePreCapture");
            I.d dVarA = I.d.a(this.f46968b.a(this.f46969c));
            F0 f02 = new F0(4);
            dVarA.getClass();
            return I.j.j(dVarA, new H6.I(f02, 2), this.f46967a);
        }

        @Override // E.i
        public final A4.a<Void> b() {
            return o0.b.a(new B8.b(this, 14));
        }
    }

    /* compiled from: Camera2CapturePipeline.java */
    /* renamed from: v.z$d */
    public static class d {

        /* renamed from: j, reason: collision with root package name */
        public static final long f46970j;

        /* renamed from: k, reason: collision with root package name */
        public static final long f46971k;

        /* renamed from: a, reason: collision with root package name */
        public final int f46972a;

        /* renamed from: b, reason: collision with root package name */
        public final H.g f46973b;

        /* renamed from: c, reason: collision with root package name */
        public final H.c f46974c;

        /* renamed from: d, reason: collision with root package name */
        public final C5658m f46975d;

        /* renamed from: e, reason: collision with root package name */
        public final C5839i f46976e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f46977f;

        /* renamed from: g, reason: collision with root package name */
        public long f46978g = f46970j;

        /* renamed from: h, reason: collision with root package name */
        public final ArrayList f46979h = new ArrayList();
        public final a i = new a();

        /* compiled from: Camera2CapturePipeline.java */
        /* renamed from: v.z$d$a */
        public class a implements e {
            public a() {
            }

            @Override // v.C5670z.e
            public final A4.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = d.this.f46979h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e) it.next()).a(totalCaptureResult));
                }
                I.q qVarB = I.j.b(arrayList);
                D0 d02 = new D0(2);
                return I.j.j(qVarB, new H6.I(d02, 2), E.u.y());
            }

            @Override // v.C5670z.e
            public final boolean b() {
                Iterator it = d.this.f46979h.iterator();
                while (it.hasNext()) {
                    if (((e) it.next()).b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // v.C5670z.e
            public final void c() {
                Iterator it = d.this.f46979h.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).c();
                }
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f46970j = timeUnit.toNanos(1L);
            f46971k = timeUnit.toNanos(5L);
        }

        public d(int i, H.g gVar, H.c cVar, C5658m c5658m, boolean z10, C5839i c5839i) {
            this.f46972a = i;
            this.f46973b = gVar;
            this.f46974c = cVar;
            this.f46975d = c5658m;
            this.f46977f = z10;
            this.f46976e = c5839i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final A4.a<TotalCaptureResult> a(int i) {
            m.c cVar = m.c.f2366c;
            if (this.f46979h.isEmpty()) {
                return cVar;
            }
            m.c cVar2 = cVar;
            if (this.i.b()) {
                f fVar = new f(null);
                C5658m c5658m = this.f46975d;
                c5658m.l(fVar);
                d0.r rVar = new d0.r(4, c5658m, fVar);
                b.d dVar = fVar.f46982b;
                dVar.f44804c.addListener(rVar, c5658m.f46753c);
                cVar2 = dVar;
            }
            I.d dVarA = I.d.a(cVar2);
            U5 u52 = new U5(this, i);
            dVarA.getClass();
            H.g gVar = this.f46973b;
            return I.j.j(I.j.j(dVarA, u52, gVar), new B.f(this, 20), gVar);
        }
    }

    /* compiled from: Camera2CapturePipeline.java */
    /* renamed from: v.z$e */
    public interface e {
        A4.a<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    /* compiled from: Camera2CapturePipeline.java */
    /* renamed from: v.z$f */
    public static class f implements C5658m.c {

        /* renamed from: a, reason: collision with root package name */
        public b.a<TotalCaptureResult> f46981a;

        /* renamed from: b, reason: collision with root package name */
        public final b.d f46982b = o0.b.a(new B.f(this, 21));

        /* renamed from: c, reason: collision with root package name */
        public final a f46983c;

        /* compiled from: Camera2CapturePipeline.java */
        /* renamed from: v.z$f$a */
        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public f(a aVar) {
            this.f46983c = aVar;
        }

        @Override // v.C5658m.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.f46983c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.f46981a.b(totalCaptureResult);
            return true;
        }
    }

    /* compiled from: Camera2CapturePipeline.java */
    /* renamed from: v.z$g */
    public static class g implements e {

        /* renamed from: f, reason: collision with root package name */
        public static final long f46984f = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int f46985g = 0;

        /* renamed from: a, reason: collision with root package name */
        public final C5658m f46986a;

        /* renamed from: b, reason: collision with root package name */
        public final H.g f46987b;

        /* renamed from: c, reason: collision with root package name */
        public final H.c f46988c;

        /* renamed from: d, reason: collision with root package name */
        public final J.g f46989d;

        /* renamed from: e, reason: collision with root package name */
        public final H6.I f46990e;

        public g(C5658m c5658m, H.g gVar, H.c cVar, H6.I i) {
            this.f46986a = c5658m;
            this.f46987b = gVar;
            this.f46988c = cVar;
            this.f46990e = i;
            J.g gVar2 = c5658m.f46766q;
            Objects.requireNonNull(gVar2);
            this.f46989d = gVar2;
        }

        @Override // v.C5670z.e
        public final A4.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            C.S.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            AtomicReference atomicReference = new AtomicReference();
            b.d dVarA = o0.b.a(new d0.f(atomicReference, 1));
            I.d dVarA2 = I.d.a(o0.b.a(new C0635w(12, this, atomicReference)));
            D7.c cVar = new D7.c(this, 23);
            dVarA2.getClass();
            H.g gVar = this.f46987b;
            I.b bVarJ = I.j.j(I.j.j(I.j.j(I.j.j(I.j.j(dVarA2, cVar, gVar), new B.f(this, 22), gVar), new B.i(11, this, dVarA), gVar), new C5642C(this), gVar), new B.d(this, 26), gVar);
            D0 d02 = new D0(3);
            return I.j.j(bVarJ, new H6.I(d02, 2), E.u.y());
        }

        @Override // v.C5670z.e
        public final boolean b() {
            return false;
        }

        @Override // v.C5670z.e
        public final void c() {
            C.S.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            boolean zH = this.f46990e.h();
            C5658m c5658m = this.f46986a;
            if (zH) {
                c5658m.n(false);
            }
            c5658m.f46758h.b(false).addListener(new RunnableC5655j(1), this.f46987b);
            c5658m.f46758h.a(false, true);
            H.c cVarH = E.u.H();
            J.g gVar = this.f46989d;
            Objects.requireNonNull(gVar);
            cVarH.execute(new com.vungle.ads.internal.util.a(gVar, 10));
        }
    }

    /* compiled from: Camera2CapturePipeline.java */
    /* renamed from: v.z$h */
    public static class h implements e {

        /* renamed from: g, reason: collision with root package name */
        public static final long f46991g = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f46992h = 0;

        /* renamed from: a, reason: collision with root package name */
        public final C5658m f46993a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46994b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f46995c = false;

        /* renamed from: d, reason: collision with root package name */
        public final H.g f46996d;

        /* renamed from: e, reason: collision with root package name */
        public final H.c f46997e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f46998f;

        public h(C5658m c5658m, int i, H.g gVar, H.c cVar, boolean z10) {
            this.f46993a = c5658m;
            this.f46994b = i;
            this.f46996d = gVar;
            this.f46997e = cVar;
            this.f46998f = z10;
        }

        @Override // v.C5670z.e
        public final A4.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            C.S.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + C5670z.c(totalCaptureResult, this.f46994b));
            if (C5670z.c(totalCaptureResult, this.f46994b)) {
                if (!this.f46993a.f46767r) {
                    C.S.a("Camera2CapturePipeline", "Turn on torch");
                    this.f46995c = true;
                    I.d dVarA = I.d.a(o0.b.a(new B.f(this, 23)));
                    B8.b bVar = new B8.b(this, 15);
                    H.g gVar = this.f46996d;
                    dVarA.getClass();
                    return I.j.j(I.j.j(I.j.j(dVarA, bVar, gVar), new M8.a(this, 16), this.f46996d), new H6.I(new G0(4), 2), E.u.y());
                }
                C.S.a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return I.j.e(Boolean.FALSE);
        }

        @Override // v.C5670z.e
        public final boolean b() {
            return this.f46994b == 0;
        }

        @Override // v.C5670z.e
        public final void c() {
            if (this.f46995c) {
                C5658m c5658m = this.f46993a;
                c5658m.f46759j.a(null, false);
                C.S.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f46998f) {
                    c5658m.f46758h.a(false, true);
                }
            }
        }
    }

    public C5670z(C5658m c5658m, C5698l c5698l, C0 c02, H.g gVar, H.c cVar) {
        this.f46953a = c5658m;
        Integer num = (Integer) c5698l.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f46959g = num != null && num.intValue() == 2;
        this.f46957e = gVar;
        this.f46958f = cVar;
        this.f46956d = c02;
        this.f46954b = new C5847q(c02);
        this.f46955c = C5834d.a(new M8.a(c5698l, 15));
    }

    public static boolean b(TotalCaptureResult totalCaptureResult, boolean z10) {
        EnumC1714t enumC1714t;
        EnumC1720x enumC1720x;
        if (totalCaptureResult != null) {
            C5651f c5651f = new C5651f(totalCaptureResult);
            CaptureResult captureResult = c5651f.f46696b;
            Set<EnumC1719w> set = androidx.camera.core.impl.W.f14979a;
            boolean z11 = c5651f.h() == EnumC1718v.OFF || c5651f.h() == EnumC1718v.UNKNOWN || androidx.camera.core.impl.W.f14979a.contains(c5651f.g());
            Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AE_MODE);
            if (num == null) {
                enumC1714t = EnumC1714t.UNKNOWN;
            } else {
                int iIntValue = num.intValue();
                enumC1714t = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? (iIntValue == 5 && Build.VERSION.SDK_INT >= 28) ? EnumC1714t.ON_EXTERNAL_FLASH : EnumC1714t.UNKNOWN : EnumC1714t.ON_AUTO_FLASH_REDEYE : EnumC1714t.ON_ALWAYS_FLASH : EnumC1714t.ON_AUTO_FLASH : EnumC1714t.ON : EnumC1714t.OFF;
            }
            boolean z12 = enumC1714t == EnumC1714t.OFF;
            boolean z13 = !z10 ? !(z12 || androidx.camera.core.impl.W.f14981c.contains(c5651f.e())) : !(z12 || androidx.camera.core.impl.W.f14982d.contains(c5651f.e()));
            Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
            if (num2 != null) {
                switch (num2.intValue()) {
                    case 0:
                        enumC1720x = EnumC1720x.OFF;
                        break;
                    case 1:
                        enumC1720x = EnumC1720x.AUTO;
                        break;
                    case 2:
                        enumC1720x = EnumC1720x.INCANDESCENT;
                        break;
                    case 3:
                        enumC1720x = EnumC1720x.FLUORESCENT;
                        break;
                    case 4:
                        enumC1720x = EnumC1720x.WARM_FLUORESCENT;
                        break;
                    case 5:
                        enumC1720x = EnumC1720x.DAYLIGHT;
                        break;
                    case 6:
                        enumC1720x = EnumC1720x.CLOUDY_DAYLIGHT;
                        break;
                    case 7:
                        enumC1720x = EnumC1720x.TWILIGHT;
                        break;
                    case 8:
                        enumC1720x = EnumC1720x.SHADE;
                        break;
                    default:
                        enumC1720x = EnumC1720x.UNKNOWN;
                        break;
                }
            } else {
                enumC1720x = EnumC1720x.UNKNOWN;
            }
            boolean z14 = enumC1720x == EnumC1720x.OFF || androidx.camera.core.impl.W.f14980b.contains(c5651f.c());
            C.S.a("ConvergenceUtils", "checkCaptureResult, AE=" + c5651f.e() + " AF =" + c5651f.g() + " AWB=" + c5651f.c());
            if (z11 && z13 && z14) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(TotalCaptureResult totalCaptureResult, int i) {
        C.S.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i);
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            C.S.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
            return num != null && num.intValue() == 4;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v.C5670z.d a(int r13, int r14, int r15) {
        /*
            r12 = this;
            z.i r6 = new z.i
            androidx.camera.core.impl.C0 r7 = r12.f46956d
            r6.<init>(r7)
            v.z$d r0 = new v.z$d
            int r1 = r12.f46960h
            H.g r2 = r12.f46957e
            H.c r3 = r12.f46958f
            v.m r4 = r12.f46953a
            boolean r5 = r12.f46959g
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.ArrayList r1 = r0.f46979h
            v.m r2 = r12.f46953a
            if (r13 != 0) goto L24
            v.z$b r3 = new v.z$b
            r3.<init>(r2)
            r1.add(r3)
        L24:
            r3 = 3
            if (r14 != r3) goto L3a
            v.z$g r3 = new v.z$g
            H6.I r4 = new H6.I
            r4.<init>(r7)
            H.g r5 = r12.f46957e
            H.c r6 = r12.f46958f
            r3.<init>(r2, r5, r6, r4)
            r1.add(r3)
        L38:
            r8 = r14
            goto L8a
        L3a:
            boolean r4 = r12.f46955c
            if (r4 == 0) goto L38
            z.q r4 = r12.f46954b
            boolean r4 = r4.f48407a
            r5 = 1
            if (r4 != 0) goto L55
            int r7 = r12.f46960h
            if (r7 == r3) goto L55
            if (r15 != r5) goto L4c
            goto L55
        L4c:
            v.z$a r3 = new v.z$a
            r3.<init>(r2, r14, r6)
            r1.add(r3)
            goto L38
        L55:
            if (r4 != 0) goto L79
            Q9.s r2 = r2.f46764o
            java.lang.Object r2 = r2.f11528c
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2
            int r2 = r2.get()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "isInVideoUsage: mVideoUsageControl value = "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Camera2CameraControlImp"
            C.S.a(r4, r3)
            if (r2 <= 0) goto L77
            goto L79
        L77:
            r11 = r5
            goto L7b
        L79:
            r5 = 0
            goto L77
        L7b:
            v.z$h r6 = new v.z$h
            H.c r10 = r12.f46958f
            v.m r7 = r12.f46953a
            H.g r9 = r12.f46957e
            r8 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            r1.add(r6)
        L8a:
            java.lang.String r14 = "createPipeline: captureMode = "
            java.lang.String r2 = ", flashMode = "
            java.lang.String r3 = ", flashType = "
            java.lang.StringBuilder r13 = androidx.work.s.i(r14, r13, r2, r8, r3)
            r13.append(r15)
            java.lang.String r14 = ", pipeline tasks = "
            r13.append(r14)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "Camera2CapturePipeline"
            C.S.a(r14, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C5670z.a(int, int, int):v.z$d");
    }
}
