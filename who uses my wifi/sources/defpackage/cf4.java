package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cf4 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ pb3 a;

    public cf4(pb3 pb3Var) {
        this.a = pb3Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        bi3 bi3Var;
        za4 za4Var;
        df4 df4Var = (df4) this.a.i;
        if (audioTrack.equals(df4Var.r) && (bi3Var = df4Var.n) != null && df4Var.P && (za4Var = ((ef4) bi3Var.g).L) != null) {
            za4Var.a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        df4 df4Var = (df4) this.a.i;
        if (audioTrack.equals(df4Var.r)) {
            df4Var.O = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        bi3 bi3Var;
        za4 za4Var;
        df4 df4Var = (df4) this.a.i;
        if (audioTrack.equals(df4Var.r) && (bi3Var = df4Var.n) != null && df4Var.P && (za4Var = ((ef4) bi3Var.g).L) != null) {
            za4Var.a();
        }
    }
}
