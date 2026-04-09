package va;

import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: va.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8204b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f63535a;

    private /* synthetic */ C8204b(UUID uuid) {
        this.f63535a = uuid;
    }

    public static final /* synthetic */ C8204b a(UUID uuid) {
        return new C8204b(uuid);
    }

    public static UUID c(UUID uuid) {
        AbstractC6492s.i(uuid, "uuid");
        return uuid;
    }

    public static boolean d(UUID uuid, Object obj) {
        return (obj instanceof C8204b) && AbstractC6492s.d(uuid, ((C8204b) obj).l());
    }

    public static final boolean g(UUID uuid, UUID uuid2) {
        return AbstractC6492s.d(uuid, uuid2);
    }

    public static int h(UUID uuid) {
        return uuid.hashCode();
    }

    public static String j(UUID uuid) {
        return "ID(uuid=" + uuid + ")";
    }

    public boolean equals(Object obj) {
        return d(this.f63535a, obj);
    }

    public int hashCode() {
        return h(this.f63535a);
    }

    public final /* synthetic */ UUID l() {
        return this.f63535a;
    }

    public String toString() {
        return j(this.f63535a);
    }
}
