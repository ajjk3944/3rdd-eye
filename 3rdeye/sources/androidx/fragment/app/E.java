package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: FragmentState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class E implements Parcelable {
    public static final Parcelable.Creator<E> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f15756b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15757c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15758d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15759e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15760f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15761g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15762h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f15763j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f15764k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15765l;

    /* renamed from: m, reason: collision with root package name */
    public final String f15766m;

    /* renamed from: n, reason: collision with root package name */
    public final int f15767n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f15768o;

    /* compiled from: FragmentState.java */
    public class a implements Parcelable.Creator<E> {
        @Override // android.os.Parcelable.Creator
        public final E createFromParcel(Parcel parcel) {
            return new E(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final E[] newArray(int i) {
            return new E[i];
        }
    }

    public E(ComponentCallbacksC1759l componentCallbacksC1759l) {
        this.f15756b = componentCallbacksC1759l.getClass().getName();
        this.f15757c = componentCallbacksC1759l.mWho;
        this.f15758d = componentCallbacksC1759l.mFromLayout;
        this.f15759e = componentCallbacksC1759l.mFragmentId;
        this.f15760f = componentCallbacksC1759l.mContainerId;
        this.f15761g = componentCallbacksC1759l.mTag;
        this.f15762h = componentCallbacksC1759l.mRetainInstance;
        this.i = componentCallbacksC1759l.mRemoving;
        this.f15763j = componentCallbacksC1759l.mDetached;
        this.f15764k = componentCallbacksC1759l.mHidden;
        this.f15765l = componentCallbacksC1759l.mMaxState.ordinal();
        this.f15766m = componentCallbacksC1759l.mTargetWho;
        this.f15767n = componentCallbacksC1759l.mTargetRequestCode;
        this.f15768o = componentCallbacksC1759l.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f15756b);
        sb.append(" (");
        sb.append(this.f15757c);
        sb.append(")}:");
        if (this.f15758d) {
            sb.append(" fromLayout");
        }
        int i = this.f15760f;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f15761g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f15762h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.f15763j) {
            sb.append(" detached");
        }
        if (this.f15764k) {
            sb.append(" hidden");
        }
        String str2 = this.f15766m;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f15767n);
        }
        if (this.f15768o) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15756b);
        parcel.writeString(this.f15757c);
        parcel.writeInt(this.f15758d ? 1 : 0);
        parcel.writeInt(this.f15759e);
        parcel.writeInt(this.f15760f);
        parcel.writeString(this.f15761g);
        parcel.writeInt(this.f15762h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f15763j ? 1 : 0);
        parcel.writeInt(this.f15764k ? 1 : 0);
        parcel.writeInt(this.f15765l);
        parcel.writeString(this.f15766m);
        parcel.writeInt(this.f15767n);
        parcel.writeInt(this.f15768o ? 1 : 0);
    }

    public E(Parcel parcel) {
        this.f15756b = parcel.readString();
        this.f15757c = parcel.readString();
        this.f15758d = parcel.readInt() != 0;
        this.f15759e = parcel.readInt();
        this.f15760f = parcel.readInt();
        this.f15761g = parcel.readString();
        this.f15762h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f15763j = parcel.readInt() != 0;
        this.f15764k = parcel.readInt() != 0;
        this.f15765l = parcel.readInt();
        this.f15766m = parcel.readString();
        this.f15767n = parcel.readInt();
        this.f15768o = parcel.readInt() != 0;
    }
}
