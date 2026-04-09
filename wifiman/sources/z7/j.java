package z7;

import Yg.B;
import bh.AbstractC4110a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f67106a;

    /* renamed from: b, reason: collision with root package name */
    private final int f67107b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f67108c;

    public /* synthetic */ j(byte[] bArr, int i10, byte[] bArr2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, i10, bArr2);
    }

    public final byte[] a() {
        return this.f67106a;
    }

    public final byte[] b() {
        return this.f67108c;
    }

    public final int c() {
        return this.f67107b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC6492s.d(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type com.ubnt.discovery.server.lan.net.DiscoveryPacket");
        j jVar = (j) obj;
        return AbstractC4110a.c(this.f67106a, jVar.f67106a) && this.f67107b == jVar.f67107b && Arrays.equals(this.f67108c, jVar.f67108c);
    }

    public int hashCode() {
        return (((AbstractC4110a.e(this.f67106a) * 31) + this.f67107b) * 31) + Arrays.hashCode(this.f67108c);
    }

    public String toString() {
        return "DiscoveryPacket(address=" + B.z(this.f67106a) + ", port=" + this.f67107b + ", content=" + Arrays.toString(this.f67108c) + ")";
    }

    private j(byte[] address, int i10, byte[] content) {
        AbstractC6492s.i(address, "address");
        AbstractC6492s.i(content, "content");
        this.f67106a = address;
        this.f67107b = i10;
        this.f67108c = content;
    }
}
