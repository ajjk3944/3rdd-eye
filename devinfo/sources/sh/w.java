package sh;

import android.location.GpsStatus;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w implements GpsStatus.NmeaListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f33775a;

    public w(a0 a0Var) {
        this.f33775a = a0Var;
    }

    @Override // android.location.GpsStatus.NmeaListener
    public final void onNmeaReceived(long j, String str) {
        this.f33775a.l0(str);
    }
}
