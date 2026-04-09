package com.google.firebase.analytics.connector.internal;

import J3.a;
import android.os.Bundle;

/* loaded from: classes3.dex */
final class c implements a.InterfaceC0389a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f38619a;

    public c(d dVar) {
        this.f38619a = dVar;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4930p4
    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (this.f38619a.f38620a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", a.a(str2));
            this.f38619a.f38621b.a(2, bundle2);
        }
    }
}
