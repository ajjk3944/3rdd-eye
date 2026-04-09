package T4;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputEditText;
import com.lefan.signal.ui.other.DewPointActivity;
import com.lefan.signal.ui.other.HumidityView2;
import com.lefan.signal.ui.sensor.TemperatureView;
import java.util.Arrays;
import java.util.Locale;
import o.Q0;

/* loaded from: classes.dex */
public final class c implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f3593b;

    public /* synthetic */ c(KeyEvent.Callback callback, int i) {
        this.f3592a = i;
        this.f3593b = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Float fU;
        String str;
        String str2;
        String str3;
        String str4;
        Float fU2;
        String str5;
        String str6;
        String str7;
        String str8;
        Float fU3;
        String str9;
        int i = this.f3592a;
        KeyEvent.Callback callback = this.f3593b;
        switch (i) {
            case 0:
                DewPointActivity dewPointActivity = (DewPointActivity) callback;
                if (editable == null || editable.length() == 0) {
                    return;
                }
                TextInputEditText textInputEditText = dewPointActivity.f19067h0;
                if (textInputEditText == null) {
                    q5.i.g("temperatureInput");
                    throw null;
                }
                if (!textInputEditText.isFocusable() || (fU = y5.j.U(editable.toString())) == null) {
                    return;
                }
                float fFloatValue = fU.floatValue();
                boolean z6 = dewPointActivity.f19058X;
                if (z6) {
                    if (fFloatValue < -273.15f) {
                        TextInputEditText textInputEditText2 = dewPointActivity.f19067h0;
                        if (textInputEditText2 == null) {
                            q5.i.g("temperatureInput");
                            throw null;
                        }
                        Float fValueOf = Float.valueOf(-273.15f);
                        if (R2.a.f3390d) {
                            Locale locale = F4.e.f1457a;
                            str4 = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                        } else {
                            str4 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                        }
                        textInputEditText2.setText(str4);
                        return;
                    }
                    if (fFloatValue > 100.0f) {
                        TextInputEditText textInputEditText3 = dewPointActivity.f19067h0;
                        if (textInputEditText3 == null) {
                            q5.i.g("temperatureInput");
                            throw null;
                        }
                        Float fValueOf2 = Float.valueOf(100.0f);
                        if (R2.a.f3390d) {
                            Locale locale2 = F4.e.f1457a;
                            str3 = String.format(F4.e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                        } else {
                            str3 = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                        }
                        textInputEditText3.setText(str3);
                        return;
                    }
                } else {
                    if (fFloatValue < -459.67f) {
                        TextInputEditText textInputEditText4 = dewPointActivity.f19067h0;
                        if (textInputEditText4 == null) {
                            q5.i.g("temperatureInput");
                            throw null;
                        }
                        Float fValueOf3 = Float.valueOf(-459.67f);
                        if (R2.a.f3390d) {
                            Locale locale3 = F4.e.f1457a;
                            str2 = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                        } else {
                            str2 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                        }
                        textInputEditText4.setText(str2);
                        return;
                    }
                    if (fFloatValue > 212.0f) {
                        TextInputEditText textInputEditText5 = dewPointActivity.f19067h0;
                        if (textInputEditText5 == null) {
                            q5.i.g("temperatureInput");
                            throw null;
                        }
                        Float fValueOf4 = Float.valueOf(212.0f);
                        if (R2.a.f3390d) {
                            Locale locale4 = F4.e.f1457a;
                            str = String.format(F4.e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf4}, 1));
                        } else {
                            str = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf4}, 1));
                        }
                        textInputEditText5.setText(str);
                        return;
                    }
                }
                if (!z6) {
                    fFloatValue = ((fFloatValue - 32.0f) * 5) / 9;
                }
                dewPointActivity.f19077r0 = fFloatValue;
                TemperatureView temperatureView = dewPointActivity.f19061a0;
                if (temperatureView == null) {
                    q5.i.g("temperatureView");
                    throw null;
                }
                temperatureView.setTemperature(fFloatValue);
                if (dewPointActivity.f19054T && dewPointActivity.f19055U) {
                    return;
                }
                dewPointActivity.C();
                return;
            case 1:
                Float fValueOf5 = Float.valueOf(0.0f);
                DewPointActivity dewPointActivity2 = (DewPointActivity) callback;
                if (editable == null || editable.length() == 0) {
                    return;
                }
                TextInputEditText textInputEditText6 = dewPointActivity2.f19068i0;
                if (textInputEditText6 == null) {
                    q5.i.g("humidityInput");
                    throw null;
                }
                if (!textInputEditText6.isFocusable() || (fU2 = y5.j.U(editable.toString())) == null) {
                    return;
                }
                float fFloatValue2 = fU2.floatValue();
                if (dewPointActivity2.f19059Y) {
                    if (fFloatValue2 < 0.0f) {
                        TextInputEditText textInputEditText7 = dewPointActivity2.f19068i0;
                        if (textInputEditText7 == null) {
                            q5.i.g("humidityInput");
                            throw null;
                        }
                        if (R2.a.f3390d) {
                            Locale locale5 = F4.e.f1457a;
                            str8 = String.format(F4.e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf5}, 1));
                        } else {
                            str8 = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf5}, 1));
                        }
                        textInputEditText7.setText(str8);
                        return;
                    }
                    if (fFloatValue2 > 100.0f) {
                        TextInputEditText textInputEditText8 = dewPointActivity2.f19068i0;
                        if (textInputEditText8 == null) {
                            q5.i.g("humidityInput");
                            throw null;
                        }
                        Float fValueOf6 = Float.valueOf(100.0f);
                        if (R2.a.f3390d) {
                            Locale locale6 = F4.e.f1457a;
                            str7 = String.format(F4.e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf6}, 1));
                        } else {
                            str7 = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf6}, 1));
                        }
                        textInputEditText8.setText(str7);
                        return;
                    }
                    dewPointActivity2.f19078s0 = fFloatValue2;
                    HumidityView2 humidityView2 = dewPointActivity2.b0;
                    if (humidityView2 == null) {
                        q5.i.g("humidityView2");
                        throw null;
                    }
                    humidityView2.setHumidity(fFloatValue2);
                } else {
                    if (fFloatValue2 < 0.0f) {
                        TextInputEditText textInputEditText9 = dewPointActivity2.f19068i0;
                        if (textInputEditText9 == null) {
                            q5.i.g("humidityInput");
                            throw null;
                        }
                        if (R2.a.f3390d) {
                            Locale locale7 = F4.e.f1457a;
                            str6 = String.format(F4.e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf5}, 1));
                        } else {
                            str6 = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf5}, 1));
                        }
                        textInputEditText9.setText(str6);
                        return;
                    }
                    if (fFloatValue2 > 3000.0f) {
                        TextInputEditText textInputEditText10 = dewPointActivity2.f19068i0;
                        if (textInputEditText10 == null) {
                            q5.i.g("humidityInput");
                            throw null;
                        }
                        Float fValueOf7 = Float.valueOf(3000.0f);
                        if (R2.a.f3390d) {
                            Locale locale8 = F4.e.f1457a;
                            str5 = String.format(F4.e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf7}, 1));
                        } else {
                            str5 = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf7}, 1));
                        }
                        textInputEditText10.setText(str5);
                        return;
                    }
                    dewPointActivity2.f19078s0 = (((float) (((fFloatValue2 * 8.314d) * (dewPointActivity2.f19077r0 + 273.15f)) / 18.016d)) / ((float) (Math.pow(10.0d, 8.07131d - (1730.63d / (dewPointActivity2.f19077r0 + 233.426d))) * 133.322d))) * 100;
                    HumidityView2 humidityView22 = dewPointActivity2.b0;
                    if (humidityView22 == null) {
                        q5.i.g("humidityView2");
                        throw null;
                    }
                    humidityView22.setHumidity(fFloatValue2);
                }
                if (dewPointActivity2.f19054T && dewPointActivity2.f19056V) {
                    return;
                }
                dewPointActivity2.C();
                return;
            case 2:
                DewPointActivity dewPointActivity3 = (DewPointActivity) callback;
                if (editable == null || editable.length() == 0) {
                    return;
                }
                TextInputEditText textInputEditText11 = dewPointActivity3.f19065f0;
                if (textInputEditText11 == null) {
                    q5.i.g("pressureInput");
                    throw null;
                }
                if (!textInputEditText11.isFocusable() || (fU3 = y5.j.U(editable.toString())) == null) {
                    return;
                }
                float fFloatValue3 = fU3.floatValue();
                if (fFloatValue3 < 0.0f) {
                    TextInputEditText textInputEditText12 = dewPointActivity3.f19065f0;
                    if (textInputEditText12 == null) {
                        q5.i.g("pressureInput");
                        throw null;
                    }
                    Float fValueOf8 = Float.valueOf(0.0f);
                    if (R2.a.f3390d) {
                        Locale locale9 = F4.e.f1457a;
                        str9 = String.format(F4.e.b(), "%.0f", Arrays.copyOf(new Object[]{fValueOf8}, 1));
                    } else {
                        str9 = String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{fValueOf8}, 1));
                    }
                    textInputEditText12.setText(str9);
                    return;
                }
                switch (dewPointActivity3.f19075p0) {
                    case 0:
                        dewPointActivity3.f19079t0 = fFloatValue3;
                        break;
                    case 1:
                        dewPointActivity3.f19079t0 = fFloatValue3 * 1000.0f;
                        break;
                    case 2:
                        dewPointActivity3.f19079t0 = fFloatValue3 * 0.01f;
                        break;
                    case 3:
                        dewPointActivity3.f19079t0 = fFloatValue3 * 100.0f;
                        break;
                    case 4:
                        dewPointActivity3.f19079t0 = fFloatValue3 * 10.0f;
                        break;
                    case 5:
                        dewPointActivity3.f19079t0 = fFloatValue3 * 1013.25f;
                        break;
                    case 6:
                        dewPointActivity3.f19079t0 = fFloatValue3 * 760.0f;
                        break;
                    case 7:
                        dewPointActivity3.f19079t0 = fFloatValue3 * 3386.39f;
                        break;
                    case 8:
                        dewPointActivity3.f19079t0 = fFloatValue3 * 6894.76f;
                        break;
                }
                if (dewPointActivity3.f19054T && dewPointActivity3.f19057W) {
                    return;
                }
                dewPointActivity3.C();
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i3, int i6) {
        int i7 = this.f3592a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i3, int i6) {
        switch (this.f3592a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                SearchView searchView = (SearchView) this.f3593b;
                Editable text = searchView.f4899D.getText();
                searchView.f4932p0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.v(!zIsEmpty);
                int i7 = 8;
                if (searchView.f4930n0 && !searchView.f4923g0 && zIsEmpty) {
                    searchView.f4904I.setVisibility(8);
                    i7 = 0;
                }
                searchView.f4906K.setVisibility(i7);
                searchView.r();
                searchView.u();
                if (searchView.b0 != null && !TextUtils.equals(charSequence, searchView.f4931o0)) {
                    Q0 q02 = searchView.b0;
                    charSequence.toString();
                    q02.getClass();
                }
                searchView.f4931o0 = charSequence.toString();
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(int i, int i3, int i6, CharSequence charSequence) {
    }

    private final void c(int i, int i3, int i6, CharSequence charSequence) {
    }

    private final void d(int i, int i3, int i6, CharSequence charSequence) {
    }

    private final void e(int i, int i3, int i6, CharSequence charSequence) {
    }

    private final void f(int i, int i3, int i6, CharSequence charSequence) {
    }

    private final void g(int i, int i3, int i6, CharSequence charSequence) {
    }

    private final void h(int i, int i3, int i6, CharSequence charSequence) {
    }
}
