package com.google.android.play.core.integrity;

/* loaded from: classes3.dex */
final class a extends ap {

    /* renamed from: a, reason: collision with root package name */
    private String f37980a;

    /* renamed from: b, reason: collision with root package name */
    private y f37981b;

    a() {
    }

    @Override // com.google.android.play.core.integrity.ap
    final ap a(y yVar) {
        this.f37981b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    final ap b(String str) {
        this.f37980a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    final aq c() {
        y yVar;
        String str = this.f37980a;
        if (str != null && (yVar = this.f37981b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f37980a == null) {
            sb2.append(" token");
        }
        if (this.f37981b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
