package com.bytedance.sdk.component.zz;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class ypw {
    public static boolean emc(List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (Pattern.matches(it.next(), str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
