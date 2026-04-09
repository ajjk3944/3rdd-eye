package com.google.gson;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f20732d = new i("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f20733a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20734b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20735c;

    static {
        new i("\n", "  ", true);
    }

    public i(String str, String str2, boolean z3) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f20733a = str;
        this.f20734b = str2;
        this.f20735c = z3;
    }
}
