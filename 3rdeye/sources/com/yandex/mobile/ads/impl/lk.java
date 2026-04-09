package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.v42;

/* loaded from: classes3.dex */
public abstract class lk implements bi1 {

    /* renamed from: a, reason: collision with root package name */
    protected final v42.d f30018a = new v42.d();

    public final boolean b() {
        m60 m60Var = (m60) this;
        return m60Var.getPlaybackState() == 3 && m60Var.getPlayWhenReady() && m60Var.getPlaybackSuppressionReason() == 0;
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final boolean hasNextMediaItem() {
        m60 m60Var = (m60) this;
        v42 currentTimeline = m60Var.getCurrentTimeline();
        if (!currentTimeline.c()) {
            int currentMediaItemIndex = m60Var.getCurrentMediaItemIndex();
            m60Var.d();
            m60Var.e();
            if (currentTimeline.a(currentMediaItemIndex, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final boolean hasPreviousMediaItem() {
        m60 m60Var = (m60) this;
        v42 currentTimeline = m60Var.getCurrentTimeline();
        if (!currentTimeline.c()) {
            int currentMediaItemIndex = m60Var.getCurrentMediaItemIndex();
            m60Var.d();
            m60Var.e();
            if (currentTimeline.b(currentMediaItemIndex, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final boolean isCurrentMediaItemDynamic() {
        m60 m60Var = (m60) this;
        v42 currentTimeline = m60Var.getCurrentTimeline();
        return !currentTimeline.c() && currentTimeline.a(m60Var.getCurrentMediaItemIndex(), this.f30018a, 0L).f34365j;
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final boolean isCurrentMediaItemLive() {
        m60 m60Var = (m60) this;
        v42 currentTimeline = m60Var.getCurrentTimeline();
        return !currentTimeline.c() && currentTimeline.a(m60Var.getCurrentMediaItemIndex(), this.f30018a, 0L).a();
    }

    @Override // com.yandex.mobile.ads.impl.bi1
    public final boolean isCurrentMediaItemSeekable() {
        m60 m60Var = (m60) this;
        v42 currentTimeline = m60Var.getCurrentTimeline();
        return !currentTimeline.c() && currentTimeline.a(m60Var.getCurrentMediaItemIndex(), this.f30018a, 0L).i;
    }
}
