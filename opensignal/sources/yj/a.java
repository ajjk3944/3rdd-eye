package yj;

import a2.b;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import br.l;
import ch.f;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xj.h;
import xu.d;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26405a;

    /* renamed from: d, reason: collision with root package name */
    public final f f26406d;

    public /* synthetic */ a(f fVar, int i10) {
        this.f26405a = i10;
        this.f26406d = fVar;
    }

    @Override // xj.h
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        switch (this.f26405a) {
            case 0:
                return b((CellIdentityCdma) obj);
            case 1:
                return c((CellIdentityGsm) obj);
            case 2:
                return d((CellIdentityLte) obj);
            case 3:
                return e(b.h(obj));
            case 4:
                return f(fh.b.i(obj));
            default:
                return g((CellIdentityWcdma) obj);
        }
    }

    public JSONObject b(CellIdentityCdma cellIdentityCdma) throws JSONException {
        CharSequence operatorAlphaShort;
        CharSequence operatorAlphaLong;
        l.e(cellIdentityCdma, "input");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "cdma");
        jSONObject.put("basestation_id", cellIdentityCdma.getBasestationId());
        jSONObject.put("latitude", cellIdentityCdma.getLatitude());
        jSONObject.put("longitude", cellIdentityCdma.getLongitude());
        jSONObject.put("network_id", cellIdentityCdma.getNetworkId());
        jSONObject.put("system_id", cellIdentityCdma.getSystemId());
        f fVar = this.f26406d;
        String string = null;
        d.Z(jSONObject, "operator_alpha_long", (!fVar.d() || (operatorAlphaLong = cellIdentityCdma.getOperatorAlphaLong()) == null) ? null : operatorAlphaLong.toString());
        if (fVar.d() && (operatorAlphaShort = cellIdentityCdma.getOperatorAlphaShort()) != null) {
            string = operatorAlphaShort.toString();
        }
        d.Z(jSONObject, "operator_alpha_short", string);
        return jSONObject;
    }

    public JSONObject c(CellIdentityGsm cellIdentityGsm) throws JSONException {
        JSONArray jSONArray;
        CharSequence operatorAlphaShort;
        CharSequence operatorAlphaLong;
        l.e(cellIdentityGsm, "input");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "gsm");
        f fVar = this.f26406d;
        jSONObject.putOpt("mcc", fVar.d() ? cellIdentityGsm.getMccString() : String.valueOf(cellIdentityGsm.getMcc()));
        jSONObject.putOpt("mnc", fVar.d() ? cellIdentityGsm.getMncString() : String.valueOf(cellIdentityGsm.getMnc()));
        jSONObject.put("lac", cellIdentityGsm.getLac());
        jSONObject.put("cid", cellIdentityGsm.getCid());
        String string = null;
        jSONObject.putOpt("arfcn", fVar.b() ? Integer.valueOf(cellIdentityGsm.getArfcn()) : null);
        jSONObject.putOpt("bsic", fVar.d() ? Integer.valueOf(cellIdentityGsm.getBsic()) : null);
        Set additionalPlmns = fVar.f() ? cellIdentityGsm.getAdditionalPlmns() : null;
        if (additionalPlmns != null) {
            jSONArray = new JSONArray();
            Iterator it = additionalPlmns.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        } else {
            jSONArray = null;
        }
        jSONObject.putOpt("additional_plmns", jSONArray);
        d.Z(jSONObject, "operator_alpha_long", (!fVar.d() || (operatorAlphaLong = cellIdentityGsm.getOperatorAlphaLong()) == null) ? null : operatorAlphaLong.toString());
        if (fVar.d() && (operatorAlphaShort = cellIdentityGsm.getOperatorAlphaShort()) != null) {
            string = operatorAlphaShort.toString();
        }
        d.Z(jSONObject, "operator_alpha_short", string);
        return jSONObject;
    }

    public JSONObject d(CellIdentityLte cellIdentityLte) throws JSONException {
        boolean zQ0;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        CharSequence operatorAlphaShort;
        CharSequence operatorAlphaLong;
        l.e(cellIdentityLte, "input");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "lte");
        f fVar = this.f26406d;
        jSONObject.putOpt("mcc", fVar.d() ? cellIdentityLte.getMccString() : String.valueOf(cellIdentityLte.getMcc()));
        jSONObject.putOpt("mnc", fVar.d() ? cellIdentityLte.getMncString() : String.valueOf(cellIdentityLte.getMnc()));
        jSONObject.put("ci", cellIdentityLte.getCi());
        jSONObject.put("tac", cellIdentityLte.getTac());
        jSONObject.put("pci", cellIdentityLte.getPci());
        String string = null;
        jSONObject.putOpt("erfcn", fVar.b() ? Integer.valueOf(cellIdentityLte.getEarfcn()) : null);
        jSONObject.putOpt("bandwidth", fVar.d() ? Integer.valueOf(cellIdentityLte.getBandwidth()) : null);
        String string2 = cellIdentityLte.toString();
        l.d(string2, "toString(...)");
        Matcher matcher = Pattern.compile("isEndcAvailable\\s*=\\s*(true|false)").matcher(string2);
        if (matcher.find()) {
            String strGroup = matcher.group();
            l.d(strGroup, "group(...)");
            zQ0 = tt.l.q0(strGroup, "true", false);
        } else {
            zQ0 = false;
        }
        jSONObject.put("endc_available", zQ0);
        Set additionalPlmns = fVar.f() ? cellIdentityLte.getAdditionalPlmns() : null;
        if (additionalPlmns != null) {
            jSONArray = new JSONArray();
            Iterator it = additionalPlmns.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        } else {
            jSONArray = null;
        }
        jSONObject.putOpt("additional_plmns", jSONArray);
        int[] bands = fVar.f() ? cellIdentityLte.getBands() : null;
        if (bands != null) {
            jSONArray2 = new JSONArray();
            for (int i10 : bands) {
                jSONArray2.put(i10);
            }
        } else {
            jSONArray2 = null;
        }
        jSONObject.putOpt("bands", jSONArray2);
        d.Z(jSONObject, "operator_alpha_long", (!fVar.d() || (operatorAlphaLong = cellIdentityLte.getOperatorAlphaLong()) == null) ? null : operatorAlphaLong.toString());
        if (fVar.d() && (operatorAlphaShort = cellIdentityLte.getOperatorAlphaShort()) != null) {
            string = operatorAlphaShort.toString();
        }
        d.Z(jSONObject, "operator_alpha_short", string);
        return jSONObject;
    }

    public JSONObject e(CellIdentityNr cellIdentityNr) throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        CharSequence operatorAlphaShort;
        CharSequence operatorAlphaLong;
        l.e(cellIdentityNr, "input");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "nr");
        jSONObject.putOpt("mcc", cellIdentityNr.getMccString());
        jSONObject.putOpt("mnc", cellIdentityNr.getMncString());
        jSONObject.put("nci", cellIdentityNr.getNci());
        jSONObject.putOpt("nrarfcn", Integer.valueOf(cellIdentityNr.getNrarfcn()));
        jSONObject.putOpt("pci", Integer.valueOf(cellIdentityNr.getPci()));
        jSONObject.putOpt("tac", Integer.valueOf(cellIdentityNr.getTac()));
        f fVar = this.f26406d;
        String string = null;
        int[] bands = fVar.f() ? cellIdentityNr.getBands() : null;
        if (bands != null) {
            jSONArray = new JSONArray();
            for (int i10 : bands) {
                jSONArray.put(i10);
            }
        } else {
            jSONArray = null;
        }
        jSONObject.putOpt("bands", jSONArray);
        Set additionalPlmns = fVar.f() ? cellIdentityNr.getAdditionalPlmns() : null;
        if (additionalPlmns != null) {
            jSONArray2 = new JSONArray();
            Iterator it = additionalPlmns.iterator();
            while (it.hasNext()) {
                jSONArray2.put(it.next());
            }
        } else {
            jSONArray2 = null;
        }
        jSONObject.putOpt("additional_plmns", jSONArray2);
        d.Z(jSONObject, "operator_alpha_long", (!fVar.d() || (operatorAlphaLong = cellIdentityNr.getOperatorAlphaLong()) == null) ? null : operatorAlphaLong.toString());
        if (fVar.d() && (operatorAlphaShort = cellIdentityNr.getOperatorAlphaShort()) != null) {
            string = operatorAlphaShort.toString();
        }
        d.Z(jSONObject, "operator_alpha_short", string);
        return jSONObject;
    }

    public JSONObject f(CellIdentityTdscdma cellIdentityTdscdma) throws JSONException {
        JSONArray jSONArray;
        CharSequence operatorAlphaShort;
        CharSequence operatorAlphaLong;
        l.e(cellIdentityTdscdma, "input");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "tdscdma");
        jSONObject.putOpt("mcc", cellIdentityTdscdma.getMccString());
        jSONObject.putOpt("mnc", cellIdentityTdscdma.getMncString());
        jSONObject.put("cid", cellIdentityTdscdma.getCid());
        jSONObject.put("cpid", cellIdentityTdscdma.getCpid());
        jSONObject.put("uarfcn", cellIdentityTdscdma.getUarfcn());
        jSONObject.put("lac", cellIdentityTdscdma.getLac());
        f fVar = this.f26406d;
        String string = null;
        Set additionalPlmns = fVar.f() ? cellIdentityTdscdma.getAdditionalPlmns() : null;
        if (additionalPlmns != null) {
            jSONArray = new JSONArray();
            Iterator it = additionalPlmns.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        } else {
            jSONArray = null;
        }
        jSONObject.putOpt("additional_plmns", jSONArray);
        d.Z(jSONObject, "operator_alpha_long", (!fVar.d() || (operatorAlphaLong = cellIdentityTdscdma.getOperatorAlphaLong()) == null) ? null : operatorAlphaLong.toString());
        if (fVar.d() && (operatorAlphaShort = cellIdentityTdscdma.getOperatorAlphaShort()) != null) {
            string = operatorAlphaShort.toString();
        }
        d.Z(jSONObject, "operator_alpha_short", string);
        return jSONObject;
    }

    public JSONObject g(CellIdentityWcdma cellIdentityWcdma) throws JSONException {
        JSONArray jSONArray;
        CharSequence operatorAlphaShort;
        CharSequence operatorAlphaLong;
        l.e(cellIdentityWcdma, "input");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "wcdma");
        f fVar = this.f26406d;
        jSONObject.putOpt("mcc", fVar.d() ? cellIdentityWcdma.getMccString() : String.valueOf(cellIdentityWcdma.getMcc()));
        jSONObject.putOpt("mnc", fVar.d() ? cellIdentityWcdma.getMncString() : String.valueOf(cellIdentityWcdma.getMnc()));
        jSONObject.put("cid", cellIdentityWcdma.getCid());
        String string = null;
        jSONObject.putOpt("uarfcn", fVar.b() ? Integer.valueOf(cellIdentityWcdma.getUarfcn()) : null);
        jSONObject.putOpt("lac", Integer.valueOf(cellIdentityWcdma.getLac()));
        jSONObject.putOpt("psc", Integer.valueOf(cellIdentityWcdma.getPsc()));
        Set additionalPlmns = fVar.f() ? cellIdentityWcdma.getAdditionalPlmns() : null;
        if (additionalPlmns != null) {
            jSONArray = new JSONArray();
            Iterator it = additionalPlmns.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        } else {
            jSONArray = null;
        }
        jSONObject.putOpt("additional_plmns", jSONArray);
        d.Z(jSONObject, "operator_alpha_long", (!fVar.d() || (operatorAlphaLong = cellIdentityWcdma.getOperatorAlphaLong()) == null) ? null : operatorAlphaLong.toString());
        if (fVar.d() && (operatorAlphaShort = cellIdentityWcdma.getOperatorAlphaShort()) != null) {
            string = operatorAlphaShort.toString();
        }
        d.Z(jSONObject, "operator_alpha_short", string);
        return jSONObject;
    }
}
