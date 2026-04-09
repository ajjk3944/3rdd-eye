.class final Lcom/ui/wmw/api/v1/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/api/v1/f;-><init>(Ljava/lang/String;Le9/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/api/v1/f;


# direct methods
.method constructor <init>(Lcom/ui/wmw/api/v1/f;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/api/v1/f$c;->a:Lcom/ui/wmw/api/v1/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/comm/v4/a;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f$c;->e(Lcom/ui/comm/v4/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ui/comm/v4/a;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f$c;->g(Lcom/ui/comm/v4/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/ui/comm/v4/a;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wmw/api/v1/f$c;->f(Lcom/ui/comm/v4/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lcom/ui/comm/v4/a;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WMW API - Event "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lcom/ui/comm/v4/a;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WMW API - Error "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lcom/ui/comm/v4/a;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WMW API - Log - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/comm/v4/a;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/f$c;->d(Lcom/ui/comm/v4/a;)Lgg/r;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/ui/comm/v4/a;)Lgg/r;
    .locals 3

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/comm/v4/a$e;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/wmw/api/v1/g;

    invoke-direct {v0, p1}, Lcom/ui/wmw/api/v1/g;-><init>(Lcom/ui/comm/v4/a;)V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    iget-object v0, p0, Lcom/ui/wmw/api/v1/f$c;->a:Lcom/ui/wmw/api/v1/f;

    new-instance v1, Lcom/ui/wmw/api/v1/f$c$a;

    invoke-direct {v1, v0, p1}, Lcom/ui/wmw/api/v1/f$c$a;-><init>(Lcom/ui/wmw/api/v1/f;Lcom/ui/comm/v4/a;)V

    invoke-static {v1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ui/comm/v4/a$c;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/ui/wmw/api/v1/h;

    invoke-direct {v0, p1}, Lcom/ui/wmw/api/v1/h;-><init>(Lcom/ui/comm/v4/a;)V

    invoke-static {v0, v2, v1, v2}, LNf/a;->f(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/ui/comm/v4/a$h;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/ui/wmw/api/v1/i;

    invoke-direct {v0, p1}, Lcom/ui/wmw/api/v1/i;-><init>(Lcom/ui/comm/v4/a;)V

    invoke-static {v0, v2, v1, v2}, LNf/a;->f(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    instance-of v0, p1, Lcom/ui/comm/v4/a$i;

    if-nez v0, :cond_4

    instance-of v0, p1, Lcom/ui/comm/v4/a$j;

    if-nez v0, :cond_4

    instance-of v0, p1, Lcom/ui/comm/v4/a$f;

    if-nez v0, :cond_4

    instance-of v0, p1, Lcom/ui/comm/v4/a$g;

    if-nez v0, :cond_4

    instance-of v0, p1, Lcom/ui/comm/v4/a$a;

    if-nez v0, :cond_4

    instance-of p1, p1, Lcom/ui/comm/v4/a$b;

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    const-string v0, "empty(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method
