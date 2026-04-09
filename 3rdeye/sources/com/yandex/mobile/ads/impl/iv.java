package com.yandex.mobile.ads.impl;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class iv implements ov0 {

    /* renamed from: a, reason: collision with root package name */
    private final CheckBox f28879a;

    /* renamed from: b, reason: collision with root package name */
    private final ProgressBar f28880b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f28881c;

    public iv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv)) {
            return false;
        }
        iv ivVar = (iv) obj;
        return kotlin.jvm.internal.l.b(this.f28879a, ivVar.f28879a) && kotlin.jvm.internal.l.b(this.f28880b, ivVar.f28880b) && kotlin.jvm.internal.l.b(this.f28881c, ivVar.f28881c);
    }

    @Override // com.yandex.mobile.ads.impl.ov0
    public final TextView getCountDownProgress() {
        return this.f28881c;
    }

    @Override // com.yandex.mobile.ads.impl.ov0
    public final CheckBox getMuteControl() {
        return this.f28879a;
    }

    @Override // com.yandex.mobile.ads.impl.ov0
    public final ProgressBar getVideoProgress() {
        return this.f28880b;
    }

    public final int hashCode() {
        CheckBox checkBox = this.f28879a;
        int iHashCode = (checkBox == null ? 0 : checkBox.hashCode()) * 31;
        ProgressBar progressBar = this.f28880b;
        int iHashCode2 = (iHashCode + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
        TextView textView = this.f28881c;
        return iHashCode2 + (textView != null ? textView.hashCode() : 0);
    }

    public final String toString() {
        return "CustomControlsContainer(muteControl=" + this.f28879a + ", videoProgress=" + this.f28880b + ", countDownProgress=" + this.f28881c + ")";
    }

    public /* synthetic */ iv(int i) {
        this(null, null, null);
    }

    public iv(CheckBox checkBox, ProgressBar progressBar, TextView textView) {
        this.f28879a = checkBox;
        this.f28880b = progressBar;
        this.f28881c = textView;
    }
}
