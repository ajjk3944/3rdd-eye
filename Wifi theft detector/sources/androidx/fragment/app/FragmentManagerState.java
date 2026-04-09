package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3184a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3185b;

    /* renamed from: c, reason: collision with root package name */
    public BackStackRecordState[] f3186c;

    /* renamed from: d, reason: collision with root package name */
    public int f3187d;

    /* renamed from: e, reason: collision with root package name */
    public String f3188e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f3189f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3190g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f3191h;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
        this.f3188e = null;
        this.f3189f = new ArrayList();
        this.f3190g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f3184a);
        parcel.writeStringList(this.f3185b);
        parcel.writeTypedArray(this.f3186c, i10);
        parcel.writeInt(this.f3187d);
        parcel.writeString(this.f3188e);
        parcel.writeStringList(this.f3189f);
        parcel.writeTypedList(this.f3190g);
        parcel.writeTypedList(this.f3191h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3188e = null;
        this.f3189f = new ArrayList();
        this.f3190g = new ArrayList();
        this.f3184a = parcel.createStringArrayList();
        this.f3185b = parcel.createStringArrayList();
        this.f3186c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f3187d = parcel.readInt();
        this.f3188e = parcel.readString();
        this.f3189f = parcel.createStringArrayList();
        this.f3190g = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f3191h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
