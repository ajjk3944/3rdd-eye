package N7;

import android.net.Uri;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivActionDownload.kt */
/* loaded from: classes.dex */
public final class Y0 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final List<C1175g0> f7759a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C1175g0> f7760b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Uri> f7761c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f7762d;

    public Y0(List<C1175g0> list, List<C1175g0> list2, A7.b<Uri> bVar) {
        this.f7759a = list;
        this.f7760b = list2;
        this.f7761c = bVar;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((Z0) D7.a.f1071b.f6809l0.getValue()).b(D7.a.f1070a, this);
    }
}
