package H7;

import android.database.SQLException;
import b9.C1992A;
import c9.C2097r;
import java.util.List;

/* compiled from: StorageStatements.kt */
/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.m implements p9.l<List<? extends String>, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public static final o f2300g = new o(1);

    @Override // p9.l
    public final C1992A invoke(List<? extends String> list) {
        List<? extends String> failedTransactions = list;
        kotlin.jvm.internal.l.f(failedTransactions, "failedTransactions");
        throw new SQLException("Insertion failed for raw jsons with ids: " + C2097r.u0(failedTransactions, null, null, null, null, 63));
    }
}
