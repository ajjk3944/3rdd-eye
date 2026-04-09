package com.applovin.impl;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.d;
import com.applovin.impl.e3;
import com.applovin.impl.g3;
import com.applovin.impl.s2;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class f3 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private g3 f4101a;

    /* renamed from: b, reason: collision with root package name */
    private ListView f4102b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements s2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e3 f4103a;

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        /* renamed from: com.applovin.impl.f3$a$a, reason: collision with other inner class name */
        public class C0010a implements d.b {
            public C0010a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f4103a);
            }
        }

        public a(e3 e3Var) {
            this.f4103a = e3Var;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            if (j2Var.b() != g3.a.TEST_ADS.ordinal()) {
                n7.a(r2Var.c(), r2Var.b(), f3.this);
                return;
            }
            com.applovin.impl.sdk.k kVarO = this.f4103a.o();
            e3.b bVarY = this.f4103a.y();
            if (!f3.this.f4101a.a(j2Var)) {
                n7.a(r2Var.c(), r2Var.b(), f3.this);
                return;
            }
            if (e3.b.READY == bVarY) {
                d.a(f3.this, MaxDebuggerMultiAdActivity.class, kVarO.e(), new C0010a());
            } else if (e3.b.DISABLED != bVarY) {
                n7.a(r2Var.c(), r2Var.b(), f3.this);
            } else {
                kVarO.s0().a();
                n7.a(r2Var.c(), r2Var.b(), f3.this);
            }
        }
    }

    public f3() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        g3 g3Var = this.f4101a;
        if (g3Var != null) {
            return g3Var.h().o();
        }
        return null;
    }

    public void initialize(e3 e3Var) {
        setTitle(e3Var.g());
        g3 g3Var = new g3(e3Var, this);
        this.f4101a = g3Var;
        g3Var.a(new a(e3Var));
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f4102b = listView;
        listView.setAdapter((ListAdapter) this.f4101a);
    }

    @Override // com.applovin.impl.n3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f4101a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f4101a.k();
            this.f4101a.c();
        }
    }
}
