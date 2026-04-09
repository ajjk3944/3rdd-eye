.class public final LOd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd/a$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOd/c$a;,
        LOd/c$b;
    }
.end annotation


# static fields
.field public static final d:LOd/c$a;


# instance fields
.field private final a:Lgg/z;

.field private final b:Lgg/i;

.field private final c:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LOd/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LOd/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LOd/c;->d:LOd/c$a;

    return-void
.end method

.method public constructor <init>(LZc/f;Lfd/b;)V
    .locals 2

    const-string v0, "networkConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedOkhttpClientHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LOd/c$d;

    invoke-direct {v0, p2}, LOd/c$d;-><init>(Lfd/b;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p2

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lgg/z;->e()Lgg/z;

    move-result-object p2

    const-string v0, "cache(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LOd/c;->a:Lgg/z;

    invoke-interface {p1}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    sget-object v0, LOd/c$c;->a:LOd/c$c;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LOd/c;->b:Lgg/i;

    new-instance p1, LOd/c$e;

    invoke-direct {p1, p0}, LOd/c$e;-><init>(LOd/c;)V

    invoke-virtual {p2, p1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, p2, v0, v1}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p2, LOd/b;

    invoke-direct {p2}, LOd/b;-><init>()V

    invoke-virtual {p1, p2}, Lgg/i;->r1(Lkg/b;)Lgg/i;

    move-result-object p1

    sget-object p2, LOd/c$f;->a:LOd/c$f;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LOd/c;->c:Lgg/i;

    return-void
.end method

.method public static synthetic b(LWc/b;LWc/b;)LWc/b;
    .locals 0

    invoke-static {p0, p1}, LOd/c;->g(LWc/b;LWc/b;)LWc/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LOd/c;Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;)LOd/a$b;
    .locals 0

    invoke-direct {p0, p1}, LOd/c;->f(Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;)LOd/a$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(LOd/c;)Lgg/i;
    .locals 0

    iget-object p0, p0, LOd/c;->b:Lgg/i;

    return-object p0
.end method

.method public static final synthetic e(LOd/c;LWc/b;)Lgg/s;
    .locals 0

    invoke-direct {p0, p1}, LOd/c;->h(LWc/b;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;)LOd/a$b;
    .locals 1

    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a$b$b;

    if-eqz v0, :cond_0

    sget-object p1, LOd/a$b$a$b;->a:LOd/a$b$a$b;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a$b$a;

    if-eqz v0, :cond_1

    sget-object p1, LOd/a$b$a$a;->a:LOd/a$b$a$a;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a$c$b;

    if-eqz v0, :cond_2

    sget-object p1, LOd/a$b$b$b;->a:LOd/a$b$b$b;

    goto :goto_0

    :cond_2
    instance-of p1, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a$c$a;

    if-eqz p1, :cond_3

    sget-object p1, LOd/a$b$b$a;->a:LOd/a$b$b$a;

    :goto_0
    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private static final g(LWc/b;LWc/b;)LWc/b;
    .locals 1

    const-string v0, "previous"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "current"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LWc/b$b;

    if-eqz v0, :cond_0

    instance-of v0, p0, LWc/b$a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    return-object p0
.end method

.method private final h(LWc/b;)Lgg/s;
    .locals 2

    iget-object v0, p0, LOd/c;->b:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, LOd/c$g;

    invoke-direct {v1, p1, p0}, LOd/c$g;-><init>(LWc/b;LOd/c;)V

    invoke-virtual {v0, v1}, Lgg/z;->v(Lkg/n;)Lgg/s;

    move-result-object p1

    const-string v0, "flatMapObservable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, LOd/c;->c:Lgg/i;

    return-object v0
.end method
