package q5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: GlobalLibraryVersionRegistrar.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static volatile c f45440b;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f45441a = new HashSet();

    public final Set<d> a() {
        Set<d> setUnmodifiableSet;
        synchronized (this.f45441a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f45441a);
        }
        return setUnmodifiableSet;
    }
}
