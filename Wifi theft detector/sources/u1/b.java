package u1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends Closeable {
    void B();

    void C(String str, Object[] objArr);

    void E();

    f J(String str);

    Cursor M(e eVar);

    Cursor O(String str);

    boolean S();

    Cursor T(e eVar, CancellationSignal cancellationSignal);

    String getPath();

    boolean isOpen();

    void u();

    List x();

    void y(String str);
}
