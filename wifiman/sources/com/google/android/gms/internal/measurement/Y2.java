package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes.dex */
public final class Y2 implements InterfaceC4310b3 {
    @Override // com.google.android.gms.internal.measurement.InterfaceC4310b3
    public final String a(ContentResolver contentResolver, String str) throws zzhe {
        Uri uri = S2.f35103a;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new zzhe("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        throw new zzhe("ContentProvider query returned null cursor");
                    }
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(1);
                        cursorQuery.close();
                        return string;
                    }
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return null;
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (RemoteException e10) {
                throw new zzhe("ContentProvider query failed", e10);
            }
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4310b3
    public final Map b(ContentResolver contentResolver, String[] strArr, InterfaceC4319c3 interfaceC4319c3) throws zzhe {
        Uri uri = S2.f35104b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            throw new zzhe("Unable to acquire ContentProviderClient");
        }
        try {
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                try {
                    if (cursorQuery == null) {
                        throw new zzhe("ContentProvider query returned null cursor");
                    }
                    Map mapZza = interfaceC4319c3.zza(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        mapZza.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (!cursorQuery.isAfterLast()) {
                        throw new zzhe("Cursor read incomplete (ContentProvider dead?)");
                    }
                    cursorQuery.close();
                    return mapZza;
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (RemoteException e10) {
                throw new zzhe("ContentProvider query failed", e10);
            }
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }
}
