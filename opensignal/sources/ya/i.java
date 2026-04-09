package ya;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;

/* loaded from: classes.dex */
public final class i implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f26074a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f26075b;

    public i(Context context, ca.i iVar) {
        io.sentry.k kVar = new io.sentry.k(context, (String) null, (pb.u0) null);
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, (c0) DashMediaSource.Factory.class.asSubclass(c0.class).getConstructor(pb.m.class).newInstance(kVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (c0) Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(c0.class).getConstructor(pb.m.class).newInstance(kVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (c0) HlsMediaSource.Factory.class.asSubclass(c0.class).getConstructor(pb.m.class).newInstance(kVar));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (c0) Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(c0.class).getConstructor(null).newInstance(null));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new n0(kVar, iVar));
        this.f26074a = sparseArray;
        this.f26075b = new int[sparseArray.size()];
        for (int i10 = 0; i10 < this.f26074a.size(); i10++) {
            this.f26075b[i10] = this.f26074a.keyAt(i10);
        }
    }
}
