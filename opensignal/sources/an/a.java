package an;

import android.content.Context;
import bf.n;
import bn.b;
import bn.c;
import bn.d;
import br.l;
import com.staircase3.opensignal.utils.r;
import mq.b0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.staircase3.opensignal.utils.a f882a;

    /* renamed from: b, reason: collision with root package name */
    public final ll.a f883b;

    public a(com.staircase3.opensignal.utils.a aVar, ll.a aVar2) {
        l.e(aVar, "analytics");
        l.e(aVar2, "getNetworkTypeUseCase");
        this.f882a = aVar;
        this.f883b = aVar2;
    }

    public final void a(String str) {
        l.e(str, "entityId");
        this.f882a.d("CATEGORY_OSCA", "osca_fix_button_clicked", b0.R(new lq.l("entity_id", str), new lq.l("connection", b())));
    }

    public final String b() {
        ll.a aVar = this.f883b;
        r rVar = aVar.f15542b;
        Context applicationContext = aVar.f15541a.getApplicationContext();
        l.d(applicationContext, "getApplicationContext(...)");
        return aVar.f15543c.b(rVar.a(applicationContext)).f22890a.getId();
    }

    public final void c(d dVar, long j, boolean z10, boolean z11) {
        String str;
        boolean z12;
        l.e(dVar, "result");
        dVar.toString();
        boolean z13 = dVar instanceof bn.a;
        if (z13) {
            str = "error";
        } else if (dVar instanceof b) {
            str = "issues_found";
        } else {
            if (!(dVar instanceof c)) {
                throw new n();
            }
            str = "no_issues";
        }
        int i10 = 0;
        if (z13 || (dVar instanceof b)) {
            z12 = false;
        } else {
            if (!(dVar instanceof c)) {
                throw new n();
            }
            z12 = true;
        }
        if (dVar instanceof b) {
            i10 = ((b) dVar).f2834a.f2745b;
        } else if (!z13 && !(dVar instanceof c)) {
            throw new n();
        }
        this.f882a.d("CATEGORY_OSCA", z11 ? "osca_result_displayed_from_indicator" : "osca_result_displayed", b0.R(new lq.l("entity_id", dVar.a()), new lq.l("connection", b()), new lq.l("result_type", str), new lq.l("result_code", Integer.valueOf(i10)), new lq.l("job_test_duration", Long.valueOf(dVar.b())), new lq.l("ui_test_duration", Long.valueOf(j)), new lq.l("is_passive", Boolean.valueOf(z10)), new lq.l("success", Boolean.valueOf(z12))));
    }

    public final void d() {
        this.f882a.d("CATEGORY_OSCA", "osca_test_started", b0.Q(new lq.l("connection", b())));
    }
}
