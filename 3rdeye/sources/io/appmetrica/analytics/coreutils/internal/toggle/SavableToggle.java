package io.appmetrica.analytics.coreutils.internal.toggle;

import androidx.work.s;
import io.appmetrica.analytics.coreapi.internal.data.Savable;
import io.appmetrica.analytics.coreapi.internal.data.Updatable;

/* loaded from: classes3.dex */
public final class SavableToggle extends SimpleThreadSafeToggle implements Updatable<Boolean> {

    /* renamed from: d, reason: collision with root package name */
    private final Savable f39007d;

    public SavableToggle(String str, Savable<Boolean> savable) {
        super(savable.getValue().booleanValue(), s.e("[SavableToggle - ", str, ']'));
        this.f39007d = savable;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Updatable
    public /* bridge */ /* synthetic */ void update(Boolean bool) {
        update(bool.booleanValue());
    }

    public void update(boolean z10) {
        updateState(z10);
        this.f39007d.setValue(Boolean.valueOf(getActualState()));
    }
}
