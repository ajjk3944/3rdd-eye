.class public final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNd/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$a;,
        Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;
    }
.end annotation


# static fields
.field public static final f:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$a;


# instance fields
.field private final a:Ljava/util/UUID;

.field private final b:LT7/d;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->f:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$a;

    return-void
.end method

.method private constructor <init>(Ljava/util/UUID;LNd/c;Lfe/u;LT7/d;)V
    .locals 2

    const-string v0, "accountId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiAccountApiService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "systemTimeProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->a:Ljava/util/UUID;

    .line 4
    iput-object p4, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->b:LT7/d;

    .line 5
    invoke-interface {p2}, LNd/c;->c()Lgg/i;

    move-result-object p1

    .line 6
    new-instance p2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    .line 8
    invoke-interface {p3}, Lfe/u;->a()Lgg/y;

    move-result-object p2

    const/4 p4, 0x0

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p4, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    .line 9
    new-instance p2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;)V

    invoke-virtual {p1, p2}, Lgg/i;->N1(Lkg/n;)Lgg/i;

    move-result-object p1

    .line 10
    new-instance p2, LNd/b;

    invoke-direct {p2, p0}, LNd/b;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;)V

    invoke-virtual {p1, p2}, Lgg/i;->r1(Lkg/b;)Lgg/i;

    move-result-object p1

    .line 11
    sget-object p2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$e;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$e;

    invoke-virtual {p1, p2}, Lgg/i;->X(Lkg/c;)Lgg/i;

    move-result-object p1

    .line 12
    new-instance p2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$f;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$f;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;)V

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    .line 13
    invoke-interface {p3}, Lfe/u;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    .line 14
    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->c:Lgg/i;

    .line 16
    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$g;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$g;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    .line 19
    invoke-interface {p3}, Lfe/u;->a()Lgg/y;

    move-result-object p3

    invoke-virtual {p1, p3, p4, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    .line 20
    sget-object p3, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$h;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$h;

    invoke-virtual {p1, p3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    .line 21
    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->d:Lgg/i;

    .line 23
    invoke-virtual {p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->a()Lgg/i;

    move-result-object p1

    .line 24
    sget-object p3, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$j;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$j;

    invoke-virtual {p1, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    .line 26
    sget-object p3, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$k;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$k;

    invoke-virtual {p1, p3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    .line 27
    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->e:Lgg/i;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/UUID;LNd/c;Lfe/u;LT7/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;-><init>(Ljava/util/UUID;LNd/c;Lfe/u;LT7/d;)V

    return-void
.end method

.method public static synthetic c(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;LYg/s;LYg/s;)LYg/s;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->d(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;LYg/s;LYg/s;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;LYg/s;LYg/s;)LYg/s;
    .locals 3

    const-string v0, "prev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/sso/auth/a;

    invoke-virtual {p2}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/sso/auth/a;

    instance-of v1, v1, Lcom/ui/sso/auth/c;

    if-eqz v1, :cond_0

    instance-of v1, v0, Lcom/ui/sso/auth/c;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/ui/sso/auth/c;

    const-wide/32 v1, 0xea60

    invoke-direct {p0, v0, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->e(Lcom/ui/sso/auth/c;J)Z

    move-result p0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method

.method private final e(Lcom/ui/sso/auth/c;J)Z
    .locals 4

    invoke-virtual {p1}, Lcom/ui/sso/auth/c;->c()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/ui/sso/auth/c;->c()Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->b:LT7/d;

    invoke-interface {p1}, LT7/d;->a()J

    move-result-wide v2

    sub-long/2addr v2, p2

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->d:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->e:Lgg/i;

    return-object v0
.end method

.method public f()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public final g()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->c:Lgg/i;

    return-object v0
.end method

.method public invalidate()Lgg/b;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->c:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$i;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$i;

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
