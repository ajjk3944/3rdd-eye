package B4;

import Y2.C0200b;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.format.Formatter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import c5.C0412i;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import java.io.File;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class x extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public q5.o f758e;

    /* renamed from: f, reason: collision with root package name */
    public int f759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q5.o f760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y f761h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q5.o oVar, y yVar, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f760g = oVar;
        this.f761h = yVar;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((x) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new x(this.f760g, this.f761h, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        q5.o oVar;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        int i = this.f759f;
        q5.o oVar2 = this.f760g;
        y yVar = this.f761h;
        if (i == 0) {
            R2.a.H(obj);
            G5.d dVar = z5.D.f24486b;
            w wVar = new w(yVar, null);
            this.f758e = oVar2;
            this.f759f = 1;
            obj = AbstractC3046w.r(dVar, this, wVar);
            EnumC2380a enumC2380a = EnumC2380a.f20635a;
            if (obj == enumC2380a) {
                return enumC2380a;
            }
            oVar = oVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.f758e;
            R2.a.H(obj);
        }
        oVar.f23299a = obj;
        C0200b c0200b = yVar.f762A0;
        q5.i.b(c0200b);
        ((LinearLayoutCompat) c0200b.f4305d).setVisibility(8);
        C0200b c0200b2 = yVar.f762A0;
        q5.i.b(c0200b2);
        ((RelativeLayout) c0200b2.f4304c).setVisibility(0);
        Context contextM = yVar.m();
        if (contextM != null && (applicationInfo2 = contextM.getApplicationInfo()) != null) {
            int i3 = applicationInfo2.labelRes;
            C0200b c0200b3 = yVar.f762A0;
            q5.i.b(c0200b3);
            ((TextView) c0200b3.f4307f).setText(i3);
        }
        Context contextM2 = yVar.m();
        if (contextM2 != null && (applicationInfo = contextM2.getApplicationInfo()) != null) {
            int i6 = applicationInfo.icon;
            C0200b c0200b4 = yVar.f762A0;
            q5.i.b(c0200b4);
            ((AppCompatImageView) c0200b4.f4306e).setImageResource(i6);
        }
        C0200b c0200b5 = yVar.f762A0;
        q5.i.b(c0200b5);
        TextView textView = (TextView) c0200b5.f4308g;
        Context contextM3 = yVar.m();
        File file = (File) oVar2.f23299a;
        textView.setText(Formatter.formatFileSize(contextM3, file != null ? file.length() : 0L));
        return C0412i.f5929a;
    }
}
