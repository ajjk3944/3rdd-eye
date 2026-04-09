package com.google.android.material.timepicker;

import O3.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: A, reason: collision with root package name */
    private final ClockFaceView f37946A;

    /* renamed from: B, reason: collision with root package name */
    private final MaterialButtonToggleGroup f37947B;

    /* renamed from: C, reason: collision with root package name */
    private final View.OnClickListener f37948C;

    /* renamed from: x, reason: collision with root package name */
    private final Chip f37949x;

    /* renamed from: y, reason: collision with root package name */
    private final Chip f37950y;

    /* renamed from: z, reason: collision with root package name */
    private final ClockHandView f37951z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.u(TimePickerView.this);
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.v(TimePickerView.this);
            return false;
        }
    }

    class c implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ GestureDetector f37954a;

        c(GestureDetector gestureDetector) {
            this.f37954a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f37954a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ e u(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d v(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
    }

    private void x() {
        Chip chip = this.f37949x;
        int i10 = O3.e.f17059E;
        chip.setTag(i10, 12);
        this.f37950y.setTag(i10, 10);
        this.f37949x.setOnClickListener(this.f37948C);
        this.f37950y.setOnClickListener(this.f37948C);
        this.f37949x.setAccessibilityClassName("android.view.View");
        this.f37950y.setAccessibilityClassName("android.view.View");
    }

    private void y() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f37949x.setOnTouchListener(cVar);
        this.f37950y.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f37950y.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37948C = new a();
        LayoutInflater.from(context).inflate(g.f17106i, this);
        this.f37946A = (ClockFaceView) findViewById(O3.e.f17079i);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(O3.e.f17082l);
        this.f37947B = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                this.f37969a.w(materialButtonToggleGroup2, i11, z10);
            }
        });
        this.f37949x = (Chip) findViewById(O3.e.f17085o);
        this.f37950y = (Chip) findViewById(O3.e.f17083m);
        this.f37951z = (ClockHandView) findViewById(O3.e.f17080j);
        y();
        x();
    }
}
