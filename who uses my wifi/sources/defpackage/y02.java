package defpackage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y02 extends jo1 {
    public final Object r;
    public final t12 s;
    public final /* synthetic */ byte[] t;
    public final /* synthetic */ Map u;
    public final /* synthetic */ wb4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y02(p32 p32Var, int i, String str, t12 t12Var, l92 l92Var, byte[] bArr, Map map, wb4 wb4Var) {
        super(i, str, l92Var);
        this.t = bArr;
        this.u = map;
        this.v = wb4Var;
        this.r = new Object();
        this.s = t12Var;
    }

    @Override // defpackage.jo1
    public final Map e() {
        Map map = this.u;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // defpackage.jo1
    public final byte[] f() {
        byte[] bArr = this.t;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // defpackage.jo1
    public final rl h(ho1 ho1Var) {
        String str;
        String str2;
        byte[] bArr = ho1Var.b;
        try {
            Map map = ho1Var.c;
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
        return new rl(str, wl2.C(ho1Var));
    }

    @Override // defpackage.jo1
    public final void i(Object obj) throws IOException {
        t12 t12Var;
        String str = (String) obj;
        wb4 wb4Var = this.v;
        if (wb4.c() && str != null) {
            wb4Var.e("onNetworkResponseBody", new it3(0, str.getBytes()));
        }
        synchronized (this.r) {
            t12Var = this.s;
        }
        t12Var.a(str);
    }
}
