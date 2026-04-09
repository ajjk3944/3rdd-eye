package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class S2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f35103a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f35104b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f35105c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f35106d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
}
