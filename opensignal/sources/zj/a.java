package zj;

import ch.l;
import yi.g;

/* loaded from: classes.dex */
public final class a extends zi.a {
    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        l lVar = l.f3962t5;
        if (lVar.f3830i2 == null) {
            lVar.f3830i2 = new yh.c(lVar.r(), 21);
        }
        yh.c cVar = lVar.f3830i2;
        if (cVar == null) {
            br.l.l("_videoConfigItemMapper");
            throw null;
        }
        if (lVar.f3928x3 == null) {
            lVar.f3928x3 = new z4.d(lVar.r(), 19);
        }
        z4.d dVar = lVar.f3928x3;
        if (dVar == null) {
            br.l.l("_innerTubeConfigMapper");
            throw null;
        }
        if (lVar.f3934y3 == null) {
            lVar.f3934y3 = new g(lVar.r(), 18);
        }
        g gVar = lVar.f3934y3;
        if (gVar != null) {
            super(cVar, dVar, gVar, lVar.r());
        } else {
            br.l.l("_adaptiveConfigMapper");
            throw null;
        }
    }
}
