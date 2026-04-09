package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v5 implements td.d, z5 {

    /* renamed from: b, reason: collision with root package name */
    public static final e5 f19969b = new e5(3);

    /* renamed from: a, reason: collision with root package name */
    public final Object f19970a;

    public /* synthetic */ v5(Object obj) {
        this.f19970a = obj;
    }

    public Object a() {
        f4 f4Var = (f4) this.f19970a;
        ContentResolver contentResolver = f4Var.f19732a;
        Uri uri = f4Var.f19733b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, f4.j, null, null, null);
            try {
                if (cursorQuery == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = cursorQuery.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                Map eVar = count <= 256 ? new x.e(count) : new HashMap(count, 1.0f);
                while (cursorQuery.moveToNext()) {
                    eVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                if (cursorQuery.isAfterLast()) {
                    cursorQuery.close();
                    return eVar;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map map2 = Collections.EMPTY_MAP;
                cursorQuery.close();
                return map2;
            } finally {
            }
        } catch (RemoteException e2) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e2);
            return Collections.EMPTY_MAP;
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    public void b(int i4, Object obj, i6 i6Var) {
        s4 s4Var = (s4) obj;
        y4 y4Var = (y4) this.f19970a;
        y4Var.b0((i4 << 3) | 2);
        y4Var.b0(s4Var.b(i6Var));
        i6Var.e(s4Var, y4Var.f20049a);
    }

    public void c(int i4, Object obj, i6 i6Var) {
        y4 y4Var = (y4) this.f19970a;
        y4Var.S(i4, 3);
        i6Var.e((s4) obj, y4Var.f20049a);
        y4Var.S(i4, 4);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public boolean d(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (((z5[]) this.f19970a)[i4].d(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public h6 e(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            z5 z5Var = ((z5[]) this.f19970a)[i4];
            if (z5Var.d(cls)) {
                return z5Var.e(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // td.d
    public /* synthetic */ Object get() {
        Object obj = n4.g;
        return j4.s((Context) this.f19970a);
    }

    public v5(int i4) {
        switch (i4) {
            case 1:
                this.f19970a = new HashMap();
                break;
            default:
                f6 f6Var = f6.f19741c;
                v5 v5Var = new v5(new z5[]{e5.f19675b, f19969b});
                Charset charset = n5.f19843a;
                this.f19970a = v5Var;
                break;
        }
    }

    public v5(y4 y4Var) {
        Charset charset = n5.f19843a;
        this.f19970a = y4Var;
        y4Var.f20049a = this;
    }
}
