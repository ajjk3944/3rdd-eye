package Ag;

import hg.C6042b;
import hg.InterfaceC6043c;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class a {
    public static final InterfaceC6043c a(InterfaceC6043c addTo, C6042b compositeDisposable) {
        AbstractC6492s.i(addTo, "$this$addTo");
        AbstractC6492s.i(compositeDisposable, "compositeDisposable");
        compositeDisposable.a(addTo);
        return addTo;
    }
}
