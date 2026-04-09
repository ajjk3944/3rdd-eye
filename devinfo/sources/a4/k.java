package a4;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f197a;

    public k(Object obj) {
        this.f197a = (LocaleList) obj;
    }

    @Override // a4.j
    public final String a() {
        return this.f197a.toLanguageTags();
    }

    @Override // a4.j
    public final Object b() {
        return this.f197a;
    }

    public final boolean equals(Object obj) {
        return this.f197a.equals(((j) obj).b());
    }

    @Override // a4.j
    public final Locale get(int i4) {
        return this.f197a.get(i4);
    }

    public final int hashCode() {
        return this.f197a.hashCode();
    }

    @Override // a4.j
    public final boolean isEmpty() {
        return this.f197a.isEmpty();
    }

    @Override // a4.j
    public final int size() {
        return this.f197a.size();
    }

    public final String toString() {
        return this.f197a.toString();
    }
}
