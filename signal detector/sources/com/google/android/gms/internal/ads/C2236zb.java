package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.zb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2236zb implements NA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17885b;

    public /* synthetic */ C2236zb(String str, int i) {
        this.f17884a = i;
        this.f17885b = str;
    }

    @Override // com.google.android.gms.internal.ads.NA
    public final Object apply(Object obj) {
        int i = this.f17884a;
        String strReplace = this.f17885b;
        switch (i) {
            case 0:
                String str = (String) obj;
                C2128xb c2128xb = AbstractC0449Cb.f7599a;
                if (str == null) {
                    return strReplace;
                }
                if (((Boolean) AbstractC1320ia.f14728f.v()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(strReplace).getHost();
                    for (int i3 = 0; i3 < 3; i3++) {
                        if (!host.endsWith(strArr[i3])) {
                        }
                    }
                    return strReplace;
                }
                String str2 = (String) AbstractC1320ia.f14723a.v();
                String str3 = (String) AbstractC1320ia.f14724b.v();
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
                C2128xb c2128xb2 = AbstractC0449Cb.f7599a;
                if (((Boolean) AbstractC1320ia.i.v()).booleanValue()) {
                    p2.j.f22785C.f22795h.f("prepareClickUrl.attestation2", th);
                }
                return strReplace;
            case 2:
                return new C0766Um(strReplace, (BinderC0465Da) obj);
            default:
                Throwable th2 = (Throwable) obj;
                C1875ss c1875ss = Gs.f8456k;
                u2.k.e("Error calling adapter: ".concat(String.valueOf(strReplace)));
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.ne)).booleanValue()) {
                    p2.j.f22785C.f22795h.g("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th2);
                    return null;
                }
                p2.j.f22785C.f22795h.f("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th2);
                return null;
        }
    }
}
