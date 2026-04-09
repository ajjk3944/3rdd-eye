package com.yandex.mobile.ads.impl;

import android.content.Context;
import d9.C4284b;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class be1 {

    /* renamed from: a, reason: collision with root package name */
    private final la2 f25250a;

    /* renamed from: b, reason: collision with root package name */
    private final ee1 f25251b;

    /* renamed from: c, reason: collision with root package name */
    private final ne1 f25252c;

    public /* synthetic */ be1(Context context, la2 la2Var) {
        this(context, la2Var, new ee1(context), new ne1());
    }

    public final in2 a(List verifications) throws IllegalStateException {
        kotlin.jvm.internal.l.f(verifications, "verifications");
        C4284b c4284bU = E.u.u();
        Iterator it = verifications.iterator();
        while (it.hasNext()) {
            ja2 ja2Var = (ja2) it.next();
            try {
                this.f25252c.getClass();
                c4284bU.add(ne1.a(ja2Var));
            } catch (ka2 e4) {
                this.f25250a.a(e4);
            } catch (Exception unused) {
                fp0.c(new Object[0]);
            }
        }
        C4284b c4284bM = E.u.m(c4284bU);
        if (c4284bM.isEmpty()) {
            return null;
        }
        return n8.a(o8.a(), p8.a(zf1.a(), this.f25251b.a(), c4284bM));
    }

    public be1(Context context, la2 verificationNotExecutedListener, ee1 omSdkJsLoader, ne1 omSdkVerificationScriptResourceCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(verificationNotExecutedListener, "verificationNotExecutedListener");
        kotlin.jvm.internal.l.f(omSdkJsLoader, "omSdkJsLoader");
        kotlin.jvm.internal.l.f(omSdkVerificationScriptResourceCreator, "omSdkVerificationScriptResourceCreator");
        this.f25250a = verificationNotExecutedListener;
        this.f25251b = omSdkJsLoader;
        this.f25252c = omSdkVerificationScriptResourceCreator;
    }
}
