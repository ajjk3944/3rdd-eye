package E1;

/* compiled from: SQLiteStatement.kt */
/* loaded from: classes.dex */
public interface c extends AutoCloseable {
    void Q(int i, String str);

    boolean T();

    void b(int i, long j4);

    void f(int i);

    String g0(int i);

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    boolean isNull(int i);

    void reset();

    boolean x();
}
