package s3;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.InterfaceC4275d;
import com.google.android.gms.common.api.internal.InterfaceC4282k;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import r3.C7567e;

/* renamed from: s3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7892g extends AbstractC7888c implements a.f {

    /* renamed from: F, reason: collision with root package name */
    private final C7889d f61284F;

    /* renamed from: G, reason: collision with root package name */
    private final Set f61285G;

    /* renamed from: H, reason: collision with root package name */
    private final Account f61286H;

    protected AbstractC7892g(Context context, Looper looper, int i10, C7889d c7889d, e.a aVar, e.b bVar) {
        this(context, looper, i10, c7889d, (InterfaceC4275d) aVar, (InterfaceC4282k) bVar);
    }

    private final Set i0(Set set) {
        Set setH0 = h0(set);
        Iterator it = setH0.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setH0;
    }

    @Override // s3.AbstractC7888c
    protected final Set A() {
        return this.f61285G;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set a() {
        return m() ? this.f61285G : Collections.emptySet();
    }

    protected Set h0(Set set) {
        return set;
    }

    @Override // s3.AbstractC7888c
    public final Account s() {
        return this.f61286H;
    }

    @Override // s3.AbstractC7888c
    protected Executor u() {
        return null;
    }

    protected AbstractC7892g(Context context, Looper looper, int i10, C7889d c7889d, InterfaceC4275d interfaceC4275d, InterfaceC4282k interfaceC4282k) {
        this(context, looper, AbstractC7893h.a(context), C7567e.n(), i10, c7889d, (InterfaceC4275d) AbstractC7901p.l(interfaceC4275d), (InterfaceC4282k) AbstractC7901p.l(interfaceC4282k));
    }

    protected AbstractC7892g(Context context, Looper looper, AbstractC7893h abstractC7893h, C7567e c7567e, int i10, C7889d c7889d, InterfaceC4275d interfaceC4275d, InterfaceC4282k interfaceC4282k) {
        super(context, looper, abstractC7893h, c7567e, i10, interfaceC4275d == null ? null : new E(interfaceC4275d), interfaceC4282k == null ? null : new F(interfaceC4282k), c7889d.h());
        this.f61284F = c7889d;
        this.f61286H = c7889d.a();
        this.f61285G = i0(c7889d.c());
    }
}
