package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xl1 {

    /* renamed from: d, reason: collision with root package name */
    public static final xl1 f18423d = new xl1("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f18424a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18425b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18426c;

    static {
        new xl1("\n", "  ", true);
    }

    public xl1(String str, String str2, boolean z3) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f18424a = str;
        this.f18425b = str2;
        this.f18426c = z3;
    }
}
