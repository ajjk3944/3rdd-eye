package Nb;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f16342d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f16343a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16344b;

    /* renamed from: c, reason: collision with root package name */
    private final List f16345c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(String id2, boolean z10, List list) {
        AbstractC6492s.i(id2, "id");
        this.f16343a = id2;
        this.f16344b = z10;
        this.f16345c = list;
    }

    public final List a() {
        return this.f16345c;
    }

    public final String b() {
        return this.f16343a;
    }

    public final boolean c() {
        return this.f16344b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC6492s.d(this.f16343a, cVar.f16343a) && this.f16344b == cVar.f16344b && AbstractC6492s.d(this.f16345c, cVar.f16345c);
    }

    public int hashCode() {
        int iHashCode = ((this.f16343a.hashCode() * 31) + Boolean.hashCode(this.f16344b)) * 31;
        List list = this.f16345c;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "RoomDirectConsoleConnectionRecord(id=" + this.f16343a + ", recommended=" + this.f16344b + ", cert=" + this.f16345c + ")";
    }
}
