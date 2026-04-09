package x9;

import android.os.RemoteException;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.internal.ads.fk0;
import com.google.android.gms.internal.ads.kp;
import java.util.ArrayList;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements AudienceNetworkAds.InitListener {

    /* renamed from: d, reason: collision with root package name */
    public static a f37012d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f37013a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f37014b = false;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f37015c = new ArrayList();

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
        int i4 = 0;
        this.f37013a = false;
        this.f37014b = initResult.isSuccess();
        ArrayList arrayList = this.f37015c;
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            b bVar = (b) obj;
            if (initResult.isSuccess()) {
                fk0 fk0Var = (fk0) bVar.f37016a;
                fk0Var.getClass();
                try {
                    ((kp) fk0Var.f11194b).c();
                } catch (RemoteException e2) {
                    i.f("", e2);
                }
            } else {
                ((fk0) bVar.f37016a).a(initResult.getMessage());
            }
        }
        arrayList.clear();
    }
}
