package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f3192a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3193b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3194c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3195d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3196e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3197f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3198g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3199h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3200i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f3201j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3202k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3203l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f3204m;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f3192a = fragment.getClass().getName();
        this.f3193b = fragment.mWho;
        this.f3194c = fragment.mFromLayout;
        this.f3195d = fragment.mFragmentId;
        this.f3196e = fragment.mContainerId;
        this.f3197f = fragment.mTag;
        this.f3198g = fragment.mRetainInstance;
        this.f3199h = fragment.mRemoving;
        this.f3200i = fragment.mDetached;
        this.f3201j = fragment.mArguments;
        this.f3202k = fragment.mHidden;
        this.f3203l = fragment.mMaxState.ordinal();
    }

    public Fragment c(k kVar, ClassLoader classLoader) {
        Fragment fragmentA = kVar.a(classLoader, this.f3192a);
        Bundle bundle = this.f3201j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentA.setArguments(this.f3201j);
        fragmentA.mWho = this.f3193b;
        fragmentA.mFromLayout = this.f3194c;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = this.f3195d;
        fragmentA.mContainerId = this.f3196e;
        fragmentA.mTag = this.f3197f;
        fragmentA.mRetainInstance = this.f3198g;
        fragmentA.mRemoving = this.f3199h;
        fragmentA.mDetached = this.f3200i;
        fragmentA.mHidden = this.f3202k;
        fragmentA.mMaxState = Lifecycle.State.values()[this.f3203l];
        Bundle bundle2 = this.f3204m;
        if (bundle2 != null) {
            fragmentA.mSavedFragmentState = bundle2;
            return fragmentA;
        }
        fragmentA.mSavedFragmentState = new Bundle();
        return fragmentA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3192a);
        sb.append(" (");
        sb.append(this.f3193b);
        sb.append(")}:");
        if (this.f3194c) {
            sb.append(" fromLayout");
        }
        if (this.f3196e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3196e));
        }
        String str = this.f3197f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3197f);
        }
        if (this.f3198g) {
            sb.append(" retainInstance");
        }
        if (this.f3199h) {
            sb.append(" removing");
        }
        if (this.f3200i) {
            sb.append(" detached");
        }
        if (this.f3202k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3192a);
        parcel.writeString(this.f3193b);
        parcel.writeInt(this.f3194c ? 1 : 0);
        parcel.writeInt(this.f3195d);
        parcel.writeInt(this.f3196e);
        parcel.writeString(this.f3197f);
        parcel.writeInt(this.f3198g ? 1 : 0);
        parcel.writeInt(this.f3199h ? 1 : 0);
        parcel.writeInt(this.f3200i ? 1 : 0);
        parcel.writeBundle(this.f3201j);
        parcel.writeInt(this.f3202k ? 1 : 0);
        parcel.writeBundle(this.f3204m);
        parcel.writeInt(this.f3203l);
    }

    public FragmentState(Parcel parcel) {
        this.f3192a = parcel.readString();
        this.f3193b = parcel.readString();
        this.f3194c = parcel.readInt() != 0;
        this.f3195d = parcel.readInt();
        this.f3196e = parcel.readInt();
        this.f3197f = parcel.readString();
        this.f3198g = parcel.readInt() != 0;
        this.f3199h = parcel.readInt() != 0;
        this.f3200i = parcel.readInt() != 0;
        this.f3201j = parcel.readBundle();
        this.f3202k = parcel.readInt() != 0;
        this.f3204m = parcel.readBundle();
        this.f3203l = parcel.readInt();
    }
}
