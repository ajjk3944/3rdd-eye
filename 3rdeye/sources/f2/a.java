package F2;

import D2.c;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.DetectorActivity;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: MultiBoxTracker.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f1584k = {-16776961, -65536, -16711936, -256, -16711681, -65281, -1, Color.parseColor("#55FF55"), Color.parseColor("#FFA500"), Color.parseColor("#FF8888"), Color.parseColor("#AAAAFF"), Color.parseColor("#FFFFAA"), Color.parseColor("#55AAAA"), Color.parseColor("#AA33AA"), Color.parseColor("#0D0068")};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f1585a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final c f1586b = new c();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f1587c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedList f1588d = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final Paint f1589e = new Paint();

    /* renamed from: f, reason: collision with root package name */
    public final D2.a f1590f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f1591g;

    /* renamed from: h, reason: collision with root package name */
    public int f1592h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f1593j;

    /* compiled from: MultiBoxTracker.java */
    /* renamed from: F2.a$a, reason: collision with other inner class name */
    public static class C0027a {

        /* renamed from: a, reason: collision with root package name */
        public RectF f1594a;

        /* renamed from: b, reason: collision with root package name */
        public float f1595b;

        /* renamed from: c, reason: collision with root package name */
        public int f1596c;

        /* renamed from: d, reason: collision with root package name */
        public String f1597d;
    }

    public a(DetectorActivity detectorActivity) {
        for (int i : f1584k) {
            this.f1587c.add(Integer.valueOf(i));
        }
        this.f1589e.setColor(-65536);
        this.f1589e.setStyle(Paint.Style.STROKE);
        this.f1589e.setStrokeWidth(10.0f);
        this.f1589e.setStrokeCap(Paint.Cap.ROUND);
        this.f1589e.setStrokeJoin(Paint.Join.ROUND);
        this.f1589e.setStrokeMiter(100.0f);
        this.f1590f = new D2.a(TypedValue.applyDimension(1, 18.0f, detectorActivity.getResources().getDisplayMetrics()));
    }

    public final void a(LinkedList linkedList) {
        c cVar;
        LinkedList<Pair> linkedList2 = new LinkedList();
        LinkedList linkedList3 = this.f1585a;
        linkedList3.clear();
        Matrix matrix = new Matrix(this.f1591g);
        Iterator it = linkedList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            cVar = this.f1586b;
            if (!zHasNext) {
                break;
            }
            E2.a aVar = (E2.a) it.next();
            aVar.getClass();
            new RectF(aVar.f1363d);
            RectF rectF = new RectF(new RectF(aVar.f1363d));
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            String str = "Result! Frame: " + new RectF(aVar.f1363d) + " mapped to screen:" + rectF2;
            Object[] objArr = new Object[0];
            if (cVar.d(2)) {
                Log.v("tensorflow", cVar.e(str, objArr));
            }
            Float f10 = aVar.f1362c;
            linkedList3.add(new Pair(f10, rectF2));
            if (rectF.width() < 16.0f || rectF.height() < 16.0f) {
                cVar.f("Degenerate rectangle! " + rectF, new Object[0]);
            } else {
                linkedList2.add(new Pair(f10, aVar));
            }
        }
        LinkedList linkedList4 = this.f1588d;
        linkedList4.clear();
        if (linkedList2.isEmpty()) {
            Object[] objArr2 = new Object[0];
            if (cVar.d(2)) {
                Log.v("tensorflow", cVar.e("Nothing to track, aborting.", objArr2));
                return;
            }
            return;
        }
        for (Pair pair : linkedList2) {
            C0027a c0027a = new C0027a();
            c0027a.f1595b = ((Float) pair.first).floatValue();
            E2.a aVar2 = (E2.a) pair.second;
            aVar2.getClass();
            c0027a.f1594a = new RectF(new RectF(aVar2.f1363d));
            c0027a.f1597d = ((E2.a) pair.second).f1361b;
            int size = linkedList4.size();
            int[] iArr = f1584k;
            c0027a.f1596c = iArr[size];
            linkedList4.add(c0027a);
            if (linkedList4.size() >= iArr.length) {
                return;
            }
        }
    }
}
