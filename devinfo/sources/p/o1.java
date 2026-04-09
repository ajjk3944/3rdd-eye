package p;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.ads.hh;
import com.google.android.gms.internal.ads.jv;
import com.google.android.gms.internal.ads.ml;
import com.google.android.gms.internal.ads.mp;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.CpuStatusCard;
import com.liuzh.deviceinfo.card.PercentCardGroup;
import com.liuzh.deviceinfo.card.RamUsageCard;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30800b;

    public /* synthetic */ o1(int i4, Object obj) {
        this.f30799a = i4;
        this.f30800b = obj;
    }

    private final void a() {
        ya.c0 c0Var = (ya.c0) this.f30800b;
        if (c0Var.f37403b) {
            if (!(c0Var.p() && c0Var.q()) && ((Boolean) ml.f13931b.u()).booleanValue()) {
                synchronized (c0Var.f37402a) {
                    try {
                        if (Looper.getMainLooper() == null) {
                            return;
                        }
                        if (c0Var.f37406e == null) {
                            c0Var.f37406e = new hh();
                        }
                        c0Var.f37406e.a();
                        za.i.g("start fetching content...");
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        ul.a aVarB;
        long jNanoTime;
        vg.e eVar = null;
        switch (this.f30799a) {
            case 0:
                p1 p1Var = (p1) this.f30800b;
                p1Var.f30815l = null;
                p1Var.drawableStateChanged();
                return;
            case 1:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f30800b;
                if (searchView$SearchAutoComplete.g) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.g = false;
                    return;
                }
                return;
            case 2:
                ((Toolbar) this.f30800b).u();
                return;
            case 3:
                sh.b bVar = (sh.b) this.f30800b;
                bVar.f33639d0 = com.liuzh.deviceinfo.utilities.l.j();
                TextView textView = bVar.f33645j0;
                if (textView != null) {
                    Context context = textView.getContext();
                    TextView textView2 = bVar.f33645j0;
                    StringBuilder sb2 = new StringBuilder();
                    r5.c.r(context, R.string.battery_current, sb2, ": ");
                    sb2.append(com.liuzh.deviceinfo.utilities.b.c(bVar.f33639d0));
                    textView2.setText(sb2.toString());
                }
                sh.b.h0(bVar);
                bVar.f33637b0.postDelayed(this, 1200L);
                return;
            case 4:
                sh.l lVar = (sh.l) this.f30800b;
                if (lVar.c0() || lVar.C || !lVar.y()) {
                    return;
                }
                RamUsageCard ramUsageCard = lVar.f33717a0;
                if (ramUsageCard != null) {
                    ramUsageCard.m();
                }
                CpuStatusCard cpuStatusCard = lVar.f33718b0;
                if (cpuStatusCard != null) {
                    bi.d.c(cpuStatusCard.M0);
                }
                PercentCardGroup percentCardGroup = lVar.f33719c0;
                if (percentCardGroup != null) {
                    percentCardGroup.b();
                }
                lVar.Z.postDelayed(this, 1000L);
                return;
            case 5:
                sh.p0 p0Var = (sh.p0) this.f30800b;
                if (p0Var.c0() || p0Var.C || !p0Var.y() || p0Var.f33750e0 == null) {
                    return;
                }
                vg.c cVar = new vg.c(DeviceInfoApp.f21145f);
                cVar.e();
                p0Var.h0(p0Var.f33750e0, "RAM", cVar, true);
                p0Var.f33752g0.postDelayed(this, 1200L);
                return;
            case 6:
                sh.c1 c1Var = (sh.c1) this.f30800b;
                if (c1Var.c0()) {
                    return;
                }
                if (c1Var.Z != null && c1Var.f33660e0 != null) {
                    ArrayList arrayListD0 = com.liuzh.deviceinfo.utilities.l.d0();
                    int size = arrayListD0.size();
                    vg.e eVar2 = null;
                    float f10 = 0.0f;
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayListD0.get(i4);
                        i4++;
                        vg.e eVar3 = (vg.e) obj;
                        float f11 = eVar3.f36235c;
                        if (f11 > 0.0f) {
                            if (eVar == null || eVar.f36235c < f11) {
                                eVar = eVar3;
                            }
                            if (eVar2 == null || eVar2.f36235c > f11) {
                                eVar2 = eVar3;
                            }
                            f10 += f11;
                        }
                    }
                    if (eVar != null) {
                        vg.e eVar4 = new vg.e(eVar.f36233a, eVar.f36234b, eVar.f36235c);
                        eVar4.f36236d = "Max";
                        arrayListD0.add(0, eVar4);
                        vg.e eVar5 = new vg.e(eVar2.f36233a, eVar2.f36234b, eVar2.f36235c);
                        eVar5.f36236d = "Min";
                        arrayListD0.add(1, eVar5);
                        float size2 = f10 / arrayListD0.size();
                        vg.e eVar6 = new vg.e("Avg.", com.liuzh.deviceinfo.utilities.d.f(size2), size2);
                        eVar6.f36236d = "Avg";
                        arrayListD0.add(2, eVar6);
                    }
                    bi.d.b(new k1.b(18, c1Var, arrayListD0));
                }
                c1Var.f33657b0.postDelayed(this, 2000L);
                return;
            case 7:
                t.z zVar = (t.z) this.f30800b;
                Context contextP = zVar.p();
                if (contextP == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    zVar.f33880r0.h(1);
                    zVar.f33880r0.g(contextP.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 8:
                t7.l lVar2 = (t7.l) this.f30800b;
                t7.a aVar = lVar2.f34471d;
                aVar.n(0);
                t7.c cVar2 = t7.r.f34485k;
                aVar.m(24, cVar2);
                lVar2.c(cVar2);
                return;
            case 9:
                ul.d dVar = (ul.d) this.f30800b;
                synchronized (dVar) {
                    dVar.g++;
                    aVarB = dVar.b();
                }
                if (aVarB == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    ul.a aVar2 = aVarB;
                    try {
                        threadCurrentThread.setName(aVar2.f35530a);
                        Logger logger = ((ul.d) this.f30800b).f35545b;
                        ul.c cVar3 = aVar2.f35532c;
                        nk.k.b(cVar3);
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            me.t1.b(logger, aVar2, cVar3, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jA = aVar2.a();
                            if (zIsLoggable) {
                                me.t1.b(logger, aVar2, cVar3, "finished run in " + me.t1.j(System.nanoTime() - jNanoTime));
                            }
                            ul.d dVar2 = (ul.d) this.f30800b;
                            synchronized (dVar2) {
                                ul.d.a(dVar2, aVar2, jA, true);
                                aVarB = dVar2.b();
                            }
                        } catch (Throwable th2) {
                            if (zIsLoggable) {
                                me.t1.b(logger, aVar2, cVar3, "failed a run in " + me.t1.j(System.nanoTime() - jNanoTime));
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        try {
                            ul.d dVar3 = (ul.d) this.f30800b;
                            synchronized (dVar3) {
                                ul.d.a(dVar3, aVar2, -1L, false);
                                if (!(th3 instanceof InterruptedException)) {
                                    throw th3;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th4) {
                            threadCurrentThread.setName(name);
                            throw th4;
                        }
                    }
                } while (aVarB != null);
                threadCurrentThread.setName(name);
                return;
            case 10:
                va.y yVar = ((va.m2) this.f30800b).f36139a.f36144a;
                if (yVar != null) {
                    try {
                        yVar.p(1);
                        return;
                    } catch (RemoteException e2) {
                        za.i.i("Could not notify onAdFailedToLoad event.", e2);
                        return;
                    }
                }
                return;
            case 11:
                va.y yVar2 = ((va.o2) this.f30800b).f36153a;
                if (yVar2 != null) {
                    try {
                        yVar2.p(1);
                        return;
                    } catch (RemoteException e10) {
                        za.i.i("Could not notify onAdFailedToLoad event.", e10);
                        return;
                    }
                }
                return;
            case 12:
                mp mpVar = ((va.p2) this.f30800b).f36155a;
                if (mpVar != null) {
                    try {
                        mpVar.p3(Collections.EMPTY_LIST);
                        return;
                    } catch (RemoteException e11) {
                        za.i.i("Could not notify onComplete event.", e11);
                        return;
                    }
                }
                return;
            case 13:
                jv jvVar = (jv) this.f30800b;
                if (jvVar != null) {
                    try {
                        jvVar.K1(1);
                        return;
                    } catch (RemoteException e12) {
                        za.i.k("#007 Could not call remote method.", e12);
                        return;
                    }
                }
                return;
            case 14:
                wg.b bVar2 = (wg.b) this.f30800b;
                if (!bVar2.f36640a) {
                    int iJ = com.liuzh.deviceinfo.utilities.l.j();
                    TextView textView3 = bVar2.j;
                    if (textView3 != null) {
                        textView3.setText(com.liuzh.deviceinfo.utilities.b.c(iJ));
                    }
                    float fA = com.liuzh.deviceinfo.utilities.b.a(iJ, bVar2.f36642c);
                    TextView textView4 = bVar2.f36650m;
                    if (textView4 != null) {
                        textView4.setText(String.format(Locale.US, "%.2f W", Float.valueOf(fA)));
                    }
                }
                bVar2.g.postDelayed(this, 1200L);
                return;
            case 15:
                wg.c cVar4 = (wg.c) this.f30800b;
                if (!cVar4.f36640a) {
                    ArrayList arrayListC0 = com.liuzh.deviceinfo.utilities.l.c0();
                    for (int i10 = 0; i10 < arrayListC0.size(); i10++) {
                        vg.b bVar3 = (vg.b) arrayListC0.get(i10);
                        TextView textView5 = (TextView) ((ArrayList) cVar4.f36657f).get(i10);
                        if (textView5 != null) {
                            textView5.setText(bVar3.f36220b);
                        }
                    }
                }
                cVar4.f36655d.postDelayed(this, 1200L);
                return;
            case 16:
                wg.c cVar5 = (wg.c) this.f30800b;
                if (!cVar5.f36640a && ((TextView) cVar5.f36658h) != null) {
                    float fA2 = com.liuzh.deviceinfo.utilities.l.A();
                    if (fA2 > 0.0f) {
                        ((TextView) cVar5.f36658h).setText(((int) fA2) + "MHz");
                    } else {
                        ((TextView) cVar5.f36658h).setText(R.string.failed);
                    }
                }
                cVar5.f36655d.postDelayed(this, 1200L);
                return;
            case 17:
                wg.w wVar = (wg.w) this.f30800b;
                vg.c cVar6 = wVar.f36727e;
                if (!wVar.f36640a) {
                    cVar6.e();
                    if (wVar.f36729h != null) {
                        wVar.f36729h.setText(r5.c.j((int) cVar6.f36225e, "%", new StringBuilder()));
                    }
                    if (wVar.f36730i != null) {
                        String str = String.format(Locale.getDefault(), "%.2fG", Double.valueOf(cVar6.f36222b / 1024.0d));
                        String str2 = String.format(Locale.getDefault(), "%.2fG", Double.valueOf(cVar6.f36224d / 1024.0d));
                        wVar.f36730i.setText(str2 + "/" + str);
                    }
                }
                wVar.f36726d.postDelayed(this, 1200L);
                return;
            case 18:
                xa.b bVar4 = (xa.b) this.f30800b;
                if (bVar4.f37028h) {
                    bVar4.f37024c.finish();
                    return;
                }
                return;
            case 19:
                ((xa.i) this.f30800b).i4();
                return;
            case 20:
                a8.a aVar3 = (a8.a) this.f30800b;
                Thread.currentThread();
                aVar3.getClass();
                aVar3.z();
                return;
            case 21:
                a();
                return;
            case 22:
                Context context2 = (Context) ((yb.e) this.f30800b).f37509b;
                long j = yb.e.B(context2).getLong("app_set_id_last_used_time", -1L);
                long j8 = j != -1 ? j + 33696000000L : -1L;
                if (j8 == -1 || System.currentTimeMillis() <= j8) {
                    return;
                }
                if (!yb.e.B(context2).edit().remove("app_set_id").commit()) {
                    String strValueOf = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context2.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context2.getPackageName());
                Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            default:
                se.b bVar5 = (se.b) this.f30800b;
                bVar5.getClass();
                while (true) {
                    try {
                        bVar5.b((z7.a) ((ReferenceQueue) bVar5.f33558c).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
        }
    }
}
