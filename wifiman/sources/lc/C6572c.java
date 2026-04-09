package lc;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: lc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6572c {

    /* renamed from: a, reason: collision with root package name */
    private final int f52524a;

    /* renamed from: b, reason: collision with root package name */
    private final int f52525b;

    /* renamed from: c, reason: collision with root package name */
    private final Intent f52526c;

    public /* synthetic */ C6572c(int i10, int i11, Intent intent, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, intent);
    }

    public final Intent a() {
        return this.f52526c;
    }

    public final int b() {
        return this.f52524a;
    }

    public final int c() {
        return this.f52525b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6572c)) {
            return false;
        }
        C6572c c6572c = (C6572c) obj;
        return AbstractC6571b.b(this.f52524a, c6572c.f52524a) && this.f52525b == c6572c.f52525b && AbstractC6492s.d(this.f52526c, c6572c.f52526c);
    }

    public int hashCode() {
        int iC = ((AbstractC6571b.c(this.f52524a) * 31) + Integer.hashCode(this.f52525b)) * 31;
        Intent intent = this.f52526c;
        return iC + (intent == null ? 0 : intent.hashCode());
    }

    public String toString() {
        return "LaunchResult(id=" + AbstractC6571b.d(this.f52524a) + ", resultCode=" + this.f52525b + ", data=" + this.f52526c + ")";
    }

    private C6572c(int i10, int i11, Intent intent) {
        this.f52524a = i10;
        this.f52525b = i11;
        this.f52526c = intent;
    }
}
