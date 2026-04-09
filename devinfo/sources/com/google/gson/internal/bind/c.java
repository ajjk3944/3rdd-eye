package com.google.gson.internal.bind;

import com.google.gson.m;
import com.google.gson.w;
import d.h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f20800a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f20801b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20802c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Method f20803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f20804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f20805f;
    public final /* synthetic */ boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f20806h;

    public c(String str, Field field, Method method, w wVar, w wVar2, boolean z3, boolean z10) {
        this.f20803d = method;
        this.f20804e = wVar;
        this.f20805f = wVar2;
        this.g = z3;
        this.f20806h = z10;
        this.f20800a = str;
        this.f20801b = field;
        this.f20802c = field.getName();
    }

    public final void a(yf.c cVar, Object obj) {
        Object objInvoke;
        Method method = this.f20803d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e2) {
                throw new m(h.t("Accessor ", wf.c.d(method, false), " threw exception"), e2.getCause());
            }
        } else {
            objInvoke = this.f20801b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        cVar.w(this.f20800a);
        this.f20804e.c(cVar, objInvoke);
    }
}
