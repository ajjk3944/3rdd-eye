package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class x3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f5255a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f5256b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f5257c;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f5256b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f5257c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
