package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f3582a;

    public c(List topics) {
        kotlin.jvm.internal.p.e(topics, "topics");
        this.f3582a = topics;
    }

    public final List a() {
        return this.f3582a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3582a.size() != cVar.f3582a.size()) {
            return false;
        }
        return kotlin.jvm.internal.p.a(new HashSet(this.f3582a), new HashSet(cVar.f3582a));
    }

    public int hashCode() {
        return Objects.hash(this.f3582a);
    }

    public String toString() {
        return "Topics=" + this.f3582a;
    }
}
