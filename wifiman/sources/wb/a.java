package Wb;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: Wb.a$a, reason: collision with other inner class name */
    public static final class C0892a {
        public static void a(a aVar, long j10) {
            aVar.j(j10);
            aVar.h(j10);
        }

        public static long b(a aVar, d record, String gpx) {
            AbstractC6492s.i(record, "record");
            AbstractC6492s.i(gpx, "gpx");
            Iterator it = aVar.e().iterator();
            while (it.hasNext()) {
                aVar.a(((Number) it.next()).longValue());
            }
            return aVar.g(new c(aVar.c(record), gpx));
        }
    }

    void a(long j10);

    int b(long j10, String str);

    long c(d dVar);

    gg.i d(long j10);

    List e();

    long f(d dVar, String str);

    long g(c cVar);

    int h(long j10);

    gg.i i(long j10);

    int j(long j10);

    gg.i k();
}
