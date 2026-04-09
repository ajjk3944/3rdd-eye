package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final CheckedTextView f4618a;

    /* renamed from: d, reason: collision with root package name */
    public final CheckedTextView f4619d;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f4620g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4621r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4622x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4623y;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        this.f4620g = new SparseArray();
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        e0 e0Var = new e0(0, this);
        getResources().getClass();
        TrackGroupArray trackGroupArray = TrackGroupArray.f4456r;
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f4618a = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(s.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(e0Var);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(r.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f4619d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(s.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(e0Var);
        addView(checkedTextView2);
    }

    public final void a() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 3) {
                this.f4618a.setEnabled(false);
                this.f4619d.setEnabled(false);
                return;
            }
            removeViewAt(childCount);
        }
    }

    public boolean getIsDisabled() {
        return this.f4623y;
    }

    public List<DefaultTrackSelector.SelectionOverride> getOverrides() {
        SparseArray sparseArray = this.f4620g;
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            arrayList.add((DefaultTrackSelector.SelectionOverride) sparseArray.valueAt(i10));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f4621r != z10) {
            this.f4621r = z10;
            a();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f4622x != z10) {
            this.f4622x = z10;
            if (!z10) {
                SparseArray sparseArray = this.f4620g;
                if (sparseArray.size() > 1) {
                    for (int size = sparseArray.size() - 1; size > 0; size--) {
                        sparseArray.remove(size);
                    }
                }
            }
            a();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f4618a.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(d0 d0Var) {
        d0Var.getClass();
        a();
    }
}
