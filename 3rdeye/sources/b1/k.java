package b1;

import c1.C2043a;
import c1.C2044b;
import java.nio.ByteBuffer;

/* compiled from: TypefaceEmojiRasterizer.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<C2043a> f17085d = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    public final int f17086a;

    /* renamed from: b, reason: collision with root package name */
    public final i f17087b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f17088c = 0;

    public k(i iVar, int i) {
        this.f17087b = iVar;
        this.f17086a = i;
    }

    public final int a(int i) {
        C2043a c2043aB = b();
        int iA = c2043aB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2043aB.f4178d;
        int i10 = iA + c2043aB.f4175a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final C2043a b() {
        ThreadLocal<C2043a> threadLocal = f17085d;
        C2043a c2043a = threadLocal.get();
        if (c2043a == null) {
            c2043a = new C2043a();
            threadLocal.set(c2043a);
        }
        C2044b c2044b = this.f17087b.f17075a;
        int iA = c2044b.a(6);
        if (iA != 0) {
            int i = iA + c2044b.f4175a;
            int i10 = (this.f17086a * 4) + ((ByteBuffer) c2044b.f4178d).getInt(i) + i + 4;
            int i11 = ((ByteBuffer) c2044b.f4178d).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) c2044b.f4178d;
            c2043a.f4178d = byteBuffer;
            if (byteBuffer != null) {
                c2043a.f4175a = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                c2043a.f4176b = i12;
                c2043a.f4177c = ((ByteBuffer) c2043a.f4178d).getShort(i12);
                return c2043a;
            }
            c2043a.f4175a = 0;
            c2043a.f4176b = 0;
            c2043a.f4177c = 0;
        }
        return c2043a;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C2043a c2043aB = b();
        int iA = c2043aB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) c2043aB.f4178d).getInt(iA + c2043aB.f4175a) : 0));
        sb.append(", codepoints:");
        C2043a c2043aB2 = b();
        int iA2 = c2043aB2.a(16);
        if (iA2 != 0) {
            int i10 = iA2 + c2043aB2.f4175a;
            i = ((ByteBuffer) c2043aB2.f4178d).getInt(((ByteBuffer) c2043aB2.f4178d).getInt(i10) + i10);
        } else {
            i = 0;
        }
        for (int i11 = 0; i11 < i; i11++) {
            sb.append(Integer.toHexString(a(i11)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
