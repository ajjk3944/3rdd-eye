package F7;

import F7.C2812a;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import h9.C5969a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: F7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2813b implements C2812a.InterfaceC0239a {

    /* renamed from: a, reason: collision with root package name */
    private final C2814c f6029a;

    /* renamed from: b, reason: collision with root package name */
    private final List f6030b;

    public C2813b() {
        C2814c c2814c = C2814c.f6031a;
        this.f6029a = c2814c;
        this.f6030b = AbstractC3689v.W0(c2814c.a().keySet());
    }

    private final String b(byte b10) {
        return new String(new char[]{Character.forDigit((b10 >> 4) & 15, 16), Character.forDigit(b10 & 15, 16)});
    }

    private final String c(byte[] bArr, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            stringBuffer.append(b(b10));
        }
        String string = stringBuffer.toString();
        AbstractC6492s.h(string, "hexStringBuffer.toString()");
        String strZ0 = AbstractC3689v.z0(kotlin.text.t.s1(string, 2), str, null, null, 0, null, null, 62, null);
        Locale US = Locale.US;
        AbstractC6492s.h(US, "US");
        String upperCase = strZ0.toUpperCase(US);
        AbstractC6492s.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    private final String d(C5969a c5969a, int i10) {
        int iCeil = (int) Math.ceil(i10 / 8.0f);
        byte[] bArr = new byte[iCeil];
        AbstractC3682n.h(c5969a.g(), bArr, 0, 0, iCeil);
        byte b10 = bArr[0];
        if (((byte) (b10 & 3)) > 0) {
            bArr[0] = (byte) (b10 & (-4));
        }
        String strSubstring = c(bArr, "").substring(0, i10 / 4);
        AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        Locale US = Locale.US;
        AbstractC6492s.h(US, "US");
        String upperCase = strSubstring.toUpperCase(US);
        AbstractC6492s.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @Override // F7.C2812a.InterfaceC0239a
    public String a(String mac) {
        String str;
        AbstractC6492s.i(mac, "mac");
        C5969a c5969aE = C5969a.f48518b.e(mac);
        if (c5969aE == null) {
            throw new IllegalArgumentException("Invalid mac address " + mac);
        }
        Iterator it = this.f6030b.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            Map map = (Map) C2814c.f6031a.a().get(Integer.valueOf(iIntValue));
            if (map != null) {
                str = (String) map.get(d(c5969aE, iIntValue));
            }
        } while (str == null);
        return str;
    }
}
