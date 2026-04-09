package mn;

import com.staircase3.opensignal.viewcontrollers.TabCoverage;
import io.sentry.h4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements pm.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TabCoverage f16887a;

    public /* synthetic */ a(TabCoverage tabCoverage) {
        this.f16887a = tabCoverage;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, lq.h] */
    @Override // pm.a
    public void b(String str) {
        TabCoverage tabCoverage = this.f16887a;
        tabCoverage.C0.setVisibility(8);
        ArrayList arrayListN0 = TabCoverage.n0(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListN0.iterator();
        while (it.hasNext()) {
            sm.d dVar = (sm.d) it.next();
            cj.a aVarG = sm.f.G(dVar.f22120c);
            if (aVarG != null) {
                String str2 = (String) aVarG.f3977x;
                String str3 = (String) aVarG.f3976r;
                String str4 = (String) aVarG.f3974d;
                if (str4 != null && !str4.isEmpty()) {
                    dVar.f22121d = str4;
                }
                if (str3 != null && !str3.isEmpty()) {
                    dVar.f22118a = str3;
                }
                if (str2 != null && !str2.isEmpty()) {
                    dVar.f22119b = str2;
                }
            } else {
                arrayList.add(Integer.valueOf(dVar.f22120c));
            }
        }
        tm.g gVarM0 = tabCoverage.m0(false);
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                try {
                    Objects.toString(arrayList.get(i10));
                    arrayList.size();
                } catch (Exception unused) {
                }
            }
            ((com.staircase3.opensignal.utils.a) tabCoverage.N0.getValue()).b(arrayList.size(), "tab_coverage", "query_unknown_logos", "");
            uk.c cVar = new uk.c((el.b) tabCoverage.O0.getValue(), gVarM0, false, new h4(tabCoverage, arrayListN0, arrayList, 6));
            tabCoverage.H0.add(cVar);
            cVar.execute(new Void[0]);
        }
        tabCoverage.z0(arrayListN0);
    }
}
