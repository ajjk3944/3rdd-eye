package Vc;

import Zg.AbstractC3689v;
import com.ui.wifiman.model.vendor.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.InterfaceC6518l;
import kotlin.text.p;
import okhttp3.HttpUrl;

/* loaded from: classes4.dex */
public abstract class b {
    private static final String a(String str) {
        HttpUrl httpUrlF = HttpUrl.INSTANCE.f(str);
        if (httpUrlF != null) {
            return httpUrlF.getUrl();
        }
        return null;
    }

    private static final String b(g gVar, Uc.c cVar) {
        for (String str : cVar.getKeys()) {
            String str2 = (String) gVar.b().get(str);
            if (str2 != null) {
                return str2;
            }
        }
        return null;
    }

    private static final String c(h hVar, Uc.d dVar) {
        for (String str : dVar.getKeys()) {
            String str2 = (String) hVar.a().get(str);
            if (str2 != null) {
                return str2;
            }
        }
        return null;
    }

    public static final a d(g gVar, d.b vendorManager, inet.ipaddr.g inetAddress, long j10) {
        AbstractC6492s.i(gVar, "<this>");
        AbstractC6492s.i(vendorManager, "vendorManager");
        AbstractC6492s.i(inetAddress, "inetAddress");
        String strB = b(gVar, Uc.c.TYPE);
        Uc.b bVarF = strB != null ? f(strB) : null;
        String strB2 = b(gVar, Uc.c.NAME_FRIENDLY);
        String strB3 = b(gVar, Uc.c.MODEL_NAME);
        String strB4 = b(gVar, Uc.c.MODEL_DESCRIPTION);
        String strB5 = b(gVar, Uc.c.MODEL_URL);
        String strA = strB5 != null ? a(strB5) : null;
        String strB6 = b(gVar, Uc.c.VENDOR_NAME);
        com.ui.wifiman.model.vendor.d dVarB = strB6 != null ? vendorManager.b(strB6) : null;
        String strB7 = b(gVar, Uc.c.VENDOR_URL);
        String strA2 = strB7 != null ? a(strB7) : null;
        String strB8 = b(gVar, Uc.c.FW_VERSION);
        String strB9 = b(gVar, Uc.c.FW_GEN);
        String strB10 = b(gVar, Uc.c.HW_VERSION);
        String strB11 = b(gVar, Uc.c.SERIAL_NUMBER);
        String strB12 = b(gVar, Uc.c.UDN);
        List listA = gVar.a();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(d((g) it.next(), vendorManager, inetAddress, j10));
            strB9 = strB9;
            strB10 = strB10;
        }
        String str = strB9;
        String str2 = strB10;
        List listC = gVar.c();
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(listC, 10));
        Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            arrayList2.add(e((h) it2.next()));
        }
        return new a(bVarF, inetAddress, strB2, strB3, strB4, strA, dVarB, strA2, strB8, str, str2, strB11, strB12, arrayList, arrayList2, j10, gVar);
    }

    public static final c e(h hVar) {
        AbstractC6492s.i(hVar, "<this>");
        String strC = c(hVar, Uc.d.TYPE);
        return new c(strC != null ? f(strC) : null, c(hVar, Uc.d.ID), hVar);
    }

    private static final Uc.b f(String str) {
        InterfaceC6518l interfaceC6518lL = new p("urn:([^:]+):([^:]+):([^:]+):(\\d+)$").l(str);
        if (interfaceC6518lL != null) {
            return new Uc.b((String) interfaceC6518lL.b().get(2), (String) interfaceC6518lL.b().get(3), Integer.parseInt((String) interfaceC6518lL.b().get(4)));
        }
        return null;
    }
}
