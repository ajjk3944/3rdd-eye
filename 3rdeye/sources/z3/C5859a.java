package z3;

import java.util.ArrayList;
import java.util.Arrays;
import y3.m;

/* compiled from: AutoValue_BackendRequest.java */
/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5859a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f48436a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f48437b;

    public C5859a() {
        throw null;
    }

    public C5859a(ArrayList arrayList, byte[] bArr) {
        this.f48436a = arrayList;
        this.f48437b = bArr;
    }

    @Override // z3.f
    public final Iterable<m> a() {
        return this.f48436a;
    }

    @Override // z3.f
    public final byte[] b() {
        return this.f48437b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f48436a.equals(fVar.a())) {
            return Arrays.equals(this.f48437b, fVar instanceof C5859a ? ((C5859a) fVar).f48437b : fVar.b());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f48436a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f48437b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f48436a + ", extras=" + Arrays.toString(this.f48437b) + "}";
    }
}
