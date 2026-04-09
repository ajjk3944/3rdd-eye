package N7;

import android.net.Uri;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivActionDownloadTemplate.kt */
/* renamed from: N7.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1116c1 implements InterfaceC5868a, z7.b<Y0> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<List<C1132d2>> f7955a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<List<C1132d2>> f7956b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Uri>> f7957c;

    public C1116c1(AbstractC5371a<List<C1132d2>> abstractC5371a, AbstractC5371a<List<C1132d2>> abstractC5371a2, AbstractC5371a<A7.b<Uri>> abstractC5371a3) {
        this.f7955a = abstractC5371a;
        this.f7956b = abstractC5371a2;
        this.f7957c = abstractC5371a3;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1086a1) D7.a.f1071b.f6819m0.getValue()).b(D7.a.f1070a, this);
    }
}
