package uh;

import android.text.TextUtils;
import dt.w;
import java.util.HashMap;
import nh.l;
import sm.m;

/* loaded from: classes.dex */
public abstract class d extends w {

    /* renamed from: e, reason: collision with root package name */
    public final f f23564e;

    /* renamed from: f, reason: collision with root package name */
    public final f f23565f;

    /* renamed from: g, reason: collision with root package name */
    public final m f23566g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(q3.a r2, qm.c r3, java.lang.String r4, nh.h r5, sm.m r6, wh.a r7) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.d.<init>(q3.a, qm.c, java.lang.String, nh.h, sm.m, wh.a):void");
    }

    @Override // dt.w
    public l d(String str) {
        return TextUtils.isEmpty(str) ? new nh.c() : g(str);
    }

    public final l g(String str) throws Throwable {
        HashMap mapX = this.f23566g.x(str);
        String str2 = (String) mapX.get(Integer.valueOf(this.f23564e.getItag()));
        wh.a aVar = (wh.a) this.f7549d;
        int iA = aVar.a(str2);
        if (iA >= 200 && iA < 299) {
            f fVar = this.f23565f;
            if (fVar == null) {
                return new l(str2);
            }
            String str3 = (String) mapX.get(Integer.valueOf(fVar.getItag()));
            int iA2 = aVar.a(str3);
            if (iA2 >= 200 && iA2 < 299) {
                nh.a aVar2 = new nh.a(str2);
                aVar2.f17549d = str3;
                return aVar2;
            }
        }
        return new nh.c();
    }
}
