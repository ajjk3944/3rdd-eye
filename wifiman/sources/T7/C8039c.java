package t7;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* renamed from: t7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8039c implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f61832a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f61833b = true;

    public C8039c(UUID uuid) {
        this.f61832a = uuid;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8039c) && AbstractC6492s.d(this.f61832a, ((C8039c) obj).f61832a);
    }

    public int hashCode() {
        UUID uuid = this.f61832a;
        if (uuid == null) {
            return 0;
        }
        return uuid.hashCode();
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f61833b;
    }

    public String toString() {
        return "Guid(uuid=" + this.f61832a + ")";
    }
}
