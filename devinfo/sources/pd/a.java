package pd;

import android.app.PendingIntent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f31712a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f31713b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f31714c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31715d = false;

    public a(int i4, long j, long j8, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f31712a = i4;
        this.f31713b = pendingIntent;
        this.f31714c = pendingIntent2;
    }

    public final PendingIntent a(k kVar) {
        PendingIntent pendingIntent;
        int i4 = kVar.f31739a;
        if (i4 == 0) {
            PendingIntent pendingIntent2 = this.f31714c;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            return null;
        }
        if (i4 != 1 || (pendingIntent = this.f31713b) == null) {
            return null;
        }
        return pendingIntent;
    }
}
