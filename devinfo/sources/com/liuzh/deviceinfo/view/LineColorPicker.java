package com.liuzh.deviceinfo.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.utilities.d;
import ki.c;
import zf.h;
import zh.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class LineColorPicker extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f21337a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f21338b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f21339c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21340d;

    /* renamed from: e, reason: collision with root package name */
    public int f21341e;

    /* renamed from: f, reason: collision with root package name */
    public int f21342f;
    public c g;

    /* renamed from: h, reason: collision with root package name */
    public int f21343h;

    /* renamed from: i, reason: collision with root package name */
    public final int f21344i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f21345k;

    /* renamed from: l, reason: collision with root package name */
    public int f21346l;

    public LineColorPicker(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet);
        if (isInEditMode()) {
            this.f21337a = f.f38293a;
        } else {
            this.f21337a = new int[1];
        }
        this.f21339c = new Rect();
        this.f21340d = false;
        this.f21341e = this.f21337a[0];
        this.f21342f = 0;
        this.f21344i = 0;
        this.j = false;
        Paint paint = new Paint();
        this.f21338b = paint;
        paint.setStyle(Paint.Style.FILL);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h.f38275c, 0, 0);
        try {
            this.f21344i = typedArrayObtainStyledAttributes.getInteger(1, 0);
            if (!isInEditMode() && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1)) > 0) {
                setColors(context.getResources().getIntArray(resourceId));
            }
            int integer = typedArrayObtainStyledAttributes.getInteger(2, -1);
            if (integer != -1) {
                int[] colors = getColors();
                if (integer < (colors != null ? colors.length : 0)) {
                    setSelectedColorPosition(integer);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final int a(float f10, float f11) {
        int i4 = 0;
        if (this.f21344i == 0) {
            int[] iArr = this.f21337a;
            int length = iArr.length;
            int i10 = 0;
            while (i4 < length) {
                int i11 = iArr[i4];
                int i12 = this.f21343h + i10;
                if (i10 <= f10 && i12 >= f10) {
                    return i11;
                }
                i4++;
                i10 = i12;
            }
        } else {
            int[] iArr2 = this.f21337a;
            int length2 = iArr2.length;
            int i13 = 0;
            while (i4 < length2) {
                int i14 = iArr2[i4];
                int i15 = this.f21343h + i13;
                if (f11 >= i13 && f11 <= i15) {
                    return i14;
                }
                i4++;
                i13 = i15;
            }
        }
        return this.f21341e;
    }

    public final void b() {
        if (this.f21344i == 0) {
            this.f21343h = Math.round(this.f21345k / (this.f21337a.length * 1.0f));
        } else {
            this.f21343h = Math.round(this.f21346l / (this.f21337a.length * 1.0f));
        }
    }

    public int getColor() {
        return this.f21341e;
    }

    public int[] getColors() {
        return this.f21337a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i4 = this.f21344i;
        Rect rect = this.f21339c;
        Paint paint = this.f21338b;
        if (i4 == 0) {
            rect.left = 0;
            rect.top = 0;
            rect.right = 0;
            rect.bottom = canvas.getHeight();
            int iRound = Math.round(canvas.getHeight() * 0.08f);
            for (int i10 : this.f21337a) {
                paint.setColor(i10);
                int i11 = rect.right;
                rect.left = i11;
                rect.right = i11 + this.f21343h;
                if (this.f21340d && i10 == this.f21341e) {
                    rect.top = 0;
                    rect.bottom = canvas.getHeight();
                } else {
                    rect.top = iRound;
                    rect.bottom = canvas.getHeight() - iRound;
                }
                canvas.drawRect(rect, paint);
            }
            return;
        }
        rect.left = 0;
        rect.top = 0;
        rect.right = canvas.getWidth();
        rect.bottom = 0;
        int iRound2 = Math.round(canvas.getWidth() * 0.08f);
        for (int i12 : this.f21337a) {
            paint.setColor(i12);
            int i13 = rect.bottom;
            rect.top = i13;
            rect.bottom = i13 + this.f21343h;
            if (this.f21340d && i12 == this.f21341e) {
                rect.left = 0;
                rect.right = canvas.getWidth();
            } else {
                rect.left = iRound2;
                rect.right = canvas.getWidth() - iRound2;
            }
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        int i10 = this.f21342f;
        if (i4 != 21) {
            if (i4 != 22) {
                if (i4 != 69) {
                    if (i4 != 81) {
                        return super.onKeyDown(i4, keyEvent);
                    }
                }
            }
            boolean z3 = d.f21252a;
            int i11 = DeviceInfoApp.f21145f.getResources().getConfiguration().getLayoutDirection() == 128 ? i10 - 1 : i10 + 1;
            if (i11 >= this.f21337a.length) {
                return false;
            }
            setSelectedColorPosition(i11);
            return true;
        }
        boolean z10 = d.f21252a;
        int i12 = DeviceInfoApp.f21145f.getResources().getConfiguration().getLayoutDirection() == 128 ? i10 + 1 : i10 - 1;
        if (i12 < 0) {
            return false;
        }
        setSelectedColorPosition(i12);
        return true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ki.d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ki.d dVar = (ki.d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f21341e = dVar.f28302a;
        this.f21342f = dVar.f28303b;
        this.f21340d = dVar.f28304c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ki.d dVar = new ki.d(super.onSaveInstanceState());
        dVar.f28302a = this.f21341e;
        dVar.f28303b = this.f21342f;
        dVar.f28304c = this.f21340d;
        return dVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        this.f21345k = i4;
        this.f21346l = i10;
        b();
        super.onSizeChanged(i4, i10, i11, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.j = true;
            return true;
        }
        if (action == 1) {
            setSelectedColor(a(motionEvent.getX(), motionEvent.getY()));
            if (this.j) {
                super.performClick();
            }
        } else {
            if (action == 2) {
                setSelectedColor(a(motionEvent.getX(), motionEvent.getY()));
                return true;
            }
            if (action == 3) {
                this.j = false;
                return true;
            }
            if (action == 4) {
                this.j = false;
                return true;
            }
        }
        return true;
    }

    public void setColors(int[] iArr) {
        this.f21337a = iArr;
        int i4 = this.f21341e;
        int i10 = 0;
        while (true) {
            if (i10 >= iArr.length) {
                i10 = -1;
                break;
            } else if (iArr[i10] == i4) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            this.f21341e = iArr[0];
        }
        b();
        invalidate();
    }

    public void setOnColorChangedListener(c cVar) {
        this.g = cVar;
    }

    public void setSelectedColor(int i4) {
        int[] iArr = this.f21337a;
        int i10 = 0;
        while (true) {
            if (i10 >= iArr.length) {
                i10 = -1;
                break;
            } else if (iArr[i10] == i4) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        if (this.f21340d && this.f21341e == i4) {
            return;
        }
        this.f21341e = i4;
        this.f21342f = i10;
        this.f21340d = true;
        invalidate();
        c cVar = this.g;
        if (cVar != null) {
            cVar.b(i4);
        }
    }

    public void setSelectedColorPosition(int i4) {
        this.f21342f = i4;
        setSelectedColor(this.f21337a[i4]);
    }
}
