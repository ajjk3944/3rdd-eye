package com.mbridge.msdk.video.module.listener.impl;

/* loaded from: classes3.dex */
public class i extends f {

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.listener.a f19185a;

    public i(com.mbridge.msdk.video.module.listener.a aVar) {
        this.f19185a = aVar;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        com.mbridge.msdk.video.module.listener.a aVar = this.f19185a;
        if (aVar != null) {
            aVar.a(i10, obj);
        }
    }
}
