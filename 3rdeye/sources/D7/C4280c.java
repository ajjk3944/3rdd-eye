package d7;

import kotlin.jvm.internal.l;

/* compiled from: Url.kt */
/* renamed from: d7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4280c {

    /* renamed from: a, reason: collision with root package name */
    public final String f37533a;

    public final boolean equals(Object obj) {
        if (obj instanceof C4280c) {
            return l.b(this.f37533a, ((C4280c) obj).f37533a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37533a.hashCode();
    }

    public final String toString() {
        return this.f37533a;
    }
}
