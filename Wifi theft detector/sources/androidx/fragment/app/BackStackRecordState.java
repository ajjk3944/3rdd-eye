package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.z;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f3073a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3074b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f3075c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f3076d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3077e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3078f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3079g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3080h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f3081i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3082j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f3083k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3084l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3085m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3086n;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i10) {
            return new BackStackRecordState[i10];
        }
    }

    public BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.f3393c.size();
        this.f3073a = new int[size * 6];
        if (!aVar.f3399i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f3074b = new ArrayList(size);
        this.f3075c = new int[size];
        this.f3076d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            z.a aVar2 = (z.a) aVar.f3393c.get(i11);
            int i12 = i10 + 1;
            this.f3073a[i10] = aVar2.f3410a;
            ArrayList arrayList = this.f3074b;
            Fragment fragment = aVar2.f3411b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f3073a;
            iArr[i12] = aVar2.f3412c ? 1 : 0;
            iArr[i10 + 2] = aVar2.f3413d;
            iArr[i10 + 3] = aVar2.f3414e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar2.f3415f;
            i10 += 6;
            iArr[i13] = aVar2.f3416g;
            this.f3075c[i11] = aVar2.f3417h.ordinal();
            this.f3076d[i11] = aVar2.f3418i.ordinal();
        }
        this.f3077e = aVar.f3398h;
        this.f3078f = aVar.f3401k;
        this.f3079g = aVar.f3237v;
        this.f3080h = aVar.f3402l;
        this.f3081i = aVar.f3403m;
        this.f3082j = aVar.f3404n;
        this.f3083k = aVar.f3405o;
        this.f3084l = aVar.f3406p;
        this.f3085m = aVar.f3407q;
        this.f3086n = aVar.f3408r;
    }

    public final void c(androidx.fragment.app.a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f3073a.length) {
                aVar.f3398h = this.f3077e;
                aVar.f3401k = this.f3078f;
                aVar.f3399i = true;
                aVar.f3402l = this.f3080h;
                aVar.f3403m = this.f3081i;
                aVar.f3404n = this.f3082j;
                aVar.f3405o = this.f3083k;
                aVar.f3406p = this.f3084l;
                aVar.f3407q = this.f3085m;
                aVar.f3408r = this.f3086n;
                return;
            }
            z.a aVar2 = new z.a();
            int i12 = i10 + 1;
            aVar2.f3410a = this.f3073a[i10];
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f3073a[i12]);
            }
            aVar2.f3417h = Lifecycle.State.values()[this.f3075c[i11]];
            aVar2.f3418i = Lifecycle.State.values()[this.f3076d[i11]];
            int[] iArr = this.f3073a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar2.f3412c = z10;
            int i14 = iArr[i13];
            aVar2.f3413d = i14;
            int i15 = iArr[i10 + 3];
            aVar2.f3414e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar2.f3415f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar2.f3416g = i18;
            aVar.f3394d = i14;
            aVar.f3395e = i15;
            aVar.f3396f = i17;
            aVar.f3397g = i18;
            aVar.f(aVar2);
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public androidx.fragment.app.a e(FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        c(aVar);
        aVar.f3237v = this.f3079g;
        for (int i10 = 0; i10 < this.f3074b.size(); i10++) {
            String str = (String) this.f3074b.get(i10);
            if (str != null) {
                ((z.a) aVar.f3393c.get(i10)).f3411b = fragmentManager.f0(str);
            }
        }
        aVar.r(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f3073a);
        parcel.writeStringList(this.f3074b);
        parcel.writeIntArray(this.f3075c);
        parcel.writeIntArray(this.f3076d);
        parcel.writeInt(this.f3077e);
        parcel.writeString(this.f3078f);
        parcel.writeInt(this.f3079g);
        parcel.writeInt(this.f3080h);
        TextUtils.writeToParcel(this.f3081i, parcel, 0);
        parcel.writeInt(this.f3082j);
        TextUtils.writeToParcel(this.f3083k, parcel, 0);
        parcel.writeStringList(this.f3084l);
        parcel.writeStringList(this.f3085m);
        parcel.writeInt(this.f3086n ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f3073a = parcel.createIntArray();
        this.f3074b = parcel.createStringArrayList();
        this.f3075c = parcel.createIntArray();
        this.f3076d = parcel.createIntArray();
        this.f3077e = parcel.readInt();
        this.f3078f = parcel.readString();
        this.f3079g = parcel.readInt();
        this.f3080h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f3081i = (CharSequence) creator.createFromParcel(parcel);
        this.f3082j = parcel.readInt();
        this.f3083k = (CharSequence) creator.createFromParcel(parcel);
        this.f3084l = parcel.createStringArrayList();
        this.f3085m = parcel.createStringArrayList();
        this.f3086n = parcel.readInt() != 0;
    }
}
