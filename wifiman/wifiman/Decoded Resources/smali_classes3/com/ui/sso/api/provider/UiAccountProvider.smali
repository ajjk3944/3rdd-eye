.class public final Lcom/ui/sso/api/provider/UiAccountProvider;
.super Landroid/content/ContentProvider;
.source "SourceFile"

# interfaces
.implements Lcom/ui/sso/account/UIAccountManager$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/api/provider/UiAccountProvider$a;,
        Lcom/ui/sso/api/provider/UiAccountProvider$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0002ACB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0004J7\u0010\u000f\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\n2\u001c\u0010\u000e\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0007J\u0013\u0010\u0014\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0007J\u0013\u0010\u0016\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0007J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\"J\u001b\u0010%\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020#H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008%\u0010&J\u001b\u0010(\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\'H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008(\u0010)J\u001b\u0010+\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020*H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008+\u0010,J\u0013\u0010.\u001a\u00020-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008.\u0010\u0007J\u000f\u00100\u001a\u00020/H\u0016\u00a2\u0006\u0004\u00080\u00101J+\u00106\u001a\u0002042\u0006\u00102\u001a\u00020\u00172\u0008\u00103\u001a\u0004\u0018\u00010\u00172\u0008\u00105\u001a\u0004\u0018\u000104H\u0016\u00a2\u0006\u0004\u00086\u00107JK\u0010?\u001a\u00020-2\u0006\u00109\u001a\u0002082\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010:2\u0008\u0010<\u001a\u0004\u0018\u00010\u00172\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010:2\u0008\u0010>\u001a\u0004\u0018\u00010\u0017H\u0016\u00a2\u0006\u0004\u0008?\u0010@J\u000f\u0010A\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008A\u0010\u0004J\u0017\u0010C\u001a\u00020\u00082\u0006\u0010B\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008C\u0010DJ\u0019\u0010E\u001a\u0004\u0018\u00010\u00172\u0006\u00109\u001a\u000208H\u0016\u00a2\u0006\u0004\u0008E\u0010FJ#\u0010J\u001a\u0004\u0018\u0001082\u0006\u0010G\u001a\u0002082\u0008\u0010I\u001a\u0004\u0018\u00010HH\u0016\u00a2\u0006\u0004\u0008J\u0010KJ3\u0010N\u001a\u00020M2\u0006\u0010G\u001a\u0002082\u0008\u0010I\u001a\u0004\u0018\u00010\u00172\u0010\u0010L\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0017\u0018\u00010:H\u0016\u00a2\u0006\u0004\u0008N\u0010OJ=\u0010Q\u001a\u00020M2\u0006\u0010G\u001a\u0002082\u0008\u0010I\u001a\u0004\u0018\u00010H2\u0008\u0010L\u001a\u0004\u0018\u00010\u00172\u0010\u0010P\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0017\u0018\u00010:H\u0016\u00a2\u0006\u0004\u0008Q\u0010RR\"\u0010X\u001a\u00020\u00058\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008A\u0010S\u001a\u0004\u0008T\u0010U\"\u0004\u0008V\u0010WR\"\u0010_\u001a\u00020Y8\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008C\u0010Z\u001a\u0004\u0008[\u0010\\\"\u0004\u0008]\u0010^R$\u0010c\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008`\u0010S\u001a\u0004\u0008a\u0010U\"\u0004\u0008b\u0010WR\"\u0010k\u001a\u00020d8\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008e\u0010f\u001a\u0004\u0008g\u0010h\"\u0004\u0008i\u0010jR\"\u0010r\u001a\u00020\u00178\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008l\u0010m\u001a\u0004\u0008n\u0010o\"\u0004\u0008p\u0010qR\"\u0010v\u001a\u00020\u00178\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008s\u0010m\u001a\u0004\u0008t\u0010o\"\u0004\u0008u\u0010qR\"\u0010~\u001a\u00020w8\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008x\u0010y\u001a\u0004\u0008z\u0010{\"\u0004\u0008|\u0010}R(\u00109\u001a\u00020\u007f8\u0000@\u0000X\u0080.\u00a2\u0006\u0018\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001\"\u0006\u0008\u0084\u0001\u0010\u0085\u0001R1\u0010\u008e\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00018\u0000@\u0000X\u0080.\u00a2\u0006\u0018\n\u0006\u0008\u0088\u0001\u0010\u0089\u0001\u001a\u0006\u0008\u008a\u0001\u0010\u008b\u0001\"\u0006\u0008\u008c\u0001\u0010\u008d\u0001R1\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u0086\u00018\u0000@\u0000X\u0080.\u00a2\u0006\u0018\n\u0006\u0008\u0090\u0001\u0010\u0089\u0001\u001a\u0006\u0008\u0091\u0001\u0010\u008b\u0001\"\u0006\u0008\u0092\u0001\u0010\u008d\u0001R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0000@\u0000X\u0080.\u00a2\u0006\u0018\n\u0006\u0008\u0095\u0001\u0010\u0096\u0001\u001a\u0006\u0008\u0097\u0001\u0010\u0098\u0001\"\u0006\u0008\u0099\u0001\u0010\u009a\u0001R*\u0010\u00a3\u0001\u001a\u00030\u009c\u00018\u0000@\u0000X\u0080.\u00a2\u0006\u0018\n\u0006\u0008\u009d\u0001\u0010\u009e\u0001\u001a\u0006\u0008\u009f\u0001\u0010\u00a0\u0001\"\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001R*\u0010\u00ab\u0001\u001a\u00030\u00a4\u00018\u0000@\u0000X\u0080.\u00a2\u0006\u0018\n\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001\u001a\u0006\u0008\u00a7\u0001\u0010\u00a8\u0001\"\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001R*\u0010\u00b3\u0001\u001a\u00030\u00ac\u00018\u0000@\u0000X\u0080.\u00a2\u0006\u0018\n\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001\u001a\u0006\u0008\u00af\u0001\u0010\u00b0\u0001\"\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001R \u0010\u00b9\u0001\u001a\u00030\u00b4\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00b5\u0001\u0010\u00b6\u0001\u001a\u0006\u0008\u00b7\u0001\u0010\u00b8\u0001R$\u0010\u00bd\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0005\u0012\u00030\u00bb\u00010\u00ba\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0012\u0010\u00bc\u0001\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u00be\u0001"
    }
    d2 = {
        "Lcom/ui/sso/api/provider/UiAccountProvider;",
        "Landroid/content/ContentProvider;",
        "Lcom/ui/sso/account/UIAccountManager$a;",
        "<init>",
        "()V",
        "Lcom/ui/sso/account/UIAccountManager;",
        "t",
        "(Ldh/e;)Ljava/lang/Object;",
        "LYg/J;",
        "q",
        "Out",
        "Lkotlin/Function1;",
        "Ldh/e;",
        "",
        "action",
        "L",
        "(Lmh/l;Ldh/e;)Ljava/lang/Object;",
        "Lcom/ui/sso/api/provider/e$a;",
        "p",
        "Lcom/ui/sso/api/provider/e$h;",
        "I",
        "Lcom/ui/sso/api/provider/e$e;",
        "A",
        "",
        "accIdStr",
        "Ljava/util/UUID;",
        "s",
        "(Ljava/lang/String;)Ljava/util/UUID;",
        "Lcom/ui/sso/api/provider/d$b;",
        "request",
        "a0",
        "(Lcom/ui/sso/api/provider/d$b;Ldh/e;)Ljava/lang/Object;",
        "Lcom/ui/sso/api/provider/d$a;",
        "r",
        "(Lcom/ui/sso/api/provider/d$a;Ldh/e;)Ljava/lang/Object;",
        "Lcom/ui/sso/api/provider/d$c;",
        "Lcom/ui/sso/api/provider/e$b;",
        "x",
        "(Lcom/ui/sso/api/provider/d$c;Ldh/e;)Ljava/lang/Object;",
        "Lcom/ui/sso/api/provider/d$e;",
        "b0",
        "(Lcom/ui/sso/api/provider/d$e;Ldh/e;)Ljava/lang/Object;",
        "Lcom/ui/sso/api/provider/d$d;",
        "M",
        "(Lcom/ui/sso/api/provider/d$d;Ldh/e;)Ljava/lang/Object;",
        "Landroid/database/Cursor;",
        "w",
        "",
        "onCreate",
        "()Z",
        "method",
        "arg",
        "Landroid/os/Bundle;",
        "extras",
        "call",
        "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;",
        "Landroid/net/Uri;",
        "uri",
        "",
        "projection",
        "selection",
        "selectionArgs",
        "sortOrder",
        "query",
        "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;",
        "a",
        "accountId",
        "b",
        "(Ljava/util/UUID;)V",
        "getType",
        "(Landroid/net/Uri;)Ljava/lang/String;",
        "p0",
        "Landroid/content/ContentValues;",
        "p1",
        "insert",
        "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;",
        "p2",
        "",
        "delete",
        "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I",
        "p3",
        "update",
        "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I",
        "Lcom/ui/sso/account/UIAccountManager;",
        "u",
        "()Lcom/ui/sso/account/UIAccountManager;",
        "N",
        "(Lcom/ui/sso/account/UIAccountManager;)V",
        "accountManagerAndroid",
        "Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;",
        "Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;",
        "C",
        "()Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;",
        "S",
        "(Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;)V",
        "encryptedPrefProvider",
        "c",
        "get_accountManagerLocal$account_release",
        "set_accountManagerLocal$account_release",
        "_accountManagerLocal",
        "Landroid/content/UriMatcher;",
        "d",
        "Landroid/content/UriMatcher;",
        "F",
        "()Landroid/content/UriMatcher;",
        "V",
        "(Landroid/content/UriMatcher;)V",
        "queryUriMatcher",
        "e",
        "Ljava/lang/String;",
        "E",
        "()Ljava/lang/String;",
        "U",
        "(Ljava/lang/String;)V",
        "packageName",
        "f",
        "v",
        "O",
        "accountType",
        "LTa/d;",
        "g",
        "LTa/d;",
        "B",
        "()LTa/d;",
        "R",
        "(LTa/d;)V",
        "deviceIdentifiersService",
        "Lcom/ui/sso/api/provider/f;",
        "h",
        "Lcom/ui/sso/api/provider/f;",
        "K",
        "()Lcom/ui/sso/api/provider/f;",
        "Z",
        "(Lcom/ui/sso/api/provider/f;)V",
        "Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;",
        "Lcom/ui/sso/api/provider/d;",
        "i",
        "Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;",
        "G",
        "()Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;",
        "W",
        "(Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;)V",
        "requestSerializer",
        "Lcom/ui/sso/api/provider/e;",
        "j",
        "H",
        "X",
        "responseSerializer",
        "Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;",
        "k",
        "Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;",
        "z",
        "()Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;",
        "Q",
        "(Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;)V",
        "cursorSerializer",
        "Landroid/content/ContentResolver;",
        "l",
        "Landroid/content/ContentResolver;",
        "y",
        "()Landroid/content/ContentResolver;",
        "P",
        "(Landroid/content/ContentResolver;)V",
        "contentResolver",
        "LWa/f;",
        "m",
        "LWa/f;",
        "D",
        "()LWa/f;",
        "T",
        "(LWa/f;)V",
        "packageCertificateVerifier",
        "LQa/a;",
        "n",
        "LQa/a;",
        "J",
        "()LQa/a;",
        "Y",
        "(LQa/a;)V",
        "uiAccountOwnershipStorage",
        "LIi/J;",
        "o",
        "LIi/J;",
        "getDispatcherIO$account_release",
        "()LIi/J;",
        "dispatcherIO",
        "",
        "Lcom/ui/sso/api/provider/UiAccountProvider$b;",
        "Ljava/util/Map;",
        "supportedActions",
        "account_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final q:Lcom/ui/sso/api/provider/UiAccountProvider$a;


# instance fields
.field public a:Lcom/ui/sso/account/UIAccountManager;

.field public b:Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;

.field private c:Lcom/ui/sso/account/UIAccountManager;

.field public d:Landroid/content/UriMatcher;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:LTa/d;

.field public h:Lcom/ui/sso/api/provider/f;

.field public i:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

.field public j:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

.field public k:Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;

.field public l:Landroid/content/ContentResolver;

.field public m:LWa/f;

.field public n:LQa/a;

.field private final o:LIi/J;

.field private final p:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/sso/api/provider/UiAccountProvider$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/sso/api/provider/UiAccountProvider;->q:Lcom/ui/sso/api/provider/UiAccountProvider$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->o:LIi/J;

    invoke-static {}, Lcom/ui/sso/api/provider/UiAccountProvider$b;->getEntries()Lfh/a;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/ui/sso/api/provider/UiAccountProvider$b;

    invoke-virtual {v3}, Lcom/ui/sso/api/provider/UiAccountProvider$b;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object v2, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->p:Ljava/util/Map;

    return-void
.end method

.method private final A(Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lcom/ui/sso/api/provider/UiAccountProvider$k;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProvider$k;

    iget v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$k;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$k;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$k;

    invoke-direct {v0, p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$k;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$k;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$k;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->B()LTa/d;

    move-result-object p1

    iput v3, v0, Lcom/ui/sso/api/provider/UiAccountProvider$k;->c:I

    invoke-interface {p1, v0}, LTa/d;->a(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, LTa/c;

    new-instance v0, Lcom/ui/sso/api/provider/e$e;

    invoke-virtual {p1}, LTa/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LTa/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LTa/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lcom/ui/sso/api/provider/e$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final I(Ldh/e;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p1, Lcom/ui/sso/api/provider/UiAccountProvider$l;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;

    iget v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->i:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;

    invoke-direct {v0, p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$l;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->g:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->i:I

    const/4 v3, 0x2

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v4, :cond_1

    iget-boolean v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->f:Z

    iget-boolean v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->e:Z

    iget v3, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->d:I

    iget-object v4, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->c:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->b:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v0, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->a:Ljava/lang/Object;

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProvider;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_0 .. :try_end_0} :catch_0

    move v6, v1

    move-object v9, v4

    move v4, v2

    move v2, v3

    move-object v3, v5

    move-object v5, v9

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->e:Z

    iget v3, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->d:I

    iget-object v5, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->c:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->b:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->a:Ljava/lang/Object;

    check-cast v7, Lcom/ui/sso/api/provider/UiAccountProvider;

    :try_start_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_1 .. :try_end_1} :catch_0

    move-object v9, v7

    move-object v7, v6

    move-object v6, v9

    goto :goto_2

    :cond_3
    iget v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->d:I

    iget-object v5, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->b:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->a:Ljava/lang/Object;

    check-cast v6, Lcom/ui/sso/api/provider/UiAccountProvider;

    :try_start_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :cond_4
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_3
    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->v()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->u()Lcom/ui/sso/account/UIAccountManager;

    move-result-object v2

    iput-object p0, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->b:Ljava/lang/Object;

    iput v4, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->d:I

    iput v5, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->i:I

    invoke-interface {v2, v0}, Lcom/ui/sso/account/UIAccountManager;->e(Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v6, p0

    move-object v5, p1

    move-object p1, v2

    move v2, v4

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v6}, Lcom/ui/sso/api/provider/UiAccountProvider;->E()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lcom/ui/sso/api/provider/UiAccountProvider;->J()LQa/a;

    move-result-object v8

    iput-object v6, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->a:Ljava/lang/Object;

    iput-object v5, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->b:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->c:Ljava/lang/Object;

    iput v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->d:I

    iput-boolean p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->e:Z

    iput v3, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->i:I

    invoke-interface {v8, v0}, LQa/a;->a(Ldh/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_6

    return-object v1

    :cond_6
    move v9, v2

    move v2, p1

    move-object p1, v3

    move v3, v9

    move-object v10, v7

    move-object v7, v5

    move-object v5, v10

    :goto_2
    invoke-virtual {v6}, Lcom/ui/sso/api/provider/UiAccountProvider;->E()Ljava/lang/String;

    move-result-object v8

    invoke-static {p1, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v6}, Lcom/ui/sso/api/provider/UiAccountProvider;->J()LQa/a;

    move-result-object v8

    iput-object v6, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->a:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->b:Ljava/lang/Object;

    iput-object v5, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->c:Ljava/lang/Object;

    iput v3, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->d:I

    iput-boolean v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->e:Z

    iput-boolean p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->f:Z

    iput v4, v0, Lcom/ui/sso/api/provider/UiAccountProvider$l;->i:I

    invoke-interface {v8, v0}, LQa/a;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_7

    return-object v1

    :cond_7
    move v4, v2

    move v2, v3

    move-object v3, v7

    move-object v9, v6

    move v6, p1

    move-object p1, v0

    move-object v0, v9

    :goto_3
    invoke-virtual {v0}, Lcom/ui/sso/api/provider/UiAccountProvider;->E()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    new-instance p1, Lcom/ui/sso/api/provider/e$h;

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lcom/ui/sso/api/provider/e$h;-><init>(ILjava/lang/String;ZLjava/lang/String;ZZ)V
    :try_end_3
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_3 .. :try_end_3} :catch_0

    return-object p1

    :goto_4
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;

    const-string/jumbo v1, "Failed to get Api state"

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;-><init>(Ljava/lang/String;Lcom/ui/sso/account/UIAccountManager$Error;)V

    throw v0
.end method

.method private final L(Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/ui/sso/api/provider/UiAccountProvider$m;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProvider$m;

    iget v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$m;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$m;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$m;

    invoke-direct {v0, p0, p2}, Lcom/ui/sso/api/provider/UiAccountProvider$m;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$m;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$m;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/api/provider/UiAccountProviderError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iput v3, v0, Lcom/ui/sso/api/provider/UiAccountProvider$m;->c:I

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Lcom/ui/sso/api/provider/UiAccountProviderError; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    return-object p2

    :goto_2
    new-instance p2, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;

    invoke-direct {p2, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;-><init>(Lcom/ui/sso/api/provider/UiAccountProviderError;)V

    throw p2
.end method

.method private final M(Lcom/ui/sso/api/provider/d$d;Ldh/e;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/ui/sso/api/provider/UiAccountProvider$o;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProvider$o;

    iget v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$o;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$o;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$o;

    invoke-direct {v0, p0, p2}, Lcom/ui/sso/api/provider/UiAccountProvider$o;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$o;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$o;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$o;->b:Ljava/lang/Object;

    check-cast p1, Lcom/ui/sso/api/provider/d$d;

    iget-object v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$o;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/sso/api/provider/UiAccountProvider;

    :try_start_1
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    iput-object p0, v0, Lcom/ui/sso/api/provider/UiAccountProvider$o;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$o;->b:Ljava/lang/Object;

    iput v4, v0, Lcom/ui/sso/api/provider/UiAccountProvider$o;->e:I

    invoke-direct {p0, v0}, Lcom/ui/sso/api/provider/UiAccountProvider;->t(Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p2, Lcom/ui/sso/account/UIAccountManager;

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/d$d;->c()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Lcom/ui/sso/api/provider/UiAccountProvider;->s(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/d$d;->d()Ljava/lang/String;

    move-result-object p1

    const/4 v5, 0x0

    iput-object v5, v0, Lcom/ui/sso/api/provider/UiAccountProvider$o;->a:Ljava/lang/Object;

    iput-object v5, v0, Lcom/ui/sso/api/provider/UiAccountProvider$o;->b:Ljava/lang/Object;

    iput v3, v0, Lcom/ui/sso/api/provider/UiAccountProvider$o;->e:I

    invoke-interface {p2, v2, p1, v0}, Lcom/ui/sso/account/UIAccountManager;->j(Ljava/util/UUID;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    new-instance p1, Lcom/ui/sso/api/provider/e$a;

    invoke-direct {p1, v4}, Lcom/ui/sso/api/provider/e$a;-><init>(Z)V
    :try_end_2
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :goto_3
    new-instance p2, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;

    const-string/jumbo v0, "Failed to invalidate Auth token"

    invoke-direct {p2, v0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;-><init>(Ljava/lang/String;Lcom/ui/sso/account/UIAccountManager$Error;)V

    throw p2
.end method

.method private final a0(Lcom/ui/sso/api/provider/d$b;Ldh/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lcom/ui/sso/api/provider/UiAccountProvider$v;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProvider$v;

    iget v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$v;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$v;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$v;

    invoke-direct {v0, p0, p2}, Lcom/ui/sso/api/provider/UiAccountProvider$v;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$v;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$v;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$v;->b:Ljava/lang/Object;

    check-cast p1, Lcom/ui/sso/api/provider/d$b;

    iget-object v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$v;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/sso/api/provider/UiAccountProvider;

    :try_start_1
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    iput-object p0, v0, Lcom/ui/sso/api/provider/UiAccountProvider$v;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$v;->b:Ljava/lang/Object;

    iput v4, v0, Lcom/ui/sso/api/provider/UiAccountProvider$v;->e:I

    invoke-direct {p0, v0}, Lcom/ui/sso/api/provider/UiAccountProvider;->t(Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p2, Lcom/ui/sso/account/UIAccountManager;

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/d$b;->c()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Lcom/ui/sso/api/provider/UiAccountProvider;->s(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/d$b;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/d$b;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/d$b;->d()Ljava/lang/String;

    move-result-object p1

    new-instance v7, LNa/b;

    invoke-direct {v7, v2, v6, v5, p1}, LNa/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$v;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$v;->b:Ljava/lang/Object;

    iput v3, v0, Lcom/ui/sso/api/provider/UiAccountProvider$v;->e:I

    invoke-interface {p2, v7, v0}, Lcom/ui/sso/account/UIAccountManager;->b(LNa/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    new-instance p1, Lcom/ui/sso/api/provider/e$a;

    invoke-direct {p1, v4}, Lcom/ui/sso/api/provider/e$a;-><init>(Z)V
    :try_end_2
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :goto_3
    new-instance p2, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;

    const-string/jumbo v0, "Failed create an account"

    invoke-direct {p2, v0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;-><init>(Ljava/lang/String;Lcom/ui/sso/account/UIAccountManager$Error;)V

    throw p2
.end method

.method private final b0(Lcom/ui/sso/api/provider/d$e;Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lcom/ui/sso/api/provider/UiAccountProvider$w;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProvider$w;

    iget v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$w;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$w;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$w;

    invoke-direct {v0, p0, p2}, Lcom/ui/sso/api/provider/UiAccountProvider$w;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$w;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$w;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$w;->b:Ljava/lang/Object;

    check-cast p1, Lcom/ui/sso/api/provider/d$e;

    iget-object v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$w;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/sso/api/provider/UiAccountProvider;

    :try_start_1
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    iput-object p0, v0, Lcom/ui/sso/api/provider/UiAccountProvider$w;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$w;->b:Ljava/lang/Object;

    iput v4, v0, Lcom/ui/sso/api/provider/UiAccountProvider$w;->e:I

    invoke-direct {p0, v0}, Lcom/ui/sso/api/provider/UiAccountProvider;->t(Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p2, Lcom/ui/sso/account/UIAccountManager;

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/d$e;->c()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Lcom/ui/sso/api/provider/UiAccountProvider;->s(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/d$e;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/d$e;->e()Ljava/lang/String;

    move-result-object p1

    const/4 v6, 0x0

    iput-object v6, v0, Lcom/ui/sso/api/provider/UiAccountProvider$w;->a:Ljava/lang/Object;

    iput-object v6, v0, Lcom/ui/sso/api/provider/UiAccountProvider$w;->b:Ljava/lang/Object;

    iput v3, v0, Lcom/ui/sso/api/provider/UiAccountProvider$w;->e:I

    invoke-interface {p2, v2, v5, p1, v0}, Lcom/ui/sso/account/UIAccountManager;->h(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    new-instance p1, Lcom/ui/sso/api/provider/e$a;

    invoke-direct {p1, v4}, Lcom/ui/sso/api/provider/e$a;-><init>(Z)V
    :try_end_2
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :goto_3
    new-instance p2, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;

    const-string/jumbo v0, "Failed to update Auth token"

    invoke-direct {p2, v0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;-><init>(Ljava/lang/String;Lcom/ui/sso/account/UIAccountManager$Error;)V

    throw p2
.end method

.method public static final synthetic c(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->p(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/ui/sso/api/provider/UiAccountProvider;)V
    .locals 0

    invoke-direct {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->q()V

    return-void
.end method

.method public static final synthetic e(Lcom/ui/sso/api/provider/UiAccountProvider;Lcom/ui/sso/api/provider/d$a;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/sso/api/provider/UiAccountProvider;->r(Lcom/ui/sso/api/provider/d$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->t(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->w(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/sso/api/provider/UiAccountProvider;Lcom/ui/sso/api/provider/d$c;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/sso/api/provider/UiAccountProvider;->x(Lcom/ui/sso/api/provider/d$c;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->A(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->I(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lcom/ui/sso/api/provider/UiAccountProvider;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->p:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic l(Lcom/ui/sso/api/provider/UiAccountProvider;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/sso/api/provider/UiAccountProvider;->L(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lcom/ui/sso/api/provider/UiAccountProvider;Lcom/ui/sso/api/provider/d$d;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/sso/api/provider/UiAccountProvider;->M(Lcom/ui/sso/api/provider/d$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/ui/sso/api/provider/UiAccountProvider;Lcom/ui/sso/api/provider/d$b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/sso/api/provider/UiAccountProvider;->a0(Lcom/ui/sso/api/provider/d$b;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lcom/ui/sso/api/provider/UiAccountProvider;Lcom/ui/sso/api/provider/d$e;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/sso/api/provider/UiAccountProvider;->b0(Lcom/ui/sso/api/provider/d$e;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final p(Ldh/e;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lcom/ui/sso/api/provider/UiAccountProvider$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProvider$c;

    iget v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$c;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$c;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$c;

    invoke-direct {v0, p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$c;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$c;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$c;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$c;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/sso/api/provider/UiAccountProvider;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->u()Lcom/ui/sso/account/UIAccountManager;

    move-result-object p1

    iput-object p0, v0, Lcom/ui/sso/api/provider/UiAccountProvider$c;->a:Ljava/lang/Object;

    iput v4, v0, Lcom/ui/sso/api/provider/UiAccountProvider$c;->d:I

    invoke-interface {p1, v0}, Lcom/ui/sso/account/UIAccountManager;->e(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v2}, Lcom/ui/sso/api/provider/UiAccountProvider;->J()LQa/a;

    move-result-object p1

    invoke-virtual {v2}, Lcom/ui/sso/api/provider/UiAccountProvider;->E()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    iput-object v5, v0, Lcom/ui/sso/api/provider/UiAccountProvider$c;->a:Ljava/lang/Object;

    iput v3, v0, Lcom/ui/sso/api/provider/UiAccountProvider$c;->d:I

    invoke-interface {p1, v2, v0}, LQa/a;->d(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    new-instance p1, Lcom/ui/sso/api/provider/e$a;

    invoke-direct {p1, v4}, Lcom/ui/sso/api/provider/e$a;-><init>(Z)V

    return-object p1

    :cond_6
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;

    new-instance v0, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;

    new-instance v1, Ljava/lang/SecurityException;

    invoke-direct {v1}, Ljava/lang/SecurityException;-><init>()V

    invoke-direct {v0, v1}, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;-><init>(Ljava/lang/SecurityException;)V

    const-string/jumbo v1, "Failed to acquire Android account storage since it\'s not accessible"

    invoke-direct {p1, v1, v0}, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;-><init>(Ljava/lang/String;Lcom/ui/sso/account/UIAccountManager$Error;)V

    throw p1
.end method

.method private final q()V
    .locals 4

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->D()LWa/f;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getCallingPackage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v0, v1}, LWa/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderError$CallerSignCertMismatch;

    invoke-direct {v0}, Lcom/ui/sso/api/provider/UiAccountProviderError$CallerSignCertMismatch;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    const-string/jumbo v1, "no calling package"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method private final r(Lcom/ui/sso/api/provider/d$a;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lcom/ui/sso/api/provider/UiAccountProvider$g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProvider$g;

    iget v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$g;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$g;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$g;

    invoke-direct {v0, p0, p2}, Lcom/ui/sso/api/provider/UiAccountProvider$g;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$g;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$g;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$g;->b:Ljava/lang/Object;

    check-cast p1, Lcom/ui/sso/api/provider/d$a;

    iget-object v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$g;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/sso/api/provider/UiAccountProvider;

    :try_start_1
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    iput-object p0, v0, Lcom/ui/sso/api/provider/UiAccountProvider$g;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$g;->b:Ljava/lang/Object;

    iput v4, v0, Lcom/ui/sso/api/provider/UiAccountProvider$g;->e:I

    invoke-direct {p0, v0}, Lcom/ui/sso/api/provider/UiAccountProvider;->t(Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p2, Lcom/ui/sso/account/UIAccountManager;

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/d$a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->s(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$g;->a:Ljava/lang/Object;

    iput-object v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$g;->b:Ljava/lang/Object;

    iput v3, v0, Lcom/ui/sso/api/provider/UiAccountProvider$g;->e:I

    invoke-interface {p2, p1, v0}, Lcom/ui/sso/account/UIAccountManager;->c(Ljava/util/UUID;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    new-instance p1, Lcom/ui/sso/api/provider/e$a;

    invoke-direct {p1, v4}, Lcom/ui/sso/api/provider/e$a;-><init>(Z)V
    :try_end_2
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :goto_3
    new-instance p2, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;

    const-string/jumbo v0, "Failed delete an account"

    invoke-direct {p2, v0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;-><init>(Ljava/lang/String;Lcom/ui/sso/account/UIAccountManager$Error;)V

    throw p2
.end method

.method private final s(Ljava/lang/String;)Ljava/util/UUID;
    .locals 4

    :try_start_0
    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    const-string/jumbo v1, "fromString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Account ID is not in UUID invalid format : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private final t(Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lcom/ui/sso/api/provider/UiAccountProvider$h;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;

    iget v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;

    invoke-direct {v0, p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$h;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;->a:Ljava/lang/Object;

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProvider;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;->b:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    iget-object v5, v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;->a:Ljava/lang/Object;

    check-cast v5, Lcom/ui/sso/api/provider/UiAccountProvider;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->u()Lcom/ui/sso/account/UIAccountManager;

    move-result-object p1

    iput-object p0, v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;->a:Ljava/lang/Object;

    iput-object v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;->b:Ljava/lang/Object;

    iput v4, v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;->e:I

    invoke-interface {p1, v0}, Lcom/ui/sso/account/UIAccountManager;->e(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v5, p0

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, v5, Lcom/ui/sso/api/provider/UiAccountProvider;->c:Lcom/ui/sso/account/UIAccountManager;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p1

    :cond_5
    invoke-virtual {v5}, Lcom/ui/sso/api/provider/UiAccountProvider;->C()Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;

    move-result-object p1

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iput-object v5, v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;->a:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;->b:Ljava/lang/Object;

    iput v3, v0, Lcom/ui/sso/api/provider/UiAccountProvider$h;->e:I

    invoke-interface {p1, v2, v4, v0}, Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;->a(Landroid/content/Context;ZLdh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object v0, v5

    :goto_2
    move-object v2, p1

    check-cast v2, Landroid/content/SharedPreferences;

    monitor-enter v0

    :try_start_0
    iget-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider;->c:Lcom/ui/sso/account/UIAccountManager;

    if-eqz p1, :cond_7

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_7
    :try_start_1
    new-instance p1, LPa/a;

    iget-object v4, v0, Lcom/ui/sso/api/provider/UiAccountProvider;->o:LIi/J;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, LPa/a;-><init>(Landroid/content/SharedPreferences;LOa/a;LIi/J;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, LPa/a;->g(Lcom/ui/sso/account/UIAccountManager$a;)V

    iput-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider;->c:Lcom/ui/sso/account/UIAccountManager;

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    move-object v5, v0

    goto :goto_4

    :goto_3
    monitor-exit v0

    throw p1

    :cond_8
    :goto_4
    invoke-virtual {v5}, Lcom/ui/sso/api/provider/UiAccountProvider;->u()Lcom/ui/sso/account/UIAccountManager;

    move-result-object p1

    return-object p1
.end method

.method private final w(Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lcom/ui/sso/api/provider/UiAccountProvider$i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProvider$i;

    iget v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$i;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$i;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$i;

    invoke-direct {v0, p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$i;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$i;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$i;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/ui/sso/api/provider/UiAccountProvider$i;->a:Ljava/lang/Object;

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProvider;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$i;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/sso/api/provider/UiAccountProvider;

    :try_start_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    iput-object p0, v0, Lcom/ui/sso/api/provider/UiAccountProvider$i;->a:Ljava/lang/Object;

    iput v4, v0, Lcom/ui/sso/api/provider/UiAccountProvider$i;->d:I

    invoke-direct {p0, v0}, Lcom/ui/sso/api/provider/UiAccountProvider;->t(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p1, Lcom/ui/sso/account/UIAccountManager;

    iput-object v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$i;->a:Ljava/lang/Object;

    iput v3, v0, Lcom/ui/sso/api/provider/UiAccountProvider$i;->d:I

    invoke-interface {p1, v0}, Lcom/ui/sso/account/UIAccountManager;->f(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v0, v2

    :goto_2
    check-cast p1, Ljava/util/List;

    new-instance v1, Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;

    invoke-direct {v1, p1}, Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;-><init>(Ljava/util/List;)V

    invoke-virtual {v0}, Lcom/ui/sso/api/provider/UiAccountProvider;->z()Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;

    move-result-object p1

    invoke-interface {p1, v1}, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;->b(Lcom/ui/sso/api/provider/UiAccountProviderCursor;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_2
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :goto_3
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    const-string/jumbo v1, "Failed to serialize accounts to cursor"

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_4
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;

    const-string/jumbo v1, "Failed to get accounts"

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;-><init>(Ljava/lang/String;Lcom/ui/sso/account/UIAccountManager$Error;)V

    throw v0
.end method

.method private final x(Lcom/ui/sso/api/provider/d$c;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lcom/ui/sso/api/provider/UiAccountProvider$j;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProvider$j;

    iget v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$j;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$j;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$j;

    invoke-direct {v0, p0, p2}, Lcom/ui/sso/api/provider/UiAccountProvider$j;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$j;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$j;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$j;->b:Ljava/lang/Object;

    check-cast p1, Lcom/ui/sso/api/provider/d$c;

    iget-object v2, v0, Lcom/ui/sso/api/provider/UiAccountProvider$j;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/sso/api/provider/UiAccountProvider;

    :try_start_1
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    iput-object p0, v0, Lcom/ui/sso/api/provider/UiAccountProvider$j;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/ui/sso/api/provider/UiAccountProvider$j;->b:Ljava/lang/Object;

    iput v4, v0, Lcom/ui/sso/api/provider/UiAccountProvider$j;->e:I

    invoke-direct {p0, v0}, Lcom/ui/sso/api/provider/UiAccountProvider;->t(Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p2, Lcom/ui/sso/account/UIAccountManager;

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/d$c;->c()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Lcom/ui/sso/api/provider/UiAccountProvider;->s(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/d$c;->d()Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x0

    iput-object v4, v0, Lcom/ui/sso/api/provider/UiAccountProvider$j;->a:Ljava/lang/Object;

    iput-object v4, v0, Lcom/ui/sso/api/provider/UiAccountProvider$j;->b:Ljava/lang/Object;

    iput v3, v0, Lcom/ui/sso/api/provider/UiAccountProvider$j;->e:I

    invoke-interface {p2, v2, p1, v0}, Lcom/ui/sso/account/UIAccountManager;->i(Ljava/util/UUID;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p2, Ljava/lang/String;

    new-instance p1, Lcom/ui/sso/api/provider/e$b;

    invoke-direct {p1, p2}, Lcom/ui/sso/api/provider/e$b;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/ui/sso/account/UIAccountManager$Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :goto_3
    new-instance p2, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;

    const-string/jumbo v0, "Failed to get Auth token"

    invoke-direct {p2, v0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;-><init>(Ljava/lang/String;Lcom/ui/sso/account/UIAccountManager$Error;)V

    throw p2
.end method


# virtual methods
.method public final B()LTa/d;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->g:LTa/d;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "deviceIdentifiersService"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final C()Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->b:Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "encryptedPrefProvider"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final D()LWa/f;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->m:LWa/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "packageCertificateVerifier"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final E()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "packageName"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final F()Landroid/content/UriMatcher;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->d:Landroid/content/UriMatcher;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "queryUriMatcher"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final G()Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->i:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "requestSerializer"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final H()Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->j:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "responseSerializer"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final J()LQa/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->n:LQa/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "uiAccountOwnershipStorage"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final K()Lcom/ui/sso/api/provider/f;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->h:Lcom/ui/sso/api/provider/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "uri"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final N(Lcom/ui/sso/account/UIAccountManager;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->a:Lcom/ui/sso/account/UIAccountManager;

    return-void
.end method

.method public final O(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->f:Ljava/lang/String;

    return-void
.end method

.method public final P(Landroid/content/ContentResolver;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->l:Landroid/content/ContentResolver;

    return-void
.end method

.method public final Q(Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->k:Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;

    return-void
.end method

.method public final R(LTa/d;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->g:LTa/d;

    return-void
.end method

.method public final S(Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->b:Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;

    return-void
.end method

.method public final T(LWa/f;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->m:LWa/f;

    return-void
.end method

.method public final U(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->e:Ljava/lang/String;

    return-void
.end method

.method public final V(Landroid/content/UriMatcher;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->d:Landroid/content/UriMatcher;

    return-void
.end method

.method public final W(Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->i:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    return-void
.end method

.method public final X(Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->j:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    return-void
.end method

.method public final Y(LQa/a;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->n:LQa/a;

    return-void
.end method

.method public final Z(Lcom/ui/sso/api/provider/f;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->h:Lcom/ui/sso/api/provider/f;

    return-void
.end method

.method public a()V
    .locals 3

    sget-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$p;->a:Lcom/ui/sso/api/provider/UiAccountProvider$p;

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->y()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->K()Lcom/ui/sso/api/provider/f;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/sso/api/provider/f;->a()Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V

    return-void
.end method

.method public b(Ljava/util/UUID;)V
    .locals 2

    const-string/jumbo v0, "accountId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$q;

    invoke-direct {v0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$q;-><init>(Ljava/util/UUID;)V

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->y()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->K()Lcom/ui/sso/api/provider/f;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/ui/sso/api/provider/f;->d(Ljava/util/UUID;)Landroid/net/Uri;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V

    return-void
.end method

.method public call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    const-string/jumbo p2, "method"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/ui/sso/api/provider/UiAccountProvider$d;

    invoke-direct {p2, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$d;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, LUa/a;->e(Lmh/a;)V

    new-instance p2, Lcom/ui/sso/api/provider/UiAccountProvider$e;

    const/4 v0, 0x0

    invoke-direct {p2, p0, p1, p3, v0}, Lcom/ui/sso/api/provider/UiAccountProvider$e;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ljava/lang/String;Landroid/os/Bundle;Ldh/e;)V

    const/4 p1, 0x1

    invoke-static {v0, p2, p1, v0}, LIi/i;->f(Ldh/i;Lmh/p;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    return-object p1
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    const-string/jumbo p2, "p0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProvider$f;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/ui/sso/api/provider/UiAccountProvider$f;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V

    const/4 p3, 0x1

    invoke-static {p2, p1, p3, p2}, LIi/i;->f(Ldh/i;Lmh/p;ILjava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return p1
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 1

    const-string/jumbo p2, "p0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProvider$n;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/ui/sso/api/provider/UiAccountProvider$n;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V

    const/4 v0, 0x1

    invoke-static {p2, p1, v0, p2}, LIi/i;->f(Ldh/i;Lmh/p;ILjava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public onCreate()Z
    .locals 12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string/jumbo v4, "getContentResolver(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/ui/sso/api/provider/UiAccountProvider;->P(Landroid/content/ContentResolver;)V

    new-instance v3, LWa/j;

    new-instance v4, LWa/i;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    const-string/jumbo v6, "getPackageManager(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LWa/a;->b:LWa/a$a;

    invoke-virtual {v6}, LWa/a$a;->a()LWa/a;

    move-result-object v6

    invoke-direct {v4, v5, v6}, LWa/i;-><init>(Landroid/content/pm/PackageManager;LWa/a;)V

    sget-object v5, LMa/a;->a:LMa/a;

    invoke-virtual {v5}, LMa/a;->a()Ljava/util/Set;

    move-result-object v5

    invoke-direct {v3, v4, v5}, LWa/j;-><init>(LWa/e;Ljava/util/Set;)V

    invoke-virtual {p0, v3}, Lcom/ui/sso/api/provider/UiAccountProvider;->T(LWa/f;)V

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "getPackageName(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/ui/sso/api/provider/UiAccountProvider;->U(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->D()LWa/f;

    move-result-object v3

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->E()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, LWa/f;->a(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string/jumbo v3, "UiAccountProvider"

    const-string v4, "App signing certificate is not listed. This should never happen for production build since production certificate listis stale and shouldn\'t be configured. For internal builds, make sure your certificate is listed in [UiAccountLib.allowedCertFingerprint]"

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    sget v3, LNa/a;->c:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "getString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/ui/sso/api/provider/UiAccountProvider;->O(Ljava/lang/String;)V

    new-instance v3, LOa/d;

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->v()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v7

    const-string/jumbo v4, "get(...)"

    invoke-static {v7, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->o:LIi/J;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v5, v3

    invoke-direct/range {v5 .. v11}, LOa/d;-><init>(Ljava/lang/String;Landroid/accounts/AccountManager;LOa/a;LIi/J;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, p0}, LOa/d;->g(Lcom/ui/sso/account/UIAccountManager$a;)V

    invoke-virtual {p0, v3}, Lcom/ui/sso/api/provider/UiAccountProvider;->N(Lcom/ui/sso/account/UIAccountManager;)V

    new-instance v3, Lcom/ui/sso/account/local/a;

    iget-object v4, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->o:LIi/J;

    invoke-direct {v3, v4}, Lcom/ui/sso/account/local/a;-><init>(LIi/J;)V

    invoke-virtual {p0, v3}, Lcom/ui/sso/api/provider/UiAccountProvider;->S(Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;)V

    sget-object v3, LVa/a;->a:LVa/a$a;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v3, v2}, LVa/a$a;->a(Landroid/content/Context;)LVa/a;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/ui/sso/api/provider/UiAccountProvider;->Y(LQa/a;)V

    sget-object v3, LTa/e;->g:LTa/e$a;

    iget-object v4, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->o:LIi/J;

    invoke-virtual {v3, v2, v4}, LTa/e$a;->a(Landroid/content/Context;LIi/J;)LTa/d;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/ui/sso/api/provider/UiAccountProvider;->R(LTa/d;)V

    sget-object v2, Lcom/ui/sso/api/provider/f$b;->a:Lcom/ui/sso/api/provider/f$b$a;

    invoke-virtual {v2}, Lcom/ui/sso/api/provider/f$b$a;->a()Lcom/ui/sso/api/provider/f$b;

    move-result-object v2

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->E()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v4, v5}, Lcom/ui/sso/api/provider/f$b$b;->a(Lcom/ui/sso/api/provider/f$b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/ui/sso/api/provider/f;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/ui/sso/api/provider/UiAccountProvider;->Z(Lcom/ui/sso/api/provider/f;)V

    new-instance v2, Landroid/content/UriMatcher;

    const/4 v3, -0x1

    invoke-direct {v2, v3}, Landroid/content/UriMatcher;-><init>(I)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->K()Lcom/ui/sso/api/provider/f;

    move-result-object v3

    invoke-interface {v3}, Lcom/ui/sso/api/provider/f;->b()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "accounts"

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {p0, v2}, Lcom/ui/sso/api/provider/UiAccountProvider;->V(Landroid/content/UriMatcher;)V

    new-instance v2, Lcom/ui/sso/api/provider/d$h;

    invoke-direct {v2}, Lcom/ui/sso/api/provider/d$h;-><init>()V

    invoke-virtual {p0, v2}, Lcom/ui/sso/api/provider/UiAccountProvider;->W(Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;)V

    new-instance v2, Lcom/ui/sso/api/provider/e$f;

    invoke-direct {v2}, Lcom/ui/sso/api/provider/e$f;-><init>()V

    invoke-virtual {p0, v2}, Lcom/ui/sso/api/provider/UiAccountProvider;->X(Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;)V

    new-instance v2, Lcom/ui/sso/api/provider/c;

    invoke-direct {v2}, Lcom/ui/sso/api/provider/c;-><init>()V

    invoke-virtual {p0, v2}, Lcom/ui/sso/api/provider/UiAccountProvider;->Q(Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;)V

    new-instance v2, Lcom/ui/sso/api/provider/UiAccountProvider$r;

    invoke-direct {v2, p0, v0, v1}, Lcom/ui/sso/api/provider/UiAccountProvider$r;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;J)V

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    const/4 v0, 0x1

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 0

    const-string/jumbo p2, "uri"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/ui/sso/api/provider/UiAccountProvider$s;

    invoke-direct {p2, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$s;-><init>(Landroid/net/Uri;)V

    invoke-static {p2}, LUa/a;->e(Lmh/a;)V

    new-instance p2, Lcom/ui/sso/api/provider/UiAccountProvider$t;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p1, p3}, Lcom/ui/sso/api/provider/UiAccountProvider$t;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Landroid/net/Uri;Ldh/e;)V

    const/4 p1, 0x1

    invoke-static {p3, p2, p1, p3}, LIi/i;->f(Ldh/i;Lmh/p;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/database/Cursor;

    return-object p1
.end method

.method public final u()Lcom/ui/sso/account/UIAccountManager;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->a:Lcom/ui/sso/account/UIAccountManager;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "accountManagerAndroid"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    const-string/jumbo p2, "p0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProvider$u;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/ui/sso/api/provider/UiAccountProvider$u;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)V

    const/4 p3, 0x1

    invoke-static {p2, p1, p3, p2}, LIi/i;->f(Ldh/i;Lmh/p;ILjava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return p1
.end method

.method public final v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "accountType"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final y()Landroid/content/ContentResolver;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->l:Landroid/content/ContentResolver;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "contentResolver"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final z()Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider;->k:Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "cursorSerializer"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
