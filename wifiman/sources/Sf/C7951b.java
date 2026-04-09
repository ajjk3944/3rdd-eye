package sf;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: sf.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7951b {

    /* renamed from: a, reason: collision with root package name */
    private final String f61479a;

    public C7951b(String invitationToken) {
        AbstractC6492s.i(invitationToken, "invitationToken");
        this.f61479a = invitationToken;
    }

    public final String a() {
        return this.f61479a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7951b) && AbstractC6492s.d(this.f61479a, ((C7951b) obj).f61479a);
    }

    public int hashCode() {
        return this.f61479a.hashCode();
    }

    public String toString() {
        return "Params(invitationToken=" + this.f61479a + ")";
    }
}
