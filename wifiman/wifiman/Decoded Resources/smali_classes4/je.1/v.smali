.class public final Lje/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lje/v$a;,
        Lje/v$b;
    }
.end annotation


# instance fields
.field private final a:Lje/B;

.field private final b:Lgg/i;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;


# direct methods
.method public constructor <init>(Lje/B;Lle/g;Lbe/e;)V
    .locals 2

    const-string v0, "wifiConnectionServiceAndroid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiScanner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unifiWifimanApiService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lje/v;->a:Lje/B;

    invoke-interface {p3}, Lbe/e;->a()Lgg/i;

    move-result-object p3

    sget-object v0, Lje/v$f;->a:Lje/v$f;

    invoke-virtual {p3, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    const-string v0, "distinctUntilChanged(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lje/v;->b:Lgg/i;

    invoke-interface {p2}, Lle/g;->b()Lgg/i;

    move-result-object p2

    sget-object v1, Lje/v$e;->a:Lje/v$e;

    invoke-virtual {p2, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lje/v;->c:Lgg/i;

    invoke-virtual {p1}, Lje/B;->a()Lgg/i;

    move-result-object v0

    new-instance v1, Lje/v$c;

    invoke-direct {v1, p0}, Lje/v$c;-><init>(Lje/v;)V

    invoke-static {v0, p3, p2, v1}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    sget-object p3, Lje/v$d;->a:Lje/v$d;

    invoke-virtual {p2, p3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string p3, "refCount(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lje/v;->d:Lgg/i;

    invoke-virtual {p1}, Lje/B;->f()Lgg/i;

    move-result-object p2

    iput-object p2, p0, Lje/v;->e:Lgg/i;

    invoke-virtual {p1}, Lje/B;->g()Lgg/i;

    move-result-object p1

    iput-object p1, p0, Lje/v;->f:Lgg/i;

    return-void
.end method

.method public static final synthetic b(Lje/v;Lje/q;Lje/v$a;Lje/v$b;)Lje/q;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lje/v;->d(Lje/q;Lje/v$a;Lje/v$b;)Lje/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lje/v;Lje/r$b$a;Lje/v$a;)LS8/j;
    .locals 0

    invoke-direct {p0, p1, p2}, Lje/v;->e(Lje/r$b$a;Lje/v$a;)LS8/j;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lje/q;Lje/v$a;Lje/v$b;)Lje/q;
    .locals 12

    invoke-virtual {p1}, Lje/q;->g()LW7/b;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lje/v$b;->e()LW7/b;

    move-result-object v0

    :cond_0
    move-object v6, v0

    goto :goto_0

    :cond_1
    move-object v6, v1

    :goto_0
    invoke-virtual {p1}, Lje/q;->f()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_3

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lje/v$b;->c()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_3

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lje/v$a;->b()Lje/q;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lje/q;->f()Ljava/lang/Integer;

    move-result-object v0

    :cond_3
    move-object v7, v0

    goto :goto_2

    :cond_4
    move-object v7, v1

    :goto_2
    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lje/v$a;->b()Lje/q;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lje/q;->d()LS8/d;

    move-result-object p2

    if-nez p2, :cond_5

    goto :goto_3

    :cond_5
    move-object v8, p2

    goto :goto_4

    :cond_6
    :goto_3
    invoke-virtual {p1}, Lje/q;->d()LS8/d;

    move-result-object p2

    if-nez p2, :cond_5

    if-eqz p3, :cond_7

    invoke-virtual {p3}, Lje/v$b;->b()LS8/d;

    move-result-object v1

    :cond_7
    move-object v8, v1

    :goto_4
    const/16 v10, 0x47

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v11}, Lje/q;->b(Lje/q;LS8/c;Lh9/a;LS8/l;LW7/b;Ljava/lang/Integer;LS8/d;Lke/a;ILjava/lang/Object;)Lje/q;

    move-result-object p1

    return-object p1
.end method

.method private final e(Lje/r$b$a;Lje/v$a;)LS8/j;
    .locals 2

    invoke-virtual {p1}, Lje/r$b$a;->g()LS8/j;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lje/v$a;->c()LS8/j;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v0, p0, Lje/v;->a:Lje/B;

    invoke-virtual {p2}, Lje/v$a;->c()LS8/j;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lje/B;->e(LS8/j;LS8/j;)LS8/j;

    move-result-object p1

    goto :goto_1

    :cond_1
    if-nez p1, :cond_3

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lje/v$a;->c()LS8/j;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, v0

    :cond_3
    :goto_1
    return-object p1
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lje/v;->d:Lgg/i;

    return-object v0
.end method
