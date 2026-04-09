.class public final LPf/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/ui/wmw/api/v1/a;

.field private final b:LKf/e;

.field private final c:Lgg/b;

.field private final d:Lgg/i;


# direct methods
.method public constructor <init>(Lcom/ui/wmw/api/v1/a;LKf/e;LMf/s;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fwUploadState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPf/d;->a:Lcom/ui/wmw/api/v1/a;

    iput-object p2, p0, LPf/d;->b:LKf/e;

    invoke-interface {p3}, LMf/s;->a()Lgg/i;

    move-result-object p1

    new-instance p3, LPf/d$e;

    invoke-direct {p3, p0}, LPf/d$e;-><init>(LPf/d;)V

    invoke-virtual {p1, p3}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string p3, "switchMapCompletable(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LPf/d;->c:Lgg/b;

    invoke-virtual {p2}, LKf/e;->k()Lgg/i;

    move-result-object p1

    invoke-virtual {p2}, LKf/e;->r()Lgg/i;

    move-result-object p2

    new-instance p3, LPf/d$a;

    invoke-direct {p3, p0}, LPf/d$a;-><init>(LPf/d;)V

    invoke-static {p1, p2, p3}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LPf/d;->g()Lgg/b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string p2, "distinctUntilChanged(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/ui/wmw/f;->c(Lgg/i;Z)Lgg/i;

    move-result-object p1

    sget-object p3, LPf/d$b;->a:LPf/d$b;

    invoke-virtual {p1, p3}, Lgg/i;->d0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object p3, LPf/d$c;->a:LPf/d$c;

    invoke-virtual {p1, p3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object p3, LPf/d$d;->a:LPf/d$d;

    invoke-virtual {p1, p3}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance p3, LPf/b;

    invoke-direct {p3}, LPf/b;-><init>()V

    invoke-virtual {p1, p3}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LPf/d;->d:Lgg/i;

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, LPf/d;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, LPf/d;->h()V

    return-void
.end method

.method public static final synthetic c(LPf/d;)Lcom/ui/wmw/api/v1/a;
    .locals 0

    iget-object p0, p0, LPf/d;->a:Lcom/ui/wmw/api/v1/a;

    return-object p0
.end method

.method public static final synthetic d(LPf/d;)LKf/e;
    .locals 0

    iget-object p0, p0, LPf/d;->b:LKf/e;

    return-object p0
.end method

.method public static final synthetic e(LPf/d;Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;)V
    .locals 0

    invoke-direct {p0, p1}, LPf/d;->j(Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;)V

    return-void
.end method

.method private final g()Lgg/b;
    .locals 1

    iget-object v0, p0, LPf/d;->c:Lgg/b;

    return-object v0
.end method

.method private static final h()V
    .locals 1

    new-instance v0, LPf/c;

    invoke-direct {v0}, LPf/c;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    return-void
.end method

.method private static final i()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW Status finished"

    return-object v0
.end method

.method private final j(Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;)V
    .locals 1

    iget-object v0, p0, LPf/d;->b:LKf/e;

    invoke-virtual {v0, p1}, LKf/e;->w(Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;)V

    return-void
.end method


# virtual methods
.method public f()Lgg/i;
    .locals 1

    iget-object v0, p0, LPf/d;->d:Lgg/i;

    return-object v0
.end method
