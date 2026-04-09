package n5;

import C.g0;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: SharedPreferencesQueue.java */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f44380a;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f44384e;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<String> f44383d = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    public final String f44381b = "topic_operation_queue";

    /* renamed from: c, reason: collision with root package name */
    public final String f44382c = StringUtils.COMMA;

    public w(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f44380a = sharedPreferences;
        this.f44384e = scheduledThreadPoolExecutor;
    }

    public static w a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        w wVar = new w(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (wVar.f44383d) {
            try {
                wVar.f44383d.clear();
                String string = wVar.f44380a.getString(wVar.f44381b, "");
                if (!TextUtils.isEmpty(string) && string.contains(wVar.f44382c)) {
                    String[] strArrSplit = string.split(wVar.f44382c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            wVar.f44383d.add(str);
                        }
                    }
                    return wVar;
                }
                return wVar;
            } finally {
            }
        }
    }

    public final String b() {
        String strPeek;
        synchronized (this.f44383d) {
            strPeek = this.f44383d.peek();
        }
        return strPeek;
    }

    public final boolean c(Object obj) {
        boolean zRemove;
        synchronized (this.f44383d) {
            zRemove = this.f44383d.remove(obj);
            if (zRemove) {
                this.f44384e.execute(new g0(this, 23));
            }
        }
        return zRemove;
    }
}
