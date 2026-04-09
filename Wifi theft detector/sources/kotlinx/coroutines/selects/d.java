package kotlinx.coroutines.selects;

import kotlin.jvm.internal.i;
import l9.q;

/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22660a;

    /* renamed from: b, reason: collision with root package name */
    public final q f22661b;

    /* renamed from: c, reason: collision with root package name */
    public final q f22662c;

    /* renamed from: d, reason: collision with root package name */
    public final q f22663d;

    public d(Object obj, q qVar, q qVar2) {
        this.f22660a = obj;
        this.f22661b = qVar;
        this.f22662c = qVar2;
        this.f22663d = SelectKt.f22647a;
    }

    @Override // kotlinx.coroutines.selects.g
    public q a() {
        return this.f22661b;
    }

    @Override // kotlinx.coroutines.selects.g
    public q b() {
        return this.f22662c;
    }

    @Override // kotlinx.coroutines.selects.g
    public q c() {
        return this.f22663d;
    }

    @Override // kotlinx.coroutines.selects.g
    public Object d() {
        return this.f22660a;
    }

    public /* synthetic */ d(Object obj, q qVar, q qVar2, int i10, i iVar) {
        this(obj, qVar, (i10 & 4) != 0 ? null : qVar2);
    }
}
