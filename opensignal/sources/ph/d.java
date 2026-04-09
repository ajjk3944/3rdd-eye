package ph;

import android.net.Uri;
import com.google.android.exoplayer2.source.MediaSourceEventListener;

/* loaded from: classes.dex */
public final class d implements oh.c {

    /* renamed from: a, reason: collision with root package name */
    public final MediaSourceEventListener.LoadEventInfo f20559a;

    public d(MediaSourceEventListener.LoadEventInfo loadEventInfo) {
        br.l.e(loadEventInfo, "loadEventInfoDelegate");
        this.f20559a = loadEventInfo;
    }

    @Override // oh.c
    public final long A() {
        return this.f20559a.loadDurationMs;
    }

    @Override // oh.c
    public final long N() {
        return this.f20559a.elapsedRealtimeMs;
    }

    @Override // oh.c
    public final oh.j b() {
        Uri uri = (Uri) this.f20559a.dataSpec.f17422f;
        br.l.d(uri, "uri");
        return new oh.j(uri);
    }

    @Override // oh.c
    public final long w() {
        return this.f20559a.bytesLoaded;
    }
}
