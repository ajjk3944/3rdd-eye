package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C5030f;

/* loaded from: classes3.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38024a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f38025b;

    at(com.google.android.play.integrity.internal.n nVar, com.google.android.play.integrity.internal.n nVar2) {
        this.f38024a = nVar;
        this.f38025b = nVar2;
    }

    final as a(Activity activity, TaskCompletionSource taskCompletionSource, C5030f c5030f) {
        Object objA = this.f38024a.a();
        objA.getClass();
        k kVar = (k) this.f38025b.a();
        kVar.getClass();
        activity.getClass();
        c5030f.getClass();
        return new as((Context) objA, kVar, activity, taskCompletionSource, c5030f);
    }
}
