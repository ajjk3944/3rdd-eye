package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.AbstractC5037m;

/* loaded from: classes3.dex */
final class u implements av {

    /* renamed from: a, reason: collision with root package name */
    private Context f38099a;

    private u() {
    }

    public final u a(Context context) {
        context.getClass();
        this.f38099a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        AbstractC5037m.a(this.f38099a, Context.class);
        return new w(this.f38099a, null);
    }

    /* synthetic */ u(t tVar) {
    }
}
