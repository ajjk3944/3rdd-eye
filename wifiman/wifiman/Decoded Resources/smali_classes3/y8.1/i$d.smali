.class final Ly8/i$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/i;-><init>(Ly8/a$b;Ly8/r;Ljd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/i;


# direct methods
.method constructor <init>(Ly8/i;)V
    .locals 0

    iput-object p1, p0, Ly8/i$d;->a:Ly8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;Ll9/a;)Ll9/a;
    .locals 16

    const-string v0, "<destruct>"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd/a$b;

    invoke-virtual/range {p2 .. p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldd/i;

    const/4 v2, 0x0

    if-eqz v0, :cond_c

    if-eqz v1, :cond_c

    sget-object v5, LTe/N;->COMPARE_1:LTe/N;

    invoke-virtual {v0}, Ljd/a$b;->b()LCc/a;

    move-result-object v3

    move-object/from16 v15, p0

    if-eqz v3, :cond_1

    iget-object v4, v15, Ly8/i$d;->a:Ly8/i;

    invoke-virtual {v4}, Ly8/f;->d()Lcom/ubnt/usurvey/product/m$c;

    move-result-object v4

    invoke-static {v3, v4}, Ln8/m;->c(LCc/k;Lcom/ubnt/usurvey/product/m$c;)Ls9/a;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v6, v3

    goto :goto_2

    :cond_1
    :goto_1
    sget-object v3, LPe/a;->a:LPe/a;

    invoke-virtual {v3}, LPe/a;->o()Ls9/b;

    move-result-object v3

    goto :goto_0

    :goto_2
    invoke-virtual {v0}, Ljd/a$b;->b()LCc/a;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-interface {v3}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    new-instance v4, Ls9/d$c;

    invoke-direct {v4, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v7, v4

    goto :goto_3

    :cond_2
    new-instance v3, Ls9/d$b;

    const v4, 0x7f1100cc

    invoke-direct {v3, v4}, Ls9/d$b;-><init>(I)V

    move-object v7, v3

    :goto_3
    invoke-virtual {v0}, Ljd/a$b;->b()LCc/a;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-interface {v3}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_3
    move-object v3, v2

    :goto_4
    const/4 v4, 0x0

    const/4 v8, 0x1

    if-eqz v3, :cond_4

    move v9, v8

    goto :goto_5

    :cond_4
    move v9, v4

    :goto_5
    invoke-virtual {v0}, Ljd/a$b;->b()LCc/a;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-interface {v3}, LCc/a;->n()Linet/ipaddr/ipv4/b;

    move-result-object v3

    if-nez v3, :cond_7

    :cond_5
    invoke-virtual {v0}, Ljd/a$b;->b()LCc/a;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {v0}, LCc/a;->i()Linet/ipaddr/ipv6/b;

    move-result-object v3

    goto :goto_6

    :cond_6
    move-object v3, v2

    :cond_7
    :goto_6
    if-eqz v3, :cond_8

    new-instance v2, Ls9/d$c;

    invoke-virtual {v3}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v3, "toNormalizedString(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_8
    move-object v10, v2

    invoke-virtual {v1}, Ldd/i;->d()Lb8/b;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-static {v0, v8}, LNe/d;->c(Lb8/b;Z)Ls9/d;

    move-result-object v0

    if-nez v0, :cond_9

    goto :goto_8

    :cond_9
    :goto_7
    move-object v11, v0

    goto :goto_9

    :cond_a
    :goto_8
    new-instance v0, Ls9/d$b;

    const v2, 0x7f1103c6

    invoke-direct {v0, v2}, Ls9/d$b;-><init>(I)V

    goto :goto_7

    :goto_9
    invoke-virtual {v1}, Ldd/i;->d()Lb8/b;

    move-result-object v0

    if-nez v0, :cond_b

    move v12, v8

    goto :goto_a

    :cond_b
    move v12, v4

    :goto_a
    new-instance v2, LTe/B0;

    const-string/jumbo v4, "cmpConnected"

    const/4 v0, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x20

    const/4 v1, 0x0

    move-object v3, v2

    move v8, v9

    move-object v9, v0

    move-object v15, v1

    invoke-direct/range {v3 .. v15}, LTe/B0;-><init>(Ljava/lang/String;LTe/N;Ls9/a;Ls9/d;ZLDe/a;Ls9/d;Ls9/d;ZLs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_c
    new-instance v0, Ll9/a;

    invoke-direct {v0, v2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, Ly8/i$d;->a(Ll9/a;Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
