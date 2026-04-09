package N4;

import android.net.wifi.MloLink;
import d2.InterfaceC2265a;

/* loaded from: classes.dex */
public final class k implements InterfaceC2265a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3007a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3008b;

    /* renamed from: c, reason: collision with root package name */
    public final MloLink f3009c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f3010d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3011e;

    public k(String str, String str2, MloLink mloLink, Integer num, int i) {
        this.f3007a = str;
        this.f3008b = str2;
        this.f3009c = mloLink;
        this.f3010d = num;
        this.f3011e = i;
    }

    @Override // d2.InterfaceC2265a
    public final int a() {
        return this.f3011e;
    }

    public /* synthetic */ k(String str, String str2, Integer num, int i) {
        this(str, str2, null, (i & 8) != 0 ? null : num, 0);
    }
}
