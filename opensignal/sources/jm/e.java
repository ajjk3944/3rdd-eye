package jm;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import br.l;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.staircase3.opensignal.activities.TowersActivity;
import com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase;
import com.staircase3.opensignal.goldstar.testshistory.TestHistoryActivity;
import com.staircase3.opensignal.utils.o;
import h7.h0;
import h7.r1;
import h7.u;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import lq.h;
import lq.j;
import oh.p;
import qk.i;
import rk.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljm/e;", "Landroidx/fragment/app/b;", "", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e extends androidx.fragment.app.b {
    public final Object A0;
    public final mm.d B0;
    public final mm.d C0;
    public final ExecutorService D0;
    public int E0;

    /* renamed from: w0, reason: collision with root package name */
    public cj.a f13768w0;

    /* renamed from: x0, reason: collision with root package name */
    public a f13769x0;

    /* renamed from: y0, reason: collision with root package name */
    public b f13770y0;

    /* renamed from: z0, reason: collision with root package name */
    public final Object f13771z0;

    public e() {
        j jVar = j.SYNCHRONIZED;
        h hVarE = kc.f.E(jVar, new d(this, 0));
        this.f13771z0 = hVarE;
        this.A0 = kc.f.E(jVar, new d(this, 1));
        this.B0 = new mm.d((o) hVarE.getValue(), 1);
        this.C0 = new mm.d((o) hVarE.getValue(), 0);
        this.D0 = Executors.newCachedThreadPool();
    }

    @Override // androidx.fragment.app.b
    public final void C(Context context) {
        b pVar;
        l.e(context, "context");
        super.C(context);
        Bundle bundle = this.B;
        this.E0 = bundle != null ? bundle.getInt("TestHistoryPage.extras_page_number", 0) : 0;
        Context applicationContext = X().getApplicationContext();
        l.d(applicationContext, "getApplicationContext(...)");
        OpensignalDatabase opensignalDatabaseS = ic.a.s(applicationContext);
        l.b(opensignalDatabaseS);
        androidx.lifecycle.h hVarL = l();
        this.f13769x0 = hVarL instanceof a ? (a) hVarL : null;
        int i10 = this.E0;
        ExecutorService executorService = this.D0;
        if (i10 == 0) {
            bm.d dVarL = opensignalDatabaseS.l();
            l.d(executorService, "threadPoolExecutor");
            pVar = new k(this, executorService, new o2.g(dVarL), new p(11, dVarL));
        } else {
            bm.e eVarN = opensignalDatabaseS.n();
            l.d(executorService, "threadPoolExecutor");
            pVar = new rk.p(this, executorService, new r1(eVarN), new h0(eVarN));
        }
        this.f13770y0 = pVar;
    }

    @Override // androidx.fragment.app.b
    public final View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.e(layoutInflater, "inflater");
        LayoutInflater layoutInflaterJ = this.f1419j0;
        if (layoutInflaterJ == null) {
            layoutInflaterJ = J(null);
            this.f1419j0 = layoutInflaterJ;
        }
        View viewInflate = layoutInflaterJ.inflate(i.fragment_test_history, (ViewGroup) null, false);
        int i10 = qk.h.emptyView;
        Group group = (Group) b4.A(viewInflate, i10);
        if (group != null) {
            i10 = qk.h.emptyViewText;
            if (((TextView) b4.A(viewInflate, i10)) != null) {
                i10 = qk.h.ghost_view;
                if (((AppCompatImageView) b4.A(viewInflate, i10)) != null) {
                    i10 = qk.h.mapFab;
                    FloatingActionButton floatingActionButton = (FloatingActionButton) b4.A(viewInflate, i10);
                    if (floatingActionButton != null) {
                        i10 = qk.h.resultList;
                        RecyclerView recyclerView = (RecyclerView) b4.A(viewInflate, i10);
                        if (recyclerView != null) {
                            i10 = qk.h.runTestButton;
                            Button button = (Button) b4.A(viewInflate, i10);
                            if (button != null) {
                                this.f13768w0 = new cj.a((ConstraintLayout) viewInflate, group, floatingActionButton, recyclerView, button, 5);
                                se.b.W(l(), qk.d.status_bar_background);
                                cj.a aVar = this.f13768w0;
                                if (aVar != null) {
                                    return (ConstraintLayout) aVar.f3974d;
                                }
                                l.l("binding");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.b
    public final void I() {
        if (this.E0 == 0) {
            g0().b((ArrayList) this.B0.f16885g);
        } else {
            g0().b((ArrayList) this.C0.f16885g);
        }
        this.f1410c0 = true;
    }

    @Override // androidx.fragment.app.b
    public final void O() {
        this.f1410c0 = true;
        cj.a aVar = this.f13768w0;
        if (aVar == null) {
            l.l("binding");
            throw null;
        }
        ((Button) aVar.f3978y).setText(r(g0().d()));
        cj.a aVar2 = this.f13768w0;
        if (aVar2 == null) {
            l.l("binding");
            throw null;
        }
        ((Button) aVar2.f3978y).setBackgroundColor(X().getColor(g0().a()));
        g0().start();
    }

    @Override // androidx.fragment.app.b
    public final void S(View view, Bundle bundle) throws Resources.NotFoundException {
        l.e(view, "view");
        cj.a aVar = this.f13768w0;
        if (aVar == null) {
            l.l("binding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) aVar.f3977x;
        recyclerView.setAdapter(this.E0 == 0 ? this.B0 : this.C0);
        u uVar = new u(recyclerView.getContext());
        Drawable drawable = recyclerView.getResources().getDrawable(qk.f.recycle_view_vertical_divider);
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        uVar.f10207a = drawable;
        recyclerView.i(uVar);
        cj.a aVar2 = this.f13768w0;
        if (aVar2 == null) {
            l.l("binding");
            throw null;
        }
        final int i10 = 0;
        ((Button) aVar2.f3978y).setOnClickListener(new View.OnClickListener(this) { // from class: jm.c

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e f13765d;

            {
                this.f13765d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                e eVar = this.f13765d;
                switch (i11) {
                    case 0:
                        eVar.g0().c();
                        return;
                    default:
                        a aVar3 = eVar.f13769x0;
                        if (aVar3 != null) {
                            TestHistoryActivity testHistoryActivity = (TestHistoryActivity) aVar3;
                            int i12 = testHistoryActivity.V;
                            if (i12 == 0) {
                                Intent intent = new Intent(testHistoryActivity, (Class<?>) TowersActivity.class);
                                intent.putExtra("map_type", TowersActivity.b.SPEEDTEST);
                                testHistoryActivity.startActivity(intent);
                                return;
                            }
                            zb.c cVar = testHistoryActivity.U;
                            if (cVar == null) {
                                l.l("googleApiAvailabilityInstance");
                                throw null;
                            }
                            AtomicBoolean atomicBoolean = zb.f.f26819a;
                            if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 9) {
                                testHistoryActivity.finish();
                                return;
                            }
                            if (cVar == null) {
                                l.l("googleApiAvailabilityInstance");
                                throw null;
                            }
                            AlertDialog alertDialogC = cVar.c(testHistoryActivity, i12, 9000, null);
                            if (alertDialogC != null) {
                                alertDialogC.show();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        cj.a aVar3 = this.f13768w0;
        if (aVar3 == null) {
            l.l("binding");
            throw null;
        }
        final int i11 = 1;
        ((FloatingActionButton) aVar3.f3976r).setOnClickListener(new View.OnClickListener(this) { // from class: jm.c

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e f13765d;

            {
                this.f13765d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                e eVar = this.f13765d;
                switch (i112) {
                    case 0:
                        eVar.g0().c();
                        return;
                    default:
                        a aVar32 = eVar.f13769x0;
                        if (aVar32 != null) {
                            TestHistoryActivity testHistoryActivity = (TestHistoryActivity) aVar32;
                            int i12 = testHistoryActivity.V;
                            if (i12 == 0) {
                                Intent intent = new Intent(testHistoryActivity, (Class<?>) TowersActivity.class);
                                intent.putExtra("map_type", TowersActivity.b.SPEEDTEST);
                                testHistoryActivity.startActivity(intent);
                                return;
                            }
                            zb.c cVar = testHistoryActivity.U;
                            if (cVar == null) {
                                l.l("googleApiAvailabilityInstance");
                                throw null;
                            }
                            AtomicBoolean atomicBoolean = zb.f.f26819a;
                            if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 9) {
                                testHistoryActivity.finish();
                                return;
                            }
                            if (cVar == null) {
                                l.l("googleApiAvailabilityInstance");
                                throw null;
                            }
                            AlertDialog alertDialogC = cVar.c(testHistoryActivity, i12, 9000, null);
                            if (alertDialogC != null) {
                                alertDialogC.show();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final b g0() {
        b bVar = this.f13770y0;
        if (bVar != null) {
            return bVar;
        }
        l.l("presenter");
        throw null;
    }

    public final void h0() {
        cj.a aVar = this.f13768w0;
        if (aVar == null) {
            l.l("binding");
            throw null;
        }
        ((Group) aVar.f3975g).setVisibility(0);
        cj.a aVar2 = this.f13768w0;
        if (aVar2 != null) {
            ((RecyclerView) aVar2.f3977x).setVisibility(8);
        } else {
            l.l("binding");
            throw null;
        }
    }

    public final void i0(h4 h4Var) {
        if (h4Var.f5055a) {
            cj.a aVar = this.f13768w0;
            if (aVar != null) {
                ((FloatingActionButton) aVar.f3976r).f(true);
                return;
            } else {
                l.l("binding");
                throw null;
            }
        }
        cj.a aVar2 = this.f13768w0;
        if (aVar2 != null) {
            ((FloatingActionButton) aVar2.f3976r).d(true);
        } else {
            l.l("binding");
            throw null;
        }
    }

    public final void j0() {
        cj.a aVar = this.f13768w0;
        if (aVar == null) {
            l.l("binding");
            throw null;
        }
        ((Group) aVar.f3975g).setVisibility(8);
        cj.a aVar2 = this.f13768w0;
        if (aVar2 != null) {
            ((RecyclerView) aVar2.f3977x).setVisibility(0);
        } else {
            l.l("binding");
            throw null;
        }
    }
}
