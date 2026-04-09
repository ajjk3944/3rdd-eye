package c0;

import T.AbstractC3561w;
import T.H0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.text.AbstractC6507a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* renamed from: c0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4181j {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f33635a = AbstractC3561w.f(a.f33636a);

    /* renamed from: c0.j$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33636a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4179h invoke() {
            return null;
        }
    }

    public static final InterfaceC4179h a(Map map, InterfaceC6835l interfaceC6835l) {
        return new C4180i(map, interfaceC6835l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!AbstractC6507a.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final H0 d() {
        return f33635a;
    }
}
