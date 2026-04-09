package c0;

import androidx.camera.core.impl.InterfaceC1680b0;
import c0.AbstractC2042n;

/* compiled from: AutoValue_VideoMimeInfo.java */
/* renamed from: c0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2037i extends AbstractC2042n {

    /* renamed from: a, reason: collision with root package name */
    public final String f18353a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18354b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1680b0.c f18355c;

    /* compiled from: AutoValue_VideoMimeInfo.java */
    /* renamed from: c0.i$a */
    public static final class a extends AbstractC2042n.a {

        /* renamed from: a, reason: collision with root package name */
        public String f18356a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f18357b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC1680b0.c f18358c;
    }

    public C2037i(String str, int i, InterfaceC1680b0.c cVar) {
        this.f18353a = str;
        this.f18354b = i;
        this.f18355c = cVar;
    }

    @Override // c0.AbstractC2038j
    public final String a() {
        return this.f18353a;
    }

    @Override // c0.AbstractC2038j
    public final int b() {
        return this.f18354b;
    }

    @Override // c0.AbstractC2042n
    public final InterfaceC1680b0.c c() {
        return this.f18355c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2042n)) {
            return false;
        }
        AbstractC2042n abstractC2042n = (AbstractC2042n) obj;
        if (!this.f18353a.equals(abstractC2042n.a()) || this.f18354b != abstractC2042n.b()) {
            return false;
        }
        InterfaceC1680b0.c cVar = this.f18355c;
        return cVar == null ? abstractC2042n.c() == null : cVar.equals(abstractC2042n.c());
    }

    public final int hashCode() {
        int iHashCode = (((this.f18353a.hashCode() ^ 1000003) * 1000003) ^ this.f18354b) * 1000003;
        InterfaceC1680b0.c cVar = this.f18355c;
        return iHashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.f18353a + ", profile=" + this.f18354b + ", compatibleVideoProfile=" + this.f18355c + "}";
    }
}
