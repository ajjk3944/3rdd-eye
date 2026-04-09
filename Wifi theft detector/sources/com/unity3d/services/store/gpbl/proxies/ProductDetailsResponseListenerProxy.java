package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/unity3d/services/store/gpbl/proxies/ProductDetailsResponseListenerProxy;", "Lcom/unity3d/services/core/reflection/GenericListenerProxy;", "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsResponseListener;", "productDetailsResponseListener", "<init>", "(Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsResponseListener;)V", "", "billingResult", "productDetailsResult", "Ly8/s;", "onPurchasesUpdated", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Ljava/lang/Class;", "getProxyClass", "()Ljava/lang/Class;", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsResponseListener;", "getProductDetailsResponseListener", "()Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsResponseListener;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProductDetailsResponseListenerProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductDetailsResponseListenerProxy.kt\ncom/unity3d/services/store/gpbl/proxies/ProductDetailsResponseListenerProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
/* loaded from: classes3.dex */
public final class ProductDetailsResponseListenerProxy extends GenericListenerProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String onProductDetailsResponseMethodName = "onProductDetailsResponse";

    @Nullable
    private final ProductDetailsResponseListener productDetailsResponseListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/store/gpbl/proxies/ProductDetailsResponseListenerProxy$Companion;", "", "()V", "onProductDetailsResponseMethodName", "", "getProxyListenerClass", "Ljava/lang/Class;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final Class<?> getProxyListenerClass() throws ClassNotFoundException {
            p.d(com.android.billingclient.api.ProductDetailsResponseListener.class, "forName(\"com.android.bil…DetailsResponseListener\")");
            return com.android.billingclient.api.ProductDetailsResponseListener.class;
        }

        private Companion() {
        }
    }

    public ProductDetailsResponseListenerProxy(@Nullable ProductDetailsResponseListener productDetailsResponseListener) {
        this.productDetailsResponseListener = productDetailsResponseListener;
    }

    private final void onPurchasesUpdated(Object billingResult, Object productDetailsResult) {
        QueryProductDetailsResultsBridge queryProductDetailsResultsBridge = new QueryProductDetailsResultsBridge(productDetailsResult);
        ProductDetailsResponseListener productDetailsResponseListener = this.productDetailsResponseListener;
        if (productDetailsResponseListener != null) {
            productDetailsResponseListener.onProductDetailsResponse(new BillingResultBridge(billingResult), queryProductDetailsResultsBridge);
        }
    }

    @Nullable
    public final ProductDetailsResponseListener getProductDetailsResponseListener() {
        return this.productDetailsResponseListener;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    @NotNull
    public Class<?> getProxyClass() {
        return INSTANCE.getProxyListenerClass();
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    @Nullable
    public Object invoke(@NotNull Object proxy, @NotNull Method method, @Nullable Object[] args) {
        Object obj;
        p.e(proxy, "proxy");
        p.e(method, "method");
        if (!p.a(method.getName(), onProductDetailsResponseMethodName)) {
            return super.invoke(proxy, method, args);
        }
        if (args != null && (obj = args[1]) != null) {
            onPurchasesUpdated(args[0], obj);
        }
        return null;
    }
}
