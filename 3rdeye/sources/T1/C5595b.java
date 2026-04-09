package t1;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.l;

/* compiled from: GetTopicsResponse.kt */
/* renamed from: t1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5595b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractCollection f46374a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5595b(List<C5596c> topics) {
        l.f(topics, "topics");
        this.f46374a = (AbstractCollection) topics;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.AbstractCollection, java.util.List] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5595b)) {
            return false;
        }
        ?? r02 = this.f46374a;
        C5595b c5595b = (C5595b) obj;
        if (r02.size() != c5595b.f46374a.size()) {
            return false;
        }
        return new HashSet((Collection) r02).equals(new HashSet(c5595b.f46374a));
    }

    public final int hashCode() {
        return Objects.hash(this.f46374a);
    }

    public final String toString() {
        return "Topics=" + this.f46374a;
    }
}
