package com.google.android.gms.common.api;

import N7.C1154e9;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import m0.AbstractC5312e;
import m0.C5308a;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public class AvailabilityException extends Exception {
    private final C5308a zaa;

    public AvailabilityException(C5308a c5308a) {
        this.zaa = c5308a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        C5308a c5308a = this.zaa;
        ApiKey<O> apiKey = googleApi.getApiKey();
        V v10 = c5308a.get(apiKey);
        Preconditions.checkArgument(v10 != 0, C1154e9.i("The given API (", apiKey.zaa(), ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C5308a.c) this.zaa.keySet()).iterator();
        boolean z10 = true;
        while (true) {
            AbstractC5312e abstractC5312e = (AbstractC5312e) it;
            if (!abstractC5312e.hasNext()) {
                break;
            }
            ApiKey apiKey = (ApiKey) abstractC5312e.next();
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
            z10 &= !connectionResult.isSuccess();
            arrayList.add(apiKey.zaa() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb = new StringBuilder();
        if (z10) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        C5308a c5308a = this.zaa;
        ApiKey<O> apiKey = hasApiKey.getApiKey();
        V v10 = c5308a.get(apiKey);
        Preconditions.checkArgument(v10 != 0, C1154e9.i("The given API (", apiKey.zaa(), ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }
}
