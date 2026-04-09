package td;

import com.ui.wifiman.model.speedtest.Speedtest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class h {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62100a;

        static {
            int[] iArr = new int[Ka.b.values().length];
            try {
                iArr[Ka.b.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ka.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ka.b.FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f62100a = iArr;
        }
    }

    public static final Speedtest.a.b a(Ka.c cVar) {
        Speedtest.a.c cVar2;
        AbstractC6492s.i(cVar, "<this>");
        int i10 = a.f62100a[cVar.b().ordinal()];
        if (i10 == 1 || i10 == 2) {
            cVar2 = Speedtest.a.c.IN_PROGRESS;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            cVar2 = Speedtest.a.c.FINISHED;
        }
        return new Speedtest.a.b(cVar2, cVar.a() * 8);
    }
}
