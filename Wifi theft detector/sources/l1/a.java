package l1;

import androidx.lifecycle.j0;
import androidx.lifecycle.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {
    public static a b(n nVar) {
        return new b(nVar, ((j0) nVar).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
