package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.AbstractC5033i;
import com.google.android.play.integrity.internal.C5030f;
import com.google.android.play.integrity.internal.F;
import com.google.android.play.integrity.internal.M;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    final C5030f f38000a;

    /* renamed from: b, reason: collision with root package name */
    private final F f38001b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38002c;

    /* renamed from: d, reason: collision with root package name */
    private final at f38003d;

    /* renamed from: e, reason: collision with root package name */
    private final k f38004e;

    aj(Context context, F f10, at atVar, k kVar) {
        this.f38002c = context.getPackageName();
        this.f38001b = f10;
        this.f38003d = atVar;
        this.f38004e = kVar;
        if (AbstractC5033i.b(context)) {
            this.f38000a = new C5030f(context, f10, "IntegrityService", ak.f38005a, new M() { // from class: com.google.android.play.core.integrity.ae
                @Override // com.google.android.play.integrity.internal.M
                public final Object a(IBinder iBinder) {
                    return com.google.android.play.integrity.internal.z.b(iBinder);
                }
            }, null);
        } else {
            f10.b("Phonesky is not installed.", new Object[0]);
            this.f38000a = null;
        }
    }

    static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f38002c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.q.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.q.a(arrayList)));
        return bundle;
    }

    final Task b(Activity activity, Bundle bundle) {
        if (this.f38000a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i10 = bundle.getInt("dialog.intent.type");
        this.f38001b.d("requestAndShowDialog(%s, %s)", this.f38002c, Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f38000a.t(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f38000a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f38001b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f38000a.t(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
