.class final LTc/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTc/b;-><init>(Lxa/o;Lbe/e;Lcom/ui/wifiman/model/vendor/d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LTc/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LTc/b$a;

    invoke-direct {v0}, LTc/b$a;-><init>()V

    sput-object v0, LTc/b$a;->a:LTc/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwa/a;

    check-cast p2, Lcom/ui/wifiman/model/vendor/d$a;

    check-cast p3, Ll9/a;

    invoke-virtual {p0, p1, p2, p3}, LTc/b$a;->b(Lwa/a;Lcom/ui/wifiman/model/vendor/d$a;Ll9/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lwa/a;Lcom/ui/wifiman/model/vendor/d$a;Ll9/a;)Ljava/util/List;
    .locals 25

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "catalogBrowser"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "vendorDir"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "<destruct>"

    move-object/from16 v3, p3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p3 .. p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_9

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v3

    new-instance v4, Lkotlin/jvm/internal/N;

    invoke-direct {v4}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v23

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lce/c;

    invoke-virtual {v5}, Lce/c;->f()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    invoke-interface {v0, v6}, Lwa/a;->d(Ljava/lang/String;)Lua/a;

    move-result-object v6

    check-cast v6, Lxa/a$d;

    goto :goto_1

    :cond_0
    move-object v6, v7

    :goto_1
    iput-object v6, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-virtual {v5}, Lce/c;->d()Linet/ipaddr/g;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-virtual {v5}, Lce/c;->e()Lh9/a;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-virtual {v5}, Lce/c;->a()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-static {v6}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    move-object v8, v6

    goto :goto_2

    :cond_1
    move-object v8, v7

    :goto_2
    invoke-virtual {v5}, Lce/c;->d()Linet/ipaddr/g;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lce/c;->e()Lh9/a;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lce/c;->h()LW7/b;

    move-result-object v10

    invoke-virtual {v5}, Lce/c;->i()Ljava/lang/Integer;

    move-result-object v11

    if-eqz v11, :cond_2

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    sget-object v12, LS8/g;->b:LS8/g$a;

    invoke-virtual {v12, v11}, LS8/g$a;->a(I)LS8/g;

    move-result-object v11

    goto :goto_3

    :cond_2
    move-object v11, v7

    :goto_3
    invoke-virtual {v5}, Lce/c;->b()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5}, Lce/c;->g()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_3

    invoke-static {v13}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_3

    move-object v15, v13

    goto :goto_4

    :cond_3
    move-object v15, v7

    :goto_4
    invoke-virtual {v5}, Lce/c;->c()LS8/a;

    move-result-object v16

    invoke-virtual {v5}, Lce/c;->j()LS8/l;

    move-result-object v17

    iget-object v13, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v13, Lxa/a$d;

    invoke-virtual {v5}, Lce/c;->f()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_4

    invoke-static {v14}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_4

    goto :goto_5

    :cond_4
    move-object v14, v7

    :goto_5
    invoke-virtual {v5}, Lce/c;->e()Lh9/a;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-interface {v1, v5}, Lcom/ui/wifiman/model/vendor/d$a;->a(Lh9/a;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object v5

    move-object/from16 v18, v5

    goto :goto_6

    :cond_5
    move-object/from16 v18, v7

    :goto_6
    iget-object v5, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v5, Lxa/a$d;

    if-eqz v5, :cond_6

    invoke-static {v5}, LSc/i;->a(Lxa/a$d;)LCc/b;

    move-result-object v5

    move-object/from16 v19, v5

    goto :goto_7

    :cond_6
    move-object/from16 v19, v7

    :goto_7
    new-instance v7, LTc/a$a;

    move-object v5, v7

    const-wide v21, 0x7fffffffffffffffL

    move-object v0, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object/from16 v13, v18

    move-object/from16 v18, v19

    move-wide/from16 v19, v23

    invoke-direct/range {v5 .. v22}, LTc/a$a;-><init>(Linet/ipaddr/g;Ljava/lang/String;Lh9/a;LW7/b;LS8/g;Ljava/lang/String;Lxa/a$d;Lcom/ui/wifiman/model/vendor/d;Ljava/lang/String;Ljava/lang/String;LS8/a;LS8/l;LCc/b;JJ)V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    move-object/from16 v0, p1

    goto/16 :goto_0

    :cond_8
    invoke-static {v3}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_8

    :cond_9
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :goto_8
    return-object v0
.end method
