package io.appmetrica.analytics.impl;

import c9.C2078B;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Rd implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public static final Qd f40047a = new Qd();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f40048b = C2078B.o(new b9.l(NativeCrashSource.UNKNOWN, 0), new b9.l(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4838o6 fromModel(Xd xd) {
        C4838o6 c4838o6 = new C4838o6();
        c4838o6.f41356f = 1;
        C4812n6 c4812n6 = new C4812n6();
        c4812n6.f41303a = xd.f40384a;
        C4915r6 c4915r6 = new C4915r6();
        Integer num = (Integer) f40048b.get(xd.f40385b.f40240a);
        if (num != null) {
            c4915r6.f41533a = num.intValue();
        }
        String str = xd.f40385b.f40241b;
        if (str == null) {
            str = "";
        }
        c4915r6.f41534b = str;
        c4812n6.f41304b = c4915r6;
        c4838o6.f41357g = c4812n6;
        return c4838o6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Xd a(C4838o6 c4838o6) {
        throw new UnsupportedOperationException();
    }
}
