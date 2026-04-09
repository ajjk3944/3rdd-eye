package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class en3 extends dn3 {
    public final /* synthetic */ int i = 0;
    public final transient Object j;

    public en3(Object obj) {
        obj.getClass();
        this.j = obj;
    }

    @Override // defpackage.tm3
    public final yq2 a() {
        switch (this.i) {
            case 0:
                return new zm3((fn3) this.j);
            default:
                return new jn3(this.j);
        }
    }

    @Override // defpackage.tm3, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    fn3 fn3Var = (fn3) this.j;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((xn3) fn3Var.d()).get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return this.j.equals(obj);
        }
    }

    @Override // defpackage.dn3, defpackage.tm3
    public xm3 e() {
        switch (this.i) {
            case 1:
                return xm3.i(this.j);
            default:
                return super.e();
        }
    }

    @Override // defpackage.tm3
    public final boolean f() {
        switch (this.i) {
        }
        return false;
    }

    @Override // defpackage.tm3
    public int g(Object[] objArr, int i) {
        switch (this.i) {
            case 1:
                objArr[i] = this.j;
                return i + 1;
            default:
                return super.g(objArr, i);
        }
    }

    @Override // defpackage.dn3, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.i) {
            case 1:
                return this.j.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        switch (this.i) {
            case 0:
                return new zm3((fn3) this.j);
            default:
                return new jn3(this.j);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.i) {
            case 0:
                return ((fn3) this.j).j;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.i) {
            case 1:
                String string = this.j.toString();
                return ex0.l(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
            default:
                return super.toString();
        }
    }

    public en3(fn3 fn3Var) {
        this.j = fn3Var;
    }
}
