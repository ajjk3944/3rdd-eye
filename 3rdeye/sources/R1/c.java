package R1;

import java.util.Objects;

/* compiled from: WebMessageCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f11633a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11634b;

    public c(String str) {
        this.f11633a = str;
        this.f11634b = 0;
    }

    public final String a() {
        int i = this.f11634b;
        if (i == 0) {
            return this.f11633a;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        sb.append(i != 0 ? i != 1 ? "Unknown" : "ArrayBuffer" : "String");
        sb.append(" expected, but got ");
        sb.append("String");
        throw new IllegalStateException(sb.toString());
    }

    public c(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f11633a = null;
        this.f11634b = 1;
    }
}
