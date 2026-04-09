package yi;

import ak.l1;
import ak.w;
import android.net.TrafficStats;
import bf.n;
import br.l;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.g8;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.n8;
import com.google.android.gms.internal.measurement.n9;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.q9;
import com.google.android.gms.internal.measurement.s8;
import g4.j;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import zc.q;
import zc.u;

/* loaded from: classes.dex */
public final class g implements e, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26403a;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g f26398d = new g(1);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g f26399g = new g(2);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ g f26400r = new g(3);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ g f26401x = new g(4);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ g f26402y = new g(5);
    public static final /* synthetic */ g B = new g(6);
    public static final /* synthetic */ g D = new g(7);
    public static final /* synthetic */ g E = new g(8);
    public static final /* synthetic */ g F = new g(9);
    public static final /* synthetic */ g G = new g(10);
    public static final /* synthetic */ g H = new g(11);
    public static final /* synthetic */ g I = new g(12);
    public static final /* synthetic */ g J = new g(13);
    public static final /* synthetic */ g K = new g(14);
    public static final /* synthetic */ g L = new g(15);
    public static final /* synthetic */ g M = new g(16);
    public static final /* synthetic */ g N = new g(17);

    public /* synthetic */ g(int i10) {
        this.f26403a = i10;
    }

    @Override // yi.e
    public long a(int i10) {
        return TrafficStats.getUidRxBytes(i10);
    }

    @Override // yi.e
    public Long b(b bVar, a aVar, c cVar) {
        l.e(bVar, "dataInterface");
        l.e(aVar, "dataDirection");
        l.e(cVar, "dataUnit");
        int i10 = f.f26395a[bVar.ordinal()];
        if (i10 == 1) {
            int i11 = f.f26396b[aVar.ordinal()];
            if (i11 == 1) {
                int i12 = f.f26397c[cVar.ordinal()];
                if (i12 == 1) {
                    return Long.valueOf(TrafficStats.getMobileTxBytes());
                }
                if (i12 == 2) {
                    return Long.valueOf(TrafficStats.getMobileTxPackets());
                }
                if (i12 != 3) {
                    throw new n();
                }
            } else {
                if (i11 != 2) {
                    throw new n();
                }
                int i13 = f.f26397c[cVar.ordinal()];
                if (i13 == 1) {
                    return Long.valueOf(TrafficStats.getMobileRxBytes());
                }
                if (i13 == 2) {
                    return Long.valueOf(TrafficStats.getMobileRxPackets());
                }
                if (i13 != 3) {
                    throw new n();
                }
            }
            return 0L;
        }
        if (i10 != 2) {
            throw new n();
        }
        int i14 = f.f26396b[aVar.ordinal()];
        if (i14 == 1) {
            int i15 = f.f26397c[cVar.ordinal()];
            if (i15 == 1) {
                return Long.valueOf(TrafficStats.getTotalTxBytes() - TrafficStats.getMobileTxBytes());
            }
            if (i15 == 2) {
                return Long.valueOf(TrafficStats.getTotalTxPackets() - TrafficStats.getMobileTxPackets());
            }
            if (i15 != 3) {
                throw new n();
            }
        } else {
            if (i14 != 2) {
                throw new n();
            }
            int i16 = f.f26397c[cVar.ordinal()];
            if (i16 == 1) {
                return Long.valueOf(TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes());
            }
            if (i16 == 2) {
                return Long.valueOf(TrafficStats.getTotalRxPackets() - TrafficStats.getMobileRxPackets());
            }
            if (i16 != 3) {
                throw new n();
            }
        }
        return 0L;
    }

    @Override // yi.e
    public long c() {
        return TrafficStats.getTotalRxBytes();
    }

    @Override // yi.e
    public long d() {
        return TrafficStats.getTotalTxBytes();
    }

    @Override // yi.e
    public long e(int i10) {
        return TrafficStats.getUidTxBytes(i10);
    }

    public JSONObject f(ak.a aVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("min_duration_for_quality_increase_ms", aVar.f407a);
            jSONObject.put("max_duration_for_quality_decrease_ms", aVar.f408d);
            jSONObject.put("min_duration_to_retain_after_discard_ms", aVar.f409g);
            jSONObject.put("bandwidth_fraction", Float.valueOf(aVar.f410r));
            jSONObject.put("initial_bitrate_estimate", aVar.f411x);
            jSONObject.put("sliding_window_max_weight", aVar.f412y);
            jSONObject.put("bandwidth_override", aVar.B);
            jSONObject.put("initial_bitrate_estimate_wifi", aVar.D);
            jSONObject.put("initial_bitrate_estimate_2g", aVar.E);
            jSONObject.put("initial_bitrate_estimate_3g", aVar.F);
            jSONObject.put("initial_bitrate_estimate_lte", aVar.G);
            jSONObject.put("initial_bitrate_estimate_5g", aVar.H);
            jSONObject.put("initial_bitrate_estimate_5g_sa", aVar.J);
            jSONObject.put("initial_bitrate_estimate_5g_nsa", aVar.I);
            jSONObject.put("initial_bitrate_estimate_5g_mmwave", aVar.K);
            jSONObject.put("live_target_offset_ms", aVar.L);
            jSONObject.put("live_min_offset_ms", aVar.M);
            jSONObject.put("live_max_offset_ms", aVar.N);
            jSONObject.put("ignore_device_screen_resolution", aVar.O);
            jSONObject.put("live_min_playback_speed", Float.valueOf(aVar.P));
            jSONObject.put("live_max_playback_speed", Float.valueOf(aVar.Q));
            return jSONObject;
        } catch (JSONException e4) {
            return h0.b.x("AdaptiveConfigMapper", e4, e4);
        }
    }

    @Override // yi.e
    public long g(int i10) {
        return TrafficStats.getUidTxBytes(i10) + TrafficStats.getUidRxBytes(i10);
    }

    public JSONObject h(w wVar) throws JSONException {
        l.e(wVar, "input");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endpoint_type", wVar.f751a);
            jSONObject.put("url", wVar.f753c);
            jSONObject.put("connection_timeout_ms", wVar.f752b);
            jSONObject.put("follow_redirects", wVar.f754d);
            jSONObject.put("test_timeout_ms", wVar.f755e);
            return jSONObject;
        } catch (JSONException e4) {
            return h0.b.x("HttpHeadLatencyEndpointMapper", e4, e4);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public ak.a i(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r40v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public w j(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            int i10 = jSONObject.getInt("endpoint_type");
            String string = jSONObject.getString("url");
            int iOptInt = jSONObject.optInt("connection_timeout_ms", 1000);
            boolean zOptBoolean = jSONObject.optBoolean("follow_redirects", true);
            int iOptInt2 = jSONObject.optInt("test_timeout_ms", 2000);
            l.b(string);
            return new w(i10, iOptInt, string, zOptBoolean, iOptInt2);
        } catch (JSONException e4) {
            String str = "Can't mapTo() to HttpHeadLatencyEndpoint for input: " + jSONObject;
            ch.n.d("HttpHeadLatencyEndpointMapper", str, e4);
            cj.a.E(e4, str);
            return null;
        }
    }

    public l1 k(JSONObject jSONObject, l1 l1Var) {
        if (jSONObject == null) {
            return l1Var;
        }
        try {
            Integer numY = xu.d.y("count", jSONObject);
            int iIntValue = numY != null ? numY.intValue() : l1Var.f611a;
            Long lC = xu.d.C("same_location_interval_ms", jSONObject);
            long jLongValue = lC != null ? lC.longValue() : l1Var.f612b;
            Boolean boolR = xu.d.r("enable_information_elements", jSONObject);
            boolean zBooleanValue = boolR != null ? boolR.booleanValue() : l1Var.f613c;
            Integer numY2 = xu.d.y("information_elements_count", jSONObject);
            int iIntValue2 = numY2 != null ? numY2.intValue() : l1Var.f614d;
            Integer numY3 = xu.d.y("information_elements_byte_limit", jSONObject);
            return new l1(iIntValue, jLongValue, zBooleanValue, iIntValue2, numY3 != null ? numY3.intValue() : l1Var.f615e);
        } catch (JSONException e4) {
            ch.n.e("WifiScanConfigMapper", e4);
            cj.a.G(e4);
            return l1Var;
        }
    }

    @Override // zc.q
    public Object zza() {
        switch (this.f26403a) {
            case 1:
                return new Boolean(((Boolean) l7.f5107a.b()).booleanValue());
            case 2:
                List list = u.f27161a;
                Boolean bool = (Boolean) n9.f5144a.b();
                bool.getClass();
                return bool;
            case 3:
                List list2 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5006k0.b()).longValue());
            case 4:
                List list3 = u.f27161a;
                d7.f4955d.get();
                Long l10 = (Long) f7.T.b();
                l10.getClass();
                return l10;
            case j.STRING_FIELD_NUMBER /* 5 */:
                List list4 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.O.b()).longValue());
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                List list5 = u.f27161a;
                d7.f4955d.get();
                Long l11 = (Long) f7.f5028v0.b();
                l11.getClass();
                return l11;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list6 = u.f27161a;
                d7.f4955d.get();
                Long l12 = (Long) f7.F.b();
                l12.getClass();
                return l12;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                List list7 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5013o.b()).longValue());
            case 9:
                List list8 = u.f27161a;
                n8.f5142d.get();
                Long l13 = (Long) p8.f5164e.b();
                l13.getClass();
                return l13;
            case 10:
                List list9 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f4993d.b()).longValue());
            case 11:
                List list10 = u.f27161a;
                d7.f4955d.get();
                return (String) f7.Y.b();
            case 12:
                List list11 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5020r0.b()).longValue());
            case 13:
                List list12 = u.f27161a;
                d7.f4955d.get();
                Boolean bool2 = (Boolean) f7.C.b();
                bool2.getClass();
                return bool2;
            case 14:
                List list13 = u.f27161a;
                Boolean bool3 = (Boolean) q9.f5182a.b();
                bool3.getClass();
                return bool3;
            case 15:
                List list14 = u.f27161a;
                q8.f5180d.get();
                Boolean bool4 = (Boolean) s8.f5203f.b();
                bool4.getClass();
                return bool4;
            case 16:
                List list15 = u.f27161a;
                Boolean bool5 = (Boolean) o7.f5151b.b();
                bool5.getClass();
                return bool5;
            default:
                return new Boolean(((Boolean) g8.f5048a.b()).booleanValue());
        }
    }

    public /* synthetic */ g(cj.a aVar, int i10) {
        this.f26403a = i10;
    }
}
