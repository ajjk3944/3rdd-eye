package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public String f19433a;

    /* renamed from: c, reason: collision with root package name */
    public final String f19435c;

    /* renamed from: b, reason: collision with root package name */
    public int f19434b = 2;

    /* renamed from: d, reason: collision with root package name */
    public int f19436d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f19437e = Integer.MAX_VALUE;

    public m0(String str) {
        this.f19435c = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4;
        int i10 = this.f19434b;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int i11 = i10 - 1;
        String string = null;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f19434b = 4;
            int i12 = this.f19436d;
            while (true) {
                int length = this.f19436d;
                if (length == -1) {
                    this.f19434b = 3;
                    break;
                }
                String str = this.f19435c;
                int length2 = str.length();
                l0.d(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (str.charAt(length) == ',') {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = str.length();
                    this.f19436d = -1;
                    i4 = -1;
                } else {
                    i4 = length + 1;
                    this.f19436d = i4;
                }
                if (i4 == i12) {
                    int i13 = i4 + 1;
                    this.f19436d = i13;
                    if (i13 > str.length()) {
                        this.f19436d = -1;
                    }
                } else {
                    if (i12 < length) {
                        str.charAt(i12);
                    }
                    if (i12 < length) {
                        str.charAt(length - 1);
                    }
                    int i14 = this.f19437e;
                    if (i14 == 1) {
                        length = str.length();
                        this.f19436d = -1;
                        if (length > i12) {
                            str.charAt(length - 1);
                        }
                    } else {
                        this.f19437e = i14 - 1;
                    }
                    string = str.subSequence(i12, length).toString();
                }
            }
            this.f19433a = string;
            if (this.f19434b != 3) {
                this.f19434b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f19434b = 2;
        String str = this.f19433a;
        this.f19433a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
