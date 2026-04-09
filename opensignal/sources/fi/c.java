package fi;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import ar.k;
import br.n;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import lq.b0;

/* loaded from: classes.dex */
public final class c extends n implements k {
    public final /* synthetic */ Serializable B;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8884d = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Uri f8885g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String[] f8886r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f8887x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f8888y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Uri uri, String str, String[] strArr, bm.d dVar, hi.a aVar, ArrayList arrayList) {
        super(1);
        this.f8885g = uri;
        this.f8887x = str;
        this.f8886r = strArr;
        this.f8888y = aVar;
        this.B = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [ar.k, br.n] */
    @Override // ar.k
    public final Object a(Object obj) throws RemoteException, IOException {
        Cursor cursorQuery;
        switch (this.f8884d) {
            case 0:
                ContentProviderClient contentProviderClient = (ContentProviderClient) obj;
                b0 b0Var = b0.f15562a;
                if (contentProviderClient != null) {
                    try {
                        cursorQuery = contentProviderClient.query(this.f8885g, null, this.f8887x, this.f8886r, "id");
                        if (cursorQuery != null) {
                            hi.a aVar = (hi.a) this.f8888y;
                            ArrayList arrayList = (ArrayList) this.B;
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    do {
                                        arrayList.add(aVar.e(cursorQuery));
                                    } while (cursorQuery.moveToNext());
                                }
                                cursorQuery.close();
                                return b0Var;
                            } finally {
                            }
                        }
                    } catch (Exception e4) {
                        cj.a.E(e4, "Exception when reading All items from ContentProviderDatabaseDataSource");
                        return b0Var;
                    }
                }
                return null;
            default:
                ContentProviderClient contentProviderClient2 = (ContentProviderClient) obj;
                if (contentProviderClient2 != null) {
                    cursorQuery = contentProviderClient2.query(this.f8885g, this.f8886r, this.f8887x, (String[]) this.f8888y, "id");
                    if (cursorQuery != null) {
                        ?? r02 = (n) this.B;
                        try {
                            if (cursorQuery.moveToFirst()) {
                                do {
                                    r02.a(cursorQuery);
                                } while (cursorQuery.moveToNext());
                            }
                            cursorQuery.close();
                            return b0.f15562a;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } finally {
                            }
                        }
                    }
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Uri uri, String[] strArr, String str, String[] strArr2, k kVar) {
        super(1);
        this.f8885g = uri;
        this.f8886r = strArr;
        this.f8887x = str;
        this.f8888y = strArr2;
        this.B = (n) kVar;
    }
}
