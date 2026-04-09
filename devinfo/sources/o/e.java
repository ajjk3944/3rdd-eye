package o;

import al.i1;
import al.z0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.applovin.impl.j9;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.google.android.gms.internal.ads.hl;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.qz;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.splash.SplashActivity;
import com.liuzh.deviceinfo.tests.TestesActivity;
import e4.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p.c2;
import p.k3;
import p.r3;
import p.v2;
import pf.c1;
import pf.x0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements c2, k, rf.b, pa.o, r5.d, e4.s, mg.a, f.b, v2, m00, MediaViewListener, u8.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30194a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30195b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f30194a = i4;
        this.f30195b = obj;
    }

    @Override // pa.o
    public void a(hl hlVar) {
        qh.f fVar = (qh.f) ((km.y) this.f30195b).f28522b;
        fVar.f32398i.j(Boolean.TRUE);
        fVar.f32395e.j(hg.e.e(R.string.color_appled));
        zh.b bVar = fVar.f32394d;
        if (bVar != null) {
            com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
            com.liuzh.deviceinfo.utilities.f.f21257c.edit().putInt("themes_primary_color", bVar.f38285b).putInt("themes_accent_color", bVar.f38286c).apply();
            com.liuzh.deviceinfo.utilities.f.k("observer_recreate_notifier", !r8.getBoolean("observer_recreate_notifier", false));
            return;
        }
        int i4 = fVar.f32393c;
        if (i4 != -1) {
            if (fVar.f32392b) {
                com.liuzh.deviceinfo.utilities.f fVar3 = com.liuzh.deviceinfo.utilities.f.f21256b;
                com.liuzh.deviceinfo.utilities.f.l(i4, "themes_primary_color");
                com.liuzh.deviceinfo.utilities.f.k("observer_recreate_notifier", !com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("observer_recreate_notifier", false));
            } else {
                com.liuzh.deviceinfo.utilities.f fVar4 = com.liuzh.deviceinfo.utilities.f.f21256b;
                com.liuzh.deviceinfo.utilities.f.l(i4, "themes_accent_color");
                com.liuzh.deviceinfo.utilities.f.k("observer_recreate_notifier", !com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("observer_recreate_notifier", false));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(bl.j r5, ek.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof t5.k
            if (r0 == 0) goto L13
            r0 = r6
            t5.k r0 = (t5.k) r0
            int r1 = r0.f34249c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34249c = r1
            goto L18
        L13:
            t5.k r0 = new t5.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f34247a
            int r1 = r0.f34249c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            ci.b.D(r6)
            ac.m r5 = new ac.m
            r5.<init>()
            throw r5
        L32:
            ci.b.D(r6)
            java.lang.Object r6 = r4.f30195b
            al.i1 r6 = (al.i1) r6
            r0.f34249c = r2
            r6.a(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.b(bl.j, ek.c):void");
    }

    @Override // mg.a
    public void c() {
        ((j9) this.f30195b).run();
    }

    @Override // mg.a
    public void d() {
        ((j9) this.f30195b).run();
    }

    @Override // p.c2
    public void e(m mVar, MenuItem menuItem) {
        ((g) this.f30195b).f30204f.removeCallbacksAndMessages(mVar);
    }

    @Override // o.k
    public boolean f(m mVar, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        switch (this.f30194a) {
            case 1:
                p.n nVar = ((ActionMenuView) this.f30195b).A;
                if (nVar == null) {
                    return false;
                }
                Toolbar toolbar = (Toolbar) ((nm.d0) nVar).f30011b;
                Iterator it = ((CopyOnWriteArrayList) toolbar.G.f37510c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        k3 k3Var = toolbar.I;
                        zOnMenuItemSelected = k3Var != null ? ((i.d0) ((jf.c) k3Var).f27642b).f25277c.onMenuItemSelected(0, menuItem) : false;
                    } else if (((e4.n) it.next()).a(menuItem)) {
                        zOnMenuItemSelected = true;
                    }
                }
                return zOnMenuItemSelected;
            default:
                return false;
        }
    }

    @Override // p.c2
    public void g(m mVar, o oVar) {
        g gVar = (g) this.f30195b;
        Handler handler = gVar.f30204f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f30205h;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (mVar == ((f) arrayList.get(i4)).f30198b) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            return;
        }
        int i10 = i4 + 1;
        handler.postAtTime(new ab.c(this, i10 < arrayList.size() ? (f) arrayList.get(i10) : null, oVar, mVar, 16, false), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // xj.a
    public Object get() {
        switch (this.f30194a) {
            case 6:
                return new x0((c1) ((rf.d) this.f30195b).get());
            default:
                return new sf.a((Context) ((rf.c) this.f30195b).f32941a);
        }
    }

    @Override // u8.a
    public Object h() {
        r3 r3Var = (r3) this.f30195b;
        return new z7.o((c8.e) r3Var.f30844a, (c8.e) r3Var.f30845b, (c8.e) r3Var.f30846c, (c8.e) r3Var.f30847d, (z7.k) r3Var.f30848e, (z7.k) r3Var.f30849f, (i0.f) r3Var.g);
    }

    @Override // p.v2
    public boolean i(String str) {
        th.i iVar = (th.i) this.f30195b;
        th.f fVar = iVar.f34620a;
        if (!fVar.y() || fVar.C) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        i1 i1Var = iVar.f34621b.f34650d;
        i1Var.getClass();
        i1Var.j(null, str);
        return true;
    }

    @Override // e4.s
    public e4.c2 j(View view, e4.c2 c2Var) {
        switch (this.f30194a) {
            case 11:
                ((SplashActivity) this.f30195b).D.setPadding(0, 0, 0, nh.a.x(c2Var).f35796d);
                break;
            default:
                zh.i.a(((TestesActivity) this.f30195b).B.f32327c, nh.a.x(c2Var));
                break;
        }
        return v0.j(view, c2Var);
    }

    @Override // f.b
    public void k(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f30195b;
        f.a aVar = (f.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f23582b;
        int i4 = com.google.android.gms.internal.play_billing.u.e(intent, "ProxyBillingActivityV2").f34435a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f2996x;
        if (resultReceiver != null) {
            resultReceiver.send(i4, intent == null ? null : intent.getExtras());
        }
        int i10 = aVar.f23581a;
        if (i10 != -1 || i4 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i10 + " and billing's responseCode: " + i4);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // r5.d
    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // r5.d
    public void m(int i4, Object obj) {
        String str;
        switch (i4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i4 == 6 || i4 == 7 || i4 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f30195b).setResultCode(i4);
    }

    public ui.b0 o(int i4) {
        return (ui.b0) ((SparseArray) this.f30195b).get(i4);
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onComplete(MediaView mediaView) {
        bb.t tVar = ((y9.e) this.f30195b).f37381t;
        if (tVar != null) {
            tVar.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.m00
    public /* synthetic */ void p(String str, int i4, String str2, boolean z3) {
        qz qzVar = ((xa.i) this.f30195b).f37046d;
        if (qzVar != null) {
            qzVar.a0();
        }
    }

    @Override // mg.a
    public void q() {
        ((j9) this.f30195b).run();
    }

    public void r(Set set) {
        Object value;
        int[] iArr;
        nk.k.e(set, "tableIds");
        if (set.isEmpty()) {
            return;
        }
        i1 i1Var = (i1) this.f30195b;
        do {
            value = i1Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = set.contains(Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
            }
        } while (!i1Var.i(value, iArr));
    }

    @Override // o.k
    public void s(m mVar) {
        switch (this.f30194a) {
            case 1:
                k kVar = ((ActionMenuView) this.f30195b).f751v;
                if (kVar != null) {
                    kVar.s(mVar);
                    break;
                }
                break;
            default:
                Toolbar toolbar = (Toolbar) this.f30195b;
                p.k kVar2 = toolbar.f818a.f749t;
                if (kVar2 == null || !kVar2.k()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.G.f37510c).iterator();
                    while (it.hasNext()) {
                        ((e4.n) it.next()).d(mVar);
                    }
                }
                o7.c cVar = toolbar.O;
                if (cVar != null) {
                    cVar.s(mVar);
                    break;
                }
                break;
        }
    }

    public re.a t(JSONObject jSONObject) {
        re.b iVar;
        int i4 = jSONObject.getInt("settings_version");
        if (i4 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i4 + ". Using default settings values.", null);
            iVar = new i7.b();
        } else {
            iVar = new j6.i(13);
        }
        return iVar.u((i7.b) this.f30195b, jSONObject);
    }

    public void u(int i4, ui.b0 b0Var) {
        ((SparseArray) this.f30195b).put(i4, b0Var);
    }

    public /* synthetic */ e(d8.h hVar) {
        this.f30194a = 5;
        km.i iVar = new km.i(9, hVar);
        this.f30195b = qd.b.a(new km.y(10, qd.b.a(new i0.f(qd.b.a(new km.o(false, iVar, qd.b.a(new pd.d(iVar, 1)))), qd.b.a(new pd.d(iVar, 0 == true ? 1 : 0)), iVar, 14))));
    }

    public e(byte b10, int i4) {
        Object iVar;
        this.f30194a = i4;
        switch (i4) {
            case 20:
                this.f30195b = new SparseArray();
                break;
            case 21:
                if (Build.VERSION.SDK_INT >= 28) {
                    iVar = new v2.o();
                } else {
                    iVar = new j6.i(21);
                }
                this.f30195b = iVar;
                break;
            case 22:
            case 23:
            default:
                this.f30195b = new AtomicInteger(0);
                break;
            case 24:
                this.f30195b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public e(int i4) {
        this.f30194a = 16;
        this.f30195b = z0.b(new int[i4]);
    }

    @Override // p.v2
    public void n(String str) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onEnterFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onExitFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onFullscreenBackground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onFullscreenForeground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onPause(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onPlay(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onVolumeChange(MediaView mediaView, float f10) {
    }
}
