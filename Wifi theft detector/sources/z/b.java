package z;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class b extends v.e {

    public static class a extends b {
        @Override // z.b
        public void f(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* renamed from: z.b$b, reason: collision with other inner class name */
    public static class C0505b extends b {

        /* renamed from: h, reason: collision with root package name */
        public float[] f25203h = new float[1];

        /* renamed from: i, reason: collision with root package name */
        public ConstraintAttribute f25204i;

        @Override // z.b
        public void f(View view, float f10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f25203h[0] = a(f10);
            this.f25204i.i(view, this.f25203h);
        }
    }

    public static class c extends b {
        @Override // z.b
        public void f(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    public static class e extends b {

        /* renamed from: h, reason: collision with root package name */
        public boolean f25205h = false;

        @Override // z.b
        public void f(View view, float f10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
                return;
            }
            if (this.f25205h) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f25205h = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f10)));
                } catch (IllegalAccessException e10) {
                    Log.e("ViewOscillator", "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e("ViewOscillator", "unable to setProgress", e11);
                }
            }
        }
    }

    public static class f extends b {
        @Override // z.b
        public void f(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    public static class g extends b {
        @Override // z.b
        public void f(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    public static class h extends b {
        @Override // z.b
        public void f(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    public static class i extends b {
        @Override // z.b
        public void f(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    public static class j extends b {
        @Override // z.b
        public void f(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    public static class k extends b {
        @Override // z.b
        public void f(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    public static class l extends b {
        @Override // z.b
        public void f(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    public static class m extends b {
        @Override // z.b
        public void f(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public static b e(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C0505b();
        }
        switch (str) {
            case "rotationX":
                return new g();
            case "rotationY":
                return new h();
            case "translationX":
                return new k();
            case "translationY":
                return new l();
            case "translationZ":
                return new m();
            case "progress":
                return new e();
            case "scaleX":
                return new i();
            case "scaleY":
                return new j();
            case "waveVariesBy":
                return new a();
            case "rotation":
                return new f();
            case "elevation":
                return new c();
            case "transitionPathRotate":
                return new d();
            case "alpha":
                return new a();
            case "waveOffset":
                return new a();
            default:
                return null;
        }
    }

    public abstract void f(View view, float f10);

    public static class d extends b {
        public void g(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }

        @Override // z.b
        public void f(View view, float f10) {
        }
    }
}
