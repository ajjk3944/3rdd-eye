package com.applovin.impl;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.AbstractC2113d;
import com.applovin.impl.k2;
import com.applovin.impl.v2;
import com.applovin.impl.x2;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public abstract class w2 extends d3 {

    /* renamed from: a, reason: collision with root package name */
    private x2 f21684a;

    /* renamed from: b, reason: collision with root package name */
    private ListView f21685b;

    public class a implements k2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v2 f21686a;

        /* renamed from: com.applovin.impl.w2$a$a, reason: collision with other inner class name */
        public class C0323a implements AbstractC2113d.b {
            public C0323a() {
            }

            @Override // com.applovin.impl.AbstractC2113d.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f21686a);
            }
        }

        public a(v2 v2Var) {
            this.f21686a = v2Var;
        }

        @Override // com.applovin.impl.k2.a
        public void a(d2 d2Var, j2 j2Var) {
            if (d2Var.b() != x2.a.TEST_ADS.ordinal()) {
                a7.a(j2Var.c(), j2Var.b(), w2.this);
                return;
            }
            com.applovin.impl.sdk.k kVarO = this.f21686a.o();
            v2.b bVarY = this.f21686a.y();
            if (!w2.this.f21684a.a(d2Var)) {
                a7.a(j2Var.c(), j2Var.b(), w2.this);
                return;
            }
            if (v2.b.READY == bVarY) {
                AbstractC2113d.a(w2.this, MaxDebuggerMultiAdActivity.class, kVarO.e(), new C0323a());
            } else if (v2.b.DISABLED != bVarY) {
                a7.a(j2Var.c(), j2Var.b(), w2.this);
            } else {
                kVarO.s0().a();
                a7.a(j2Var.c(), j2Var.b(), w2.this);
            }
        }
    }

    public w2() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.d3
    public com.applovin.impl.sdk.k getSdk() {
        x2 x2Var = this.f21684a;
        if (x2Var != null) {
            return x2Var.h().o();
        }
        return null;
    }

    public void initialize(v2 v2Var) {
        setTitle(v2Var.g());
        x2 x2Var = new x2(v2Var, this);
        this.f21684a = x2Var;
        x2Var.a(new a(v2Var));
    }

    @Override // com.applovin.impl.d3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f21685b = listView;
        listView.setAdapter((ListAdapter) this.f21684a);
    }

    @Override // com.applovin.impl.d3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f21684a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f21684a.k();
            this.f21684a.c();
        }
    }
}
