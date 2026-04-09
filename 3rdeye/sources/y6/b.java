package y6;

import android.content.res.Resources;
import android.util.TypedValue;
import b9.C1992A;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PrimitiveResourceCache.kt */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<Integer, Boolean> f48189b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap<Integer, Float> f48190c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap<Integer, Integer> f48191d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap<Integer, Integer> f48192e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap<Integer, Integer> f48193f;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f48194g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f48195h;

    public b(Resources resources) {
        super(resources);
        this.f48189b = new ConcurrentHashMap<>();
        this.f48190c = new ConcurrentHashMap<>();
        this.f48191d = new ConcurrentHashMap<>();
        this.f48192e = new ConcurrentHashMap<>();
        this.f48193f = new ConcurrentHashMap<>();
        this.f48194g = new TypedValue();
        this.f48195h = new Object();
    }

    public final TypedValue a() {
        TypedValue typedValue;
        synchronized (this.f48195h) {
            try {
                typedValue = this.f48194g;
                if (typedValue != null) {
                    this.f48194g = null;
                } else {
                    typedValue = null;
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return typedValue == null ? new TypedValue() : typedValue;
    }

    public final void b(TypedValue typedValue) {
        synchronized (this.f48195h) {
            try {
                if (this.f48194g == null) {
                    this.f48194g = typedValue;
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.res.Resources
    public final boolean getBoolean(int i) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.f48189b;
        Boolean bool = concurrentHashMap.get(Integer.valueOf(i));
        if (bool == null) {
            TypedValue typedValueA = a();
            boolean z10 = true;
            try {
                getValue(i, typedValueA, true);
                int i10 = typedValueA.type;
                if (i10 < 16 || i10 > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValueA.type) + " is not valid");
                }
                if (typedValueA.data == 0) {
                    z10 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z10);
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), boolValueOf);
                }
                b(typedValueA);
                bool = boolValueOf;
            } catch (Throwable th) {
                b(typedValueA);
                throw th;
            }
        }
        return bool.booleanValue();
    }

    @Override // android.content.res.Resources
    public final float getDimension(int i) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Float> concurrentHashMap = this.f48190c;
        Float f10 = concurrentHashMap.get(Integer.valueOf(i));
        if (f10 == null) {
            TypedValue typedValueA = a();
            try {
                getValue(i, typedValueA, true);
                if (typedValueA.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValueA.type) + " is not valid");
                }
                Float fValueOf = Float.valueOf(TypedValue.complexToDimension(typedValueA.data, this.f48196a.getDisplayMetrics()));
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), fValueOf);
                }
                b(typedValueA);
                f10 = fValueOf;
            } catch (Throwable th) {
                b(typedValueA);
                throw th;
            }
        }
        return f10.floatValue();
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f48191d;
        Integer num = concurrentHashMap.get(Integer.valueOf(i));
        if (num == null) {
            TypedValue typedValueA = a();
            try {
                getValue(i, typedValueA, true);
                if (typedValueA.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValueA.type) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(TypedValue.complexToDimensionPixelOffset(typedValueA.data, this.f48196a.getDisplayMetrics()));
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), numValueOf);
                }
                b(typedValueA);
                num = numValueOf;
            } catch (Throwable th) {
                b(typedValueA);
                throw th;
            }
        }
        return num.intValue();
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f48192e;
        Integer num = concurrentHashMap.get(Integer.valueOf(i));
        if (num == null) {
            TypedValue typedValueA = a();
            try {
                getValue(i, typedValueA, true);
                if (typedValueA.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValueA.type) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(TypedValue.complexToDimensionPixelSize(typedValueA.data, this.f48196a.getDisplayMetrics()));
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), numValueOf);
                }
                b(typedValueA);
                num = numValueOf;
            } catch (Throwable th) {
                b(typedValueA);
                throw th;
            }
        }
        return num.intValue();
    }

    @Override // android.content.res.Resources
    public final int getInteger(int i) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f48193f;
        Integer num = concurrentHashMap.get(Integer.valueOf(i));
        if (num == null) {
            TypedValue typedValueA = a();
            try {
                getValue(i, typedValueA, true);
                int i10 = typedValueA.type;
                if (i10 < 16 || i10 > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValueA.type) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(typedValueA.data);
                if (typedValueA.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), numValueOf);
                }
                b(typedValueA);
                num = numValueOf;
            } catch (Throwable th) {
                b(typedValueA);
                throw th;
            }
        }
        return num.intValue();
    }
}
