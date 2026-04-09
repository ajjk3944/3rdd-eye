package b6;

import A9.I;
import E.u;
import R9.AbstractC1564a;
import R9.C1568e;
import R9.t;
import U9.F;
import b9.C1992A;
import java.io.IOException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import p9.l;
import w9.j;

/* compiled from: JsonConverter.kt */
/* renamed from: b6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1855c<E> implements InterfaceC1853a<F, E> {
    public static final b Companion = new b(null);
    private static final AbstractC1564a json = t.a(a.INSTANCE);
    private final j kType;

    /* compiled from: JsonConverter.kt */
    /* renamed from: b6.c$a */
    public static final class a extends m implements l<C1568e, C1992A> {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // p9.l
        public /* bridge */ /* synthetic */ C1992A invoke(C1568e c1568e) {
            invoke2(c1568e);
            return C1992A.f18074a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C1568e Json) {
            kotlin.jvm.internal.l.f(Json, "$this$Json");
            Json.f11793c = true;
            Json.f11791a = true;
            Json.f11792b = false;
            Json.f11794d = true;
        }
    }

    /* compiled from: JsonConverter.kt */
    /* renamed from: b6.c$b */
    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        private b() {
        }
    }

    public C1855c(j kType) {
        kotlin.jvm.internal.l.f(kType, "kType");
        this.kType = kType;
    }

    @Override // b6.InterfaceC1853a
    public E convert(F f10) throws IOException {
        if (f10 != null) {
            try {
                String strString = f10.string();
                if (strString != null) {
                    E e4 = (E) json.a(u.L(AbstractC1564a.f11780d.f11782b, this.kType), strString);
                    f10.close();
                    return e4;
                }
            } finally {
            }
        }
        I.o(f10, null);
        return null;
    }
}
