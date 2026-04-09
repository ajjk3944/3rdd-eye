package va;

import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: va.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8203a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f63533a;

    /* renamed from: b, reason: collision with root package name */
    private final c f63534b;

    public /* synthetic */ C8203a(UUID uuid, c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, cVar);
    }

    public UUID a() {
        return this.f63533a;
    }

    public c c() {
        return this.f63534b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC6492s.d(C8203a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type com.ui.product.btle.DefaultUiProductBtleService");
        C8203a c8203a = (C8203a) obj;
        return C8204b.g(a(), c8203a.a()) && c() == c8203a.c();
    }

    public int hashCode() {
        return C8204b.h(a());
    }

    private C8203a(UUID id2, c cVar) {
        AbstractC6492s.i(id2, "id");
        this.f63533a = id2;
        this.f63534b = cVar;
    }
}
