package B4;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.lefan.base.activity.PrivacyActivity;

/* loaded from: classes.dex */
public final class u extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f755b;

    public /* synthetic */ u(v vVar, int i) {
        this.f754a = i;
        this.f755b = vVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.f754a) {
            case 0:
                q5.i.e(view, "p0");
                v vVar = this.f755b;
                Intent intent = new Intent(vVar.m(), (Class<?>) PrivacyActivity.class);
                intent.putExtra("my_name", "agreement");
                vVar.W(intent);
                break;
            default:
                q5.i.e(view, "p0");
                v vVar2 = this.f755b;
                Intent intent2 = new Intent(vVar2.m(), (Class<?>) PrivacyActivity.class);
                intent2.putExtra("my_name", "privacy");
                vVar2.W(intent2);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f754a) {
            case 0:
                q5.i.e(textPaint, "ds");
                textPaint.setColorFilter(new PorterDuffColorFilter(-16776961, PorterDuff.Mode.SRC_ATOP));
                super.updateDrawState(textPaint);
                break;
            default:
                q5.i.e(textPaint, "ds");
                textPaint.setColorFilter(new PorterDuffColorFilter(-16776961, PorterDuff.Mode.SRC_ATOP));
                super.updateDrawState(textPaint);
                break;
        }
    }
}
