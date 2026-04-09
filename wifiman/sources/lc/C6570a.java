package lc;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: lc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6570a {

    /* renamed from: a, reason: collision with root package name */
    private final int f52522a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f52523b;

    public /* synthetic */ C6570a(int i10, Intent intent, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, intent);
    }

    public final int a() {
        return this.f52522a;
    }

    public final Intent b() {
        return this.f52523b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6570a)) {
            return false;
        }
        C6570a c6570a = (C6570a) obj;
        return AbstractC6571b.b(this.f52522a, c6570a.f52522a) && AbstractC6492s.d(this.f52523b, c6570a.f52523b);
    }

    public int hashCode() {
        return (AbstractC6571b.c(this.f52522a) * 31) + this.f52523b.hashCode();
    }

    public String toString() {
        return "LaunchRequest(id=" + AbstractC6571b.d(this.f52522a) + ", intent=" + this.f52523b + ")";
    }

    private C6570a(int i10, Intent intent) {
        AbstractC6492s.i(intent, "intent");
        this.f52522a = i10;
        this.f52523b = intent;
    }
}
