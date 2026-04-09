package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vl0 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    public final Preference f;

    public vl0(Preference preference) {
        this.f = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.f;
        CharSequence charSequenceF = preference.f();
        if (!preference.H || TextUtils.isEmpty(charSequenceF)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceF);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.f;
        ClipboardManager clipboardManager = (ClipboardManager) preference.f.getSystemService("clipboard");
        CharSequence charSequenceF = preference.f();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceF));
        Context context = preference.f;
        Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceF), 0).show();
        return true;
    }
}
