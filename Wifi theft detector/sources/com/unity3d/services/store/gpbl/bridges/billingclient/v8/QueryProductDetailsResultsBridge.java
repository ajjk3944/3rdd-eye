package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import y8.i;
import z8.h0;
import z8.r;
import z8.s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsResultsBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "productDetailsResult", "", "(Ljava/lang/Object;)V", "getClassName", "", QueryProductDetailsResultsBridge.GET_PRODUCT_DETAILS_LIST_METHOD, "", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductDetailsBridge;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nQueryProductDetailsResultsBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryProductDetailsResultsBridge.kt\ncom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsResultsBridge\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n26#2:23\n1549#3:24\n1620#3,3:25\n*S KotlinDebug\n*F\n+ 1 QueryProductDetailsResultsBridge.kt\ncom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsResultsBridge\n*L\n6#1:23\n11#1:24\n11#1:25,3\n*E\n"})
/* loaded from: classes3.dex */
public final class QueryProductDetailsResultsBridge extends GenericBridge {

    @NotNull
    private static final String GET_PRODUCT_DETAILS_LIST_METHOD = "getProductDetailsList";

    @NotNull
    private final Object productDetailsResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsResultsBridge(@NotNull Object productDetailsResult) {
        super(h0.f(i.a(GET_PRODUCT_DETAILS_LIST_METHOD, new Class[0])));
        p.e(productDetailsResult, "productDetailsResult");
        this.productDetailsResult = productDetailsResult;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsResult";
    }

    @NotNull
    public final List<ProductDetailsBridge> getProductDetailsList() {
        List list = (List) callNonVoidMethod(GET_PRODUCT_DETAILS_LIST_METHOD, this.productDetailsResult, new Object[0]);
        if (list == null) {
            return r.j();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(s.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductDetailsBridge(it.next()));
        }
        return arrayList;
    }
}
