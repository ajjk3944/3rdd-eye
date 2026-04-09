package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.c;
import androidx.core.graphics.drawable.IconCompat;
import f0.o;
import f0.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_WORKOUT = "workout";

    @ColorInt
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BIG_TEXT = "android.bigText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON = "android.callPerson";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_TYPE = "android.callType";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COLORIZED = "android.colorized";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_INFO_TEXT = "android.infoText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGES = "android.messages";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE = "android.picture";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS = "android.progress";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SMALL_ICON = "android.icon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUB_TEXT = "android.subText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEMPLATE = "android.template";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT = "android.text";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT_LINES = "android.textLines";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE = "android.title";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE_BIG = "android.title.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";

    @SuppressLint({"ActionValue"})
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    public static class Action {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f2383a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f2384b;

        /* renamed from: c, reason: collision with root package name */
        public final RemoteInput[] f2385c;

        /* renamed from: d, reason: collision with root package name */
        public final RemoteInput[] f2386d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2387e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2388f;

        /* renamed from: g, reason: collision with root package name */
        public final int f2389g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f2390h;

        /* renamed from: i, reason: collision with root package name */
        public int f2391i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f2392j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f2393k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f2394l;

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public Action(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.i(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f2393k;
        }

        public boolean b() {
            return this.f2387e;
        }

        public Bundle c() {
            return this.f2383a;
        }

        public IconCompat d() {
            int i10;
            if (this.f2384b == null && (i10 = this.f2391i) != 0) {
                this.f2384b = IconCompat.i(null, "", i10);
            }
            return this.f2384b;
        }

        public RemoteInput[] e() {
            return this.f2385c;
        }

        public int f() {
            return this.f2389g;
        }

        public boolean g() {
            return this.f2388f;
        }

        public CharSequence h() {
            return this.f2392j;
        }

        public boolean i() {
            return this.f2394l;
        }

        public boolean j() {
            return this.f2390h;
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, (RemoteInput[]) null, true, 0, true, false, false);
        }

        public Action(int i10, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z10, int i11, boolean z11, boolean z12, boolean z13) {
            this(i10 != 0 ? IconCompat.i(null, "", i10) : null, charSequence, pendingIntent, bundle, remoteInputArr, remoteInputArr2, z10, i11, z11, z12, z13);
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f2388f = true;
            this.f2384b = iconCompat;
            if (iconCompat != null && iconCompat.m() == 2) {
                this.f2391i = iconCompat.k();
            }
            this.f2392j = l.d(charSequence);
            this.f2393k = pendingIntent;
            this.f2383a = bundle == null ? new Bundle() : bundle;
            this.f2385c = remoteInputArr;
            this.f2386d = remoteInputArr2;
            this.f2387e = z10;
            this.f2389g = i10;
            this.f2388f = z11;
            this.f2390h = z12;
            this.f2394l = z13;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface BadgeIconType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface GroupAlertBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface NotificationVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ServiceNotificationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface StreamType {
    }

    public static class b {
        @DoNotInline
        public static boolean a(android.app.RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        @DoNotInline
        public static CharSequence[] b(android.app.RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        @DoNotInline
        public static Bundle c(Notification.Action action) {
            return action.getExtras();
        }

        @DoNotInline
        public static Bundle d(android.app.RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }

        @DoNotInline
        public static String e(Notification notification) {
            return notification.getGroup();
        }

        @DoNotInline
        public static CharSequence f(android.app.RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        @DoNotInline
        public static android.app.RemoteInput[] g(Notification.Action action) {
            return action.getRemoteInputs();
        }

        @DoNotInline
        public static String h(android.app.RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        @DoNotInline
        public static String i(Notification notification) {
            return notification.getSortKey();
        }
    }

    public static class c {
        @DoNotInline
        public static Icon a(Notification.Action action) {
            return action.getIcon();
        }
    }

    public static class d {
        @DoNotInline
        public static boolean a(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    public static class e {
        @DoNotInline
        public static int a(Notification notification) {
            return notification.getBadgeIconType();
        }

        @DoNotInline
        public static String b(Notification notification) {
            return notification.getChannelId();
        }

        @DoNotInline
        public static int c(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        @DoNotInline
        public static CharSequence d(Notification notification) {
            return notification.getSettingsText();
        }

        @DoNotInline
        public static String e(Notification notification) {
            return notification.getShortcutId();
        }

        @DoNotInline
        public static long f(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    public static class f {
        @DoNotInline
        public static int a(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    public static class g {
        @DoNotInline
        public static boolean a(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        @DoNotInline
        public static Notification.BubbleMetadata b(Notification notification) {
            return notification.getBubbleMetadata();
        }

        @DoNotInline
        public static int c(android.app.RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        @DoNotInline
        public static LocusId d(Notification notification) {
            return notification.getLocusId();
        }

        @DoNotInline
        public static boolean e(Notification.Action action) {
            return action.isContextual();
        }
    }

    public static class h {
        @DoNotInline
        public static boolean a(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    public static class i extends m {

        /* renamed from: e, reason: collision with root package name */
        public IconCompat f2395e;

        /* renamed from: f, reason: collision with root package name */
        public IconCompat f2396f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f2397g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f2398h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2399i;

        public static class a {
            @RequiresApi(23)
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        public static class b {
            @RequiresApi(31)
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @RequiresApi(31)
            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @RequiresApi(31)
            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // androidx.core.app.NotificationCompat.m
        public void b(o oVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(oVar.a()).setBigContentTitle(this.f2442b);
            IconCompat iconCompat = this.f2395e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    b.a(bigContentTitle, this.f2395e.s(oVar instanceof androidx.core.app.a ? ((androidx.core.app.a) oVar).f() : null));
                } else if (iconCompat.m() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f2395e.j());
                }
            }
            if (this.f2397g) {
                if (this.f2396f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f2396f.s(oVar instanceof androidx.core.app.a ? ((androidx.core.app.a) oVar).f() : null));
                }
            }
            if (this.f2444d) {
                bigContentTitle.setSummaryText(this.f2443c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.c(bigContentTitle, this.f2399i);
                b.b(bigContentTitle, this.f2398h);
            }
        }

        @Override // androidx.core.app.NotificationCompat.m
        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public i h(Bitmap bitmap) {
            this.f2396f = bitmap == null ? null : IconCompat.f(bitmap);
            this.f2397g = true;
            return this;
        }

        public i i(Bitmap bitmap) {
            this.f2395e = bitmap == null ? null : IconCompat.f(bitmap);
            return this;
        }
    }

    public static class j extends m {

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f2400e;

        @Override // androidx.core.app.NotificationCompat.m
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.m
        public void b(o oVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(oVar.a()).setBigContentTitle(this.f2442b).bigText(this.f2400e);
            if (this.f2444d) {
                bigTextStyleBigText.setSummaryText(this.f2443c);
            }
        }

        @Override // androidx.core.app.NotificationCompat.m
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public j h(CharSequence charSequence) {
            this.f2400e = l.d(charSequence);
            return this;
        }
    }

    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public PendingIntent f2401a;

        /* renamed from: b, reason: collision with root package name */
        public PendingIntent f2402b;

        /* renamed from: c, reason: collision with root package name */
        public IconCompat f2403c;

        /* renamed from: d, reason: collision with root package name */
        public int f2404d;

        /* renamed from: e, reason: collision with root package name */
        public int f2405e;

        /* renamed from: f, reason: collision with root package name */
        public int f2406f;

        /* renamed from: g, reason: collision with root package name */
        public String f2407g;

        public static class a {
            @Nullable
            @RequiresApi(29)
            public static k a(@Nullable Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                c cVarG = new c(bubbleMetadata.getIntent(), IconCompat.a(bubbleMetadata.getIcon())).b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).g(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVarG.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVarG.e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVarG.a();
            }

            @Nullable
            @RequiresApi(29)
            public static Notification.BubbleMetadata b(@Nullable k kVar) {
                if (kVar == null || kVar.g() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(kVar.f().r()).setIntent(kVar.g()).setDeleteIntent(kVar.c()).setAutoExpandBubble(kVar.b()).setSuppressNotification(kVar.i());
                if (kVar.d() != 0) {
                    suppressNotification.setDesiredHeight(kVar.d());
                }
                if (kVar.e() != 0) {
                    suppressNotification.setDesiredHeightResId(kVar.e());
                }
                return suppressNotification.build();
            }
        }

        public static class b {
            @Nullable
            @RequiresApi(30)
            public static k a(@Nullable Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                c cVar = bubbleMetadata.getShortcutId() != null ? new c(bubbleMetadata.getShortcutId()) : new c(bubbleMetadata.getIntent(), IconCompat.a(bubbleMetadata.getIcon()));
                cVar.b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).g(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVar.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVar.a();
            }

            @Nullable
            @RequiresApi(30)
            public static Notification.BubbleMetadata b(@Nullable k kVar) {
                if (kVar == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = kVar.h() != null ? new Notification.BubbleMetadata.Builder(kVar.h()) : new Notification.BubbleMetadata.Builder(kVar.g(), kVar.f().r());
                builder.setDeleteIntent(kVar.c()).setAutoExpandBubble(kVar.b()).setSuppressNotification(kVar.i());
                if (kVar.d() != 0) {
                    builder.setDesiredHeight(kVar.d());
                }
                if (kVar.e() != 0) {
                    builder.setDesiredHeightResId(kVar.e());
                }
                return builder.build();
            }
        }

        public static k a(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return b.a(bubbleMetadata);
            }
            if (i10 == 29) {
                return a.a(bubbleMetadata);
            }
            return null;
        }

        public static Notification.BubbleMetadata k(k kVar) {
            if (kVar == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return b.b(kVar);
            }
            if (i10 == 29) {
                return a.b(kVar);
            }
            return null;
        }

        public boolean b() {
            return (this.f2406f & 1) != 0;
        }

        public PendingIntent c() {
            return this.f2402b;
        }

        public int d() {
            return this.f2404d;
        }

        public int e() {
            return this.f2405e;
        }

        public IconCompat f() {
            return this.f2403c;
        }

        public PendingIntent g() {
            return this.f2401a;
        }

        public String h() {
            return this.f2407g;
        }

        public boolean i() {
            return (this.f2406f & 2) != 0;
        }

        public void j(int i10) {
            this.f2406f = i10;
        }

        public k(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i10, int i11, int i12, String str) {
            this.f2401a = pendingIntent;
            this.f2403c = iconCompat;
            this.f2404d = i10;
            this.f2405e = i11;
            this.f2402b = pendingIntent2;
            this.f2406f = i12;
            this.f2407g = str;
        }

        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            public PendingIntent f2408a;

            /* renamed from: b, reason: collision with root package name */
            public IconCompat f2409b;

            /* renamed from: c, reason: collision with root package name */
            public int f2410c;

            /* renamed from: d, reason: collision with root package name */
            public int f2411d;

            /* renamed from: e, reason: collision with root package name */
            public int f2412e;

            /* renamed from: f, reason: collision with root package name */
            public PendingIntent f2413f;

            /* renamed from: g, reason: collision with root package name */
            public String f2414g;

            public c(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.f2414g = str;
            }

            public k a() {
                String str = this.f2414g;
                if (str == null && this.f2408a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f2409b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                k kVar = new k(this.f2408a, this.f2413f, this.f2409b, this.f2410c, this.f2411d, this.f2412e, str);
                kVar.j(this.f2412e);
                return kVar;
            }

            public c b(boolean z10) {
                f(1, z10);
                return this;
            }

            public c c(PendingIntent pendingIntent) {
                this.f2413f = pendingIntent;
                return this;
            }

            public c d(int i10) {
                this.f2410c = Math.max(i10, 0);
                this.f2411d = 0;
                return this;
            }

            public c e(int i10) {
                this.f2411d = i10;
                this.f2410c = 0;
                return this;
            }

            public final c f(int i10, boolean z10) {
                if (z10) {
                    this.f2412e = i10 | this.f2412e;
                    return this;
                }
                this.f2412e = (~i10) & this.f2412e;
                return this;
            }

            public c g(boolean z10) {
                f(2, z10);
                return this;
            }

            public c(PendingIntent pendingIntent, IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.f2408a = pendingIntent;
                    this.f2409b = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }
    }

    public static abstract class m {

        /* renamed from: a, reason: collision with root package name */
        public l f2441a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f2442b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f2443c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2444d = false;

        public void a(Bundle bundle) {
            if (this.f2444d) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.f2443c);
            }
            CharSequence charSequence = this.f2442b;
            if (charSequence != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, strC);
            }
        }

        public abstract void b(o oVar);

        public abstract String c();

        public RemoteViews d(o oVar) {
            return null;
        }

        public RemoteViews e(o oVar) {
            return null;
        }

        public RemoteViews f(o oVar) {
            return null;
        }

        public void g(l lVar) {
            if (this.f2441a != lVar) {
                this.f2441a = lVar;
                if (lVar != null) {
                    lVar.q(this);
                }
            }
        }
    }

    @Deprecated
    public NotificationCompat() {
    }

    @Nullable
    public static Action getAction(@NonNull Notification notification, int i10) {
        return getActionCompatFromAction(notification.actions[i10]);
    }

    @NonNull
    @RequiresApi(20)
    public static Action getActionCompatFromAction(@NonNull Notification.Action action) {
        RemoteInput[] remoteInputArr;
        int i10;
        android.app.RemoteInput[] remoteInputArrG = b.g(action);
        if (remoteInputArrG == null) {
            remoteInputArr = null;
        } else {
            RemoteInput[] remoteInputArr2 = new RemoteInput[remoteInputArrG.length];
            for (int i11 = 0; i11 < remoteInputArrG.length; i11++) {
                android.app.RemoteInput remoteInput = remoteInputArrG[i11];
                remoteInputArr2[i11] = new RemoteInput(b.h(remoteInput), b.f(remoteInput), b.b(remoteInput), b.a(remoteInput), Build.VERSION.SDK_INT >= 29 ? g.c(remoteInput) : 0, b.d(remoteInput), null);
            }
            remoteInputArr = remoteInputArr2;
        }
        int i12 = Build.VERSION.SDK_INT;
        boolean z10 = i12 >= 24 ? b.c(action).getBoolean("android.support.allowGeneratedReplies") || d.a(action) : b.c(action).getBoolean("android.support.allowGeneratedReplies");
        boolean z11 = b.c(action).getBoolean("android.support.action.showsUserInterface", true);
        int iA = i12 >= 28 ? f.a(action) : b.c(action).getInt("android.support.action.semanticAction", 0);
        boolean zE = i12 >= 29 ? g.e(action) : false;
        boolean zA = i12 >= 31 ? h.a(action) : false;
        if (c.a(action) != null || (i10 = action.icon) == 0) {
            return new Action(c.a(action) != null ? IconCompat.b(c.a(action)) : null, action.title, action.actionIntent, b.c(action), remoteInputArr, (RemoteInput[]) null, z10, iA, z11, zE, zA);
        }
        return new Action(i10, action.title, action.actionIntent, b.c(action), remoteInputArr, (RemoteInput[]) null, z10, iA, z11, zE, zA);
    }

    public static int getActionCount(@NonNull Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return g.a(notification);
        }
        return false;
    }

    public static boolean getAutoCancel(@NonNull Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int getBadgeIconType(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return e.a(notification);
        }
        return 0;
    }

    @Nullable
    public static k getBubbleMetadata(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return k.a(g.b(notification));
        }
        return null;
    }

    @Nullable
    public static String getCategory(@NonNull Notification notification) {
        return notification.category;
    }

    @Nullable
    public static String getChannelId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return e.b(notification);
        }
        return null;
    }

    public static int getColor(@NonNull Notification notification) {
        return notification.color;
    }

    @Nullable
    public static CharSequence getContentInfo(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    @Nullable
    public static CharSequence getContentText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    @Nullable
    public static CharSequence getContentTitle(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    @Nullable
    public static Bundle getExtras(@NonNull Notification notification) {
        return notification.extras;
    }

    @Nullable
    public static String getGroup(@NonNull Notification notification) {
        return b.e(notification);
    }

    public static int getGroupAlertBehavior(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return e.c(notification);
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static boolean getHighPriority(@NonNull Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @NonNull
    @RequiresApi(21)
    public static List<Action> getInvisibleActions(@NonNull Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i10 = 0; i10 < bundle.size(); i10++) {
                arrayList.add(androidx.core.app.b.c(bundle.getBundle(Integer.toString(i10))));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(@NonNull Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @Nullable
    public static h0.a getLocusId(@NonNull Notification notification) {
        LocusId locusIdD;
        if (Build.VERSION.SDK_INT < 29 || (locusIdD = g.d(notification)) == null) {
            return null;
        }
        return h0.a.c(locusIdD);
    }

    @NonNull
    public static Notification[] getNotificationArrayFromBundle(@NonNull Bundle bundle, @NonNull String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i10 = 0; i10 < parcelableArray.length; i10++) {
            notificationArr[i10] = (Notification) parcelableArray[i10];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean getOngoing(@NonNull Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean getOnlyAlertOnce(@NonNull Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @NonNull
    public static List<androidx.core.app.c> getPeople(@NonNull Notification notification) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                int size = parcelableArrayList.size();
                while (i10 < size) {
                    Object obj = parcelableArrayList.get(i10);
                    i10++;
                    arrayList.add(androidx.core.app.c.a(p.a(obj)));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                int length = stringArray.length;
                while (i10 < length) {
                    arrayList.add(new c.b().g(stringArray[i10]).a());
                    i10++;
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static Notification getPublicVersion(@NonNull Notification notification) {
        return notification.publicVersion;
    }

    @Nullable
    public static CharSequence getSettingsText(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return e.d(notification);
        }
        return null;
    }

    @Nullable
    public static String getShortcutId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return e.e(notification);
        }
        return null;
    }

    public static boolean getShowWhen(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    @Nullable
    public static String getSortKey(@NonNull Notification notification) {
        return b.i(notification);
    }

    @Nullable
    public static CharSequence getSubText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return e.f(notification);
        }
        return 0L;
    }

    public static boolean getUsesChronometer(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(@NonNull Notification notification) {
        return notification.visibility;
    }

    public static boolean isGroupSummary(@NonNull Notification notification) {
        return (notification.flags & 512) != 0;
    }

    @Nullable
    public static Bitmap reduceLargeIconSize(@NonNull Context context, @Nullable Bitmap bitmap) throws Resources.NotFoundException {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(e0.b.compat_notification_large_icon_max_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(e0.b.compat_notification_large_icon_max_height);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
    }

    public static class l {
        public boolean A;
        public boolean B;
        public String C;
        public Bundle D;
        public int E;
        public int F;
        public Notification G;
        public RemoteViews H;
        public RemoteViews I;
        public RemoteViews J;
        public String K;
        public int L;
        public String M;
        public h0.a N;
        public long O;
        public int P;
        public int Q;
        public boolean R;
        public k S;
        public Notification T;
        public boolean U;
        public Object V;
        public ArrayList W;

        /* renamed from: a, reason: collision with root package name */
        public Context f2415a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f2416b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f2417c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f2418d;

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f2419e;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f2420f;

        /* renamed from: g, reason: collision with root package name */
        public PendingIntent f2421g;

        /* renamed from: h, reason: collision with root package name */
        public PendingIntent f2422h;

        /* renamed from: i, reason: collision with root package name */
        public RemoteViews f2423i;

        /* renamed from: j, reason: collision with root package name */
        public IconCompat f2424j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f2425k;

        /* renamed from: l, reason: collision with root package name */
        public int f2426l;

        /* renamed from: m, reason: collision with root package name */
        public int f2427m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f2428n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f2429o;

        /* renamed from: p, reason: collision with root package name */
        public m f2430p;

        /* renamed from: q, reason: collision with root package name */
        public CharSequence f2431q;

        /* renamed from: r, reason: collision with root package name */
        public CharSequence f2432r;

        /* renamed from: s, reason: collision with root package name */
        public CharSequence[] f2433s;

        /* renamed from: t, reason: collision with root package name */
        public int f2434t;

        /* renamed from: u, reason: collision with root package name */
        public int f2435u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f2436v;

        /* renamed from: w, reason: collision with root package name */
        public String f2437w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f2438x;

        /* renamed from: y, reason: collision with root package name */
        public String f2439y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f2440z;

        public l(Context context, String str) {
            this.f2416b = new ArrayList();
            this.f2417c = new ArrayList();
            this.f2418d = new ArrayList();
            this.f2428n = true;
            this.f2440z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.T = notification;
            this.f2415a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.f2427m = 0;
            this.W = new ArrayList();
            this.R = true;
        }

        public static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public l a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2416b.add(new Action(i10, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new androidx.core.app.a(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public l e(boolean z10) {
            l(16, z10);
            return this;
        }

        public l f(String str) {
            this.K = str;
            return this;
        }

        public l g(RemoteViews remoteViews) {
            this.T.contentView = remoteViews;
            return this;
        }

        public l h(PendingIntent pendingIntent) {
            this.f2421g = pendingIntent;
            return this;
        }

        public l i(CharSequence charSequence) {
            this.f2420f = d(charSequence);
            return this;
        }

        public l j(CharSequence charSequence) {
            this.f2419e = d(charSequence);
            return this;
        }

        public l k(PendingIntent pendingIntent) {
            this.T.deleteIntent = pendingIntent;
            return this;
        }

        public final void l(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.T;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.T;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public l m(Bitmap bitmap) {
            this.f2424j = bitmap == null ? null : IconCompat.f(NotificationCompat.reduceLargeIconSize(this.f2415a, bitmap));
            return this;
        }

        public l n(boolean z10) {
            this.f2440z = z10;
            return this;
        }

        public l o(int i10) {
            this.f2427m = i10;
            return this;
        }

        public l p(int i10) {
            this.T.icon = i10;
            return this;
        }

        public l q(m mVar) {
            if (this.f2430p != mVar) {
                this.f2430p = mVar;
                if (mVar != null) {
                    mVar.g(this);
                }
            }
            return this;
        }

        public l r(CharSequence charSequence) {
            this.T.tickerText = d(charSequence);
            return this;
        }

        public l s(long j10) {
            this.T.when = j10;
            return this;
        }

        @Deprecated
        public l(@NonNull Context context) {
            this(context, null);
        }
    }
}
