package N2;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.I;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import t4.C5606d;

/* compiled from: DataCacheWriter.java */
/* loaded from: classes.dex */
public final class g implements Z2.b, com.google.gson.internal.g, I.c {

    /* renamed from: b, reason: collision with root package name */
    public final Object f4484b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4485c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4486d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3) {
        this.f4484b = obj;
        this.f4485c = obj2;
        this.f4486d = obj3;
    }

    @Override // Z2.b
    public u c(u uVar, L2.h hVar) {
        Drawable drawable = (Drawable) uVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((Z2.a) this.f4485c).c(U2.e.b((O2.b) this.f4484b, ((BitmapDrawable) drawable).getBitmap()), hVar);
        }
        if (drawable instanceof Y2.c) {
            return ((C5606d) this.f4486d).c(uVar, hVar);
        }
        return null;
    }

    @Override // com.google.gson.internal.g
    public Object n() {
        try {
            return ((com.google.gson.internal.m) this.f4484b).b((Class) this.f4485c);
        } catch (Exception e4) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + ((Type) this.f4486d) + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e4);
        }
    }

    @Override // I.c
    public void onFailure(Throwable th) {
        ((androidx.camera.view.a) this.f4486d).f15175e = null;
        ArrayList arrayList = (ArrayList) this.f4484b;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((I) ((C.r) this.f4485c)).n((AbstractC1707p) it.next());
        }
        arrayList.clear();
    }

    @Override // I.c
    public void onSuccess(Object obj) {
        ((androidx.camera.view.a) this.f4486d).f15175e = null;
    }

    public g(androidx.camera.view.a aVar, ArrayList arrayList, C.r rVar) {
        this.f4486d = aVar;
        this.f4484b = arrayList;
        this.f4485c = rVar;
    }

    public g(Class cls, Type type) throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        Object lVar;
        this.f4485c = cls;
        this.f4486d = type;
        try {
            try {
                try {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    lVar = new com.google.gson.internal.i(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    lVar = new com.google.gson.internal.j(iIntValue, declaredMethod2);
                }
            } catch (Exception unused2) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                lVar = new com.google.gson.internal.k(declaredMethod3);
            }
        } catch (Exception unused3) {
            lVar = new com.google.gson.internal.l();
        }
        this.f4484b = lVar;
    }
}
