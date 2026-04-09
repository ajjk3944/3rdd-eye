package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends com.bytedance.sdk.component.vt.ouw.yu {
    public static volatile tlj ouw;
    private ExecutorService yu;
    List<com.bytedance.sdk.component.vt.ouw.vt> vt = new CopyOnWriteArrayList();

    /* renamed from: lh, reason: collision with root package name */
    private List<com.bytedance.sdk.component.vt.ouw.vt> f7655lh = new CopyOnWriteArrayList();

    public ouw(ExecutorService executorService) {
        this.yu = executorService;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final List<com.bytedance.sdk.component.vt.ouw.vt> fkw() {
        return this.f7655lh;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final ExecutorService lh() {
        ExecutorService executorServiceOuw = ouw != null ? ouw.ouw() : null;
        return executorServiceOuw != null ? executorServiceOuw : this.yu;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final int vt() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final List<com.bytedance.sdk.component.vt.ouw.vt> yu() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final void ouw() {
    }
}
