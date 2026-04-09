package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class wx {

    /* renamed from: a, reason: collision with root package name */
    private final String f35103a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35104b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f35105c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35106d;

    public wx(String text, int i, Integer num, int i10) {
        kotlin.jvm.internal.l.f(text, "text");
        this.f35103a = text;
        this.f35104b = i;
        this.f35105c = num;
        this.f35106d = i10;
    }

    public final int a() {
        return this.f35104b;
    }

    public final Integer b() {
        return this.f35105c;
    }

    public final int c() {
        return this.f35106d;
    }

    public final String d() {
        return this.f35103a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx)) {
            return false;
        }
        wx wxVar = (wx) obj;
        return kotlin.jvm.internal.l.b(this.f35103a, wxVar.f35103a) && this.f35104b == wxVar.f35104b && kotlin.jvm.internal.l.b(this.f35105c, wxVar.f35105c) && this.f35106d == wxVar.f35106d;
    }

    public final int hashCode() {
        int iA = sx1.a(this.f35104b, this.f35103a.hashCode() * 31, 31);
        Integer num = this.f35105c;
        return this.f35106d + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "DebugPanelTextWithIcon(text=" + this.f35103a + ", color=" + this.f35104b + ", icon=" + this.f35105c + ", style=" + this.f35106d + ")";
    }

    public /* synthetic */ wx(String str, int i, Integer num, int i10, int i11) {
        this(str, (i11 & 2) != 0 ? R.attr.debug_panel_label_primary : i, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? R.style.DebugPanelText_Body1 : i10);
    }
}
