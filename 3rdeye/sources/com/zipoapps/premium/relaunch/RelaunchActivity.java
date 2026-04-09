package com.zipoapps.premium.relaunch;

import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import f8.AbstractActivityC4340c;
import f8.AbstractC4342e;
import g8.C4396a;
import j1.AbstractC5165a;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.x;
import p9.InterfaceC5480a;

/* compiled from: RelaunchActivity.kt */
/* loaded from: classes3.dex */
public final class RelaunchActivity extends AbstractActivityC4340c<C4396a> {

    /* renamed from: j, reason: collision with root package name */
    public final d0 f36988j = new d0(x.a(C4396a.class), new b(), new a(), new c());

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class a extends m implements InterfaceC5480a<f0> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final f0 invoke() {
            return RelaunchActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class b extends m implements InterfaceC5480a<i0> {
        public b() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final i0 invoke() {
            return RelaunchActivity.this.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends m implements InterfaceC5480a<AbstractC5165a> {
        public c() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final AbstractC5165a invoke() {
            return RelaunchActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // f8.AbstractActivityC4340c
    public final AbstractC4342e k() {
        return (C4396a) this.f36988j.getValue();
    }
}
