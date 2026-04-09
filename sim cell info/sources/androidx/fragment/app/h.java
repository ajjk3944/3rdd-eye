package androidx.fragment.app;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: c, reason: collision with root package name */
    static final f f1614c = new f();

    /* renamed from: b, reason: collision with root package name */
    private f f1615b = null;

    public static abstract class a {
    }

    public interface b {
        void a();
    }

    public abstract n a();

    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Fragment c(String str);

    public f d() {
        if (this.f1615b == null) {
            this.f1615b = f1614c;
        }
        return this.f1615b;
    }

    public abstract List<Fragment> e();

    public abstract boolean f();

    public void g(f fVar) {
        this.f1615b = fVar;
    }
}
