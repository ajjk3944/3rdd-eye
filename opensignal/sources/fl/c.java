package fl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import br.l;
import com.opensignal.sdk.common.measurements.base.e;
import com.staircase3.opensignal.models.NetworkUiState;
import com.staircase3.opensignal.utils.k;
import com.staircase3.opensignal.utils.o;
import com.staircase3.opensignal.utils.r;
import qm.f;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8988a;

    /* renamed from: b, reason: collision with root package name */
    public final f f8989b;

    /* renamed from: c, reason: collision with root package name */
    public final r f8990c;

    /* renamed from: d, reason: collision with root package name */
    public final o f8991d;

    /* renamed from: e, reason: collision with root package name */
    public final ch.f f8992e;

    /* renamed from: f, reason: collision with root package name */
    public final el.b f8993f;

    /* renamed from: g, reason: collision with root package name */
    public final k f8994g;

    public c(Context context, f fVar, r rVar, o oVar, ch.f fVar2, el.b bVar, k kVar) {
        l.e(context, "context");
        l.e(fVar, "permissionsManager");
        l.e(rVar, "telephonyManagerUtils");
        l.e(oVar, "networkTypeUtils");
        l.e(fVar2, "deviceSdk");
        l.e(bVar, "firebaseManager");
        l.e(kVar, "networkOperatorInfo");
        this.f8988a = context;
        this.f8989b = fVar;
        this.f8990c = rVar;
        this.f8991d = oVar;
        this.f8992e = fVar2;
        this.f8993f = bVar;
        this.f8994g = kVar;
    }

    public final b a() {
        r rVar = this.f8990c;
        Context context = this.f8988a;
        TelephonyManager telephonyManagerA = rVar.a(context);
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        l.c(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        WifiManager wifiManager = (WifiManager) systemService;
        Object systemService2 = context.getSystemService("connectivity");
        l.c(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService2;
        ch.f fVar = this.f8992e;
        e eVar = new e(fVar);
        NetworkUiState networkUiState = new NetworkUiState();
        String str = this.f8993f.F;
        l.e(fVar, "deviceSdk");
        return new b(this.f8988a, telephonyManagerA, connectivityManager, wifiManager, eVar, this.f8992e, networkUiState, this.f8989b, str, fVar.i() ? new ee.f(5) : fVar.h() ? new df.c() : fVar.f() ? new cg.e() : new sm.f(4), this.f8991d, this.f8994g);
    }
}
