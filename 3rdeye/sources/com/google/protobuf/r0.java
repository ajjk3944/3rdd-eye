package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: StructuralMessageInfo.java */
/* loaded from: classes2.dex */
public final class r0 implements S {
    private final int[] checkInitialized;
    private final U defaultInstance;
    private final C4037u[] fields;
    private final boolean messageSetWireFormat;
    private final g0 syntax;

    public r0(g0 g0Var, boolean z10, int[] iArr, C4037u[] c4037uArr, Object obj) {
        this.syntax = g0Var;
        this.messageSetWireFormat = z10;
        this.checkInitialized = iArr;
        this.fields = c4037uArr;
        this.defaultInstance = (U) B.checkNotNull(obj, "defaultInstance");
    }

    public static a newBuilder() {
        return new a();
    }

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    @Override // com.google.protobuf.S
    public U getDefaultInstance() {
        return this.defaultInstance;
    }

    public C4037u[] getFields() {
        return this.fields;
    }

    @Override // com.google.protobuf.S
    public g0 getSyntax() {
        return this.syntax;
    }

    @Override // com.google.protobuf.S
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }

    public static a newBuilder(int i) {
        return new a(i);
    }

    /* compiled from: StructuralMessageInfo.java */
    public static final class a {
        private int[] checkInitialized;
        private Object defaultInstance;
        private final List<C4037u> fields;
        private boolean messageSetWireFormat;
        private g0 syntax;
        private boolean wasBuilt;

        public a() {
            this.checkInitialized = null;
            this.fields = new ArrayList();
        }

        public r0 build() {
            if (this.wasBuilt) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.syntax == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.wasBuilt = true;
            Collections.sort(this.fields);
            return new r0(this.syntax, this.messageSetWireFormat, this.checkInitialized, (C4037u[]) this.fields.toArray(new C4037u[0]), this.defaultInstance);
        }

        public void withCheckInitialized(int[] iArr) {
            this.checkInitialized = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.defaultInstance = obj;
        }

        public void withField(C4037u c4037u) {
            if (this.wasBuilt) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.fields.add(c4037u);
        }

        public void withMessageSetWireFormat(boolean z10) {
            this.messageSetWireFormat = z10;
        }

        public void withSyntax(g0 g0Var) {
            this.syntax = (g0) B.checkNotNull(g0Var, "syntax");
        }

        public a(int i) {
            this.checkInitialized = null;
            this.fields = new ArrayList(i);
        }
    }
}
