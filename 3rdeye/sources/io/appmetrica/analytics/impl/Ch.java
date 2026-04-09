package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Ch implements InterfaceC4725jn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B9 f39265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fh f39266b;

    public Ch(Fh fh, B9 b92) {
        this.f39266b = fh;
        this.f39265a = b92;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4725jn
    public final void a(Object obj) {
        List list = (List) obj;
        B9 b92 = this.f39265a;
        if (AbstractC4623fo.a((Collection) list)) {
            return;
        }
        b92.f39165d = new C5120z9[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C4620fl c4620fl = (C4620fl) list.get(i);
            C5120z9[] c5120z9Arr = b92.f39165d;
            Map map = AbstractC4486ag.f40520a;
            C5120z9 c5120z9 = new C5120z9();
            Integer num = c4620fl.f40870a;
            if (num != null) {
                c5120z9.f42171a = num.intValue();
            }
            Integer num2 = c4620fl.f40871b;
            if (num2 != null) {
                c5120z9.f42172b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c4620fl.f40873d)) {
                c5120z9.f42173c = c4620fl.f40873d;
            }
            c5120z9.f42174d = c4620fl.f40872c;
            c5120z9Arr[i] = c5120z9;
            this.f39266b.f39444g += CodedOutputByteBufferNano.computeMessageSizeNoTag(b92.f39165d[i]);
            this.f39266b.f39444g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
