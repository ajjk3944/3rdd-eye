package com.staircase3.opensignal.goldstar.loadingconfig;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import br.t;
import com.google.android.gms.internal.measurement.h4;
import dd.c;
import dd.d;
import dd.m;
import dd.r;
import e5.w;
import i.j;
import io.sentry.android.core.u0;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kc.f;
import kg.q;
import kotlin.Metadata;
import oh.p;
import pg.g;
import pg.h;
import qk.i;
import r3.b;
import rl.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/staircase3/opensignal/goldstar/loadingconfig/LoadConfigActivity;", "Li/j;", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LoadConfigActivity extends j {
    public static final /* synthetic */ int X = 0;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    public LoadConfigActivity() {
        lq.j jVar = lq.j.SYNCHRONIZED;
        this.T = f.E(jVar, new a(this, 0));
        this.U = f.E(jVar, new a(this, 1));
        this.V = f.E(jVar, new a(this, 2));
        this.W = f.E(jVar, new a(this, 3));
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, lq.h] */
    @Override // i.j, c.l, g3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (((ch.f) this.V.getValue()).a()) {
            (Build.VERSION.SDK_INT >= 31 ? new b(this) : new p(8, this)).C();
        }
        setContentView(i.activity_loading_config);
        q qVar = new q(new t(), 7, this);
        el.b bVar = (el.b) this.W.getValue();
        bVar.getClass();
        og.b bVar2 = bVar.f8204b;
        if (bVar2 != null) {
            h hVar = bVar2.f19434g;
            long j = hVar.f20520g.f20550a.getLong("minimum_fetch_interval_in_seconds", h.f20513i);
            HashMap map = new HashMap(hVar.f20521h);
            map.put("X-Firebase-RC-Fetch-Type", g.BASE.getValue() + "/1");
            r rVarK = hVar.f20518e.b().f(hVar.f20516c, new w(hVar, j, map, 2)).k(cf.j.INSTANCE, new u0(28)).k(bVar2.f19430c, new og.a(bVar2));
            h4 h4Var = rVarK.f7319b;
            el.a aVar = new el.a(bVar, qVar);
            dd.p pVar = dd.i.f7295a;
            m mVar = new m((Executor) pVar, (c) aVar);
            h4Var.o(mVar);
            dd.q.i(this).j(mVar);
            rVarK.q();
            m mVar2 = new m((Executor) pVar, (d) new el.a(bVar, qVar));
            h4Var.o(mVar2);
            dd.q.i(this).j(mVar2);
            rVarK.q();
        }
    }
}
