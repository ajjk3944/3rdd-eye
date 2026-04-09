package Q6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f19217a;

    /* renamed from: b, reason: collision with root package name */
    private int f19218b;

    /* renamed from: c, reason: collision with root package name */
    private long f19219c;

    /* renamed from: d, reason: collision with root package name */
    private int f19220d;

    /* renamed from: e, reason: collision with root package name */
    private int f19221e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19222f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19223g;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f19224a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f19225b = 1;

        /* renamed from: c, reason: collision with root package name */
        private long f19226c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f19227d = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f19228e = 3;

        /* renamed from: f, reason: collision with root package name */
        private boolean f19229f = true;

        /* renamed from: g, reason: collision with root package name */
        private boolean f19230g = true;

        public g a() {
            return new g(this.f19224a, this.f19225b, this.f19226c, this.f19227d, this.f19228e, this.f19229f, this.f19230g);
        }

        public b b(int i10) {
            if (i10 >= -1 && i10 <= 2) {
                this.f19224a = i10;
                return this;
            }
            throw new IllegalArgumentException("invalid scan mode " + i10);
        }
    }

    g(int i10, int i11, long j10, int i12, int i13, boolean z10, boolean z11) {
        this.f19217a = i10;
        this.f19218b = i11;
        this.f19219c = j10;
        this.f19221e = i13;
        this.f19220d = i12;
        this.f19222f = z10;
        this.f19223g = z11;
    }

    public g a(int i10) {
        return new g(this.f19217a, i10, this.f19219c, this.f19220d, this.f19221e, this.f19222f, this.f19223g);
    }

    public int b() {
        return this.f19218b;
    }

    public boolean c() {
        return this.f19222f;
    }

    public int d() {
        return this.f19220d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f19221e;
    }

    public long f() {
        return this.f19219c;
    }

    public int g() {
        return this.f19217a;
    }

    public boolean h() {
        return this.f19223g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19217a);
        parcel.writeInt(this.f19218b);
        parcel.writeLong(this.f19219c);
        parcel.writeInt(this.f19220d);
        parcel.writeInt(this.f19221e);
        parcel.writeInt(this.f19222f ? 1 : 0);
        parcel.writeInt(this.f19223g ? 1 : 0);
    }

    g(Parcel parcel) {
        this.f19217a = parcel.readInt();
        this.f19218b = parcel.readInt();
        this.f19219c = parcel.readLong();
        this.f19220d = parcel.readInt();
        this.f19221e = parcel.readInt();
        this.f19222f = parcel.readInt() != 0;
        this.f19223g = parcel.readInt() != 0;
    }
}
