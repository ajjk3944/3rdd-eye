package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import j4.h;

/* loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {
    public final ClockHandView A;
    public final ClockFaceView B;
    public final MaterialButtonToggleGroup C;
    public final View.OnClickListener D;

    /* renamed from: y, reason: collision with root package name */
    public final Chip f11481y;

    /* renamed from: z, reason: collision with root package name */
    public final Chip f11482z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.C(TimePickerView.this);
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.D(TimePickerView.this);
            return false;
        }
    }

    public class c implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GestureDetector f11485a;

        public c(GestureDetector gestureDetector) {
            this.f11485a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f11485a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public interface d {
    }

    public interface e {
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ e C(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public static /* synthetic */ d D(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public final void E() {
        Chip chip = this.f11481y;
        int i10 = j4.f.selection_type;
        chip.setTag(i10, 12);
        this.f11482z.setTag(i10, 10);
        this.f11481y.setOnClickListener(this.D);
        this.f11482z.setOnClickListener(this.D);
        this.f11481y.setAccessibilityClassName("android.view.View");
        this.f11482z.setAccessibilityClassName("android.view.View");
    }

    public final void F() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f11481y.setOnTouchListener(cVar);
        this.f11482z.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f11482z.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.D = new a();
        LayoutInflater.from(context).inflate(h.material_timepicker, this);
        this.B = (ClockFaceView) findViewById(j4.f.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(j4.f.material_clock_period_toggle);
        this.C = materialButtonToggleGroup;
        materialButtonToggleGroup.q(new MaterialButtonToggleGroup.b() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.b
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                this.f11492a.getClass();
            }
        });
        this.f11481y = (Chip) findViewById(j4.f.material_minute_tv);
        this.f11482z = (Chip) findViewById(j4.f.material_hour_tv);
        this.A = (ClockHandView) findViewById(j4.f.material_clock_hand);
        F();
        E();
    }
}
