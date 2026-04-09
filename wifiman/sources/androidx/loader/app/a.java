package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.S;
import e2.AbstractC5414b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC1112a {
        void F(AbstractC5414b abstractC5414b, Object obj);

        AbstractC5414b n(int i10, Bundle bundle);

        void p(AbstractC5414b abstractC5414b);
    }

    public static a c(InterfaceC4017o interfaceC4017o) {
        return new b(interfaceC4017o, ((S) interfaceC4017o).o());
    }

    public abstract void a(int i10);

    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract AbstractC5414b d(int i10, Bundle bundle, InterfaceC1112a interfaceC1112a);

    public abstract void e();
}
