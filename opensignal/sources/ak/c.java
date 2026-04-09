package ak;

import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f448a;

    public c(List list) {
        br.l.e(list, "recipeList");
        this.f448a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && br.l.a(this.f448a, ((c) obj).f448a);
    }

    public final int hashCode() {
        return this.f448a.hashCode();
    }

    public final String toString() {
        return h0.b.t(new StringBuilder("AssistantConfig(recipeList="), this.f448a, ')');
    }
}
