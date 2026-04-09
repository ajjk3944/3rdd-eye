package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractC5033i;
import com.google.android.play.integrity.internal.G;

/* loaded from: classes3.dex */
final class be extends G {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f38039a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f38040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f38040b = bnVar;
        this.f38039a = context;
    }

    @Override // com.google.android.play.integrity.internal.G
    protected final void b() {
        this.f38040b.f38066d.trySetResult(Integer.valueOf(AbstractC5033i.a(this.f38039a)));
    }
}
