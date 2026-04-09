package com.google.gson;

import java.util.Objects;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f38939d = new d("", "", false);

    /* renamed from: e, reason: collision with root package name */
    public static final d f38940e = new d("\n", "  ", true);

    /* renamed from: a, reason: collision with root package name */
    private final String f38941a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38942b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38943c;

    private d(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f38941a = str;
        this.f38942b = str2;
        this.f38943c = z10;
    }

    public String a() {
        return this.f38942b;
    }

    public String b() {
        return this.f38941a;
    }

    public boolean c() {
        return this.f38943c;
    }
}
