.class public final LGb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGb/a$a;
    }
.end annotation


# static fields
.field private static final i:LGb/a$a;

.field static final synthetic j:[Lth/l;


# instance fields
.field private final a:LGb/d;

.field private final b:Ljava/lang/String;

.field private final c:LGb/e;

.field private final d:LGb/e;

.field private final e:LGb/e;

.field private final f:LGb/e;

.field private final g:LGb/e;

.field private final h:LGb/e;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lkotlin/jvm/internal/z;

    const-class v1, LGb/a;

    const-string/jumbo v2, "trustedCertificates"

    const-string/jumbo v3, "getTrustedCertificates()Ljava/lang/String;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/z;

    const-string/jumbo v3, "anonymousDeviceId"

    const-string/jumbo v5, "getAnonymousDeviceId()Ljava/lang/String;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/z;

    const-string/jumbo v5, "lastWebRtcLogSent"

    const-string/jumbo v6, "getLastWebRtcLogSent()Ljava/lang/String;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/z;

    const-string/jumbo v6, "supportPin"

    const-string/jumbo v7, "getSupportPin()Ljava/lang/String;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/z;

    const-string/jumbo v7, "systemResponse"

    const-string/jumbo v8, "getSystemResponse()Ljava/lang/String;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/z;

    const-string/jumbo v8, "deviceToken"

    const-string/jumbo v9, "getDeviceToken()Ljava/lang/String;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v1

    const/4 v7, 0x6

    new-array v7, v7, [Lth/l;

    aput-object v0, v7, v4

    const/4 v0, 0x1

    aput-object v2, v7, v0

    const/4 v0, 0x2

    aput-object v3, v7, v0

    const/4 v0, 0x3

    aput-object v5, v7, v0

    const/4 v0, 0x4

    aput-object v6, v7, v0

    const/4 v0, 0x5

    aput-object v1, v7, v0

    sput-object v7, LGb/a;->j:[Lth/l;

    new-instance v0, LGb/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LGb/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LGb/a;->i:LGb/a$a;

    return-void
.end method

.method public constructor <init>(LGb/d;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "deviceId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGb/a;->a:LGb/d;

    iput-object p2, p0, LGb/a;->b:Ljava/lang/String;

    const-string/jumbo p1, "deviceCertificates"

    invoke-direct {p0, p1}, LGb/a;->j(Ljava/lang/String;)LGb/e;

    move-result-object p1

    iput-object p1, p0, LGb/a;->c:LGb/e;

    const-string/jumbo p1, "anonymousDeviceId"

    invoke-direct {p0, p1}, LGb/a;->j(Ljava/lang/String;)LGb/e;

    move-result-object p1

    iput-object p1, p0, LGb/a;->d:LGb/e;

    const-string/jumbo p1, "lastWebRtcLogSent"

    invoke-direct {p0, p1}, LGb/a;->j(Ljava/lang/String;)LGb/e;

    move-result-object p1

    iput-object p1, p0, LGb/a;->e:LGb/e;

    const-string/jumbo p1, "supportPin"

    invoke-direct {p0, p1}, LGb/a;->j(Ljava/lang/String;)LGb/e;

    move-result-object p1

    iput-object p1, p0, LGb/a;->f:LGb/e;

    const-string/jumbo p1, "systemResponse"

    invoke-direct {p0, p1}, LGb/a;->j(Ljava/lang/String;)LGb/e;

    move-result-object p1

    iput-object p1, p0, LGb/a;->g:LGb/e;

    const-string/jumbo p1, "deviceToken"

    invoke-direct {p0, p1}, LGb/a;->j(Ljava/lang/String;)LGb/e;

    move-result-object p1

    iput-object p1, p0, LGb/a;->h:LGb/e;

    return-void
.end method

.method private final j(Ljava/lang/String;)LGb/e;
    .locals 4

    new-instance v0, LGb/e;

    iget-object v1, p0, LGb/a;->a:LGb/d;

    iget-object v2, p0, LGb/a;->b:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p1, "_"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LGb/e;-><init>(LGb/d;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LGb/a;->f(Ljava/lang/String;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/a;->d:LGb/e;

    sget-object v1, LGb/a;->j:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/a;->e:LGb/e;

    sget-object v1, LGb/a;->j:[Lth/l;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LGb/a;->c:LGb/e;

    sget-object v1, LGb/a;->j:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/a;->d:LGb/e;

    sget-object v1, LGb/a;->j:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/a;->h:LGb/e;

    sget-object v1, LGb/a;->j:[Lth/l;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public final g(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/a;->e:LGb/e;

    sget-object v1, LGb/a;->j:[Lth/l;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public final h(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/a;->g:LGb/e;

    sget-object v1, LGb/a;->j:[Lth/l;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public final i(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LGb/a;->c:LGb/e;

    sget-object v1, LGb/a;->j:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method
