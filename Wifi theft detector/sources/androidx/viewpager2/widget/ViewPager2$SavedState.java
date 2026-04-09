package androidx.viewpager2.widget;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
class ViewPager2$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<ViewPager2$SavedState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f4271a;

    /* renamed from: b, reason: collision with root package name */
    public int f4272b;

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f4273c;

    public class a implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ViewPager2$SavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ViewPager2$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return Build.VERSION.SDK_INT >= 24 ? new ViewPager2$SavedState(parcel, classLoader) : new ViewPager2$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public ViewPager2$SavedState[] newArray(int i10) {
            return new ViewPager2$SavedState[i10];
        }
    }

    public ViewPager2$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        c(parcel, classLoader);
    }

    public final void c(Parcel parcel, ClassLoader classLoader) {
        this.f4271a = parcel.readInt();
        this.f4272b = parcel.readInt();
        this.f4273c = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f4271a);
        parcel.writeInt(this.f4272b);
        parcel.writeParcelable(this.f4273c, i10);
    }

    public ViewPager2$SavedState(Parcel parcel) {
        super(parcel);
        c(parcel, null);
    }
}
