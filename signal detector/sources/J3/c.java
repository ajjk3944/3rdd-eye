package J3;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import n1.z;

/* loaded from: classes.dex */
public final class c implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2086a;

    public /* synthetic */ c(int i) {
        this.f2086a = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        switch (this.f2086a) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    i iVar = (i) message.obj;
                    h hVar = iVar.i;
                    if (hVar.getParent() == null) {
                        ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
                        if (layoutParams instanceof E.e) {
                            E.e eVar = (E.e) layoutParams;
                            BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                            U0.j jVar = baseTransientBottomBar$Behavior.i;
                            jVar.getClass();
                            jVar.f3677b = iVar.f2128t;
                            baseTransientBottomBar$Behavior.f18107b = new A0.e(7, iVar);
                            eVar.b(baseTransientBottomBar$Behavior);
                            eVar.f1317g = 80;
                        }
                        ViewGroup viewGroup = iVar.f2116g;
                        hVar.f2103k = true;
                        viewGroup.addView(hVar);
                        hVar.f2103k = false;
                        iVar.e();
                        hVar.setVisibility(4);
                    }
                    if (hVar.isLaidOut()) {
                        iVar.d();
                        return true;
                    }
                    iVar.f2126r = true;
                    return true;
                }
                if (i != 1) {
                    return false;
                }
                i iVar2 = (i) message.obj;
                int i3 = message.arg1;
                h hVar2 = iVar2.i;
                AccessibilityManager accessibilityManager = iVar2.f2127s;
                if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || hVar2.getVisibility() != 0) {
                    iVar2.b();
                    return true;
                }
                if (hVar2.getAnimationMode() == 1) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.setInterpolator(iVar2.f2113d);
                    valueAnimatorOfFloat.addUpdateListener(new b(iVar2, 0));
                    valueAnimatorOfFloat.setDuration(iVar2.f2111b);
                    valueAnimatorOfFloat.addListener(new a(iVar2, i3, 0));
                    valueAnimatorOfFloat.start();
                    return true;
                }
                ValueAnimator valueAnimator = new ValueAnimator();
                h hVar3 = iVar2.i;
                int height = hVar3.getHeight();
                ViewGroup.LayoutParams layoutParams2 = hVar3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                valueAnimator.setIntValues(0, height);
                valueAnimator.setInterpolator(iVar2.f2114e);
                valueAnimator.setDuration(iVar2.f2112c);
                valueAnimator.addListener(new a(iVar2, i3, 2));
                valueAnimator.addUpdateListener(new b(iVar2, 3));
                valueAnimator.start();
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((z) message.obj).b();
                return true;
        }
    }
}
