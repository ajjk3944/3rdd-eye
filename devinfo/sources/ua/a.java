package ua;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.sv;
import com.google.android.gms.internal.ads.uv;
import com.google.android.gms.internal.ads.yt;
import java.util.Collections;
import java.util.List;
import ya.f0;
import ya.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f35222a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35223b;

    /* renamed from: c, reason: collision with root package name */
    public final uv f35224c;

    /* renamed from: d, reason: collision with root package name */
    public final yt f35225d = new yt(Collections.EMPTY_LIST, false);

    public a(Context context, uv uvVar) {
        this.f35222a = context;
        this.f35224c = uvVar;
    }

    public final boolean a() {
        uv uvVar = this.f35224c;
        return ((uvVar == null || !((sv) uvVar).g.f16973f) && !this.f35225d.f18853a) || this.f35223b;
    }

    public final void b(String str) {
        List<String> list;
        yt ytVar = this.f35225d;
        uv uvVar = this.f35224c;
        if ((uvVar == null || !((sv) uvVar).g.f16973f) && !ytVar.f18853a) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (uvVar != null) {
            ((sv) uvVar).b(str, null, 3);
            return;
        }
        if (!ytVar.f18853a || (list = ytVar.f18854b) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                f0 f0Var = j.C.f35261c;
                new u(this.f35222a, "", strReplace, null).A();
            }
        }
    }
}
