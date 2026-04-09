package kg;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f14412b;

    /* renamed from: a, reason: collision with root package name */
    public cj.a f14413a;

    public final synchronized u a() {
        String str;
        u uVar;
        cj.a aVar = this.f14413a;
        synchronized (((ArrayDeque) aVar.f3977x)) {
            str = (String) ((ArrayDeque) aVar.f3977x).peek();
        }
        Pattern pattern = u.f14408d;
        uVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                uVar = new u(strArrSplit[0], strArrSplit[1]);
            }
        }
        return uVar;
    }
}
