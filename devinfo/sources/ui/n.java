package ui;

import android.content.pm.ProviderInfo;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final ProviderInfo f35439a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35440b = false;

    public n(ProviderInfo providerInfo) {
        this.f35439a = providerInfo;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ProviderInfo providerInfo;
        n nVar = (n) obj;
        ProviderInfo providerInfo2 = this.f35439a;
        if (providerInfo2 == null || nVar == null || (providerInfo = nVar.f35439a) == null) {
            return 0;
        }
        return providerInfo2.name.compareToIgnoreCase(providerInfo.name);
    }
}
