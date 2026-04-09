package com.opensignal.sdk.domain;

import android.content.Context;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import br.l;
import ch.n;
import cj.t;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/opensignal/sdk/domain/ApplicationLifecycleListener;", "Landroidx/lifecycle/u;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Llq/b0;", "onMoveToForeground", "()V", "onMoveToBackground", "Landroid/content/Context;", "com.opensignal_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApplicationLifecycleListener implements u {
    private final Context context;

    public ApplicationLifecycleListener(Context context) {
        l.e(context, "context");
        this.context = context;
    }

    @OnLifecycleEvent(m.ON_STOP)
    public final void onMoveToBackground() {
        n.b("ApplicationLifecycleListener", "Application moved to background…");
        t.d(this.context, false);
    }

    @OnLifecycleEvent(m.ON_START)
    public final void onMoveToForeground() {
        n.b("ApplicationLifecycleListener", "Application moved to foreground…");
        t.d(this.context, true);
    }
}
