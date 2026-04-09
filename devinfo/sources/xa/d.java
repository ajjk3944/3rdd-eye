package xa;

import android.app.Activity;
import android.os.Bundle;
import org.json.JSONException;
import ya.a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends i {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f37030y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Activity activity, int i4) {
        super(activity);
        this.f37030y = i4;
    }

    @Override // xa.i, com.google.android.gms.internal.ads.ft
    public void P3(Bundle bundle) throws JSONException, g {
        switch (this.f37030y) {
            case 4:
                a0.m("AdOverlayParcel is null or does not contain valid overlay type.");
                this.f37063w = 4;
                this.f37044b.finish();
                break;
            default:
                super.P3(bundle);
                break;
        }
    }
}
