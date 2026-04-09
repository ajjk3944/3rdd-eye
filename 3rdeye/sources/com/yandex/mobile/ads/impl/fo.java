package com.yandex.mobile.ads.impl;

import com.singular.sdk.internal.Constants;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class fo {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f27408a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f27409b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f27410c = Charset.forName(Constants.ENCODING);

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f27411d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f27412e;

    static {
        Charset.forName("UTF-16BE");
        f27411d = Charset.forName("UTF-16LE");
        f27412e = Charset.forName("UTF-16");
    }
}
