package q5;

import j$.util.Objects;
import java.util.Arrays;
import je.u;
import vk.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f32180a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32181b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f32182c;

    public a(byte[] bArr, String str, byte[] bArr2) {
        this.f32180a = bArr;
        this.f32181b = str;
        this.f32182c = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f32180a, aVar.f32180a) && this.f32181b.contentEquals(aVar.f32181b) && Arrays.equals(this.f32182c, aVar.f32182c);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.f32180a)), this.f32181b, Integer.valueOf(Arrays.hashCode(this.f32182c)));
    }

    public final String toString() {
        return u.t("EncryptedTopic { ", "EncryptedTopic=" + p.o0(this.f32180a) + ", KeyIdentifier=" + this.f32181b + ", EncapsulatedKey=" + p.o0(this.f32182c) + " }");
    }
}
