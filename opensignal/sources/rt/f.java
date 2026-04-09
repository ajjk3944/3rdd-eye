package rt;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class f extends AbstractList implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public int f21790a;

    /* renamed from: d, reason: collision with root package name */
    public Object f21791d;

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i10 = this.f21790a;
        if (i10 == 0) {
            this.f21791d = obj;
        } else if (i10 == 1) {
            this.f21791d = new Object[]{this.f21791d, obj};
        } else {
            Object[] objArr = (Object[]) this.f21791d;
            int length = objArr.length;
            if (i10 >= length) {
                int i11 = ((length * 3) / 2) + 1;
                int i12 = i10 + 1;
                if (i11 < i12) {
                    i11 = i12;
                }
                Object[] objArr2 = new Object[i11];
                this.f21791d = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f21790a] = obj;
        }
        this.f21790a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f21791d = null;
        this.f21790a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f21790a)) {
            return i11 == 1 ? this.f21791d : ((Object[]) this.f21791d)[i10];
        }
        StringBuilder sbU = h0.b.u("Index: ", i10, ", Size: ");
        sbU.append(this.f21790a);
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i10 = this.f21790a;
        if (i10 == 0) {
            return d.f21786a;
        }
        if (i10 == 1) {
            return new e(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        Object obj;
        if (i10 < 0 || i10 >= (i11 = this.f21790a)) {
            StringBuilder sbU = h0.b.u("Index: ", i10, ", Size: ");
            sbU.append(this.f21790a);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        if (i11 == 1) {
            obj = this.f21791d;
            this.f21791d = null;
        } else {
            Object[] objArr = (Object[]) this.f21791d;
            Object obj2 = objArr[i10];
            if (i11 == 2) {
                this.f21791d = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f21790a - 1] = null;
            }
            obj = obj2;
        }
        this.f21790a--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f21790a)) {
            StringBuilder sbU = h0.b.u("Index: ", i10, ", Size: ");
            sbU.append(this.f21790a);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        if (i11 == 1) {
            Object obj2 = this.f21791d;
            this.f21791d = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f21791d;
        Object obj3 = objArr[i10];
        objArr[i10] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21790a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i10 = this.f21790a;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f21791d, 0, i10, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            a(4);
            throw null;
        }
        int length = objArr.length;
        int i10 = this.f21790a;
        if (i10 == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f21791d;
                return objArr2;
            }
            objArr[0] = this.f21791d;
        } else {
            if (length < i10) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f21791d, i10, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                a(6);
                throw null;
            }
            if (i10 != 0) {
                System.arraycopy(this.f21791d, 0, objArr, 0, i10);
            }
        }
        int i11 = this.f21790a;
        if (length > i11) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        if (i10 >= 0 && i10 <= (i11 = this.f21790a)) {
            if (i11 == 0) {
                this.f21791d = obj;
            } else if (i11 == 1 && i10 == 0) {
                this.f21791d = new Object[]{obj, this.f21791d};
            } else {
                Object[] objArr = new Object[i11 + 1];
                if (i11 == 1) {
                    objArr[0] = this.f21791d;
                } else {
                    Object[] objArr2 = (Object[]) this.f21791d;
                    System.arraycopy(objArr2, 0, objArr, 0, i10);
                    System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f21790a - i10);
                }
                objArr[i10] = obj;
                this.f21791d = objArr;
            }
            this.f21790a++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbU = h0.b.u("Index: ", i10, ", Size: ");
        sbU.append(this.f21790a);
        throw new IndexOutOfBoundsException(sbU.toString());
    }
}
