package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C0752Tp;
import com.google.android.material.button.MaterialButton;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import l1.InterfaceC2638d;
import o1.InterfaceC2753a;
import u1.C2949d;
import z3.C3018c;
import z3.C3020e;
import z3.InterfaceC3017b;

/* loaded from: classes.dex */
public final class a1 implements z1.a, O0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22478a;

    /* renamed from: b, reason: collision with root package name */
    public Object f22479b;

    /* renamed from: c, reason: collision with root package name */
    public Object f22480c;

    /* renamed from: d, reason: collision with root package name */
    public Object f22481d;

    public /* synthetic */ a1(Object obj, Object obj2, Object obj3, int i) {
        this.f22478a = i;
        this.f22479b = obj;
        this.f22480c = obj2;
        this.f22481d = obj3;
    }

    public static a1 i(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new a1(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public Bitmap a(BitmapFactory.Options options) throws Throwable {
        switch (this.f22478a) {
            case 3:
                return u1.r.c(new H1.a(H1.b.c((ByteBuffer) this.f22479b)), options, this);
            case 4:
                u1.y yVar = (u1.y) ((com.bumptech.glide.load.data.h) this.f22479b).f6545b;
                yVar.reset();
                return u1.r.c(yVar, options, this);
            default:
                FileDescriptor fileDescriptor = ((com.bumptech.glide.load.data.h) this.f22481d).e().getFileDescriptor();
                Bitmap bitmapE = null;
                if (Build.VERSION.SDK_INT != 34 || !u1.r.a(options) || !u1.r.d(this)) {
                    return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                }
                H1.g.a("", options.inPreferredConfig == Bitmap.Config.HARDWARE);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    if (bitmapDecodeFileDescriptor == null) {
                        if (bitmapDecodeFileDescriptor != null) {
                        }
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        return bitmapE;
                    }
                    try {
                        bitmapE = u1.r.e(bitmapDecodeFileDescriptor);
                    } catch (Throwable th) {
                        th = th;
                        bitmapE = bitmapDecodeFileDescriptor;
                        if (bitmapE != null) {
                            bitmapE.recycle();
                        }
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        throw th;
                    }
                    bitmapDecodeFileDescriptor.recycle();
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    return bitmapE;
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
        }
    }

    @Override // z1.a
    public n1.z b(n1.z zVar, l1.h hVar) {
        Drawable drawable = (Drawable) zVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((L2.w) this.f22480c).b(C2949d.d(((BitmapDrawable) drawable).getBitmap(), (InterfaceC2753a) this.f22479b), hVar);
        }
        if (drawable instanceof y1.b) {
            return ((z1.c) this.f22481d).b(zVar, hVar);
        }
        return null;
    }

    public ColorStateList c(int i) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) this.f22480c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = G.c.b((Context) this.f22479b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    public Drawable d(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f22480c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : a4.t.i((Context) this.f22479b, resourceId);
    }

    public Drawable e(int i) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.f22480c).hasValue(i) || (resourceId = ((TypedArray) this.f22480c).getResourceId(i, 0)) == 0) {
            return null;
        }
        r rVarA = r.a();
        Context context = (Context) this.f22479b;
        synchronized (rVarA) {
            drawableG = rVarA.f22623a.g(context, resourceId, true);
        }
        return drawableG;
    }

    public Typeface f(int i, int i3, O o5) {
        int resourceId = ((TypedArray) this.f22480c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f22481d) == null) {
            this.f22481d = new TypedValue();
        }
        Context context = (Context) this.f22479b;
        TypedValue typedValue = (TypedValue) this.f22481d;
        ThreadLocal threadLocal = I.l.f1870a;
        if (context.isRestricted()) {
            return null;
        }
        return I.l.b(context, resourceId, typedValue, i3, o5, true, false);
    }

    public ImageHeaderParser$ImageType g() throws Throwable {
        u1.y yVar;
        switch (this.f22478a) {
            case 3:
                return R2.a.s((List) this.f22480c, H1.b.c((ByteBuffer) this.f22479b));
            case 4:
                List list = (List) this.f22481d;
                u1.y yVar2 = (u1.y) ((com.bumptech.glide.load.data.h) this.f22479b).f6545b;
                yVar2.reset();
                return R2.a.r(list, yVar2, (C0752Tp) this.f22480c);
            default:
                List list2 = (List) this.f22480c;
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) this.f22481d;
                C0752Tp c0752Tp = (C0752Tp) this.f22479b;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC2638d interfaceC2638d = (InterfaceC2638d) list2.get(i);
                    u1.y yVar3 = null;
                    try {
                        yVar = new u1.y(new FileInputStream(hVar.e().getFileDescriptor()), c0752Tp);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = interfaceC2638d.d(yVar);
                        yVar.b();
                        hVar.e();
                        if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                            return imageHeaderParser$ImageTypeD;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        yVar3 = yVar;
                        if (yVar3 != null) {
                            yVar3.b();
                        }
                        hVar.e();
                        throw th;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    @Override // O0.a
    public View getRoot() {
        return (LinearLayoutCompat) this.f22479b;
    }

    /* JADX WARN: Finally extract failed */
    public boolean h() throws Throwable {
        u1.y yVar;
        switch (this.f22478a) {
            case 3:
                List list = (List) this.f22480c;
                ByteBuffer byteBufferC = H1.b.c((ByteBuffer) this.f22479b);
                C0752Tp c0752Tp = (C0752Tp) this.f22481d;
                if (byteBufferC == null) {
                    return false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        if (((InterfaceC2638d) list.get(i)).b(byteBufferC, c0752Tp)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case 4:
                List list2 = (List) this.f22481d;
                u1.y yVar2 = (u1.y) ((com.bumptech.glide.load.data.h) this.f22479b).f6545b;
                yVar2.reset();
                C0752Tp c0752Tp2 = (C0752Tp) this.f22480c;
                yVar2.mark(5242880);
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    try {
                        boolean zE = ((InterfaceC2638d) list2.get(i3)).e(yVar2, c0752Tp2);
                        yVar2.reset();
                        if (zE) {
                            return true;
                        }
                    } catch (Throwable th) {
                        yVar2.reset();
                        throw th;
                    }
                }
                return false;
            default:
                List list3 = (List) this.f22480c;
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) this.f22481d;
                C0752Tp c0752Tp3 = (C0752Tp) this.f22479b;
                int size3 = list3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    InterfaceC2638d interfaceC2638d = (InterfaceC2638d) list3.get(i6);
                    u1.y yVar3 = null;
                    try {
                        yVar = new u1.y(new FileInputStream(hVar.e().getFileDescriptor()), c0752Tp3);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        boolean zE2 = interfaceC2638d.e(yVar, c0752Tp3);
                        yVar.b();
                        hVar.e();
                        if (zE2) {
                            return true;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        yVar3 = yVar;
                        if (yVar3 != null) {
                            yVar3.b();
                        }
                        hVar.e();
                        throw th;
                    }
                }
                return false;
        }
    }

    public void j() {
        ((TypedArray) this.f22480c).recycle();
    }

    public void m(String str, double d6, double d7) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) this.f22480c;
        ArrayList arrayList3 = (ArrayList) this.f22481d;
        int i = 0;
        while (true) {
            arrayList = (ArrayList) this.f22479b;
            if (i >= arrayList.size()) {
                break;
            }
            double dDoubleValue = ((Double) arrayList3.get(i)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList2.get(i)).doubleValue();
            if (d6 < dDoubleValue || (dDoubleValue == d6 && d7 < dDoubleValue2)) {
                break;
            } else {
                i++;
            }
        }
        arrayList.add(i, str);
        arrayList3.add(i, Double.valueOf(d6));
        arrayList2.add(i, Double.valueOf(d7));
    }

    public String toString() {
        switch (this.f22478a) {
            case 1:
                String str = (String) this.f22481d;
                String str2 = (String) this.f22480c;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f22479b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                String string = sb.toString();
                q5.i.d(string, "sb.toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public a1(int i) {
        this.f22478a = i;
        switch (i) {
            case 6:
                break;
            default:
                this.f22479b = new ArrayList();
                this.f22480c = new ArrayList();
                this.f22481d = new ArrayList();
                break;
        }
    }

    public a1(LinearLayoutCompat linearLayoutCompat, MaterialButton materialButton, AppCompatTextView appCompatTextView, TextView textView) {
        this.f22478a = 9;
        this.f22479b = linearLayoutCompat;
        this.f22480c = materialButton;
        this.f22481d = appCompatTextView;
    }

    public a1(InterfaceC3017b interfaceC3017b, View view) {
        Object c3018c;
        this.f22478a = 8;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            c3018c = new C3020e();
        } else {
            c3018c = i >= 33 ? new C3018c() : null;
        }
        this.f22479b = c3018c;
        this.f22480c = interfaceC3017b;
        this.f22481d = view;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a1(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType(), 1);
        this.f22478a = 1;
    }

    public a1(Context context, TypedArray typedArray) {
        this.f22478a = 0;
        this.f22479b = context;
        this.f22480c = typedArray;
    }

    public a1(H1.m mVar, ArrayList arrayList, C0752Tp c0752Tp) {
        this.f22478a = 4;
        H1.g.c(c0752Tp, "Argument must not be null");
        this.f22480c = c0752Tp;
        H1.g.c(arrayList, "Argument must not be null");
        this.f22481d = arrayList;
        this.f22479b = new com.bumptech.glide.load.data.h(mVar, c0752Tp);
    }

    private final void k() {
    }

    private final void l() {
    }

    public a1(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C0752Tp c0752Tp) {
        this.f22478a = 5;
        H1.g.c(c0752Tp, "Argument must not be null");
        this.f22479b = c0752Tp;
        H1.g.c(arrayList, "Argument must not be null");
        this.f22480c = arrayList;
        this.f22481d = new com.bumptech.glide.load.data.h(parcelFileDescriptor);
    }
}
