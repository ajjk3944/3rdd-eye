package io.sentry.internal.modules;

import com.google.android.gms.internal.measurement.y3;
import io.sentry.b5;
import io.sentry.u0;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: e, reason: collision with root package name */
    public final Pattern f12362e;

    /* renamed from: f, reason: collision with root package name */
    public final Pattern f12363f;

    /* renamed from: g, reason: collision with root package name */
    public final ClassLoader f12364g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u0 u0Var) {
        super(u0Var);
        ClassLoader classLoader = c.class.getClassLoader();
        this.f12362e = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f12363f = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f12364g = y3.e(classLoader);
    }

    @Override // io.sentry.internal.modules.d
    public final Map b() {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f12364g.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Matcher matcher = this.f12362e.matcher(resources.nextElement().toString());
                b bVar = null;
                String strGroup = (matcher.matches() && matcher.groupCount() == 1) ? matcher.group(1) : null;
                if (strGroup != null) {
                    Matcher matcher2 = this.f12363f.matcher(strGroup);
                    if (matcher2.matches() && matcher2.groupCount() == 2) {
                        bVar = new b(matcher2.group(1), matcher2.group(2));
                    }
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f12366a.g(b5.ERROR, "Unable to detect modules via manifest files.", th2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            map.put(bVar2.f12360a, bVar2.f12361b);
        }
        return map;
    }
}
