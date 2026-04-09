package f2;

import B7.d;
import N7.B8;
import androidx.work.m;
import b2.C1828i;
import b2.C1842w;
import b2.InterfaceC1818E;
import b2.InterfaceC1829j;
import b2.InterfaceC1836q;
import c9.C2097r;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: DiagnosticsWorker.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f37815a;

    static {
        String strG = m.g("DiagnosticsWrkr");
        l.e(strG, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f37815a = strG;
    }

    public static final String a(InterfaceC1836q interfaceC1836q, InterfaceC1818E interfaceC1818E, InterfaceC1829j interfaceC1829j, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1842w c1842w = (C1842w) it.next();
            C1828i c1828iB = interfaceC1829j.b(d.l(c1842w));
            Integer numValueOf = c1828iB != null ? Integer.valueOf(c1828iB.f17121c) : null;
            String str = c1842w.f17138a;
            String strU0 = C2097r.u0(interfaceC1836q.c(str), StringUtils.COMMA, null, null, null, 62);
            String strU02 = C2097r.u0(interfaceC1818E.a(str), StringUtils.COMMA, null, null, null, 62);
            StringBuilder sbK = B8.k("\n", str, "\t ");
            sbK.append(c1842w.f17140c);
            sbK.append("\t ");
            sbK.append(numValueOf);
            sbK.append("\t ");
            sbK.append(c1842w.f17139b.name());
            sbK.append("\t ");
            sbK.append(strU0);
            sbK.append("\t ");
            sbK.append(strU02);
            sbK.append('\t');
            sb.append(sbK.toString());
        }
        String string = sb.toString();
        l.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
