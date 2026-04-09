package n8;

import A9.C0583j;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import i8.C4461a;
import java.util.Map;
import kotlin.jvm.internal.l;
import r5.k;
import w9.i;

/* compiled from: RemoteConfig.kt */
/* loaded from: classes3.dex */
public final class d<TResult> implements OnCompleteListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f44411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f44412c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f44413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0583j f44414e;

    public d(f fVar, long j4, boolean z10, C0583j c0583j) {
        this.f44411b = fVar;
        this.f44412c = j4;
        this.f44413d = z10;
        this.f44414e = c0583j;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<Boolean> fetch) {
        String message;
        l.f(fetch, "fetch");
        i<Object>[] iVarArr = f.f44419e;
        f fVar = this.f44411b;
        fVar.g().g("RemoteConfig: Fetch success: " + fetch.isSuccessful(), new Object[0]);
        StartupPerformanceTracker.f37057b.getClass();
        StartupPerformanceTracker startupPerformanceTrackerA = StartupPerformanceTracker.a.a();
        if (fetch.isSuccessful()) {
            message = "success";
        } else {
            Exception exception = fetch.getException();
            if (exception == null || (message = exception.getMessage()) == null) {
                message = "Fail";
            }
        }
        StartupPerformanceTracker.StartupData startupData = startupPerformanceTrackerA.f37059a;
        if (startupData != null) {
            startupData.setRemoteConfigResult(message);
        }
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        boolean zIsSuccessful = fetch.isSuccessful();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f44412c;
        C4461a c4461a = eVarA.f37021k;
        Object systemService = c4461a.f38483a.getSystemService("connectivity");
        l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        c4461a.s("RemoteGetConfig", G0.d.a(new b9.l("success", Boolean.valueOf(zIsSuccessful)), new b9.l("latency", Long.valueOf(jCurrentTimeMillis)), new b9.l("has_connection", Boolean.valueOf(activeNetworkInfo != null ? activeNetworkInfo.isConnected() : false))));
        if (this.f44413d && fetch.isSuccessful()) {
            r5.e eVar = fVar.f44420a;
            if (eVar == null) {
                l.l("firebaseRemoteConfig");
                throw null;
            }
            for (Map.Entry entry : eVar.a().entrySet()) {
                fVar.g().g("    RemoteConfig: " + entry.getKey() + " = " + ((k) entry.getValue()).b() + " source: " + ((k) entry.getValue()).a(), new Object[0]);
            }
        }
        C0583j c0583j = this.f44414e;
        if (c0583j.isActive()) {
            c0583j.resumeWith(Boolean.valueOf(fetch.isSuccessful()));
        }
        fVar.f44423d = true;
        StartupPerformanceTracker.f37057b.getClass();
        StartupPerformanceTracker.StartupData startupData2 = StartupPerformanceTracker.a.a().f37059a;
        if (startupData2 != null) {
            startupData2.setRemoteConfigEndTimestamp(System.currentTimeMillis());
        }
    }
}
