package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.F;

/* loaded from: classes3.dex */
abstract class y {

    /* renamed from: b, reason: collision with root package name */
    private final String f38108b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38109c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f38111e;

    /* renamed from: a, reason: collision with root package name */
    private final F f38107a = new F("IntegrityDialogWrapper");

    /* renamed from: d, reason: collision with root package name */
    private final Object f38110d = new Object();

    y(String str, long j10) {
        this.f38108b = str;
        this.f38109c = j10;
    }

    public final Task a(Activity activity, int i10) {
        synchronized (this.f38110d) {
            try {
                if (this.f38111e) {
                    return Tasks.forResult(0);
                }
                this.f38111e = true;
                this.f38107a.a("checkAndShowDialog(%s)", Integer.valueOf(i10));
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i10);
                bundle.putString("package.name", this.f38108b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f38109c);
                return b(activity, bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    abstract Task b(Activity activity, Bundle bundle);
}
