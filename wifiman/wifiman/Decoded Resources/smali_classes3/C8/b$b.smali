.class final LC8/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC8/b;


# direct methods
.method constructor <init>(LC8/b;)V
    .locals 0

    iput-object p1, p0, LC8/b$b;->a:LC8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lnd/f;)Ljava/util/List;
    .locals 10

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lnd/f;->r()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, LC8/b$b;->a:LC8/b;

    sget-object v3, LC8/b$a;->SSID:LC8/b$a;

    new-instance v4, Ls9/d$c;

    invoke-direct {v4, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v2, v0, v3, v4}, LC8/b;->q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V

    :cond_0
    invoke-virtual {p1}, Lnd/f;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p0, LC8/b$b;->a:LC8/b;

    sget-object v3, LC8/b$a;->AP_MODEL:LC8/b$a;

    new-instance v4, Ls9/d$c;

    invoke-direct {v4, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v2, v0, v3, v4}, LC8/b;->q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V

    :cond_1
    invoke-virtual {p1}, Lnd/f;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, p0, LC8/b$b;->a:LC8/b;

    sget-object v3, LC8/b$a;->AP_NAME:LC8/b$a;

    new-instance v4, Ls9/d$c;

    invoke-direct {v4, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v2, v0, v3, v4}, LC8/b;->q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V

    :cond_2
    invoke-virtual {p1}, Lnd/f;->l()LS8/l;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    iget-object v5, p0, LC8/b$b;->a:LC8/b;

    sget-object v6, LC8/b$a;->SIGNAL_WIFI:LC8/b$a;

    invoke-static {v1, v3, v4, v2, v4}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v1

    invoke-static {v5, v0, v6, v1}, LC8/b;->q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V

    :cond_3
    invoke-virtual {p1}, Lnd/f;->s()LW7/a;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v5, p0, LC8/b$b;->a:LC8/b;

    sget-object v6, LC8/b$a;->THROUGHPUT:LC8/b$a;

    invoke-static {v1, v3}, LL8/b;->a(LW7/a;I)Ls9/d;

    move-result-object v1

    invoke-static {v5, v0, v6, v1}, LC8/b;->q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V

    :cond_4
    invoke-virtual {p1}, Lnd/f;->c()LS8/c;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v5, p0, LC8/b$b;->a:LC8/b;

    sget-object v6, LC8/b$a;->WIFI_BAND:LC8/b$a;

    invoke-static {v1}, LNe/h;->c(LS8/c;)Ls9/d;

    move-result-object v1

    invoke-static {v5, v0, v6, v1}, LC8/b;->q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V

    :cond_5
    invoke-virtual {p1}, Lnd/f;->h()LS8/a;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v5, p0, LC8/b$b;->a:LC8/b;

    sget-object v6, LC8/b$a;->WIFI_MODE:LC8/b$a;

    new-instance v7, Ls9/d$a;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, LC8/b$b$b;

    invoke-direct {v9, v1}, LC8/b$b$b;-><init>(LS8/a;)V

    invoke-direct {v7, v8, v9}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    invoke-static {v5, v0, v6, v7}, LC8/b;->q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V

    :cond_6
    invoke-virtual {p1}, Lnd/f;->n()LV7/a;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {p1}, Lnd/f;->p()LV7/a;

    move-result-object v1

    if-eqz v1, :cond_8

    iget-object v1, p0, LC8/b$b;->a:LC8/b;

    sget-object v5, LC8/b$a;->CELLULAR_SIGNAL_SIM_0:LC8/b$a;

    invoke-virtual {p1}, Lnd/f;->n()LV7/a;

    move-result-object v6

    invoke-static {v6, v3, v4, v2, v4}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v6

    invoke-static {v1, v0, v5, v6}, LC8/b;->q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V

    invoke-virtual {p1}, Lnd/f;->m()LV7/b;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-object v5, p0, LC8/b$b;->a:LC8/b;

    sget-object v6, LC8/b$a;->CELLULAR_CONNECTION_SIM_0:LC8/b$a;

    new-instance v7, Ls9/d$b;

    invoke-static {v1}, LNe/a;->a(LV7/b;)I

    move-result v1

    invoke-direct {v7, v1}, Ls9/d$b;-><init>(I)V

    invoke-static {v5, v0, v6, v7}, LC8/b;->q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V

    :cond_7
    iget-object v1, p0, LC8/b$b;->a:LC8/b;

    sget-object v5, LC8/b$a;->CELLULAR_SIGNAL_SIM_1:LC8/b$a;

    invoke-virtual {p1}, Lnd/f;->p()LV7/a;

    move-result-object v6

    invoke-static {v6, v3, v4, v2, v4}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v2

    invoke-static {v1, v0, v5, v2}, LC8/b;->q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V

    invoke-virtual {p1}, Lnd/f;->o()LV7/b;

    move-result-object v1

    if-eqz v1, :cond_c

    iget-object v2, p0, LC8/b$b;->a:LC8/b;

    sget-object v3, LC8/b$a;->CELLULAR_CONNECTION_SIM_1:LC8/b$a;

    new-instance v4, Ls9/d$b;

    invoke-static {v1}, LNe/a;->a(LV7/b;)I

    move-result v1

    invoke-direct {v4, v1}, Ls9/d$b;-><init>(I)V

    invoke-static {v2, v0, v3, v4}, LC8/b;->q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V

    goto :goto_0

    :cond_8
    invoke-virtual {p1}, Lnd/f;->n()LV7/a;

    move-result-object v1

    if-nez v1, :cond_9

    invoke-virtual {p1}, Lnd/f;->p()LV7/a;

    move-result-object v1

    :cond_9
    if-eqz v1, :cond_a

    iget-object v5, p0, LC8/b$b;->a:LC8/b;

    sget-object v6, LC8/b$a;->CELLULAR_SIGNAL:LC8/b$a;

    invoke-static {v1, v3, v4, v2, v4}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v1

    invoke-static {v5, v0, v6, v1}, LC8/b;->q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V

    :cond_a
    invoke-virtual {p1}, Lnd/f;->m()LV7/b;

    move-result-object v1

    if-nez v1, :cond_b

    invoke-virtual {p1}, Lnd/f;->o()LV7/b;

    move-result-object v1

    :cond_b
    if-eqz v1, :cond_c

    iget-object v2, p0, LC8/b$b;->a:LC8/b;

    sget-object v3, LC8/b$a;->CELLULAR_CONNECTION:LC8/b$a;

    new-instance v4, Ls9/d$b;

    invoke-static {v1}, LNe/a;->a(LV7/b;)I

    move-result v1

    invoke-direct {v4, v1}, Ls9/d$b;-><init>(I)V

    invoke-static {v2, v0, v3, v4}, LC8/b;->q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V

    :cond_c
    :goto_0
    iget-object v1, p0, LC8/b$b;->a:LC8/b;

    sget-object v2, LC8/b$a;->CREATED:LC8/b$a;

    new-instance v3, Ls9/d$a;

    invoke-virtual {p1}, Lnd/f;->e()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    new-instance v5, LC8/b$b$a;

    invoke-direct {v5, p1}, LC8/b$b$a;-><init>(Lnd/f;)V

    invoke-direct {v3, v4, v5}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    invoke-static {v1, v0, v2, v3}, LC8/b;->q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnd/f;

    invoke-virtual {p0, p1}, LC8/b$b;->a(Lnd/f;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
