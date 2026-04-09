package ki;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import com.liuzh.deviceinfo.R;
import e4.m0;
import e4.v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vk.p;
import zj.q;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Path f28329a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f28330b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f28331c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f28332d;

    /* renamed from: e, reason: collision with root package name */
    public final float f28333e;

    /* renamed from: f, reason: collision with root package name */
    public long f28334f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public String f28335h;

    /* renamed from: i, reason: collision with root package name */
    public String f28336i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final float f28337k;

    /* renamed from: l, reason: collision with root package name */
    public final float f28338l;

    /* renamed from: m, reason: collision with root package name */
    public v3.b f28339m;

    public m(Context context) throws Resources.NotFoundException {
        super(context, null, 0, 0);
        this.f28329a = new Path();
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(com.liuzh.deviceinfo.utilities.d.p(4.0f, getResources().getDisplayMetrics()));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f28330b = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-1);
        paint2.setTextSize(com.liuzh.deviceinfo.utilities.d.q(15.0f, getResources().getDisplayMetrics()));
        this.f28331c = paint2;
        this.f28332d = new ArrayList();
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        this.f28333e = fontMetrics.bottom - fontMetrics.top;
        String string = getResources().getString(R.string.draw_something_to_measure);
        nk.k.d(string, "getString(...)");
        this.g = string;
        this.f28335h = "";
        this.f28336i = "";
        float fP = com.liuzh.deviceinfo.utilities.d.p(16.0f, getResources().getDisplayMetrics());
        this.f28337k = fP;
        this.f28338l = 2 * fP;
        setBackgroundColor(-16777216);
        ca.b bVar = new ca.b(29, this);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(this, bVar);
    }

    public static Integer a(String str) {
        int iIntValue;
        String str2;
        if (str != null && !vk.i.H0(str)) {
            Pattern patternCompile = Pattern.compile("(\\d{2,4})");
            nk.k.d(patternCompile, "compile(...)");
            Matcher matcher = patternCompile.matcher(str);
            nk.k.d(matcher, "matcher(...)");
            vk.f fVar = !matcher.find(0) ? null : new vk.f(matcher, str);
            Integer numX0 = (fVar == null || (str2 = (String) ((vk.d) fVar.a()).get(1)) == null) ? null : p.x0(str2);
            if (numX0 != null && 30 <= (iIntValue = numX0.intValue()) && iIntValue < 1001) {
                return Integer.valueOf(iIntValue);
            }
        }
        return null;
    }

    public final void b() throws Resources.NotFoundException {
        ArrayList arrayList = this.f28332d;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        nk.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            nk.k.d(next, "next(...)");
            float fFloatValue = ((Number) next).floatValue();
            if (1.0f <= fFloatValue && fFloatValue <= 32.0f) {
                arrayList2.add(Float.valueOf(fFloatValue));
            }
        }
        if (arrayList2.size() < 10) {
            String string = getResources().getString(R.string.draw_something_to_measure);
            nk.k.d(string, "getString(...)");
            this.g = string;
            this.f28335h = "";
            return;
        }
        q.U(arrayList2);
        int size = arrayList2.size();
        Object obj = arrayList2.get(size / 2);
        nk.k.d(obj, "get(...)");
        float fFloatValue2 = ((Number) obj).floatValue();
        Object obj2 = arrayList2.get(size / 4);
        nk.k.d(obj2, "get(...)");
        float fFloatValue3 = ((Number) obj2).floatValue();
        Object obj3 = arrayList2.get((size * 3) / 4);
        nk.k.d(obj3, "get(...)");
        float fFloatValue4 = ((Number) obj3).floatValue() - fFloatValue3;
        Locale locale = Locale.US;
        this.g = String.format(locale, "Sampling rate ≈ %.0f Hz", Arrays.copyOf(new Object[]{Float.valueOf(1000.0f / fFloatValue2)}, 1));
        this.f28335h = String.format(locale, "median %.2f ms  IQR %.2f ms  n=%d", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue4), Integer.valueOf(size)}, 3));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        nk.k.e(canvas, "canvas");
        canvas.drawPath(this.f28329a, this.f28330b);
        v3.b bVar = this.f28339m;
        float f10 = this.f28338l + (bVar != null ? bVar.f35794b : 0);
        float f11 = this.f28337k + (bVar != null ? bVar.f35793a : 0);
        String str = this.g;
        Paint paint = this.f28331c;
        canvas.drawText(str, f11, f10, paint);
        String str2 = this.f28335h;
        float f12 = this.f28333e;
        canvas.drawText(str2, f11, f10 + f12, paint);
        if (this.f28336i.length() > 0) {
            canvas.drawText(this.f28336i, f11, (2 * f12) + f10, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        nk.k.e(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f28332d;
        Path path = this.f28329a;
        if (actionMasked == 0) {
            path.reset();
            path.moveTo(motionEvent.getX(), motionEvent.getY());
            arrayList.clear();
            this.f28334f = motionEvent.getEventTime();
            int toolType = motionEvent.getToolType(0);
            String str = "Unknown";
            if (toolType != 0) {
                if (toolType == 1) {
                    str = "Finger";
                } else if (toolType == 2) {
                    str = "Stylus";
                } else if (toolType == 3) {
                    str = "Mouse";
                }
            }
            this.f28336i = "Tool: ".concat(str);
            if (!this.j) {
                this.j = true;
                new Thread(new ig.l(9, this)).start();
            }
            invalidate();
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int historySize = motionEvent.getHistorySize();
                for (int i4 = 0; i4 < historySize; i4++) {
                    float historicalX = motionEvent.getHistoricalX(0, i4);
                    float historicalY = motionEvent.getHistoricalY(0, i4);
                    long historicalEventTime = motionEvent.getHistoricalEventTime(i4);
                    path.lineTo(historicalX, historicalY);
                    long j = this.f28334f;
                    if (j > 0) {
                        float f10 = historicalEventTime - j;
                        if (f10 > 0.0f) {
                            arrayList.add(Float.valueOf(f10));
                        }
                    }
                    this.f28334f = historicalEventTime;
                }
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                long eventTime = motionEvent.getEventTime();
                path.lineTo(x10, y10);
                long j8 = this.f28334f;
                if (j8 > 0) {
                    float f11 = eventTime - j8;
                    if (f11 > 0.0f) {
                        arrayList.add(Float.valueOf(f11));
                    }
                }
                this.f28334f = eventTime;
                b();
                invalidate();
                return true;
            }
            if (actionMasked != 3) {
                return super.onTouchEvent(motionEvent);
            }
        }
        b();
        invalidate();
        return true;
    }
}
