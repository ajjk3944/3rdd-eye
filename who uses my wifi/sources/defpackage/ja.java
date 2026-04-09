package defpackage;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ja implements xp0 {
    public static final boolean d = Boolean.getBoolean("java.net.preferIPv4Stack");
    public static final boolean e = Boolean.getBoolean("java.net.preferIPv6Addresses");
    public final ArrayList a = new ArrayList(3);
    public final i80 b = k80.d(getClass());
    public final ArrayList c = new ArrayList(1);

    public static int g(String str) throws NumberFormatException {
        if (str == null || str.isEmpty()) {
            return 1;
        }
        try {
            int i = Integer.parseInt(str);
            if (i < 0) {
                return 1;
            }
            if (i > 15) {
                return 15;
            }
            return i;
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    @Override // defpackage.xp0
    public final List c() {
        boolean z = e;
        ArrayList arrayList = this.a;
        return z ? (List) arrayList.stream().sorted(new ha(0)).collect(Collectors.toList()) : d ? (List) arrayList.stream().filter(new ia(0)).collect(Collectors.toList()) : Collections.unmodifiableList(arrayList);
    }

    @Override // defpackage.xp0
    public final List d() {
        return Collections.unmodifiableList(this.c);
    }

    public final void e(InetSocketAddress inetSocketAddress) {
        ArrayList arrayList = this.a;
        if (arrayList.contains(inetSocketAddress)) {
            return;
        }
        arrayList.add(inetSocketAddress);
        this.b.o(inetSocketAddress, "Added {} to nameservers");
    }

    public final void f(String str) {
        i80 i80Var = this.b;
        ArrayList arrayList = this.c;
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            gg0 gg0VarJ = gg0.j(str, gg0.l);
            if (arrayList.contains(gg0VarJ)) {
                return;
            }
            arrayList.add(gg0VarJ);
            i80Var.o(gg0VarJ, "Added {} to search paths");
        } catch (f11 unused) {
            i80Var.m(str, "Could not parse search path {} as a dns name, ignoring");
        }
    }

    public final void h() {
        this.a.clear();
        this.c.clear();
    }
}
