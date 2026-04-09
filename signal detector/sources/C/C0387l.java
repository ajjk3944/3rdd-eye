package c;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0291m;
import androidx.lifecycle.EnumC0292n;
import androidx.lifecycle.InterfaceC0296s;
import androidx.lifecycle.InterfaceC0298u;
import c.C0387l;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import e.C2284a;
import e.C2288e;
import e.C2289f;
import e.C2290g;
import e.C2291h;
import e.C2292i;
import e.InterfaceC2285b;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* renamed from: c.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387l {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5839a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5840b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5841c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5842d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f5843e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f5844f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f5845g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2349g f5846h;

    public C0387l(AbstractActivityC2349g abstractActivityC2349g) {
        this.f5846h = abstractActivityC2349g;
    }

    public final boolean a(int i, int i3, Intent intent) {
        String str = (String) this.f5839a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C2288e c2288e = (C2288e) this.f5843e.get(str);
        if ((c2288e != null ? c2288e.f19844a : null) != null) {
            ArrayList arrayList = this.f5842d;
            if (arrayList.contains(str)) {
                c2288e.f19844a.b(c2288e.f19845b.x(intent, i3));
                arrayList.remove(str);
                return true;
            }
        }
        this.f5844f.remove(str);
        this.f5845g.putParcelable(str, new C2284a(intent, i3));
        return true;
    }

    public final void b(int i, R2.a aVar, Object obj) {
        Bundle bundleExtra;
        int i3;
        AbstractActivityC2349g abstractActivityC2349g = this.f5846h;
        d4.h hVarQ = aVar.q(abstractActivityC2349g, obj);
        if (hVarQ != null) {
            new Handler(Looper.getMainLooper()).post(new A0.b(i, 1, this, hVarQ));
            return;
        }
        Intent intentE = aVar.e(abstractActivityC2349g, obj);
        if (intentE.getExtras() != null) {
            Bundle extras = intentE.getExtras();
            q5.i.b(extras);
            if (extras.getClassLoader() == null) {
                intentE.setExtrasClassLoader(abstractActivityC2349g.getClassLoader());
            }
        }
        if (intentE.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentE.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentE.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentE.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentE.getAction())) {
                abstractActivityC2349g.startActivityForResult(intentE, i, bundle);
                return;
            }
            C2292i c2292i = (C2292i) intentE.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                q5.i.b(c2292i);
                i3 = i;
            } catch (IntentSender.SendIntentException e6) {
                e = e6;
                i3 = i;
            }
            try {
                abstractActivityC2349g.startIntentSenderForResult(c2292i.f19853a, i3, c2292i.f19854b, c2292i.f19855c, c2292i.f19856d, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e7) {
                e = e7;
                new Handler(Looper.getMainLooper()).post(new A0.b(i3, 2, this, e));
                return;
            }
        }
        String[] stringArrayExtra = intentE.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i6 = 0; i6 < stringArrayExtra.length; i6++) {
            if (TextUtils.isEmpty(stringArrayExtra[i6])) {
                throw new IllegalArgumentException(A.f.p(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i6], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i6));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < stringArrayExtra.length; i8++) {
                if (!hashSet.contains(Integer.valueOf(i8))) {
                    strArr[i7] = stringArrayExtra[i8];
                    i7++;
                }
            }
        }
        abstractActivityC2349g.requestPermissions(stringArrayExtra, i);
    }

    public final C2291h c(String str, R2.a aVar, InterfaceC2285b interfaceC2285b) {
        q5.i.e(str, "key");
        e(str);
        this.f5843e.put(str, new C2288e(aVar, interfaceC2285b));
        LinkedHashMap linkedHashMap = this.f5844f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            interfaceC2285b.b(obj);
        }
        Bundle bundle = this.f5845g;
        C2284a c2284a = (C2284a) com.bumptech.glide.e.q(str, bundle);
        if (c2284a != null) {
            bundle.remove(str);
            interfaceC2285b.b(aVar.x(c2284a.f19839b, c2284a.f19838a));
        }
        return new C2291h(this, str, aVar, 1);
    }

    public final C2291h d(final String str, InterfaceC0298u interfaceC0298u, final R2.a aVar, final InterfaceC2285b interfaceC2285b) {
        q5.i.e(str, "key");
        C0300w c0300wJ = interfaceC0298u.j();
        if (c0300wJ.f5259d.compareTo(EnumC0292n.f5246d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + interfaceC0298u + " is attempting to register while current state is " + c0300wJ.f5259d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.f5841c;
        C2289f c2289f = (C2289f) linkedHashMap.get(str);
        if (c2289f == null) {
            c2289f = new C2289f(c0300wJ);
        }
        InterfaceC0296s interfaceC0296s = new InterfaceC0296s() { // from class: e.d
            @Override // androidx.lifecycle.InterfaceC0296s
            public final void d(InterfaceC0298u interfaceC0298u2, EnumC0291m enumC0291m) {
                C0387l c0387l = this.f19840a;
                Bundle bundle = c0387l.f5845g;
                LinkedHashMap linkedHashMap2 = c0387l.f5843e;
                LinkedHashMap linkedHashMap3 = c0387l.f5844f;
                String str2 = str;
                q5.i.e(str2, "$key");
                if (EnumC0291m.ON_START != enumC0291m) {
                    if (EnumC0291m.ON_STOP == enumC0291m) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (EnumC0291m.ON_DESTROY == enumC0291m) {
                            c0387l.f(str2);
                            return;
                        }
                        return;
                    }
                }
                R2.a aVar2 = aVar;
                InterfaceC2285b interfaceC2285b2 = interfaceC2285b;
                linkedHashMap2.put(str2, new C2288e(aVar2, interfaceC2285b2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    interfaceC2285b2.b(obj);
                }
                C2284a c2284a = (C2284a) com.bumptech.glide.e.q(str2, bundle);
                if (c2284a != null) {
                    bundle.remove(str2);
                    interfaceC2285b2.b(aVar2.x(c2284a.f19839b, c2284a.f19838a));
                }
            }
        };
        c2289f.f19846a.a(interfaceC0296s);
        c2289f.f19847b.add(interfaceC0296s);
        linkedHashMap.put(str, c2289f);
        return new C2291h(this, str, aVar, 0);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f5840b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = new x5.a(new x5.f(0, C2290g.f19848b, new D4.d(11))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f5839a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        q5.i.e(str, "key");
        if (!this.f5842d.contains(str) && (num = (Integer) this.f5840b.remove(str)) != null) {
            this.f5839a.remove(num);
        }
        this.f5843e.remove(str);
        LinkedHashMap linkedHashMap = this.f5844f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbQ = AbstractC1135f5.q("Dropping pending result for request ", str, ": ");
            sbQ.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbQ.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f5845g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C2284a) com.bumptech.glide.e.q(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f5841c;
        C2289f c2289f = (C2289f) linkedHashMap2.get(str);
        if (c2289f != null) {
            ArrayList arrayList = c2289f.f19847b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c2289f.f19846a.f((InterfaceC0296s) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
