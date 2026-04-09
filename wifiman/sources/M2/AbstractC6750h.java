package m2;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: m2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6750h extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6750h(q database) {
        super(database);
        AbstractC6492s.i(database, "database");
    }

    protected abstract void i(SupportSQLiteStatement supportSQLiteStatement, Object obj);

    public final int j(Object obj) {
        SupportSQLiteStatement supportSQLiteStatementB = b();
        try {
            i(supportSQLiteStatementB, obj);
            return supportSQLiteStatementB.executeUpdateDelete();
        } finally {
            h(supportSQLiteStatementB);
        }
    }

    public final int k(Object[] entities) {
        AbstractC6492s.i(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementB = b();
        try {
            int iExecuteUpdateDelete = 0;
            for (Object obj : entities) {
                i(supportSQLiteStatementB, obj);
                iExecuteUpdateDelete += supportSQLiteStatementB.executeUpdateDelete();
            }
            return iExecuteUpdateDelete;
        } finally {
            h(supportSQLiteStatementB);
        }
    }
}
