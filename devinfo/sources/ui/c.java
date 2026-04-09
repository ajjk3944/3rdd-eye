package ui;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityInfo f35350a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35351b = false;

    /* renamed from: c, reason: collision with root package name */
    public final ComponentName f35352c;

    public c(ActivityInfo activityInfo) {
        this.f35350a = activityInfo;
        this.f35352c = new ComponentName(activityInfo.packageName, activityInfo.name);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        if (cVar != null) {
            return this.f35350a.name.compareToIgnoreCase(cVar.f35350a.name);
        }
        return 0;
    }
}
