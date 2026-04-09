.class final Lje/v$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje/v;-><init>(Lje/B;Lle/g;Lbe/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lje/v;


# direct methods
.method constructor <init>(Lje/v;)V
    .locals 0

    iput-object p1, p0, Lje/v$c;->a:Lje/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lje/r;

    check-cast p2, Ll9/a;

    check-cast p3, Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3}, Lje/v$c;->b(Lje/r;Ll9/a;Ljava/util/Map;)Lje/r;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lje/r;Ll9/a;Ljava/util/Map;)Lje/r;
    .locals 12

    const-string v0, "wifiConnState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiScanByBand"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lje/v$b;

    instance-of v0, p1, Lje/r$b$a$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    move-object v2, p1

    check-cast v2, Lje/r$b$a$b;

    invoke-virtual {v2}, Lje/r$b$a$b;->b()LS8/c;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lje/v$a;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lje/v$b;->a()LS8/c;

    move-result-object v0

    invoke-virtual {v2}, Lje/r$b$a$b;->b()LS8/c;

    move-result-object v3

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    if-nez p2, :cond_1

    if-nez p3, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {v2}, Lje/r$b$a$b;->e()LS8/a;

    move-result-object v0

    if-nez v0, :cond_3

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lje/v$b;->d()LS8/a;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_3

    if-eqz p3, :cond_4

    invoke-virtual {p3}, Lje/v$a;->a()LS8/a;

    move-result-object v0

    :cond_3
    move-object v5, v0

    goto :goto_2

    :cond_4
    move-object v5, v1

    :goto_2
    iget-object v0, p0, Lje/v$c;->a:Lje/v;

    check-cast p1, Lje/r$b$a;

    invoke-static {v0, p1, p3}, Lje/v;->c(Lje/v;Lje/r$b$a;Lje/v$a;)LS8/j;

    move-result-object v6

    invoke-virtual {v2}, Lje/r$b$a$b;->m()Lje/q;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v0, p0, Lje/v$c;->a:Lje/v;

    invoke-static {v0, p1, p3, p2}, Lje/v;->b(Lje/v;Lje/q;Lje/v$a;Lje/v$b;)Lje/q;

    move-result-object v1

    :cond_5
    move-object v7, v1

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v9}, Lje/r$b$a$b;->k(Lje/r$b$a$b;Lke/c;Lh9/a;LS8/a;LS8/j;Lje/q;ILjava/lang/Object;)Lje/r$b$a$b;

    move-result-object p1

    goto/16 :goto_d

    :cond_6
    instance-of v0, p1, Lje/r$b$a$a;

    if-eqz v0, :cond_16

    move-object v2, p1

    check-cast v2, Lje/r$b$a$a;

    invoke-virtual {v2}, Lje/r$b$a$a;->b()LS8/c;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lje/v$a;

    invoke-virtual {v2}, Lje/r$b$a$a;->e()LS8/a;

    move-result-object v3

    if-nez v3, :cond_8

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lje/v$b;->d()LS8/a;

    move-result-object v3

    goto :goto_3

    :cond_7
    move-object v3, v1

    :goto_3
    if-nez v3, :cond_8

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lje/v$a;->a()LS8/a;

    move-result-object v3

    :cond_8
    move-object v5, v3

    goto :goto_4

    :cond_9
    move-object v5, v1

    :goto_4
    iget-object v3, p0, Lje/v$c;->a:Lje/v;

    check-cast p1, Lje/r$b$a;

    invoke-static {v3, p1, v0}, Lje/v;->c(Lje/v;Lje/r$b$a;Lje/v$a;)LS8/j;

    move-result-object v6

    invoke-virtual {v2}, Lje/r$b$a$a;->q()Lje/q;

    move-result-object p1

    if-nez p1, :cond_b

    sget-object p1, LS8/c;->GHZ_2_4:LS8/c;

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lje/v$a;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lje/v$a;->b()Lje/q;

    move-result-object p1

    goto :goto_5

    :cond_a
    move-object p1, v1

    :cond_b
    :goto_5
    if-eqz p1, :cond_d

    iget-object v0, p0, Lje/v$c;->a:Lje/v;

    sget-object v3, LS8/c;->GHZ_2_4:LS8/c;

    invoke-interface {p3, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lje/v$a;

    if-eqz p2, :cond_c

    invoke-virtual {p2}, Lje/v$b;->a()LS8/c;

    move-result-object v7

    if-ne v7, v3, :cond_c

    move-object v3, p2

    goto :goto_6

    :cond_c
    move-object v3, v1

    :goto_6
    invoke-static {v0, p1, v4, v3}, Lje/v;->b(Lje/v;Lje/q;Lje/v$a;Lje/v$b;)Lje/q;

    move-result-object p1

    move-object v7, p1

    goto :goto_7

    :cond_d
    move-object v7, v1

    :goto_7
    invoke-virtual {v2}, Lje/r$b$a$a;->r()Lje/q;

    move-result-object p1

    if-nez p1, :cond_f

    sget-object p1, LS8/c;->GHZ_5:LS8/c;

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lje/v$a;

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Lje/v$a;->b()Lje/q;

    move-result-object p1

    goto :goto_8

    :cond_e
    move-object p1, v1

    :cond_f
    :goto_8
    if-eqz p1, :cond_11

    iget-object v0, p0, Lje/v$c;->a:Lje/v;

    sget-object v3, LS8/c;->GHZ_5:LS8/c;

    invoke-interface {p3, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lje/v$a;

    if-eqz p2, :cond_10

    invoke-virtual {p2}, Lje/v$b;->a()LS8/c;

    move-result-object v8

    if-ne v8, v3, :cond_10

    move-object v3, p2

    goto :goto_9

    :cond_10
    move-object v3, v1

    :goto_9
    invoke-static {v0, p1, v4, v3}, Lje/v;->b(Lje/v;Lje/q;Lje/v$a;Lje/v$b;)Lje/q;

    move-result-object p1

    move-object v8, p1

    goto :goto_a

    :cond_11
    move-object v8, v1

    :goto_a
    invoke-virtual {v2}, Lje/r$b$a$a;->s()Lje/q;

    move-result-object p1

    if-nez p1, :cond_13

    sget-object p1, LS8/c;->GHZ_6:LS8/c;

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lje/v$a;

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Lje/v$a;->b()Lje/q;

    move-result-object p1

    goto :goto_b

    :cond_12
    move-object p1, v1

    :cond_13
    :goto_b
    if-eqz p1, :cond_15

    iget-object v0, p0, Lje/v$c;->a:Lje/v;

    sget-object v3, LS8/c;->GHZ_6:LS8/c;

    invoke-interface {p3, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lje/v$a;

    if-eqz p2, :cond_14

    invoke-virtual {p2}, Lje/v$b;->a()LS8/c;

    move-result-object v4

    if-ne v4, v3, :cond_14

    goto :goto_c

    :cond_14
    move-object p2, v1

    :goto_c
    invoke-static {v0, p1, p3, p2}, Lje/v;->b(Lje/v;Lje/q;Lje/v$a;Lje/v$b;)Lje/q;

    move-result-object v1

    :cond_15
    move-object v9, v1

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v11}, Lje/r$b$a$a;->n(Lje/r$b$a$a;Lke/c;Lh9/a;LS8/a;LS8/j;Lje/q;Lje/q;Lje/q;ILjava/lang/Object;)Lje/r$b$a$a;

    move-result-object p1

    goto :goto_d

    :cond_16
    instance-of p2, p1, Lje/r$b$b;

    if-nez p2, :cond_18

    instance-of p2, p1, Lje/r$a;

    if-eqz p2, :cond_17

    goto :goto_d

    :cond_17
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_18
    :goto_d
    return-object p1
.end method
