package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2102x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f17538a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f17539b = "media3.common";

    public static synchronized void a(String str) {
        if (f17538a.add(str)) {
            String str2 = f17539b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
            sb.append(str2);
            sb.append(", ");
            sb.append(str);
            f17539b = sb.toString();
        }
    }
}
