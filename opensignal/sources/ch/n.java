package ch;

import android.content.Intent;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f3969a = new CopyOnWriteArrayList();

    public static void a() {
        Iterator it = f3969a.iterator();
        while (it.hasNext()) {
            ((vh.a) it.next()).getClass();
        }
    }

    public static void b(String str, Object... objArr) {
        Iterator it = f3969a.iterator();
        while (it.hasNext()) {
            ((vh.a) it.next()).a(str, objArr);
        }
    }

    public static void c(String str, String str2) {
        Iterator it = f3969a.iterator();
        while (it.hasNext()) {
            ((vh.a) it.next()).b(str, str2, null);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        Iterator it = f3969a.iterator();
        while (it.hasNext()) {
            ((vh.a) it.next()).b(str, str2, th2);
        }
    }

    public static void e(String str, Throwable th2) {
        Iterator it = f3969a.iterator();
        while (it.hasNext()) {
            ((vh.a) it.next()).b(str, "", th2);
        }
    }

    public static void f(String str, Intent intent) {
        Bundle extras = intent.getExtras();
        Iterator it = f3969a.iterator();
        while (it.hasNext()) {
            vh.a aVar = (vh.a) it.next();
            aVar.a(str, "########## Intent start");
            if (extras != null) {
                for (String str2 : extras.keySet()) {
                    StringBuilder sbU = c7.a.u("[", str2, "=");
                    sbU.append(extras.get(str2));
                    sbU.append("]");
                    aVar.a(str, sbU.toString());
                }
            }
            aVar.a(str, "########## Intent end");
        }
    }

    public static void g(String str, Object... objArr) {
        Iterator it = f3969a.iterator();
        while (it.hasNext()) {
            vh.a aVar = (vh.a) it.next();
            aVar.getClass();
            br.l.e(str, "tag");
            long jCurrentTimeMillis = System.currentTimeMillis();
            String string = Arrays.toString(objArr);
            br.l.d(string, "toString(...)");
            aVar.c(jCurrentTimeMillis, 200, string, null, str);
        }
    }
}
