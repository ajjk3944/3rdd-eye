package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sm extends BaseAdapter {
    public final Calendar f;
    public final int g;
    public final int h;

    public sm() {
        Calendar calendarC = g41.c(null);
        this.f = calendarC;
        this.g = calendarC.getMaximum(7);
        this.h = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.g;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.h;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.h;
        int i3 = this.g;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public sm(int i) {
        Calendar calendarC = g41.c(null);
        this.f = calendarC;
        this.g = calendarC.getMaximum(7);
        this.h = i;
    }
}
