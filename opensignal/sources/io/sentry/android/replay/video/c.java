package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import br.l;
import br.n;

/* loaded from: classes.dex */
public final class c extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public static final c f12015d = new c(0);

    @Override // ar.a
    public final Object c() {
        boolean z10 = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        l.d(codecInfos, "getCodecInfos(...)");
        int length = codecInfos.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            String name = codecInfos[i10].getName();
            l.d(name, "getName(...)");
            if (tt.l.q0(name, "c2.exynos", false)) {
                z10 = true;
                break;
            }
            i10++;
        }
        return Boolean.valueOf(z10);
    }
}
