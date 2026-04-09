package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
final class n extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ OssLicensesMenuActivity f36951a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(OssLicensesMenuActivity ossLicensesMenuActivity, Context context) {
        super(context, b.d(ossLicensesMenuActivity.f36930G), b.e(ossLicensesMenuActivity.f36930G), new ArrayList());
        this.f36951a = ossLicensesMenuActivity;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater layoutInflater = this.f36951a.getLayoutInflater();
            a aVar = this.f36951a.f36930G;
            view = layoutInflater.inflate((XmlPullParser) aVar.f36933a.getXml(b.d(aVar)), viewGroup, false);
        }
        ((TextView) view.findViewById(b.e(this.f36951a.f36930G))).setText(((G3.e) getItem(i10)).c());
        return view;
    }
}
