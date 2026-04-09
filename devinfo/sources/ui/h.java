package ui;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityInfo f35381a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f35382b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f35383c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35384d = false;

    public h(ActivityInfo activityInfo, CharSequence charSequence) {
        this.f35381a = activityInfo;
        this.f35382b = charSequence;
        Bundle bundle = activityInfo.metaData;
        this.f35383c = (bundle == null ? null : bundle.get("android.appwidget.provider")) != null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ActivityInfo activityInfo;
        h hVar = (h) obj;
        ActivityInfo activityInfo2 = this.f35381a;
        if (activityInfo2 == null || hVar == null || (activityInfo = hVar.f35381a) == null) {
            return 0;
        }
        return activityInfo2.name.compareToIgnoreCase(activityInfo.name);
    }
}
