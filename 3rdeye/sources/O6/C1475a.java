package O6;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* compiled from: BitmapEffectHelper.kt */
/* renamed from: O6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1475a {

    /* renamed from: a, reason: collision with root package name */
    public final RenderScript f10380a;

    public C1475a(RenderScript renderScript) {
        kotlin.jvm.internal.l.f(renderScript, "renderScript");
        this.f10380a = renderScript;
    }

    public static Bitmap b(Bitmap bitmap) {
        kotlin.jvm.internal.l.f(bitmap, "bitmap");
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        kotlin.jvm.internal.l.e(bitmapCreateBitmap, "createBitmap(\n          …lter = */ false\n        )");
        bitmapCreateBitmap.setDensity(160);
        return bitmapCreateBitmap;
    }

    public final Bitmap a(Bitmap bitmap, int i) {
        float f10;
        kotlin.jvm.internal.l.f(bitmap, "bitmap");
        if (i == 0) {
            return bitmap;
        }
        if (i > 25) {
            f10 = (i * 1.0f) / 25;
            i = 25;
        } else {
            f10 = 1.0f;
        }
        Bitmap result = f10 == 1.0f ? bitmap.copy(bitmap.getConfig(), false) : Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / f10), (int) (bitmap.getHeight() / f10), false);
        RenderScript renderScript = this.f10380a;
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScript, result);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScript, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        scriptIntrinsicBlurCreate.setRadius(i);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        allocationCreateTyped.copyTo(result);
        allocationCreateFromBitmap.destroy();
        allocationCreateTyped.destroy();
        scriptIntrinsicBlurCreate.destroy();
        kotlin.jvm.internal.l.e(result, "result");
        return result;
    }
}
