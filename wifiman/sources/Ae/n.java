package Ae;

import androidx.compose.animation.d;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    private final InterfaceC6835l enterTransition;
    private final InterfaceC6835l exitTransition;
    private final InterfaceC6835l popEnterTransition;
    private final InterfaceC6835l popExitTransition;
    public static final n FADE_IN = new n("FADE_IN", 0, new InterfaceC6835l() { // from class: Ae.b
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return n._init_$lambda$0((androidx.compose.animation.d) obj);
        }
    }, new InterfaceC6835l() { // from class: Ae.g
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return n._init_$lambda$1((androidx.compose.animation.d) obj);
        }
    }, new InterfaceC6835l() { // from class: Ae.h
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return n._init_$lambda$2((androidx.compose.animation.d) obj);
        }
    }, new InterfaceC6835l() { // from class: Ae.i
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return n._init_$lambda$3((androidx.compose.animation.d) obj);
        }
    });
    public static final n SLIDE_FROM_RIGHT = new n("SLIDE_FROM_RIGHT", 1, new InterfaceC6835l() { // from class: Ae.j
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return n._init_$lambda$4((androidx.compose.animation.d) obj);
        }
    }, new InterfaceC6835l() { // from class: Ae.k
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return n._init_$lambda$5((androidx.compose.animation.d) obj);
        }
    }, new InterfaceC6835l() { // from class: Ae.l
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return n._init_$lambda$6((androidx.compose.animation.d) obj);
        }
    }, new InterfaceC6835l() { // from class: Ae.m
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return n._init_$lambda$7((androidx.compose.animation.d) obj);
        }
    });
    public static final n SLIDE_FROM_BOTTOM = new n("SLIDE_FROM_BOTTOM", 2, new InterfaceC6835l() { // from class: Ae.c
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return n._init_$lambda$8((androidx.compose.animation.d) obj);
        }
    }, new InterfaceC6835l() { // from class: Ae.d
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return n._init_$lambda$9((androidx.compose.animation.d) obj);
        }
    }, new InterfaceC6835l() { // from class: Ae.e
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return n._init_$lambda$10((androidx.compose.animation.d) obj);
        }
    }, new InterfaceC6835l() { // from class: Ae.f
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return n._init_$lambda$11((androidx.compose.animation.d) obj);
        }
    });

    private static final /* synthetic */ n[] $values() {
        return new n[]{FADE_IN, SLIDE_FROM_RIGHT, SLIDE_FROM_BOTTOM};
    }

    static {
        n[] nVarArr$values = $values();
        $VALUES = nVarArr$values;
        $ENTRIES = AbstractC5827b.a(nVarArr$values);
    }

    private n(String str, int i10, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, InterfaceC6835l interfaceC6835l4) {
        this.enterTransition = interfaceC6835l;
        this.exitTransition = interfaceC6835l2;
        this.popEnterTransition = interfaceC6835l3;
        this.popExitTransition = interfaceC6835l4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.i _init_$lambda$0(androidx.compose.animation.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return androidx.compose.animation.g.o(o.c(), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.k _init_$lambda$1(androidx.compose.animation.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return androidx.compose.animation.g.q(o.c(), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.i _init_$lambda$10(androidx.compose.animation.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return androidx.compose.animation.d.c(dVar, d.a.f27532a.d(), o.d(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.k _init_$lambda$11(androidx.compose.animation.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return androidx.compose.animation.d.a(dVar, d.a.f27532a.a(), o.d(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.i _init_$lambda$2(androidx.compose.animation.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return androidx.compose.animation.g.o(o.c(), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.k _init_$lambda$3(androidx.compose.animation.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return androidx.compose.animation.g.q(o.c(), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.i _init_$lambda$4(androidx.compose.animation.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return androidx.compose.animation.d.c(dVar, d.a.f27532a.c(), o.d(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.k _init_$lambda$5(androidx.compose.animation.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return androidx.compose.animation.d.a(dVar, d.a.f27532a.c(), o.d(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.i _init_$lambda$6(androidx.compose.animation.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return androidx.compose.animation.d.c(dVar, d.a.f27532a.d(), o.d(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.k _init_$lambda$7(androidx.compose.animation.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return androidx.compose.animation.d.a(dVar, d.a.f27532a.d(), o.d(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.i _init_$lambda$8(androidx.compose.animation.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return androidx.compose.animation.d.c(dVar, d.a.f27532a.f(), o.d(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.k _init_$lambda$9(androidx.compose.animation.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return androidx.compose.animation.d.a(dVar, d.a.f27532a.c(), o.d(), null, 4, null);
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final InterfaceC6835l getEnterTransition() {
        return this.enterTransition;
    }

    public final InterfaceC6835l getExitTransition() {
        return this.exitTransition;
    }

    public final InterfaceC6835l getPopEnterTransition() {
        return this.popEnterTransition;
    }

    public final InterfaceC6835l getPopExitTransition() {
        return this.popExitTransition;
    }
}
