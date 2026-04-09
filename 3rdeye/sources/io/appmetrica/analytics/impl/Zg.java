package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Zg extends AbstractC4539ch {
    public Zg(C4940s5 c4940s5) {
        super(c4940s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    public final boolean a(C4683i6 c4683i6) {
        String value = c4683i6.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!com.vungle.ads.internal.presenter.g.OPEN.equals(jSONObject.optString("type"))) {
                return false;
            }
            C4933ro c4933ro = this.f40632a.f41617t;
            synchronized (c4933ro) {
                c4933ro.c(c4933ro.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            c4683i6.f41056n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        C4933ro c4933ro = this.f40632a.f41617t;
        synchronized (c4933ro) {
            c4933ro.a(c4933ro.a() + 1);
        }
        this.f40632a.y();
        C4531c9 c4531c9 = this.f40632a.f41609l;
        if (c4531c9.f40620c == null) {
            c4531c9.a();
        }
        C4582e9 c4582e9 = c4531c9.f40620c;
        c4582e9.getClass();
        c4582e9.f40797b = new HashSet();
        c4582e9.f40799d = 0;
        C4582e9 c4582e92 = c4531c9.f40620c;
        c4582e92.f40796a = true;
        C4660h9 c4660h9 = c4531c9.f40619b;
        IBinaryDataHelper iBinaryDataHelper = c4660h9.f40996c;
        C4634g9 c4634g9 = c4660h9.f40995b;
        c4660h9.f40994a.getClass();
        M9 m9A = C4608f9.a(c4582e92);
        c4634g9.getClass();
        iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(m9A));
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C4911r2 c4911r2 = this.f40632a.s().f40664z;
                    for (String str2 : queryParameter.split("&")) {
                        int iIndexOf = str2.indexOf("=");
                        if (iIndexOf >= 0 && a(Uri.decode(str2.substring(0, iIndexOf)), Uri.decode(str2.substring(iIndexOf + 1)), c4911r2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C4911r2 c4911r2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c4911r2 == null) {
            return false;
        }
        for (Pair pair : c4911r2.f41527a) {
            if (AbstractC4623fo.a(pair.first, str) && ((obj = pair.second) == null || ((C4886q2) obj).f41449a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
