package fi;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import ar.k;
import br.n;
import br.w;
import java.io.IOException;
import lq.b0;

/* loaded from: classes.dex */
public final class e extends n implements k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f8892d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f8893g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f8894r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ hi.a f8895x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Uri uri, long j, w wVar, hi.a aVar) {
        super(1);
        this.f8892d = uri;
        this.f8893g = j;
        this.f8894r = wVar;
        this.f8895x = aVar;
    }

    @Override // ar.k
    public final Object a(Object obj) throws RemoteException, IOException {
        ContentProviderClient contentProviderClient = (ContentProviderClient) obj;
        if (contentProviderClient == null) {
            return null;
        }
        Cursor cursorQuery = contentProviderClient.query(this.f8892d, null, "id=?", new String[]{String.valueOf(this.f8893g)}, null);
        if (cursorQuery == null) {
            return null;
        }
        w wVar = this.f8894r;
        hi.a aVar = this.f8895x;
        try {
            if (cursorQuery.moveToFirst()) {
                wVar.f2917a = aVar.e(cursorQuery);
            }
            cursorQuery.close();
            return b0.f15562a;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ic.a.g(cursorQuery, th2);
                throw th3;
            }
        }
    }
}
