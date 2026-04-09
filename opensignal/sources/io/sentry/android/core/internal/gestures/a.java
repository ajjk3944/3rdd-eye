package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import ir.f0;

/* loaded from: classes.dex */
public final class a implements io.sentry.internal.gestures.a {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.e f11601a;

    public a(io.sentry.util.e eVar) {
        this.f11601a = eVar;
    }

    @Override // io.sentry.internal.gestures.a
    public final io.sentry.internal.gestures.c a(View view, float f10, float f11, io.sentry.internal.gestures.b bVar) {
        if (view != null) {
            if (bVar == io.sentry.internal.gestures.b.CLICKABLE && view.isClickable() && view.getVisibility() == 0) {
                try {
                    return new io.sentry.internal.gestures.c(view, f0.B(view), h.b(view), null, "old_view_system");
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            }
            if (bVar == io.sentry.internal.gestures.b.SCROLLABLE) {
                boolean z10 = false;
                if (((!((Boolean) this.f11601a.a()).booleanValue() ? false : ScrollingView.class.isAssignableFrom(view.getClass())) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0) {
                    z10 = true;
                }
                if (z10) {
                    try {
                        return new io.sentry.internal.gestures.c(view, f0.B(view), h.b(view), null, "old_view_system");
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
            }
        }
        return null;
    }
}
