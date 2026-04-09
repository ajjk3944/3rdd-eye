package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a91 {
    public z81 a;

    public a91(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new y81(u0.l(i, interpolator, j));
        } else {
            this.a = new w81(i, interpolator, j);
        }
    }
}
