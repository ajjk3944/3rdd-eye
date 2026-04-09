package io.sentry;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d6 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.t f12197a;

    /* renamed from: b, reason: collision with root package name */
    public final n6 f12198b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f12199c;

    static {
        Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);
    }

    public d6(io.sentry.protocol.t tVar, n6 n6Var, Boolean bool) {
        this.f12197a = tVar;
        this.f12198b = n6Var;
        this.f12199c = bool;
    }

    public final String a() {
        n6 n6Var = this.f12198b;
        io.sentry.protocol.t tVar = this.f12197a;
        Boolean bool = this.f12199c;
        if (bool == null) {
            return tVar + "-" + n6Var;
        }
        return tVar + "-" + n6Var + "-" + (bool.booleanValue() ? "1" : "0");
    }
}
