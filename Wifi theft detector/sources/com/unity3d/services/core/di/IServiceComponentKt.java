package com.unity3d.services.core.di;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import l9.a;
import org.jetbrains.annotations.NotNull;
import y8.h;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/unity3d/services/core/di/IServiceComponent;", "", "named", "get", "(Lcom/unity3d/services/core/di/IServiceComponent;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/LazyThreadSafetyMode;", "mode", "Ly8/h;", "inject", "(Lcom/unity3d/services/core/di/IServiceComponent;Ljava/lang/String;Lkotlin/LazyThreadSafetyMode;)Ly8/h;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IServiceComponentKt {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nIServiceComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IServiceComponent.kt\ncom/unity3d/services/core/di/IServiceComponentKt$inject$1\n+ 2 IServiceComponent.kt\ncom/unity3d/services/core/di/IServiceComponentKt\n*L\n1#1,33:1\n19#2:34\n*S KotlinDebug\n*F\n+ 1 IServiceComponent.kt\ncom/unity3d/services/core/di/IServiceComponentKt$inject$1\n*L\n33#1:34\n*E\n"})
    /* renamed from: com.unity3d.services.core.di.IServiceComponentKt$inject$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Lambda implements a {
        final /* synthetic */ String $named;
        final /* synthetic */ IServiceComponent $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IServiceComponent iServiceComponent, String str) {
            super(0);
            this.$this_inject = iServiceComponent;
            this.$named = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        @Override // l9.a
        @NotNull
        public final T invoke() {
            IServiceComponent iServiceComponent = this.$this_inject;
            String str = this.$named;
            IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
            p.j(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return registry.getService(str, t.b(Object.class));
        }
    }

    public static final /* synthetic */ <T> T get(IServiceComponent iServiceComponent, String named) {
        p.e(iServiceComponent, "<this>");
        p.e(named, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        p.j(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) registry.getService(named, t.b(Object.class));
    }

    public static /* synthetic */ Object get$default(IServiceComponent iServiceComponent, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        p.e(iServiceComponent, "<this>");
        p.e(named, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        p.j(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return registry.getService(named, t.b(Object.class));
    }

    public static final /* synthetic */ <T> h inject(IServiceComponent iServiceComponent, String named, LazyThreadSafetyMode mode) {
        p.e(iServiceComponent, "<this>");
        p.e(named, "named");
        p.e(mode, "mode");
        p.i();
        return b.a(mode, new AnonymousClass1(iServiceComponent, named));
    }

    public static /* synthetic */ h inject$default(IServiceComponent iServiceComponent, String named, LazyThreadSafetyMode mode, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        if ((i10 & 2) != 0) {
            mode = LazyThreadSafetyMode.f21909c;
        }
        p.e(iServiceComponent, "<this>");
        p.e(named, "named");
        p.e(mode, "mode");
        p.i();
        return b.a(mode, new AnonymousClass1(iServiceComponent, named));
    }
}
