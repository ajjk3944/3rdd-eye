package com.bumptech.glide.load.engine;

import G2.a;
import java.io.File;

/* loaded from: classes.dex */
class e implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private final C2.d f34322a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f34323b;

    /* renamed from: c, reason: collision with root package name */
    private final C2.g f34324c;

    e(C2.d dVar, Object obj, C2.g gVar) {
        this.f34322a = dVar;
        this.f34323b = obj;
        this.f34324c = gVar;
    }

    @Override // G2.a.b
    public boolean a(File file) {
        return this.f34322a.a(this.f34323b, file, this.f34324c);
    }
}
