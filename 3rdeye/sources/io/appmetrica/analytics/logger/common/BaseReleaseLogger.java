package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class BaseReleaseLogger {

    /* renamed from: d, reason: collision with root package name */
    private static volatile String f42292d = "";

    /* renamed from: a, reason: collision with root package name */
    private final String f42293a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f42294b = false;

    /* renamed from: c, reason: collision with root package name */
    private final c f42295c;

    public BaseReleaseLogger(String str, String str2) {
        this.f42295c = new c(new d(str), new a(), new b());
        this.f42293a = str2;
    }

    public static void init(Context context) {
        f42292d = "[" + context.getPackageName() + "] : ";
    }

    public void error(String str, Object... objArr) {
        if (this.f42294b) {
            c cVar = this.f42295c;
            String prefix = getPrefix();
            cVar.f42298b.getClass();
            Iterator it = cVar.f42299c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f42297a.f42300a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    public String getPrefix() {
        return f42292d + this.f42293a;
    }

    public void info(String str, Object... objArr) {
        if (this.f42294b) {
            c cVar = this.f42295c;
            String prefix = getPrefix();
            cVar.f42298b.getClass();
            Iterator it = cVar.f42299c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f42297a.f42300a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z10) {
        this.f42294b = z10;
    }

    public void warning(String str, Object... objArr) {
        if (this.f42294b) {
            c cVar = this.f42295c;
            String prefix = getPrefix();
            cVar.f42298b.getClass();
            Iterator it = cVar.f42299c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f42297a.f42300a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }

    public void error(Throwable th, String str, Object... objArr) {
        if (this.f42294b) {
            c cVar = this.f42295c;
            String prefix = getPrefix();
            cVar.f42298b.getClass();
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("\n");
            sb.append(Log.getStackTraceString(th));
            Iterator it = cVar.f42299c.a(a.a(prefix, sb.toString(), objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f42297a.f42300a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }
}
