package Ne;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.q;
import s9.d;

/* loaded from: classes4.dex */
public abstract class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16401a;

        static {
            int[] iArr = new int[S8.a.values().length];
            try {
                iArr[S8.a.f20355B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S8.a.f20354A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S8.a.f20356G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[S8.a.f20357N.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[S8.a.AC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[S8.a.AX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[S8.a.BE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[S8.a.AD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f16401a = iArr;
        }
    }

    /* renamed from: Ne.b$b, reason: collision with other inner class name */
    static final class C0594b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S8.a f16402a;

        C0594b(S8.a aVar) {
            this.f16402a = aVar;
        }

        public final CharSequence a(Context ctx, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ctx, "ctx");
            interfaceC3540l.U(-1206966099);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1206966099, i10, -1, "com.ui.wifiman.ui.domain.text.<anonymous> (IeeeModeExtensions.kt:28)");
            }
            String strC = b.c(this.f16402a, ctx);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return strC;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    private static final int a(S8.a aVar) {
        switch (a.f16401a[aVar.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 60;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final s9.d b(S8.a aVar) {
        AbstractC6492s.i(aVar, "<this>");
        return new d.a(String.valueOf(a(aVar)), new C0594b(aVar));
    }

    public static final String c(S8.a aVar, Context context) {
        AbstractC6492s.i(aVar, "<this>");
        AbstractC6492s.i(context, "context");
        String string = context.getString(AbstractC6780c.f53365N4);
        AbstractC6492s.h(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(a(aVar))}, 1));
        AbstractC6492s.h(str, "format(...)");
        return str;
    }
}
