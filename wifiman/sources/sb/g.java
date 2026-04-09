package sb;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.p;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final p f61437a = new p("^\\p{Lower}+://?+.+$");

    public static final boolean a(String str) {
        AbstractC6492s.i(str, "<this>");
        return f61437a.m(str);
    }
}
