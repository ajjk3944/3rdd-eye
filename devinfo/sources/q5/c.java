package q5;

import j$.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import nk.k;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f32184a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f32185b;

    public c(List list, List list2) {
        k.e(list, "topics");
        this.f32184a = list;
        this.f32185b = list2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        List list = this.f32184a;
        int size = list.size();
        c cVar = (c) obj;
        ?? r22 = cVar.f32185b;
        List list2 = cVar.f32184a;
        if (size != list2.size()) {
            return false;
        }
        ?? r12 = this.f32185b;
        return r12.size() == r22.size() && new HashSet(list).equals(new HashSet(list2)) && new HashSet((Collection) r12).equals(new HashSet((Collection) r22));
    }

    public final int hashCode() {
        return Objects.hash(this.f32184a, this.f32185b);
    }

    public final String toString() {
        return "GetTopicsResponse: Topics=" + this.f32184a + ", EncryptedTopics=" + this.f32185b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(List list) {
        this(list, s.f38317a);
        k.e(list, "topics");
    }
}
