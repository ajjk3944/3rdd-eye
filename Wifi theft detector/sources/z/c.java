package z;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class c extends v.j {

    public static class a extends c {
        @Override // z.c
        public void g(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    public static class b extends c {

        /* renamed from: f, reason: collision with root package name */
        public String f25206f;

        /* renamed from: g, reason: collision with root package name */
        public SparseArray f25207g;

        /* renamed from: h, reason: collision with root package name */
        public float[] f25208h;

        public b(String str, SparseArray sparseArray) {
            this.f25206f = str.split(",")[1];
            this.f25207g = sparseArray;
        }

        @Override // v.j
        public void b(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // v.j
        public void d(int i10) {
            int size = this.f25207g.size();
            int iF = ((ConstraintAttribute) this.f25207g.valueAt(0)).f();
            double[] dArr = new double[size];
            this.f25208h = new float[iF];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iF);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = this.f25207g.keyAt(i11);
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f25207g.valueAt(i11);
                dArr[i11] = iKeyAt * 0.01d;
                constraintAttribute.d(this.f25208h);
                int i12 = 0;
                while (true) {
                    if (i12 < this.f25208h.length) {
                        dArr2[i11][i12] = r6[i12];
                        i12++;
                    }
                }
            }
            this.f24628a = v.b.a(i10, dArr, dArr2);
        }

        @Override // z.c
        public void g(View view, float f10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f24628a.e(f10, this.f25208h);
            ((ConstraintAttribute) this.f25207g.valueAt(0)).i(view, this.f25208h);
        }

        public void h(int i10, ConstraintAttribute constraintAttribute) {
            this.f25207g.append(i10, constraintAttribute);
        }
    }

    /* renamed from: z.c$c, reason: collision with other inner class name */
    public static class C0506c extends c {
        @Override // z.c
        public void g(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    public static class e extends c {
        @Override // z.c
        public void g(View view, float f10) {
            view.setPivotX(a(f10));
        }
    }

    public static class f extends c {
        @Override // z.c
        public void g(View view, float f10) {
            view.setPivotY(a(f10));
        }
    }

    public static class g extends c {

        /* renamed from: f, reason: collision with root package name */
        public boolean f25209f = false;

        @Override // z.c
        public void g(View view, float f10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
                return;
            }
            if (this.f25209f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f25209f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f10)));
                } catch (IllegalAccessException e10) {
                    Log.e("ViewSpline", "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e("ViewSpline", "unable to setProgress", e11);
                }
            }
        }
    }

    public static class h extends c {
        @Override // z.c
        public void g(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    public static class i extends c {
        @Override // z.c
        public void g(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    public static class j extends c {
        @Override // z.c
        public void g(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    public static class k extends c {
        @Override // z.c
        public void g(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    public static class l extends c {
        @Override // z.c
        public void g(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    public static class m extends c {
        @Override // z.c
        public void g(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    public static class n extends c {
        @Override // z.c
        public void g(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    public static class o extends c {
        @Override // z.c
        public void g(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public static c e(String str, SparseArray sparseArray) {
        return new b(str, sparseArray);
    }

    public static c f(String str) {
        str.getClass();
        switch (str) {
        }
        return new a();
    }

    public abstract void g(View view, float f10);

    public static class d extends c {
        public void h(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }

        @Override // z.c
        public void g(View view, float f10) {
        }
    }
}
