package E3;

import com.applovin.impl.a7;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.vungle.ads.C4055m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1374b;

    public /* synthetic */ a(int i) {
        this.f1374b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1374b) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.f22439a;
                break;
            case 1:
                a7.c();
                break;
            default:
                C4055m.m119init$lambda1$lambda0();
                break;
        }
    }
}
