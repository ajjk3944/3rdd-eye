package com.wireguard.config;

/* loaded from: classes4.dex */
public class ParseException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final Class f45606a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f45607b;

    public ParseException(Class cls, CharSequence charSequence, String str, Throwable th2) {
        super(str, th2);
        this.f45606a = cls;
        this.f45607b = charSequence;
    }

    public ParseException(Class cls, CharSequence charSequence, String str) {
        this(cls, charSequence, str, null);
    }

    public ParseException(Class cls, CharSequence charSequence, Throwable th2) {
        this(cls, charSequence, null, th2);
    }

    public ParseException(Class cls, CharSequence charSequence) {
        this(cls, charSequence, null, null);
    }
}
