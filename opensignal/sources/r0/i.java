package r0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import mq.l;

/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: d, reason: collision with root package name */
    public static final i f21133d = new i(new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f21134a;

    public i(Object[] objArr) {
        this.f21134a = objArr;
    }

    @Override // mq.a
    public final int a() {
        return this.f21134a.length;
    }

    @Override // r0.c
    public final c b(int i10, Object obj) {
        Object[] objArr = this.f21134a;
        io.sentry.config.a.H(i10, objArr.length);
        if (i10 == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            l.f0(0, i10, 6, objArr, objArr2);
            l.c0(i10 + 1, i10, objArr.length, objArr, objArr2);
            objArr2[i10] = obj;
            return new i(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        br.l.d(objArrCopyOf, "copyOf(...)");
        l.c0(i10 + 1, i10, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // r0.c
    public final c c(Object obj) {
        Object[] objArr = this.f21134a;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        br.l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[objArr.length] = obj;
        return new i(objArrCopyOf);
    }

    @Override // r0.c
    public final c d(Collection collection) {
        Object[] objArr = this.f21134a;
        if (collection.size() + objArr.length > 32) {
            f fVarE = e();
            fVarE.addAll(collection);
            return fVarE.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        br.l.d(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new i(objArrCopyOf);
    }

    @Override // r0.c
    public final f e() {
        return new f(this, null, this.f21134a, 0);
    }

    @Override // r0.c
    public final c g(b bVar) {
        Object[] objArr = this.f21134a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z10 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) bVar.a(obj)).booleanValue()) {
                if (!z10) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    br.l.d(objArrCopyOf, "copyOf(...)");
                    z10 = true;
                    length = i10;
                }
            } else if (z10) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f21133d : new i(l.h0(objArrCopyOf, 0, length));
    }

    @Override // java.util.List
    public final Object get(int i10) {
        io.sentry.config.a.G(i10, a());
        return this.f21134a[i10];
    }

    @Override // mq.d, java.util.List
    public final int indexOf(Object obj) {
        return l.r0(obj, this.f21134a);
    }

    @Override // r0.c
    public final c j(int i10) {
        Object[] objArr = this.f21134a;
        io.sentry.config.a.G(i10, objArr.length);
        if (objArr.length == 1) {
            return f21133d;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        br.l.d(objArrCopyOf, "copyOf(...)");
        l.c0(i10, i10 + 1, objArr.length, objArr, objArrCopyOf);
        return new i(objArrCopyOf);
    }

    @Override // r0.c
    public final c k(int i10, Object obj) {
        Object[] objArr = this.f21134a;
        io.sentry.config.a.G(i10, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        br.l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = obj;
        return new i(objArrCopyOf);
    }

    @Override // mq.d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f21134a;
        br.l.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    @Override // mq.d, java.util.List
    public final ListIterator listIterator(int i10) {
        Object[] objArr = this.f21134a;
        io.sentry.config.a.H(i10, objArr.length);
        return new d(objArr, i10, objArr.length);
    }
}
