package androidx.compose.ui.platform;

import Yg.InterfaceC3665i;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import c0.AbstractC4181j;
import c0.InterfaceC4179h;
import d0.InterfaceC5275g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import q2.C7416d;
import q2.InterfaceC7418f;

/* renamed from: androidx.compose.ui.platform.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3947q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class[] f29467a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: androidx.compose.ui.platform.q0$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f29468a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7416d f29469b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29470c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, C7416d c7416d, String str) {
            super(0);
            this.f29468a = z10;
            this.f29469b = c7416d;
            this.f29470c = str;
        }

        public final void a() {
            if (this.f29468a) {
                this.f29469b.j(this.f29470c);
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.q0$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f29471a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(AbstractC3947q0.f(obj));
        }
    }

    public static final C3943o0 b(View view, InterfaceC7418f interfaceC7418f) {
        Object parent = view.getParent();
        AbstractC6492s.g(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(f0.h.f46607H);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return c(strValueOf, interfaceC7418f);
    }

    public static final C3943o0 c(String str, InterfaceC7418f interfaceC7418f) {
        boolean z10;
        String str2 = InterfaceC4179h.class.getSimpleName() + ':' + str;
        C7416d c7416dT = interfaceC7418f.t();
        Bundle bundleB = c7416dT.b(str2);
        final InterfaceC4179h interfaceC4179hA = AbstractC4181j.a(bundleB != null ? h(bundleB) : null, b.f29471a);
        try {
            c7416dT.h(str2, new C7416d.c() { // from class: androidx.compose.ui.platform.p0
                @Override // q2.C7416d.c
                public final Bundle a() {
                    return AbstractC3947q0.d(interfaceC4179hA);
                }
            });
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new C3943o0(interfaceC4179hA, new a(z10, c7416dT, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(InterfaceC4179h interfaceC4179h) {
        return g(interfaceC4179h.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof InterfaceC5275g) {
            InterfaceC5275g interfaceC5275g = (InterfaceC5275g) obj;
            if (interfaceC5275g.d() != T.o1.j() && interfaceC5275g.d() != T.o1.p() && interfaceC5275g.d() != T.o1.m()) {
                return false;
            }
            Object value = interfaceC5275g.getValue();
            if (value == null) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof InterfaceC3665i) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class cls : f29467a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle g(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle;
    }

    private static final Map h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            AbstractC6492s.g(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
