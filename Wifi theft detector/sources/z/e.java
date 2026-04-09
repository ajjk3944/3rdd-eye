package z;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import v.o;

/* loaded from: classes.dex */
public abstract class e extends o {

    public static class a extends e {
        @Override // z.e
        public boolean h(View view, float f10, long j10, v.d dVar) {
            view.setAlpha(e(f10, j10, view, dVar));
            return this.f24668h;
        }
    }

    public static class b extends e {

        /* renamed from: l, reason: collision with root package name */
        public String f25210l;

        /* renamed from: m, reason: collision with root package name */
        public SparseArray f25211m;

        /* renamed from: n, reason: collision with root package name */
        public SparseArray f25212n = new SparseArray();

        /* renamed from: o, reason: collision with root package name */
        public float[] f25213o;

        /* renamed from: p, reason: collision with root package name */
        public float[] f25214p;

        public b(String str, SparseArray sparseArray) {
            this.f25210l = str.split(",")[1];
            this.f25211m = sparseArray;
        }

        @Override // v.o
        public void d(int i10) {
            int size = this.f25211m.size();
            int iF = ((ConstraintAttribute) this.f25211m.valueAt(0)).f();
            double[] dArr = new double[size];
            int i11 = iF + 2;
            this.f25213o = new float[i11];
            this.f25214p = new float[iF];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = this.f25211m.keyAt(i12);
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f25211m.valueAt(i12);
                float[] fArr = (float[]) this.f25212n.valueAt(i12);
                dArr[i12] = iKeyAt * 0.01d;
                constraintAttribute.d(this.f25213o);
                int i13 = 0;
                while (true) {
                    if (i13 < this.f25213o.length) {
                        dArr2[i12][i13] = r8[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iF] = fArr[0];
                dArr3[iF + 1] = fArr[1];
            }
            this.f24661a = v.b.a(i10, dArr, dArr2);
        }

        @Override // z.e
        public boolean h(View view, float f10, long j10, v.d dVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f24661a.e(f10, this.f25213o);
            float[] fArr = this.f25213o;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f24669i;
            if (Float.isNaN(this.f24670j)) {
                float fA = dVar.a(view, this.f25210l, 0);
                this.f24670j = fA;
                if (Float.isNaN(fA)) {
                    this.f24670j = 0.0f;
                }
            }
            float f13 = (float) ((this.f24670j + ((j11 * 1.0E-9d) * f11)) % 1.0d);
            this.f24670j = f13;
            this.f24669i = j10;
            float fA2 = a(f13);
            this.f24668h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f25214p;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f24668h;
                float f14 = this.f25213o[i10];
                this.f24668h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA2) + f12;
                i10++;
            }
            ((ConstraintAttribute) this.f25211m.valueAt(0)).i(view, this.f25214p);
            if (f11 != 0.0f) {
                this.f24668h = true;
            }
            return this.f24668h;
        }
    }

    public static class c extends e {
        @Override // z.e
        public boolean h(View view, float f10, long j10, v.d dVar) {
            view.setElevation(e(f10, j10, view, dVar));
            return this.f24668h;
        }
    }

    public static class d extends e {
        @Override // z.e
        public boolean h(View view, float f10, long j10, v.d dVar) {
            return this.f24668h;
        }

        public boolean i(View view, v.d dVar, float f10, long j10, double d10, double d11) {
            view.setRotation(e(f10, j10, view, dVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f24668h;
        }
    }

    /* renamed from: z.e$e, reason: collision with other inner class name */
    public static class C0507e extends e {

        /* renamed from: l, reason: collision with root package name */
        public boolean f25215l = false;

        @Override // z.e
        public boolean h(View view, float f10, long j10, v.d dVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            C0507e c0507e;
            Method method;
            if (view instanceof MotionLayout) {
                c0507e = this;
                ((MotionLayout) view).setProgress(e(f10, j10, view, dVar));
            } else {
                c0507e = this;
                if (c0507e.f25215l) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    c0507e.f25215l = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(c0507e.e(f10, j10, view, dVar)));
                    } catch (IllegalAccessException e10) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e11);
                    }
                }
            }
            return c0507e.f24668h;
        }
    }

    public static class f extends e {
        @Override // z.e
        public boolean h(View view, float f10, long j10, v.d dVar) {
            view.setRotation(e(f10, j10, view, dVar));
            return this.f24668h;
        }
    }

    public static class g extends e {
        @Override // z.e
        public boolean h(View view, float f10, long j10, v.d dVar) {
            view.setRotationX(e(f10, j10, view, dVar));
            return this.f24668h;
        }
    }

    public static class h extends e {
        @Override // z.e
        public boolean h(View view, float f10, long j10, v.d dVar) {
            view.setRotationY(e(f10, j10, view, dVar));
            return this.f24668h;
        }
    }

    public static class i extends e {
        @Override // z.e
        public boolean h(View view, float f10, long j10, v.d dVar) {
            view.setScaleX(e(f10, j10, view, dVar));
            return this.f24668h;
        }
    }

    public static class j extends e {
        @Override // z.e
        public boolean h(View view, float f10, long j10, v.d dVar) {
            view.setScaleY(e(f10, j10, view, dVar));
            return this.f24668h;
        }
    }

    public static class k extends e {
        @Override // z.e
        public boolean h(View view, float f10, long j10, v.d dVar) {
            view.setTranslationX(e(f10, j10, view, dVar));
            return this.f24668h;
        }
    }

    public static class l extends e {
        @Override // z.e
        public boolean h(View view, float f10, long j10, v.d dVar) {
            view.setTranslationY(e(f10, j10, view, dVar));
            return this.f24668h;
        }
    }

    public static class m extends e {
        @Override // z.e
        public boolean h(View view, float f10, long j10, v.d dVar) {
            view.setTranslationZ(e(f10, j10, view, dVar));
            return this.f24668h;
        }
    }

    public static e f(String str, SparseArray sparseArray) {
        return new b(str, sparseArray);
    }

    public static e g(String str, long j10) {
        e gVar;
        str.getClass();
        switch (str) {
            case "rotationX":
                gVar = new g();
                break;
            case "rotationY":
                gVar = new h();
                break;
            case "translationX":
                gVar = new k();
                break;
            case "translationY":
                gVar = new l();
                break;
            case "translationZ":
                gVar = new m();
                break;
            case "progress":
                gVar = new C0507e();
                break;
            case "scaleX":
                gVar = new i();
                break;
            case "scaleY":
                gVar = new j();
                break;
            case "rotation":
                gVar = new f();
                break;
            case "elevation":
                gVar = new c();
                break;
            case "transitionPathRotate":
                gVar = new d();
                break;
            case "alpha":
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.b(j10);
        return gVar;
    }

    public float e(float f10, long j10, View view, v.d dVar) {
        this.f24661a.e(f10, this.f24667g);
        float[] fArr = this.f24667g;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f24668h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f24670j)) {
            float fA = dVar.a(view, this.f24666f, 0);
            this.f24670j = fA;
            if (Float.isNaN(fA)) {
                this.f24670j = 0.0f;
            }
        }
        float f12 = (float) ((this.f24670j + (((j10 - this.f24669i) * 1.0E-9d) * f11)) % 1.0d);
        this.f24670j = f12;
        dVar.b(view, this.f24666f, 0, f12);
        this.f24669i = j10;
        float f13 = this.f24667g[0];
        float fA2 = (a(this.f24670j) * f13) + this.f24667g[2];
        this.f24668h = (f13 == 0.0f && f11 == 0.0f) ? false : true;
        return fA2;
    }

    public abstract boolean h(View view, float f10, long j10, v.d dVar);
}
