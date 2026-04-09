package g7;

import e7.k;
import kotlin.jvm.internal.l;

/* compiled from: HistogramReporter.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f37955a;

    public a(b bVar) {
        this.f37955a = bVar;
    }

    public static void a(a aVar, String str, long j4, String str2, String str3, k filter, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            filter = k.a.f37753a;
        }
        aVar.getClass();
        l.f(filter, "filter");
        boolean zA = filter.a();
        b bVar = aVar.f37955a;
        if (zA) {
            bVar.a(str, str3, j4);
        }
        if (str2 != null) {
            String str4 = str2 + '.' + str;
            if (filter.a()) {
                bVar.a(str4, str3, j4);
            }
        }
    }
}
