package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: AdapterHelper.java */
/* renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1799a {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView.C1798f f16594d;

    /* renamed from: a, reason: collision with root package name */
    public final K0.d f16591a = new K0.d(30);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<C0260a> f16592b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<C0260a> f16593c = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public int f16596f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final x f16595e = new x(this);

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public static final class C0260a {

        /* renamed from: a, reason: collision with root package name */
        public int f16597a;

        /* renamed from: b, reason: collision with root package name */
        public int f16598b;

        /* renamed from: c, reason: collision with root package name */
        public Object f16599c;

        /* renamed from: d, reason: collision with root package name */
        public int f16600d;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof C0260a)) {
                    return false;
                }
                C0260a c0260a = (C0260a) obj;
                int i = this.f16597a;
                if (i != c0260a.f16597a) {
                    return false;
                }
                if (i != 8 || Math.abs(this.f16600d - this.f16598b) != 1 || this.f16600d != c0260a.f16598b || this.f16598b != c0260a.f16600d) {
                    if (this.f16600d != c0260a.f16600d || this.f16598b != c0260a.f16598b) {
                        return false;
                    }
                    Object obj2 = this.f16599c;
                    if (obj2 != null) {
                        if (!obj2.equals(c0260a.f16599c)) {
                            return false;
                        }
                    } else if (c0260a.f16599c != null) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f16597a * 31) + this.f16598b) * 31) + this.f16600d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f16597a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f16598b);
            sb.append("c:");
            sb.append(this.f16600d);
            sb.append(",p:");
            sb.append(this.f16599c);
            sb.append("]");
            return sb.toString();
        }
    }

    public C1799a(RecyclerView.C1798f c1798f) {
        this.f16594d = c1798f;
    }

    public final boolean a(int i) {
        ArrayList<C0260a> arrayList = this.f16593c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0260a c0260a = arrayList.get(i10);
            int i11 = c0260a.f16597a;
            if (i11 != 8) {
                if (i11 == 1) {
                    int i12 = c0260a.f16598b;
                    int i13 = c0260a.f16600d + i12;
                    while (i12 < i13) {
                        if (f(i12, i10 + 1) == i) {
                            return true;
                        }
                        i12++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(c0260a.f16600d, i10 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<C0260a> arrayList = this.f16593c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f16594d.a(arrayList.get(i));
        }
        k(arrayList);
        this.f16596f = 0;
    }

    public final void c() {
        b();
        ArrayList<C0260a> arrayList = this.f16592b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0260a c0260a = arrayList.get(i);
            int i10 = c0260a.f16597a;
            RecyclerView.C1798f c1798f = this.f16594d;
            if (i10 == 1) {
                c1798f.a(c0260a);
                int i11 = c0260a.f16598b;
                int i12 = c0260a.f16600d;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.offsetPositionRecordsForInsert(i11, i12);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i10 == 2) {
                c1798f.a(c0260a);
                int i13 = c0260a.f16598b;
                int i14 = c0260a.f16600d;
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.offsetPositionRecordsForRemove(i13, i14, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f16465c += i14;
            } else if (i10 == 4) {
                c1798f.a(c0260a);
                int i15 = c0260a.f16598b;
                int i16 = c0260a.f16600d;
                Object obj = c0260a.f16599c;
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.viewRangeUpdate(i15, i16, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i10 == 8) {
                c1798f.a(c0260a);
                int i17 = c0260a.f16598b;
                int i18 = c0260a.f16600d;
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.offsetPositionRecordsForMove(i17, i18);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        k(arrayList);
        this.f16596f = 0;
    }

    public final void d(C0260a c0260a) {
        int i;
        int i10 = c0260a.f16597a;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(c0260a.f16598b, i10);
        int i11 = c0260a.f16598b;
        int i12 = c0260a.f16597a;
        if (i12 == 2) {
            i = 0;
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0260a);
            }
            i = 1;
        }
        int i13 = 1;
        for (int i14 = 1; i14 < c0260a.f16600d; i14++) {
            int iL2 = l((i * i14) + c0260a.f16598b, c0260a.f16597a);
            int i15 = c0260a.f16597a;
            if (i15 == 2 ? iL2 != iL : !(i15 == 4 && iL2 == iL + 1)) {
                C0260a c0260aH = h(i15, iL, i13, c0260a.f16599c);
                e(c0260aH, i11);
                c0260aH.f16599c = null;
                this.f16591a.c(c0260aH);
                if (c0260a.f16597a == 4) {
                    i11 += i13;
                }
                i13 = 1;
                iL = iL2;
            } else {
                i13++;
            }
        }
        Object obj = c0260a.f16599c;
        c0260a.f16599c = null;
        this.f16591a.c(c0260a);
        if (i13 > 0) {
            C0260a c0260aH2 = h(c0260a.f16597a, iL, i13, obj);
            e(c0260aH2, i11);
            c0260aH2.f16599c = null;
            this.f16591a.c(c0260aH2);
        }
    }

    public final void e(C0260a c0260a, int i) {
        RecyclerView.C1798f c1798f = this.f16594d;
        c1798f.a(c0260a);
        int i10 = c0260a.f16597a;
        if (i10 == 2) {
            int i11 = c0260a.f16600d;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i, i11, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f16465c += i11;
            return;
        }
        if (i10 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = c0260a.f16600d;
        Object obj = c0260a.f16599c;
        RecyclerView recyclerView2 = RecyclerView.this;
        recyclerView2.viewRangeUpdate(i, i12, obj);
        recyclerView2.mItemsChanged = true;
    }

    public final int f(int i, int i10) {
        ArrayList<C0260a> arrayList = this.f16593c;
        int size = arrayList.size();
        while (i10 < size) {
            C0260a c0260a = arrayList.get(i10);
            int i11 = c0260a.f16597a;
            if (i11 == 8) {
                int i12 = c0260a.f16598b;
                if (i12 == i) {
                    i = c0260a.f16600d;
                } else {
                    if (i12 < i) {
                        i--;
                    }
                    if (c0260a.f16600d <= i) {
                        i++;
                    }
                }
            } else {
                int i13 = c0260a.f16598b;
                if (i13 > i) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = c0260a.f16600d;
                    if (i < i13 + i14) {
                        return -1;
                    }
                    i -= i14;
                } else if (i11 == 1) {
                    i += c0260a.f16600d;
                }
            }
            i10++;
        }
        return i;
    }

    public final boolean g() {
        return this.f16592b.size() > 0;
    }

    public final C0260a h(int i, int i10, int i11, Object obj) {
        C0260a c0260a = (C0260a) this.f16591a.a();
        if (c0260a != null) {
            c0260a.f16597a = i;
            c0260a.f16598b = i10;
            c0260a.f16600d = i11;
            c0260a.f16599c = obj;
            return c0260a;
        }
        C0260a c0260a2 = new C0260a();
        c0260a2.f16597a = i;
        c0260a2.f16598b = i10;
        c0260a2.f16600d = i11;
        c0260a2.f16599c = obj;
        return c0260a2;
    }

    public final void i(C0260a c0260a) {
        this.f16593c.add(c0260a);
        int i = c0260a.f16597a;
        RecyclerView.C1798f c1798f = this.f16594d;
        if (i == 1) {
            int i10 = c0260a.f16598b;
            int i11 = c0260a.f16600d;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForInsert(i10, i11);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i12 = c0260a.f16598b;
            int i13 = c0260a.f16600d;
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.offsetPositionRecordsForRemove(i12, i13, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i14 = c0260a.f16598b;
            int i15 = c0260a.f16600d;
            Object obj = c0260a.f16599c;
            RecyclerView recyclerView3 = RecyclerView.this;
            recyclerView3.viewRangeUpdate(i14, i15, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + c0260a);
        }
        int i16 = c0260a.f16598b;
        int i17 = c0260a.f16600d;
        RecyclerView recyclerView4 = RecyclerView.this;
        recyclerView4.offsetPositionRecordsForMove(i16, i17);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1799a.j():void");
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0260a c0260a = (C0260a) arrayList.get(i);
            c0260a.f16599c = null;
            this.f16591a.c(c0260a);
        }
        arrayList.clear();
    }

    public final int l(int i, int i10) {
        int i11;
        int i12;
        ArrayList<C0260a> arrayList = this.f16593c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0260a c0260a = arrayList.get(size);
            int i13 = c0260a.f16597a;
            if (i13 == 8) {
                int i14 = c0260a.f16598b;
                int i15 = c0260a.f16600d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i < i12 || i > i11) {
                    if (i < i14) {
                        if (i10 == 1) {
                            c0260a.f16598b = i14 + 1;
                            c0260a.f16600d = i15 + 1;
                        } else if (i10 == 2) {
                            c0260a.f16598b = i14 - 1;
                            c0260a.f16600d = i15 - 1;
                        }
                    }
                } else if (i12 == i14) {
                    if (i10 == 1) {
                        c0260a.f16600d = i15 + 1;
                    } else if (i10 == 2) {
                        c0260a.f16600d = i15 - 1;
                    }
                    i++;
                } else {
                    if (i10 == 1) {
                        c0260a.f16598b = i14 + 1;
                    } else if (i10 == 2) {
                        c0260a.f16598b = i14 - 1;
                    }
                    i--;
                }
            } else {
                int i16 = c0260a.f16598b;
                if (i16 <= i) {
                    if (i13 == 1) {
                        i -= c0260a.f16600d;
                    } else if (i13 == 2) {
                        i += c0260a.f16600d;
                    }
                } else if (i10 == 1) {
                    c0260a.f16598b = i16 + 1;
                } else if (i10 == 2) {
                    c0260a.f16598b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0260a c0260a2 = arrayList.get(size2);
            if (c0260a2.f16597a == 8) {
                int i17 = c0260a2.f16600d;
                if (i17 == c0260a2.f16598b || i17 < 0) {
                    arrayList.remove(size2);
                    c0260a2.f16599c = null;
                    this.f16591a.c(c0260a2);
                }
            } else if (c0260a2.f16600d <= 0) {
                arrayList.remove(size2);
                c0260a2.f16599c = null;
                this.f16591a.c(c0260a2);
            }
        }
        return i;
    }
}
