package com.bytedance.sdk.openadsdk.rie;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    private SharedPreferences emc;
    private final String xq;
    private final Context ypw;

    public ypw(Context context, String str) {
        this.ypw = context;
        this.xq = str;
    }

    private SharedPreferences ypw() {
        Context context;
        SharedPreferences sharedPreferences = this.emc;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.xq) || (context = this.ypw) == null) {
            return null;
        }
        try {
            this.emc = context.getSharedPreferences(this.xq, 0);
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
        return this.emc;
    }

    public void emc(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferencesYpw = ypw();
            if (sharedPreferencesYpw != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesYpw.edit();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                editorEdit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                editorEdit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                editorEdit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                editorEdit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                Double d6 = (Double) obj;
                                d6.doubleValue();
                                editorEdit.putFloat(next, d6.floatValue());
                            }
                        }
                    } catch (Throwable th) {
                        Log.e("SPUnit", th.getMessage());
                    }
                }
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
    }

    public long ypw(String str, long j6) {
        try {
            SharedPreferences sharedPreferencesYpw = ypw();
            if (sharedPreferencesYpw != null && sharedPreferencesYpw.contains(str)) {
                return sharedPreferencesYpw.getLong(str, j6);
            }
            return j6;
        } catch (Throwable th) {
            Log.i("SPUnit", this.xq + th.getMessage());
            return j6;
        }
    }

    public void emc(String str, long j6) {
        try {
            SharedPreferences sharedPreferencesYpw = ypw();
            if (sharedPreferencesYpw != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesYpw.edit();
                editorEdit.putLong(str, j6);
                editorEdit.apply();
            }
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
    }

    public int emc(String str, int i) {
        try {
            SharedPreferences sharedPreferencesYpw = ypw();
            if (sharedPreferencesYpw != null && sharedPreferencesYpw.contains(str)) {
                return sharedPreferencesYpw.getInt(str, i);
            }
            return i;
        } catch (Throwable th) {
            Log.i("SPUnit", this.xq + th.getMessage());
            return i;
        }
    }

    public String emc(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesYpw = ypw();
            if (sharedPreferencesYpw != null && sharedPreferencesYpw.contains(str)) {
                return sharedPreferencesYpw.getString(str, str2);
            }
            return str2;
        } catch (Throwable th) {
            Log.i("SPUnit", this.xq + th.getMessage());
            return str2;
        }
    }

    public boolean emc(String str, boolean z6) {
        try {
            SharedPreferences sharedPreferencesYpw = ypw();
            if (sharedPreferencesYpw != null && sharedPreferencesYpw.contains(str)) {
                return sharedPreferencesYpw.getBoolean(str, z6);
            }
            return z6;
        } catch (Throwable th) {
            Log.i("SPUnit", this.xq + th.getMessage());
            return z6;
        }
    }

    public void emc() {
        SharedPreferences sharedPreferencesYpw = ypw();
        if (sharedPreferencesYpw != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesYpw.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }
}
