package com.mbridge.msdk.config.dynamic.baseview.touch;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private float f13934a;

    /* renamed from: b, reason: collision with root package name */
    private float f13935b;

    /* renamed from: c, reason: collision with root package name */
    private float f13936c;

    /* renamed from: d, reason: collision with root package name */
    private float f13937d;

    /* renamed from: e, reason: collision with root package name */
    private float f13938e;

    /* renamed from: f, reason: collision with root package name */
    private float f13939f;

    /* renamed from: g, reason: collision with root package name */
    private long f13940g;

    /* renamed from: h, reason: collision with root package name */
    private long f13941h;

    /* renamed from: i, reason: collision with root package name */
    private float f13942i;

    /* renamed from: j, reason: collision with root package name */
    private float f13943j;

    /* renamed from: k, reason: collision with root package name */
    private float f13944k;

    /* renamed from: l, reason: collision with root package name */
    private int f13945l;

    /* renamed from: m, reason: collision with root package name */
    private int f13946m;

    /* renamed from: n, reason: collision with root package name */
    private int f13947n;

    /* renamed from: o, reason: collision with root package name */
    private View f13948o;

    /* renamed from: p, reason: collision with root package name */
    private final List<C0247a> f13949p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    private int f13950q = 0;

    /* renamed from: com.mbridge.msdk.config.dynamic.baseview.touch.a$a, reason: collision with other inner class name */
    public static class C0247a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13951a;

        /* renamed from: b, reason: collision with root package name */
        public final float f13952b;

        /* renamed from: c, reason: collision with root package name */
        public final float f13953c;

        /* renamed from: d, reason: collision with root package name */
        public final float f13954d;

        /* renamed from: e, reason: collision with root package name */
        public final float f13955e;

        /* renamed from: f, reason: collision with root package name */
        public final float f13956f;

        /* renamed from: g, reason: collision with root package name */
        public final int f13957g;

        public C0247a(int i10, float f10, float f11, float f12, float f13, float f14, int i11) {
            this.f13951a = i10;
            this.f13952b = f10;
            this.f13953c = f11;
            this.f13954d = f12;
            this.f13955e = f13;
            this.f13956f = f14;
            this.f13957g = i11;
        }
    }

    private float a(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawX(motionEvent.getActionIndex()) : motionEvent.getRawX();
    }

    private float b(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawY(motionEvent.getActionIndex()) : motionEvent.getRawY();
    }

    private void g(MotionEvent motionEvent) {
        this.f13949p.clear();
        if (Build.VERSION.SDK_INT < 29) {
            this.f13950q = 1;
            this.f13949p.add(new C0247a(motionEvent.getPointerId(0), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getOrientation(), motionEvent.getToolType(motionEvent.getActionIndex())));
        } else {
            this.f13950q = motionEvent.getPointerCount();
            for (int i10 = 0; i10 < this.f13950q; i10++) {
                this.f13949p.add(new C0247a(motionEvent.getPointerId(i10), motionEvent.getRawX(i10), motionEvent.getRawY(i10), motionEvent.getPressure(i10), motionEvent.getSize(i10), motionEvent.getOrientation(i10), motionEvent.getToolType(i10)));
            }
        }
    }

    private void h(MotionEvent motionEvent) {
        this.f13942i = motionEvent.getPressure();
        this.f13943j = motionEvent.getSize();
        this.f13944k = motionEvent.getOrientation();
        this.f13945l = motionEvent.getToolType(motionEvent.getActionIndex());
    }

    public void c(MotionEvent motionEvent) {
        g(motionEvent);
    }

    public void d(MotionEvent motionEvent) {
        this.f13934a = a(motionEvent);
        this.f13935b = b(motionEvent);
        this.f13940g = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public void e(MotionEvent motionEvent) {
        this.f13936c = a(motionEvent);
        this.f13937d = b(motionEvent);
        h(motionEvent);
        g(motionEvent);
    }

    public void f(MotionEvent motionEvent) {
        this.f13938e = a(motionEvent);
        this.f13939f = b(motionEvent);
        this.f13941h = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public void c(View view) {
        this.f13948o = view;
        this.f13946m = view.getWidth();
        this.f13947n = view.getHeight();
    }

    private void b(HashMap<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        for (C0247a c0247a : this.f13949p) {
            HashMap map2 = new HashMap();
            map2.put("x", String.valueOf(c0247a.f13952b));
            map2.put("y", String.valueOf(c0247a.f13953c));
            map2.put("pressure", String.valueOf(c0247a.f13954d));
            map2.put("size", String.valueOf(c0247a.f13955e));
            map2.put("id", Integer.valueOf(c0247a.f13951a));
            arrayList.add(map2);
        }
        map.put("points", arrayList);
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> map = new HashMap<>();
        a(map);
        b(map);
        d(map);
        c(map);
        return map;
    }

    private void c(HashMap<String, Object> map) {
        map.put("down_x", Float.valueOf(this.f13934a));
        map.put("down_y", Float.valueOf(this.f13935b));
        map.put("down_time", Long.valueOf(this.f13940g));
        map.put("up_x", Float.valueOf(this.f13938e));
        map.put("up_y", Float.valueOf(this.f13939f));
        map.put("up_time", Long.valueOf(this.f13941h));
    }

    private void d(HashMap<String, Object> map) {
        View view = this.f13948o;
        if (view != null) {
            map.put("class_name", view.getClass().getSimpleName());
            String strB = b(this.f13948o);
            map.put("resource_id", strB);
            String strA = a(this.f13948o);
            map.put("content_desc", strA);
            map.put("view_format", String.format("%s#%s(%s)", this.f13948o.getClass().getSimpleName(), strB, strA));
        }
    }

    private void a(HashMap<String, Object> map) {
        map.put("event_name", "touch");
        map.put("event_time", String.valueOf(System.currentTimeMillis()));
        map.put("down_time", String.valueOf(this.f13940g));
    }

    public void c() {
        this.f13939f = 0.0f;
        this.f13938e = 0.0f;
        this.f13937d = 0.0f;
        this.f13936c = 0.0f;
        this.f13935b = 0.0f;
        this.f13934a = 0.0f;
        this.f13941h = 0L;
        this.f13940g = 0L;
        this.f13944k = 0.0f;
        this.f13943j = 0.0f;
        this.f13942i = 0.0f;
        this.f13945l = 0;
        this.f13947n = 0;
        this.f13946m = 0;
        this.f13948o = null;
        this.f13950q = 0;
        this.f13949p.clear();
    }

    private String a(View view) {
        CharSequence contentDescription = view.getContentDescription();
        return contentDescription != null ? contentDescription.toString() : "";
    }

    private String b(View view) {
        if (view.getId() != -1) {
            try {
                return view.getResources().getResourceEntryName(view.getId());
            } catch (Exception unused) {
                return String.valueOf(view.getId());
            }
        }
        return "";
    }

    public C0247a b() {
        if (this.f13949p.isEmpty()) {
            return null;
        }
        return this.f13949p.get(0);
    }
}
