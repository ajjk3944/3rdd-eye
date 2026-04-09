.class final Lcom/ui/wmw/wifi/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/wifi/b;-><init>(Lcom/ui/wmw/api/v1/a;LKf/e;LMf/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LKf/e;

.field final synthetic b:Lcom/ui/wmw/wifi/b;


# direct methods
.method constructor <init>(LKf/e;Lcom/ui/wmw/wifi/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/wifi/b$e;->a:LKf/e;

    iput-object p2, p0, Lcom/ui/wmw/wifi/b$e;->b:Lcom/ui/wmw/wifi/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lcom/ui/wmw/wifi/b$e;->f()V

    return-void
.end method

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/ui/wmw/wifi/b$e;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()V
    .locals 0

    invoke-static {}, Lcom/ui/wmw/wifi/b$e;->h()V

    return-void
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/ui/wmw/wifi/b$e;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final f()V
    .locals 1

    new-instance v0, Lcom/ui/wmw/wifi/e;

    invoke-direct {v0}, Lcom/ui/wmw/wifi/e;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    return-void
.end method

.method private static final g()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW Wifi Scan was TURNED OFF"

    return-object v0
.end method

.method private static final h()V
    .locals 1

    new-instance v0, Lcom/ui/wmw/wifi/f;

    invoke-direct {v0}, Lcom/ui/wmw/wifi/f;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    return-void
.end method

.method private static final i()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW Wifi Scan was TURNED ON"

    return-object v0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/wifi/b$e;->e(Ljava/lang/Boolean;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/Boolean;)Lgg/f;
    .locals 9

    const-string v0, "fwUploadInProcess"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/ui/wmw/wifi/b$e;->a:LKf/e;

    invoke-virtual {p1}, LKf/e;->m()Lcom/ui/common/semver/SemVer;

    move-result-object p1

    new-instance v8, Lcom/ui/common/semver/SemVer;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/ui/common/semver/SemVer;-><init>(IIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v8}, Lcom/ui/common/semver/SemVer;->a(Lcom/ui/common/semver/SemVer;)I

    move-result p1

    if-ltz p1, :cond_0

    iget-object p1, p0, Lcom/ui/wmw/wifi/b$e;->b:Lcom/ui/wmw/wifi/b;

    invoke-static {p1}, Lcom/ui/wmw/wifi/b;->g(Lcom/ui/wmw/wifi/b;)Lcom/ui/wmw/api/v1/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wmw/api/v1/a;->h()Lgg/b;

    move-result-object p1

    sget-object v0, Lcom/ui/wmw/wifi/b$e$a;->a:Lcom/ui/wmw/wifi/b$e$a;

    invoke-virtual {p1, v0}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    sget-object v0, Lcom/ui/wmw/wifi/b$e$b;->a:Lcom/ui/wmw/wifi/b$e$b;

    invoke-virtual {p1, v0}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v0, Lcom/ui/wmw/wifi/g;

    invoke-direct {v0}, Lcom/ui/wmw/wifi/g;-><init>()V

    invoke-virtual {p1, v0}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/ui/wmw/wifi/b$e;->b:Lcom/ui/wmw/wifi/b;

    invoke-static {p1}, Lcom/ui/wmw/wifi/b;->g(Lcom/ui/wmw/wifi/b;)Lcom/ui/wmw/api/v1/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wmw/api/v1/a;->k()Lgg/b;

    move-result-object p1

    sget-object v0, Lcom/ui/wmw/wifi/b$e$c;->a:Lcom/ui/wmw/wifi/b$e$c;

    invoke-virtual {p1, v0}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v0, Lcom/ui/wmw/wifi/h;

    invoke-direct {v0}, Lcom/ui/wmw/wifi/h;-><init>()V

    invoke-virtual {p1, v0}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method
