package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.AbstractC5037m;

/* loaded from: classes3.dex */
final class q implements x {

    /* renamed from: a, reason: collision with root package name */
    private Context f38092a;

    private q() {
    }

    public final q a(Context context) {
        context.getClass();
        this.f38092a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        AbstractC5037m.a(this.f38092a, Context.class);
        return new s(this.f38092a, null);
    }

    /* synthetic */ q(p pVar) {
    }
}
