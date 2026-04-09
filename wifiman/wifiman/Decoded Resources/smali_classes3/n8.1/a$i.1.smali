.class final Ln8/a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/a;


# direct methods
.method constructor <init>(Ln8/a;)V
    .locals 0

    iput-object p1, p0, Ln8/a$i;->a:Ln8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCc/a;)Ljava/util/List;
    .locals 10

    const-string/jumbo v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln8/a$i;->a:Ln8/a;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v9

    invoke-interface {p1}, LCc/a;->l()Lh9/a;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v3, Ls9/d$b;

    const v2, 0x7f110193

    invoke-direct {v3, v2}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$c;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string/jumbo v4, "US"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "toUpperCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string/jumbo v2, "mac"

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v8}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-interface {p1}, LCc/a;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v3, Ls9/d$b;

    const v2, 0x7f1100ad

    invoke-direct {v3, v2}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$c;

    invoke-direct {v5, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string/jumbo v2, "model"

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v8}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-interface {p1}, LCc/a;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v3, Ls9/d$b;

    const v2, 0x7f1100ac

    invoke-direct {v3, v2}, Ls9/d$b;-><init>(I)V

    invoke-static {v1}, LL8/k;->a(Lcom/ui/wifiman/model/vendor/d;)Ls9/d;

    move-result-object v5

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string/jumbo v2, "vendor"

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v8}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-interface {p1}, LCc/a;->d()LCc/b;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lk8/b;->a(LCc/b;)Ls9/d;

    move-result-object v5

    if-eqz v5, :cond_3

    new-instance v3, Ls9/d$b;

    const v1, 0x7f1100be

    invoke-direct {v3, v1}, Ls9/d$b;-><init>(I)V

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string/jumbo v2, "deviceType"

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v8}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-interface {p1}, LCc/a;->h()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v3, Ls9/d$b;

    const v2, 0x7f1100ab

    invoke-direct {v3, v2}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$c;

    invoke-direct {v5, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string/jumbo v2, "fw"

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v8}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-interface {p1}, LCc/a;->e()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    new-instance v3, Ls9/d$b;

    const v4, 0x7f1100d7

    invoke-direct {v3, v4}, Ls9/d$b;-><init>(I)V

    sget-object v4, LL8/d;->a:LL8/d;

    invoke-virtual {v4, v1, v2}, LL8/d;->b(J)Ls9/d;

    move-result-object v5

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string/jumbo v2, "uptime"

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v8}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-interface {p1}, LCc/a;->j()LDc/j;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, LDc/j;->E()LLc/a$a;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, LLc/a$a;->m()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v3, Ls9/d$b;

    const v2, 0x7f1100a5

    invoke-direct {v3, v2}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$c;

    invoke-direct {v5, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string/jumbo v2, "softwareid"

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v8}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-interface {p1}, LCc/a;->g()Lcom/ui/wifiman/model/bluetooth/le/a$a;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/ui/wifiman/model/bluetooth/le/a$a;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v3, Ls9/d$b;

    const v1, 0x7f11008a

    invoke-direct {v3, v1}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$c;

    invoke-direct {v5, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string/jumbo v2, "battery"

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v8}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object p1

    invoke-interface {v9, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    invoke-static {v9}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/a;

    invoke-virtual {p0, p1}, Ln8/a$i;->a(LCc/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
