package com.google.firebase.analytics.connector.internal;

import J3.a;
import android.os.Bundle;

/* loaded from: classes3.dex */
final class e implements a.InterfaceC0389a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ f f38624a;

    public e(f fVar) {
        this.f38624a = fVar;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4930p4
    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (str == null || !a.e(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        this.f38624a.f38625a.a(3, bundle2);
    }
}
