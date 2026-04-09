package m2;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: m2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6751i extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6751i(q database) {
        super(database);
        AbstractC6492s.i(database, "database");
    }

    protected abstract void i(SupportSQLiteStatement supportSQLiteStatement, Object obj);

    public final void j(Iterable entities) {
        AbstractC6492s.i(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementB = b();
        try {
            Iterator it = entities.iterator();
            while (it.hasNext()) {
                i(supportSQLiteStatementB, it.next());
                supportSQLiteStatementB.executeInsert();
            }
        } finally {
            h(supportSQLiteStatementB);
        }
    }

    public final void k(Object obj) {
        SupportSQLiteStatement supportSQLiteStatementB = b();
        try {
            i(supportSQLiteStatementB, obj);
            supportSQLiteStatementB.executeInsert();
        } finally {
            h(supportSQLiteStatementB);
        }
    }

    public final void l(Object[] entities) {
        AbstractC6492s.i(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementB = b();
        try {
            for (Object obj : entities) {
                i(supportSQLiteStatementB, obj);
                supportSQLiteStatementB.executeInsert();
            }
        } finally {
            h(supportSQLiteStatementB);
        }
    }

    public final long m(Object obj) {
        SupportSQLiteStatement supportSQLiteStatementB = b();
        try {
            i(supportSQLiteStatementB, obj);
            return supportSQLiteStatementB.executeInsert();
        } finally {
            h(supportSQLiteStatementB);
        }
    }
}
