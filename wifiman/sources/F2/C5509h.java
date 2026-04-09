package f2;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: f2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5509h {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5496B f46718a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f46719b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f46720c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f46721d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f46722e;

    /* renamed from: f2.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC5496B f46723a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f46724b;

        /* renamed from: c, reason: collision with root package name */
        private Object f46725c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f46726d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f46727e;

        public final C5509h a() {
            AbstractC5496B abstractC5496BA = this.f46723a;
            if (abstractC5496BA == null) {
                abstractC5496BA = AbstractC5496B.f46666c.a(this.f46725c);
                AbstractC6492s.g(abstractC5496BA, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new C5509h(abstractC5496BA, this.f46724b, this.f46725c, this.f46726d, this.f46727e);
        }

        public final a b(boolean z10) {
            this.f46724b = z10;
            return this;
        }

        public final a c(AbstractC5496B type) {
            AbstractC6492s.i(type, "type");
            this.f46723a = type;
            return this;
        }
    }

    public C5509h(AbstractC5496B type, boolean z10, Object obj, boolean z11, boolean z12) {
        AbstractC6492s.i(type, "type");
        if (!type.c() && z10) {
            throw new IllegalArgumentException((type.b() + " does not allow nullable values").toString());
        }
        if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.b() + " has null value but is not nullable.").toString());
        }
        this.f46718a = type;
        this.f46719b = z10;
        this.f46722e = obj;
        this.f46720c = z11 || z12;
        this.f46721d = z12;
    }

    public final AbstractC5496B a() {
        return this.f46718a;
    }

    public final boolean b() {
        return this.f46720c;
    }

    public final boolean c() {
        return this.f46721d;
    }

    public final boolean d() {
        return this.f46719b;
    }

    public final void e(String name, Bundle bundle) {
        Object obj;
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(bundle, "bundle");
        if (!this.f46720c || (obj = this.f46722e) == null) {
            return;
        }
        this.f46718a.h(bundle, name, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC6492s.d(C5509h.class, obj.getClass())) {
            return false;
        }
        C5509h c5509h = (C5509h) obj;
        if (this.f46719b != c5509h.f46719b || this.f46720c != c5509h.f46720c || !AbstractC6492s.d(this.f46718a, c5509h.f46718a)) {
            return false;
        }
        Object obj2 = this.f46722e;
        return obj2 != null ? AbstractC6492s.d(obj2, c5509h.f46722e) : c5509h.f46722e == null;
    }

    public final boolean f(String name, Bundle bundle) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(bundle, "bundle");
        if (!this.f46719b && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.f46718a.a(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = ((((this.f46718a.hashCode() * 31) + (this.f46719b ? 1 : 0)) * 31) + (this.f46720c ? 1 : 0)) * 31;
        Object obj = this.f46722e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C5509h.class.getSimpleName());
        sb2.append(" Type: " + this.f46718a);
        sb2.append(" Nullable: " + this.f46719b);
        if (this.f46720c) {
            sb2.append(" DefaultValue: " + this.f46722e);
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "sb.toString()");
        return string;
    }
}
