package gt;

import com.google.android.gms.internal.measurement.e5;

/* loaded from: classes.dex */
public final class d extends h implements m {

    /* renamed from: r, reason: collision with root package name */
    public volatile bm.e f9644r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ as.d f9645x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, ht.g gVar, as.d dVar) {
        super(lVar, gVar);
        this.f9645x = dVar;
        if (lVar == null) {
            j(0);
            throw null;
        }
        this.f9644r = null;
    }

    public static /* synthetic */ void e(int i10) {
        String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i10 != 2 ? 2 : 3];
        if (i10 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i10 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i10 == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void j(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "computable";
        } else if (i10 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // gt.h, ar.a
    public final Object c() throws Throwable {
        Object objC;
        bm.e eVar = this.f9644r;
        if (eVar == null || ((Thread) eVar.f2831g) != Thread.currentThread()) {
            objC = super.c();
        } else {
            if (((Thread) eVar.f2831g) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            objC = eVar.f2830d;
        }
        if (objC != null) {
            return objC;
        }
        j(2);
        throw null;
    }

    @Override // gt.h
    public final void g(Object obj) {
        this.f9644r = new bm.e(22, obj);
        try {
            if (obj != null) {
                this.f9645x.a(obj);
            } else {
                e(2);
                throw null;
            }
        } finally {
            this.f9644r = null;
        }
    }

    @Override // gt.h
    public final ab.g i(boolean z10) {
        return new ab.g((Object) new ht.f(e5.H(kt.k.f14523d)), false, 4);
    }
}
