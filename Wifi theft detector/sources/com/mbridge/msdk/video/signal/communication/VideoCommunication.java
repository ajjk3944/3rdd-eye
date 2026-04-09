package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class VideoCommunication extends BaseVideoCommunication {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f19255j = 0;

    /* renamed from: i, reason: collision with root package name */
    private Handler f19256i = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19257a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19258b;

        public a(Object obj, String str) {
            this.f19257a = obj;
            this.f19258b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.progressBarOperate(this.f19257a, this.f19258b);
        }
    }

    public class a0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19260a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19261b;

        public a0(Object obj, String str) {
            this.f19260a = obj;
            this.f19261b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.setViewRect(this.f19260a, this.f19261b);
        }
    }

    public class a1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19263a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19264b;

        public a1(Object obj, String str) {
            this.f19263a = obj;
            this.f19264b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerUpdateFrame(this.f19263a, this.f19264b);
        }
    }

    public class a2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19266a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19267b;

        public a2(Object obj, String str) {
            this.f19266a = obj;
            this.f19267b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getRewardUnitSetting(this.f19266a, this.f19267b);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19269a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19270b;

        public b(Object obj, String str) {
            this.f19269a = obj;
            this.f19270b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getCurrentProgress(this.f19269a, this.f19270b);
        }
    }

    public class b0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19272a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19273b;

        public b0(Object obj, String str) {
            this.f19272a = obj;
            this.f19273b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.removeFromSuperView(this.f19272a, this.f19273b);
        }
    }

    public class b1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19275a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19276b;

        public b1(Object obj, String str) {
            this.f19275a = obj;
            this.f19276b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerMute(this.f19275a, this.f19276b);
        }
    }

    public class b2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19278a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19279b;

        public b2(Object obj, String str) {
            this.f19278a = obj;
            this.f19279b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getUnitSetting(this.f19278a, this.f19279b);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19281a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19282b;

        public c(Object obj, String str) {
            this.f19281a = obj;
            this.f19282b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showVideoClickView(this.f19281a, this.f19282b);
        }
    }

    public class c0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19284a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19285b;

        public c0(Object obj, String str) {
            this.f19284a = obj;
            this.f19285b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.appendSubView(this.f19284a, this.f19285b);
        }
    }

    public class c1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19287a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19288b;

        public c1(Object obj, String str) {
            this.f19287a = obj;
            this.f19288b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showVideoLocation(this.f19287a, this.f19288b);
        }
    }

    public class c2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19290a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19291b;

        public c2(Object obj, String str) {
            this.f19290a = obj;
            this.f19291b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getEncryptPrice(this.f19290a, this.f19291b);
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19293a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19294b;

        public d(Object obj, String str) {
            this.f19293a = obj;
            this.f19294b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setScaleFitXY(this.f19293a, this.f19294b);
        }
    }

    public class d0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19296a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19297b;

        public d0(Object obj, String str) {
            this.f19296a = obj;
            this.f19297b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.appendViewTo(this.f19296a, this.f19297b);
        }
    }

    public class d1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19299a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19300b;

        public d1(Object obj, String str) {
            this.f19299a = obj;
            this.f19300b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerUnmute(this.f19299a, this.f19300b);
        }
    }

    public class d2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19302a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19303b;

        public d2(Object obj, String str) {
            this.f19302a = obj;
            this.f19303b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeVideoOperte(this.f19302a, this.f19303b);
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19305a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19306b;

        public e(Object obj, String str) {
            this.f19305a = obj;
            this.f19306b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.notifyCloseBtn(this.f19305a, this.f19306b);
        }
    }

    public class e0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19308a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19309b;

        public e0(Object obj, String str) {
            this.f19308a = obj;
            this.f19309b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.onlyAppendSubView(this.f19308a, this.f19309b);
        }
    }

    public class e1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19311a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19312b;

        public e1(Object obj, String str) {
            this.f19311a = obj;
            this.f19312b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerGetMuteState(this.f19311a, this.f19312b);
        }
    }

    public class e2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19314a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19315b;

        public e2(Object obj, String str) {
            this.f19314a = obj;
            this.f19315b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.progressOperate(this.f19314a, this.f19315b);
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19317a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19318b;

        public f(Object obj, String str) {
            this.f19317a = obj;
            this.f19318b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.toggleCloseBtn(this.f19317a, this.f19318b);
        }
    }

    public class f0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19320a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19321b;

        public f0(Object obj, String str) {
            this.f19320a = obj;
            this.f19321b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.onlyAppendViewTo(this.f19320a, this.f19321b);
        }
    }

    public class f1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19323a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19324b;

        public f1(Object obj, String str) {
            this.f19323a = obj;
            this.f19324b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerSetSource(this.f19323a, this.f19324b);
        }
    }

    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19326a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19327b;

        public g(Object obj, String str) {
            this.f19326a = obj;
            this.f19327b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.handlerH5Exception(this.f19326a, this.f19327b);
        }
    }

    public class g0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19329a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19330b;

        public g0(Object obj, String str) {
            this.f19329a = obj;
            this.f19330b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.statistics(this.f19329a, this.f19330b);
        }
    }

    public class g1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19332a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19333b;

        public g1(Object obj, String str) {
            this.f19332a = obj;
            this.f19333b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerSetRenderType(this.f19332a, this.f19333b);
        }
    }

    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19335a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19336b;

        public h(Object obj, String str) {
            this.f19335a = obj;
            this.f19336b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.isSystemResume(this.f19335a, this.f19336b);
        }
    }

    public class h0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19338a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19339b;

        public h0(Object obj, String str) {
            this.f19338a = obj;
            this.f19339b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.bringViewToFront(this.f19338a, this.f19339b);
        }
    }

    public class h1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19341a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19342b;

        public h1(Object obj, String str) {
            this.f19341a = obj;
            this.f19342b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.preloadSubPlayTemplateView(this.f19341a, this.f19342b);
        }
    }

    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19344a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19345b;

        public i(Object obj, String str) {
            this.f19344a = obj;
            this.f19345b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.readyStatus(this.f19344a, this.f19345b);
        }
    }

    public class i0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19347a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19348b;

        public i0(Object obj, String str) {
            this.f19347a = obj;
            this.f19348b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.hideView(this.f19347a, this.f19348b);
        }
    }

    public class i1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19350a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19351b;

        public i1(Object obj, String str) {
            this.f19350a = obj;
            this.f19351b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.closeAd(this.f19350a, this.f19351b);
        }
    }

    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19353a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19354b;

        public j(Object obj, String str) {
            this.f19353a = obj;
            this.f19354b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playVideoFinishOperate(this.f19353a, this.f19354b);
        }
    }

    public class j0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19356a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19357b;

        public j0(Object obj, String str) {
            this.f19356a = obj;
            this.f19357b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.showView(this.f19356a, this.f19357b);
        }
    }

    public class j1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19359a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19360b;

        public j1(Object obj, String str) {
            this.f19359a = obj;
            this.f19360b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.broadcast(this.f19359a, this.f19360b);
        }
    }

    public class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19362a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19363b;

        public k(Object obj, String str) {
            this.f19362a = obj;
            this.f19363b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.init(this.f19362a, this.f19363b);
        }
    }

    public class k0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19365a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19366b;

        public k0(Object obj, String str) {
            this.f19365a = obj;
            this.f19366b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.setViewBgColor(this.f19365a, this.f19366b);
        }
    }

    public class k1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19368a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19369b;

        public k1(Object obj, String str) {
            this.f19368a = obj;
            this.f19369b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.ivRewardAdsWithoutVideo(this.f19368a, this.f19369b);
        }
    }

    public class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19371a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19372b;

        public l(Object obj, String str) {
            this.f19371a = obj;
            this.f19372b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.openURL(this.f19371a, this.f19372b);
        }
    }

    public class l0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19374a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19375b;

        public l0(Object obj, String str) {
            this.f19374a = obj;
            this.f19375b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.setViewAlpha(this.f19374a, this.f19375b);
        }
    }

    public class l1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19377a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19378b;

        public l1(Object obj, String str) {
            this.f19377a = obj;
            this.f19378b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.setSubPlayTemplateInfo(this.f19377a, this.f19378b);
        }
    }

    public class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19380a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19381b;

        public m(Object obj, String str) {
            this.f19380a = obj;
            this.f19381b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showAlertView(this.f19380a, this.f19381b);
        }
    }

    public class m0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19383a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19384b;

        public m0(Object obj, String str) {
            this.f19383a = obj;
            this.f19384b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.setViewScale(this.f19383a, this.f19384b);
        }
    }

    public class m1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19386a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19387b;

        public m1(Object obj, String str) {
            this.f19386a = obj;
            this.f19387b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.webviewFireEvent(this.f19386a, this.f19387b);
        }
    }

    public class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19389a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19390b;

        public n(Object obj, String str) {
            this.f19389a = obj;
            this.f19390b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeWeb(this.f19389a, this.f19390b);
        }
    }

    public class n0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19392a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19393b;

        public n0(Object obj, String str) {
            this.f19392a = obj;
            this.f19393b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.insertViewAbove(this.f19392a, this.f19393b);
        }
    }

    public class n1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19395a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19396b;

        public n1(Object obj, String str) {
            this.f19395a = obj;
            this.f19396b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.soundOperate(this.f19395a, this.f19396b);
        }
    }

    public class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19398a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19399b;

        public o(Object obj, String str) {
            this.f19398a = obj;
            this.f19399b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getSDKInfo(this.f19398a, this.f19399b);
        }
    }

    public class o0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19401a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19402b;

        public o0(Object obj, String str) {
            this.f19401a = obj;
            this.f19402b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.insertViewBelow(this.f19401a, this.f19402b);
        }
    }

    public class o1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19404a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19405b;

        public o1(Object obj, String str) {
            this.f19404a = obj;
            this.f19405b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.increaseOfferFrequence(this.f19404a, this.f19405b);
        }
    }

    public class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19407a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19408b;

        public p(Object obj, String str) {
            this.f19407a = obj;
            this.f19408b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.getFileInfo(this.f19407a, this.f19408b);
        }
    }

    public class p0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19410a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19411b;

        public p0(Object obj, String str) {
            this.f19410a = obj;
            this.f19411b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.onlyInsertViewAbove(this.f19410a, this.f19411b);
        }
    }

    public class p1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19413a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19414b;

        public p1(Object obj, String str) {
            this.f19413a = obj;
            this.f19414b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.handleNativeObject(this.f19413a, this.f19414b);
        }
    }

    public class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19416a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19417b;

        public q(Object obj, String str) {
            this.f19416a = obj;
            this.f19417b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.loadads(this.f19416a, this.f19417b);
        }
    }

    public class q0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19419a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19420b;

        public q0(Object obj, String str) {
            this.f19419a = obj;
            this.f19420b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.onlyInsertViewBelow(this.f19419a, this.f19420b);
        }
    }

    public class q1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19422a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19423b;

        public q1(Object obj, String str) {
            this.f19422a = obj;
            this.f19423b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.loadingResourceStatus(this.f19422a, this.f19423b);
        }
    }

    public class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19425a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19426b;

        public r(Object obj, String str) {
            this.f19425a = obj;
            this.f19426b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.reactDeveloper(this.f19425a, this.f19426b);
        }
    }

    public class r0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19428a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19429b;

        public r0(Object obj, String str) {
            this.f19428a = obj;
            this.f19429b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.triggerCloseBtn(this.f19428a, this.f19429b);
        }
    }

    public class r1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19431a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19432b;

        public r1(Object obj, String str) {
            this.f19431a = obj;
            this.f19432b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.createNativeEC(this.f19431a, this.f19432b);
        }
    }

    public class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19434a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19435b;

        public s(Object obj, String str) {
            this.f19434a = obj;
            this.f19435b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.reportUrls(this.f19434a, this.f19435b);
        }
    }

    public class s0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19437a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19438b;

        public s0(Object obj, String str) {
            this.f19437a = obj;
            this.f19438b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.webviewLoad(this.f19437a, this.f19438b);
        }
    }

    public class s1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19440a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19441b;

        public s1(Object obj, String str) {
            this.f19440a = obj;
            this.f19441b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setCacheItem(this.f19440a, this.f19441b);
        }
    }

    public class t implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19443a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19444b;

        public t(Object obj, String str) {
            this.f19443a = obj;
            this.f19444b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.createWebview(this.f19443a, this.f19444b);
        }
    }

    public class t0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19446a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19447b;

        public t0(Object obj, String str) {
            this.f19446a = obj;
            this.f19447b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.webviewReload(this.f19446a, this.f19447b);
        }
    }

    public class t1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19449a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19450b;

        public t1(Object obj, String str) {
            this.f19449a = obj;
            this.f19450b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.removeCacheItem(this.f19449a, this.f19450b);
        }
    }

    public class u implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19452a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19453b;

        public u(Object obj, String str) {
            this.f19452a = obj;
            this.f19453b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.createView(this.f19452a, this.f19453b);
        }
    }

    public class u0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19455a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19456b;

        public u0(Object obj, String str) {
            this.f19455a = obj;
            this.f19456b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.webviewGoBack(this.f19455a, this.f19456b);
        }
    }

    public class u1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19458a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19459b;

        public u1(Object obj, String str) {
            this.f19458a = obj;
            this.f19459b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getAllCache(this.f19458a, this.f19459b);
        }
    }

    public class v implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19461a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19462b;

        public v(Object obj, String str) {
            this.f19461a = obj;
            this.f19462b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.click(this.f19461a, this.f19462b);
        }
    }

    public class v0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19464a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19465b;

        public v0(Object obj, String str) {
            this.f19464a = obj;
            this.f19465b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.webviewGoForward(this.f19464a, this.f19465b);
        }
    }

    public class v1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19467a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19468b;

        public v1(Object obj, String str) {
            this.f19467a = obj;
            this.f19468b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.clearAllCache(this.f19467a, this.f19468b);
        }
    }

    public class w implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19470a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19471b;

        public w(Object obj, String str) {
            this.f19470a = obj;
            this.f19471b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.createPlayerView(this.f19470a, this.f19471b);
        }
    }

    public class w0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19473a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19474b;

        public w0(Object obj, String str) {
            this.f19473a = obj;
            this.f19474b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerPlay(this.f19473a, this.f19474b);
        }
    }

    public class w1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19476a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19477b;

        public w1(Object obj, String str) {
            this.f19476a = obj;
            this.f19477b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getCutout(this.f19476a, this.f19477b);
        }
    }

    public class x implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19479a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19480b;

        public x(Object obj, String str) {
            this.f19479a = obj;
            this.f19480b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.createSubPlayTemplateView(this.f19479a, this.f19480b);
        }
    }

    public class x0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19482a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19483b;

        public x0(Object obj, String str) {
            this.f19482a = obj;
            this.f19483b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerPause(this.f19482a, this.f19483b);
        }
    }

    public class x1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19485a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19486b;

        public x1(Object obj, String str) {
            this.f19485a = obj;
            this.f19486b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getAppSetting(this.f19485a, this.f19486b);
        }
    }

    public class y implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19488a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19489b;

        public y(Object obj, String str) {
            this.f19488a = obj;
            this.f19489b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.destroyComponent(this.f19488a, this.f19489b);
        }
    }

    public class y0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19491a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19492b;

        public y0(Object obj, String str) {
            this.f19491a = obj;
            this.f19492b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerResume(this.f19491a, this.f19492b);
        }
    }

    public class y1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19494a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19495b;

        public y1(Object obj, String str) {
            this.f19494a = obj;
            this.f19495b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.videoOperate(this.f19494a, this.f19495b);
        }
    }

    public class z implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19497a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19498b;

        public z(Object obj, String str) {
            this.f19497a = obj;
            this.f19498b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.getComponentOptions(this.f19497a, this.f19498b);
        }
    }

    public class z0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19500a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19501b;

        public z0(Object obj, String str) {
            this.f19500a = obj;
            this.f19501b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerStop(this.f19500a, this.f19501b);
        }
    }

    public class z1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19503a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19504b;

        public z1(Object obj, String str) {
            this.f19503a = obj;
            this.f19504b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getRewardSetting(this.f19503a, this.f19504b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendSubView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.appendSubView(obj, str);
        } else {
            this.f19256i.post(new c0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendViewTo(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.appendViewTo(obj, str);
        } else {
            this.f19256i.post(new d0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void bringViewToFront(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.bringViewToFront(obj, str);
        } else {
            this.f19256i.post(new h0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void broadcast(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.broadcast(obj, str);
        } else {
            this.f19256i.post(new j1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void clearAllCache(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.clearAllCache(obj, str);
        } else {
            this.f19256i.post(new v1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void click(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.click(obj, str);
        } else {
            this.f19256i.post(new v(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeAd(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.closeAd(obj, str);
        } else {
            this.f19256i.post(new i1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeVideoOperte(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.closeVideoOperte(obj, str);
        } else {
            this.f19256i.post(new d2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeWeb(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.closeWeb(obj, str);
            return;
        }
        this.f19256i.post(new n(obj, str));
        com.mbridge.msdk.foundation.tools.q0.b("JS-Video-Brigde", HandleInvocationsFromAdViewer.KEY_AD_TYPE + str);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createNativeEC(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createNativeEC(obj, str);
        } else {
            this.f19256i.post(new r1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createPlayerView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createPlayerView(obj, str);
        } else {
            this.f19256i.post(new w(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createSubPlayTemplateView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createSubPlayTemplateView(obj, str);
        } else {
            this.f19256i.post(new x(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createView(obj, str);
        } else {
            this.f19256i.post(new u(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createWebview(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createWebview(obj, str);
        } else {
            this.f19256i.post(new t(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void destroyComponent(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.destroyComponent(obj, str);
        } else {
            this.f19256i.post(new y(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAllCache(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getAllCache(obj, str);
        } else {
            this.f19256i.post(new u1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAppSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getAppSetting(obj, str);
        } else {
            this.f19256i.post(new x1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getComponentOptions(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getComponentOptions(obj, str);
        } else {
            this.f19256i.post(new z(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCurrentProgress(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getCurrentProgress(obj, str);
        } else {
            this.f19256i.post(new b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCutout(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getCutout(obj, str);
        } else {
            this.f19256i.post(new w1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getEncryptPrice(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getEncryptPrice(obj, str);
        } else {
            this.f19256i.post(new c2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getFileInfo(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getFileInfo(obj, str);
        } else {
            this.f19256i.post(new p(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getRewardSetting(obj, str);
        } else {
            this.f19256i.post(new z1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardUnitSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getRewardUnitSetting(obj, str);
        } else {
            this.f19256i.post(new a2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getSDKInfo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getSDKInfo(obj, str);
        } else {
            this.f19256i.post(new o(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getUnitSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getUnitSetting(obj, str);
        } else {
            this.f19256i.post(new b2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handleNativeObject(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.handleNativeObject(obj, str);
        } else {
            this.f19256i.post(new p1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handlerH5Exception(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.handlerH5Exception(obj, str);
        } else {
            this.f19256i.post(new g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void hideView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.hideView(obj, str);
        } else {
            this.f19256i.post(new i0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void increaseOfferFrequence(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.increaseOfferFrequence(obj, str);
        } else {
            this.f19256i.post(new o1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void init(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.init(obj, str);
        } else {
            this.f19256i.post(new k(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewAbove(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.insertViewAbove(obj, str);
        } else {
            this.f19256i.post(new n0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewBelow(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.insertViewBelow(obj, str);
        } else {
            this.f19256i.post(new o0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void isSystemResume(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.isSystemResume(obj, str);
        } else {
            this.f19256i.post(new h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.ivRewardAdsWithoutVideo(obj, str);
        } else {
            this.f19256i.post(new k1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadads(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.loadads(obj, str);
        } else {
            this.f19256i.post(new q(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadingResourceStatus(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.loadingResourceStatus(obj, str);
        } else {
            this.f19256i.post(new q1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.f19256i.post(new e(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendSubView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyAppendSubView(obj, str);
        } else {
            this.f19256i.post(new e0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendViewTo(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyAppendViewTo(obj, str);
        } else {
            this.f19256i.post(new f0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewAbove(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyInsertViewAbove(obj, str);
        } else {
            this.f19256i.post(new p0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewBelow(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyInsertViewBelow(obj, str);
        } else {
            this.f19256i.post(new q0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void openURL(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.openURL(obj, str);
        } else {
            this.f19256i.post(new l(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playVideoFinishOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playVideoFinishOperate(obj, str);
        } else {
            this.f19256i.post(new j(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerGetMuteState(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerGetMuteState(obj, str);
        } else {
            this.f19256i.post(new e1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerMute(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerMute(obj, str);
        } else {
            this.f19256i.post(new b1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPause(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerPause(obj, str);
        } else {
            this.f19256i.post(new x0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPlay(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerPlay(obj, str);
        } else {
            this.f19256i.post(new w0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerResume(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerResume(obj, str);
        } else {
            this.f19256i.post(new y0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetRenderType(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerSetRenderType(obj, str);
        } else {
            this.f19256i.post(new g1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetSource(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerSetSource(obj, str);
        } else {
            this.f19256i.post(new f1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerStop(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerStop(obj, str);
        } else {
            this.f19256i.post(new z0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUnmute(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerUnmute(obj, str);
        } else {
            this.f19256i.post(new d1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUpdateFrame(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerUpdateFrame(obj, str);
        } else {
            this.f19256i.post(new a1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void preloadSubPlayTemplateView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.preloadSubPlayTemplateView(obj, str);
        } else {
            this.f19256i.post(new h1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressBarOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.progressBarOperate(obj, str);
        } else {
            this.f19256i.post(new a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.progressOperate(obj, str);
        } else {
            this.f19256i.post(new e2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reactDeveloper(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.reactDeveloper(obj, str);
        } else {
            this.f19256i.post(new r(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void readyStatus(Object obj, String str) {
        com.mbridge.msdk.foundation.tools.q0.c("JS-Video-Brigde", "VIDEOBridge readyStatus");
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.readyStatus(obj, str);
        } else {
            this.f19256i.post(new i(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeCacheItem(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.removeCacheItem(obj, str);
        } else {
            this.f19256i.post(new t1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeFromSuperView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.removeFromSuperView(obj, str);
        } else {
            this.f19256i.post(new b0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reportUrls(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.reportUrls(obj, str);
        } else {
            this.f19256i.post(new s(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setCacheItem(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setCacheItem(obj, str);
        } else {
            this.f19256i.post(new s1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setScaleFitXY(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setScaleFitXY(obj, str);
        } else {
            this.f19256i.post(new d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setSubPlayTemplateInfo(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setSubPlayTemplateInfo(obj, str);
        } else {
            this.f19256i.post(new l1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewAlpha(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewAlpha(obj, str);
        } else {
            this.f19256i.post(new l0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewBgColor(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewBgColor(obj, str);
        } else {
            this.f19256i.post(new k0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewRect(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewRect(obj, str);
        } else {
            this.f19256i.post(new a0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewScale(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewScale(obj, str);
        } else {
            this.f19256i.post(new m0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showAlertView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showAlertView(obj, str);
        } else {
            this.f19256i.post(new m(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoClickView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showVideoClickView(obj, str);
        } else {
            this.f19256i.post(new c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoLocation(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showVideoLocation(obj, str);
        } else {
            this.f19256i.post(new c1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showView(obj, str);
        } else {
            this.f19256i.post(new j0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void soundOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.soundOperate(obj, str);
        } else {
            this.f19256i.post(new n1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void statistics(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.statistics(obj, str);
        } else {
            this.f19256i.post(new g0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.f19256i.post(new f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.f19256i.post(new r0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void videoOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.videoOperate(obj, str);
        } else {
            this.f19256i.post(new y1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewFireEvent(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewFireEvent(obj, str);
        } else {
            this.f19256i.post(new m1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoBack(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewGoBack(obj, str);
        } else {
            this.f19256i.post(new u0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoForward(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewGoForward(obj, str);
        } else {
            this.f19256i.post(new v0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewLoad(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewLoad(obj, str);
        } else {
            this.f19256i.post(new s0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewReload(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewReload(obj, str);
        } else {
            this.f19256i.post(new t0(obj, str));
        }
    }
}
