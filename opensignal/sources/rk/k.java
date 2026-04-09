package rk;

import android.content.Intent;
import com.google.android.gms.internal.measurement.h4;
import com.staircase3.opensignal.activities.SpeedTestActivity;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import lq.b0;

/* loaded from: classes.dex */
public final class k implements jm.b {

    /* renamed from: a, reason: collision with root package name */
    public final jm.e f21636a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f21637b;

    /* renamed from: c, reason: collision with root package name */
    public final o2.g f21638c;

    /* renamed from: d, reason: collision with root package name */
    public final oh.p f21639d;

    /* renamed from: e, reason: collision with root package name */
    public final h4 f21640e;

    public k(jm.e eVar, Executor executor, o2.g gVar, oh.p pVar) {
        br.l.e(executor, "executor");
        this.f21636a = eVar;
        this.f21637b = executor;
        this.f21638c = gVar;
        this.f21639d = pVar;
        this.f21640e = new h4(7);
    }

    @Override // jm.b
    public final int a() {
        return qk.d.complementary_2;
    }

    @Override // jm.b
    public final void b(ArrayList arrayList) {
        br.l.e(arrayList, "displayedItems");
        this.f21637b.execute(new io.sentry.cache.e(this, 25, arrayList));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lq.h] */
    @Override // jm.b
    public final void c() {
        jm.e eVar = this.f21636a;
        i.j jVarL = eVar.l();
        if (jVarL != null) {
            com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) eVar.A0.getValue(), "history", "button_click", "run_speedtest", 8);
            int i10 = SpeedTestActivity.W;
            Intent intent = new Intent(jVarL, (Class<?>) SpeedTestActivity.class);
            intent.addFlags(1073741824);
            jVarL.startActivity(intent);
            jVarL.finish();
        }
    }

    @Override // jm.b
    public final int d() {
        return qk.l.speed_test_button_text;
    }

    @Override // jm.b
    public final void start() {
        new j(this).execute(new b0[0]);
    }
}
