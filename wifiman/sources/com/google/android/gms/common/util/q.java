package com.google.android.gms.common.util;

import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static final int f34886a = Process.myUid();

    /* renamed from: b, reason: collision with root package name */
    private static final Method f34887b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f34888c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f34889d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f34890e;

    /* renamed from: f, reason: collision with root package name */
    private static final Method f34891f;

    /* renamed from: g, reason: collision with root package name */
    private static final Method f34892g;

    /* renamed from: h, reason: collision with root package name */
    private static final Method f34893h;

    /* renamed from: i, reason: collision with root package name */
    private static final Method f34894i;

    /* renamed from: j, reason: collision with root package name */
    private static Boolean f34895j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f34887b = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f34888c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f34889d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        f34890e = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
            method5 = null;
        }
        f34891f = method5;
        if (k.e()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
            }
        } else {
            method6 = null;
        }
        f34892g = method6;
        if (k.e()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e11) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
            }
        } else {
            method7 = null;
        }
        f34893h = method7;
        if (k.e()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
        } else {
            method8 = null;
        }
        f34894i = method8;
        f34895j = null;
    }

    public static boolean a(WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f34894i;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                AbstractC7901p.l(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
        }
        return b(workSource) == 0;
    }

    public static int b(WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f34889d;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, null);
            AbstractC7901p.l(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e10) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            return 0;
        }
    }
}
