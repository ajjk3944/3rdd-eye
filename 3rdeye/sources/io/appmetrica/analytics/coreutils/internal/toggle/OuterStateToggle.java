package io.appmetrica.analytics.coreutils.internal.toggle;

/* loaded from: classes3.dex */
public final class OuterStateToggle extends SimpleThreadSafeToggle {
    public OuterStateToggle(boolean z10, String str) {
        super(z10, str);
    }

    public final void update(boolean z10) {
        updateState(z10);
    }
}
