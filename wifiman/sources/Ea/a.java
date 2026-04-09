package Ea;

import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import va.C8204b;

/* loaded from: classes3.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f4411a;

    /* renamed from: b, reason: collision with root package name */
    private final va.c f4412b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4413c;

    public /* synthetic */ a(UUID uuid, va.c cVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, cVar, z10);
    }

    public UUID a() {
        return this.f4411a;
    }

    public va.c c() {
        return this.f4412b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC6492s.d(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type com.ui.product.uisp.UispProductBtleService");
        a aVar = (a) obj;
        return C8204b.g(a(), aVar.a()) && c() == aVar.c() && this.f4413c == aVar.f4413c;
    }

    public int hashCode() {
        return C8204b.h(a());
    }

    private a(UUID id2, va.c cVar, boolean z10) {
        AbstractC6492s.i(id2, "id");
        this.f4411a = id2;
        this.f4412b = cVar;
        this.f4413c = z10;
    }
}
