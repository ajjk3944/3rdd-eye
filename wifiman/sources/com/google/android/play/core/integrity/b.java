package com.google.android.play.core.integrity;

/* loaded from: classes3.dex */
final class b extends bq {

    /* renamed from: a, reason: collision with root package name */
    private String f38033a;

    /* renamed from: b, reason: collision with root package name */
    private y f38034b;

    b() {
    }

    @Override // com.google.android.play.core.integrity.bq
    final bq a(y yVar) {
        this.f38034b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f38033a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final br c() {
        y yVar;
        String str = this.f38033a;
        if (str != null && (yVar = this.f38034b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f38033a == null) {
            sb2.append(" token");
        }
        if (this.f38034b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
