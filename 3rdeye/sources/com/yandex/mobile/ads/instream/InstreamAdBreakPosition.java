package com.yandex.mobile.ads.instream;

import com.google.gson.internal.c;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class InstreamAdBreakPosition {

    /* renamed from: a, reason: collision with root package name */
    private final Type f36803a;

    /* renamed from: b, reason: collision with root package name */
    private final long f36804b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type MILLISECONDS;
        public static final Type PERCENTS;
        public static final Type POSITION;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ Type[] f36805b;

        static {
            Type type = new Type(0, "PERCENTS");
            PERCENTS = type;
            Type type2 = new Type(1, "MILLISECONDS");
            MILLISECONDS = type2;
            Type type3 = new Type(2, "POSITION");
            POSITION = type3;
            Type[] typeArr = {type, type2, type3};
            f36805b = typeArr;
            c.l(typeArr);
        }

        private Type(int i, String str) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f36805b.clone();
        }
    }

    public InstreamAdBreakPosition(Type positionType, long j4) {
        l.f(positionType, "positionType");
        this.f36803a = positionType;
        this.f36804b = j4;
    }

    public final Type getPositionType() {
        return this.f36803a;
    }

    public final long getValue() {
        return this.f36804b;
    }
}
