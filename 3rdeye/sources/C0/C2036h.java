package c0;

import androidx.camera.core.impl.InterfaceC1680b0;
import c0.AbstractC2033e;

/* compiled from: AutoValue_AudioMimeInfo.java */
/* renamed from: c0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2036h extends AbstractC2033e {

    /* renamed from: a, reason: collision with root package name */
    public final String f18347a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18348b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1680b0.a f18349c;

    /* compiled from: AutoValue_AudioMimeInfo.java */
    /* renamed from: c0.h$a */
    public static final class a extends AbstractC2033e.a {

        /* renamed from: a, reason: collision with root package name */
        public String f18350a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f18351b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC1680b0.a f18352c;
    }

    public C2036h(String str, int i, InterfaceC1680b0.a aVar) {
        this.f18347a = str;
        this.f18348b = i;
        this.f18349c = aVar;
    }

    @Override // c0.AbstractC2038j
    public final String a() {
        return this.f18347a;
    }

    @Override // c0.AbstractC2038j
    public final int b() {
        return this.f18348b;
    }

    @Override // c0.AbstractC2033e
    public final InterfaceC1680b0.a c() {
        return this.f18349c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2033e)) {
            return false;
        }
        AbstractC2033e abstractC2033e = (AbstractC2033e) obj;
        if (!this.f18347a.equals(abstractC2033e.a()) || this.f18348b != abstractC2033e.b()) {
            return false;
        }
        InterfaceC1680b0.a aVar = this.f18349c;
        return aVar == null ? abstractC2033e.c() == null : aVar.equals(abstractC2033e.c());
    }

    public final int hashCode() {
        int iHashCode = (((this.f18347a.hashCode() ^ 1000003) * 1000003) ^ this.f18348b) * 1000003;
        InterfaceC1680b0.a aVar = this.f18349c;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "AudioMimeInfo{mimeType=" + this.f18347a + ", profile=" + this.f18348b + ", compatibleAudioProfile=" + this.f18349c + "}";
    }
}
