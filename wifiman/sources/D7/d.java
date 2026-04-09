package D7;

import Yg.s;
import Yg.z;
import Zg.AbstractC3689v;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import org.tensorflow.lite.support.image.e;
import org.tensorflow.lite.support.label.Category;
import org.tensorflow.lite.task.vision.detector.Detection;
import org.tensorflow.lite.task.vision.detector.ObjectDetector;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final E7.c f2894a;

    /* renamed from: b, reason: collision with root package name */
    private final E7.a f2895b;

    /* renamed from: c, reason: collision with root package name */
    private final ObjectDetector.ObjectDetectorOptions f2896c;

    /* renamed from: d, reason: collision with root package name */
    private final ObjectDetector f2897d;

    public d(Context context, String modelAssetFile, float f10) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(modelAssetFile, "modelAssetFile");
        this.f2894a = new E7.c(context);
        this.f2895b = new E7.a();
        ObjectDetector.ObjectDetectorOptions objectDetectorOptionsH = ObjectDetector.ObjectDetectorOptions.a().i(f10).h();
        this.f2896c = objectDetectorOptionsH;
        this.f2897d = ObjectDetector.P(context, modelAssetFile, objectDetectorOptionsH);
    }

    private final Bitmap b(Image image) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
        AbstractC6492s.h(bitmapCreateBitmap, "createBitmap(...)");
        this.f2894a.b(image, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    public List a(Image image, int i10) {
        Object next;
        c cVar;
        AbstractC6492s.i(image, "image");
        Bitmap bitmapA = E7.b.f4039a.a(this.f2895b.a(b(image), 640), i10);
        long jCurrentTimeMillis = System.currentTimeMillis();
        List listT = this.f2897d.T(e.b(bitmapA));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        int width = image.getWidth();
        int height = image.getHeight();
        int size = listT.size();
        List<Detection> list = listT;
        int i11 = 10;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List listB = ((Detection) it.next()).b();
            AbstractC6492s.h(listB, "getCategories(...)");
            List<Category> list2 = listB;
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list2, i11));
            for (Category category : list2) {
                arrayList2.add(category.c() + "[" + category.d() + "]");
            }
            arrayList.add(AbstractC3689v.z0(arrayList2, ",", null, null, 0, null, null, 62, null));
            i11 = 10;
        }
        String str = "getCategories(...)";
        Z7.b.h("AR image (" + width + "x" + height + "px) analysis took " + jCurrentTimeMillis2 + "ms and detected " + size + " objects. " + AbstractC3689v.z0(arrayList, ";", null, null, 0, null, null, 62, null), null, 2, null);
        ArrayList arrayList3 = new ArrayList();
        for (Detection detection : list) {
            List listB2 = detection.b();
            String str2 = str;
            AbstractC6492s.h(listB2, str2);
            Iterator it2 = listB2.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    float fD = ((Category) next).d();
                    do {
                        Object next2 = it2.next();
                        float fD2 = ((Category) next2).d();
                        if (Float.compare(fD, fD2) < 0) {
                            next = next2;
                            fD = fD2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            Category category2 = (Category) next;
            if (category2 == null) {
                cVar = null;
            } else {
                E7.b bVar = E7.b.f4039a;
                s sVarB = bVar.b(z.a(Integer.valueOf((int) detection.a().left), Integer.valueOf((int) detection.a().top)), bitmapA.getWidth(), bitmapA.getHeight(), i10);
                s sVarB2 = bVar.b(z.a(Integer.valueOf((int) detection.a().right), Integer.valueOf((int) detection.a().bottom)), bitmapA.getWidth(), bitmapA.getHeight(), i10);
                String strC = category2.c();
                AbstractC6492s.h(strC, "getLabel(...)");
                cVar = new c(strC, category2.d(), new Rect(((Number) sVarB.h()).intValue(), ((Number) sVarB.j()).intValue(), ((Number) sVarB2.h()).intValue(), ((Number) sVarB2.j()).intValue()));
            }
            if (cVar != null) {
                arrayList3.add(cVar);
            }
            str = str2;
        }
        return arrayList3;
    }
}
