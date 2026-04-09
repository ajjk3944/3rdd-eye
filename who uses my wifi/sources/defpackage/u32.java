package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class u32 implements zk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ u32(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.zk3
    public final Object apply(Object obj) {
        int i = this.a;
        String strReplace = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                o32 o32Var = x32.a;
                if (str == null) {
                    return strReplace;
                }
                if (((Boolean) r02.f.w()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(strReplace).getHost();
                    for (int i2 = 0; i2 < 3; i2++) {
                        if (!host.endsWith(strArr[i2])) {
                        }
                    }
                    return strReplace;
                }
                String str2 = (String) r02.a.w();
                String str3 = (String) r02.b.w();
                if (!TextUtils.isEmpty(str2)) {
                    strReplace = strReplace.replace(str2, str);
                }
                if (TextUtils.isEmpty(str3)) {
                    return strReplace;
                }
                Uri uri = Uri.parse(strReplace);
                return TextUtils.isEmpty(uri.getQueryParameter(str3)) ? uri.buildUpon().appendQueryParameter(str3, str).toString() : strReplace;
            case 1:
                Throwable th = (Throwable) obj;
                o32 o32Var2 = x32.a;
                if (((Boolean) r02.i.w()).booleanValue()) {
                    hg4.C.h.d("prepareClickUrl.attestation2", th);
                }
                return strReplace;
            case 2:
                return new it2(strReplace, (p12) obj);
            default:
                Throwable th2 = (Throwable) obj;
                n43 n43Var = i53.k;
                gi2.Z("Error calling adapter: ".concat(String.valueOf(strReplace)));
                if (((Boolean) tw1.e.c.a(mz1.Qd)).booleanValue()) {
                    hg4.C.h.e("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th2);
                    return null;
                }
                hg4.C.h.d("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th2);
                return null;
        }
    }
}
