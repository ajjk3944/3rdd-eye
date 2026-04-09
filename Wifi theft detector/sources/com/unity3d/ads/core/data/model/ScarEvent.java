package com.unity3d.ads.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/core/data/model/ScarEvent;", "", "()V", "Show", "Lcom/unity3d/ads/core/data/model/ScarEvent$Show;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ScarEvent {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/ads/core/data/model/ScarEvent$Show;", "Lcom/unity3d/ads/core/data/model/ScarEvent;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Show extends ScarEvent {

        @NotNull
        public static final Show INSTANCE = new Show();

        private Show() {
            super(null);
        }
    }

    public /* synthetic */ ScarEvent(i iVar) {
        this();
    }

    private ScarEvent() {
    }
}
