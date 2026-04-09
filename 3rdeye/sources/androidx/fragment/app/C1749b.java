package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.H;
import java.util.ArrayList;

/* compiled from: BackStackRecordState.java */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1749b implements Parcelable {
    public static final Parcelable.Creator<C1749b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f15852b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<String> f15853c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f15854d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f15855e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15856f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15857g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15858h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f15859j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15860k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f15861l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList<String> f15862m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList<String> f15863n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f15864o;

    /* compiled from: BackStackRecordState.java */
    /* renamed from: androidx.fragment.app.b$a */
    public class a implements Parcelable.Creator<C1749b> {
        @Override // android.os.Parcelable.Creator
        public final C1749b createFromParcel(Parcel parcel) {
            return new C1749b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C1749b[] newArray(int i) {
            return new C1749b[i];
        }
    }

    public C1749b(C1748a c1748a) {
        int size = c1748a.f15784a.size();
        this.f15852b = new int[size * 6];
        if (!c1748a.f15790g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f15853c = new ArrayList<>(size);
        this.f15854d = new int[size];
        this.f15855e = new int[size];
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            H.a aVar = c1748a.f15784a.get(i10);
            int i11 = i + 1;
            this.f15852b[i] = aVar.f15799a;
            ArrayList<String> arrayList = this.f15853c;
            ComponentCallbacksC1759l componentCallbacksC1759l = aVar.f15800b;
            arrayList.add(componentCallbacksC1759l != null ? componentCallbacksC1759l.mWho : null);
            int[] iArr = this.f15852b;
            iArr[i11] = aVar.f15801c ? 1 : 0;
            iArr[i + 2] = aVar.f15802d;
            iArr[i + 3] = aVar.f15803e;
            int i12 = i + 5;
            iArr[i + 4] = aVar.f15804f;
            i += 6;
            iArr[i12] = aVar.f15805g;
            this.f15854d[i10] = aVar.f15806h.ordinal();
            this.f15855e[i10] = aVar.i.ordinal();
        }
        this.f15856f = c1748a.f15789f;
        this.f15857g = c1748a.i;
        this.f15858h = c1748a.f15851s;
        this.i = c1748a.f15792j;
        this.f15859j = c1748a.f15793k;
        this.f15860k = c1748a.f15794l;
        this.f15861l = c1748a.f15795m;
        this.f15862m = c1748a.f15796n;
        this.f15863n = c1748a.f15797o;
        this.f15864o = c1748a.f15798p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f15852b);
        parcel.writeStringList(this.f15853c);
        parcel.writeIntArray(this.f15854d);
        parcel.writeIntArray(this.f15855e);
        parcel.writeInt(this.f15856f);
        parcel.writeString(this.f15857g);
        parcel.writeInt(this.f15858h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.f15859j, parcel, 0);
        parcel.writeInt(this.f15860k);
        TextUtils.writeToParcel(this.f15861l, parcel, 0);
        parcel.writeStringList(this.f15862m);
        parcel.writeStringList(this.f15863n);
        parcel.writeInt(this.f15864o ? 1 : 0);
    }

    public C1749b(Parcel parcel) {
        this.f15852b = parcel.createIntArray();
        this.f15853c = parcel.createStringArrayList();
        this.f15854d = parcel.createIntArray();
        this.f15855e = parcel.createIntArray();
        this.f15856f = parcel.readInt();
        this.f15857g = parcel.readString();
        this.f15858h = parcel.readInt();
        this.i = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f15859j = (CharSequence) creator.createFromParcel(parcel);
        this.f15860k = parcel.readInt();
        this.f15861l = (CharSequence) creator.createFromParcel(parcel);
        this.f15862m = parcel.createStringArrayList();
        this.f15863n = parcel.createStringArrayList();
        this.f15864o = parcel.readInt() != 0;
    }
}
