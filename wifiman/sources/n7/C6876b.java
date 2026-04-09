package n7;

import java.util.Map;
import n7.C6875a;

/* renamed from: n7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6876b implements C6875a.InterfaceC1965a {

    /* renamed from: a, reason: collision with root package name */
    private Map f54296a = c.f54297a.a();

    @Override // n7.C6875a.InterfaceC1965a
    public String a(int i10) {
        return (String) this.f54296a.get(Integer.valueOf(i10));
    }
}
