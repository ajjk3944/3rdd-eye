package lb;

import android.os.Build;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: lb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6569c {

    /* renamed from: a, reason: collision with root package name */
    private final String f52484a;

    /* renamed from: b, reason: collision with root package name */
    private final String f52485b;

    /* renamed from: c, reason: collision with root package name */
    private final String f52486c;

    public C6569c(String clientVersion, String clientName, String os) {
        AbstractC6492s.i(clientVersion, "clientVersion");
        AbstractC6492s.i(clientName, "clientName");
        AbstractC6492s.i(os, "os");
        this.f52484a = clientVersion;
        this.f52485b = clientName;
        this.f52486c = os;
    }

    public final String a() {
        return this.f52485b;
    }

    public final String b() {
        return this.f52484a;
    }

    public final String c() {
        return this.f52486c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6569c)) {
            return false;
        }
        C6569c c6569c = (C6569c) obj;
        return AbstractC6492s.d(this.f52484a, c6569c.f52484a) && AbstractC6492s.d(this.f52485b, c6569c.f52485b) && AbstractC6492s.d(this.f52486c, c6569c.f52486c);
    }

    public int hashCode() {
        return (((this.f52484a.hashCode() * 31) + this.f52485b.hashCode()) * 31) + this.f52486c.hashCode();
    }

    public String toString() {
        return "ConnectionMetaData(clientVersion=" + this.f52484a + ", clientName=" + this.f52485b + ", os=" + this.f52486c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C6569c(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 4) != 0) {
            str3 = "Version " + Build.VERSION.RELEASE + " (Build SDK " + Build.VERSION.SDK_INT + ")";
        }
        this(str, str2, str3);
    }
}
