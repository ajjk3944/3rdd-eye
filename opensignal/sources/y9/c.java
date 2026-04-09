package y9;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import lf.t1;
import oe.e0;
import oe.f0;
import oe.h0;

/* loaded from: classes.dex */
public abstract class c {
    public static int[] a() {
        f0 f0Var = h0.f19336d;
        e0 e0Var = new e0();
        for (int i10 : d.f25914e) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i10).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                e0Var.a(Integer.valueOf(i10));
            }
        }
        e0Var.a(2);
        return t1.H(e0Var.d());
    }
}
