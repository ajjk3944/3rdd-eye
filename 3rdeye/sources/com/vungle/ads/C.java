package com.vungle.ads;

/* compiled from: VungleError.kt */
/* loaded from: classes2.dex */
public final class C extends k0 {
    public /* synthetic */ C(int i, String str, int i10, kotlin.jvm.internal.g gVar) {
        this(i, (i10 & 2) != 0 ? null : str);
    }

    @Override // com.vungle.ads.k0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        int code = getCode();
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type com.vungle.ads.InternalError");
        return code == ((C) obj).getCode();
    }

    @Override // com.vungle.ads.k0
    public int hashCode() {
        return C.class.hashCode();
    }

    public C(int i, String str) {
        super(Integer.valueOf(i), null, str, null, null, null, 58, null);
    }
}
