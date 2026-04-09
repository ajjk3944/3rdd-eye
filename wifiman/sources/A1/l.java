package A1;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f228a;

    l(Object obj) {
        this.f228a = (LocaleList) obj;
    }

    @Override // A1.k
    public String a() {
        return this.f228a.toLanguageTags();
    }

    @Override // A1.k
    public Object b() {
        return this.f228a;
    }

    public boolean equals(Object obj) {
        return this.f228a.equals(((k) obj).b());
    }

    @Override // A1.k
    public Locale get(int i10) {
        return this.f228a.get(i10);
    }

    public int hashCode() {
        return this.f228a.hashCode();
    }

    @Override // A1.k
    public boolean isEmpty() {
        return this.f228a.isEmpty();
    }

    @Override // A1.k
    public int size() {
        return this.f228a.size();
    }

    public String toString() {
        return this.f228a.toString();
    }
}
