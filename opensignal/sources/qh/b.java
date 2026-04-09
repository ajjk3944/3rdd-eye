package qh;

import android.text.TextUtils;
import ch.n;
import dt.w;
import nh.c;
import nh.l;

/* loaded from: classes.dex */
public final class b extends w {

    /* renamed from: e, reason: collision with root package name */
    public a f20905e;

    @Override // dt.w
    public final l d(String str) {
        String str2;
        String str3;
        int iA;
        a aVar = this.f20905e;
        c cVar = new c();
        if (!TextUtils.isEmpty(str)) {
            String quality = aVar.getQuality();
            if (str.contains(quality)) {
                String[] strArrSplit = str.split(quality);
                if (strArrSplit.length > 0 && (str2 = strArrSplit[1]) != null) {
                    String[] strArrSplit2 = str2.split("\"");
                    if (strArrSplit2.length > 0 && (str3 = strArrSplit2[0]) != null && (iA = ((wh.a) this.f7549d).a(str3)) >= 200 && iA < 299) {
                        n.b("FacebookResourceGetter", "Facebook url: ", "" + aVar.name() + " = [" + str3 + "]");
                        cVar.f17619a = str3;
                    }
                }
            }
        }
        return cVar;
    }
}
