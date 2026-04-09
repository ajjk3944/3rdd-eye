package t2;

import com.google.android.gms.internal.ads.A4;
import com.google.android.gms.internal.ads.AbstractC2022vd;
import com.google.android.gms.internal.ads.C4;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class r extends C4 {

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ byte[] f23650C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ Map f23651D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ u2.h f23652E;

    /* renamed from: m, reason: collision with root package name */
    public final Object f23653m;

    /* renamed from: n, reason: collision with root package name */
    public final s f23654n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, int i, String str, s sVar, q qVar, byte[] bArr, Map map, u2.h hVar) {
        super(i, str, qVar);
        this.f23650C = bArr;
        this.f23651D = map;
        this.f23652E = hVar;
        this.f23653m = new Object();
        this.f23654n = sVar;
    }

    @Override // com.google.android.gms.internal.ads.C4
    public final Map f() {
        Map map = this.f23651D;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.C4
    public final byte[] g() {
        byte[] bArr = this.f23650C;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.C4
    public final A1.s i(A4 a42) {
        String str;
        String str2;
        byte[] bArr = a42.f6927b;
        try {
            Map map = a42.f6928c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new A1.s(str, AbstractC2022vd.c(a42));
    }

    @Override // com.google.android.gms.internal.ads.C4
    public final void j(Object obj) throws IOException {
        s sVar;
        String str = (String) obj;
        u2.h hVar = this.f23652E;
        if (u2.h.c() && str != null) {
            hVar.e("onNetworkResponseBody", new h2.d(str.getBytes()));
        }
        synchronized (this.f23653m) {
            sVar = this.f23654n;
        }
        sVar.b(str);
    }
}
