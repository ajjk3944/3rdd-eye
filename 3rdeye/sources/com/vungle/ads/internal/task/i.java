package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import b9.C2001h;
import b9.InterfaceC2000g;
import com.vungle.ads.ServiceLocator;
import p9.InterfaceC5480a;

/* compiled from: ResendTpatJob.kt */
/* loaded from: classes2.dex */
public final class i implements com.vungle.ads.internal.task.b {
    public static final a Companion = new a(null);
    public static final String TAG = "ResendTpatJob";
    private final Context context;
    private final com.vungle.ads.internal.util.l pathProvider;

    /* compiled from: ResendTpatJob.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final d makeJobInfo() {
            return new d(i.TAG).setPriority(0).setUpdateCurrent(true);
        }

        private a() {
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.network.g> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.g, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.network.g invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.g.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<com.vungle.ads.internal.executor.a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.executor.a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
        }
    }

    public i(Context context, com.vungle.ads.internal.util.l pathProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    /* renamed from: onRunJob$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.g m101onRunJob$lambda0(InterfaceC2000g<com.vungle.ads.internal.network.g> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: onRunJob$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m102onRunJob$lambda1(InterfaceC2000g<? extends com.vungle.ads.internal.executor.a> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    public final Context getContext() {
        return this.context;
    }

    public final com.vungle.ads.internal.util.l getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.b
    public int onRunJob(Bundle bundle, f jobRunner) {
        kotlin.jvm.internal.l.f(bundle, "bundle");
        kotlin.jvm.internal.l.f(jobRunner, "jobRunner");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        Context context = this.context;
        b9.i iVar = b9.i.SYNCHRONIZED;
        InterfaceC2000g interfaceC2000gA = C2001h.a(iVar, new b(context));
        InterfaceC2000g interfaceC2000gA2 = C2001h.a(iVar, new c(this.context));
        new com.vungle.ads.internal.network.e(m101onRunJob$lambda0(interfaceC2000gA), null, null, null, m102onRunJob$lambda1(interfaceC2000gA2).getIoExecutor(), this.pathProvider, null, 64, null).resendStoredTpats$vungle_ads_release(m102onRunJob$lambda1(interfaceC2000gA2).getJobExecutor());
        return 0;
    }
}
