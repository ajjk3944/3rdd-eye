package ea;

import androidx.lifecycle.f1;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p implements ba.e {

    /* renamed from: a, reason: collision with root package name */
    public final Set f22509a;

    /* renamed from: b, reason: collision with root package name */
    public final i f22510b;

    /* renamed from: c, reason: collision with root package name */
    public final q f22511c;

    public p(Set set, i iVar, q qVar) {
        this.f22509a = set;
        this.f22510b = iVar;
        this.f22511c = qVar;
    }

    public final f1 a(String str, ba.b bVar, ba.d dVar) {
        Set set = this.f22509a;
        if (set.contains(bVar)) {
            return new f1(this.f22510b, str, bVar, dVar, this.f22511c, 4);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
    }
}
