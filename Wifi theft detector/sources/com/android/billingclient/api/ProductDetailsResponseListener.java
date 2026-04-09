package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes.dex */
public interface ProductDetailsResponseListener {
    void onProductDetailsResponse(@NonNull BillingResult billingResult, @NonNull List<ProductDetails> list);
}
