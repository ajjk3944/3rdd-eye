package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4279b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import t4.C5606d;

/* compiled from: DateTimeFunctions.kt */
/* loaded from: classes.dex */
public final class T0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final T0 f17538a = new T0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17539b = "formatDateAsLocalWithLocale";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17540c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17541d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17542e;

    static {
        a7.j jVar = new a7.j(EnumC1667d.DATETIME, false);
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17540c = C2092m.W(jVar, new a7.j(enumC1667d, false), new a7.j(enumC1667d, false));
        f17541d = enumC1667d;
        f17542e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.DateTime");
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(2);
        kotlin.jvm.internal.l.d(obj3, "null cannot be cast to non-null type kotlin.String");
        Date dateH = C5606d.H((C4279b) obj);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String) obj2, new Locale.Builder().setLanguageTag((String) obj3).build());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(dateH);
        kotlin.jvm.internal.l.e(str, "sdf.format(date)");
        return str;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17540c;
    }

    @Override // a7.g
    public final String c() {
        return f17539b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17541d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17542e;
    }
}
