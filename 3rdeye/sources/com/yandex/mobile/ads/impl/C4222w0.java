package com.yandex.mobile.ads.impl;

import android.content.pm.ActivityInfo;
import c9.C2078B;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4222w0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f34766a = "com.yandex.mobile.ads.common.AdActivity has missed configuration attribute %s.";

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Integer, String> f34767b = C2078B.o(new b9.l(16, "ActivityInfo.CONFIG_KEYBOARD"), new b9.l(32, "ActivityInfo.CONFIG_KEYBOARD_HIDDEN"), new b9.l(128, "ActivityInfo.CONFIG_ORIENTATION"), new b9.l(256, "ActivityInfo.CONFIG_SCREEN_LAYOUT"), new b9.l(Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH), "ActivityInfo.CONFIG_UI_MODE"), new b9.l(1024, "ActivityInfo.CONFIG_SCREEN_SIZE"), new b9.l(2048, "CONFIG_SMALLEST_SCREEN_SIZE"));

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ActivityInfo adActivity) {
        String str;
        kotlin.jvm.internal.l.f(adActivity, "adActivity");
        Map<Integer, String> map = f34767b;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, String> next = it.next();
            int iIntValue = next.getKey().intValue();
            String value = next.getValue();
            if ((iIntValue & adActivity.configChanges) == 0) {
                str = value;
            }
            arrayList.add(str);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((String) next2) != null) {
                str = next2;
                break;
            }
        }
        String str2 = str;
        if (str2 == null) {
            return;
        }
        String strA = C4215v0.a(new Object[]{str2}, 1, f34766a, "format(...)");
        throw new oo0(strA, strA);
    }
}
