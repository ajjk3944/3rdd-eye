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

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5206a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5207b;

    public /* synthetic */ t(Object obj, Object obj2) {
        this.f5206a = obj;
        this.f5207b = obj2;
    }

    public Object a() {
        Uri uri;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String string;
        h4 h4Var = (h4) this.f5206a;
        String str = (String) this.f5207b;
        Context context = (Context) h4Var.f5056d;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        p.v2 v2Var = w3.f5244a;
        if (contentResolver == null) {
            v2Var.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (v2Var) {
            try {
                if (((HashMap) v2Var.f20202g) == null) {
                    ((AtomicBoolean) v2Var.f20201d).set(false);
                    v2Var.f20202g = new HashMap(16, 1.0f);
                    v2Var.D = new Object();
                    contentResolver.registerContentObserver(x3.f5255a, true, new z3(v2Var));
                } else if (((AtomicBoolean) v2Var.f20201d).getAndSet(false)) {
                    ((HashMap) v2Var.f20202g).clear();
                    ((HashMap) v2Var.f20203r).clear();
                    ((HashMap) v2Var.f20204x).clear();
                    ((HashMap) v2Var.f20205y).clear();
                    ((HashMap) v2Var.B).clear();
                    v2Var.D = new Object();
                }
                Object obj = v2Var.D;
                String str2 = null;
                if (((HashMap) v2Var.f20202g).containsKey(str)) {
                    String str3 = (String) ((HashMap) v2Var.f20202g).get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return str2;
                }
                try {
                    uri = x3.f5255a;
                    contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                    } finally {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    }
                } catch (a4 unused) {
                }
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new a4("Unable to acquire ContentProviderClient");
                }
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                    try {
                        if (cursorQuery == null) {
                            throw new a4("ContentProvider query returned null cursor");
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
                        synchronized (v2Var) {
                            try {
                                if (obj == v2Var.D) {
                                    ((HashMap) v2Var.f20202g).put(str, string);
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
                } catch (RemoteException e4) {
                    throw new a4("ContentProvider query failed", e4);
                }
            } finally {
            }
        }
    }

    public void b(s sVar) {
        Iterator it = sVar.f5187a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f5206a).put(((w) it.next()).zzb().toString(), sVar);
        }
    }

    public n c(kg.r rVar, n nVar) {
        a.a.S(rVar);
        if (!(nVar instanceof o)) {
            return nVar;
        }
        o oVar = (o) nVar;
        ArrayList arrayList = oVar.f5146d;
        String str = oVar.f5145a;
        HashMap map = (HashMap) this.f5206a;
        return (map.containsKey(str) ? (s) map.get(str) : (s) this.f5207b).a(str, rVar, arrayList);
    }

    public void d(kg.r rVar, bm.d dVar) {
        w4 w4Var = new w4(dVar);
        TreeMap treeMap = (TreeMap) this.f5206a;
        for (Integer num : treeMap.keySet()) {
            b bVarClone = ((b) dVar.f2827g).clone();
            n nVarF = ((m) treeMap.get(num)).f(rVar, Collections.singletonList(w4Var));
            int iO = nVarF instanceof g ? a.a.O(((g) nVarF).f5036a.doubleValue()) : -1;
            if (iO == 2 || iO == -1) {
                dVar.f2827g = bVarClone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f5207b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            n nVarF2 = ((m) treeMap2.get((Integer) it.next())).f(rVar, Collections.singletonList(w4Var));
            if (nVarF2 instanceof g) {
                a.a.O(((g) nVarF2).f5036a.doubleValue());
            }
        }
    }

    public t(int i10) {
        switch (i10) {
            case 3:
                this.f5206a = new TreeMap();
                this.f5207b = new TreeMap();
                break;
            default:
                this.f5206a = new HashMap();
                this.f5207b = new s(6);
                s sVar = new s(0);
                w wVar = w.BITWISE_AND;
                ArrayList arrayList = sVar.f5187a;
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
                ArrayList arrayList2 = sVar2.f5187a;
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
                ArrayList arrayList3 = sVar3.f5187a;
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
                ArrayList arrayList4 = sVar4.f5187a;
                arrayList4.add(wVar4);
                arrayList4.add(w.NOT);
                arrayList4.add(w.OR);
                b(sVar4);
                s sVar5 = new s(4);
                w wVar5 = w.FOR_IN;
                ArrayList arrayList5 = sVar5.f5187a;
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
                ArrayList arrayList6 = sVar6.f5187a;
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
                ArrayList arrayList7 = sVar7.f5187a;
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
