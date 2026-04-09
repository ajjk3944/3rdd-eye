package db;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends m {

    /* renamed from: l, reason: collision with root package name */
    public static final f f7220l;

    /* renamed from: d, reason: collision with root package name */
    public final List f7221d;

    /* renamed from: e, reason: collision with root package name */
    public final List f7222e;

    /* renamed from: f, reason: collision with root package name */
    public final List f7223f;

    /* renamed from: g, reason: collision with root package name */
    public final List f7224g;

    /* renamed from: h, reason: collision with root package name */
    public final Format f7225h;

    /* renamed from: i, reason: collision with root package name */
    public final List f7226i;
    public final Map j;
    public final List k;

    static {
        List list = Collections.EMPTY_LIST;
        f7220l = new f("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public f(String str, List list, List list2, List list3, List list4, List list5, List list6, Format format, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((e) list2.get(i10)).f7214a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.f7221d = Collections.unmodifiableList(arrayList);
        this.f7222e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f7223f = Collections.unmodifiableList(list4);
        this.f7224g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f7225h = format;
        this.f7226i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.j = Collections.unmodifiableMap(map);
        this.k = Collections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((d) list.get(i10)).f7211a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i10, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    StreamKey streamKey = (StreamKey) list2.get(i12);
                    if (streamKey.f4360d == i10 && streamKey.f4361g == i11) {
                        arrayList.add(obj);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    @Override // xa.a
    public final Object a(List list) {
        ArrayList arrayListC = c(this.f7222e, 0, list);
        List list2 = Collections.EMPTY_LIST;
        return new f(this.f7257a, this.f7258b, arrayListC, list2, c(this.f7223f, 1, list), c(this.f7224g, 2, list), list2, this.f7225h, this.f7226i, this.f7259c, this.j, this.k);
    }
}
