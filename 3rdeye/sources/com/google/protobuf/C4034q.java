package com.google.protobuf;

import com.google.protobuf.AbstractC4042z;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExtensionRegistryLite.java */
/* renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4034q {
    static final C4034q EMPTY_REGISTRY_LITE = new C4034q(true);
    static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile C4034q emptyRegistry;
    private final Map<b, AbstractC4042z.g<?, ?>> extensionsByNumber;

    /* compiled from: ExtensionRegistryLite.java */
    /* renamed from: com.google.protobuf.q$a */
    public static class a {
        static final Class<?> INSTANCE = resolveExtensionClass();

        private a() {
        }

        public static Class<?> resolveExtensionClass() {
            try {
                return Class.forName(C4034q.EXTENSION_CLASS_NAME);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    /* compiled from: ExtensionRegistryLite.java */
    /* renamed from: com.google.protobuf.q$b */
    public static final class b {
        private final int number;
        private final Object object;

        public b(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.object == bVar.object && this.number == bVar.number;
        }

        public int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }
    }

    public C4034q() {
        this.extensionsByNumber = new HashMap();
    }

    public static C4034q getEmptyRegistry() {
        C4034q c4034qCreateEmpty;
        C4034q c4034q = emptyRegistry;
        if (c4034q != null) {
            return c4034q;
        }
        synchronized (C4034q.class) {
            try {
                c4034qCreateEmpty = emptyRegistry;
                if (c4034qCreateEmpty == null) {
                    c4034qCreateEmpty = doFullRuntimeInheritanceCheck ? C4033p.createEmpty() : EMPTY_REGISTRY_LITE;
                    emptyRegistry = c4034qCreateEmpty;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4034qCreateEmpty;
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static C4034q newInstance() {
        return doFullRuntimeInheritanceCheck ? C4033p.create() : new C4034q();
    }

    public static void setEagerlyParseMessageSets(boolean z10) {
        eagerlyParseMessageSets = z10;
    }

    public final void add(AbstractC4042z.g<?, ?> gVar) {
        this.extensionsByNumber.put(new b(gVar.getContainingTypeDefaultInstance(), gVar.getNumber()), gVar);
    }

    public <ContainingType extends U> AbstractC4042z.g<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (AbstractC4042z.g) this.extensionsByNumber.get(new b(containingtype, i));
    }

    public C4034q getUnmodifiable() {
        return new C4034q(this);
    }

    public C4034q(C4034q c4034q) {
        if (c4034q == EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = Collections.EMPTY_MAP;
        } else {
            this.extensionsByNumber = Collections.unmodifiableMap(c4034q.extensionsByNumber);
        }
    }

    public final void add(AbstractC4032o<?, ?> abstractC4032o) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (AbstractC4042z.g.class.isAssignableFrom(abstractC4032o.getClass())) {
            add((AbstractC4042z.g<?, ?>) abstractC4032o);
        }
        if (doFullRuntimeInheritanceCheck && C4033p.isFullRegistry(this)) {
            try {
                getClass().getMethod("add", a.INSTANCE).invoke(this, abstractC4032o);
            } catch (Exception e4) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", abstractC4032o), e4);
            }
        }
    }

    public C4034q(boolean z10) {
        this.extensionsByNumber = Collections.EMPTY_MAP;
    }
}
