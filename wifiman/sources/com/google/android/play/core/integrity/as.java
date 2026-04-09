package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.integrity.internal.C5030f;
import com.google.android.play.integrity.internal.D;
import com.google.android.play.integrity.internal.F;

/* loaded from: classes3.dex */
final class as extends D {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f38018a;

    /* renamed from: b, reason: collision with root package name */
    final C5030f f38019b;

    /* renamed from: c, reason: collision with root package name */
    private final F f38020c = new F("RequestDialogCallbackImpl");

    /* renamed from: d, reason: collision with root package name */
    private final String f38021d;

    /* renamed from: e, reason: collision with root package name */
    private final k f38022e;

    /* renamed from: f, reason: collision with root package name */
    private final Activity f38023f;

    as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, C5030f c5030f) {
        this.f38021d = context.getPackageName();
        this.f38022e = kVar;
        this.f38018a = taskCompletionSource;
        this.f38023f = activity;
        this.f38019b = c5030f;
    }

    @Override // com.google.android.play.integrity.internal.E
    public final void b(Bundle bundle) {
        this.f38019b.v(this.f38018a);
        this.f38020c.d("onRequestDialog(%s)", this.f38021d);
        ApiException apiExceptionA = this.f38022e.a(bundle);
        if (apiExceptionA != null) {
            this.f38018a.trySetException(apiExceptionA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f38020c.b("onRequestDialog(%s): got null dialog intent", this.f38021d);
            this.f38018a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f38023f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f38019b.c()));
        this.f38020c.a("Starting dialog intent...", new Object[0]);
        this.f38023f.startActivityForResult(intent, 0);
    }
}
