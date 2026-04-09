package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Hi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541Hi implements InterfaceC0466Db {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0575Ji f8987b;

    public /* synthetic */ C0541Hi(C0575Ji c0575Ji, int i) {
        this.f8986a = i;
        this.f8987b = c0575Ji;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    public final void e(Object obj, Map map) {
        switch (this.f8986a) {
            case 0:
                C0575Ji c0575Ji = this.f8987b;
                c0575Ji.getClass();
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str) && str.equals(c0575Ji.f9335a)) {
                        c0575Ji.f9337c.execute(new RunnableC1883t(29, this));
                        break;
                    }
                }
                break;
            default:
                C0575Ji c0575Ji2 = this.f8987b;
                c0575Ji2.getClass();
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2) && str2.equals(c0575Ji2.f9335a)) {
                        c0575Ji2.f9337c.execute(new RunnableC0558Ii(0, this));
                        break;
                    }
                }
                break;
        }
    }
}
