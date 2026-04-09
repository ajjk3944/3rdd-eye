package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;

/* loaded from: classes3.dex */
public final class P4 implements A4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39953a;

    /* renamed from: b, reason: collision with root package name */
    public final S4 f39954b;

    /* renamed from: c, reason: collision with root package name */
    public final ResultReceiver f39955c;

    public P4(Context context, S4 s42, K4 k42) {
        this.f39953a = context;
        this.f39954b = s42;
        this.f39955c = k42.f39710c;
        s42.a(this);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a(C4683i6 c4683i6, K4 k42) {
        this.f39954b.a(k42.f39709b);
        this.f39954b.a(c4683i6, this);
    }

    public final S4 b() {
        return this.f39954b;
    }

    public final Context c() {
        return this.f39953a;
    }

    public final ResultReceiver d() {
        return this.f39955c;
    }

    public final void a(C4836o4 c4836o4) {
        T6.a(this.f39955c, c4836o4);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a() {
        this.f39954b.b(this);
    }
}
