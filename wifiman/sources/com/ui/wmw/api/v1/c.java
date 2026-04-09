package com.ui.wmw.api.v1;

import Zg.U;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final a Companion;
    private static final Map<String, c> values;

    /* renamed from: id, reason: collision with root package name */
    private final String f45427id;
    public static final c IN_PROGRESS = new c("IN_PROGRESS", 0, "continue");
    public static final c ERROR = new c("ERROR", 1, "error");
    public static final c COMPLETE = new c("COMPLETE", 2, "complete");
    public static final c IDLE = new c("IDLE", 3, "idle");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map a() {
            return c.values;
        }

        private a() {
        }
    }

    private static final /* synthetic */ c[] $values() {
        return new c[]{IN_PROGRESS, ERROR, COMPLETE, IDLE};
    }

    static {
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = AbstractC5827b.a(cVarArr$values);
        Companion = new a(null);
        c[] cVarArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(cVarArrValues.length), 16));
        for (c cVar : cVarArrValues) {
            linkedHashMap.put(cVar.f45427id, cVar);
        }
        values = linkedHashMap;
    }

    private c(String str, int i10, String str2) {
        this.f45427id = str2;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f45427id;
    }
}
