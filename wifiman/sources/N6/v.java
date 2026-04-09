package N6;

import android.os.ParcelUuid;
import android.util.SparseArray;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class v implements Q6.e {

    /* renamed from: a, reason: collision with root package name */
    private final int f15380a;

    /* renamed from: b, reason: collision with root package name */
    private final List f15381b;

    /* renamed from: c, reason: collision with root package name */
    private final List f15382c;

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray f15383d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f15384e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15385f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15386g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f15387h;

    public v(List list, List list2, SparseArray sparseArray, Map map, int i10, int i11, String str, byte[] bArr) {
        this.f15381b = list;
        this.f15382c = list2;
        this.f15383d = sparseArray;
        this.f15384e = map;
        this.f15386g = str;
        this.f15380a = i10;
        this.f15385f = i11;
        this.f15387h = bArr;
    }

    @Override // Q6.e
    public String a() {
        return this.f15386g;
    }

    @Override // Q6.e
    public byte[] b() {
        return this.f15387h;
    }

    @Override // Q6.e
    public int c() {
        return this.f15380a;
    }

    @Override // Q6.e
    public byte[] d(int i10) {
        return (byte[]) this.f15383d.get(i10);
    }

    @Override // Q6.e
    public List e() {
        return this.f15382c;
    }

    @Override // Q6.e
    public List f() {
        return this.f15381b;
    }

    @Override // Q6.e
    public Map g() {
        return this.f15384e;
    }

    @Override // Q6.e
    public byte[] h(ParcelUuid parcelUuid) {
        if (parcelUuid == null) {
            return null;
        }
        return (byte[]) this.f15384e.get(parcelUuid);
    }
}
