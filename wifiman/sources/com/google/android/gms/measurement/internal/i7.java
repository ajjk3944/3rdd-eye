package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class i7 implements w7 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4833d7 f36542a;

    i7(C4833d7 c4833d7) {
        this.f36542a = c4833d7;
    }

    @Override // com.google.android.gms.measurement.internal.w7
    public final void c(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f36542a.zzl().z(new l7(this, str, str2, bundle));
        } else if (this.f36542a.f36405l != null) {
            this.f36542a.f36405l.zzj().C().b("AppId not known when logging event", str2);
        }
    }
}
