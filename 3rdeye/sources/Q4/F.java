package Q4;

import Q4.f0;
import java.util.Arrays;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* loaded from: classes2.dex */
public final class F extends f0.d.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10996a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10997b;

    public F(String str, byte[] bArr) {
        this.f10996a = str;
        this.f10997b = bArr;
    }

    @Override // Q4.f0.d.a
    public final byte[] a() {
        return this.f10997b;
    }

    @Override // Q4.f0.d.a
    public final String b() {
        return this.f10996a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.d.a)) {
            return false;
        }
        f0.d.a aVar = (f0.d.a) obj;
        if (this.f10996a.equals(aVar.b())) {
            return Arrays.equals(this.f10997b, aVar instanceof F ? ((F) aVar).f10997b : aVar.a());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10996a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10997b);
    }

    public final String toString() {
        return "File{filename=" + this.f10996a + ", contents=" + Arrays.toString(this.f10997b) + "}";
    }
}
