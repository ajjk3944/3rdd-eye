package N7;

import D7.a;
import android.net.Uri;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: UrlVariableTemplate.kt */
/* loaded from: classes.dex */
public final class Hd implements InterfaceC5868a, z7.b<Dd> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<String> f5436a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<Uri> f5437b;

    public Hd(AbstractC5371a<String> abstractC5371a, AbstractC5371a<Uri> abstractC5371a2) {
        this.f5436a = abstractC5371a;
        this.f5437b = abstractC5371a2;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        Fd fd = (Fd) D7.a.f1071b.f6775ha.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        fd.getClass();
        return Fd.e(c0011a, this);
    }
}
