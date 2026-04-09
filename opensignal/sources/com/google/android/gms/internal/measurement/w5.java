package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class w5 implements a6 {

    /* renamed from: b, reason: collision with root package name */
    public static final f5 f5246b = new f5(3);

    /* renamed from: a, reason: collision with root package name */
    public final Object f5247a;

    public /* synthetic */ w5(Object obj) {
        this.f5247a = obj;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public boolean a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (((a6[]) this.f5247a)[i10].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public i6 b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            a6 a6Var = ((a6[]) this.f5247a)[i10];
            if (a6Var.a(cls)) {
                return a6Var.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public Object c() {
        e4 e4Var = (e4) this.f5247a;
        ContentResolver contentResolver = e4Var.f4968a;
        Uri uri = e4Var.f4969b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                io.sentry.android.core.e0.p("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, e4.j, null, null, null);
            try {
                if (cursorQuery == null) {
                    io.sentry.android.core.e0.p("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = cursorQuery.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                Map eVar = count <= 256 ? new u.e(count) : new HashMap(count, 1.0f);
                while (cursorQuery.moveToNext()) {
                    eVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                if (cursorQuery.isAfterLast()) {
                    cursorQuery.close();
                    return eVar;
                }
                io.sentry.android.core.e0.p("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map map2 = Collections.EMPTY_MAP;
                cursorQuery.close();
                return map2;
            } finally {
            }
        } catch (RemoteException e4) {
            io.sentry.android.core.e0.q("ConfigurationContentLdr", "ContentProvider query failed, using default values", e4);
            return Collections.EMPTY_MAP;
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    public void d(int i10, Object obj, j6 j6Var) {
        s4 s4Var = (s4) obj;
        z4 z4Var = (z4) this.f5247a;
        z4Var.v0((i10 << 3) | 2);
        z4Var.v0(s4Var.b(j6Var));
        j6Var.c(s4Var, z4Var.f5282c);
    }

    public void e(int i10, Object obj, j6 j6Var) {
        z4 z4Var = (z4) this.f5247a;
        z4Var.m0(i10, 3);
        j6Var.c((s4) obj, z4Var.f5282c);
        z4Var.m0(i10, 4);
    }

    public w5(int i10) {
        switch (i10) {
            case 1:
                this.f5247a = new HashMap();
                break;
            default:
                g6 g6Var = g6.f5043c;
                w5 w5Var = new w5(new a6[]{f5.f4985b, f5246b});
                Charset charset = o5.f5148a;
                this.f5247a = w5Var;
                break;
        }
    }

    public w5(z4 z4Var) {
        Charset charset = o5.f5148a;
        this.f5247a = z4Var;
        z4Var.f5282c = this;
    }
}
