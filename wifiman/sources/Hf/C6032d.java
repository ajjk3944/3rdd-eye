package hf;

import b8.AbstractC4075b;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: hf.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6032d {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4075b f48653a;

    public C6032d(AbstractC4075b value) {
        AbstractC6492s.i(value, "value");
        this.f48653a = value;
    }

    public final AbstractC4075b a() {
        return this.f48653a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6032d) && AbstractC6492s.d(this.f48653a, ((C6032d) obj).f48653a);
    }

    public int hashCode() {
        return this.f48653a.hashCode();
    }

    public String toString() {
        return "NodeLatency(value=" + this.f48653a + ")";
    }
}
