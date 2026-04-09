.class final LM8/b$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/b;


# direct methods
.method constructor <init>(LM8/b;)V
    .locals 0

    iput-object p1, p0, LM8/b$r;->a:LM8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Lmd/a;

    check-cast p3, Ll9/a;

    check-cast p4, Ll9/a;

    invoke-virtual {p0, p1, p2, p3, p4}, LM8/b$r;->b(Ll9/a;Lmd/a;Ll9/a;Ll9/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;Lmd/a;Ll9/a;Ll9/a;)Ljava/util/List;
    .locals 8

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "settings"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lle/i;

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LW7/b;

    invoke-virtual {p4}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LCc/a$b;

    iget-object v0, p0, LM8/b$r;->a:LM8/b;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v1

    if-eqz p1, :cond_d

    new-instance v2, Ls9/d$b;

    const v3, 0x7f110423

    invoke-direct {v2, v3}, Ls9/d$b;-><init>(I)V

    invoke-virtual {p1}, Lle/i;->r()Lke/c;

    move-result-object v3

    instance-of v4, v3, Lke/c$a;

    if-eqz v4, :cond_0

    new-instance v3, Ls9/d$c;

    invoke-virtual {p1}, Lle/i;->r()Lke/c;

    move-result-object v4

    invoke-virtual {v4}, Lke/c;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v3, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    instance-of v3, v3, Lke/c$b;

    if-eqz v3, :cond_c

    new-instance v3, Ls9/d$b;

    const v4, 0x7f110424

    invoke-direct {v3, v4}, Ls9/d$b;-><init>(I)V

    :goto_0
    const-string/jumbo v4, "ssid"

    invoke-static {v0, v4, v2, v3}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lle/i;->p()LS8/j;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Ls9/d$b;

    const v4, 0x7f1103d6

    invoke-direct {v3, v4}, Ls9/d$b;-><init>(I)V

    invoke-static {v2}, LAf/y;->c(LS8/j;)Ls9/d;

    move-result-object v2

    const-string/jumbo v4, "security"

    invoke-static {v0, v4, v3, v2}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1}, Lle/i;->u()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, LL8/k;->a(Lcom/ui/wifiman/model/vendor/d;)Ls9/d;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v3, Ls9/d$b;

    const v4, 0x7f1100ac

    invoke-direct {v3, v4}, Ls9/d$b;-><init>(I)V

    const-string/jumbo v4, "vendor"

    invoke-static {v0, v4, v3, v2}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    const/4 v2, 0x1

    if-eqz p4, :cond_3

    invoke-interface {p4}, LCc/a;->j()LDc/j;

    move-result-object p4

    if-eqz p4, :cond_3

    invoke-virtual {p4}, LDc/j;->L()LTc/a$a;

    move-result-object p4

    if-eqz p4, :cond_3

    invoke-virtual {p4}, LTc/a$a;->p()LS8/g;

    move-result-object p4

    if-eqz p4, :cond_3

    new-instance v3, Ls9/d$b;

    const v4, 0x7f1103e8

    invoke-direct {v3, v4}, Ls9/d$b;-><init>(I)V

    invoke-static {p4, v2}, LNe/k;->b(LS8/g;Z)Ls9/d;

    move-result-object p4

    const-string/jumbo v4, "wifi experience"

    invoke-static {v0, v4, v3, p4}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object p4

    invoke-interface {v1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance p4, Ls9/d$b;

    const v3, 0x7f1103cb

    invoke-direct {p4, v3}, Ls9/d$b;-><init>(I)V

    new-instance v3, Ls9/d$a;

    invoke-virtual {p1}, Lle/i;->f()LS8/e;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, LM8/b$r$c;

    invoke-direct {v5, p1}, LM8/b$r$c;-><init>(Lle/i;)V

    invoke-direct {v3, v4, v5}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    const-string/jumbo v4, "channel"

    invoke-static {v0, v4, p4, v3}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object p4

    invoke-interface {v1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p4, Ls9/d$b;

    const v3, 0x7f1103cd

    invoke-direct {p4, v3}, Ls9/d$b;-><init>(I)V

    invoke-virtual {p1}, Lle/i;->f()LS8/e;

    move-result-object v3

    invoke-virtual {v3}, LS8/e;->b()LS8/d;

    move-result-object v3

    invoke-static {v3}, LNe/i;->a(LS8/d;)Ls9/d;

    move-result-object v3

    const-string/jumbo v4, "channelWidth"

    invoke-static {v0, v4, p4, v3}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object p4

    invoke-interface {v1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lle/i;->l()LS8/a;

    move-result-object p4

    if-eqz p4, :cond_5

    new-instance v3, Ls9/d$b;

    const v4, 0x7f1103d1

    invoke-direct {v3, v4}, Ls9/d$b;-><init>(I)V

    new-instance v4, Ls9/d$a;

    invoke-virtual {p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lle/i;->n()Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/ubnt/usurvey/wifi/WifiMcs;->c()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    :goto_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, LM8/b$r$d;

    invoke-direct {v6, p4, p1}, LM8/b$r$d;-><init>(LS8/a;Lle/i;)V

    invoke-direct {v4, v5, v6}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    const-string/jumbo p4, "phyMode"

    invoke-static {v0, p4, v3, v4}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object p4

    invoke-interface {v1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    const-string/jumbo p4, "format(...)"

    const-string v3, "%d\u00a0Mbps"

    if-eqz p3, :cond_6

    invoke-virtual {p3}, LW7/b;->b()LW7/a;

    move-result-object v4

    if-eqz v4, :cond_6

    new-instance v5, Ls9/d$b;

    const v6, 0x7f1103d4

    invoke-direct {v5, v6}, Ls9/d$b;-><init>(I)V

    new-instance v6, Ls9/d$c;

    invoke-virtual {v4}, LW7/a;->d()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const-string/jumbo v4, "phyRateDown"

    invoke-static {v0, v4, v5, v6}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    if-eqz p3, :cond_7

    invoke-virtual {p3}, LW7/b;->c()LW7/a;

    move-result-object p3

    if-eqz p3, :cond_7

    new-instance v4, Ls9/d$b;

    const v5, 0x7f1103d5

    invoke-direct {v4, v5}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$c;

    invoke-virtual {p3}, LW7/a;->d()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {v3, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, p3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const-string/jumbo p3, "phyRateUP"

    invoke-static {v0, p3, v4, v5}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object p3

    invoke-interface {v1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    invoke-virtual {p1}, Lle/i;->h()LW7/a;

    move-result-object p3

    if-eqz p3, :cond_8

    new-instance p4, Ls9/d$b;

    const v2, 0x7f1103d3

    invoke-direct {p4, v2}, Ls9/d$b;-><init>(I)V

    new-instance v2, Ls9/d$a;

    invoke-virtual {p3}, LW7/a;->d()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, LM8/b$r$e;

    invoke-direct {v4, p3}, LM8/b$r$e;-><init>(LW7/a;)V

    invoke-direct {v2, v3, v4}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    const-string/jumbo p3, "phyRateCapability"

    invoke-static {v0, p3, p4, v2}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object p3

    invoke-interface {v1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    invoke-virtual {p1}, Lle/i;->s()Ljava/lang/Integer;

    move-result-object p3

    if-eqz p3, :cond_9

    new-instance p3, Ls9/d$b;

    const p4, 0x7f1103d7

    invoke-direct {p3, p4}, Ls9/d$b;-><init>(I)V

    new-instance p4, Ls9/d$a;

    invoke-virtual {p1}, Lle/i;->s()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LM8/b$r$f;

    invoke-direct {v3, p1}, LM8/b$r$f;-><init>(Lle/i;)V

    invoke-direct {p4, v2, v3}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    const-string/jumbo v2, "txPower"

    invoke-static {v0, v2, p3, p4}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object p3

    invoke-interface {v1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-virtual {p1}, Lle/i;->t()Ljava/lang/Float;

    move-result-object p3

    if-eqz p3, :cond_a

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p3

    const/high16 p4, 0x42c80000    # 100.0f

    mul-float/2addr p3, p4

    invoke-static {p3}, Loh/b;->e(F)I

    move-result p3

    new-instance p4, Ls9/d$b;

    const v2, 0x7f1103cc

    invoke-direct {p4, v2}, Ls9/d$b;-><init>(I)V

    new-instance v2, Ls9/d$a;

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, LM8/b$r$a;

    invoke-direct {v4, p3}, LM8/b$r$a;-><init>(I)V

    invoke-direct {v2, v3, v4}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    const-string/jumbo p3, "utilization"

    invoke-static {v0, p3, p4, v2}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object p3

    invoke-interface {v1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-virtual {p1}, Lle/i;->g()Ljava/lang/Integer;

    move-result-object p3

    if-eqz p3, :cond_b

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    new-instance p4, Ls9/d$b;

    const v2, 0x7f1103cf

    invoke-direct {p4, v2}, Ls9/d$b;-><init>(I)V

    new-instance v2, Ls9/d$c;

    invoke-static {p3}, Lvf/g;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-direct {v2, p3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const-string/jumbo p3, "station count"

    invoke-static {v0, p3, p4, v2}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object p3

    invoke-interface {v1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    new-instance p3, Ls9/d$b;

    const p4, 0x7f1103d0

    invoke-direct {p3, p4}, Ls9/d$b;-><init>(I)V

    new-instance p4, Ls9/d$a;

    invoke-virtual {p1}, Lle/i;->j()D

    move-result-wide v2

    invoke-static {v2, v3}, Loh/b;->d(D)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LM8/b$r$b;

    invoke-direct {v3, p1, p2}, LM8/b$r$b;-><init>(Lle/i;Lmd/a;)V

    invoke-direct {p4, v2, v3}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    const-string/jumbo p2, "distance"

    invoke-static {v0, p2, p3, p4}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object p2

    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lle/i;->v()Ljava/lang/Boolean;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    new-instance p1, Ls9/d$b;

    const p2, 0x7f1103d8

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    new-instance p2, Ls9/d$b;

    const p3, 0x7f11002b

    invoke-direct {p2, p3}, Ls9/d$b;-><init>(I)V

    const-string/jumbo p3, "rtt support"

    invoke-static {v0, p3, p1, p2}, LM8/b;->B0(LM8/b;Ljava/lang/String;Ls9/d;Ls9/d;)Lyf/a$a;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_d
    :goto_2
    invoke-static {v1}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
