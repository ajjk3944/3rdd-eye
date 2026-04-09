package Jh;

import Zg.AbstractC3689v;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final O f10092a;

    /* renamed from: b, reason: collision with root package name */
    private final O f10093b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f10094c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f10095d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10096e;

    public G(O globalLevel, O o10, Map userDefinedLevelForSpecificAnnotation) {
        AbstractC6492s.i(globalLevel, "globalLevel");
        AbstractC6492s.i(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f10092a = globalLevel;
        this.f10093b = o10;
        this.f10094c = userDefinedLevelForSpecificAnnotation;
        this.f10095d = Yg.n.b(new F(this));
        O o11 = O.IGNORE;
        this.f10096e = globalLevel == o11 && o10 == o11 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] b(G g10) {
        List listC = AbstractC3689v.c();
        listC.add(g10.f10092a.getDescription());
        O o10 = g10.f10093b;
        if (o10 != null) {
            listC.add("under-migration:" + o10.getDescription());
        }
        for (Map.Entry entry : g10.f10094c.entrySet()) {
            listC.add('@' + entry.getKey() + ':' + ((O) entry.getValue()).getDescription());
        }
        return (String[]) AbstractC3689v.a(listC).toArray(new String[0]);
    }

    public final O c() {
        return this.f10092a;
    }

    public final O d() {
        return this.f10093b;
    }

    public final Map e() {
        return this.f10094c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return this.f10092a == g10.f10092a && this.f10093b == g10.f10093b && AbstractC6492s.d(this.f10094c, g10.f10094c);
    }

    public final boolean f() {
        return this.f10096e;
    }

    public int hashCode() {
        int iHashCode = this.f10092a.hashCode() * 31;
        O o10 = this.f10093b;
        return ((iHashCode + (o10 == null ? 0 : o10.hashCode())) * 31) + this.f10094c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f10092a + ", migrationLevel=" + this.f10093b + ", userDefinedLevelForSpecificAnnotation=" + this.f10094c + ')';
    }

    public /* synthetic */ G(O o10, O o11, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o10, (i10 & 2) != 0 ? null : o11, (i10 & 4) != 0 ? Zg.U.h() : map);
    }
}
