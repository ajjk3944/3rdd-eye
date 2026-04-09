package A9;

import b9.C1992A;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import h9.AbstractC4424a;
import i9.InterfaceC4463a;
import t4.C5606d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CoroutineStart.kt */
/* loaded from: classes3.dex */
public final class G {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ G[] $VALUES;
    public static final G DEFAULT = new G("DEFAULT", 0);
    public static final G LAZY = new G("LAZY", 1);
    public static final G ATOMIC = new G("ATOMIC", 2);
    public static final G UNDISPATCHED = new G("UNDISPATCHED", 3);

    /* compiled from: CoroutineStart.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f188a;

        static {
            int[] iArr = new int[G.values().length];
            try {
                iArr[G.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f188a = iArr;
        }
    }

    private static final /* synthetic */ G[] $values() {
        return new G[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        G[] gArr$values = $values();
        $VALUES = gArr$values;
        $ENTRIES = com.google.gson.internal.c.l(gArr$values);
    }

    private G(String str, int i) {
    }

    public static InterfaceC4463a<G> getEntries() {
        return $ENTRIES;
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) $VALUES.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R, T> void invoke(p9.p<? super R, ? super InterfaceC4347e<? super T>, ? extends Object> pVar, R r9, InterfaceC4347e<? super T> completion) {
        Object objInvoke;
        int i = a.f188a[ordinal()];
        if (i == 1) {
            C5606d.D(pVar, r9, completion);
            return;
        }
        if (i == 2) {
            kotlin.jvm.internal.l.f(pVar, "<this>");
            kotlin.jvm.internal.l.f(completion, "completion");
            com.google.gson.internal.c.r(com.google.gson.internal.c.k(pVar, r9, completion)).resumeWith(C1992A.f18074a);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new b9.j();
            }
            return;
        }
        kotlin.jvm.internal.l.f(completion, "completion");
        try {
            InterfaceC4350h context = completion.getContext();
            Object objC = F9.A.c(context, null);
            try {
                if (pVar instanceof AbstractC4424a) {
                    kotlin.jvm.internal.z.b(2, pVar);
                    objInvoke = pVar.invoke(r9, completion);
                } else {
                    objInvoke = com.google.gson.internal.c.J(pVar, r9, completion);
                }
                F9.A.a(context, objC);
                if (objInvoke != g9.a.COROUTINE_SUSPENDED) {
                    completion.resumeWith(objInvoke);
                }
            } catch (Throwable th) {
                F9.A.a(context, objC);
                throw th;
            }
        } catch (Throwable th2) {
            completion.resumeWith(b9.n.a(th2));
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }
}
