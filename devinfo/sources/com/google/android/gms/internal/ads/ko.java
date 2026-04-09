package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements z21 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13218b;

    public /* synthetic */ ko(String str, int i4) {
        this.f13217a = i4;
        this.f13218b = str;
    }

    @Override // com.google.android.gms.internal.ads.z21
    public final Object apply(Object obj) {
        int i4 = this.f13217a;
        String strReplace = this.f13218b;
        switch (i4) {
            case 0:
                String str = (String) obj;
                io ioVar = no.f14362a;
                if (str == null) {
                    return strReplace;
                }
                if (((Boolean) tl.f16874f.u()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(strReplace).getHost();
                    for (int i10 = 0; i10 < 3; i10++) {
                        if (!host.endsWith(strArr[i10])) {
                        }
                    }
                    return strReplace;
                }
                String str2 = (String) tl.f16869a.u();
                String str3 = (String) tl.f16870b.u();
                if (!TextUtils.isEmpty(str2)) {
                    strReplace = strReplace.replace(str2, str);
                }
                if (TextUtils.isEmpty(str3)) {
                    return strReplace;
                }
                Uri uri = Uri.parse(strReplace);
                return TextUtils.isEmpty(uri.getQueryParameter(str3)) ? uri.buildUpon().appendQueryParameter(str3, str).toString() : strReplace;
            case 1:
                Throwable th2 = (Throwable) obj;
                io ioVar2 = no.f14362a;
                if (((Boolean) tl.f16876i.u()).booleanValue()) {
                    ua.j.C.f35265h.f("prepareClickUrl.attestation2", th2);
                }
                return strReplace;
            case 2:
                return new pb0(strReplace, (om) obj);
            default:
                Throwable th3 = (Throwable) obj;
                tm0 tm0Var = kn0.f13207k;
                za.i.e("Error calling adapter: ".concat(String.valueOf(strReplace)));
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16280pe)).booleanValue()) {
                    ua.j.C.f35265h.g("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th3);
                    return null;
                }
                ua.j.C.f35265h.f("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th3);
                return null;
        }
    }
}
