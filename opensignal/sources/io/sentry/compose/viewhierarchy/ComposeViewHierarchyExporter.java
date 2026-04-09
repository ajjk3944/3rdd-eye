package io.sentry.compose.viewhierarchy;

import br.l;
import com.google.android.gms.internal.measurement.e5;
import f1.c;
import io.sentry.compose.a;
import io.sentry.protocol.g0;
import io.sentry.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p0.e;
import v1.s;
import x1.f0;
import x1.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;", "Lio/sentry/u0;", "logger", "<init>", "(Lio/sentry/u0;)V", "sentry-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeViewHierarchyExporter {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f12169a;

    /* renamed from: b, reason: collision with root package name */
    public volatile a f12170b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.util.a f12171c;

    public ComposeViewHierarchyExporter(u0 u0Var) {
        l.e(u0Var, "logger");
        this.f12169a = u0Var;
        this.f12171c = new io.sentry.util.a();
    }

    public static void a(a aVar, g0 g0Var, f0 f0Var) {
        if (f0Var.T()) {
            g0 g0Var2 = new g0();
            Iterator it = f0Var.B().iterator();
            while (it.hasNext()) {
                String strA = aVar.a(((s) it.next()).f23805a);
                if (strA != null) {
                    g0Var2.f12563r = strA;
                }
            }
            c cVarJ = e5.j((r) f0Var.D.f822d);
            g0Var2.B = Double.valueOf(cVarJ.f8404a);
            g0Var2.D = Double.valueOf(cVarJ.f8405b);
            g0Var2.f12565y = Double.valueOf(cVarJ.f8407d - r3);
            g0Var2.f12564x = Double.valueOf(cVarJ.f8406c - r2);
            String str = g0Var2.f12563r;
            if (str == null) {
                str = "@Composable";
            }
            g0Var2.f12561d = str;
            if (g0Var.G == null) {
                g0Var.G = new ArrayList();
            }
            List list = g0Var.G;
            l.b(list);
            list.add(g0Var2);
            e eVarH = f0Var.H();
            int i10 = eVarH.f20232g;
            for (int i11 = 0; i11 < i10; i11++) {
                a(aVar, g0Var2, (f0) eVarH.f20230a[i11]);
            }
        }
    }
}
