package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.List;
import s0.x;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.n implements RecyclerView.x.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    int mOrientation;
    i mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f3646a;

        /* renamed from: b, reason: collision with root package name */
        public int f3647b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3648c;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public boolean c() {
            return this.f3646a >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void e() {
            this.f3646a = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3646a);
            parcel.writeInt(this.f3647b);
            parcel.writeInt(this.f3648c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f3646a = parcel.readInt();
            this.f3647b = parcel.readInt();
            this.f3648c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f3646a = savedState.f3646a;
            this.f3647b = savedState.f3647b;
            this.f3648c = savedState.f3648c;
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public i f3649a;

        /* renamed from: b, reason: collision with root package name */
        public int f3650b;

        /* renamed from: c, reason: collision with root package name */
        public int f3651c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3652d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f3653e;

        public a() {
            e();
        }

        public void a() {
            this.f3651c = this.f3652d ? this.f3649a.i() : this.f3649a.n();
        }

        public void b(View view, int i10) {
            if (this.f3652d) {
                this.f3651c = this.f3649a.d(view) + this.f3649a.p();
            } else {
                this.f3651c = this.f3649a.g(view);
            }
            this.f3650b = i10;
        }

        public void c(View view, int i10) {
            int iP = this.f3649a.p();
            if (iP >= 0) {
                b(view, i10);
                return;
            }
            this.f3650b = i10;
            if (this.f3652d) {
                int i11 = (this.f3649a.i() - iP) - this.f3649a.d(view);
                this.f3651c = this.f3649a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f3651c - this.f3649a.e(view);
                    int iN = this.f3649a.n();
                    int iMin = iE - (iN + Math.min(this.f3649a.g(view) - iN, 0));
                    if (iMin < 0) {
                        this.f3651c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f3649a.g(view);
            int iN2 = iG - this.f3649a.n();
            this.f3651c = iG;
            if (iN2 > 0) {
                int i12 = (this.f3649a.i() - Math.min(0, (this.f3649a.i() - iP) - this.f3649a.d(view))) - (iG + this.f3649a.e(view));
                if (i12 < 0) {
                    this.f3651c -= Math.min(iN2, -i12);
                }
            }
        }

        public boolean d(View view, RecyclerView.y yVar) {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            return !oVar.c() && oVar.a() >= 0 && oVar.a() < yVar.b();
        }

        public void e() {
            this.f3650b = -1;
            this.f3651c = Integer.MIN_VALUE;
            this.f3652d = false;
            this.f3653e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3650b + ", mCoordinate=" + this.f3651c + ", mLayoutFromEnd=" + this.f3652d + ", mValid=" + this.f3653e + '}';
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f3654a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3655b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3656c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3657d;

        public void a() {
            this.f3654a = 0;
            this.f3655b = false;
            this.f3656c = false;
            this.f3657d = false;
        }
    }

    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public int f3659b;

        /* renamed from: c, reason: collision with root package name */
        public int f3660c;

        /* renamed from: d, reason: collision with root package name */
        public int f3661d;

        /* renamed from: e, reason: collision with root package name */
        public int f3662e;

        /* renamed from: f, reason: collision with root package name */
        public int f3663f;

        /* renamed from: g, reason: collision with root package name */
        public int f3664g;

        /* renamed from: k, reason: collision with root package name */
        public int f3668k;

        /* renamed from: m, reason: collision with root package name */
        public boolean f3670m;

        /* renamed from: a, reason: collision with root package name */
        public boolean f3658a = true;

        /* renamed from: h, reason: collision with root package name */
        public int f3665h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f3666i = 0;

        /* renamed from: j, reason: collision with root package name */
        public boolean f3667j = false;

        /* renamed from: l, reason: collision with root package name */
        public List f3669l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f3661d = -1;
            } else {
                this.f3661d = ((RecyclerView.o) viewF.getLayoutParams()).a();
            }
        }

        public boolean c(RecyclerView.y yVar) {
            int i10 = this.f3661d;
            return i10 >= 0 && i10 < yVar.b();
        }

        public View d(RecyclerView.u uVar) {
            if (this.f3669l != null) {
                return e();
            }
            View viewO = uVar.o(this.f3661d);
            this.f3661d += this.f3662e;
            return viewO;
        }

        public final View e() {
            int size = this.f3669l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.c0) this.f3669l.get(i10)).itemView;
                RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
                if (!oVar.c() && this.f3661d == oVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int iA;
            int size = this.f3669l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.c0) this.f3669l.get(i11)).itemView;
                RecyclerView.o oVar = (RecyclerView.o) view3.getLayoutParams();
                if (view3 != view && !oVar.c() && (iA = (oVar.a() - this.f3661d) * this.f3662e) >= 0 && iA < i10) {
                    if (iA == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = iA;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private View t() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View u() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    public final void A(RecyclerView.u uVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (this.mOrientationHelper.d(childAt) > i12 || this.mOrientationHelper.q(childAt) > i12) {
                    y(uVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = childCount - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View childAt2 = getChildAt(i15);
            if (this.mOrientationHelper.d(childAt2) > i12 || this.mOrientationHelper.q(childAt2) > i12) {
                y(uVar, i14, i15);
                return;
            }
        }
    }

    public final void B() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public final boolean C(RecyclerView.u uVar, RecyclerView.y yVar, a aVar) {
        View viewFindReferenceChild;
        boolean z10 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.d(focusedChild, yVar)) {
            aVar.c(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z11 = this.mLastStackFromEnd;
        boolean z12 = this.mStackFromEnd;
        if (z11 != z12 || (viewFindReferenceChild = findReferenceChild(uVar, yVar, aVar.f3652d, z12)) == null) {
            return false;
        }
        aVar.b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
        if (!yVar.e() && supportsPredictiveItemAnimations()) {
            int iG = this.mOrientationHelper.g(viewFindReferenceChild);
            int iD = this.mOrientationHelper.d(viewFindReferenceChild);
            int iN = this.mOrientationHelper.n();
            int i10 = this.mOrientationHelper.i();
            boolean z13 = iD <= iN && iG < iN;
            if (iG >= i10 && iD > i10) {
                z10 = true;
            }
            if (z13 || z10) {
                if (aVar.f3652d) {
                    iN = i10;
                }
                aVar.f3651c = iN;
            }
        }
        return true;
    }

    public final boolean D(RecyclerView.y yVar, a aVar) {
        int i10;
        if (!yVar.e() && (i10 = this.mPendingScrollPosition) != -1) {
            if (i10 >= 0 && i10 < yVar.b()) {
                aVar.f3650b = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.c()) {
                    boolean z10 = this.mPendingSavedState.f3648c;
                    aVar.f3652d = z10;
                    if (z10) {
                        aVar.f3651c = this.mOrientationHelper.i() - this.mPendingSavedState.f3647b;
                    } else {
                        aVar.f3651c = this.mOrientationHelper.n() + this.mPendingSavedState.f3647b;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z11 = this.mShouldReverseLayout;
                    aVar.f3652d = z11;
                    if (z11) {
                        aVar.f3651c = this.mOrientationHelper.i() - this.mPendingScrollPositionOffset;
                    } else {
                        aVar.f3651c = this.mOrientationHelper.n() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        aVar.f3652d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    aVar.a();
                } else {
                    if (this.mOrientationHelper.e(viewFindViewByPosition) > this.mOrientationHelper.o()) {
                        aVar.a();
                        return true;
                    }
                    if (this.mOrientationHelper.g(viewFindViewByPosition) - this.mOrientationHelper.n() < 0) {
                        aVar.f3651c = this.mOrientationHelper.n();
                        aVar.f3652d = false;
                        return true;
                    }
                    if (this.mOrientationHelper.i() - this.mOrientationHelper.d(viewFindViewByPosition) < 0) {
                        aVar.f3651c = this.mOrientationHelper.i();
                        aVar.f3652d = true;
                        return true;
                    }
                    aVar.f3651c = aVar.f3652d ? this.mOrientationHelper.d(viewFindViewByPosition) + this.mOrientationHelper.p() : this.mOrientationHelper.g(viewFindViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void E(RecyclerView.u uVar, RecyclerView.y yVar, a aVar) {
        if (D(yVar, aVar) || C(uVar, yVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.f3650b = this.mStackFromEnd ? yVar.b() - 1 : 0;
    }

    public final void F(int i10, int i11, boolean z10, RecyclerView.y yVar) {
        int iN;
        this.mLayoutState.f3670m = resolveIsInfinite();
        this.mLayoutState.f3663f = i10;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(yVar, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z11 = i10 == 1;
        c cVar = this.mLayoutState;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f3665h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f3666i = iMax;
        if (z11) {
            cVar.f3665h = i12 + this.mOrientationHelper.j();
            View viewT = t();
            c cVar2 = this.mLayoutState;
            cVar2.f3662e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(viewT);
            c cVar3 = this.mLayoutState;
            cVar2.f3661d = position + cVar3.f3662e;
            cVar3.f3659b = this.mOrientationHelper.d(viewT);
            iN = this.mOrientationHelper.d(viewT) - this.mOrientationHelper.i();
        } else {
            View viewU = u();
            this.mLayoutState.f3665h += this.mOrientationHelper.n();
            c cVar4 = this.mLayoutState;
            cVar4.f3662e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(viewU);
            c cVar5 = this.mLayoutState;
            cVar4.f3661d = position2 + cVar5.f3662e;
            cVar5.f3659b = this.mOrientationHelper.g(viewU);
            iN = (-this.mOrientationHelper.g(viewU)) + this.mOrientationHelper.n();
        }
        c cVar6 = this.mLayoutState;
        cVar6.f3660c = i11;
        if (z10) {
            cVar6.f3660c = i11 - iN;
        }
        cVar6.f3664g = iN;
    }

    public final void G(int i10, int i11) {
        this.mLayoutState.f3660c = this.mOrientationHelper.i() - i11;
        c cVar = this.mLayoutState;
        cVar.f3662e = this.mShouldReverseLayout ? -1 : 1;
        cVar.f3661d = i10;
        cVar.f3663f = 1;
        cVar.f3659b = i11;
        cVar.f3664g = Integer.MIN_VALUE;
    }

    public final void H(a aVar) {
        G(aVar.f3650b, aVar.f3651c);
    }

    public final void I(int i10, int i11) {
        this.mLayoutState.f3660c = i11 - this.mOrientationHelper.n();
        c cVar = this.mLayoutState;
        cVar.f3661d = i10;
        cVar.f3662e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f3663f = -1;
        cVar.f3659b = i11;
        cVar.f3664g = Integer.MIN_VALUE;
    }

    public final void J(a aVar) {
        I(aVar.f3650b, aVar.f3651c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(RecyclerView.y yVar, int[] iArr) {
        int i10;
        int extraLayoutSpace = getExtraLayoutSpace(yVar);
        if (this.mLayoutState.f3663f == -1) {
            i10 = 0;
        } else {
            i10 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.y yVar, RecyclerView.n.c cVar) {
        if (this.mOrientation != 0) {
            i10 = i11;
        }
        if (getChildCount() == 0 || i10 == 0) {
            return;
        }
        ensureLayoutState();
        F(i10 > 0 ? 1 : -1, Math.abs(i10), true, yVar);
        collectPrefetchPositionsForLayoutState(yVar, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i10, RecyclerView.n.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || !savedState.c()) {
            B();
            z10 = this.mShouldReverseLayout;
            i11 = this.mPendingScrollPosition;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.mPendingSavedState;
            z10 = savedState2.f3648c;
            i11 = savedState2.f3646a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.mInitialPrefetchItemCount && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.y yVar, c cVar, RecyclerView.n.c cVar2) {
        int i10 = cVar.f3661d;
        if (i10 < 0 || i10 >= yVar.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f3664g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.y yVar) {
        return k(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        return l(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.y yVar) {
        return m(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        int i11 = (i10 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.y yVar) {
        return k(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.y yVar) {
        return l(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.y yVar) {
        return m(yVar);
    }

    public int convertFocusDirectionToLayoutDirection(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public c createLayoutState() {
        return new c();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.u uVar, c cVar, RecyclerView.y yVar, boolean z10) {
        int i10 = cVar.f3660c;
        int i11 = cVar.f3664g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f3664g = i11 + i10;
            }
            x(uVar, cVar);
        }
        int i12 = cVar.f3660c + cVar.f3665h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f3670m && i12 <= 0) || !cVar.c(yVar)) {
                break;
            }
            bVar.a();
            layoutChunk(uVar, yVar, cVar, bVar);
            if (!bVar.f3655b) {
                cVar.f3659b += bVar.f3654a * cVar.f3663f;
                if (!bVar.f3656c || cVar.f3669l != null || !yVar.e()) {
                    int i13 = cVar.f3660c;
                    int i14 = bVar.f3654a;
                    cVar.f3660c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f3664g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f3654a;
                    cVar.f3664g = i16;
                    int i17 = cVar.f3660c;
                    if (i17 < 0) {
                        cVar.f3664g = i16 + i17;
                    }
                    x(uVar, cVar);
                }
                if (z10 && bVar.f3657d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f3660c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z10, boolean z11) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z10, z11) : findOneVisibleChild(getChildCount() - 1, -1, z10, z11);
    }

    public View findFirstVisibleChildClosestToStart(boolean z10, boolean z11) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z10, z11) : findOneVisibleChild(0, getChildCount(), z10, z11);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i10, int i11) {
        int i12;
        int i13;
        ensureLayoutState();
        if (i11 <= i10 && i11 >= i10) {
            return getChildAt(i10);
        }
        if (this.mOrientationHelper.g(getChildAt(i10)) < this.mOrientationHelper.n()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i10, i11, i12, i13) : this.mVerticalBoundCheck.a(i10, i11, i12, i13);
    }

    public View findOneVisibleChild(int i10, int i11, boolean z10, boolean z11) {
        ensureLayoutState();
        int i12 = Sdk$SDKError.Reason.WEBVIEW_ERROR_VALUE;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i10, i11, i13, i12) : this.mVerticalBoundCheck.a(i10, i11, i13, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View findReferenceChild(androidx.recyclerview.widget.RecyclerView.u r17, androidx.recyclerview.widget.RecyclerView.y r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.ensureLayoutState()
            int r1 = r0.getChildCount()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.getChildCount()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.i r7 = r0.mOrientationHelper
            int r7 = r7.n()
            androidx.recyclerview.widget.i r8 = r0.mOrientationHelper
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.getChildAt(r1)
            int r13 = r0.getPosition(r12)
            androidx.recyclerview.widget.i r14 = r0.mOrientationHelper
            int r14 = r14.g(r12)
            androidx.recyclerview.widget.i r15 = r0.mOrientationHelper
            int r15 = r15.d(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$o r13 = (androidx.recyclerview.widget.RecyclerView.o) r13
            boolean r13 = r13.c()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r3
            goto L5c
        L5b:
            r13 = r2
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r3
            goto L63
        L62:
            r14 = r2
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.findReferenceChild(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i10 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i10) {
                return childAt;
            }
        }
        return super.findViewByPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.o generateDefaultLayoutParams() {
        return new RecyclerView.o(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.y yVar) {
        if (yVar.d()) {
            return this.mOrientationHelper.o();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean isLayoutReversed() {
        return this.mReverseLayout;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public final int k(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return l.a(yVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public final int l(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return l.b(yVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void layoutChunk(RecyclerView.u uVar, RecyclerView.y yVar, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int paddingLeft;
        int iF;
        int i14;
        int i15;
        View viewD = cVar.d(uVar);
        if (viewD == null) {
            bVar.f3655b = true;
            return;
        }
        RecyclerView.o oVar = (RecyclerView.o) viewD.getLayoutParams();
        if (cVar.f3669l == null) {
            if (this.mShouldReverseLayout == (cVar.f3663f == -1)) {
                addView(viewD);
            } else {
                addView(viewD, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f3663f == -1)) {
                addDisappearingView(viewD);
            } else {
                addDisappearingView(viewD, 0);
            }
        }
        measureChildWithMargins(viewD, 0, 0);
        bVar.f3654a = this.mOrientationHelper.e(viewD);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iF = getWidth() - getPaddingRight();
                paddingLeft = iF - this.mOrientationHelper.f(viewD);
            } else {
                paddingLeft = getPaddingLeft();
                iF = this.mOrientationHelper.f(viewD) + paddingLeft;
            }
            if (cVar.f3663f == -1) {
                i15 = cVar.f3659b;
                i14 = i15 - bVar.f3654a;
            } else {
                i14 = cVar.f3659b;
                i15 = bVar.f3654a + i14;
            }
            int i16 = paddingLeft;
            i13 = i14;
            i12 = i16;
            i11 = i15;
            i10 = iF;
        } else {
            int paddingTop = getPaddingTop();
            int iF2 = this.mOrientationHelper.f(viewD) + paddingTop;
            if (cVar.f3663f == -1) {
                int i17 = cVar.f3659b;
                i12 = i17 - bVar.f3654a;
                i10 = i17;
                i11 = iF2;
            } else {
                int i18 = cVar.f3659b;
                i10 = bVar.f3654a + i18;
                i11 = iF2;
                i12 = i18;
            }
            i13 = paddingTop;
        }
        layoutDecoratedWithMargins(viewD, i12, i13, i10, i11);
        if (oVar.c() || oVar.b()) {
            bVar.f3656c = true;
        }
        bVar.f3657d = viewD.hasFocusable();
    }

    public final int m(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return l.c(yVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public final View n() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    public final View o() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    public void onAnchorReady(RecyclerView.u uVar, RecyclerView.y yVar, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.onDetachedFromWindow(recyclerView, uVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(uVar);
            uVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i10, RecyclerView.u uVar, RecyclerView.y yVar) {
        int iConvertFocusDirectionToLayoutDirection;
        B();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        F(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.o() * MAX_SCROLL_FACTOR), false, yVar);
        c cVar = this.mLayoutState;
        cVar.f3664g = Integer.MIN_VALUE;
        cVar.f3658a = false;
        fill(uVar, cVar, yVar, true);
        View viewQ = iConvertFocusDirectionToLayoutDirection == -1 ? q() : p();
        View viewU = iConvertFocusDirectionToLayoutDirection == -1 ? u() : t();
        if (!viewU.hasFocusable()) {
            return viewQ;
        }
        if (viewQ == null) {
            return null;
        }
        return viewU;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.u uVar, @NonNull RecyclerView.y yVar, @NonNull x xVar) {
        super.onInitializeAccessibilityNodeInfo(uVar, yVar, xVar);
        RecyclerView.Adapter adapter = this.mRecyclerView.f3695m;
        if (adapter == null || adapter.getItemCount() <= 0) {
            return;
        }
        xVar.b(x.a.B);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.y yVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iR;
        int i14;
        View viewFindViewByPosition;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && yVar.b() == 0) {
            removeAndRecycleAllViews(uVar);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.c()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f3646a;
        }
        ensureLayoutState();
        this.mLayoutState.f3658a = false;
        B();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (!aVar.f3653e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            aVar.e();
            a aVar2 = this.mAnchorInfo;
            aVar2.f3652d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            E(uVar, yVar, aVar2);
            this.mAnchorInfo.f3653e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.g(focusedChild) >= this.mOrientationHelper.i() || this.mOrientationHelper.d(focusedChild) <= this.mOrientationHelper.n())) {
            this.mAnchorInfo.c(focusedChild, getPosition(focusedChild));
        }
        c cVar = this.mLayoutState;
        cVar.f3663f = cVar.f3668k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(yVar, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.n();
        int iMax2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.j();
        if (yVar.e() && (i14 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i14)) != null) {
            if (this.mShouldReverseLayout) {
                i15 = this.mOrientationHelper.i() - this.mOrientationHelper.d(viewFindViewByPosition);
                iG = this.mPendingScrollPositionOffset;
            } else {
                iG = this.mOrientationHelper.g(viewFindViewByPosition) - this.mOrientationHelper.n();
                i15 = this.mPendingScrollPositionOffset;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.mAnchorInfo;
        if (!aVar3.f3652d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i16 = 1;
        }
        onAnchorReady(uVar, yVar, aVar3, i16);
        detachAndScrapAttachedViews(uVar);
        this.mLayoutState.f3670m = resolveIsInfinite();
        this.mLayoutState.f3667j = yVar.e();
        this.mLayoutState.f3666i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.f3652d) {
            J(aVar4);
            c cVar2 = this.mLayoutState;
            cVar2.f3665h = iMax;
            fill(uVar, cVar2, yVar, false);
            c cVar3 = this.mLayoutState;
            i11 = cVar3.f3659b;
            int i18 = cVar3.f3661d;
            int i19 = cVar3.f3660c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            H(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.f3665h = iMax2;
            cVar4.f3661d += cVar4.f3662e;
            fill(uVar, cVar4, yVar, false);
            c cVar5 = this.mLayoutState;
            i10 = cVar5.f3659b;
            int i20 = cVar5.f3660c;
            if (i20 > 0) {
                I(i18, i11);
                c cVar6 = this.mLayoutState;
                cVar6.f3665h = i20;
                fill(uVar, cVar6, yVar, false);
                i11 = this.mLayoutState.f3659b;
            }
        } else {
            H(aVar4);
            c cVar7 = this.mLayoutState;
            cVar7.f3665h = iMax2;
            fill(uVar, cVar7, yVar, false);
            c cVar8 = this.mLayoutState;
            i10 = cVar8.f3659b;
            int i21 = cVar8.f3661d;
            int i22 = cVar8.f3660c;
            if (i22 > 0) {
                iMax += i22;
            }
            J(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.f3665h = iMax;
            cVar9.f3661d += cVar9.f3662e;
            fill(uVar, cVar9, yVar, false);
            c cVar10 = this.mLayoutState;
            i11 = cVar10.f3659b;
            int i23 = cVar10.f3660c;
            if (i23 > 0) {
                G(i21, i10);
                c cVar11 = this.mLayoutState;
                cVar11.f3665h = i23;
                fill(uVar, cVar11, yVar, false);
                i10 = this.mLayoutState.f3659b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iR2 = r(i10, uVar, yVar, true);
                i12 = i11 + iR2;
                i13 = i10 + iR2;
                iR = s(i12, uVar, yVar, false);
            } else {
                int iS = s(i11, uVar, yVar, true);
                i12 = i11 + iS;
                i13 = i10 + iS;
                iR = r(i13, uVar, yVar, false);
            }
            i11 = i12 + iR;
            i10 = i13 + iR;
        }
        v(uVar, yVar, i11, i10);
        if (yVar.e()) {
            this.mAnchorInfo.e();
        } else {
            this.mOrientationHelper.t();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.y yVar) {
        super.onLayoutCompleted(yVar);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.e();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() <= 0) {
            savedState.e();
            return savedState;
        }
        ensureLayoutState();
        boolean z10 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        savedState.f3648c = z10;
        if (z10) {
            View viewT = t();
            savedState.f3647b = this.mOrientationHelper.i() - this.mOrientationHelper.d(viewT);
            savedState.f3646a = getPosition(viewT);
            return savedState;
        }
        View viewU = u();
        savedState.f3646a = getPosition(viewU);
        savedState.f3647b = this.mOrientationHelper.g(viewU) - this.mOrientationHelper.n();
        return savedState;
    }

    public final View p() {
        return this.mShouldReverseLayout ? n() : o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean performAccessibilityAction(int i10, @Nullable Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (i10 == 16908343 && bundle != null) {
            if (this.mOrientation == 1) {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.mRecyclerView;
                iMin = Math.min(i11, getRowCountForAccessibility(recyclerView.f3675c, recyclerView.f3688i0) - 1);
            } else {
                int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i12 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.mRecyclerView;
                iMin = Math.min(i12, getColumnCountForAccessibility(recyclerView2.f3675c, recyclerView2.f3688i0) - 1);
            }
            if (iMin >= 0) {
                scrollToPositionWithOffset(iMin, 0);
                return true;
            }
        }
        return false;
    }

    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i10, int i11) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        B();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c10 = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c10 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - (this.mOrientationHelper.g(view2) + this.mOrientationHelper.e(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - this.mOrientationHelper.d(view2));
                return;
            }
        }
        if (c10 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.g(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.d(view2) - this.mOrientationHelper.e(view));
        }
    }

    public final View q() {
        return this.mShouldReverseLayout ? o() : n();
    }

    public final int r(int i10, RecyclerView.u uVar, RecyclerView.y yVar, boolean z10) {
        int i11;
        int i12 = this.mOrientationHelper.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -scrollBy(-i12, uVar, yVar);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.mOrientationHelper.i() - i14) <= 0) {
            return i13;
        }
        this.mOrientationHelper.s(i11);
        return i11 + i13;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.l() == 0 && this.mOrientationHelper.h() == 0;
    }

    public final int s(int i10, RecyclerView.u uVar, RecyclerView.y yVar, boolean z10) {
        int iN;
        int iN2 = i10 - this.mOrientationHelper.n();
        if (iN2 <= 0) {
            return 0;
        }
        int i11 = -scrollBy(iN2, uVar, yVar);
        int i12 = i10 + i11;
        if (!z10 || (iN = i12 - this.mOrientationHelper.n()) <= 0) {
            return i11;
        }
        this.mOrientationHelper.s(-iN);
        return i11 - iN;
    }

    public int scrollBy(int i10, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f3658a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        F(i11, iAbs, true, yVar);
        c cVar = this.mLayoutState;
        int iFill = cVar.f3664g + fill(uVar, cVar, yVar, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i10 = i11 * iFill;
        }
        this.mOrientationHelper.s(-i10);
        this.mLayoutState.f3668k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i10, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i10, uVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void scrollToPosition(int i10) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.e();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i10, int i11) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = i11;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.e();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i10, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i10, uVar, yVar);
    }

    public void setInitialPrefetchItemCount(int i10) {
        this.mInitialPrefetchItemCount = i10;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        assertNotInLayoutOrScroll(null);
        if (i10 != this.mOrientation || this.mOrientationHelper == null) {
            i iVarB = i.b(this, i10);
            this.mOrientationHelper = iVarB;
            this.mAnchorInfo.f3649a = iVarB;
            this.mOrientation = i10;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z10) {
        this.mRecycleChildrenOnDetach = z10;
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (z10 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z10;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z10) {
        this.mSmoothScrollbarEnabled = z10;
    }

    public void setStackFromEnd(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z10) {
            return;
        }
        this.mStackFromEnd = z10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.setTargetPosition(i10);
        startSmoothScroll(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public final void v(RecyclerView.u uVar, RecyclerView.y yVar, int i10, int i11) {
        if (!yVar.g() || getChildCount() == 0 || yVar.e() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List listK = uVar.k();
        int size = listK.size();
        int position = getPosition(getChildAt(0));
        int iE = 0;
        int iE2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.c0 c0Var = (RecyclerView.c0) listK.get(i12);
            if (!c0Var.isRemoved()) {
                if ((c0Var.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    iE += this.mOrientationHelper.e(c0Var.itemView);
                } else {
                    iE2 += this.mOrientationHelper.e(c0Var.itemView);
                }
            }
        }
        this.mLayoutState.f3669l = listK;
        if (iE > 0) {
            I(getPosition(u()), i10);
            c cVar = this.mLayoutState;
            cVar.f3665h = iE;
            cVar.f3660c = 0;
            cVar.a();
            fill(uVar, this.mLayoutState, yVar, false);
        }
        if (iE2 > 0) {
            G(getPosition(t()), i11);
            c cVar2 = this.mLayoutState;
            cVar2.f3665h = iE2;
            cVar2.f3660c = 0;
            cVar2.a();
            fill(uVar, this.mLayoutState, yVar, false);
        }
        this.mLayoutState.f3669l = null;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iG = this.mOrientationHelper.g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i10 = 1; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                int position2 = getPosition(childAt);
                int iG2 = this.mOrientationHelper.g(childAt);
                if (position2 < position) {
                    w();
                    StringBuilder sb = new StringBuilder();
                    sb.append("detected invalid position. loc invalid? ");
                    sb.append(iG2 < iG);
                    throw new RuntimeException(sb.toString());
                }
                if (iG2 > iG) {
                    w();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i11 = 1; i11 < getChildCount(); i11++) {
            View childAt2 = getChildAt(i11);
            int position3 = getPosition(childAt2);
            int iG3 = this.mOrientationHelper.g(childAt2);
            if (position3 < position) {
                w();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("detected invalid position. loc invalid? ");
                sb2.append(iG3 < iG);
                throw new RuntimeException(sb2.toString());
            }
            if (iG3 < iG) {
                w();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public final void w() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.g(childAt));
        }
        Log.d(TAG, "==============");
    }

    public final void x(RecyclerView.u uVar, c cVar) {
        if (!cVar.f3658a || cVar.f3670m) {
            return;
        }
        int i10 = cVar.f3664g;
        int i11 = cVar.f3666i;
        if (cVar.f3663f == -1) {
            z(uVar, i10, i11);
        } else {
            A(uVar, i10, i11);
        }
    }

    public final void y(RecyclerView.u uVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                removeAndRecycleViewAt(i10, uVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                removeAndRecycleViewAt(i12, uVar);
            }
        }
    }

    public final void z(RecyclerView.u uVar, int i10, int i11) {
        int childCount = getChildCount();
        if (i10 < 0) {
            return;
        }
        int iH = (this.mOrientationHelper.h() - i10) + i11;
        if (this.mShouldReverseLayout) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (this.mOrientationHelper.g(childAt) < iH || this.mOrientationHelper.r(childAt) < iH) {
                    y(uVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = childCount - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View childAt2 = getChildAt(i14);
            if (this.mOrientationHelper.g(childAt2) < iH || this.mOrientationHelper.r(childAt2) < iH) {
                y(uVar, i13, i14);
                return;
            }
        }
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i10);
        setReverseLayout(z10);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.n.d properties = RecyclerView.n.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.f3755a);
        setReverseLayout(properties.f3757c);
        setStackFromEnd(properties.f3758d);
    }
}
