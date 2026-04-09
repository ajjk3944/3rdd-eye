package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Be implements InterfaceC4943s8 {

    /* renamed from: a, reason: collision with root package name */
    public final Ee f39174a;

    /* renamed from: b, reason: collision with root package name */
    public final F3 f39175b;

    /* renamed from: c, reason: collision with root package name */
    public final La f39176c;

    /* renamed from: d, reason: collision with root package name */
    public final Uf f39177d;

    public Be() {
        this(new Ee(), new F3(), new La(100), new Uf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ni> fromModel(Ae ae) {
        Ni niFromModel;
        int i = 0;
        boolean z10 = true;
        L8 l82 = new L8();
        l82.f39757a = ae.f39105a;
        l82.f39762f = new A8();
        Ce ce = ae.f39106b;
        C5094y8 c5094y8 = new C5094y8();
        c5094y8.f42112a = StringUtils.getUTF8Bytes(ce.f39256a);
        Gn gnA = this.f39176c.a(ce.f39257b);
        c5094y8.f42113b = StringUtils.getUTF8Bytes((String) gnA.f39550a);
        c5094y8.f42116e = ce.f39258c.size();
        Map<String, String> map = ce.f39259d;
        if (map != null) {
            niFromModel = this.f39174a.fromModel(map);
            c5094y8.f42114c = (C8) niFromModel.f39906a;
        } else {
            niFromModel = null;
        }
        l82.f39762f.f39089a = c5094y8;
        C5039w3 c5039w3 = new C5039w3(C5039w3.b(gnA, niFromModel));
        List list = ce.f39258c;
        ArrayList arrayList = new ArrayList();
        this.f39177d.getClass();
        int iComputeInt32Size = l82.f39757a != new L8().f39757a ? CodedOutputByteBufferNano.computeInt32Size(1, l82.f39757a) : 0;
        K8 k82 = l82.f39758b;
        if (k82 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, k82);
        }
        I8 i82 = l82.f39759c;
        if (i82 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, i82);
        }
        J8 j82 = l82.f39760d;
        int i10 = 4;
        if (j82 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, j82);
        }
        C4994u8 c4994u8 = l82.f39761e;
        if (c4994u8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c4994u8);
        }
        A8 a82 = l82.f39762f;
        if (a82 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, a82);
        }
        ArrayList arrayList2 = new ArrayList();
        L8 l83 = new L8();
        l83.f39757a = l82.f39757a;
        A8 a83 = new A8();
        l83.f39762f = a83;
        a83.f39089a = new C5094y8();
        C5094y8 c5094y82 = l83.f39762f.f39089a;
        C5094y8 c5094y83 = l82.f39762f.f39089a;
        c5094y82.f42113b = c5094y83.f42113b;
        c5094y82.f42112a = c5094y83.f42112a;
        c5094y82.f42116e = c5094y83.f42116e;
        c5094y82.f42114c = c5094y83.f42114c;
        int i11 = 0;
        C5039w3 c5039w32 = c5039w3;
        int i12 = iComputeInt32Size;
        while (i11 < list.size()) {
            G3 g32 = (G3) list.get(i11);
            int i13 = i;
            C5119z8 c5119z8 = new C5119z8();
            c5119z8.f42168a = i11;
            boolean z11 = z10;
            Ni niFromModel2 = this.f39175b.fromModel(g32);
            c5119z8.f42169b = (C5019v8) niFromModel2.f39906a;
            niFromModel2.f39907b.getBytesTruncated();
            Ni ni = new Ni(c5119z8, niFromModel2);
            Uf uf = this.f39177d;
            C5119z8 c5119z82 = (C5119z8) ni.f39906a;
            uf.getClass();
            int iComputeTagSize = CodedOutputByteBufferNano.computeTagSize(i10);
            int iComputeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c5119z82);
            int iComputeRawVarint32Size = iComputeTagSize + iComputeMessageSizeNoTag + ((iComputeMessageSizeNoTag & (-128)) == 0 ? i13 : CodedOutputByteBufferNano.computeRawVarint32Size(iComputeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i12 + iComputeRawVarint32Size > 204800) {
                l83.f39762f.f39089a.f42115d = (C5119z8[]) arrayList2.toArray(new C5119z8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Ni(l83, c5039w32));
                L8 l84 = new L8();
                l84.f39757a = l82.f39757a;
                A8 a84 = new A8();
                l84.f39762f = a84;
                a84.f39089a = new C5094y8();
                C5094y8 c5094y84 = l84.f39762f.f39089a;
                C5094y8 c5094y85 = l82.f39762f.f39089a;
                c5094y84.f42113b = c5094y85.f42113b;
                c5094y84.f42112a = c5094y85.f42112a;
                c5094y84.f42116e = c5094y85.f42116e;
                c5094y84.f42114c = c5094y85.f42114c;
                c5039w32 = c5039w3;
                i12 = iComputeInt32Size;
                l83 = l84;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C5119z8) ni.f39906a);
            InterfaceC5064x3 interfaceC5064x3 = ni.f39907b;
            InterfaceC5064x3[] interfaceC5064x3Arr = new InterfaceC5064x3[2];
            interfaceC5064x3Arr[i13] = c5039w32;
            interfaceC5064x3Arr[z11 ? 1 : 0] = interfaceC5064x3;
            c5039w32 = new C5039w3(C5039w3.b(interfaceC5064x3Arr));
            i12 += iComputeRawVarint32Size;
            i11++;
            i = i13;
            z10 = z11 ? 1 : 0;
            i10 = 4;
        }
        l83.f39762f.f39089a.f42115d = (C5119z8[]) arrayList2.toArray(new C5119z8[arrayList2.size()]);
        arrayList.add(new Ni(l83, c5039w32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Be(Ee ee, F3 f32, La la2, Uf uf) {
        this.f39174a = ee;
        this.f39175b = f32;
        this.f39176c = la2;
        this.f39177d = uf;
    }

    public final Ae a(List<Ni> list) {
        throw new UnsupportedOperationException();
    }
}
