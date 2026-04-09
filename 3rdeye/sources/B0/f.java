package B0;

import android.app.Application;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import b2.C1823d;
import b2.C1825f;
import b2.InterfaceC1824e;
import com.yandex.mobile.ads.impl.e20;
import i2.C4440M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.l;
import o2.C5416g;
import v2.C5674b;
import w1.o;
import w6.C5739c;
import w6.InterfaceC5740d;
import y9.n;
import y9.q;

/* compiled from: GradientColorInflaterCompat.java */
/* loaded from: classes.dex */
public class f implements InterfaceC5740d, InterfaceC1824e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f356b;

    /* renamed from: c, reason: collision with root package name */
    public Object f357c;

    /* renamed from: d, reason: collision with root package name */
    public Object f358d;

    public f(C5416g c5416g, G5.c cVar) {
        this.f356b = 6;
        this.f357c = c5416g;
        this.f358d = cVar;
    }

    @Override // b2.InterfaceC1824e
    public Long a(String str) throws IOException {
        o oVarD = o.d(1, "SELECT long_value FROM Preference where `key`=?");
        oVarD.h(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f357c;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            Long lValueOf = null;
            if (cursorY.moveToFirst() && !cursorY.isNull(0)) {
                lValueOf = Long.valueOf(cursorY.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    @Override // b2.InterfaceC1824e
    public void b(C1823d c1823d) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f357c;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((C1825f) this.f358d).j(c1823d);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
        }
    }

    public InterfaceC5740d c(String str) {
        M7.c cVar = (M7.c) this.f358d;
        if (cVar != null) {
            int iF0 = q.f0(str, '?', 0, 6);
            if (iF0 == -1) {
                iF0 = str.length();
            }
            String strSubstring = str.substring(0, iF0);
            l.e(strSubstring, "substring(...)");
            if (n.T(strSubstring, ".svg")) {
                return cVar;
            }
        }
        return (e20) this.f357c;
    }

    public Object d(C5674b c5674b) {
        return (C4440M) this.f358d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object e(float f10, float f11, Object obj, Object obj2, float f12, float f13, float f14) {
        C5674b c5674b = (C5674b) this.f357c;
        c5674b.f47026a = f10;
        c5674b.f47027b = f11;
        c5674b.f47028c = obj;
        c5674b.f47029d = obj2;
        c5674b.f47030e = f12;
        c5674b.f47031f = f13;
        c5674b.f47032g = f14;
        return d(c5674b);
    }

    public boolean equals(Object obj) {
        switch (this.f356b) {
            case 5:
                if (!(obj instanceof K0.c)) {
                    return false;
                }
                K0.c cVar = (K0.c) obj;
                F f10 = cVar.f2940a;
                Object obj2 = (String) this.f357c;
                if (f10 != obj2 && (f10 == 0 || !f10.equals(obj2))) {
                    return false;
                }
                Object obj3 = (String) this.f358d;
                S s10 = cVar.f2941b;
                return s10 == obj3 || (s10 != 0 && s10.equals(obj3));
            default:
                return super.equals(obj);
        }
    }

    @Override // w6.InterfaceC5740d
    public /* synthetic */ Boolean hasSvgSupport() {
        return Boolean.FALSE;
    }

    public int hashCode() {
        switch (this.f356b) {
            case 5:
                String str = (String) this.f357c;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = (String) this.f358d;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // w6.InterfaceC5740d
    public w6.e loadImage(String imageUrl, C5739c c5739c) {
        l.f(imageUrl, "imageUrl");
        w6.e eVarLoadImage = c(imageUrl).loadImage(imageUrl, c5739c);
        l.e(eVarLoadImage, "getProperLoader(imageUrl…Image(imageUrl, callback)");
        return eVarLoadImage;
    }

    @Override // w6.InterfaceC5740d
    public w6.e loadImageBytes(String imageUrl, C5739c c5739c) {
        l.f(imageUrl, "imageUrl");
        w6.e eVarLoadImageBytes = c(imageUrl).loadImageBytes(imageUrl, c5739c);
        l.e(eVarLoadImageBytes, "getProperLoader(imageUrl…Bytes(imageUrl, callback)");
        return eVarLoadImageBytes;
    }

    public String toString() {
        switch (this.f356b) {
            case 5:
                StringBuilder sb = new StringBuilder("Pair{");
                sb.append(this.f357c);
                sb.append(" ");
                sb.append(this.f358d);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public f(e20 providedImageLoader) {
        this.f356b = 3;
        l.f(providedImageLoader, "providedImageLoader");
        this.f357c = providedImageLoader;
        this.f358d = !providedImageLoader.hasSvgSupport().booleanValue() ? new M7.c() : null;
    }

    public f(HashMap typefaceProviders, u6.a defaultTypeface) {
        this.f356b = 1;
        l.f(typefaceProviders, "typefaceProviders");
        l.f(defaultTypeface, "defaultTypeface");
        this.f357c = typefaceProviders;
        this.f358d = defaultTypeface;
    }

    public f(Application application) {
        this.f356b = 2;
        this.f357c = application;
        this.f358d = new com.zipoapps.premiumhelper.c(application);
    }

    public f(WorkDatabase_Impl workDatabase_Impl) {
        this.f356b = 4;
        this.f357c = workDatabase_Impl;
        this.f358d = new C1825f(workDatabase_Impl, 0);
    }

    public f(int i) {
        this.f356b = i;
        switch (i) {
            case 7:
                this.f357c = new C5674b();
                this.f358d = null;
                break;
        }
    }

    public f(C4440M c4440m) {
        this.f356b = 7;
        this.f357c = new C5674b();
        this.f358d = c4440m;
    }

    public f(ArrayList arrayList, ArrayList arrayList2) {
        this.f356b = 0;
        int size = arrayList.size();
        this.f357c = new int[size];
        this.f358d = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f357c)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f358d)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public f(int i, int i10) {
        this.f356b = 0;
        this.f357c = new int[]{i, i10};
        this.f358d = new float[]{0.0f, 1.0f};
    }

    public f(int i, int i10, int i11) {
        this.f356b = 0;
        this.f357c = new int[]{i, i10, i11};
        this.f358d = new float[]{0.0f, 0.5f, 1.0f};
    }
}
