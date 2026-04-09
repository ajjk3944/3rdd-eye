package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ICrashTransformer;

/* loaded from: classes3.dex */
public final class Mh extends C6 {

    /* renamed from: d, reason: collision with root package name */
    public final Qn f39871d;

    public Mh(Context context, Qn qn, B6 b62, ICrashTransformer iCrashTransformer) {
        this(qn, b62, iCrashTransformer, new C4609fa(context));
    }

    public Mh(Qn qn, B6 b62, ICrashTransformer iCrashTransformer, C4609fa c4609fa) {
        super(b62, iCrashTransformer, c4609fa);
        this.f39871d = qn;
    }
}
