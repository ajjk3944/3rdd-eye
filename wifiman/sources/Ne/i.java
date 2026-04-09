package Ne;

import Zg.AbstractC3689v;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import s9.d;

/* loaded from: classes4.dex */
public abstract class i {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16414a;

        static {
            int[] iArr = new int[S8.d.values().length];
            try {
                iArr[S8.d.MHZ_80_80.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f16414a = iArr;
        }
    }

    public static final s9.d a(S8.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return a.f16414a[dVar.ordinal()] == 1 ? new d.b(AbstractC6780c.f53288C4) : new d.b(AbstractC6780c.f53585t4, AbstractC3689v.e(Integer.valueOf(dVar.getWidth())));
    }
}
