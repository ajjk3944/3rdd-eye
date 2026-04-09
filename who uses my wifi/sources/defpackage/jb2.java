package defpackage;

import android.media.AudioFocusRequest;
import android.os.Handler;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jb2 {
    public final k14 a;
    public final Handler b;
    public final in2 c;
    public final AudioFocusRequest d;

    public jb2(k14 k14Var, Handler handler, in2 in2Var) {
        this.b = handler;
        this.c = in2Var;
        this.a = k14Var;
        this.d = new AudioFocusRequest.Builder(1).setAudioAttributes(in2Var.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(k14Var, handler).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb2)) {
            return false;
        }
        jb2 jb2Var = (jb2) obj;
        return equals(jb2Var.a) && Objects.equals(this.b, jb2Var.b) && Objects.equals(this.c, jb2Var.c);
    }

    public final int hashCode() {
        return Objects.hash(1, this.a, this.b, this.c, Boolean.FALSE);
    }
}
