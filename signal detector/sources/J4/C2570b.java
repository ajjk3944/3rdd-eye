package j4;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import o4.C2762a;
import o4.C2764c;

/* renamed from: j4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2570b extends g4.z {

    /* renamed from: c, reason: collision with root package name */
    public static final C2569a f21382c = new C2569a();

    /* renamed from: a, reason: collision with root package name */
    public final Class f21383a;

    /* renamed from: b, reason: collision with root package name */
    public final C2581m f21384b;

    public C2570b(g4.m mVar, g4.z zVar, Class cls) {
        this.f21384b = new C2581m(mVar, zVar, cls);
        this.f21383a = cls;
    }

    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c2762a.a();
        while (c2762a.o()) {
            arrayList.add(this.f21384b.f21431c.b(c2762a));
        }
        c2762a.h();
        int size = arrayList.size();
        Class cls = this.f21383a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            c2764c.o();
            return;
        }
        c2764c.b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f21384b.c(c2764c, Array.get(obj, i));
        }
        c2764c.h();
    }
}
