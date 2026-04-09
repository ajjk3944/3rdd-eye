package h1;

import g1.AbstractC5849g;
import g1.C5847e;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class d extends C5847e {

    /* renamed from: q0, reason: collision with root package name */
    protected float f48340q0;

    /* renamed from: r0, reason: collision with root package name */
    protected HashMap f48341r0;

    /* renamed from: s0, reason: collision with root package name */
    protected HashMap f48342s0;

    /* renamed from: t0, reason: collision with root package name */
    protected HashMap f48343t0;

    /* renamed from: u0, reason: collision with root package name */
    private HashMap f48344u0;

    /* renamed from: v0, reason: collision with root package name */
    private HashMap f48345v0;

    /* renamed from: w0, reason: collision with root package name */
    protected AbstractC5849g.a f48346w0;

    public d(AbstractC5849g abstractC5849g, AbstractC5849g.d dVar) {
        super(abstractC5849g, dVar);
        this.f48340q0 = 0.5f;
        this.f48341r0 = new HashMap();
        this.f48342s0 = new HashMap();
        this.f48343t0 = new HashMap();
        this.f48346w0 = AbstractC5849g.a.SPREAD;
    }

    float A0(String str) {
        HashMap map = this.f48344u0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.f48344u0.get(str)).floatValue();
    }

    protected float B0(String str) {
        if (this.f48342s0.containsKey(str)) {
            return ((Float) this.f48342s0.get(str)).floatValue();
        }
        return 0.0f;
    }

    protected float C0(String str) {
        if (this.f48341r0.containsKey(str)) {
            return ((Float) this.f48341r0.get(str)).floatValue();
        }
        return -1.0f;
    }

    public d D0(AbstractC5849g.a aVar) {
        this.f48346w0 = aVar;
        return this;
    }

    public void w0(Object obj, float f10, float f11, float f12, float f13, float f14) {
        super.s0(obj);
        String string = obj.toString();
        if (!Float.isNaN(f10)) {
            this.f48341r0.put(string, Float.valueOf(f10));
        }
        if (!Float.isNaN(f11)) {
            this.f48342s0.put(string, Float.valueOf(f11));
        }
        if (!Float.isNaN(f12)) {
            this.f48343t0.put(string, Float.valueOf(f12));
        }
        if (!Float.isNaN(f13)) {
            if (this.f48344u0 == null) {
                this.f48344u0 = new HashMap();
            }
            this.f48344u0.put(string, Float.valueOf(f13));
        }
        if (Float.isNaN(f14)) {
            return;
        }
        if (this.f48345v0 == null) {
            this.f48345v0 = new HashMap();
        }
        this.f48345v0.put(string, Float.valueOf(f14));
    }

    public d x0(float f10) {
        this.f48340q0 = f10;
        return this;
    }

    float y0(String str) {
        HashMap map = this.f48345v0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.f48345v0.get(str)).floatValue();
    }

    protected float z0(String str) {
        if (this.f48343t0.containsKey(str)) {
            return ((Float) this.f48343t0.get(str)).floatValue();
        }
        return 0.0f;
    }
}
