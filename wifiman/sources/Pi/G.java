package pi;

import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    private final I0 f58059a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f58060b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC7346d0 f58061c;

    public G(I0 howThisTypeIsUsed, Set set, AbstractC7346d0 abstractC7346d0) {
        AbstractC6492s.i(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f58059a = howThisTypeIsUsed;
        this.f58060b = set;
        this.f58061c = abstractC7346d0;
    }

    public abstract AbstractC7346d0 a();

    public abstract I0 b();

    public abstract Set c();

    public abstract G d(Bh.l0 l0Var);

    public abstract int hashCode();
}
