package io.appmetrica.analytics.internal;

import N7.G8;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC4877pj;
import io.appmetrica.analytics.impl.C4950sf;
import io.appmetrica.analytics.impl.C4976tf;
import io.appmetrica.analytics.impl.C5071xa;
import io.appmetrica.analytics.impl.L3;
import io.appmetrica.analytics.impl.M3;
import io.appmetrica.analytics.impl.T5;
import io.appmetrica.analytics.impl.U5;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private boolean f42223a = false;

    /* renamed from: b, reason: collision with root package name */
    private final UriMatcher f42224b = new UriMatcher(-1);

    private void a(U5 u52, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object objInvoke = u52.f40225a.invoke(contentValues);
                if (objInvoke != null) {
                    u52.f40227c.b(applicationContext);
                    if (((Boolean) u52.f40226b.invoke(objInvoke)).booleanValue()) {
                        AbstractC4877pj.a("Successfully saved " + u52.f40228d, new Object[0]);
                    } else {
                        AbstractC4877pj.a("Did not save " + u52.f40228d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Unexpected error occurred\n" + StringUtils.throwableToString(th), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        AbstractC4877pj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f42223a = true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f42223a) {
                    return null;
                }
                if (contentValues != null) {
                    int iMatch = this.f42224b.match(uri);
                    if (iMatch == 1) {
                        a(new U5(new C4950sf(), new C4976tf(), C5071xa.f42063d, "preload info"), contentValues);
                    } else if (iMatch != 2) {
                        AbstractC4877pj.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new U5(new L3(), new M3(), C5071xa.f42063d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = T5.f40155a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String strS = G8.s(applicationContext != null ? applicationContext.getPackageName() : "", ".appmetrica.preloadinfo.retail");
        this.f42224b.addURI(strS, "preloadinfo", 1);
        this.f42224b.addURI(strS, "clids", 2);
        T5.f40155a = new CountDownLatch(1);
        T5.f40156b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC4877pj.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC4877pj.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
