package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1419kK {

    /* renamed from: d, reason: collision with root package name */
    public static final C1419kK f15108d = new C1419kK("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f15109a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15110b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15111c;

    static {
        new C1419kK("\n", "  ", true);
    }

    public C1419kK(String str, String str2, boolean z6) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f15109a = str;
        this.f15110b = str2;
        this.f15111c = z6;
    }
}
