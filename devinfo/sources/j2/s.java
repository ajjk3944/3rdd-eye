package j2;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s extends jf.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f27309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e4.b f27310f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(e4.b bVar, int i4) {
        super(15);
        this.f27309e = i4;
        this.f27310f = bVar;
    }

    @Override // jf.c
    public void b(int i4, f4.f fVar, String str, Bundle bundle) {
        switch (this.f27309e) {
            case 0:
                ((x) this.f27310f).j(i4, fVar, str, bundle);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x081b A[LOOP:9: B:397:0x07fe->B:408:0x081b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0a7c  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0af5  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0c3a  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0c57  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0c84  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x0822 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v20, types: [zj.s] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.ArrayList] */
    @Override // jf.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f4.f h(int r48) {
        /*
            Method dump skipped, instructions count: 3260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.s.h(int):f4.f");
    }

    @Override // jf.c
    public final f4.f k(int i4) {
        switch (this.f27309e) {
            case 0:
                x xVar = (x) this.f27310f;
                if (i4 != 1) {
                    if (i4 == 2) {
                        return h(xVar.f27342l);
                    }
                    throw new IllegalArgumentException(je.u.r(i4, "Unknown focus type: "));
                }
                int i10 = xVar.f27343m;
                if (i10 == Integer.MIN_VALUE) {
                    return null;
                }
                return h(i10);
            default:
                n4.a aVar = (n4.a) this.f27310f;
                int i11 = i4 == 2 ? aVar.f29738k : aVar.f29739l;
                if (i11 == Integer.MIN_VALUE) {
                    return null;
                }
                return h(i11);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0807  */
    @Override // jf.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(int r27, int r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 2346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.s.x(int, int, android.os.Bundle):boolean");
    }
}
