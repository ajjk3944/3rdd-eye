.class public final LGb/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGb/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGb/i$a;,
        LGb/i$b;,
        LGb/i$c;
    }
.end annotation


# static fields
.field public static final q:LGb/i$a;

.field static final synthetic r:[Lth/l;


# instance fields
.field private final a:LGb/i$c;

.field private final b:LGb/e;

.field private final c:LGb/e;

.field private final d:LGb/e;

.field private final e:LGb/e;

.field private final f:LGb/e;

.field private final g:LGb/e;

.field private final h:LGb/e;

.field private final i:LGb/e;

.field private final j:LGb/e;

.field private final k:LGb/e;

.field private final l:LGb/c;

.field private final m:LGb/e;

.field private final n:LGb/e;

.field private final o:LGb/e;

.field private final p:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lkotlin/jvm/internal/z;

    const-class v1, LGb/i;

    const-string/jumbo v2, "uiAuthToken"

    const-string/jumbo v3, "getUiAuthToken()Ljava/lang/String;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/z;

    const-string/jumbo v3, "sessionCookies"

    const-string/jumbo v5, "getSessionCookies()Ljava/lang/String;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/z;

    const-string/jumbo v5, "twoFaAuthCookie"

    const-string/jumbo v6, "getTwoFaAuthCookie()Ljava/lang/String;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/z;

    const-string/jumbo v6, "ssoId"

    const-string/jumbo v7, "getSsoId()Ljava/lang/String;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/z;

    const-string/jumbo v7, "ssoEmail"

    const-string/jumbo v8, "getSsoEmail()Ljava/lang/String;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/z;

    const-string/jumbo v8, "ssoUsername"

    const-string/jumbo v9, "getSsoUsername()Ljava/lang/String;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/z;

    const-string/jumbo v9, "ssoPassword"

    const-string/jumbo v10, "getSsoPassword()Ljava/lang/String;"

    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v8

    new-instance v9, Lkotlin/jvm/internal/z;

    const-string/jumbo v10, "cloudToken"

    const-string/jumbo v11, "getCloudToken()Ljava/lang/String;"

    invoke-direct {v9, v1, v10, v11, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v9}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v9

    new-instance v10, Lkotlin/jvm/internal/z;

    const-string/jumbo v11, "cloudConfig"

    const-string/jumbo v12, "getCloudConfig()Ljava/lang/String;"

    invoke-direct {v10, v1, v11, v12, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v10}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v10

    new-instance v11, Lkotlin/jvm/internal/z;

    const-string/jumbo v12, "pkceCodeVerifier"

    const-string/jumbo v13, "getPkceCodeVerifier()Ljava/lang/String;"

    invoke-direct {v11, v1, v12, v13, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v11}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v11

    new-instance v12, Lkotlin/jvm/internal/z;

    const-string/jumbo v13, "localLoginToken"

    const-string/jumbo v14, "getLocalLoginToken()Lcom/ui/unifi/core/storage/LocalLoginToken;"

    invoke-direct {v12, v1, v13, v14, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v12}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v12

    new-instance v13, Lkotlin/jvm/internal/z;

    const-string/jumbo v14, "deviceId"

    const-string/jumbo v15, "getDeviceId()Ljava/lang/String;"

    invoke-direct {v13, v1, v14, v15, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v13}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v13

    new-instance v14, Lkotlin/jvm/internal/z;

    const-string/jumbo v15, "deviceName"

    move-object/from16 v16, v13

    const-string/jumbo v13, "getDeviceName()Ljava/lang/String;"

    invoke-direct {v14, v1, v15, v13, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v14}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v13

    new-instance v14, Lkotlin/jvm/internal/z;

    const-string/jumbo v15, "deviceModel"

    move-object/from16 v17, v13

    const-string/jumbo v13, "getDeviceModel()Ljava/lang/String;"

    invoke-direct {v14, v1, v15, v13, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v14}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v1

    const/16 v13, 0xe

    new-array v13, v13, [Lth/l;

    aput-object v0, v13, v4

    const/4 v0, 0x1

    aput-object v2, v13, v0

    const/4 v0, 0x2

    aput-object v3, v13, v0

    const/4 v0, 0x3

    aput-object v5, v13, v0

    const/4 v0, 0x4

    aput-object v6, v13, v0

    const/4 v0, 0x5

    aput-object v7, v13, v0

    const/4 v0, 0x6

    aput-object v8, v13, v0

    const/4 v0, 0x7

    aput-object v9, v13, v0

    const/16 v0, 0x8

    aput-object v10, v13, v0

    const/16 v0, 0x9

    aput-object v11, v13, v0

    const/16 v0, 0xa

    aput-object v12, v13, v0

    const/16 v0, 0xb

    aput-object v16, v13, v0

    const/16 v0, 0xc

    aput-object v17, v13, v0

    const/16 v0, 0xd

    aput-object v1, v13, v0

    sput-object v13, LGb/i;->r:[Lth/l;

    new-instance v0, LGb/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LGb/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LGb/i;->q:LGb/i$a;

    return-void
.end method

.method public constructor <init>(LGb/d;)V
    .locals 4

    const-string/jumbo v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LGb/i$c;

    invoke-direct {v0, p1}, LGb/i$c;-><init>(LGb/d;)V

    iput-object v0, p0, LGb/i;->a:LGb/i$c;

    const-string/jumbo v0, "uiAuthToken"

    invoke-direct {p0, v0}, LGb/i;->R(Ljava/lang/String;)LGb/e;

    move-result-object v0

    iput-object v0, p0, LGb/i;->b:LGb/e;

    const-string/jumbo v0, "sessionCookies"

    invoke-direct {p0, v0}, LGb/i;->R(Ljava/lang/String;)LGb/e;

    move-result-object v0

    iput-object v0, p0, LGb/i;->c:LGb/e;

    const-string/jumbo v0, "twoFaAuthCookie"

    invoke-direct {p0, v0}, LGb/i;->R(Ljava/lang/String;)LGb/e;

    move-result-object v0

    iput-object v0, p0, LGb/i;->d:LGb/e;

    const-string/jumbo v0, "ssoId"

    invoke-direct {p0, v0}, LGb/i;->R(Ljava/lang/String;)LGb/e;

    move-result-object v0

    iput-object v0, p0, LGb/i;->e:LGb/e;

    const-string/jumbo v0, "ssoEmail"

    invoke-direct {p0, v0}, LGb/i;->R(Ljava/lang/String;)LGb/e;

    move-result-object v0

    iput-object v0, p0, LGb/i;->f:LGb/e;

    const-string/jumbo v0, "ssoUsername"

    invoke-direct {p0, v0}, LGb/i;->R(Ljava/lang/String;)LGb/e;

    move-result-object v0

    iput-object v0, p0, LGb/i;->g:LGb/e;

    const-string/jumbo v0, "ssoPassword"

    invoke-direct {p0, v0}, LGb/i;->R(Ljava/lang/String;)LGb/e;

    move-result-object v0

    iput-object v0, p0, LGb/i;->h:LGb/e;

    const-string/jumbo v0, "cloudToken"

    invoke-direct {p0, v0}, LGb/i;->R(Ljava/lang/String;)LGb/e;

    move-result-object v0

    iput-object v0, p0, LGb/i;->i:LGb/e;

    const-string/jumbo v0, "cloudConfig"

    invoke-direct {p0, v0}, LGb/i;->R(Ljava/lang/String;)LGb/e;

    move-result-object v0

    iput-object v0, p0, LGb/i;->j:LGb/e;

    const-string/jumbo v0, "pkceCodeVerifier"

    invoke-direct {p0, v0}, LGb/i;->R(Ljava/lang/String;)LGb/e;

    move-result-object v0

    iput-object v0, p0, LGb/i;->k:LGb/e;

    new-instance v0, LGb/c;

    new-instance v1, LGb/g;

    invoke-direct {v1}, LGb/g;-><init>()V

    new-instance v2, LGb/h;

    invoke-direct {v2}, LGb/h;-><init>()V

    const-string/jumbo v3, "localLoginToken"

    invoke-direct {v0, p1, v3, v1, v2}, LGb/c;-><init>(LGb/d;Ljava/lang/String;Lmh/l;Lmh/l;)V

    iput-object v0, p0, LGb/i;->l:LGb/c;

    const-string/jumbo p1, "deviceId"

    invoke-direct {p0, p1}, LGb/i;->R(Ljava/lang/String;)LGb/e;

    move-result-object p1

    iput-object p1, p0, LGb/i;->m:LGb/e;

    const-string/jumbo p1, "deviceName"

    invoke-direct {p0, p1}, LGb/i;->R(Ljava/lang/String;)LGb/e;

    move-result-object p1

    iput-object p1, p0, LGb/i;->n:LGb/e;

    const-string/jumbo p1, "deviceModel"

    invoke-direct {p0, p1}, LGb/i;->R(Ljava/lang/String;)LGb/e;

    move-result-object p1

    iput-object p1, p0, LGb/i;->o:LGb/e;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LGb/i;->p:Ljava/util/Map;

    return-void
.end method

.method private final L(Ljava/lang/String;)LGb/a;
    .locals 4

    iget-object v0, p0, LGb/i;->p:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LGb/i;->p:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, LGb/a;

    iget-object v3, p0, LGb/i;->a:LGb/i$c;

    invoke-direct {v2, v3, p1}, LGb/a;-><init>(LGb/d;Ljava/lang/String;)V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v2, LGb/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v2

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method private final M(Ljava/lang/String;)Ljava/util/Set;
    .locals 4

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LGb/i;->L(Ljava/lang/String;)LGb/a;

    move-result-object p1

    invoke-virtual {p1}, LGb/a;->d()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-static {v1, v2}, Lsh/m;->s(II)Lsh/i;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, LZg/Q;

    invoke-virtual {v2}, LZg/Q;->d()I

    move-result v2

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private static final N(LGb/b;)Ljava/lang/String;
    .locals 2

    sget-object v0, LHb/b;->a:LHb/b;

    invoke-virtual {v0}, LHb/b;->b()Laj/b;

    move-result-object v0

    invoke-virtual {v0}, Laj/b;->a()Lcj/e;

    sget-object v1, LGb/b;->Companion:LGb/b$b;

    invoke-virtual {v1}, LGb/b$b;->serializer()LVi/b;

    move-result-object v1

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Laj/b;->c(LVi/o;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final O(Ljava/lang/String;)LGb/b;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LHb/b;->a:LHb/b;

    invoke-virtual {v0}, LHb/b;->b()Laj/b;

    move-result-object v0

    invoke-virtual {v0}, Laj/b;->a()Lcj/e;

    sget-object v1, LGb/b;->Companion:LGb/b$b;

    invoke-virtual {v1}, LGb/b$b;->serializer()LVi/b;

    move-result-object v1

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Laj/b;->b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LGb/b;

    return-object p0
.end method

.method private final P([Ljava/security/cert/Certificate;)Ljava/util/Set;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    const-string/jumbo v5, "SHA-256"

    invoke-static {v5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v5

    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    invoke-static {v4, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "encodeToString(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lkotlin/text/t;->q1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method private final R(Ljava/lang/String;)LGb/e;
    .locals 2

    new-instance v0, LGb/e;

    iget-object v1, p0, LGb/i;->a:LGb/i$c;

    invoke-direct {v0, v1, p1}, LGb/e;-><init>(LGb/d;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;)LGb/b;
    .locals 0

    invoke-static {p0}, LGb/i;->O(Ljava/lang/String;)LGb/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LGb/b;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LGb/i;->N(LGb/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/i;->o:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/16 v2, 0xd

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public B(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/i;->k:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public C(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/i;->d:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public D(Ljava/lang/String;[Ljava/security/cert/Certificate;)Z
    .locals 1

    const-string/jumbo v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "certificates"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LGb/i;->M(Ljava/lang/String;)Ljava/util/Set;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p2}, LGb/i;->P([Ljava/security/cert/Certificate;)Ljava/util/Set;

    move-result-object p2

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public E()LGb/b;
    .locals 3

    iget-object v0, p0, LGb/i;->l:LGb/c;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/c;->a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LGb/b;

    return-object v0
.end method

.method public F(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "systemResponse"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LGb/i;->L(Ljava/lang/String;)LGb/a;

    move-result-object p1

    invoke-virtual {p1, p2}, LGb/a;->h(Ljava/lang/String;)V

    return-void
.end method

.method public G()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/i;->g:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public H(Ljava/lang/String;J)V
    .locals 1

    const-string/jumbo v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LGb/i;->L(Ljava/lang/String;)LGb/a;

    move-result-object p1

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, LGb/a;->g(Ljava/lang/String;)V

    return-void
.end method

.method public I(Ljava/lang/String;)Ljava/lang/Long;
    .locals 1

    const-string/jumbo v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LGb/i;->L(Ljava/lang/String;)LGb/a;

    move-result-object p1

    invoke-virtual {p1}, LGb/a;->c()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/text/t;->s(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public J(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/i;->o:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/16 v2, 0xd

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public K()V
    .locals 3

    iget-object v0, p0, LGb/i;->a:LGb/i$c;

    invoke-virtual {v0}, LGb/i$c;->c()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LGb/i;->k(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LGb/i;->q(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LGb/i;->y(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LGb/i;->n(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LGb/i;->m(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LGb/i;->o(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LGb/i;->Q(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LGb/i;->i(LGb/b;)V

    iget-object v1, p0, LGb/i;->p:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LGb/a;

    invoke-virtual {v2}, LGb/a;->a()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, LGb/i;->B(Ljava/lang/String;)V

    return-void
.end method

.method public Q(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/i;->i:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public a()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/i;->n:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/i;->n:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/i;->j:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "anonymousDeviceId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LGb/i;->L(Ljava/lang/String;)LGb/a;

    move-result-object p1

    invoke-virtual {p1, p2}, LGb/a;->e(Ljava/lang/String;)V

    return-void
.end method

.method public g(Ljava/lang/String;[Ljava/security/cert/Certificate;)V
    .locals 2

    const-string/jumbo v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "certificates"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    invoke-direct {p0, p2}, LGb/i;->P([Ljava/security/cert/Certificate;)Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_0
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, p2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo p2, "toUpperCase(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LGb/i;->L(Ljava/lang/String;)LGb/a;

    move-result-object p1

    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, LGb/a;->i(Ljava/lang/String;)V

    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/i;->e:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i(LGb/b;)V
    .locals 3

    iget-object v0, p0, LGb/i;->l:LGb/c;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/c;->b(Ljava/lang/Object;Lth/l;Ljava/lang/Object;)V

    return-void
.end method

.method public j()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/i;->h:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/i;->e:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/i;->m:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/i;->b:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/i;->h:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public o(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/i;->c:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/i;->m:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public q(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/i;->f:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public r()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/i;->b:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/i;->c:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public t(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/i;->j:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public u()V
    .locals 0

    invoke-virtual {p0}, LGb/i;->K()V

    return-void
.end method

.method public v()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/i;->f:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LGb/i;->L(Ljava/lang/String;)LGb/a;

    move-result-object p1

    invoke-virtual {p1}, LGb/a;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public x()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/i;->k:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public y(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/i;->g:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public z()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/i;->d:LGb/e;

    sget-object v1, LGb/i;->r:[Lth/l;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
