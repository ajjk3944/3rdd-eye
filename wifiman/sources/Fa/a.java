package Fa;

import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import va.C8204b;
import va.c;

/* loaded from: classes3.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f6433a;

    /* renamed from: b, reason: collision with root package name */
    private final c f6434b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f6435c;

    public /* synthetic */ a(UUID uuid, c cVar, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, cVar, bool);
    }

    public UUID a() {
        return this.f6433a;
    }

    public c c() {
        return this.f6434b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C8204b.g(a(), aVar.a()) && c() == aVar.c() && AbstractC6492s.d(this.f6435c, aVar.f6435c);
    }

    public int hashCode() {
        return C8204b.h(a());
    }

    private a(UUID id2, c cVar, Boolean bool) {
        AbstractC6492s.i(id2, "id");
        this.f6433a = id2;
        this.f6434b = cVar;
        this.f6435c = bool;
    }
}
