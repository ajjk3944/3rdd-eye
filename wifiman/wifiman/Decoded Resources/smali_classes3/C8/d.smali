.class public final LC8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC8/c;


# instance fields
.field private final a:Li8/a;

.field private final b:Lgg/i;

.field private final c:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lnd/g;Lje/u;Li8/a;)V
    .locals 1

    const-string/jumbo v0, "placesManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wifiWifiConnectionService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "viewRouter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LC8/d;->a:Li8/a;

    invoke-interface {p2}, Lje/u;->a()Lgg/i;

    move-result-object p2

    sget-object p3, LC8/d$a;->a:LC8/d$a;

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    const-string/jumbo p3, "distinctUntilChanged(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LC8/d;->b:Lgg/i;

    invoke-interface {p1}, Lnd/g;->h()Lgg/i;

    move-result-object p1

    new-instance p3, LC8/d$c;

    invoke-direct {p3, p0}, LC8/d$c;-><init>(LC8/d;)V

    invoke-static {p1, p2, p3}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LC8/d;->c:Lgg/i;

    return-void
.end method

.method public static final synthetic d(LC8/d;Lnd/f;Z)LTe/b0;
    .locals 0

    invoke-direct {p0, p1, p2}, LC8/d;->e(Lnd/f;Z)LTe/b0;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lnd/f;Z)LTe/b0;
    .locals 12

    invoke-virtual {p1}, Lnd/f;->l()LS8/l;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lnd/f;->l()LS8/l;

    move-result-object v0

    invoke-virtual {p1}, Lnd/f;->b()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-virtual {p1}, Lnd/f;->a()Ljava/lang/String;

    move-result-object v3

    :cond_0
    if-eqz v3, :cond_2

    invoke-static {v3}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_2

    new-instance v4, Ls9/d$c;

    invoke-direct {v4, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    move-object v4, v2

    :goto_1
    move-object v9, v4

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lnd/f;->q()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_5

    invoke-virtual {p1}, Lnd/f;->p()LV7/a;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lnd/f;->p()LV7/a;

    move-result-object v0

    invoke-virtual {p1}, Lnd/f;->o()LV7/b;

    move-result-object v3

    invoke-direct {p0, v3}, LC8/d;->f(LV7/b;)Ls9/d;

    move-result-object v4

    goto :goto_1

    :cond_5
    :goto_2
    invoke-virtual {p1}, Lnd/f;->n()LV7/a;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lnd/f;->n()LV7/a;

    move-result-object v0

    invoke-virtual {p1}, Lnd/f;->m()LV7/b;

    move-result-object v3

    invoke-direct {p0, v3}, LC8/d;->f(LV7/b;)Ls9/d;

    move-result-object v4

    goto :goto_1

    :cond_6
    move-object v0, v2

    move-object v9, v0

    :goto_3
    new-instance v11, LTe/b0;

    invoke-virtual {p1}, Lnd/f;->g()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ls9/d$c;

    invoke-virtual {p1}, Lnd/f;->j()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {p0, p1}, LC8/d;->g(Lnd/f;)Lb8/c;

    move-result-object v3

    invoke-static {v3}, Lcom/ui/wifiman/ui/component/network/p;->a(Lb8/c;)Ls9/b;

    move-result-object v6

    invoke-direct {p0, p1}, LC8/d;->g(Lnd/f;)Lb8/c;

    move-result-object v3

    invoke-virtual {p1}, Lnd/f;->r()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/ui/wifiman/ui/component/network/p;->b(Lb8/c;Ljava/lang/String;)Ls9/d;

    move-result-object v7

    if-eqz v0, :cond_7

    const/4 p1, 0x2

    invoke-static {v0, v1, v2, p1, v2}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v2

    :cond_7
    move-object v8, v2

    move-object v3, v11

    move v10, p2

    invoke-direct/range {v3 .. v10}, LTe/b0;-><init>(Ljava/lang/String;Ls9/d;Ls9/b;Ls9/d;Ls9/d;Ls9/d;Z)V

    return-object v11
.end method

.method private final f(LV7/b;)Ls9/d;
    .locals 3

    new-instance v0, Ls9/d$a;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LC8/d$b;

    invoke-direct {v2, p1}, LC8/d$b;-><init>(LV7/b;)V

    invoke-direct {v0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    return-object v0
.end method

.method private final g(Lnd/f;)Lb8/c;
    .locals 1

    invoke-virtual {p1}, Lnd/f;->l()LS8/l;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object p1, Lb8/c;->WIFI:Lb8/c;

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lnd/f;->n()LV7/a;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lnd/f;->p()LV7/a;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lb8/c;->ETHERNET:Lb8/c;

    goto :goto_1

    :cond_2
    :goto_0
    sget-object p1, Lb8/c;->MOBILE:Lb8/c;

    :goto_1
    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lgg/b;
    .locals 3

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC8/d;->a:Li8/a;

    new-instance v1, Li8/a$b$p$b;

    invoke-direct {v1, p1}, Li8/a$b$p$b;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    new-array p1, p1, [Li8/a$b;

    const/4 v2, 0x0

    aput-object v1, p1, v2

    invoke-interface {v0, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LC8/d;->c:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/b;
    .locals 4

    iget-object v0, p0, LC8/d;->a:Li8/a;

    const/4 v1, 0x1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/a$b$p$a;->a:Li8/a$b$p$a;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v0, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v0

    return-object v0
.end method
