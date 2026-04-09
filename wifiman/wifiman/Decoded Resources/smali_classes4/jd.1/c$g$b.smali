.class final Ljd/c$g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljd/c$g;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljd/c;


# direct methods
.method constructor <init>(Ljd/c;)V
    .locals 0

    iput-object p1, p0, Ljd/c$g$b;->a:Ljd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Ll9/a;

    check-cast p3, Ll9/a;

    invoke-virtual {p0, p1, p2, p3}, Ljd/c$g$b;->b(Ll9/a;Ll9/a;Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;Ll9/a;Ll9/a;)Ll9/a;
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "<destruct>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p3

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, LCc/a;

    invoke-virtual/range {p2 .. p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Linet/ipaddr/g;

    invoke-virtual/range {p3 .. p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lce/b$a;

    const/4 v3, 0x0

    if-nez v6, :cond_0

    if-nez v1, :cond_0

    if-eqz v2, :cond_f

    :cond_0
    sget-object v4, Ljd/a$c;->GATEWAY:Ljd/a$c;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lce/b$a;->b()Ljava/lang/Boolean;

    move-result-object v5

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_2

    sget-object v5, Ljd/a$a;->WIRELESS:Ljd/a$a;

    goto :goto_1

    :cond_2
    sget-object v5, Ljd/a$a;->WIRED:Ljd/a$a;

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lce/b$a;->f()Linet/ipaddr/g;

    move-result-object v7

    if-eqz v7, :cond_3

    iget-object v8, v0, Ljd/c$g$b;->a:Ljd/c;

    invoke-static {v8, v7}, Ljd/c;->k(Ljd/c;Linet/ipaddr/g;)Linet/ipaddr/g;

    move-result-object v7

    if-eqz v7, :cond_3

    move-object v1, v7

    goto :goto_2

    :cond_3
    if-eqz v1, :cond_4

    iget-object v7, v0, Ljd/c$g$b;->a:Ljd/c;

    invoke-static {v7, v1}, Ljd/c;->k(Ljd/c;Linet/ipaddr/g;)Linet/ipaddr/g;

    move-result-object v1

    goto :goto_2

    :cond_4
    move-object v1, v3

    :goto_2
    if-eqz v6, :cond_5

    invoke-interface {v6}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_7

    :cond_5
    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lce/b$a;->g()Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :cond_6
    move-object v7, v3

    :cond_7
    :goto_3
    if-eqz v2, :cond_8

    iget-object v8, v0, Ljd/c$g$b;->a:Ljd/c;

    invoke-static {v8, v2}, Ljd/c;->h(Ljd/c;Lce/b$a;)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_4

    :cond_8
    move-object v8, v3

    :goto_4
    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lce/b$a;->e()Ljava/lang/Integer;

    move-result-object v9

    goto :goto_5

    :cond_9
    move-object v9, v3

    :goto_5
    sget-object v10, LMd/g$b;->b:LMd/g$b;

    invoke-virtual {v10}, LMd/g$b;->b()I

    move-result v11

    if-nez v9, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-ne v12, v11, :cond_c

    invoke-virtual {v2}, Lce/b$a;->c()Ljava/lang/Integer;

    move-result-object v9

    if-eqz v9, :cond_b

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    sget-object v11, LMd/g;->a:LMd/g$a;

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10}, LMd/g$b;->b()I

    move-result v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, LMd/g$a;->b(LMd/g$a;Ljava/lang/String;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_8

    :cond_b
    :goto_6
    move-object v9, v3

    goto :goto_8

    :cond_c
    :goto_7
    sget-object v10, LMd/g$c;->b:LMd/g$c;

    invoke-virtual {v10}, LMd/g$c;->b()I

    move-result v11

    if-nez v9, :cond_d

    goto :goto_6

    :cond_d
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-ne v9, v11, :cond_b

    invoke-virtual {v2}, Lce/b$a;->d()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_b

    sget-object v12, LMd/g;->a:LMd/g$a;

    invoke-virtual {v10}, LMd/g$c;->b()I

    move-result v14

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, LMd/g$a;->b(LMd/g$a;Ljava/lang/String;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    :goto_8
    if-eqz v2, :cond_e

    iget-object v3, v0, Ljd/c$g$b;->a:Ljd/c;

    invoke-static {v3, v2}, Ljd/c;->j(Ljd/c;Lce/b$a;)LS8/g;

    move-result-object v3

    :cond_e
    new-instance v10, Ljd/a$d;

    invoke-direct {v10, v7, v9, v3, v8}, Ljd/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;LS8/g;Ljava/lang/Integer;)V

    new-instance v8, Ljd/a$b;

    move-object v2, v8

    move-object v3, v4

    move-object v4, v1

    move-object v7, v10

    invoke-direct/range {v2 .. v7}, Ljd/a$b;-><init>(Ljd/a$c;Linet/ipaddr/g;Ljd/a$a;LCc/a;Ljd/a$d;)V

    move-object v3, v8

    :cond_f
    new-instance v1, Ll9/a;

    invoke-direct {v1, v3}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v1
.end method
