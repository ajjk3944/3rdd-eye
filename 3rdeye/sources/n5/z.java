package n5;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: TopicsStore.java */
/* loaded from: classes2.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static WeakReference<z> f44394d;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f44395a;

    /* renamed from: b, reason: collision with root package name */
    public w f44396b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f44397c;

    public z(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f44397c = scheduledThreadPoolExecutor;
        this.f44395a = sharedPreferences;
    }

    public final synchronized y a() {
        y yVar;
        String strB = this.f44396b.b();
        Pattern pattern = y.f44390d;
        yVar = null;
        if (!TextUtils.isEmpty(strB)) {
            String[] strArrSplit = strB.split("!", -1);
            if (strArrSplit.length == 2) {
                yVar = new y(strArrSplit[0], strArrSplit[1]);
            }
        }
        return yVar;
    }

    public final synchronized void b() {
        this.f44396b = w.a(this.f44395a, this.f44397c);
    }

    public final synchronized void c(y yVar) {
        this.f44396b.c(yVar.f44393c);
    }
}
