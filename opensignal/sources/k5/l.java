package k5;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class l extends m {

    /* renamed from: n, reason: collision with root package name */
    public static final l f14089n;

    /* renamed from: d, reason: collision with root package name */
    public final List f14090d;

    /* renamed from: e, reason: collision with root package name */
    public final List f14091e;

    /* renamed from: f, reason: collision with root package name */
    public final List f14092f;

    /* renamed from: g, reason: collision with root package name */
    public final List f14093g;

    /* renamed from: h, reason: collision with root package name */
    public final List f14094h;

    /* renamed from: i, reason: collision with root package name */
    public final List f14095i;
    public final androidx.media3.common.r j;
    public final List k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f14096l;

    /* renamed from: m, reason: collision with root package name */
    public final List f14097m;

    static {
        List list = Collections.EMPTY_LIST;
        f14089n = new l("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, androidx.media3.common.r rVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((k) list2.get(i10)).f14083a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.f14090d = Collections.unmodifiableList(arrayList);
        this.f14091e = Collections.unmodifiableList(list2);
        this.f14092f = Collections.unmodifiableList(list3);
        this.f14093g = Collections.unmodifiableList(list4);
        this.f14094h = Collections.unmodifiableList(list5);
        this.f14095i = Collections.unmodifiableList(list6);
        this.j = rVar;
        this.k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f14096l = Collections.unmodifiableMap(map);
        this.f14097m = Collections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((j) list.get(i10)).f14080a;
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
                    if (streamKey.f1552d == i10 && streamKey.f1553g == i11) {
                        arrayList.add(obj);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    @Override // n5.a
    public final Object a(List list) {
        ArrayList arrayListC = c(this.f14091e, 0, list);
        List list2 = Collections.EMPTY_LIST;
        return new l(this.f14098a, this.f14099b, arrayListC, list2, c(this.f14093g, 1, list), c(this.f14094h, 2, list), list2, this.j, this.k, this.f14100c, this.f14096l, this.f14097m);
    }
}
