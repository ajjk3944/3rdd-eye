package kn;

import android.content.Context;
import androidx.lifecycle.p0;
import b9.e;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.staircase3.opensignal.models.NetworkUiState;
import com.staircase3.opensignal.utils.r;
import com.staircase3.opensignal.utils.u;
import com.survicate.surveys.entities.models.ActiveEventHistory;
import cq.n;
import io.sentry.android.core.u0;
import io.sentry.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import lq.q;
import mq.f0;
import mq.o;
import mq.w;
import qm.f;
import so.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14452a;

    /* renamed from: b, reason: collision with root package name */
    public final jn.b f14453b;

    /* renamed from: c, reason: collision with root package name */
    public final f f14454c;

    /* renamed from: d, reason: collision with root package name */
    public final r f14455d;

    /* renamed from: e, reason: collision with root package name */
    public final an.a f14456e;

    /* renamed from: f, reason: collision with root package name */
    public NetworkUiState f14457f;

    /* renamed from: g, reason: collision with root package name */
    public String f14458g;

    /* renamed from: h, reason: collision with root package name */
    public long f14459h;

    /* renamed from: i, reason: collision with root package name */
    public Object f14460i;

    public d(Context context, jn.b bVar, f fVar, r rVar, an.a aVar, fl.c cVar) {
        l.e(context, "context");
        l.e(bVar, "sdkApi");
        l.e(fVar, "permissionsManager");
        l.e(rVar, "telephonyManagerUtils");
        l.e(aVar, "oscaAnalytics");
        l.e(cVar, "networkUiStateDataSourceFactory");
        this.f14452a = context;
        this.f14453b = bVar;
        this.f14454c = fVar;
        this.f14455d = rVar;
        this.f14456e = aVar;
        fl.b bVarA = cVar.a();
        this.f14457f = new NetworkUiState();
        this.f14458g = "";
        this.f14459h = -1L;
        this.f14460i = w.f16945a;
        bVarA.e(new a(0, this));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Set] */
    public static void a(String str) {
        if (!al.c.j()) {
            al.c.k();
            return;
        }
        al.c.f818l.n();
        n nVar = (n) al.c.f818l.f820b;
        nVar.getClass();
        synchronized (nVar.f6645o) {
            try {
                ?? r02 = nVar.f6634b.f9210g;
                Iterable iterable = (Iterable) r02;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((cq.b) it.next()).f6610a.equals(str)) {
                            break;
                        }
                    }
                }
                ((u0) nVar.f6643m).getClass();
                LinkedHashSet linkedHashSetO = f0.O(r02, new cq.b(str, System.currentTimeMillis()));
                g1.f fVar = nVar.f6634b;
                fVar.getClass();
                fVar.f9210g = linkedHashSetO;
                nVar.f6638f.q1(linkedHashSetO, new bp.a(0, nVar, n.class, "challengeSurveys", "challengeSurveys()V", 0, 9));
                nVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Set] */
    public static void c(String str) {
        Object next;
        if (!al.c.j()) {
            al.c.k();
            return;
        }
        al.c.f818l.n();
        n nVar = (n) al.c.f818l.f820b;
        nVar.getClass();
        synchronized (nVar.f6645o) {
            try {
                ?? r02 = nVar.f6634b.f9210g;
                Iterator it = ((Iterable) r02).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((cq.b) next).f6610a.equals(str)) {
                            break;
                        }
                    }
                }
                cq.b bVar = (cq.b) next;
                if (bVar != null) {
                    LinkedHashSet linkedHashSetM = f0.M(r02, bVar);
                    g1.f fVar = nVar.f6634b;
                    fVar.getClass();
                    fVar.f9210g = linkedHashSetM;
                    nVar.f6638f.q1(linkedHashSetM, new bp.a(0, nVar, n.class, "challengeSurveys", "challengeSurveys()V", 0, 10));
                }
                nVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void f(d dVar, Integer num, String str, long j, int i10) throws MissingResourceException {
        Integer num2 = num;
        NetworkUiState networkUiState = dVar.f14457f;
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        if ((i10 & 8) != 0) {
            j = -1;
        }
        dVar.e(networkUiState, num2, str, j);
    }

    public final ArrayList b(NetworkUiState networkUiState, Integer num, String str, long j) throws MissingResourceException {
        int i10;
        String country;
        int iIntValue = num != null ? num.intValue() : networkUiState.B == um.a.WIFI ? 1 : 0;
        String str2 = networkUiState.E;
        String str3 = networkUiState.F;
        String str4 = (String) this.f14453b.f13782c.getValue();
        q qVar = u.f6195a;
        r rVar = this.f14455d;
        Context context = this.f14452a;
        String strD = u.d(context, rVar.a(context));
        try {
            i10 = context.getResources().getConfiguration().mnc;
        } catch (Exception unused) {
            i10 = -1;
        }
        long j7 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        long j10 = j7 % 100;
        long j11 = j10 + (((((-j10) | j10) & (j10 ^ 100)) >> 63) & 100);
        try {
            country = Locale.getDefault().getISO3Country();
        } catch (MissingResourceException unused2) {
            country = Locale.getDefault().getCountry();
        }
        hq.c cVar = new hq.c("device_id_time_sha256", str4);
        hq.c cVar2 = new hq.c("connection_type", Integer.valueOf(iIntValue));
        hq.c cVar3 = new hq.c("country_iso", country);
        hq.c cVar4 = new hq.c("mcc", strD);
        hq.c cVar5 = new hq.c("mnc", Integer.valueOf(i10));
        hq.c cVar6 = new hq.c("ssid", str2);
        hq.c cVar7 = new hq.c("network_name", str3);
        hq.c cVar8 = new hq.c("reason_for_survey", str);
        hq.c cVar9 = new hq.c("user_age", Long.valueOf(j7));
        hq.c cVar10 = new hq.c("time_allocation_group", Long.valueOf(j11));
        this.f14454c.getClass();
        return o.E0(e5.I(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, new hq.c("has_background_location", f.b(context))), j != -1 ? e5.H(new hq.c("task_id", Long.valueOf(j))) : w.f16945a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    public final void d(String str) {
        Object next;
        l.e(str, "entityId");
        c cVar = new c(this, str);
        if (al.c.j()) {
            k kVar = (k) al.c.f818l.f822d;
            kVar.getClass();
            kVar.f12399r = o.F0(kVar.f12399r, cVar);
        } else {
            al.c.k();
        }
        Map map = Collections.EMPTY_MAP;
        if (!al.c.j()) {
            al.c.k();
            return;
        }
        al.c.f818l.n();
        n nVar = (n) al.c.f818l.f820b;
        nVar.getClass();
        l.e(map, "eventProperties");
        synchronized (nVar.f6645o) {
            try {
                ((u0) nVar.f6643m).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                on.k kVar2 = (on.k) nVar.f6637e;
                kVar2.getClass();
                Iterator it = kVar2.f19637a.D().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (l.a(((ActiveEventHistory) next).getEventName(), "event_assistant_result_displayed")) {
                            break;
                        }
                    }
                }
                cq.a aVar = new cq.a("event_assistant_result_displayed", map, jCurrentTimeMillis, (ActiveEventHistory) next);
                nVar.f6635c.f9212x = aVar;
                nVar.j.getClass();
                if (nVar.c(aVar)) {
                    nVar.f6639g.t(aVar);
                }
                nVar.d();
                ((on.k) nVar.f6637e).c(aVar);
                ((g) nVar.f6641i).a(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(NetworkUiState networkUiState, Integer num, String str, long j) throws MissingResourceException {
        l.e(networkUiState, "networkUiState");
        this.f14458g = str;
        this.f14459h = j;
        ArrayList arrayListB = b(networkUiState, num, str, j);
        this.f14460i = arrayListB;
        if (!al.c.j()) {
            al.c.k();
            return;
        }
        e eVar = (e) al.c.f818l.j;
        ((yt.c) eVar.f2481d).c(new p0(15, arrayListB));
    }
}
