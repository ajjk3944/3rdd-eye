package Wa;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;

/* loaded from: classes3.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    private final e f23764a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f23765b;

    public j(e packageCertificateService, Set allowedCerts) {
        AbstractC6492s.i(packageCertificateService, "packageCertificateService");
        AbstractC6492s.i(allowedCerts, "allowedCerts");
        this.f23764a = packageCertificateService;
        this.f23765b = allowedCerts;
    }

    @Override // Wa.f
    public boolean a(String packageName) {
        AbstractC6492s.i(packageName, "packageName");
        Set setA = this.f23764a.a(packageName);
        if (setA.isEmpty()) {
            return false;
        }
        Set<String> set = setA;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (String str : set) {
                Set setB = b();
                if ((setB instanceof Collection) && setB.isEmpty()) {
                    return false;
                }
                Iterator it = setB.iterator();
                while (it.hasNext()) {
                    if (t.C((String) it.next(), str, true)) {
                        break;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public Set b() {
        return this.f23765b;
    }
}
