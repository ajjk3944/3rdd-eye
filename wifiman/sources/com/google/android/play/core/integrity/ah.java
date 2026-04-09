package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
final class ah extends y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f37996a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ai aiVar, String str, long j10) {
        super(str, j10);
        this.f37996a = aiVar;
    }

    @Override // com.google.android.play.core.integrity.y
    final Task b(Activity activity, Bundle bundle) {
        return this.f37996a.f37997a.b(activity, bundle);
    }
}
