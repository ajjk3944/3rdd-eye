package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.l6;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class i1 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1298a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f1299d;

    public /* synthetic */ i1(Map map, int i10) {
        this.f1298a = i10;
        this.f1299d = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f1298a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((f1) this.f1299d).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((l6) this.f1299d).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((rs.b0) this.f1299d).e((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f1298a) {
            case 0:
                ((f1) this.f1299d).clear();
                break;
            case 1:
                ((l6) this.f1299d).clear();
                break;
            case 2:
                ((rs.b0) this.f1299d).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f1298a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((f1) this.f1299d).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((l6) this.f1299d).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((rs.b0) this.f1299d).get(entry3.getKey());
                Object value3 = entry3.getValue();
                return obj4 == value3 || (obj4 != null && obj4.equals(value3));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f1298a) {
            case 0:
                return new h1((f1) this.f1299d, 0);
            case 1:
                return new h1((l6) this.f1299d);
            case 2:
                return new h1((rs.b0) this.f1299d, 2);
            default:
                return new u.c((u.e) this.f1299d);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f1298a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((f1) this.f1299d).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((l6) this.f1299d).remove(entry2.getKey());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((rs.b0) this.f1299d).remove(entry3.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f1298a) {
            case 0:
                return ((f1) this.f1299d).size();
            case 1:
                return ((l6) this.f1299d).size();
            case 2:
                return ((rs.b0) this.f1299d).size();
            default:
                return ((u.e) this.f1299d).f23077g;
        }
    }
}
