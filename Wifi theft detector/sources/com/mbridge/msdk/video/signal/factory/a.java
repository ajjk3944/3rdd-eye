package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.e;
import com.mbridge.msdk.video.signal.impl.h;
import com.mbridge.msdk.video.signal.j;

/* loaded from: classes3.dex */
public class a implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.signal.b f19523a;

    /* renamed from: b, reason: collision with root package name */
    protected d f19524b;

    /* renamed from: c, reason: collision with root package name */
    protected j f19525c;

    /* renamed from: d, reason: collision with root package name */
    protected g f19526d;

    /* renamed from: e, reason: collision with root package name */
    protected f f19527e;

    /* renamed from: f, reason: collision with root package name */
    protected i f19528f;

    /* renamed from: g, reason: collision with root package name */
    protected c f19529g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.f19523a == null) {
            this.f19523a = new com.mbridge.msdk.video.signal.impl.b();
        }
        return this.f19523a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f19528f == null) {
            this.f19528f = new com.mbridge.msdk.video.signal.impl.g();
        }
        return this.f19528f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f19529g == null) {
            this.f19529g = new com.mbridge.msdk.video.signal.impl.c();
        }
        return this.f19529g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.f19524b == null) {
            this.f19524b = new com.mbridge.msdk.video.signal.impl.d();
        }
        return this.f19524b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.f19527e == null) {
            this.f19527e = new e();
        }
        return this.f19527e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f19526d == null) {
            this.f19526d = new com.mbridge.msdk.video.signal.impl.f();
        }
        return this.f19526d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f19525c == null) {
            this.f19525c = new h();
        }
        return this.f19525c;
    }
}
