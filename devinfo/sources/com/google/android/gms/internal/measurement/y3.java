package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class y3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f20044a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f20045b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f20046c;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f20045b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f20046c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
