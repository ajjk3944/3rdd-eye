package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class O4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f36149a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36150b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f36151c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Bundle f36152d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f36153e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ boolean f36154f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ boolean f36155g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ String f36156h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36157i;

    O4(C4945r4 c4945r4, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f36149a = str;
        this.f36150b = str2;
        this.f36151c = j10;
        this.f36152d = bundle;
        this.f36153e = z10;
        this.f36154f = z11;
        this.f36155g = z12;
        this.f36156h = str3;
        this.f36157i = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f36157i.h0(this.f36149a, this.f36150b, this.f36151c, this.f36152d, this.f36153e, this.f36154f, this.f36155g, this.f36156h);
    }
}
