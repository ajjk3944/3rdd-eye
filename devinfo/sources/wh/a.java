package wh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.SparseArray;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends View {

    /* renamed from: a, reason: collision with root package name */
    public Paint f36738a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f36739b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f36740c;

    /* renamed from: d, reason: collision with root package name */
    public SparseArray f36741d;

    /* renamed from: e, reason: collision with root package name */
    public int f36742e;

    /* renamed from: f, reason: collision with root package name */
    public String f36743f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public float f36744h;

    /* renamed from: i, reason: collision with root package name */
    public PointF f36745i;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f36740c;
        PointF pointF = this.f36745i;
        SparseArray sparseArray = this.f36739b;
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            PointF pointF2 = (PointF) sparseArray.valueAt(i4);
            canvas.drawPoint(pointF2.x, pointF2.y, this.f36738a);
        }
        canvas.drawText(this.f36743f, pointF.x, pointF.y, paint);
        canvas.drawText(this.g, pointF.x, pointF.y + this.f36744h, paint);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:(3:32|18|19)(2:5|(2:7|(2:9|(0)))(4:12|(4:15|16|34|13)|38|17))|28)(1:20)|36|21|(1:23)|24|(1:26)|27|28) */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.String r0 = "test_multitouch"
            android.util.SparseArray r1 = r10.f36741d
            android.util.SparseArray r2 = r10.f36739b
            int r3 = r11.getActionMasked()
            r4 = 2131886836(0x7f1202f4, float:1.9408262E38)
            java.lang.String r5 = ": "
            r6 = 1
            if (r3 == 0) goto L74
            if (r3 == r6) goto L44
            r7 = 2
            if (r3 == r7) goto L1f
            r7 = 5
            if (r3 == r7) goto L77
            r0 = 6
            if (r3 == r0) goto L44
            goto Lfe
        L1f:
            r0 = 0
        L20:
            int r1 = r11.getPointerCount()     // Catch: java.lang.Exception -> L3f
            if (r0 >= r1) goto L3f
            int r1 = r11.getPointerId(r0)     // Catch: java.lang.Exception -> L3f
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Exception -> L3f
            android.graphics.PointF r1 = (android.graphics.PointF) r1     // Catch: java.lang.Exception -> L3f
            float r3 = r11.getX(r0)     // Catch: java.lang.Exception -> L3f
            r1.x = r3     // Catch: java.lang.Exception -> L3f
            float r3 = r11.getY(r0)     // Catch: java.lang.Exception -> L3f
            r1.y = r3     // Catch: java.lang.Exception -> L3f
            int r0 = r0 + 1
            goto L20
        L3f:
            r10.invalidate()
            goto Lfe
        L44:
            int r0 = r11.getActionIndex()     // Catch: java.lang.Exception -> L4f
            int r11 = r11.getPointerId(r0)     // Catch: java.lang.Exception -> L4f
            r1.remove(r11)     // Catch: java.lang.Exception -> L4f
        L4f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            android.content.res.Resources r0 = r10.getResources()
            java.lang.String r0 = r0.getString(r4)
            r11.append(r0)
            r11.append(r5)
            int r0 = r1.size()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.g = r11
            r10.invalidate()
            goto Lfe
        L74:
            r2.clear()
        L77:
            int r3 = r11.getActionIndex()     // Catch: java.lang.Exception -> Lfb
            int r7 = r11.getPointerId(r3)     // Catch: java.lang.Exception -> Lfb
            android.graphics.PointF r8 = new android.graphics.PointF     // Catch: java.lang.Exception -> Lfb
            float r9 = r11.getX(r3)     // Catch: java.lang.Exception -> Lfb
            float r11 = r11.getY(r3)     // Catch: java.lang.Exception -> Lfb
            r8.<init>(r9, r11)     // Catch: java.lang.Exception -> Lfb
            r2.append(r7, r8)     // Catch: java.lang.Exception -> Lfb
            r1.append(r7, r8)     // Catch: java.lang.Exception -> Lfb
            int r11 = r10.f36742e     // Catch: java.lang.Exception -> Lfb
            int r3 = r2.size()     // Catch: java.lang.Exception -> Lfb
            if (r11 >= r3) goto La0
            int r11 = r2.size()     // Catch: java.lang.Exception -> Lfb
            r10.f36742e = r11     // Catch: java.lang.Exception -> Lfb
        La0:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lfb
            r11.<init>()     // Catch: java.lang.Exception -> Lfb
            android.content.res.Resources r2 = r10.getResources()     // Catch: java.lang.Exception -> Lfb
            r3 = 2131887387(0x7f12051b, float:1.940938E38)
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Exception -> Lfb
            r11.append(r2)     // Catch: java.lang.Exception -> Lfb
            r11.append(r5)     // Catch: java.lang.Exception -> Lfb
            int r2 = r10.f36742e     // Catch: java.lang.Exception -> Lfb
            r11.append(r2)     // Catch: java.lang.Exception -> Lfb
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> Lfb
            r10.f36743f = r11     // Catch: java.lang.Exception -> Lfb
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lfb
            r11.<init>()     // Catch: java.lang.Exception -> Lfb
            android.content.res.Resources r2 = r10.getResources()     // Catch: java.lang.Exception -> Lfb
            java.lang.String r2 = r2.getString(r4)     // Catch: java.lang.Exception -> Lfb
            r11.append(r2)     // Catch: java.lang.Exception -> Lfb
            r11.append(r5)     // Catch: java.lang.Exception -> Lfb
            int r1 = r1.size()     // Catch: java.lang.Exception -> Lfb
            r11.append(r1)     // Catch: java.lang.Exception -> Lfb
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> Lfb
            r10.g = r11     // Catch: java.lang.Exception -> Lfb
            com.liuzh.deviceinfo.utilities.t r11 = com.liuzh.deviceinfo.utilities.t.f21303b     // Catch: java.lang.Exception -> Lfb
            android.content.SharedPreferences r1 = r11.f21304a     // Catch: java.lang.Exception -> Lfb
            r2 = -1
            int r1 = r1.getInt(r0, r2)     // Catch: java.lang.Exception -> Lfb
            int r2 = r10.f36742e     // Catch: java.lang.Exception -> Lfb
            if (r1 >= r2) goto Lfb
            android.content.SharedPreferences r11 = r11.f21304a     // Catch: java.lang.Exception -> Lfb
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch: java.lang.Exception -> Lfb
            android.content.SharedPreferences$Editor r11 = r11.putInt(r0, r2)     // Catch: java.lang.Exception -> Lfb
            r11.apply()     // Catch: java.lang.Exception -> Lfb
        Lfb:
            r10.invalidate()
        Lfe:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.a.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
