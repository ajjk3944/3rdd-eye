package com.staircase3.opensignal.goldstar.testshistory;

import al.f;
import am.b;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import br.l;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.material.tabs.TabLayout;
import i.j;
import java.lang.reflect.InvocationTargetException;
import jm.a;
import kg.r;
import kotlin.Metadata;
import o4.j0;
import qk.h;
import qk.i;
import zb.c;
import zb.d;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/staircase3/opensignal/goldstar/testshistory/TestHistoryActivity;", "Li/j;", "Ljm/a;", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TestHistoryActivity extends j implements a {
    public static final /* synthetic */ int W = 0;
    public r T;
    public c U;
    public int V;

    @Override // i.j, c.l, g3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InterruptedException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View viewA;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(i.activity_testhistory, (ViewGroup) null, false);
        int i10 = h.testHistoryTabs;
        TabLayout tabLayout = (TabLayout) b4.A(viewInflate, i10);
        if (tabLayout != null) {
            i10 = h.testHistoryViewPager;
            ViewPager viewPager = (ViewPager) b4.A(viewInflate, i10);
            if (viewPager != null && (viewA = b4.A(viewInflate, (i10 = h.toolbar_include))) != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                this.T = new r(coordinatorLayout, tabLayout, viewPager, f.a(viewA));
                setContentView(coordinatorLayout);
                r rVar = this.T;
                if (rVar == null) {
                    l.l("binding");
                    throw null;
                }
                CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) rVar.f14395a;
                l.d(coordinatorLayout2, "getRoot(...)");
                kc.f.j(coordinatorLayout2);
                r rVar2 = this.T;
                if (rVar2 == null) {
                    l.l("binding");
                    throw null;
                }
                Toolbar toolbar = ((f) rVar2.f14398r).f844a;
                toolbar.setTitle("");
                toolbar.setSubtitle("");
                toolbar.setNavigationIcon(qk.f.ic_arrow_back_white_36dp);
                ((TextView) toolbar.findViewById(h.toolbarTitle)).setText(getString(qk.l.history_tool_bar));
                w(toolbar);
                xu.l lVarN = n();
                if (lVarN != null) {
                    lVarN.S(true);
                }
                toolbar.setNavigationOnClickListener(new b(14, this));
                r rVar3 = this.T;
                if (rVar3 == null) {
                    l.l("binding");
                    throw null;
                }
                ViewPager viewPager2 = (ViewPager) rVar3.f14397g;
                j0 j0VarO = o();
                l.d(j0VarO, "getSupportFragmentManager(...)");
                viewPager2.setAdapter(new jm.f(this, j0VarO));
                r rVar4 = this.T;
                if (rVar4 == null) {
                    l.l("binding");
                    throw null;
                }
                ((TabLayout) rVar4.f14396d).setupWithViewPager((ViewPager) rVar4.f14397g);
                c cVar = c.f26814e;
                this.U = cVar;
                this.V = cVar.b(this, d.f26816a);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // i.j
    public final boolean v() {
        j().b();
        return true;
    }
}
