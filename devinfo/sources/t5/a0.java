package t5;

import android.database.SQLException;
import b5.i0;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34191b;

    /* renamed from: c, reason: collision with root package name */
    public int f34192c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f34193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f34194e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(f0 f0Var, ck.c cVar, int i4) {
        super(2, cVar);
        this.f34191b = i4;
        this.f34194e = f0Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f34191b) {
            case 0:
                a0 a0Var = new a0(this.f34194e, cVar, 0);
                a0Var.f34193d = obj;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0(this.f34194e, cVar, 1);
                a0Var2.f34193d = obj;
                return a0Var2;
            default:
                a0 a0Var3 = new a0(this.f34194e, cVar, 2);
                a0Var3.f34193d = obj;
                return a0Var3;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34191b) {
        }
        return ((a0) create((w) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        w wVar;
        Object objD;
        Object objB;
        w wVar2;
        Object objD2;
        j[] jVarArr;
        j jVar;
        switch (this.f34191b) {
            case 0:
                int i4 = this.f34192c;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return obj;
                }
                ci.b.D(obj);
                v5.l lVar = (v5.l) this.f34193d;
                this.f34192c = 1;
                Object objA = f0.a(this.f34194e, lVar, this);
                dk.a aVar = dk.a.f22275a;
                return objA == aVar ? aVar : objA;
            case 1:
                int i10 = this.f34192c;
                dk.a aVar2 = dk.a.f22275a;
                try {
                    if (i10 == 0) {
                        ci.b.D(obj);
                        wVar = (w) this.f34193d;
                        this.f34193d = wVar;
                        this.f34192c = 1;
                        objD = wVar.d(this);
                        if (objD == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ci.b.D(obj);
                            objB = obj;
                            return (Set) objB;
                        }
                        wVar = (w) this.f34193d;
                        ci.b.D(obj);
                        objD = obj;
                    }
                    if (!((Boolean) objD).booleanValue()) {
                        v vVar = v.f34292b;
                        a0 a0Var = new a0(this.f34194e, null, 0);
                        this.f34193d = null;
                        this.f34192c = 2;
                        objB = wVar.b(vVar, a0Var, this);
                        if (objB == aVar2) {
                            return aVar2;
                        }
                        return (Set) objB;
                    }
                } catch (SQLException unused) {
                }
                return zj.u.f38319a;
            default:
                int i11 = this.f34192c;
                yj.u uVar = yj.u.f37649a;
                boolean z3 = true;
                dk.a aVar3 = dk.a.f22275a;
                if (i11 == 0) {
                    ci.b.D(obj);
                    wVar2 = (w) this.f34193d;
                    this.f34193d = wVar2;
                    this.f34192c = 1;
                    objD2 = wVar2.d(this);
                    if (objD2 != aVar3) {
                    }
                    return aVar3;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                wVar2 = (w) this.f34193d;
                ci.b.D(obj);
                objD2 = obj;
                if (((Boolean) objD2).booleanValue()) {
                    return uVar;
                }
                f0 f0Var = this.f34194e;
                i0 i0Var = f0Var.f34232h;
                long[] jArr = (long[]) i0Var.f1822c;
                ReentrantLock reentrantLock = (ReentrantLock) i0Var.f1821b;
                reentrantLock.lock();
                try {
                    if (i0Var.f1820a) {
                        boolean z10 = false;
                        i0Var.f1820a = false;
                        int length = jArr.length;
                        jVarArr = new j[length];
                        int i12 = 0;
                        boolean z11 = false;
                        while (i12 < length) {
                            if (jArr[i12] <= 0) {
                                z3 = z10;
                            }
                            boolean[] zArr = (boolean[]) i0Var.f1823d;
                            if (z3 != zArr[i12]) {
                                zArr[i12] = z3;
                                jVar = z3 ? j.f34244b : j.f34245c;
                                z11 = true;
                            } else {
                                jVar = j.f34243a;
                            }
                            jVarArr[i12] = jVar;
                            i12++;
                            z3 = true;
                            z10 = false;
                        }
                        if (!z11) {
                            jVarArr = null;
                        }
                        reentrantLock.unlock();
                    } else {
                        reentrantLock.unlock();
                        jVarArr = null;
                    }
                    if (jVarArr == null) {
                        return uVar;
                    }
                    e0 e0Var = new e0(jVarArr, f0Var, wVar2, null);
                    this.f34193d = null;
                    this.f34192c = 2;
                    if (wVar2.b(v.f34292b, e0Var, this) != aVar3) {
                        return uVar;
                    }
                    return aVar3;
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
        }
    }
}
