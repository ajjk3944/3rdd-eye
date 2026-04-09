package br;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class b implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2898a;

    /* renamed from: d, reason: collision with root package name */
    public int f2899d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2900g;

    public /* synthetic */ b(int i10, Object obj) {
        this.f2898a = i10;
        this.f2900g = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2898a) {
            case 0:
                if (this.f2899d < ((Object[]) this.f2900g).length) {
                }
                break;
            case 1:
                if (this.f2899d > 0) {
                }
                break;
            case 2:
                if (this.f2899d < ((byte[]) this.f2900g).length) {
                }
                break;
            case 3:
                if (this.f2899d < ((int[]) this.f2900g).length) {
                }
                break;
            case 4:
                if (this.f2899d < ((long[]) this.f2900g).length) {
                }
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                if (this.f2899d < ((short[]) this.f2900g).length) {
                }
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                if (this.f2899d < ((mq.d) this.f2900g).a()) {
                }
                break;
            default:
                if (this.f2899d < ((ViewGroup) this.f2900g).getChildCount()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2898a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f2900g;
                    int i10 = this.f2899d;
                    this.f2899d = i10 + 1;
                    return objArr[i10];
                } catch (ArrayIndexOutOfBoundsException e4) {
                    this.f2899d--;
                    throw new NoSuchElementException(e4.getMessage());
                }
            case 1:
                ku.u uVar = (ku.u) this.f2900g;
                int i11 = uVar.f14608c;
                int i12 = this.f2899d;
                this.f2899d = i12 - 1;
                return uVar.f14610e[i11 - i12];
            case 2:
                int i13 = this.f2899d;
                byte[] bArr = (byte[]) this.f2900g;
                if (i13 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2899d));
                }
                this.f2899d = i13 + 1;
                return new lq.s(bArr[i13]);
            case 3:
                int i14 = this.f2899d;
                int[] iArr = (int[]) this.f2900g;
                if (i14 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2899d));
                }
                this.f2899d = i14 + 1;
                return new lq.u(iArr[i14]);
            case 4:
                int i15 = this.f2899d;
                long[] jArr = (long[]) this.f2900g;
                if (i15 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2899d));
                }
                this.f2899d = i15 + 1;
                return new lq.w(jArr[i15]);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                int i16 = this.f2899d;
                short[] sArr = (short[]) this.f2900g;
                if (i16 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2899d));
                }
                this.f2899d = i16 + 1;
                return new lq.z(sArr[i16]);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                mq.d dVar = (mq.d) this.f2900g;
                int i17 = this.f2899d;
                this.f2899d = i17 + 1;
                return dVar.get(i17);
            default:
                ViewGroup viewGroup = (ViewGroup) this.f2900g;
                int i18 = this.f2899d;
                this.f2899d = i18 + 1;
                View childAt = viewGroup.getChildAt(i18);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2898a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.f2900g;
                int i10 = this.f2899d - 1;
                this.f2899d = i10;
                viewGroup.removeViewAt(i10);
                return;
        }
    }

    public b(Object[] objArr) {
        this.f2898a = 0;
        l.e(objArr, "array");
        this.f2900g = objArr;
    }

    public b(ku.u uVar) {
        this.f2898a = 1;
        this.f2900g = uVar;
        this.f2899d = uVar.f14608c;
    }
}
