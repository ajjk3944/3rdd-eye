package ca;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final v f3508a;

    /* renamed from: b, reason: collision with root package name */
    public final v f3509b;

    public t(v vVar, v vVar2) {
        this.f3508a = vVar;
        this.f3509b = vVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f3508a.equals(tVar.f3508a) && this.f3509b.equals(tVar.f3509b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3509b.hashCode() + (this.f3508a.hashCode() * 31);
    }

    public final String toString() {
        String string;
        v vVar = this.f3508a;
        String strValueOf = String.valueOf(vVar);
        v vVar2 = this.f3509b;
        if (vVar.equals(vVar2)) {
            string = "";
        } else {
            String strValueOf2 = String.valueOf(vVar2);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 2);
            sb2.append(", ");
            sb2.append(strValueOf2);
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder(c7.a.d(strValueOf.length() + 2, string));
        sb3.append("[");
        sb3.append(strValueOf);
        sb3.append(string);
        sb3.append("]");
        return sb3.toString();
    }
}
