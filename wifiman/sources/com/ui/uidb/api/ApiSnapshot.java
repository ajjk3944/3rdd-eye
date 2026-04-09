package com.ui.uidb.api;

import Y6.g;
import Y6.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ui/uidb/api/ApiSnapshot;", "", "", "version", "", "Lcom/ui/uidb/api/ApiProduct;", "products", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/ui/uidb/api/ApiSnapshot;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/util/List;", "()Ljava/util/List;", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiSnapshot {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String version;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List products;

    public ApiSnapshot(@g(name = "version") String str, @g(name = "devices") List<ApiProduct> list) {
        this.version = str;
        this.products = list;
    }

    /* renamed from: a, reason: from getter */
    public final List getProducts() {
        return this.products;
    }

    /* renamed from: b, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final ApiSnapshot copy(@g(name = "version") String version, @g(name = "devices") List<ApiProduct> products) {
        return new ApiSnapshot(version, products);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiSnapshot)) {
            return false;
        }
        ApiSnapshot apiSnapshot = (ApiSnapshot) other;
        return AbstractC6492s.d(this.version, apiSnapshot.version) && AbstractC6492s.d(this.products, apiSnapshot.products);
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.products;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ApiSnapshot(version=" + this.version + ", products=" + this.products + ")";
    }
}
