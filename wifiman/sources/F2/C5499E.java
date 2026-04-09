package f2;

import Zg.U;
import f2.AbstractC5498D;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: f2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5499E {

    /* renamed from: b, reason: collision with root package name */
    public static final a f46695b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f46696c = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Map f46697a = new LinkedHashMap();

    /* renamed from: f2.E$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class navigatorClass) {
            AbstractC6492s.i(navigatorClass, "navigatorClass");
            String strValue = (String) C5499E.f46696c.get(navigatorClass);
            if (strValue == null) {
                AbstractC5498D.b bVar = (AbstractC5498D.b) navigatorClass.getAnnotation(AbstractC5498D.b.class);
                strValue = bVar != null ? bVar.value() : null;
                if (!b(strValue)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
                }
                C5499E.f46696c.put(navigatorClass, strValue);
            }
            AbstractC6492s.f(strValue);
            return strValue;
        }

        public final boolean b(String str) {
            return str != null && str.length() > 0;
        }

        private a() {
        }
    }

    public final AbstractC5498D b(AbstractC5498D navigator) {
        AbstractC6492s.i(navigator, "navigator");
        return c(f46695b.a(navigator.getClass()), navigator);
    }

    public AbstractC5498D c(String name, AbstractC5498D navigator) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(navigator, "navigator");
        if (!f46695b.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        AbstractC5498D abstractC5498D = (AbstractC5498D) this.f46697a.get(name);
        if (AbstractC6492s.d(abstractC5498D, navigator)) {
            return navigator;
        }
        boolean z10 = false;
        if (abstractC5498D != null && abstractC5498D.c()) {
            z10 = true;
        }
        if (z10) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + abstractC5498D).toString());
        }
        if (!navigator.c()) {
            return (AbstractC5498D) this.f46697a.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final AbstractC5498D d(Class navigatorClass) {
        AbstractC6492s.i(navigatorClass, "navigatorClass");
        return e(f46695b.a(navigatorClass));
    }

    public AbstractC5498D e(String name) {
        AbstractC6492s.i(name, "name");
        if (!f46695b.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        AbstractC5498D abstractC5498D = (AbstractC5498D) this.f46697a.get(name);
        if (abstractC5498D != null) {
            return abstractC5498D;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public final Map f() {
        return U.t(this.f46697a);
    }
}
