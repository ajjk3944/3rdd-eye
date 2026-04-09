package ee;

import Zg.AbstractC3689v;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.p;

/* renamed from: ee.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5455a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5455a f46379a = new C5455a();

    private C5455a() {
    }

    private final Long d(String str) {
        List listL;
        try {
            List listP = new p("\\.").p(str, 0);
            if (listP.isEmpty()) {
                listL = AbstractC3689v.l();
            } else {
                ListIterator listIterator = listP.listIterator(listP.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listL = AbstractC3689v.a1(listP, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listL = AbstractC3689v.l();
            }
            String[] strArr = (String[]) listL.toArray(new String[0]);
            long j10 = 0;
            for (int i10 = 3; -1 < i10; i10--) {
                j10 |= Long.parseLong(strArr[3 - i10]) << (i10 * 8);
            }
            return Long.valueOf(j10);
        } catch (Exception e10) {
            Z7.b.f(e10, null, 2, null);
            return null;
        }
    }

    private final String f(short s10) {
        return e(g(s10));
    }

    private final long g(short s10) {
        long j10 = 0;
        int i10 = 0;
        while (i10 < 32) {
            j10 = i10 < s10 ? (j10 << 1) + 1 : j10 << 1;
            i10++;
        }
        return j10;
    }

    public final long a(Wc.a aVar) {
        AbstractC6492s.i(aVar, "<this>");
        String string = aVar.a().toString();
        AbstractC6492s.h(string, "toString(...)");
        Long lD = d(string);
        AbstractC6492s.f(lD);
        long jLongValue = lD.longValue();
        Long lD2 = d(b(aVar));
        AbstractC6492s.f(lD2);
        long jLongValue2 = lD2.longValue();
        int i10 = 32;
        while (i10 < 64 && (jLongValue2 << i10) != 0) {
            i10++;
        }
        int i11 = 32 - (i10 - 32);
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 << 1) | 1;
        }
        return (jLongValue & jLongValue2) + i12;
    }

    public final String b(Wc.a aVar) {
        AbstractC6492s.i(aVar, "<this>");
        return f((short) aVar.b());
    }

    public final long c(Wc.a aVar) {
        AbstractC6492s.i(aVar, "<this>");
        String string = aVar.a().toString();
        AbstractC6492s.h(string, "toString(...)");
        Long lD = d(string);
        AbstractC6492s.f(lD);
        long jLongValue = lD.longValue();
        Long lD2 = d(b(aVar));
        AbstractC6492s.f(lD2);
        return jLongValue & lD2.longValue();
    }

    public final String e(long j10) {
        StringBuilder sb2 = new StringBuilder(15);
        for (int i10 = 0; i10 < 4; i10++) {
            sb2.insert(0, Long.toString(255 & j10));
            if (i10 < 3) {
                sb2.insert(0, '.');
            }
            j10 >>= 8;
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }
}
