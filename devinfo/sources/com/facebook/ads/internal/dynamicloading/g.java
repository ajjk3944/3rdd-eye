package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f8924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8925c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HashMap f8927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8928f;
    public final /* synthetic */ ArrayList g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Method f8929h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Method f8930i;

    public g(ArrayList arrayList, HashMap map, ArrayList arrayList2, ArrayList arrayList3, HashMap map2, ArrayList arrayList4, ArrayList arrayList5, Method method, Method method2) {
        this.f8923a = arrayList;
        this.f8924b = map;
        this.f8925c = arrayList2;
        this.f8926d = arrayList3;
        this.f8927e = map2;
        this.f8928f = arrayList4;
        this.g = arrayList5;
        this.f8929h = method;
        this.f8930i = method2;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        HashMap map;
        boolean zIsPrimitive = method.getReturnType().isPrimitive();
        HashMap map2 = this.f8924b;
        int i4 = 0;
        if (zIsPrimitive) {
            if (!method.getReturnType().equals(Void.TYPE)) {
                return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
            }
            ArrayList arrayList = this.f8923a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                if (DynamicLoaderFallback.equalsMethods(method, (Method) obj2) && DynamicLoaderFallback.reportError(obj, map2)) {
                    break;
                }
            }
            ArrayList arrayList2 = this.f8925c;
            int size2 = arrayList2.size();
            while (i4 < size2) {
                Object obj3 = arrayList2.get(i4);
                i4++;
                if (DynamicLoaderFallback.equalsMethods(method, (Method) obj3) && DynamicLoaderFallback.reportError(obj, map2)) {
                    return null;
                }
            }
            return null;
        }
        if (method.getReturnType().equals(String.class)) {
            return "";
        }
        Object objNewProxyInstance = method.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
        ArrayList arrayList3 = this.f8926d;
        int size3 = arrayList3.size();
        int i11 = 0;
        while (true) {
            map = this.f8927e;
            if (i11 >= size3) {
                break;
            }
            Object obj4 = arrayList3.get(i11);
            i11++;
            if (DynamicLoaderFallback.equalsMethods(method, (Method) obj4)) {
                DynamicLoaderFallback.sApiProxyToAdListenersMap.put(map.get(obj), (AdListener) objArr[0]);
                break;
            }
        }
        ArrayList arrayList4 = this.f8928f;
        int size4 = arrayList4.size();
        int i12 = 0;
        while (i12 < size4) {
            Object obj5 = arrayList4.get(i12);
            i12++;
            if (DynamicLoaderFallback.equalsMethods(method, (Method) obj5)) {
                map.put(objNewProxyInstance, obj);
            }
        }
        ArrayList arrayList5 = this.g;
        int size5 = arrayList5.size();
        int i13 = 0;
        while (i13 < size5) {
            Object obj6 = arrayList5.get(i13);
            i13++;
            if (DynamicLoaderFallback.equalsMethods(method, (Method) obj6)) {
                for (Object obj7 : objArr) {
                    if (obj7 instanceof Ad) {
                        map2.put(objNewProxyInstance, (Ad) obj7);
                    }
                }
            }
        }
        if (DynamicLoaderFallback.equalsMethods(method, this.f8929h)) {
            map2.put(objArr[1], (Ad) objArr[0]);
        }
        if (DynamicLoaderFallback.equalsMethods(method, this.f8930i)) {
            map2.put(objArr[1], (Ad) objArr[0]);
        }
        return objNewProxyInstance;
    }
}
