package n0;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class p implements i {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f23522a;

    public p(Object obj) {
        this.f23522a = o.a(obj);
    }

    @Override // n0.i
    public String a() {
        return this.f23522a.toLanguageTags();
    }

    public boolean equals(Object obj) {
        return this.f23522a.equals(((i) obj).getLocaleList());
    }

    @Override // n0.i
    public Locale get(int i10) {
        return this.f23522a.get(i10);
    }

    @Override // n0.i
    public Object getLocaleList() {
        return this.f23522a;
    }

    public int hashCode() {
        return this.f23522a.hashCode();
    }

    @Override // n0.i
    public boolean isEmpty() {
        return this.f23522a.isEmpty();
    }

    @Override // n0.i
    public int size() {
        return this.f23522a.size();
    }

    public String toString() {
        return this.f23522a.toString();
    }
}
