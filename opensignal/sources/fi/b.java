package fi;

import android.content.ContentProviderClient;
import android.net.Uri;
import android.os.RemoteException;
import ar.k;
import br.n;

/* loaded from: classes.dex */
public final class b extends n implements k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8881d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Uri f8882g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f8883r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Uri uri, String str, int i10) {
        super(1);
        this.f8881d = i10;
        this.f8882g = uri;
        this.f8883r = str;
    }

    @Override // ar.k
    public final Object a(Object obj) throws RemoteException {
        int iDelete;
        int iDelete2;
        switch (this.f8881d) {
            case 0:
                ContentProviderClient contentProviderClient = (ContentProviderClient) obj;
                if (contentProviderClient != null) {
                    iDelete = contentProviderClient.delete(this.f8882g, this.f8883r, null);
                } else {
                    iDelete = 0;
                }
                return Integer.valueOf(iDelete);
            default:
                ContentProviderClient contentProviderClient2 = (ContentProviderClient) obj;
                if (contentProviderClient2 != null) {
                    iDelete2 = contentProviderClient2.delete(this.f8882g, this.f8883r, null);
                } else {
                    iDelete2 = 0;
                }
                return Integer.valueOf(iDelete2);
        }
    }
}
