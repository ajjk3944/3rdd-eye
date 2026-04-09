package com.staircase3.opensignal.viewcontrollers;

import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class CityProvider {

    public static class LoadCitiesAsyncTask extends AsyncTask<CityProviderParams, Void, List<sm.a>> {

        /* renamed from: a, reason: collision with root package name */
        public TabCoverage f6199a;

        private LoadCitiesAsyncTask() {
        }

        @Override // android.os.AsyncTask
        public final List<sm.a> doInBackground(CityProviderParams[] cityProviderParamsArr) {
            ArrayList arrayList = new ArrayList();
            CityProviderParams cityProviderParams = cityProviderParamsArr[0];
            if (cityProviderParams != null) {
                Context context = cityProviderParams.f6200a;
                this.f6199a = cityProviderParams.f6202c;
                try {
                    return io.sentry.config.a.S(context.getResources().openRawResource(cityProviderParams.f6201b));
                } catch (Resources.NotFoundException | NullPointerException unused) {
                }
            }
            return arrayList;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(List<sm.a> list) {
            List<sm.a> list2 = list;
            TabCoverage tabCoverage = this.f6199a;
            if (tabCoverage != null) {
                tabCoverage.I0.addAll(list2);
            }
        }

        public /* synthetic */ LoadCitiesAsyncTask(int i10) {
            this();
        }
    }
}
