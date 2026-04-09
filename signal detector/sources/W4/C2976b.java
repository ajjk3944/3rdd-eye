package w4;

import d2.InterfaceC2265a;
import java.util.Locale;

/* renamed from: w4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2976b implements InterfaceC2265a {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f23971a;

    /* renamed from: b, reason: collision with root package name */
    public int f23972b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23973c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23974d;

    public C2976b(Locale locale, int i, String str, int i3) {
        i = (i3 & 2) != 0 ? 0 : i;
        int i6 = (i3 & 8) == 0 ? 1 : 0;
        str = (i3 & 16) != 0 ? null : str;
        this.f23971a = locale;
        this.f23972b = i;
        this.f23973c = i6;
        this.f23974d = str;
    }

    @Override // d2.InterfaceC2265a
    public final int a() {
        return this.f23973c;
    }
}
