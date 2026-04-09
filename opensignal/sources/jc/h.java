package jc;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import io.sentry.android.core.e0;

/* loaded from: classes.dex */
public final class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13602a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Intent f13603d;

    public h(Context context, Intent intent) {
        this.f13602a = context;
        this.f13603d = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f13602a.startActivity(this.f13603d);
        } catch (ActivityNotFoundException e4) {
            e0.c("DeferredLifecycleHelper", "Failed to start resolution intent", e4);
        }
    }
}
