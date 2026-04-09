package androidx.lifecycle;

import Zg.AbstractC3689v;
import android.content.Context;
import androidx.lifecycle.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;
import u2.InterfaceC8128a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lu2/a;", "Landroidx/lifecycle/o;", "<init>", "()V", "Landroid/content/Context;", "context", SnmpConfigurator.O_COMMUNITY, "(Landroid/content/Context;)Landroidx/lifecycle/o;", "", "Ljava/lang/Class;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Ljava/util/List;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC8128a {
    @Override // u2.InterfaceC8128a
    public List a() {
        return AbstractC3689v.l();
    }

    @Override // u2.InterfaceC8128a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4017o b(Context context) {
        AbstractC6492s.i(context, "context");
        androidx.startup.a aVarE = androidx.startup.a.e(context);
        AbstractC6492s.h(aVarE, "getInstance(context)");
        if (!aVarE.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C4014l.a(context);
        y.b bVar = y.f31698i;
        bVar.b(context);
        return bVar.a();
    }
}
