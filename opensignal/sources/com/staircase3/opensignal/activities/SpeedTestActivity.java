package com.staircase3.opensignal.activities;

import al.f;
import am.b;
import am.d;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import br.l;
import com.google.android.gms.internal.measurement.b4;
import com.staircase3.opensignal.viewcontrollers.Tab_SpeedTest;
import i.j;
import io.sentry.internal.debugmeta.c;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import o4.j0;
import qk.h;
import qk.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/staircase3/opensignal/activities/SpeedTestActivity;", "Li/j;", "Lcom/staircase3/opensignal/viewcontrollers/Tab_SpeedTest$OnSpeedTestStateChangeListener;", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpeedTestActivity extends j implements Tab_SpeedTest.OnSpeedTestStateChangeListener {
    public static final /* synthetic */ int W = 0;
    public boolean T;
    public Tab_SpeedTest U;
    public c V;

    @Override // i.j, c.l, g3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View viewA;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(i.activity_speedtest, (ViewGroup) null, false);
        int i10 = h.fragment_holder;
        if (((FrameLayout) b4.A(viewInflate, i10)) == null || (viewA = b4.A(viewInflate, (i10 = h.toolbar_include))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
        }
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        this.V = new c(linearLayout, 2, f.a(viewA));
        setContentView(linearLayout);
        c cVar = this.V;
        if (cVar == null) {
            l.l("binding");
            throw null;
        }
        LinearLayout linearLayout2 = (LinearLayout) cVar.f12353d;
        l.d(linearLayout2, "getRoot(...)");
        kc.f.j(linearLayout2);
        c cVar2 = this.V;
        if (cVar2 == null) {
            l.l("binding");
            throw null;
        }
        Toolbar toolbar = ((f) cVar2.f12354g).f844a;
        toolbar.setTitle("");
        toolbar.setSubtitle("");
        ((TextView) toolbar.findViewById(h.toolbarTitle)).setText(getString(qk.l.speed_test_tool_bar));
        w(toolbar);
        xu.l lVarN = n();
        if (lVarN != null) {
            lVarN.T();
        }
        toolbar.setNavigationOnClickListener(new b(22, this));
        this.U = new Tab_SpeedTest();
        j().a(this, new d(4, this));
        Tab_SpeedTest tab_SpeedTest = this.U;
        if (isFinishing() || isDestroyed() || tab_SpeedTest == null) {
            return;
        }
        j0 j0VarO = o();
        j0VarO.getClass();
        o4.a aVar = new o4.a(j0VarO);
        aVar.g(h.fragment_holder, tab_SpeedTest, null, 1);
        aVar.f(true, true);
    }

    @Override // i.j, android.app.Activity
    public final void onPause() {
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(128);
        }
        Tab_SpeedTest tab_SpeedTest = this.U;
        if (tab_SpeedTest != null) {
            tab_SpeedTest.N0 = null;
            tab_SpeedTest.j0(Tab_SpeedTest.V0);
        }
        super.onPause();
    }

    @Override // i.j, android.app.Activity
    public final void onResume() {
        super.onResume();
        Tab_SpeedTest tab_SpeedTest = this.U;
        if (tab_SpeedTest != null) {
            tab_SpeedTest.N0 = this;
            tab_SpeedTest.j0(Tab_SpeedTest.V0);
        }
        Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
    }
}
