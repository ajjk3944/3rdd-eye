package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class e extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Handler handler, Object obj, int i) {
        super(handler);
        this.f18647b = i;
        this.f18648c = obj;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        switch (this.f18647b) {
            case 0:
                ((InAppMessageResponseListener) this.f18648c).onInAppMessageResponse(com.google.android.gms.internal.play_billing.zzb.zzf(bundle, "BillingClient"));
                break;
            default:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f18648c;
                if (i == 1) {
                    taskCompletionSource.trySetResult(-1);
                    break;
                } else if (i == 2) {
                    taskCompletionSource.trySetResult(0);
                    break;
                } else {
                    taskCompletionSource.trySetResult(1);
                    break;
                }
        }
    }
}
