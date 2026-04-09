package ob;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.l1;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.w1;
import ya.v;

/* loaded from: classes.dex */
public abstract class m {
    private pb.g bandwidthMeter;
    private l listener;

    public final pb.g getBandwidthMeter() {
        pb.g gVar = this.bandwidthMeter;
        gVar.getClass();
        return gVar;
    }

    public final void init(l lVar, pb.g gVar) {
        this.listener = lVar;
        this.bandwidthMeter = gVar;
    }

    public final void invalidate() {
        l lVar = this.listener;
        if (lVar != null) {
            ((f0) lVar).B.c(10);
        }
    }

    public abstract void onSelectionActivated(Object obj);

    public abstract n selectTracks(l1[] l1VarArr, TrackGroupArray trackGroupArray, v vVar, w1 w1Var);
}
