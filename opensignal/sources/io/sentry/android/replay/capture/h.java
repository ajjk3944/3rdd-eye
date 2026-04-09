package io.sentry.android.replay.capture;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return se.b.n(Long.valueOf(((io.sentry.rrweb.b) obj).f12700d), Long.valueOf(((io.sentry.rrweb.b) obj2).f12700d));
    }
}
