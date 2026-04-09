package ne;

import S8.k;
import S8.l;
import ge.InterfaceC5899b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ne.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6937a {

    /* renamed from: a, reason: collision with root package name */
    private final String f54624a;

    /* renamed from: b, reason: collision with root package name */
    private final l f54625b;

    /* renamed from: c, reason: collision with root package name */
    private final List f54626c;

    /* renamed from: ne.a$a, reason: collision with other inner class name */
    public interface InterfaceC1989a extends InterfaceC5899b {
    }

    public /* synthetic */ C6937a(String str, l lVar, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, lVar, list);
    }

    public final l a() {
        return this.f54625b;
    }

    public final List b() {
        return this.f54626c;
    }

    public final String c() {
        return this.f54624a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6937a)) {
            return false;
        }
        C6937a c6937a = (C6937a) obj;
        return k.d(this.f54624a, c6937a.f54624a) && AbstractC6492s.d(this.f54625b, c6937a.f54625b) && AbstractC6492s.d(this.f54626c, c6937a.f54626c);
    }

    public int hashCode() {
        int iE = k.e(this.f54624a) * 31;
        l lVar = this.f54625b;
        return ((iE + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.f54626c.hashCode();
    }

    public String toString() {
        return "WifiSignalTimelapse(id=" + k.f(this.f54624a) + ", best=" + this.f54625b + ", history=" + this.f54626c + ")";
    }

    private C6937a(String id2, l lVar, List history) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(history, "history");
        this.f54624a = id2;
        this.f54625b = lVar;
        this.f54626c = history;
    }
}
