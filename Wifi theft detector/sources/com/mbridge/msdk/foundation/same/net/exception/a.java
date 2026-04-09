package com.mbridge.msdk.foundation.same.net.exception;

/* loaded from: classes3.dex */
public class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public int f15126a;

    /* renamed from: b, reason: collision with root package name */
    public String f15127b;

    /* renamed from: c, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.toolbox.a f15128c;

    public a(int i10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.f15126a = i10;
        this.f15128c = aVar;
    }

    public a(int i10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar, String str) {
        this.f15126a = i10;
        this.f15128c = aVar;
        this.f15127b = str;
    }
}
