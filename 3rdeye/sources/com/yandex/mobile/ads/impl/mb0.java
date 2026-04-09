package com.yandex.mobile.ads.impl;

import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.InterfaceC1789w;
import androidx.lifecycle.InterfaceC1790x;

/* loaded from: classes3.dex */
public final class mb0 implements InterfaceC1790x {

    /* renamed from: a, reason: collision with root package name */
    private final a f30328a = new a();

    public static final class a extends AbstractC1781n {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1781n.b f30329a = AbstractC1781n.b.STARTED;

        @Override // androidx.lifecycle.AbstractC1781n
        public final void addObserver(InterfaceC1789w observer) {
            kotlin.jvm.internal.l.f(observer, "observer");
        }

        @Override // androidx.lifecycle.AbstractC1781n
        public final AbstractC1781n.b getCurrentState() {
            return this.f30329a;
        }

        @Override // androidx.lifecycle.AbstractC1781n
        public final void removeObserver(InterfaceC1789w observer) {
            kotlin.jvm.internal.l.f(observer, "observer");
        }
    }

    @Override // androidx.lifecycle.InterfaceC1790x
    public final AbstractC1781n getLifecycle() {
        return this.f30328a;
    }
}
