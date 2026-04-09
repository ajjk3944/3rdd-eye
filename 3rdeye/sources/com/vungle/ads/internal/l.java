package com.vungle.ads.internal;

import android.content.Context;
import b9.C2001h;
import b9.InterfaceC2000g;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleAds;
import e6.C4321c;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* compiled from: VungleInternal.kt */
/* loaded from: classes2.dex */
public final class l {

    /* compiled from: ServiceLocator.kt */
    public static final class a extends m implements InterfaceC5480a<com.vungle.ads.internal.util.d> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.d, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.util.d invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.util.d.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class b extends m implements InterfaceC5480a<com.vungle.ads.internal.executor.d> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.d, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.executor.d invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.d.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class c extends m implements InterfaceC5480a<com.vungle.ads.internal.bidding.a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.bidding.a, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.bidding.a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.bidding.a.class);
        }
    }

    /* renamed from: getAvailableBidTokens$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.util.d m68getAvailableBidTokens$lambda0(InterfaceC2000g<com.vungle.ads.internal.util.d> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: getAvailableBidTokens$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.d m69getAvailableBidTokens$lambda1(InterfaceC2000g<com.vungle.ads.internal.executor.d> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: getAvailableBidTokens$lambda-2, reason: not valid java name */
    private static final com.vungle.ads.internal.bidding.a m70getAvailableBidTokens$lambda2(InterfaceC2000g<com.vungle.ads.internal.bidding.a> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAvailableBidTokens$lambda-3, reason: not valid java name */
    public static final String m71getAvailableBidTokens$lambda3(InterfaceC2000g bidTokenEncoder$delegate) {
        kotlin.jvm.internal.l.f(bidTokenEncoder$delegate, "$bidTokenEncoder$delegate");
        return m70getAvailableBidTokens$lambda2(bidTokenEncoder$delegate).encode();
    }

    public final String getAvailableBidTokens(Context context) throws Throwable {
        kotlin.jvm.internal.l.f(context, "context");
        if (!VungleAds.Companion.isInitialized()) {
            C4321c c4321c = C4321c.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.l.e(applicationContext, "context.applicationContext");
            c4321c.init(applicationContext);
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        b9.i iVar = b9.i.SYNCHRONIZED;
        InterfaceC2000g interfaceC2000gA = C2001h.a(iVar, new a(context));
        return (String) new com.vungle.ads.internal.executor.b(m69getAvailableBidTokens$lambda1(C2001h.a(iVar, new b(context))).getApiExecutor().submit(new k(C2001h.a(iVar, new c(context)), 0))).get(m68getAvailableBidTokens$lambda0(interfaceC2000gA).getTimeout(), TimeUnit.MILLISECONDS);
    }

    public final String getSdkVersion() {
        return "7.4.1";
    }
}
