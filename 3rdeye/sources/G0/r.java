package G0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper.java */
/* loaded from: classes.dex */
public final class r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f1857a;

    public r(Object obj) {
        this.f1857a = m.e(obj);
    }

    @Override // G0.l
    public final String a() {
        return this.f1857a.toLanguageTags();
    }

    @Override // G0.l
    public final Object b() {
        return this.f1857a;
    }

    public final boolean equals(Object obj) {
        return this.f1857a.equals(((l) obj).b());
    }

    @Override // G0.l
    public final Locale get(int i) {
        return this.f1857a.get(i);
    }

    public final int hashCode() {
        return this.f1857a.hashCode();
    }

    @Override // G0.l
    public final boolean isEmpty() {
        return this.f1857a.isEmpty();
    }

    @Override // G0.l
    public final int size() {
        return this.f1857a.size();
    }

    public final String toString() {
        return this.f1857a.toString();
    }
}
