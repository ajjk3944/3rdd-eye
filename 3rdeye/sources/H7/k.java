package H7;

import N7.H7;
import android.database.SQLException;
import java.util.ArrayList;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import p9.InterfaceC5480a;

/* compiled from: StorageStatementExecutor.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f2296a;

    /* compiled from: StorageStatementExecutor.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2297a;

        static {
            int[] iArr = new int[F7.a.values().length];
            try {
                iArr[F7.a.ABORT_TRANSACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F7.a.SKIP_ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2297a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(InterfaceC5480a<? extends d> interfaceC5480a) {
        this.f2296a = (kotlin.jvm.internal.m) interfaceC5480a;
    }

    public static final void b(w wVar, u uVar, j[] jVarArr, F7.a aVar, k kVar, ArrayList arrayList, RuntimeException runtimeException) {
        StringBuilder sb = new StringBuilder("Exception at statement '");
        sb.append(wVar.f43660b);
        sb.append("' (");
        sb.append(uVar.f43658b);
        sb.append(" out ");
        String strP = H7.p(sb, jVarArr.length, ')');
        int i = a.f2297a[aVar.ordinal()];
        if (i == 1) {
            kVar.getClass();
            throw new SQLException(strP, runtimeException);
        }
        if (i != 2) {
            return;
        }
        arrayList.add(new F7.d(strP, runtimeException));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0 A[PHI: r4 r11
  0x00a0: PHI (r4v4 H7.d) = (r4v2 H7.d), (r4v5 H7.d) binds: [B:45:0x009e, B:54:0x00b9] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r11v6 H7.c) = (r11v4 H7.c), (r11v7 H7.c) binds: [B:45:0x009e, B:54:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v17, types: [H7.j, T] */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.internal.m, p9.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final H7.e a(F7.a r15, H7.j... r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H7.k.a(F7.a, H7.j[]):H7.e");
    }
}
