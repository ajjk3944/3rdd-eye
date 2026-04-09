package Yf;

import com.wireguard.config.ParseException;
import java.net.Inet4Address;
import java.net.InetAddress;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final InetAddress f24966a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24967b;

    private d(InetAddress inetAddress, int i10) {
        this.f24966a = inetAddress;
        this.f24967b = i10;
    }

    public static d c(String str) throws NoSuchMethodException, NumberFormatException, ParseException {
        String strSubstring;
        int i10;
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf >= 0) {
            strSubstring = str.substring(iLastIndexOf + 1);
            try {
                i10 = Integer.parseInt(strSubstring, 10);
                str = str.substring(0, iLastIndexOf);
            } catch (NumberFormatException unused) {
                throw new ParseException(Integer.class, strSubstring);
            }
        } else {
            strSubstring = "";
            i10 = -1;
        }
        InetAddress inetAddressA = b.a(str);
        int i11 = inetAddressA instanceof Inet4Address ? 32 : 128;
        if (i10 > i11) {
            throw new ParseException(d.class, strSubstring, "Invalid network mask");
        }
        if (i10 < 0) {
            i10 = i11;
        }
        return new d(inetAddressA, i10);
    }

    public InetAddress a() {
        return this.f24966a;
    }

    public int b() {
        return this.f24967b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f24966a.equals(dVar.f24966a) && this.f24967b == dVar.f24967b;
    }

    public int hashCode() {
        return this.f24966a.hashCode() ^ this.f24967b;
    }

    public String toString() {
        return this.f24966a.getHostAddress() + '/' + this.f24967b;
    }
}
