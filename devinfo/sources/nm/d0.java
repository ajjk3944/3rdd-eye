package nm;

import android.util.Base64;
import android.util.JsonWriter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.ads.hp;
import com.google.android.gms.internal.ads.qv0;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.settings.SettingsActivity;
import com.liuzh.deviceinfo.splash.SplashActivity;
import e4.c2;
import e4.v0;
import e4.z1;
import ec.t0;
import j$.util.Objects;
import java.io.IOException;
import java.io.StringWriter;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import pf.u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d0 implements o.x, p.n, e4.s, rf.b, ki.l, pi.i, sc.h, wi.b, qv0, vl.g, u8.a, za.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30010a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30011b;

    public /* synthetic */ d0(int i4) {
        this.f30010a = i4;
    }

    @Override // pi.i
    public void a() {
        int i4 = this.f30010a;
    }

    @Override // vl.g
    public vl.n b() throws Throwable {
        vl.r rVarB;
        IOException iOException = null;
        while (!((vl.o) this.f30011b).f36370k.f36345p) {
            try {
                rVarB = ((vl.o) this.f30011b).b();
            } catch (IOException e2) {
                if (iOException == null) {
                    iOException = e2;
                } else {
                    wd.b.a(iOException, e2);
                }
                if (!((vl.o) this.f30011b).a(null)) {
                    throw iOException;
                }
            }
            if (!rVarB.c()) {
                vl.q qVarD = rVarB.d();
                if (qVarD.f36378b == null && qVarD.f36379c == null) {
                    qVarD = rVarB.f();
                }
                vl.r rVar = qVarD.f36378b;
                Throwable th2 = qVarD.f36379c;
                if (th2 != null) {
                    throw th2;
                }
                if (rVar != null) {
                    ((vl.o) this.f30011b).f36375p.addFirst(rVar);
                }
            }
            return rVarB.b();
        }
        throw new IOException("Canceled");
    }

    @Override // ki.l
    public boolean d(boolean z3) {
        if (!z3 || zg.c.c()) {
            return false;
        }
        SettingsActivity settingsActivity = (SettingsActivity) this.f30011b;
        SettingsActivity.D(settingsActivity, settingsActivity.C);
        return true;
    }

    @Override // o.x
    public void e(o.m mVar, boolean z3) {
        if (mVar instanceof o.e0) {
            ((o.e0) mVar).f30196z.k().c(false);
        }
        o.x xVar = ((p.k) this.f30011b).f30729e;
        if (xVar != null) {
            xVar.e(mVar, z3);
        }
    }

    @Override // com.google.android.gms.internal.ads.qv0
    public void f(int i4, long j, String str) {
        ((ua.e) this.f30011b).f35237h.e(i4, System.currentTimeMillis() - j, null, null, str);
    }

    @Override // vl.g
    public vl.o g() {
        return (vl.o) this.f30011b;
    }

    @Override // xj.a
    public Object get() {
        return new pf.k0((u0) ((xj.a) this.f30011b).get());
    }

    @Override // u8.a
    public Object h() {
        com.google.android.gms.common.api.internal.a0 a0Var = (com.google.android.gms.common.api.internal.a0) this.f30011b;
        return new z7.h((hp) a0Var.f9070c, (i0.f) a0Var.f9071d);
    }

    @Override // za.e
    public void i(JsonWriter jsonWriter) throws IOException {
        Object obj = za.f.f38143b;
        jsonWriter.name("params").beginObject();
        byte[] bArr = (byte[]) this.f30011b;
        int length = bArr.length;
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(strEncodeToString);
        } else {
            String strD = za.d.d(strEncodeToString, "MD5");
            if (strD != null) {
                jsonWriter.name("bodydigest").value(strD);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    @Override // e4.s
    public c2 j(View view, c2 c2Var) {
        z1 z1Var = c2Var.f22315a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f30011b;
        if (!Objects.equals(coordinatorLayout.f887n, c2Var)) {
            coordinatorLayout.f887n = c2Var;
            boolean z3 = c2Var.d() > 0;
            coordinatorLayout.f888o = z3;
            coordinatorLayout.setWillNotDraw(!z3 && coordinatorLayout.getBackground() == null);
            if (!z1Var.o()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = coordinatorLayout.getChildAt(i4);
                    WeakHashMap weakHashMap = v0.f22405a;
                    if (childAt.getFitsSystemWindows() && ((p3.e) childAt.getLayoutParams()).f31147a != null && z1Var.o()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c2Var;
    }

    @Override // com.google.android.gms.internal.ads.qv0
    public void k(int i4, long j) {
        ((ua.e) this.f30011b).f35237h.b(i4, System.currentTimeMillis() - j);
    }

    public void l() {
        ((u0.t) this.f30011b).getClass();
    }

    @Override // wi.b
    public void m() {
        i.g gVarN = ((th.f) this.f30011b).n();
        if (com.liuzh.deviceinfo.utilities.d.l(gVarN)) {
            return;
        }
        Toast.makeText(gVarN, R.string.failed, 0).show();
    }

    public String n(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            ye.d dVar = (ye.d) this.f30011b;
            ye.e eVar = new ye.e(stringWriter, dVar.f37577a, dVar.f37578b, dVar.f37579c, dVar.f37580d);
            eVar.h(obj);
            eVar.j();
            eVar.f37582b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public km.i o() {
        return new km.i(4, ((i0.u) this.f30011b).g());
    }

    @Override // wi.b
    public void onSuccess() {
        th.f fVar = (th.f) this.f30011b;
        i.g gVarN = fVar.n();
        if (com.liuzh.deviceinfo.utilities.d.l(gVarN)) {
            return;
        }
        if (fVar.f34612b0 != null) {
            Toast.makeText(gVarN, R.string.appi_save_successful, 0).show();
        } else {
            nk.k.k("opUtil");
            throw null;
        }
    }

    public void p(float f10, float f11, float f12, float f13) {
        i0.f fVar = (i0.f) this.f30011b;
        p1.q qVarX = fVar.x();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.E() >> 32)) - (f12 + f10);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.E() & 4294967295L)) - (f13 + f11)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            p1.c0.a("Width and height must be greater than or equal to zero");
        }
        fVar.R(jFloatToRawIntBits);
        qVarX.j(f10, f11);
    }

    @Override // pi.i
    public void r() {
        switch (this.f30010a) {
            case 8:
                SplashActivity splashActivity = (SplashActivity) this.f30011b;
                ((ViewGroup) splashActivity.findViewById(android.R.id.content)).setAlpha(0.0f);
                splashActivity.f32744a.a(new jg.n(1, this));
                break;
            default:
                rh.e eVar = (rh.e) ((fb.r) this.f30011b).f23968c;
                ((ViewGroup) eVar.f32959h.findViewById(android.R.id.content)).setAlpha(0.0f);
                eVar.f32959h.f32744a.a(new jg.n(2, this));
                break;
        }
    }

    @Override // pi.i
    public void t(String str) {
        switch (this.f30010a) {
            case 8:
                SplashActivity splashActivity = (SplashActivity) this.f30011b;
                int i4 = SplashActivity.K;
                splashActivity.E(300L, false);
                break;
            default:
                SplashActivity splashActivity2 = ((rh.e) ((fb.r) this.f30011b).f23968c).f32959h;
                int i10 = SplashActivity.K;
                splashActivity2.F(false);
                break;
        }
    }

    public void u(float f10, float f11, long j) {
        p1.q qVarX = ((i0.f) this.f30011b).x();
        int i4 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        qVarX.j(Float.intBitsToFloat(i4), Float.intBitsToFloat(i10));
        qVarX.a(f10, f11);
        qVarX.j(-Float.intBitsToFloat(i4), -Float.intBitsToFloat(i10));
    }

    @Override // o.x
    public boolean v(o.m mVar) {
        p.k kVar = (p.k) this.f30011b;
        if (mVar == kVar.f30727c) {
            return false;
        }
        ((o.e0) mVar).A.getClass();
        kVar.getClass();
        o.x xVar = kVar.f30729e;
        if (xVar != null) {
            return xVar.v(mVar);
        }
        return false;
    }

    public void w(float f10, float f11) {
        ((i0.f) this.f30011b).x().j(f10, f11);
    }

    public /* synthetic */ d0(int i4, Object obj) {
        this.f30010a = i4;
        this.f30011b = obj;
    }

    public d0(boolean z3) {
        this.f30010a = 12;
        this.f30011b = new AtomicBoolean(z3);
    }

    public d0() {
        this.f30010a = 10;
        nk.k.e(TimeUnit.MINUTES, "timeUnit");
        ul.d dVar = ul.d.f35543l;
        nk.k.e(dVar, "taskRunner");
        this.f30011b = new t0(dVar);
    }

    public d0(TextView textView) {
        this.f30010a = 20;
        this.f30011b = new y4.h(textView);
    }

    public d0(th.f fVar, String str) {
        this.f30010a = 14;
        this.f30011b = fVar;
    }

    private final void q() {
    }

    private final void s() {
    }

    @Override // ki.l
    public void c(boolean z3) {
    }
}
