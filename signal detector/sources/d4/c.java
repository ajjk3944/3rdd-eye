package D4;

import B4.q;
import C0.o;
import G3.C0152f;
import N4.m;
import O4.l;
import a4.t;
import android.content.Context;
import android.os.BatteryManager;
import c5.C0412i;
import com.apm.insight.R;
import com.lefan.base.pdf.PdfReadActivity;
import com.lefan.signal.MainActivity;
import com.lefan.signal.ad.FreeAdActivity;
import com.lefan.signal.db.CellInfoZoom;
import com.lefan.signal.db.MacDataBaseRoom;
import com.lefan.signal.db.SquatterRoom;
import com.lefan.signal.network.webSpeed.WebSpeedActivity;
import com.lefan.signal.network.webSpeed.WebSpeedRoom;
import com.lefan.signal.tracroute.TraceDataRoom;
import com.lefan.signal.ui.noise.NoiseActivity;
import com.lefan.signal.ui.noise.NoiseHistoryActivity;
import com.lefan.signal.ui.noise.NoiseZoom;
import com.lefan.signal.ui.other.OtherFragment;
import com.lefan.signal.ui.wifi.PingActivity;
import com.lefan.signal.ui.wifi.SquatterDetailActivity;
import com.lefan.signal.ui.wifi.TraceRouteActivity;
import com.lefan.signal.ui.wifi.WifiFragment;
import com.lefan.signal.view.CellLocationView;
import java.lang.reflect.InvocationTargetException;
import q4.C2857a;
import q5.i;
import t4.C2931b;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements p5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1286b;

    public /* synthetic */ c(int i, Object obj) {
        this.f1285a = i;
        this.f1286b = obj;
    }

    @Override // p5.a
    public final Object b() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        double longProperty;
        int i = 0;
        int i3 = 1;
        switch (this.f1285a) {
            case 0:
                PdfReadActivity pdfReadActivity = (PdfReadActivity) this.f1286b;
                int i6 = PdfReadActivity.f18779T;
                q qVar = new q(pdfReadActivity);
                qVar.f746e = pdfReadActivity.getString(R.string.permission_title);
                qVar.f747f = pdfReadActivity.getString(R.string.permission_write_external_storage_info);
                qVar.i = new d(i);
                qVar.f749h = new b(pdfReadActivity, i3);
                qVar.show();
                return C0412i.f5929a;
            case 1:
                FreeAdActivity freeAdActivity = (FreeAdActivity) this.f1286b;
                int i7 = FreeAdActivity.f18830R;
                return new C2931b(freeAdActivity);
            case 2:
                return MacDataBaseRoom.f18839k.l(((m) this.f1286b).R()).o();
            case 3:
                WebSpeedActivity webSpeedActivity = (WebSpeedActivity) this.f1286b;
                int i8 = WebSpeedActivity.f18847S;
                return WebSpeedRoom.f18852k.n(webSpeedActivity).o();
            case 4:
                return WebSpeedRoom.f18852k.n(((l) this.f1286b).R()).o();
            case 5:
                NoiseActivity noiseActivity = (NoiseActivity) this.f1286b;
                int i9 = NoiseActivity.f18966r0;
                return NoiseZoom.f19045k.h(noiseActivity).o();
            case 6:
                NoiseHistoryActivity noiseHistoryActivity = (NoiseHistoryActivity) this.f1286b;
                int i10 = NoiseHistoryActivity.f19009T;
                return NoiseZoom.f19045k.h(noiseHistoryActivity).o();
            case 7:
                Context contextM = ((OtherFragment) this.f1286b).m();
                double d6 = R2.a.f3389c;
                if (d6 == -1.0d) {
                    if (contextM == null) {
                        d6 = -1.0d;
                    } else {
                        try {
                            try {
                                Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
                                Object objInvoke = cls.getMethod("getBatteryCapacity", null).invoke(cls.getConstructor(Context.class).newInstance(contextM), null);
                                i.c(objInvoke, "null cannot be cast to non-null type kotlin.Double");
                                longProperty = ((Double) objInvoke).doubleValue();
                            } catch (Exception unused) {
                                d6 = -1.0d;
                            }
                        } catch (Exception unused2) {
                            Object systemService = contextM.getSystemService("batterymanager");
                            i.c(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
                            longProperty = ((BatteryManager) systemService).getLongProperty(4);
                        }
                        d6 = longProperty;
                        R2.a.f3389c = d6;
                    }
                }
                return Double.valueOf(d6);
            case 8:
                PingActivity pingActivity = (PingActivity) this.f1286b;
                int i11 = PingActivity.b0;
                return TraceDataRoom.f18855k.s(pingActivity).o();
            case 9:
                SquatterDetailActivity squatterDetailActivity = (SquatterDetailActivity) this.f1286b;
                int i12 = SquatterDetailActivity.f19374R;
                return SquatterRoom.f18842k.m(squatterDetailActivity).o();
            case 10:
                TraceRouteActivity traceRouteActivity = (TraceRouteActivity) this.f1286b;
                int i13 = TraceRouteActivity.f19379c0;
                return TraceDataRoom.f18855k.s(traceRouteActivity).o();
            case 11:
                return MacDataBaseRoom.f18839k.l(((WifiFragment) this.f1286b).R()).o();
            case 12:
                CellLocationView cellLocationView = (CellLocationView) this.f1286b;
                int i14 = CellLocationView.f19493n;
                C0152f c0152f = CellInfoZoom.f18834k;
                Context context = cellLocationView.getContext();
                i.d(context, "getContext(...)");
                CellInfoZoom cellInfoZoom = CellInfoZoom.f18835l;
                if (cellInfoZoom == null) {
                    synchronized (c0152f) {
                        cellInfoZoom = CellInfoZoom.f18835l;
                        if (cellInfoZoom == null) {
                            Context applicationContext = context.getApplicationContext();
                            i.d(applicationContext, "getApplicationContext(...)");
                            o oVarH = t.h(applicationContext, CellInfoZoom.class, "cell_info.db");
                            oVarH.c();
                            oVarH.f1078j = true;
                            CellInfoZoom cellInfoZoom2 = (CellInfoZoom) oVarH.b();
                            CellInfoZoom.f18835l = cellInfoZoom2;
                            cellInfoZoom = cellInfoZoom2;
                        }
                    }
                }
                return cellInfoZoom.o();
            case 13:
                MainActivity mainActivity = (MainActivity) this.f1286b;
                int i15 = MainActivity.f18804V;
                p1.e eVar = C2857a.f23278b;
                Context applicationContext2 = mainActivity.getApplicationContext();
                i.d(applicationContext2, "getApplicationContext(...)");
                return eVar.e(applicationContext2);
            default:
                return this.f1286b;
        }
    }
}
