package rk;

import android.content.Intent;
import com.google.android.gms.internal.measurement.h4;
import com.staircase3.opensignal.goldstar.videotest.test.VideoTestActivity;
import h7.h0;
import h7.r1;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import lq.b0;

/* loaded from: classes.dex */
public final class p implements jm.b {

    /* renamed from: a, reason: collision with root package name */
    public final jm.e f21651a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f21652b;

    /* renamed from: c, reason: collision with root package name */
    public final r1 f21653c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f21654d;

    /* renamed from: e, reason: collision with root package name */
    public final h4 f21655e;

    public p(jm.e eVar, Executor executor, r1 r1Var, h0 h0Var) {
        br.l.e(executor, "executor");
        this.f21651a = eVar;
        this.f21652b = executor;
        this.f21653c = r1Var;
        this.f21654d = h0Var;
        this.f21655e = new h4(7);
    }

    @Override // jm.b
    public final int a() {
        return qk.d.complementary_1;
    }

    @Override // jm.b
    public final void b(ArrayList arrayList) {
        br.l.e(arrayList, "displayedItems");
        this.f21652b.execute(new io.sentry.cache.e(this, 26, arrayList));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lq.h] */
    @Override // jm.b
    public final void c() {
        jm.e eVar = this.f21651a;
        i.j jVarL = eVar.l();
        if (jVarL != null) {
            com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) eVar.A0.getValue(), "history", "button_click", "run_videotest", 8);
            int i10 = VideoTestActivity.f6105h0;
            Intent intent = new Intent(jVarL, (Class<?>) VideoTestActivity.class);
            intent.addFlags(1073741824);
            jVarL.startActivity(intent);
            jVarL.finish();
        }
    }

    @Override // jm.b
    public final int d() {
        return qk.l.video_test_button_text;
    }

    @Override // jm.b
    public final void start() {
        new j(this).execute(new b0[0]);
    }
}
