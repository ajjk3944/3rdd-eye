package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.a1;
import androidx.media3.common.e1;
import d5.e0;
import d5.v0;
import o5.h1;

/* loaded from: classes.dex */
public abstract class b0 {
    private r5.d bandwidthMeter;
    private a0 listener;

    public final r5.d getBandwidthMeter() {
        r5.d dVar = this.bandwidthMeter;
        a5.a.j(dVar);
        return dVar;
    }

    public abstract e1 getParameters();

    public void init(a0 a0Var, r5.d dVar) {
        this.listener = a0Var;
        this.bandwidthMeter = dVar;
    }

    public final void invalidate() {
        a0 a0Var = this.listener;
        if (a0Var != null) {
            ((e0) a0Var).D.e(10);
        }
    }

    public abstract boolean isSetParametersSupported();

    public abstract void onSelectionActivated(Object obj);

    public void release() {
        this.listener = null;
        this.bandwidthMeter = null;
    }

    public abstract c0 selectTracks(v0[] v0VarArr, h1 h1Var, o5.z zVar, a1 a1Var);

    public abstract void setAudioAttributes(androidx.media3.common.f fVar);

    public abstract void setParameters(e1 e1Var);
}
