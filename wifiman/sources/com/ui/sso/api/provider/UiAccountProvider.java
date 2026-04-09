package com.ui.sso.api.provider;

import Ii.AbstractC3061j;
import Ii.C3048c0;
import Ii.J;
import Ii.N;
import Va.a;
import Zg.AbstractC3689v;
import Zg.U;
import android.accounts.AccountManager;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.ui.sso.account.UIAccountManager;
import com.ui.sso.account.local.UiAccountSharedPrefProvider;
import com.ui.sso.api.provider.UiAccountProviderCursor;
import com.ui.sso.api.provider.UiAccountProviderError;
import com.ui.sso.api.provider.UiAccountProviderMessageSerializer;
import com.ui.sso.api.provider.d;
import com.ui.sso.api.provider.e;
import com.ui.sso.api.provider.f;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.util.SnmpConfigurator;
import sh.AbstractC7978m;

@Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0002ACB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0004J7\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0007J\u0013\u0010\u0014\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0007J\u0013\u0010\u0016\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0007J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020 H\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020#H\u0082@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020'H\u0082@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020*H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\u00020-H\u0082@ø\u0001\u0000¢\u0006\u0004\b.\u0010\u0007J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J+\u00106\u001a\u0002042\u0006\u00102\u001a\u00020\u00172\b\u00103\u001a\u0004\u0018\u00010\u00172\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107JK\u0010?\u001a\u00020-2\u0006\u00109\u001a\u0002082\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010:2\b\u0010<\u001a\u0004\u0018\u00010\u00172\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010:2\b\u0010>\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\bH\u0016¢\u0006\u0004\bA\u0010\u0004J\u0017\u0010C\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u0019H\u0016¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u0004\u0018\u00010\u00172\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bE\u0010FJ#\u0010J\u001a\u0004\u0018\u0001082\u0006\u0010G\u001a\u0002082\b\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bJ\u0010KJ3\u0010N\u001a\u00020M2\u0006\u0010G\u001a\u0002082\b\u0010I\u001a\u0004\u0018\u00010\u00172\u0010\u0010L\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0017\u0018\u00010:H\u0016¢\u0006\u0004\bN\u0010OJ=\u0010Q\u001a\u00020M2\u0006\u0010G\u001a\u0002082\b\u0010I\u001a\u0004\u0018\u00010H2\b\u0010L\u001a\u0004\u0018\u00010\u00172\u0010\u0010P\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0017\u0018\u00010:H\u0016¢\u0006\u0004\bQ\u0010RR\"\u0010X\u001a\u00020\u00058\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bA\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020Y8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bC\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010c\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010S\u001a\u0004\ba\u0010U\"\u0004\bb\u0010WR\"\u0010k\u001a\u00020d8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010r\u001a\u00020\u00178\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010v\u001a\u00020\u00178\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bs\u0010m\u001a\u0004\bt\u0010o\"\u0004\bu\u0010qR\"\u0010~\u001a\u00020w8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R(\u00109\u001a\u00020\u007f8\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R1\u0010\u008e\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00018\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R1\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u0086\u00018\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0089\u0001\u001a\u0006\b\u0091\u0001\u0010\u008b\u0001\"\u0006\b\u0092\u0001\u0010\u008d\u0001R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R*\u0010£\u0001\u001a\u00030\u009c\u00018\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R*\u0010«\u0001\u001a\u00030¤\u00018\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R*\u0010³\u0001\u001a\u00030¬\u00018\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R \u0010¹\u0001\u001a\u00030´\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R$\u0010½\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0005\u0012\u00030»\u00010º\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010¼\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006¾\u0001"}, d2 = {"Lcom/ui/sso/api/provider/UiAccountProvider;", "Landroid/content/ContentProvider;", "Lcom/ui/sso/account/UIAccountManager$a;", "<init>", "()V", "Lcom/ui/sso/account/UIAccountManager;", SnmpConfigurator.O_TIMEOUT, "(Ldh/e;)Ljava/lang/Object;", "LYg/J;", "q", "Out", "Lkotlin/Function1;", "Ldh/e;", "", "action", "L", "(Lmh/l;Ldh/e;)Ljava/lang/Object;", "Lcom/ui/sso/api/provider/e$a;", "p", "Lcom/ui/sso/api/provider/e$h;", "I", "Lcom/ui/sso/api/provider/e$e;", SnmpConfigurator.O_AUTH_PASSPHRASE, "", "accIdStr", "Ljava/util/UUID;", "s", "(Ljava/lang/String;)Ljava/util/UUID;", "Lcom/ui/sso/api/provider/d$b;", "request", "a0", "(Lcom/ui/sso/api/provider/d$b;Ldh/e;)Ljava/lang/Object;", "Lcom/ui/sso/api/provider/d$a;", SnmpConfigurator.O_RETRIES, "(Lcom/ui/sso/api/provider/d$a;Ldh/e;)Ljava/lang/Object;", "Lcom/ui/sso/api/provider/d$c;", "Lcom/ui/sso/api/provider/e$b;", "x", "(Lcom/ui/sso/api/provider/d$c;Ldh/e;)Ljava/lang/Object;", "Lcom/ui/sso/api/provider/d$e;", "b0", "(Lcom/ui/sso/api/provider/d$e;Ldh/e;)Ljava/lang/Object;", "Lcom/ui/sso/api/provider/d$d;", "M", "(Lcom/ui/sso/api/provider/d$d;Ldh/e;)Ljava/lang/Object;", "Landroid/database/Cursor;", "w", "", "onCreate", "()Z", "method", "arg", "Landroid/os/Bundle;", "extras", "call", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", "Landroid/net/Uri;", "uri", "", "projection", "selection", "selectionArgs", "sortOrder", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", SnmpConfigurator.O_AUTH_PROTOCOL, "accountId", SnmpConfigurator.O_BIND_ADDRESS, "(Ljava/util/UUID;)V", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "p0", "Landroid/content/ContentValues;", "p1", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "p2", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "p3", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Lcom/ui/sso/account/UIAccountManager;", SnmpConfigurator.O_SECURITY_NAME, "()Lcom/ui/sso/account/UIAccountManager;", "N", "(Lcom/ui/sso/account/UIAccountManager;)V", "accountManagerAndroid", "Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;", "Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;", "C", "()Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;", "S", "(Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;)V", "encryptedPrefProvider", SnmpConfigurator.O_COMMUNITY, "get_accountManagerLocal$account_release", "set_accountManagerLocal$account_release", "_accountManagerLocal", "Landroid/content/UriMatcher;", "d", "Landroid/content/UriMatcher;", "F", "()Landroid/content/UriMatcher;", "V", "(Landroid/content/UriMatcher;)V", "queryUriMatcher", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/lang/String;", SnmpConfigurator.O_CONTEXT_ENGINE_ID, "()Ljava/lang/String;", "U", "(Ljava/lang/String;)V", "packageName", "f", SnmpConfigurator.O_VERSION, "O", "accountType", "LTa/d;", "g", "LTa/d;", "B", "()LTa/d;", "R", "(LTa/d;)V", "deviceIdentifiersService", "Lcom/ui/sso/api/provider/f;", "h", "Lcom/ui/sso/api/provider/f;", "K", "()Lcom/ui/sso/api/provider/f;", "Z", "(Lcom/ui/sso/api/provider/f;)V", "Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;", "Lcom/ui/sso/api/provider/d;", "i", "Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;", "G", "()Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;", "W", "(Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;)V", "requestSerializer", "Lcom/ui/sso/api/provider/e;", "j", "H", "X", "responseSerializer", "Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;", "k", "Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;", "z", "()Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;", "Q", "(Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;)V", "cursorSerializer", "Landroid/content/ContentResolver;", "l", "Landroid/content/ContentResolver;", SnmpConfigurator.O_PRIV_PROTOCOL, "()Landroid/content/ContentResolver;", "P", "(Landroid/content/ContentResolver;)V", "contentResolver", "LWa/f;", "m", "LWa/f;", "D", "()LWa/f;", "T", "(LWa/f;)V", "packageCertificateVerifier", "LQa/a;", SnmpConfigurator.O_CONTEXT_NAME, "LQa/a;", "J", "()LQa/a;", SnmpConfigurator.O_PRIV_PASSPHRASE, "(LQa/a;)V", "uiAccountOwnershipStorage", "LIi/J;", SnmpConfigurator.O_OPERATION, "LIi/J;", "getDispatcherIO$account_release", "()LIi/J;", "dispatcherIO", "", "Lcom/ui/sso/api/provider/UiAccountProvider$b;", "Ljava/util/Map;", "supportedActions", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UiAccountProvider extends ContentProvider implements UIAccountManager.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public UIAccountManager accountManagerAndroid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public UiAccountSharedPrefProvider encryptedPrefProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private UIAccountManager _accountManagerLocal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public UriMatcher queryUriMatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String packageName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public String accountType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Ta.d deviceIdentifiersService;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public com.ui.sso.api.provider.f uri;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public UiAccountProviderMessageSerializer requestSerializer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public UiAccountProviderMessageSerializer responseSerializer;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public UiAccountProviderCursor.Serializer cursorSerializer;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public ContentResolver contentResolver;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public Wa.f packageCertificateVerifier;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public Qa.a uiAccountOwnershipStorage;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final J dispatcherIO = C3048c0.b();

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Map supportedActions;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;

        /* renamed from: id, reason: collision with root package name */
        private final String f41828id;
        public static final b GET_STATE = new b("GET_STATE", 0, "getState");
        public static final b ACCOUNT_UPDATE = new b("ACCOUNT_UPDATE", 1, "accountCreate");
        public static final b ACCOUNT_DELETE = new b("ACCOUNT_DELETE", 2, "accountDelete");
        public static final b GET_AUTH_TOKEN = new b("GET_AUTH_TOKEN", 3, "authTokenGet");
        public static final b UPDATE_AUTH_TOKEN = new b("UPDATE_AUTH_TOKEN", 4, "authTokenUpdate");
        public static final b INVALIDATE_AUTH_TOKEN = new b("INVALIDATE_AUTH_TOKEN", 5, "authTokenInvalidate");
        public static final b GET_DEVICE_IDENTIFIERS = new b("GET_DEVICE_IDENTIFIERS", 6, "getDeviceIdentifiers");
        public static final b ACQUIRE_OWNERSHIP = new b("ACQUIRE_OWNERSHIP", 7, "acquireOwnership");

        private static final /* synthetic */ b[] $values() {
            return new b[]{GET_STATE, ACCOUNT_UPDATE, ACCOUNT_DELETE, GET_AUTH_TOKEN, UPDATE_AUTH_TOKEN, INVALIDATE_AUTH_TOKEN, GET_DEVICE_IDENTIFIERS, ACQUIRE_OWNERSHIP};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10, String str2) {
            this.f41828id = str2;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final String getId() {
            return this.f41828id;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41829a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41830b;

        /* renamed from: d, reason: collision with root package name */
        int f41832d;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41830b = obj;
            this.f41832d |= PduHandle.NONE;
            return UiAccountProvider.this.p(this);
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41833a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.f41833a = str;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Provider call() - method: " + this.f41833a;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41834a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41836c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bundle f41837d;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            int f41838a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UiAccountProvider f41839b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f41840c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f41841d;

            /* renamed from: com.ui.sso.api.provider.UiAccountProvider$e$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1345a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f41842a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.ACQUIRE_OWNERSHIP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.GET_STATE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GET_DEVICE_IDENTIFIERS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.ACCOUNT_UPDATE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.ACCOUNT_DELETE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[b.GET_AUTH_TOKEN.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[b.UPDATE_AUTH_TOKEN.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[b.INVALIDATE_AUTH_TOKEN.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    f41842a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(UiAccountProvider uiAccountProvider, String str, Bundle bundle, InterfaceC5380e interfaceC5380e) {
                super(1, interfaceC5380e);
                this.f41839b = uiAccountProvider;
                this.f41840c = str;
                this.f41841d = bundle;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
                return new a(this.f41839b, this.f41840c, this.f41841d, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                com.ui.sso.api.provider.e eVar;
                Object objG = AbstractC5467b.g();
                switch (this.f41838a) {
                    case 0:
                        Yg.v.b(obj);
                        this.f41839b.q();
                        b bVar = (b) this.f41839b.supportedActions.get(this.f41840c);
                        switch (bVar == null ? -1 : C1345a.f41842a[bVar.ordinal()]) {
                            case -1:
                                throw new UiAccountProviderError.IllegalState("unknown call method " + this.f41840c, null, 2, null);
                            case 0:
                            default:
                                throw new NoWhenBranchMatchedException();
                            case 1:
                                UiAccountProvider uiAccountProvider = this.f41839b;
                                this.f41838a = 1;
                                obj = uiAccountProvider.p(this);
                                if (obj == objG) {
                                    return objG;
                                }
                                eVar = (com.ui.sso.api.provider.e) obj;
                                try {
                                    return this.f41839b.H().a(eVar);
                                } catch (UiAccountProviderMessageSerializer.SerializationError unused) {
                                    throw new UiAccountProviderError.IllegalState("failed to serialize response on '" + this.f41840c + "'", null, 2, null);
                                }
                            case 2:
                                UiAccountProvider uiAccountProvider2 = this.f41839b;
                                this.f41838a = 2;
                                obj = uiAccountProvider2.I(this);
                                if (obj == objG) {
                                    return objG;
                                }
                                eVar = (com.ui.sso.api.provider.e) obj;
                                return this.f41839b.H().a(eVar);
                            case 3:
                                UiAccountProvider uiAccountProvider3 = this.f41839b;
                                this.f41838a = 3;
                                obj = uiAccountProvider3.A(this);
                                if (obj == objG) {
                                    return objG;
                                }
                                eVar = (com.ui.sso.api.provider.e) obj;
                                return this.f41839b.H().a(eVar);
                            case 4:
                                UiAccountProvider uiAccountProvider4 = this.f41839b;
                                Bundle bundle = this.f41841d;
                                if (bundle == null) {
                                    throw new UiAccountProviderError.IllegalState("call extras null, but params expected", null, 2, null);
                                }
                                try {
                                    com.ui.sso.api.provider.d dVar = (com.ui.sso.api.provider.d) uiAccountProvider4.G().b(bundle);
                                    if (!(dVar instanceof d.AccountUpdate)) {
                                        throw new UiAccountProviderError.IllegalState("call params of invalid type", null, 2, null);
                                    }
                                    this.f41838a = 4;
                                    obj = uiAccountProvider4.a0((d.AccountUpdate) dVar, this);
                                    if (obj == objG) {
                                        return objG;
                                    }
                                    eVar = (com.ui.sso.api.provider.e) obj;
                                    return this.f41839b.H().a(eVar);
                                } catch (UiAccountProviderMessageSerializer.SerializationError e10) {
                                    throw new UiAccountProviderError.IllegalState("failed to deserialize call params", e10);
                                }
                            case 5:
                                UiAccountProvider uiAccountProvider5 = this.f41839b;
                                Bundle bundle2 = this.f41841d;
                                if (bundle2 == null) {
                                    throw new UiAccountProviderError.IllegalState("call extras null, but params expected", null, 2, null);
                                }
                                try {
                                    com.ui.sso.api.provider.d dVar2 = (com.ui.sso.api.provider.d) uiAccountProvider5.G().b(bundle2);
                                    if (!(dVar2 instanceof d.AccountDelete)) {
                                        throw new UiAccountProviderError.IllegalState("call params of invalid type", null, 2, null);
                                    }
                                    this.f41838a = 5;
                                    obj = uiAccountProvider5.r((d.AccountDelete) dVar2, this);
                                    if (obj == objG) {
                                        return objG;
                                    }
                                    eVar = (com.ui.sso.api.provider.e) obj;
                                    return this.f41839b.H().a(eVar);
                                } catch (UiAccountProviderMessageSerializer.SerializationError e11) {
                                    throw new UiAccountProviderError.IllegalState("failed to deserialize call params", e11);
                                }
                            case 6:
                                UiAccountProvider uiAccountProvider6 = this.f41839b;
                                Bundle bundle3 = this.f41841d;
                                if (bundle3 == null) {
                                    throw new UiAccountProviderError.IllegalState("call extras null, but params expected", null, 2, null);
                                }
                                try {
                                    com.ui.sso.api.provider.d dVar3 = (com.ui.sso.api.provider.d) uiAccountProvider6.G().b(bundle3);
                                    if (!(dVar3 instanceof d.AuthGet)) {
                                        throw new UiAccountProviderError.IllegalState("call params of invalid type", null, 2, null);
                                    }
                                    this.f41838a = 6;
                                    obj = uiAccountProvider6.x((d.AuthGet) dVar3, this);
                                    if (obj == objG) {
                                        return objG;
                                    }
                                    eVar = (com.ui.sso.api.provider.e) obj;
                                    return this.f41839b.H().a(eVar);
                                } catch (UiAccountProviderMessageSerializer.SerializationError e12) {
                                    throw new UiAccountProviderError.IllegalState("failed to deserialize call params", e12);
                                }
                            case 7:
                                UiAccountProvider uiAccountProvider7 = this.f41839b;
                                Bundle bundle4 = this.f41841d;
                                if (bundle4 == null) {
                                    throw new UiAccountProviderError.IllegalState("call extras null, but params expected", null, 2, null);
                                }
                                try {
                                    com.ui.sso.api.provider.d dVar4 = (com.ui.sso.api.provider.d) uiAccountProvider7.G().b(bundle4);
                                    if (!(dVar4 instanceof d.AuthTokenUpdate)) {
                                        throw new UiAccountProviderError.IllegalState("call params of invalid type", null, 2, null);
                                    }
                                    this.f41838a = 7;
                                    obj = uiAccountProvider7.b0((d.AuthTokenUpdate) dVar4, this);
                                    if (obj == objG) {
                                        return objG;
                                    }
                                    eVar = (com.ui.sso.api.provider.e) obj;
                                    return this.f41839b.H().a(eVar);
                                } catch (UiAccountProviderMessageSerializer.SerializationError e13) {
                                    throw new UiAccountProviderError.IllegalState("failed to deserialize call params", e13);
                                }
                            case 8:
                                UiAccountProvider uiAccountProvider8 = this.f41839b;
                                Bundle bundle5 = this.f41841d;
                                if (bundle5 == null) {
                                    throw new UiAccountProviderError.IllegalState("call extras null, but params expected", null, 2, null);
                                }
                                try {
                                    com.ui.sso.api.provider.d dVar5 = (com.ui.sso.api.provider.d) uiAccountProvider8.G().b(bundle5);
                                    if (!(dVar5 instanceof d.AuthTokenInvalidate)) {
                                        throw new UiAccountProviderError.IllegalState("call params of invalid type", null, 2, null);
                                    }
                                    this.f41838a = 8;
                                    obj = uiAccountProvider8.M((d.AuthTokenInvalidate) dVar5, this);
                                    if (obj == objG) {
                                        return objG;
                                    }
                                    eVar = (com.ui.sso.api.provider.e) obj;
                                    return this.f41839b.H().a(eVar);
                                } catch (UiAccountProviderMessageSerializer.SerializationError e14) {
                                    throw new UiAccountProviderError.IllegalState("failed to deserialize call params", e14);
                                }
                        }
                    case 1:
                        Yg.v.b(obj);
                        eVar = (com.ui.sso.api.provider.e) obj;
                        return this.f41839b.H().a(eVar);
                    case 2:
                        Yg.v.b(obj);
                        eVar = (com.ui.sso.api.provider.e) obj;
                        return this.f41839b.H().a(eVar);
                    case 3:
                        Yg.v.b(obj);
                        eVar = (com.ui.sso.api.provider.e) obj;
                        return this.f41839b.H().a(eVar);
                    case 4:
                        Yg.v.b(obj);
                        eVar = (com.ui.sso.api.provider.e) obj;
                        return this.f41839b.H().a(eVar);
                    case 5:
                        Yg.v.b(obj);
                        eVar = (com.ui.sso.api.provider.e) obj;
                        return this.f41839b.H().a(eVar);
                    case 6:
                        Yg.v.b(obj);
                        eVar = (com.ui.sso.api.provider.e) obj;
                        return this.f41839b.H().a(eVar);
                    case 7:
                        Yg.v.b(obj);
                        eVar = (com.ui.sso.api.provider.e) obj;
                        return this.f41839b.H().a(eVar);
                    case 8:
                        Yg.v.b(obj);
                        eVar = (com.ui.sso.api.provider.e) obj;
                        return this.f41839b.H().a(eVar);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5380e interfaceC5380e) {
                return ((a) create(interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f41843a = new b();

            b() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Provider call() complete";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Bundle bundle, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f41836c = str;
            this.f41837d = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return UiAccountProvider.this.new e(this.f41836c, this.f41837d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f41834a;
            if (i10 == 0) {
                Yg.v.b(obj);
                UiAccountProvider uiAccountProvider = UiAccountProvider.this;
                a aVar = new a(uiAccountProvider, this.f41836c, this.f41837d, null);
                this.f41834a = 1;
                obj = uiAccountProvider.L(aVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            Ua.a.e(b.f41843a);
            return obj;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41844a;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            int f41846a;

            a(InterfaceC5380e interfaceC5380e) {
                super(1, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
                return new a(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f41846a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                throw new UiAccountProviderError.IllegalState("delete should never be called", null, 2, null);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5380e interfaceC5380e) {
                return ((a) create(interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        f(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return UiAccountProvider.this.new f(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f41844a;
            if (i10 == 0) {
                Yg.v.b(obj);
                UiAccountProvider uiAccountProvider = UiAccountProvider.this;
                a aVar = new a(null);
                this.f41844a = 1;
                if (uiAccountProvider.L(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((f) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41847a;

        /* renamed from: b, reason: collision with root package name */
        Object f41848b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41849c;

        /* renamed from: e, reason: collision with root package name */
        int f41851e;

        g(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41849c = obj;
            this.f41851e |= PduHandle.NONE;
            return UiAccountProvider.this.r(null, this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41852a;

        /* renamed from: b, reason: collision with root package name */
        Object f41853b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41854c;

        /* renamed from: e, reason: collision with root package name */
        int f41856e;

        h(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41854c = obj;
            this.f41856e |= PduHandle.NONE;
            return UiAccountProvider.this.t(this);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41857a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41858b;

        /* renamed from: d, reason: collision with root package name */
        int f41860d;

        i(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41858b = obj;
            this.f41860d |= PduHandle.NONE;
            return UiAccountProvider.this.w(this);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41861a;

        /* renamed from: b, reason: collision with root package name */
        Object f41862b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41863c;

        /* renamed from: e, reason: collision with root package name */
        int f41865e;

        j(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41863c = obj;
            this.f41865e |= PduHandle.NONE;
            return UiAccountProvider.this.x(null, this);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41866a;

        /* renamed from: c, reason: collision with root package name */
        int f41868c;

        k(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41866a = obj;
            this.f41868c |= PduHandle.NONE;
            return UiAccountProvider.this.A(this);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41869a;

        /* renamed from: b, reason: collision with root package name */
        Object f41870b;

        /* renamed from: c, reason: collision with root package name */
        Object f41871c;

        /* renamed from: d, reason: collision with root package name */
        int f41872d;

        /* renamed from: e, reason: collision with root package name */
        boolean f41873e;

        /* renamed from: f, reason: collision with root package name */
        boolean f41874f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f41875g;

        /* renamed from: i, reason: collision with root package name */
        int f41877i;

        l(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41875g = obj;
            this.f41877i |= PduHandle.NONE;
            return UiAccountProvider.this.I(this);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41878a;

        /* renamed from: c, reason: collision with root package name */
        int f41880c;

        m(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41878a = obj;
            this.f41880c |= PduHandle.NONE;
            return UiAccountProvider.this.L(null, this);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41881a;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            int f41883a;

            a(InterfaceC5380e interfaceC5380e) {
                super(1, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
                return new a(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f41883a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                throw new UiAccountProviderError.IllegalState("insert should never be called", null, 2, null);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5380e interfaceC5380e) {
                return ((a) create(interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        n(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return UiAccountProvider.this.new n(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f41881a;
            if (i10 == 0) {
                Yg.v.b(obj);
                UiAccountProvider uiAccountProvider = UiAccountProvider.this;
                a aVar = new a(null);
                this.f41881a = 1;
                if (uiAccountProvider.L(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((n) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41884a;

        /* renamed from: b, reason: collision with root package name */
        Object f41885b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41886c;

        /* renamed from: e, reason: collision with root package name */
        int f41888e;

        o(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41886c = obj;
            this.f41888e |= PduHandle.NONE;
            return UiAccountProvider.this.M(null, this);
        }
    }

    static final class p extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final p f41889a = new p();

        p() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Android account manager notified Account changes";
        }
    }

    static final class q extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UUID f41890a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(UUID uuid) {
            super(0);
            this.f41890a = uuid;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Android account manager notified Account Authentication changed for " + this.f41890a;
        }
    }

    static final class r extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f41892b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(long j10) {
            super(0);
            this.f41892b = j10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UiAccountProvider '" + UiAccountProvider.this.E() + "' created in " + (System.currentTimeMillis() - this.f41892b);
        }
    }

    static final class s extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f41893a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(Uri uri) {
            super(0);
            this.f41893a = uri;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Provider query() - method: " + this.f41893a;
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41894a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f41896c;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            int f41897a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UiAccountProvider f41898b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f41899c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(UiAccountProvider uiAccountProvider, Uri uri, InterfaceC5380e interfaceC5380e) {
                super(1, interfaceC5380e);
                this.f41898b = uiAccountProvider;
                this.f41899c = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
                return new a(this.f41898b, this.f41899c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f41897a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    this.f41898b.q();
                    if (this.f41898b.F().match(this.f41899c) != 0) {
                        throw new UiAccountProviderError.IllegalState("unknown query uri: " + this.f41899c, null, 2, null);
                    }
                    UiAccountProvider uiAccountProvider = this.f41898b;
                    this.f41897a = 1;
                    obj = uiAccountProvider.w(this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return (Cursor) obj;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5380e interfaceC5380e) {
                return ((a) create(interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f41900a = new b();

            b() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Provider query() complete";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Uri uri, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f41896c = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return UiAccountProvider.this.new t(this.f41896c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f41894a;
            if (i10 == 0) {
                Yg.v.b(obj);
                UiAccountProvider uiAccountProvider = UiAccountProvider.this;
                a aVar = new a(uiAccountProvider, this.f41896c, null);
                this.f41894a = 1;
                obj = uiAccountProvider.L(aVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            Ua.a.e(b.f41900a);
            return obj;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((t) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41901a;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            int f41903a;

            a(InterfaceC5380e interfaceC5380e) {
                super(1, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
                return new a(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f41903a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                throw new UiAccountProviderError.IllegalState("update should never be called", null, 2, null);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5380e interfaceC5380e) {
                return ((a) create(interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        u(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return UiAccountProvider.this.new u(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f41901a;
            if (i10 == 0) {
                Yg.v.b(obj);
                UiAccountProvider uiAccountProvider = UiAccountProvider.this;
                a aVar = new a(null);
                this.f41901a = 1;
                if (uiAccountProvider.L(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((u) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41904a;

        /* renamed from: b, reason: collision with root package name */
        Object f41905b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41906c;

        /* renamed from: e, reason: collision with root package name */
        int f41908e;

        v(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41906c = obj;
            this.f41908e |= PduHandle.NONE;
            return UiAccountProvider.this.a0(null, this);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f41909a;

        /* renamed from: b, reason: collision with root package name */
        Object f41910b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41911c;

        /* renamed from: e, reason: collision with root package name */
        int f41913e;

        w(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41911c = obj;
            this.f41913e |= PduHandle.NONE;
            return UiAccountProvider.this.b0(null, this);
        }
    }

    public UiAccountProvider() {
        InterfaceC5826a entries = b.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(((b) obj).getId(), obj);
        }
        this.supportedActions = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(dh.InterfaceC5380e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.ui.sso.api.provider.UiAccountProvider.k
            if (r0 == 0) goto L13
            r0 = r5
            com.ui.sso.api.provider.UiAccountProvider$k r0 = (com.ui.sso.api.provider.UiAccountProvider.k) r0
            int r1 = r0.f41868c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41868c = r1
            goto L18
        L13:
            com.ui.sso.api.provider.UiAccountProvider$k r0 = new com.ui.sso.api.provider.UiAccountProvider$k
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f41866a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41868c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L29
            Yg.v.b(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            Yg.v.b(r5)
            Ta.d r5 = r4.B()
            r0.f41868c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            Ta.c r5 = (Ta.c) r5
            com.ui.sso.api.provider.e$e r0 = new com.ui.sso.api.provider.e$e
            java.lang.String r1 = r5.a()
            java.lang.String r2 = r5.c()
            java.lang.String r5 = r5.b()
            r0.<init>(r1, r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.UiAccountProvider.A(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object I(dh.InterfaceC5380e r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.UiAccountProvider.I(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object L(mh.InterfaceC6835l r5, dh.InterfaceC5380e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.ui.sso.api.provider.UiAccountProvider.m
            if (r0 == 0) goto L13
            r0 = r6
            com.ui.sso.api.provider.UiAccountProvider$m r0 = (com.ui.sso.api.provider.UiAccountProvider.m) r0
            int r1 = r0.f41880c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41880c = r1
            goto L18
        L13:
            com.ui.sso.api.provider.UiAccountProvider$m r0 = new com.ui.sso.api.provider.UiAccountProvider$m
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41878a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41880c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2b
            Yg.v.b(r6)     // Catch: com.ui.sso.api.provider.UiAccountProviderError -> L29
            goto L40
        L29:
            r5 = move-exception
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            Yg.v.b(r6)
            r0.f41880c = r3     // Catch: com.ui.sso.api.provider.UiAccountProviderError -> L29
            java.lang.Object r6 = r5.invoke(r0)     // Catch: com.ui.sso.api.provider.UiAccountProviderError -> L29
            if (r6 != r1) goto L40
            return r1
        L40:
            return r6
        L41:
            com.ui.sso.api.provider.UiAccountProviderError$InterprocessWrapper r6 = new com.ui.sso.api.provider.UiAccountProviderError$InterprocessWrapper
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.UiAccountProvider.L(mh.l, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object M(com.ui.sso.api.provider.d.AuthTokenInvalidate r7, dh.InterfaceC5380e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.ui.sso.api.provider.UiAccountProvider.o
            if (r0 == 0) goto L13
            r0 = r8
            com.ui.sso.api.provider.UiAccountProvider$o r0 = (com.ui.sso.api.provider.UiAccountProvider.o) r0
            int r1 = r0.f41888e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41888e = r1
            goto L18
        L13:
            com.ui.sso.api.provider.UiAccountProvider$o r0 = new com.ui.sso.api.provider.UiAccountProvider$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f41886c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41888e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2e
            Yg.v.b(r8)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            goto L70
        L2c:
            r7 = move-exception
            goto L76
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.f41885b
            com.ui.sso.api.provider.d$d r7 = (com.ui.sso.api.provider.d.AuthTokenInvalidate) r7
            java.lang.Object r2 = r0.f41884a
            com.ui.sso.api.provider.UiAccountProvider r2 = (com.ui.sso.api.provider.UiAccountProvider) r2
            Yg.v.b(r8)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            goto L54
        L43:
            Yg.v.b(r8)
            r0.f41884a = r6     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41885b = r7     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41888e = r4     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.Object r8 = r6.t(r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            if (r8 != r1) goto L53
            return r1
        L53:
            r2 = r6
        L54:
            com.ui.sso.account.UIAccountManager r8 = (com.ui.sso.account.UIAccountManager) r8     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.String r5 = r7.getAccountId()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.util.UUID r2 = r2.s(r5)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.String r7 = r7.getAuthType()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r5 = 0
            r0.f41884a = r5     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41885b = r5     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41888e = r3     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.Object r7 = r8.j(r2, r7, r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            if (r7 != r1) goto L70
            return r1
        L70:
            com.ui.sso.api.provider.e$a r7 = new com.ui.sso.api.provider.e$a     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r7.<init>(r4)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            return r7
        L76:
            com.ui.sso.api.provider.UiAccountProviderError$AccountManager r8 = new com.ui.sso.api.provider.UiAccountProviderError$AccountManager
            java.lang.String r0 = "Failed to invalidate Auth token"
            r8.<init>(r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.UiAccountProvider.M(com.ui.sso.api.provider.d$d, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a0(com.ui.sso.api.provider.d.AccountUpdate r9, dh.InterfaceC5380e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.ui.sso.api.provider.UiAccountProvider.v
            if (r0 == 0) goto L13
            r0 = r10
            com.ui.sso.api.provider.UiAccountProvider$v r0 = (com.ui.sso.api.provider.UiAccountProvider.v) r0
            int r1 = r0.f41908e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41908e = r1
            goto L18
        L13:
            com.ui.sso.api.provider.UiAccountProvider$v r0 = new com.ui.sso.api.provider.UiAccountProvider$v
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f41906c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41908e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2e
            Yg.v.b(r10)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            goto L7d
        L2c:
            r9 = move-exception
            goto L83
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r0.f41905b
            com.ui.sso.api.provider.d$b r9 = (com.ui.sso.api.provider.d.AccountUpdate) r9
            java.lang.Object r2 = r0.f41904a
            com.ui.sso.api.provider.UiAccountProvider r2 = (com.ui.sso.api.provider.UiAccountProvider) r2
            Yg.v.b(r10)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            goto L54
        L43:
            Yg.v.b(r10)
            r0.f41904a = r8     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41905b = r9     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41908e = r4     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.Object r10 = r8.t(r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            if (r10 != r1) goto L53
            return r1
        L53:
            r2 = r8
        L54:
            com.ui.sso.account.UIAccountManager r10 = (com.ui.sso.account.UIAccountManager) r10     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.String r5 = r9.getAccountId()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.util.UUID r2 = r2.s(r5)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.String r5 = r9.getUsername()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.String r6 = r9.getEmail()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.String r9 = r9.getAvatar()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            Na.b r7 = new Na.b     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r7.<init>(r2, r6, r5, r9)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r9 = 0
            r0.f41904a = r9     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41905b = r9     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41908e = r3     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.Object r9 = r10.b(r7, r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            if (r9 != r1) goto L7d
            return r1
        L7d:
            com.ui.sso.api.provider.e$a r9 = new com.ui.sso.api.provider.e$a     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r9.<init>(r4)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            return r9
        L83:
            com.ui.sso.api.provider.UiAccountProviderError$AccountManager r10 = new com.ui.sso.api.provider.UiAccountProviderError$AccountManager
            java.lang.String r0 = "Failed create an account"
            r10.<init>(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.UiAccountProvider.a0(com.ui.sso.api.provider.d$b, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b0(com.ui.sso.api.provider.d.AuthTokenUpdate r8, dh.InterfaceC5380e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.ui.sso.api.provider.UiAccountProvider.w
            if (r0 == 0) goto L13
            r0 = r9
            com.ui.sso.api.provider.UiAccountProvider$w r0 = (com.ui.sso.api.provider.UiAccountProvider.w) r0
            int r1 = r0.f41913e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41913e = r1
            goto L18
        L13:
            com.ui.sso.api.provider.UiAccountProvider$w r0 = new com.ui.sso.api.provider.UiAccountProvider$w
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f41911c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41913e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2e
            Yg.v.b(r9)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            goto L74
        L2c:
            r8 = move-exception
            goto L7a
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.f41910b
            com.ui.sso.api.provider.d$e r8 = (com.ui.sso.api.provider.d.AuthTokenUpdate) r8
            java.lang.Object r2 = r0.f41909a
            com.ui.sso.api.provider.UiAccountProvider r2 = (com.ui.sso.api.provider.UiAccountProvider) r2
            Yg.v.b(r9)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            goto L54
        L43:
            Yg.v.b(r9)
            r0.f41909a = r7     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41910b = r8     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41913e = r4     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.Object r9 = r7.t(r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            if (r9 != r1) goto L53
            return r1
        L53:
            r2 = r7
        L54:
            com.ui.sso.account.UIAccountManager r9 = (com.ui.sso.account.UIAccountManager) r9     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.String r5 = r8.getAccountId()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.util.UUID r2 = r2.s(r5)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.String r5 = r8.getAuthType()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.String r8 = r8.getToken()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r6 = 0
            r0.f41909a = r6     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41910b = r6     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41913e = r3     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.Object r8 = r9.h(r2, r5, r8, r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            if (r8 != r1) goto L74
            return r1
        L74:
            com.ui.sso.api.provider.e$a r8 = new com.ui.sso.api.provider.e$a     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r8.<init>(r4)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            return r8
        L7a:
            com.ui.sso.api.provider.UiAccountProviderError$AccountManager r9 = new com.ui.sso.api.provider.UiAccountProviderError$AccountManager
            java.lang.String r0 = "Failed to update Auth token"
            r9.<init>(r0, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.UiAccountProvider.b0(com.ui.sso.api.provider.d$e, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(dh.InterfaceC5380e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.ui.sso.api.provider.UiAccountProvider.c
            if (r0 == 0) goto L13
            r0 = r7
            com.ui.sso.api.provider.UiAccountProvider$c r0 = (com.ui.sso.api.provider.UiAccountProvider.c) r0
            int r1 = r0.f41832d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41832d = r1
            goto L18
        L13:
            com.ui.sso.api.provider.UiAccountProvider$c r0 = new com.ui.sso.api.provider.UiAccountProvider$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f41830b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41832d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2c
            Yg.v.b(r7)
            goto L6c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f41829a
            com.ui.sso.api.provider.UiAccountProvider r2 = (com.ui.sso.api.provider.UiAccountProvider) r2
            Yg.v.b(r7)
            goto L50
        L3d:
            Yg.v.b(r7)
            com.ui.sso.account.UIAccountManager r7 = r6.u()
            r0.f41829a = r6
            r0.f41832d = r4
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r2 = r6
        L50:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L72
            Qa.a r7 = r2.J()
            java.lang.String r2 = r2.E()
            r5 = 0
            r0.f41829a = r5
            r0.f41832d = r3
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            com.ui.sso.api.provider.e$a r7 = new com.ui.sso.api.provider.e$a
            r7.<init>(r4)
            return r7
        L72:
            com.ui.sso.api.provider.UiAccountProviderError$AccountManager r7 = new com.ui.sso.api.provider.UiAccountProviderError$AccountManager
            com.ui.sso.account.UIAccountManager$Error$AccessRestricted r0 = new com.ui.sso.account.UIAccountManager$Error$AccessRestricted
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>()
            r0.<init>(r1)
            java.lang.String r1 = "Failed to acquire Android account storage since it's not accessible"
            r7.<init>(r1, r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.UiAccountProvider.p(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        Wa.f fVarD = D();
        String callingPackage = getCallingPackage();
        if (callingPackage == null) {
            throw new UiAccountProviderError.IllegalState("no calling package", null, 2, null);
        }
        if (!fVarD.a(callingPackage)) {
            throw new UiAccountProviderError.CallerSignCertMismatch();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(com.ui.sso.api.provider.d.AccountDelete r6, dh.InterfaceC5380e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ui.sso.api.provider.UiAccountProvider.g
            if (r0 == 0) goto L13
            r0 = r7
            com.ui.sso.api.provider.UiAccountProvider$g r0 = (com.ui.sso.api.provider.UiAccountProvider.g) r0
            int r1 = r0.f41851e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41851e = r1
            goto L18
        L13:
            com.ui.sso.api.provider.UiAccountProvider$g r0 = new com.ui.sso.api.provider.UiAccountProvider$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f41849c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41851e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2e
            Yg.v.b(r7)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            goto L6c
        L2c:
            r6 = move-exception
            goto L72
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            java.lang.Object r6 = r0.f41848b
            com.ui.sso.api.provider.d$a r6 = (com.ui.sso.api.provider.d.AccountDelete) r6
            java.lang.Object r2 = r0.f41847a
            com.ui.sso.api.provider.UiAccountProvider r2 = (com.ui.sso.api.provider.UiAccountProvider) r2
            Yg.v.b(r7)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            goto L54
        L43:
            Yg.v.b(r7)
            r0.f41847a = r5     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41848b = r6     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41851e = r4     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.Object r7 = r5.t(r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            if (r7 != r1) goto L53
            return r1
        L53:
            r2 = r5
        L54:
            com.ui.sso.account.UIAccountManager r7 = (com.ui.sso.account.UIAccountManager) r7     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.String r6 = r6.getAccountId()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.util.UUID r6 = r2.s(r6)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r2 = 0
            r0.f41847a = r2     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41848b = r2     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41851e = r3     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.Object r6 = r7.c(r6, r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            if (r6 != r1) goto L6c
            return r1
        L6c:
            com.ui.sso.api.provider.e$a r6 = new com.ui.sso.api.provider.e$a     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r6.<init>(r4)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            return r6
        L72:
            com.ui.sso.api.provider.UiAccountProviderError$AccountManager r7 = new com.ui.sso.api.provider.UiAccountProviderError$AccountManager
            java.lang.String r0 = "Failed delete an account"
            r7.<init>(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.UiAccountProvider.r(com.ui.sso.api.provider.d$a, dh.e):java.lang.Object");
    }

    private final UUID s(String accIdStr) {
        try {
            UUID uuidFromString = UUID.fromString(accIdStr);
            AbstractC6492s.h(uuidFromString, "fromString(...)");
            return uuidFromString;
        } catch (IllegalArgumentException e10) {
            throw new UiAccountProviderError.IllegalState("Account ID is not in UUID invalid format : " + accIdStr, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(dh.InterfaceC5380e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.ui.sso.api.provider.UiAccountProvider.h
            if (r0 == 0) goto L13
            r0 = r8
            com.ui.sso.api.provider.UiAccountProvider$h r0 = (com.ui.sso.api.provider.UiAccountProvider.h) r0
            int r1 = r0.f41856e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41856e = r1
            goto L18
        L13:
            com.ui.sso.api.provider.UiAccountProvider$h r0 = new com.ui.sso.api.provider.UiAccountProvider$h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f41854c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41856e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f41852a
            com.ui.sso.api.provider.UiAccountProvider r0 = (com.ui.sso.api.provider.UiAccountProvider) r0
            Yg.v.b(r8)
            goto L8b
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.f41853b
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r5 = r0.f41852a
            com.ui.sso.api.provider.UiAccountProvider r5 = (com.ui.sso.api.provider.UiAccountProvider) r5
            Yg.v.b(r8)
            goto L65
        L45:
            Yg.v.b(r8)
            android.content.Context r8 = r7.getContext()
            kotlin.jvm.internal.AbstractC6492s.f(r8)
            android.content.Context r2 = r8.getApplicationContext()
            com.ui.sso.account.UIAccountManager r8 = r7.u()
            r0.f41852a = r7
            r0.f41853b = r2
            r0.f41856e = r4
            java.lang.Object r8 = r8.e(r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            r5 = r7
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto Lb1
            com.ui.sso.account.UIAccountManager r8 = r5._accountManagerLocal
            if (r8 == 0) goto L75
            kotlin.jvm.internal.AbstractC6492s.f(r8)
            return r8
        L75:
            com.ui.sso.account.local.UiAccountSharedPrefProvider r8 = r5.C()
            kotlin.jvm.internal.AbstractC6492s.f(r2)
            r0.f41852a = r5
            r6 = 0
            r0.f41853b = r6
            r0.f41856e = r3
            java.lang.Object r8 = r8.a(r2, r4, r0)
            if (r8 != r1) goto L8a
            return r1
        L8a:
            r0 = r5
        L8b:
            r2 = r8
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            monitor-enter(r0)
            com.ui.sso.account.UIAccountManager r8 = r0._accountManagerLocal     // Catch: java.lang.Throwable -> L98
            if (r8 == 0) goto L9a
            kotlin.jvm.internal.AbstractC6492s.f(r8)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r0)
            return r8
        L98:
            r8 = move-exception
            goto Laf
        L9a:
            Pa.a r8 = new Pa.a     // Catch: java.lang.Throwable -> L98
            Ii.J r4 = r0.dispatcherIO     // Catch: java.lang.Throwable -> L98
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L98
            r8.g(r0)     // Catch: java.lang.Throwable -> L98
            r0._accountManagerLocal = r8     // Catch: java.lang.Throwable -> L98
            Yg.J r8 = Yg.J.f24997a     // Catch: java.lang.Throwable -> L98
            monitor-exit(r0)
            r5 = r0
            goto Lb1
        Laf:
            monitor-exit(r0)
            throw r8
        Lb1:
            com.ui.sso.account.UIAccountManager r8 = r5.u()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.UiAccountProvider.t(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(dh.InterfaceC5380e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.ui.sso.api.provider.UiAccountProvider.i
            if (r0 == 0) goto L13
            r0 = r6
            com.ui.sso.api.provider.UiAccountProvider$i r0 = (com.ui.sso.api.provider.UiAccountProvider.i) r0
            int r1 = r0.f41860d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41860d = r1
            goto L18
        L13:
            com.ui.sso.api.provider.UiAccountProvider$i r0 = new com.ui.sso.api.provider.UiAccountProvider$i
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41858b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41860d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L34
            java.lang.Object r0 = r0.f41857a
            com.ui.sso.api.provider.UiAccountProvider r0 = (com.ui.sso.api.provider.UiAccountProvider) r0
            Yg.v.b(r6)     // Catch: com.ui.sso.api.provider.UiAccountProviderCursor.Serializer.Error -> L30 com.ui.sso.account.UIAccountManager.Error -> L32
            goto L62
        L30:
            r6 = move-exception
            goto L72
        L32:
            r6 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3d:
            java.lang.Object r2 = r0.f41857a
            com.ui.sso.api.provider.UiAccountProvider r2 = (com.ui.sso.api.provider.UiAccountProvider) r2
            Yg.v.b(r6)     // Catch: com.ui.sso.api.provider.UiAccountProviderCursor.Serializer.Error -> L30 com.ui.sso.account.UIAccountManager.Error -> L32
            goto L54
        L45:
            Yg.v.b(r6)
            r0.f41857a = r5     // Catch: com.ui.sso.api.provider.UiAccountProviderCursor.Serializer.Error -> L30 com.ui.sso.account.UIAccountManager.Error -> L32
            r0.f41860d = r4     // Catch: com.ui.sso.api.provider.UiAccountProviderCursor.Serializer.Error -> L30 com.ui.sso.account.UIAccountManager.Error -> L32
            java.lang.Object r6 = r5.t(r0)     // Catch: com.ui.sso.api.provider.UiAccountProviderCursor.Serializer.Error -> L30 com.ui.sso.account.UIAccountManager.Error -> L32
            if (r6 != r1) goto L53
            return r1
        L53:
            r2 = r5
        L54:
            com.ui.sso.account.UIAccountManager r6 = (com.ui.sso.account.UIAccountManager) r6     // Catch: com.ui.sso.api.provider.UiAccountProviderCursor.Serializer.Error -> L30 com.ui.sso.account.UIAccountManager.Error -> L32
            r0.f41857a = r2     // Catch: com.ui.sso.api.provider.UiAccountProviderCursor.Serializer.Error -> L30 com.ui.sso.account.UIAccountManager.Error -> L32
            r0.f41860d = r3     // Catch: com.ui.sso.api.provider.UiAccountProviderCursor.Serializer.Error -> L30 com.ui.sso.account.UIAccountManager.Error -> L32
            java.lang.Object r6 = r6.f(r0)     // Catch: com.ui.sso.api.provider.UiAccountProviderCursor.Serializer.Error -> L30 com.ui.sso.account.UIAccountManager.Error -> L32
            if (r6 != r1) goto L61
            return r1
        L61:
            r0 = r2
        L62:
            java.util.List r6 = (java.util.List) r6     // Catch: com.ui.sso.api.provider.UiAccountProviderCursor.Serializer.Error -> L30 com.ui.sso.account.UIAccountManager.Error -> L32
            com.ui.sso.api.provider.UiAccountProviderCursor$a r1 = new com.ui.sso.api.provider.UiAccountProviderCursor$a     // Catch: com.ui.sso.api.provider.UiAccountProviderCursor.Serializer.Error -> L30 com.ui.sso.account.UIAccountManager.Error -> L32
            r1.<init>(r6)     // Catch: com.ui.sso.api.provider.UiAccountProviderCursor.Serializer.Error -> L30 com.ui.sso.account.UIAccountManager.Error -> L32
            com.ui.sso.api.provider.UiAccountProviderCursor$Serializer r6 = r0.z()     // Catch: com.ui.sso.api.provider.UiAccountProviderCursor.Serializer.Error -> L30 com.ui.sso.account.UIAccountManager.Error -> L32
            android.database.Cursor r6 = r6.b(r1)     // Catch: com.ui.sso.api.provider.UiAccountProviderCursor.Serializer.Error -> L30 com.ui.sso.account.UIAccountManager.Error -> L32
            return r6
        L72:
            com.ui.sso.api.provider.UiAccountProviderError$IllegalState r0 = new com.ui.sso.api.provider.UiAccountProviderError$IllegalState
            java.lang.String r1 = "Failed to serialize accounts to cursor"
            r0.<init>(r1, r6)
            throw r0
        L7b:
            com.ui.sso.api.provider.UiAccountProviderError$AccountManager r0 = new com.ui.sso.api.provider.UiAccountProviderError$AccountManager
            java.lang.String r1 = "Failed to get accounts"
            r0.<init>(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.UiAccountProvider.w(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(com.ui.sso.api.provider.d.AuthGet r6, dh.InterfaceC5380e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ui.sso.api.provider.UiAccountProvider.j
            if (r0 == 0) goto L13
            r0 = r7
            com.ui.sso.api.provider.UiAccountProvider$j r0 = (com.ui.sso.api.provider.UiAccountProvider.j) r0
            int r1 = r0.f41865e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41865e = r1
            goto L18
        L13:
            com.ui.sso.api.provider.UiAccountProvider$j r0 = new com.ui.sso.api.provider.UiAccountProvider$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f41863c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41865e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2e
            Yg.v.b(r7)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            goto L70
        L2c:
            r6 = move-exception
            goto L78
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            java.lang.Object r6 = r0.f41862b
            com.ui.sso.api.provider.d$c r6 = (com.ui.sso.api.provider.d.AuthGet) r6
            java.lang.Object r2 = r0.f41861a
            com.ui.sso.api.provider.UiAccountProvider r2 = (com.ui.sso.api.provider.UiAccountProvider) r2
            Yg.v.b(r7)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            goto L54
        L43:
            Yg.v.b(r7)
            r0.f41861a = r5     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41862b = r6     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41865e = r4     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.Object r7 = r5.t(r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            if (r7 != r1) goto L53
            return r1
        L53:
            r2 = r5
        L54:
            com.ui.sso.account.UIAccountManager r7 = (com.ui.sso.account.UIAccountManager) r7     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.String r4 = r6.getAccountId()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.util.UUID r2 = r2.s(r4)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.String r6 = r6.getAuthType()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r4 = 0
            r0.f41861a = r4     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41862b = r4     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r0.f41865e = r3     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            java.lang.Object r7 = r7.i(r2, r6, r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            if (r7 != r1) goto L70
            return r1
        L70:
            java.lang.String r7 = (java.lang.String) r7     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            com.ui.sso.api.provider.e$b r6 = new com.ui.sso.api.provider.e$b     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            r6.<init>(r7)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2c
            return r6
        L78:
            com.ui.sso.api.provider.UiAccountProviderError$AccountManager r7 = new com.ui.sso.api.provider.UiAccountProviderError$AccountManager
            java.lang.String r0 = "Failed to get Auth token"
            r7.<init>(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.UiAccountProvider.x(com.ui.sso.api.provider.d$c, dh.e):java.lang.Object");
    }

    public final Ta.d B() {
        Ta.d dVar = this.deviceIdentifiersService;
        if (dVar != null) {
            return dVar;
        }
        AbstractC6492s.v("deviceIdentifiersService");
        return null;
    }

    public final UiAccountSharedPrefProvider C() {
        UiAccountSharedPrefProvider uiAccountSharedPrefProvider = this.encryptedPrefProvider;
        if (uiAccountSharedPrefProvider != null) {
            return uiAccountSharedPrefProvider;
        }
        AbstractC6492s.v("encryptedPrefProvider");
        return null;
    }

    public final Wa.f D() {
        Wa.f fVar = this.packageCertificateVerifier;
        if (fVar != null) {
            return fVar;
        }
        AbstractC6492s.v("packageCertificateVerifier");
        return null;
    }

    public final String E() {
        String str = this.packageName;
        if (str != null) {
            return str;
        }
        AbstractC6492s.v("packageName");
        return null;
    }

    public final UriMatcher F() {
        UriMatcher uriMatcher = this.queryUriMatcher;
        if (uriMatcher != null) {
            return uriMatcher;
        }
        AbstractC6492s.v("queryUriMatcher");
        return null;
    }

    public final UiAccountProviderMessageSerializer G() {
        UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer = this.requestSerializer;
        if (uiAccountProviderMessageSerializer != null) {
            return uiAccountProviderMessageSerializer;
        }
        AbstractC6492s.v("requestSerializer");
        return null;
    }

    public final UiAccountProviderMessageSerializer H() {
        UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer = this.responseSerializer;
        if (uiAccountProviderMessageSerializer != null) {
            return uiAccountProviderMessageSerializer;
        }
        AbstractC6492s.v("responseSerializer");
        return null;
    }

    public final Qa.a J() {
        Qa.a aVar = this.uiAccountOwnershipStorage;
        if (aVar != null) {
            return aVar;
        }
        AbstractC6492s.v("uiAccountOwnershipStorage");
        return null;
    }

    public final com.ui.sso.api.provider.f K() {
        com.ui.sso.api.provider.f fVar = this.uri;
        if (fVar != null) {
            return fVar;
        }
        AbstractC6492s.v("uri");
        return null;
    }

    public final void N(UIAccountManager uIAccountManager) {
        AbstractC6492s.i(uIAccountManager, "<set-?>");
        this.accountManagerAndroid = uIAccountManager;
    }

    public final void O(String str) {
        AbstractC6492s.i(str, "<set-?>");
        this.accountType = str;
    }

    public final void P(ContentResolver contentResolver) {
        AbstractC6492s.i(contentResolver, "<set-?>");
        this.contentResolver = contentResolver;
    }

    public final void Q(UiAccountProviderCursor.Serializer serializer) {
        AbstractC6492s.i(serializer, "<set-?>");
        this.cursorSerializer = serializer;
    }

    public final void R(Ta.d dVar) {
        AbstractC6492s.i(dVar, "<set-?>");
        this.deviceIdentifiersService = dVar;
    }

    public final void S(UiAccountSharedPrefProvider uiAccountSharedPrefProvider) {
        AbstractC6492s.i(uiAccountSharedPrefProvider, "<set-?>");
        this.encryptedPrefProvider = uiAccountSharedPrefProvider;
    }

    public final void T(Wa.f fVar) {
        AbstractC6492s.i(fVar, "<set-?>");
        this.packageCertificateVerifier = fVar;
    }

    public final void U(String str) {
        AbstractC6492s.i(str, "<set-?>");
        this.packageName = str;
    }

    public final void V(UriMatcher uriMatcher) {
        AbstractC6492s.i(uriMatcher, "<set-?>");
        this.queryUriMatcher = uriMatcher;
    }

    public final void W(UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer) {
        AbstractC6492s.i(uiAccountProviderMessageSerializer, "<set-?>");
        this.requestSerializer = uiAccountProviderMessageSerializer;
    }

    public final void X(UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer) {
        AbstractC6492s.i(uiAccountProviderMessageSerializer, "<set-?>");
        this.responseSerializer = uiAccountProviderMessageSerializer;
    }

    public final void Y(Qa.a aVar) {
        AbstractC6492s.i(aVar, "<set-?>");
        this.uiAccountOwnershipStorage = aVar;
    }

    public final void Z(com.ui.sso.api.provider.f fVar) {
        AbstractC6492s.i(fVar, "<set-?>");
        this.uri = fVar;
    }

    @Override // com.ui.sso.account.UIAccountManager.a
    public void a() {
        Ua.a.e(p.f41889a);
        y().notifyChange(K().a(), null);
    }

    @Override // com.ui.sso.account.UIAccountManager.a
    public void b(UUID accountId) {
        AbstractC6492s.i(accountId, "accountId");
        Ua.a.e(new q(accountId));
        y().notifyChange(K().d(accountId), null);
    }

    @Override // android.content.ContentProvider
    public Bundle call(String method, String arg, Bundle extras) {
        AbstractC6492s.i(method, "method");
        Ua.a.e(new d(method));
        return (Bundle) AbstractC3061j.b(null, new e(method, extras, null), 1, null);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri p02, String p12, String[] p22) {
        AbstractC6492s.i(p02, "p0");
        AbstractC3061j.b(null, new f(null), 1, null);
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        AbstractC6492s.i(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri p02, ContentValues p12) {
        AbstractC6492s.i(p02, "p0");
        AbstractC3061j.b(null, new n(null), 1, null);
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = getContext();
        AbstractC6492s.f(context);
        Context applicationContext = context.getApplicationContext();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        AbstractC6492s.h(contentResolver, "getContentResolver(...)");
        P(contentResolver);
        PackageManager packageManager = applicationContext.getPackageManager();
        AbstractC6492s.h(packageManager, "getPackageManager(...)");
        T(new Wa.j(new Wa.i(packageManager, Wa.a.f23740b.a()), Ma.a.f13069a.a()));
        String packageName = applicationContext.getPackageName();
        AbstractC6492s.h(packageName, "getPackageName(...)");
        U(packageName);
        if (!D().a(E())) {
            Log.e("UiAccountProvider", "App signing certificate is not listed. This should never happen for production build since production certificate listis stale and shouldn't be configured. For internal builds, make sure your certificate is listed in [UiAccountLib.allowedCertFingerprint]");
        }
        String string = applicationContext.getString(Na.a.f16328c);
        AbstractC6492s.h(string, "getString(...)");
        O(string);
        String strV = v();
        AccountManager accountManager = AccountManager.get(applicationContext);
        AbstractC6492s.h(accountManager, "get(...)");
        Oa.d dVar = new Oa.d(strV, accountManager, null, this.dispatcherIO, 4, null);
        dVar.g(this);
        N(dVar);
        S(new com.ui.sso.account.local.a(this.dispatcherIO));
        a.C0864a c0864a = Va.a.f23290a;
        AbstractC6492s.f(applicationContext);
        Y(c0864a.a(applicationContext));
        R(Ta.e.f21524g.a(applicationContext, this.dispatcherIO));
        Z(f.b.C1371b.a(f.b.f42152a.a(), E(), null, 2, null));
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(K().b(), "accounts", 0);
        V(uriMatcher);
        W(new d.h());
        X(new e.f());
        Q(new com.ui.sso.api.provider.c());
        Ua.a.e(new r(jCurrentTimeMillis));
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        AbstractC6492s.i(uri, "uri");
        Ua.a.e(new s(uri));
        return (Cursor) AbstractC3061j.b(null, new t(uri, null), 1, null);
    }

    public final UIAccountManager u() {
        UIAccountManager uIAccountManager = this.accountManagerAndroid;
        if (uIAccountManager != null) {
            return uIAccountManager;
        }
        AbstractC6492s.v("accountManagerAndroid");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri p02, ContentValues p12, String p22, String[] p32) {
        AbstractC6492s.i(p02, "p0");
        AbstractC3061j.b(null, new u(null), 1, null);
        return 0;
    }

    public final String v() {
        String str = this.accountType;
        if (str != null) {
            return str;
        }
        AbstractC6492s.v("accountType");
        return null;
    }

    public final ContentResolver y() {
        ContentResolver contentResolver = this.contentResolver;
        if (contentResolver != null) {
            return contentResolver;
        }
        AbstractC6492s.v("contentResolver");
        return null;
    }

    public final UiAccountProviderCursor.Serializer z() {
        UiAccountProviderCursor.Serializer serializer = this.cursorSerializer;
        if (serializer != null) {
            return serializer;
        }
        AbstractC6492s.v("cursorSerializer");
        return null;
    }
}
