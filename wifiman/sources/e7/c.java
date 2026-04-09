package E7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.media.Image;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final RenderScript f4040a;

    /* renamed from: b, reason: collision with root package name */
    private final ScriptIntrinsicYuvToRGB f4041b;

    /* renamed from: c, reason: collision with root package name */
    private int f4042c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f4043d;

    /* renamed from: e, reason: collision with root package name */
    private Allocation f4044e;

    /* renamed from: f, reason: collision with root package name */
    private Allocation f4045f;

    public c(Context context) {
        AbstractC6492s.i(context, "context");
        RenderScript renderScriptCreate = RenderScript.create(context);
        this.f4040a = renderScriptCreate;
        this.f4041b = ScriptIntrinsicYuvToRGB.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        this.f4042c = -1;
    }

    private final void a(Image image, byte[] bArr) {
        int i10;
        int i11;
        Rect rect;
        Image.Plane[] planeArr;
        int i12;
        Rect rect2;
        int i13;
        c cVar = this;
        image.getFormat();
        int i14 = 0;
        Rect rect3 = new Rect(0, 0, image.getWidth(), image.getHeight());
        Image.Plane[] planes = image.getPlanes();
        AbstractC6492s.f(planes);
        int length = planes.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            Image.Plane plane = planes[i15];
            int i17 = i16 + 1;
            if (i16 != 0) {
                if (i16 == 1) {
                    i10 = cVar.f4042c + 1;
                } else if (i16 != 2) {
                    rect2 = rect3;
                    planeArr = planes;
                    i12 = length;
                    i13 = i14;
                    i15++;
                    cVar = this;
                    i14 = i13;
                    i16 = i17;
                    planes = planeArr;
                    length = i12;
                    rect3 = rect2;
                } else {
                    i10 = cVar.f4042c;
                }
                i11 = 2;
            } else {
                i10 = i14;
                i11 = 1;
            }
            ByteBuffer buffer = plane.getBuffer();
            int rowStride = plane.getRowStride();
            int pixelStride = plane.getPixelStride();
            if (i16 == 0) {
                rect = rect3;
                planeArr = planes;
                i12 = length;
            } else {
                planeArr = planes;
                i12 = length;
                rect = new Rect(rect3.left / 2, rect3.top / 2, rect3.right / 2, rect3.bottom / 2);
            }
            int iWidth = rect.width();
            int iHeight = rect.height();
            byte[] bArr2 = new byte[plane.getRowStride()];
            int i18 = (pixelStride == 1 && i11 == 1) ? iWidth : ((iWidth - 1) * pixelStride) + 1;
            int i19 = 0;
            while (i19 < iHeight) {
                Rect rect4 = rect3;
                buffer.position(((rect.top + i19) * rowStride) + (rect.left * pixelStride));
                if (pixelStride == 1 && i11 == 1) {
                    buffer.get(bArr, i10, i18);
                    i10 += i18;
                } else {
                    buffer.get(bArr2, 0, i18);
                    for (int i20 = 0; i20 < iWidth; i20++) {
                        bArr[i10] = bArr2[i20 * pixelStride];
                        i10 += i11;
                    }
                }
                i19++;
                rect3 = rect4;
            }
            rect2 = rect3;
            i13 = 0;
            i15++;
            cVar = this;
            i14 = i13;
            i16 = i17;
            planes = planeArr;
            length = i12;
            rect3 = rect2;
        }
    }

    public final synchronized void b(Image image, Bitmap output) {
        try {
            AbstractC6492s.i(image, "image");
            AbstractC6492s.i(output, "output");
            if (this.f4043d == null) {
                this.f4042c = image.getWidth() * image.getHeight();
                this.f4043d = new byte[(this.f4042c * ImageFormat.getBitsPerPixel(35)) / 8];
            }
            byte[] bArr = this.f4043d;
            Allocation allocation = null;
            if (bArr == null) {
                AbstractC6492s.v("yuvBuffer");
                bArr = null;
            }
            a(image, bArr);
            if (this.f4044e == null) {
                RenderScript renderScript = this.f4040a;
                Type typeCreate = new Type.Builder(renderScript, Element.YUV(renderScript)).setYuvFormat(17).create();
                RenderScript renderScript2 = this.f4040a;
                Element element = typeCreate.getElement();
                byte[] bArr2 = this.f4043d;
                if (bArr2 == null) {
                    AbstractC6492s.v("yuvBuffer");
                    bArr2 = null;
                }
                this.f4044e = Allocation.createSized(renderScript2, element, bArr2.length);
            }
            if (this.f4045f == null) {
                this.f4045f = Allocation.createFromBitmap(this.f4040a, output);
            }
            Allocation allocation2 = this.f4044e;
            if (allocation2 == null) {
                AbstractC6492s.v("inputAllocation");
                allocation2 = null;
            }
            byte[] bArr3 = this.f4043d;
            if (bArr3 == null) {
                AbstractC6492s.v("yuvBuffer");
                bArr3 = null;
            }
            allocation2.copyFrom(bArr3);
            ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGB = this.f4041b;
            Allocation allocation3 = this.f4044e;
            if (allocation3 == null) {
                AbstractC6492s.v("inputAllocation");
                allocation3 = null;
            }
            scriptIntrinsicYuvToRGB.setInput(allocation3);
            ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGB2 = this.f4041b;
            Allocation allocation4 = this.f4045f;
            if (allocation4 == null) {
                AbstractC6492s.v("outputAllocation");
                allocation4 = null;
            }
            scriptIntrinsicYuvToRGB2.forEach(allocation4);
            Allocation allocation5 = this.f4045f;
            if (allocation5 == null) {
                AbstractC6492s.v("outputAllocation");
            } else {
                allocation = allocation5;
            }
            allocation.copyTo(output);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
