package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m4.AbstractC6769h;
import o.C7010a;

/* renamed from: com.google.android.gms.internal.measurement.e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4337e3 implements InterfaceC4390k3 {

    /* renamed from: h, reason: collision with root package name */
    private static final Map f35207h = new C7010a();

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f35208i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f35209a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f35210b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f35211c;

    /* renamed from: d, reason: collision with root package name */
    private ContentObserver f35212d;

    /* renamed from: f, reason: collision with root package name */
    private volatile Map f35214f;

    /* renamed from: e, reason: collision with root package name */
    private final Object f35213e = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final List f35215g = new ArrayList();

    private C4337e3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        AbstractC6769h.i(contentResolver);
        AbstractC6769h.i(uri);
        this.f35209a = contentResolver;
        this.f35210b = uri;
        this.f35211c = runnable;
        this.f35212d = new C4355g3(this, null);
    }

    public static C4337e3 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C4337e3 c4337e3;
        synchronized (C4337e3.class) {
            Map map = f35207h;
            c4337e3 = (C4337e3) map.get(uri);
            if (c4337e3 == null) {
                try {
                    C4337e3 c4337e32 = new C4337e3(contentResolver, uri, runnable);
                    try {
                        contentResolver.registerContentObserver(uri, false, c4337e32.f35212d);
                        map.put(uri, c4337e32);
                    } catch (SecurityException unused) {
                    }
                    c4337e3 = c4337e32;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c4337e3;
    }

    static synchronized void d() {
        try {
            for (C4337e3 c4337e3 : f35207h.values()) {
                c4337e3.f35209a.unregisterContentObserver(c4337e3.f35212d);
            }
            f35207h.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Map f() {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.f35209a.acquireUnstableContentProviderClient(this.f35210b);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.emptyMap();
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(this.f35210b, f35208i, null, null, null);
            try {
                if (cursorQuery == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    Map mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return mapEmptyMap;
                }
                int count = cursorQuery.getCount();
                if (count == 0) {
                    Map mapEmptyMap2 = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap2;
                }
                Map c7010a = count <= 256 ? new C7010a(count) : new HashMap(count, 1.0f);
                while (cursorQuery.moveToNext()) {
                    c7010a.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                if (cursorQuery.isAfterLast()) {
                    cursorQuery.close();
                    return c7010a;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map mapEmptyMap3 = Collections.emptyMap();
                cursorQuery.close();
                return mapEmptyMap3;
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
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
            return Collections.emptyMap();
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    private final Map g() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) AbstractC4382j3.a(new InterfaceC4406m3() { // from class: com.google.android.gms.internal.measurement.h3
                    @Override // com.google.android.gms.internal.measurement.InterfaceC4406m3
                    public final Object zza() {
                        return this.f35238a.f();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException e10) {
                Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e10);
                return Collections.emptyMap();
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public final Map b() {
        Map mapG = this.f35214f;
        if (mapG == null) {
            synchronized (this.f35213e) {
                try {
                    mapG = this.f35214f;
                    if (mapG == null) {
                        mapG = g();
                        this.f35214f = mapG;
                    }
                } finally {
                }
            }
        }
        return mapG != null ? mapG : Collections.emptyMap();
    }

    public final void e() {
        synchronized (this.f35213e) {
            this.f35214f = null;
            this.f35211c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f35215g.iterator();
                if (it.hasNext()) {
                    AbstractC5487d.a(it.next());
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4390k3
    public final /* synthetic */ Object zza(String str) {
        return (String) b().get(str);
    }
}
