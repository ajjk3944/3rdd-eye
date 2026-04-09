package t4;

import android.app.PendingIntent;
import java.util.HashMap;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5603a {

    /* renamed from: a, reason: collision with root package name */
    public final int f46398a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46399b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f46400c;

    /* renamed from: d, reason: collision with root package name */
    public final PendingIntent f46401d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f46402e = false;

    public C5603a(int i, int i10, long j4, long j10, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, HashMap map) {
        this.f46398a = i;
        this.f46399b = i10;
        this.f46400c = pendingIntent;
        this.f46401d = pendingIntent2;
    }

    public final PendingIntent a(k kVar) {
        PendingIntent pendingIntent;
        int i = kVar.f46423a;
        if (i == 0) {
            PendingIntent pendingIntent2 = this.f46401d;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            return null;
        }
        if (i != 1 || (pendingIntent = this.f46400c) == null) {
            return null;
        }
        return pendingIntent;
    }
}
