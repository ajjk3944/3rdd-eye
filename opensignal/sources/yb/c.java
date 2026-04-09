package yb;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.internal.measurement.e5;
import dd.r;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements dd.a, dd.g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c f26213d = new c(0);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c f26214g = new c(1);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ c f26215r = new c(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26216a;

    public /* synthetic */ c(int i10) {
        this.f26216a = i10;
    }

    @Override // dd.a
    public Object j(r rVar) throws IOException {
        switch (this.f26216a) {
            case 0:
                if (rVar.j()) {
                    return (Bundle) rVar.h();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(rVar.g()));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", rVar.g());
            default:
                Intent intent = (Intent) ((Bundle) rVar.h()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
        }
    }

    @Override // dd.g
    public r o(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i10 = a.f26203h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? e5.u(bundle) : e5.u(null);
    }
}
