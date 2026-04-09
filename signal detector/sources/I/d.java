package I;

import B4.InterfaceC0140b;
import R.O;
import a4.t;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.lefan.base.activity.LanguageActivity;
import com.lefan.signal.network.webSpeed.WebSpeedActivity;
import com.lefan.signal.network.webSpeed.WebSpeedBean;
import com.lefan.signal.network.webSpeed.WebSpeedRoom_Impl;
import g.AbstractC2327a;
import h0.C2351a;
import h0.C2352b;
import java.util.ArrayList;
import java.util.Locale;
import o.AbstractC2720j0;
import o.Y0;
import o.a1;
import o.r;
import w4.C2976b;

/* loaded from: classes.dex */
public final class d implements InterfaceC0140b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1849a;

    /* renamed from: b, reason: collision with root package name */
    public int f1850b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1851c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1852d;

    public /* synthetic */ d() {
        this.f1849a = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f4, code lost:
    
        if (r12 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f7, code lost:
    
        if (r12 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f9, code lost:
    
        r17 = (int[]) r0.f3875b;
        r18 = (float[]) r0.f3876c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0207, code lost:
    
        if (r13 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0209, code lost:
    
        if (r13 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0216, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021c, code lost:
    
        r12 = new android.graphics.LinearGradient(r22, r25, r26, r16, r17, r18, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0220, code lost:
    
        r12 = new android.graphics.SweepGradient(r8, r10, (int[]) r0.f3875b, (float[]) r0.f3876c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0232, code lost:
    
        if (r24 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0234, code lost:
    
        r1 = (int[]) r0.f3875b;
        r22 = (float[]) r0.f3876c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0241, code lost:
    
        if (r13 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0244, code lost:
    
        if (r13 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0246, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0253, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0259, code lost:
    
        r12 = new android.graphics.RadialGradient(r8, r10, r24, r1, r22, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x025e, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0265, code lost:
    
        return new I.d(r13, r13, r12, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x026d, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d9, code lost:
    
        if (r9.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01db, code lost:
    
        r0 = new V2.h(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e1, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e2, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e6, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e8, code lost:
    
        r0 = new V2.h(r6, r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ee, code lost:
    
        r0 = new V2.h(r6, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static I.d b(int r29, android.content.res.Resources.Theme r30, android.content.res.Resources r31) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I.d.b(int, android.content.res.Resources$Theme, android.content.res.Resources):I.d");
    }

    public void a() {
        Y0 y02;
        ImageView imageView = (ImageView) this.f1851c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC2720j0.a(drawable);
        }
        if (drawable == null || (y02 = (Y0) this.f1852d) == null) {
            return;
        }
        r.e(drawable, y02, imageView.getDrawableState());
    }

    public boolean c() {
        ColorStateList colorStateList;
        return ((Shader) this.f1851c) == null && (colorStateList = (ColorStateList) this.f1852d) != null && colorStateList.isStateful();
    }

    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1851c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC2327a.f20119f;
        a1 a1VarI = a1.i(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) a1VarI.f22480c;
        O.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) a1VarI.f22480c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = t.i(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC2720j0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(a1VarI.c(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC2720j0.c(typedArray.getInt(3, -1), null));
            }
            a1VarI.j();
        } catch (Throwable th) {
            a1VarI.j();
            throw th;
        }
    }

    public void e(int i) {
        ImageView imageView = (ImageView) this.f1851c;
        if (i != 0) {
            Drawable drawableI = t.i(imageView.getContext(), i);
            if (drawableI != null) {
                AbstractC2720j0.a(drawableI);
            }
            imageView.setImageDrawable(drawableI);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }

    @Override // B4.InterfaceC0140b
    public void i(Dialog dialog) {
        switch (this.f1849a) {
            case 1:
                WebSpeedBean webSpeedBean = (WebSpeedBean) this.f1852d;
                WebSpeedActivity webSpeedActivity = (WebSpeedActivity) this.f1851c;
                if (dialog != null) {
                    dialog.dismiss();
                }
                int i = WebSpeedActivity.f18847S;
                O4.e eVar = (O4.e) webSpeedActivity.f18851R.getValue();
                WebSpeedRoom_Impl webSpeedRoom_Impl = eVar.f3077a;
                webSpeedRoom_Impl.b();
                webSpeedRoom_Impl.c();
                try {
                    L4.c cVar = eVar.f3079c;
                    H0.j jVarA = cVar.a();
                    try {
                        cVar.e(jVarA, webSpeedBean);
                        jVarA.b();
                        cVar.c(jVarA);
                        webSpeedRoom_Impl.m();
                        webSpeedRoom_Impl.j();
                        webSpeedActivity.f18850Q.remove(webSpeedBean);
                        webSpeedActivity.f18849P.notifyItemRemoved(this.f1850b);
                        return;
                    } catch (Throwable th) {
                        cVar.c(jVarA);
                        throw th;
                    }
                } catch (Throwable th2) {
                    webSpeedRoom_Impl.j();
                    throw th2;
                }
            default:
                C2976b c2976b = (C2976b) this.f1852d;
                Locale locale = c2976b.f23971a;
                LanguageActivity languageActivity = (LanguageActivity) this.f1851c;
                if (dialog != null) {
                    dialog.dismiss();
                }
                int i3 = this.f1850b;
                languageActivity.f18762T = i3;
                languageActivity.f18761S = locale;
                c2976b.f23972b = 2;
                languageActivity.f18757O.notifyItemChanged(i3);
                C2351a c2351a = new C2351a(18);
                ((ArrayList) c2351a.f20442c).add(locale);
                V2.h hVar = new V2.h(c2351a);
                a4.b bVar = languageActivity.f18760R;
                if (bVar != null) {
                    bVar.a(hVar);
                    return;
                }
                return;
        }
    }

    @Override // B4.InterfaceC0140b
    public void m(Dialog dialog) {
        switch (this.f1849a) {
            case 1:
                if (dialog != null) {
                    dialog.dismiss();
                    break;
                }
                break;
            default:
                if (dialog != null) {
                    dialog.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d(int i, int i3, Object obj, Object obj2) {
        this.f1849a = i3;
        this.f1851c = obj;
        this.f1852d = obj2;
        this.f1850b = i;
    }

    public d(ImageView imageView) {
        this.f1849a = 4;
        this.f1850b = 0;
        this.f1851c = imageView;
    }

    public d(LanguageActivity languageActivity, int i, C2976b c2976b) {
        this.f1849a = 5;
        this.f1851c = languageActivity;
        this.f1850b = i;
        this.f1852d = c2976b;
    }

    public d(H1.h hVar) {
        this.f1849a = 3;
        this.f1852d = I1.c.a(150, new C2352b(6, this));
        this.f1851c = hVar;
    }
}
