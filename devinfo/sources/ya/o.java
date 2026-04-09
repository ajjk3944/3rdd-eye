package ya;

import com.google.android.gms.internal.ads.fa;
import com.google.android.gms.internal.ads.ha;
import com.google.android.gms.internal.ads.ls;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o extends ha {

    /* renamed from: m, reason: collision with root package name */
    public final Object f37478m;

    /* renamed from: n, reason: collision with root package name */
    public final p f37479n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ byte[] f37480o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Map f37481p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ za.f f37482q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, int i4, String str, p pVar, n nVar, byte[] bArr, Map map, za.f fVar) {
        super(i4, str, nVar);
        this.f37480o = bArr;
        this.f37481p = map;
        this.f37482q = fVar;
        this.f37478m = new Object();
        this.f37479n = pVar;
    }

    @Override // com.google.android.gms.internal.ads.ha
    public final Map f() {
        Map map = this.f37481p;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.ha
    public final byte[] g() {
        byte[] bArr = this.f37480o;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.ha
    public final b5.i0 i(fa faVar) {
        String str;
        String str2;
        byte[] bArr = faVar.f11075b;
        try {
            Map map = faVar.f11076c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i4 = 1;
                while (true) {
                    if (i4 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i4].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i4++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new b5.i0(str, ls.e(faVar));
    }

    @Override // com.google.android.gms.internal.ads.ha
    public final void j(Object obj) throws IOException {
        p pVar;
        String str = (String) obj;
        za.f fVar = this.f37482q;
        if (za.f.c() && str != null) {
            fVar.e("onNetworkResponseBody", new nm.d0(24, str.getBytes()));
        }
        synchronized (this.f37478m) {
            pVar = this.f37479n;
        }
        pVar.b(str);
    }
}
