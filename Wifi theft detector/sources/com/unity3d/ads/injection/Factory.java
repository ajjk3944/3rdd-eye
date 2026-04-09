package com.unity3d.ads.injection;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import l9.a;
import org.jetbrains.annotations.NotNull;
import y8.h;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\r\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/injection/Factory;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ly8/h;", "Lkotlin/Function0;", "initializer", "<init>", "(Ll9/a;)V", "", "isInitialized", "()Z", "Ll9/a;", "getValue", "()Ljava/lang/Object;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Factory<T> implements h {

    @NotNull
    private final a initializer;

    public Factory(@NotNull a initializer) {
        p.e(initializer, "initializer");
        this.initializer = initializer;
    }

    @Override // y8.h
    public T getValue() {
        return (T) this.initializer.invoke();
    }

    public boolean isInitialized() {
        return false;
    }
}
