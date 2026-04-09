package com.ui.uidb.api;

import Y6.g;
import Y6.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ui/uidb/api/ApiSnapshotSingle;", "", "", "version", "Lcom/ui/uidb/api/ApiProduct;", "product", "<init>", "(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct;)V", "copy", "(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct;)Lcom/ui/uidb/api/ApiSnapshotSingle;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Lcom/ui/uidb/api/ApiProduct;", "()Lcom/ui/uidb/api/ApiProduct;", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiSnapshotSingle {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String version;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ApiProduct product;

    public ApiSnapshotSingle(@g(name = "version") String str, @g(name = "device") ApiProduct apiProduct) {
        this.version = str;
        this.product = apiProduct;
    }

    /* renamed from: a, reason: from getter */
    public final ApiProduct getProduct() {
        return this.product;
    }

    /* renamed from: b, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final ApiSnapshotSingle copy(@g(name = "version") String version, @g(name = "device") ApiProduct product) {
        return new ApiSnapshotSingle(version, product);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiSnapshotSingle)) {
            return false;
        }
        ApiSnapshotSingle apiSnapshotSingle = (ApiSnapshotSingle) other;
        return AbstractC6492s.d(this.version, apiSnapshotSingle.version) && AbstractC6492s.d(this.product, apiSnapshotSingle.product);
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ApiProduct apiProduct = this.product;
        return iHashCode + (apiProduct != null ? apiProduct.hashCode() : 0);
    }

    public String toString() {
        return "ApiSnapshotSingle(version=" + this.version + ", product=" + this.product + ")";
    }
}
