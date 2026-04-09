package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1405a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1405a) {
            case 0:
                return new BackStackRecordState(parcel);
            case 1:
                return new BackStackState(parcel);
            case 2:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
                fragmentManager$LaunchedFragmentInfo.f1391a = parcel.readString();
                fragmentManager$LaunchedFragmentInfo.f1392d = parcel.readInt();
                return fragmentManager$LaunchedFragmentInfo;
            case 3:
                FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.f1397x = null;
                fragmentManagerState.f1398y = new ArrayList();
                fragmentManagerState.B = new ArrayList();
                fragmentManagerState.f1393a = parcel.createStringArrayList();
                fragmentManagerState.f1394d = parcel.createStringArrayList();
                fragmentManagerState.f1395g = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
                fragmentManagerState.f1396r = parcel.readInt();
                fragmentManagerState.f1397x = parcel.readString();
                fragmentManagerState.f1398y = parcel.createStringArrayList();
                fragmentManagerState.B = parcel.createTypedArrayList(BackStackState.CREATOR);
                fragmentManagerState.D = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
                return fragmentManagerState;
            default:
                return new FragmentState(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f1405a) {
            case 0:
                return new BackStackRecordState[i10];
            case 1:
                return new BackStackState[i10];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i10];
            case 3:
                return new FragmentManagerState[i10];
            default:
                return new FragmentState[i10];
        }
    }
}
