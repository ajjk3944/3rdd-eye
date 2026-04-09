package com.staircase3.opensignal.viewcontrollers;

import br.l;
import com.staircase3.opensignal.viewcontrollers.TabCoverage;
import java.util.Iterator;
import sm.f;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements uc.a, pm.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6330a;

    public /* synthetic */ a(Object obj) {
        this.f6330a = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lq.h] */
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f6330a
            com.staircase3.opensignal.viewcontrollers.TabCoverage r0 = (com.staircase3.opensignal.viewcontrollers.TabCoverage) r0
            java.lang.Object r1 = r0.O0
            java.lang.Object r1 = r1.getValue()
            el.b r1 = (el.b) r1
            q3.a r2 = r0.f6204y0
            com.google.android.gms.maps.model.CameraPosition r2 = r2.y0()
            float r2 = r2.f5339d
            int r2 = (int) r2
            int r3 = r1.f8206d
            if (r3 > 0) goto L1a
            r3 = 4
        L1a:
            r4 = 11
            int r4 = r4 / r3
            int r3 = r1.f8207e
            r5 = 0
            r6 = 1
            if (r2 >= r4) goto L26
            r2 = r4
        L24:
            r3 = r6
            goto L2b
        L26:
            if (r2 <= r3) goto L2a
            r2 = r3
            goto L24
        L2a:
            r3 = r5
        L2b:
            if (r3 == 0) goto L4d
            q3.a r3 = r0.f6204y0
            com.google.android.gms.maps.model.CameraPosition r3 = r3.y0()
            java.lang.String r4 = "previous must not be null."
            cc.s.i(r3, r4)
            com.google.android.gms.maps.model.LatLng r4 = r3.f5338a
            float r7 = r3.f5340g
            float r3 = r3.f5341r
            float r8 = (float) r2
            q3.a r9 = r0.f6204y0
            com.google.android.gms.maps.model.CameraPosition r10 = new com.google.android.gms.maps.model.CameraPosition
            r10.<init>(r4, r8, r7, r3)
            p.l2 r3 = xu.d.U(r10)
            r9.s0(r3)
        L4d:
            r0.G0 = r2
            int r3 = r1.f8208f
            int r1 = r1.f8209g
            if (r2 >= r3) goto L59
            r0.A0(r5)
            goto L8b
        L59:
            if (r2 <= r1) goto L5f
            r0.A0(r6)
            goto L8b
        L5f:
            al.e r1 = r0.f6203x0
            bm.e r1 = r1.f834d
            java.lang.Object r1 = r1.f2830d
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 8
            r1.setVisibility(r2)
            al.e r1 = r0.f6203x0
            android.widget.RelativeLayout r1 = r1.f839i
            r1.setVisibility(r2)
            al.e r1 = r0.f6203x0
            kg.r r1 = r1.f831a
            java.lang.Object r1 = r1.f14398r
            android.widget.Button r1 = (android.widget.Button) r1
            r1.setEnabled(r6)
            android.content.Context r1 = r0.n()
            int r1 = com.staircase3.opensignal.utils.q.b(r1)
            if (r1 == 0) goto L8b
            r0.u0()
        L8b:
            com.staircase3.opensignal.viewcontrollers.TabCoverage$NetworksForFilters r0 = r0.J0
            r0.f6213b = r6
            r0.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.staircase3.opensignal.viewcontrollers.a.a():void");
    }

    @Override // pm.a
    public void b(String str) {
        TabCoverage.NetworksForFilters networksForFilters = (TabCoverage.NetworksForFilters) this.f6330a;
        TabCoverage.B0(TabCoverage.o0(str));
        Iterator it = networksForFilters.f6214c.iterator();
        while (it.hasNext()) {
            sm.d dVar = (sm.d) it.next();
            cj.a aVarG = f.G(dVar.f22120c);
            if (aVarG != null) {
                String str2 = (String) aVarG.f3974d;
                l.e(str2, "<set-?>");
                dVar.f22121d = str2;
                l.e((String) aVarG.f3975g, "<set-?>");
                String str3 = (String) aVarG.f3976r;
                l.e(str3, "<set-?>");
                dVar.f22118a = str3;
                String str4 = (String) aVarG.f3977x;
                l.e(str4, "<set-?>");
                dVar.f22119b = str4;
                l.e((String) aVarG.f3978y, "<set-?>");
            }
        }
    }
}
