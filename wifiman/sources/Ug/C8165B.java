package ug;

import gg.D;
import ig.AbstractC6152a;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import lg.EnumC6593c;
import ug.C8164A;
import ug.r;

/* renamed from: ug.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8165B extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final Iterable f62955a;

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62956b;

    /* renamed from: ug.B$a */
    final class a implements kg.n {
        a() {
        }

        @Override // kg.n
        public Object apply(Object obj) {
            Object objApply = C8165B.this.f62956b.apply(new Object[]{obj});
            Objects.requireNonNull(objApply, "The zipper returned a null value");
            return objApply;
        }
    }

    public C8165B(Iterable iterable, kg.n nVar) {
        this.f62955a = iterable;
        this.f62956b = nVar;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        D[] dArr = new D[8];
        try {
            int i10 = 0;
            for (D d10 : this.f62955a) {
                if (d10 == null) {
                    EnumC6593c.error(new NullPointerException("One of the sources is null"), b10);
                    return;
                }
                if (i10 == dArr.length) {
                    dArr = (D[]) Arrays.copyOf(dArr, (i10 >> 2) + i10);
                }
                int i11 = i10 + 1;
                dArr[i10] = d10;
                i10 = i11;
            }
            if (i10 == 0) {
                EnumC6593c.error(new NoSuchElementException(), b10);
                return;
            }
            if (i10 == 1) {
                dArr[0].a(new r.a(b10, new a()));
                return;
            }
            C8164A.b bVar = new C8164A.b(b10, i10, this.f62956b);
            b10.c(bVar);
            for (int i12 = 0; i12 < i10 && !bVar.isDisposed(); i12++) {
                dArr[i12].a(bVar.f62951c[i12]);
            }
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC6593c.error(th2, b10);
        }
    }
}
