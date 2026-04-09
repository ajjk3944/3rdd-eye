package f5;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import lf.t1;
import oe.h1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final AudioAttributes f8443a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int[] a() {
        oe.f0 f0Var = oe.h0.f19336d;
        oe.e0 e0Var = new oe.e0();
        h1 it = b.f8447e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f8443a)) {
                e0Var.a(num);
            }
        }
        e0Var.a(2);
        return t1.H(e0Var.d());
    }

    public static int b(int i10, int i11) {
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(a5.d0.m(i12)).build(), f8443a)) {
                return i12;
            }
        }
        return 0;
    }
}
