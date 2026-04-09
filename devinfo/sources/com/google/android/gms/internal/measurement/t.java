package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19929a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19930b;

    public /* synthetic */ t(Object obj, Object obj2) {
        this.f19929a = obj;
        this.f19930b = obj2;
    }

    public Object a() {
        Uri uri;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String string;
        i4 i4Var = (i4) this.f19929a;
        String str = (String) this.f19930b;
        Context context = (Context) i4Var.f19782c;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        pe.c cVar = x3.f20030a;
        if (contentResolver == null) {
            cVar.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (cVar) {
            try {
                if (((HashMap) cVar.f31751c) == null) {
                    ((AtomicBoolean) cVar.f31750b).set(false);
                    cVar.f31751c = new HashMap(16, 1.0f);
                    cVar.f31755h = new Object();
                    contentResolver.registerContentObserver(y3.f20044a, true, new a4(cVar));
                } else if (((AtomicBoolean) cVar.f31750b).getAndSet(false)) {
                    ((HashMap) cVar.f31751c).clear();
                    ((HashMap) cVar.f31752d).clear();
                    ((HashMap) cVar.f31753e).clear();
                    ((HashMap) cVar.f31754f).clear();
                    ((HashMap) cVar.g).clear();
                    cVar.f31755h = new Object();
                }
                Object obj = cVar.f31755h;
                String str2 = null;
                if (((HashMap) cVar.f31751c).containsKey(str)) {
                    String str3 = (String) ((HashMap) cVar.f31751c).get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return str2;
                }
                try {
                    uri = y3.f20044a;
                    contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                    } finally {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    }
                } catch (b4 unused) {
                }
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new b4("Unable to acquire ContentProviderClient");
                }
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                    try {
                        if (cursorQuery == null) {
                            throw new b4("ContentProvider query returned null cursor");
                        }
                        if (cursorQuery.moveToFirst()) {
                            string = cursorQuery.getString(1);
                            cursorQuery.close();
                        } else {
                            cursorQuery.close();
                            string = null;
                        }
                        if (string != null && string.equals(null)) {
                            string = null;
                        }
                        synchronized (cVar) {
                            try {
                                if (obj == cVar.f31755h) {
                                    ((HashMap) cVar.f31751c).put(str, string);
                                }
                            } finally {
                            }
                        }
                        if (string != null) {
                            return string;
                        }
                        return null;
                    } finally {
                    }
                } catch (RemoteException e2) {
                    throw new b4("ContentProvider query failed", e2);
                }
            } finally {
            }
        }
    }

    public void b(s sVar) {
        ArrayList arrayList = sVar.f19910a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((HashMap) this.f19929a).put(Integer.valueOf(((w) obj).f20017a).toString(), sVar);
        }
    }

    public n c(a0.x0 x0Var, n nVar) {
        com.bumptech.glide.c.F(x0Var);
        if (!(nVar instanceof o)) {
            return nVar;
        }
        o oVar = (o) nVar;
        ArrayList arrayList = oVar.f19850b;
        String str = oVar.f19849a;
        HashMap map = (HashMap) this.f19929a;
        return (map.containsKey(str) ? (s) map.get(str) : (s) this.f19930b).a(str, x0Var, arrayList);
    }

    public void d(a0.x0 x0Var, yb.e eVar) {
        v4 v4Var = new v4(eVar);
        TreeMap treeMap = (TreeMap) this.f19929a;
        for (Integer num : treeMap.keySet()) {
            b bVarClone = ((b) eVar.f37510c).clone();
            n nVarB = ((m) treeMap.get(num)).b(x0Var, Collections.singletonList(v4Var));
            int iB = nVarB instanceof g ? com.bumptech.glide.c.B(((g) nVarB).f19747a.doubleValue()) : -1;
            if (iB == 2 || iB == -1) {
                eVar.f37510c = bVarClone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f19930b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            n nVarB2 = ((m) treeMap2.get((Integer) it.next())).b(x0Var, Collections.singletonList(v4Var));
            if (nVarB2 instanceof g) {
                com.bumptech.glide.c.B(((g) nVarB2).f19747a.doubleValue());
            }
        }
    }

    public t(int i4) {
        switch (i4) {
            case 3:
                this.f19929a = new TreeMap();
                this.f19930b = new TreeMap();
                break;
            default:
                this.f19929a = new HashMap();
                this.f19930b = new s(6);
                s sVar = new s(0);
                w wVar = w.BITWISE_AND;
                ArrayList arrayList = sVar.f19910a;
                arrayList.add(wVar);
                arrayList.add(w.BITWISE_LEFT_SHIFT);
                arrayList.add(w.BITWISE_NOT);
                arrayList.add(w.BITWISE_OR);
                arrayList.add(w.BITWISE_RIGHT_SHIFT);
                arrayList.add(w.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(w.BITWISE_XOR);
                b(sVar);
                s sVar2 = new s(1);
                w wVar2 = w.EQUALS;
                ArrayList arrayList2 = sVar2.f19910a;
                arrayList2.add(wVar2);
                arrayList2.add(w.GREATER_THAN);
                arrayList2.add(w.GREATER_THAN_EQUALS);
                arrayList2.add(w.IDENTITY_EQUALS);
                arrayList2.add(w.IDENTITY_NOT_EQUALS);
                arrayList2.add(w.LESS_THAN);
                arrayList2.add(w.LESS_THAN_EQUALS);
                arrayList2.add(w.NOT_EQUALS);
                b(sVar2);
                s sVar3 = new s(2);
                w wVar3 = w.APPLY;
                ArrayList arrayList3 = sVar3.f19910a;
                arrayList3.add(wVar3);
                arrayList3.add(w.BLOCK);
                arrayList3.add(w.BREAK);
                arrayList3.add(w.CASE);
                arrayList3.add(w.DEFAULT);
                arrayList3.add(w.CONTINUE);
                arrayList3.add(w.DEFINE_FUNCTION);
                arrayList3.add(w.FN);
                arrayList3.add(w.IF);
                arrayList3.add(w.QUOTE);
                arrayList3.add(w.RETURN);
                arrayList3.add(w.SWITCH);
                arrayList3.add(w.TERNARY);
                b(sVar3);
                s sVar4 = new s(3);
                w wVar4 = w.AND;
                ArrayList arrayList4 = sVar4.f19910a;
                arrayList4.add(wVar4);
                arrayList4.add(w.NOT);
                arrayList4.add(w.OR);
                b(sVar4);
                s sVar5 = new s(4);
                w wVar5 = w.FOR_IN;
                ArrayList arrayList5 = sVar5.f19910a;
                arrayList5.add(wVar5);
                arrayList5.add(w.FOR_IN_CONST);
                arrayList5.add(w.FOR_IN_LET);
                arrayList5.add(w.FOR_LET);
                arrayList5.add(w.FOR_OF);
                arrayList5.add(w.FOR_OF_CONST);
                arrayList5.add(w.FOR_OF_LET);
                arrayList5.add(w.WHILE);
                b(sVar5);
                s sVar6 = new s(5);
                w wVar6 = w.ADD;
                ArrayList arrayList6 = sVar6.f19910a;
                arrayList6.add(wVar6);
                arrayList6.add(w.DIVIDE);
                arrayList6.add(w.MODULUS);
                arrayList6.add(w.MULTIPLY);
                arrayList6.add(w.NEGATE);
                arrayList6.add(w.POST_DECREMENT);
                arrayList6.add(w.POST_INCREMENT);
                arrayList6.add(w.PRE_DECREMENT);
                arrayList6.add(w.PRE_INCREMENT);
                arrayList6.add(w.SUBTRACT);
                b(sVar6);
                s sVar7 = new s(7);
                w wVar7 = w.ASSIGN;
                ArrayList arrayList7 = sVar7.f19910a;
                arrayList7.add(wVar7);
                arrayList7.add(w.CONST);
                arrayList7.add(w.CREATE_ARRAY);
                arrayList7.add(w.CREATE_OBJECT);
                arrayList7.add(w.EXPRESSION_LIST);
                arrayList7.add(w.GET);
                arrayList7.add(w.GET_INDEX);
                arrayList7.add(w.GET_PROPERTY);
                arrayList7.add(w.NULL);
                arrayList7.add(w.SET_PROPERTY);
                arrayList7.add(w.TYPEOF);
                arrayList7.add(w.UNDEFINED);
                arrayList7.add(w.VAR);
                b(sVar7);
                break;
        }
    }
}
