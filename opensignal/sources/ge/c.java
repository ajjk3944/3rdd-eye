package ge;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i10 = message.what;
        if (i10 == 0) {
            h hVar = (h) message.obj;
            g gVar = hVar.f9546i;
            if (gVar.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
                if (layoutParams instanceof e3.e) {
                    e3.e eVar = (e3.e) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    b9.c cVar = baseTransientBottomBar$Behavior.f5704i;
                    cVar.getClass();
                    cVar.f2478d = hVar.f9554s;
                    baseTransientBottomBar$Behavior.f5501b = new a2.g(hVar);
                    eVar.b(baseTransientBottomBar$Behavior);
                    eVar.f7777g = 80;
                }
                ViewGroup viewGroup = hVar.f9544g;
                gVar.G = true;
                viewGroup.addView(gVar);
                gVar.G = false;
                hVar.e();
                gVar.setVisibility(4);
            }
            if (gVar.isLaidOut()) {
                hVar.d();
                return true;
            }
            hVar.f9552q = true;
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        h hVar2 = (h) message.obj;
        int i11 = message.arg1;
        g gVar2 = hVar2.f9546i;
        AccessibilityManager accessibilityManager = hVar2.f9553r;
        if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || gVar2.getVisibility() != 0) {
            hVar2.b();
            return true;
        }
        if (gVar2.getAnimationMode() == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setInterpolator(hVar2.f9541d);
            valueAnimatorOfFloat.addUpdateListener(new b(hVar2, 0));
            valueAnimatorOfFloat.setDuration(hVar2.f9539b);
            valueAnimatorOfFloat.addListener(new a(hVar2, i11, 0));
            valueAnimatorOfFloat.start();
            return true;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        g gVar3 = hVar2.f9546i;
        int height = gVar3.getHeight();
        ViewGroup.LayoutParams layoutParams2 = gVar3.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        }
        valueAnimator.setIntValues(0, height);
        valueAnimator.setInterpolator(hVar2.f9542e);
        valueAnimator.setDuration(hVar2.f9540c);
        valueAnimator.addListener(new a(hVar2, i11, 2));
        valueAnimator.addUpdateListener(new b(hVar2, 3));
        valueAnimator.start();
        return true;
    }
}
