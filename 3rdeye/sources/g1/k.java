package g1;

import androidx.fragment.app.ComponentCallbacksC1759l;

/* compiled from: Violation.kt */
/* loaded from: classes.dex */
public abstract class k extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final ComponentCallbacksC1759l f37940b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ComponentCallbacksC1759l fragment, String str) {
        super(str);
        kotlin.jvm.internal.l.f(fragment, "fragment");
        this.f37940b = fragment;
    }
}
