package N;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f2970a;

    public k(Object obj) {
        this.f2970a = A0.a.f(obj);
    }

    @Override // N.j
    public final String a() {
        return this.f2970a.toLanguageTags();
    }

    @Override // N.j
    public final Object b() {
        return this.f2970a;
    }

    public final boolean equals(Object obj) {
        return this.f2970a.equals(((j) obj).b());
    }

    @Override // N.j
    public final Locale get(int i) {
        return this.f2970a.get(i);
    }

    public final int hashCode() {
        return this.f2970a.hashCode();
    }

    @Override // N.j
    public final boolean isEmpty() {
        return this.f2970a.isEmpty();
    }

    @Override // N.j
    public final int size() {
        return this.f2970a.size();
    }

    public final String toString() {
        return this.f2970a.toString();
    }
}
