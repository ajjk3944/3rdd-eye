package bb;

import Y6.h;
import Y6.r;
import ab.C3781d;
import ab.C3783f;
import bb.C4079a;
import com.squareup.moshi.JsonEncodingException;
import com.ui.uidb.UiDB;
import com.ui.uidb.api.ApiProduct;
import com.ui.uidb.api.ApiSnapshot;
import com.ui.uidb.product.UiDBProduct$Factory$InvalidProduct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: bb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4081c implements InterfaceC4080b {

    /* renamed from: b, reason: collision with root package name */
    private final C3783f f33097b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33098c;

    /* renamed from: d, reason: collision with root package name */
    private final r f33099d;

    /* renamed from: e, reason: collision with root package name */
    private final h f33100e;

    public C4081c(C3783f productFactory, boolean z10) {
        AbstractC6492s.i(productFactory, "productFactory");
        this.f33097b = productFactory;
        this.f33098c = z10;
        r rVarC = new r.a().c();
        this.f33099d = rVarC;
        this.f33100e = rVarC.c(ApiSnapshot.class);
    }

    @Override // bb.InterfaceC4080b
    public C4079a a(UiDB.b environment, String string) {
        C3781d c3781dM;
        AbstractC6492s.i(environment, "environment");
        AbstractC6492s.i(string, "string");
        try {
            ApiSnapshot apiSnapshot = (ApiSnapshot) this.f33100e.c(string);
            if (apiSnapshot == null) {
                throw new UiDB.Error.ContentInvalid("Response data don't contain snapshot", null, 2, null);
            }
            String version = apiSnapshot.getVersion();
            if (version == null) {
                throw new UiDB.Error.ContentInvalid("Missing snapshot version", null, 2, null);
            }
            String strA = C4079a.b.a(version);
            List<ApiProduct> products = apiSnapshot.getProducts();
            if (products == null) {
                throw new UiDB.Error.ContentInvalid("Request failed - Missing product list", null, 2, null);
            }
            ArrayList arrayList = new ArrayList();
            for (ApiProduct apiProduct : products) {
                try {
                    c3781dM = this.f33097b.m(environment, apiProduct);
                } catch (UiDBProduct$Factory$InvalidProduct e10) {
                    if (!this.f33098c) {
                        throw new UiDB.Error.ContentInvalid("Failed to create product instance for product " + apiProduct.getId(), e10);
                    }
                    c3781dM = null;
                }
                if (c3781dM != null) {
                    arrayList.add(c3781dM);
                }
            }
            return new C4079a(strA, arrayList, null);
        } catch (JsonEncodingException e11) {
            throw new UiDB.Error.ContentInvalid("Response data in invalid format", e11);
        }
    }
}
