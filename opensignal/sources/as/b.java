package as;

import com.google.android.gms.internal.measurement.e5;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final qs.c f2181a = new qs.c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b, reason: collision with root package name */
    public static final qs.c f2182b = new qs.c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c, reason: collision with root package name */
    public static final qs.c f2183c = new qs.c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d, reason: collision with root package name */
    public static final qs.c f2184d = new qs.c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e, reason: collision with root package name */
    public static final Object f2185e;

    /* renamed from: f, reason: collision with root package name */
    public static final LinkedHashMap f2186f;

    /* renamed from: g, reason: collision with root package name */
    public static final Set f2187g;

    static {
        a aVar = a.FIELD;
        a aVar2 = a.METHOD_RETURN_TYPE;
        a aVar3 = a.VALUE_PARAMETER;
        List listI = e5.I(aVar, aVar2, aVar3, a.TYPE_PARAMETER_BOUNDS, a.TYPE_USE);
        qs.c cVar = b0.f2190c;
        is.g gVar = is.g.NOT_NULL;
        Map mapR = mq.b0.R(new lq.l(cVar, new o(new is.h(gVar, false), listI, false)), new lq.l(b0.f2193f, new o(new is.h(gVar, false), listI, false)));
        f2185e = mapR;
        f2186f = mq.b0.S(mq.b0.R(new lq.l(new qs.c("javax.annotation.ParametersAreNullableByDefault"), new o(new is.h(is.g.NULLABLE, false), e5.H(aVar3))), new lq.l(new qs.c("javax.annotation.ParametersAreNonnullByDefault"), new o(new is.h(gVar, false), e5.H(aVar3)))), mapR);
        f2187g = mq.l.B0(new qs.c[]{b0.f2195h, b0.f2196i});
    }
}
