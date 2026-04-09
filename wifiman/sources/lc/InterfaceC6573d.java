package lc;

import android.content.Intent;
import gg.i;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: lc.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6573d {

    /* renamed from: lc.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f52527a;

        /* renamed from: b, reason: collision with root package name */
        private final Intent f52528b;

        public a(int i10, Intent intent) {
            AbstractC6492s.i(intent, "intent");
            this.f52527a = i10;
            this.f52528b = intent;
        }

        public final Intent a() {
            return this.f52528b;
        }

        public final int b() {
            return this.f52527a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f52527a == aVar.f52527a && AbstractC6492s.d(this.f52528b, aVar.f52528b);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f52527a) * 31) + this.f52528b.hashCode();
        }

        public String toString() {
            return "Request(requestCode=" + this.f52527a + ", intent=" + this.f52528b + ")";
        }
    }

    void c(int i10, int i11, Intent intent);

    i d();
}
