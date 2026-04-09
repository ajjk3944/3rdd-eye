package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class uw {

    /* renamed from: a, reason: collision with root package name */
    private final String f34228a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34229b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34230c;

    public uw(int i, int i10, String text) {
        kotlin.jvm.internal.l.f(text, "text");
        this.f34228a = text;
        this.f34229b = i;
        this.f34230c = i10;
    }

    public final int a() {
        return this.f34229b;
    }

    public final int b() {
        return this.f34230c;
    }

    public final String c() {
        return this.f34228a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw)) {
            return false;
        }
        uw uwVar = (uw) obj;
        return kotlin.jvm.internal.l.b(this.f34228a, uwVar.f34228a) && this.f34229b == uwVar.f34229b && this.f34230c == uwVar.f34230c;
    }

    public final int hashCode() {
        return this.f34230c + sx1.a(this.f34229b, this.f34228a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f34228a;
        int i = this.f34229b;
        int i10 = this.f34230c;
        StringBuilder sb = new StringBuilder("DebugPanelColoredText(text=");
        sb.append(str);
        sb.append(", color=");
        sb.append(i);
        sb.append(", style=");
        return B4.i.j(sb, i10, ")");
    }

    public /* synthetic */ uw(String str, int i) {
        this(i, R.style.DebugPanelText_Body2, str);
    }
}
