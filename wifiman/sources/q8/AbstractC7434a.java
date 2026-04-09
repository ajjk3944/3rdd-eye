package q8;

import Be.A0;
import Cc.InterfaceC2557a;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.product.m;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import n8.AbstractC6912m;
import s9.InterfaceC7929a;
import s9.d;
import wc.C8321a;
import wc.C8322b;

/* renamed from: q8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7434a {
    public static final A0 a(C8321a c8321a, InterfaceC2557a.b bVar, C8322b c8322b, boolean z10) {
        String name;
        AbstractC6492s.i(c8321a, "<this>");
        String strD = c8321a.d().d(":");
        U7.a aVarA = null;
        InterfaceC7929a interfaceC7929aC = (!z10 || bVar == null) ? null : AbstractC6912m.c(bVar, m.c.SMALL);
        s9.d bVar2 = (bVar == null || (name = bVar.getName()) == null) ? new d.b(R.string.device_name_fallback) : new d.c(name);
        boolean z11 = (bVar != null ? bVar.getName() : null) != null;
        List listA = f.a(c8321a, true, false);
        boolean zE = c8321a.e();
        String lowerCase = c8321a.d().d(":").toLowerCase(Locale.ROOT);
        AbstractC6492s.h(lowerCase, "toLowerCase(...)");
        return new A0(strD, interfaceC7929aC, bVar2, z11, listA, zE, new d.c(lowerCase), new d.c(""), c8321a.e() ? new d.c("") : Ne.f.h(c8321a.k(), true, null, 2, null), c8321a.k(), (c8321a.e() || !(c8322b == null || (aVarA = c8322b.a()) == null)) ? aVarA : c8321a.k());
    }
}
