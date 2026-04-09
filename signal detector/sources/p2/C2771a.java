package p2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C0945bf;
import com.google.android.gms.internal.ads.C1270he;
import com.google.android.gms.internal.ads.InterfaceC1054df;
import java.util.Collections;
import java.util.List;
import t2.C2911G;
import t2.x;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2771a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22746a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22747b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1054df f22748c;

    /* renamed from: d, reason: collision with root package name */
    public final C1270he f22749d = new C1270he(Collections.EMPTY_LIST, false);

    public C2771a(Context context, InterfaceC1054df interfaceC1054df) {
        this.f22746a = context;
        this.f22748c = interfaceC1054df;
    }

    public final boolean a() {
        InterfaceC1054df interfaceC1054df = this.f22748c;
        return ((interfaceC1054df == null || !((C0945bf) interfaceC1054df).f13404g.f13593f) && !this.f22749d.f14513a) || this.f22747b;
    }

    public final void b(String str) {
        List<String> list;
        C1270he c1270he = this.f22749d;
        InterfaceC1054df interfaceC1054df = this.f22748c;
        if ((interfaceC1054df == null || !((C0945bf) interfaceC1054df).f13404g.f13593f) && !c1270he.f14513a) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (interfaceC1054df != null) {
            ((C0945bf) interfaceC1054df).b(str, null, 3);
            return;
        }
        if (!c1270he.f14513a || (list = c1270he.f14514b) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                C2911G c2911g = j.f22785C.f22790c;
                new x(this.f22746a, "", strReplace, null).k();
            }
        }
    }
}
