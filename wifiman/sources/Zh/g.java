package Zh;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.p;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f25418a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final p f25419b = new p("[^\\p{L}\\p{Digit}]");

    /* renamed from: c, reason: collision with root package name */
    private static final String f25420c = "$context_receiver";

    private g() {
    }

    public static final f a(int i10) {
        f fVarH = f.h(f25420c + '_' + i10);
        AbstractC6492s.h(fVarH, "identifier(...)");
        return fVarH;
    }

    public static final String b(String name) {
        AbstractC6492s.i(name, "name");
        return f25419b.n(name, "_");
    }
}
