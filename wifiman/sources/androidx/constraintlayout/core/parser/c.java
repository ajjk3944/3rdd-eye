package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: g, reason: collision with root package name */
    private static ArrayList f30037g;

    static {
        ArrayList arrayList = new ArrayList();
        f30037g = arrayList;
        arrayList.add("ConstraintSets");
        f30037g.add("Variables");
        f30037g.add("Generate");
        f30037g.add("Transitions");
        f30037g.add("KeyFrames");
        f30037g.add("KeyAttributes");
        f30037g.add("KeyPositions");
        f30037g.add("KeyCycles");
    }

    public c(char[] cArr) {
        super(cArr);
    }

    public static b g0(String str, b bVar) {
        c cVar = new c(str.toCharArray());
        cVar.w(0L);
        cVar.u(str.length() - 1);
        cVar.j0(bVar);
        return cVar;
    }

    @Override // androidx.constraintlayout.core.parser.a, androidx.constraintlayout.core.parser.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c) || Objects.equals(h0(), ((c) obj).h0())) {
            return super.equals(obj);
        }
        return false;
    }

    public String h0() {
        return e();
    }

    @Override // androidx.constraintlayout.core.parser.a, androidx.constraintlayout.core.parser.b
    public int hashCode() {
        return super.hashCode();
    }

    public b i0() {
        if (this.f30031f.size() > 0) {
            return (b) this.f30031f.get(0);
        }
        return null;
    }

    public void j0(b bVar) {
        if (this.f30031f.size() > 0) {
            this.f30031f.set(0, bVar);
        } else {
            this.f30031f.add(bVar);
        }
    }
}
