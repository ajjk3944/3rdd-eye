.class final Lcom/ui/wifiman/model/ubiquiti/cloud/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/a$b;->a(Lwa/a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/a;

.field final synthetic b:Lwa/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/a;Lwa/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/a$b$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/a$b$a;->b:Lwa/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$a;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "cloudDevices"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    check-cast v1, Ljava/lang/Iterable;

    iget-object v4, v0, Lcom/ui/wifiman/model/ubiquiti/cloud/a$b$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/a;

    iget-object v5, v0, Lcom/ui/wifiman/model/ubiquiti/cloud/a$b$a;->b:Lwa/a;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lmb/l;

    invoke-virtual {v6}, Lmb/l;->f()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lmb/l;->h()Ljava/lang/String;

    move-result-object v8

    const/4 v15, 0x0

    if-eqz v8, :cond_0

    sget-object v9, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v9, v8}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v8

    move-object v10, v8

    goto :goto_1

    :cond_0
    move-object v10, v15

    :goto_1
    invoke-virtual {v6}, Lmb/l;->e()Lmb/p;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-virtual {v8}, Lmb/p;->a()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_1

    :try_start_0
    sget-object v9, Lcom/ui/common/semver/SemVer;->i:Lcom/ui/common/semver/SemVer$a;

    invoke-virtual {v9, v8}, Lcom/ui/common/semver/SemVer$a;->a(Ljava/lang/String;)Lcom/ui/common/semver/SemVer;

    move-result-object v8
    :try_end_0
    .catch Lcom/ui/common/semver/SemVer$FormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Invalid FW version obtained for cloud console- "

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x6

    invoke-static {v8, v15, v15, v9, v15}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    move-object v8, v15

    :goto_2
    move-object v11, v8

    goto :goto_3

    :cond_1
    move-object v11, v15

    :goto_3
    invoke-virtual {v6}, Lmb/l;->i()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6}, Lmb/l;->e()Lmb/p;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Lmb/p;->b()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v16, v8

    goto :goto_4

    :cond_2
    move-object/from16 v16, v15

    :goto_4
    invoke-virtual {v6}, Lmb/l;->b()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v6}, Lmb/l;->e()Lmb/p;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Lmb/p;->c()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-interface {v5, v8}, Lwa/a;->d(Ljava/lang/String;)Lua/a;

    move-result-object v8

    check-cast v8, Lxa/a$d;

    move-object/from16 v18, v8

    goto :goto_5

    :cond_3
    move-object/from16 v18, v15

    :goto_5
    invoke-virtual {v6}, Lmb/l;->k()Z

    move-result v8

    invoke-virtual {v6}, Lmb/l;->g()Lmb/h;

    move-result-object v9

    if-eqz v9, :cond_4

    invoke-virtual {v9}, Lmb/h;->a()Ljava/lang/Double;

    move-result-object v9

    goto :goto_6

    :cond_4
    move-object v9, v15

    :goto_6
    if-eqz v9, :cond_8

    invoke-virtual {v6}, Lmb/l;->g()Lmb/h;

    move-result-object v9

    if-eqz v9, :cond_5

    invoke-virtual {v9}, Lmb/h;->b()Ljava/lang/Double;

    move-result-object v9

    goto :goto_7

    :cond_5
    move-object v9, v15

    :goto_7
    if-eqz v9, :cond_8

    new-instance v9, LW7/c;

    new-instance v13, LW7/c$a;

    invoke-virtual {v6}, Lmb/l;->g()Lmb/h;

    move-result-object v14

    if-eqz v14, :cond_6

    invoke-virtual {v14}, Lmb/h;->a()Ljava/lang/Double;

    move-result-object v14

    goto :goto_8

    :cond_6
    move-object v14, v15

    :goto_8
    invoke-static {v14}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object/from16 p1, v1

    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {v6}, Lmb/l;->g()Lmb/h;

    move-result-object v14

    if-eqz v14, :cond_7

    invoke-virtual {v14}, Lmb/h;->b()Ljava/lang/Double;

    move-result-object v14

    goto :goto_9

    :cond_7
    move-object v14, v15

    :goto_9
    invoke-static {v14}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-direct {v13, v0, v1, v2, v3}, LW7/c$a;-><init>(DD)V

    const/4 v0, 0x2

    invoke-direct {v9, v13, v15, v0, v15}, LW7/c;-><init>(LW7/c$a;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v13, v9

    goto :goto_a

    :cond_8
    move-object/from16 p1, v1

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move-object v13, v15

    :goto_a
    invoke-virtual {v6}, Lmb/l;->g()Lmb/h;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lmb/h;->c()Ljava/lang/String;

    move-result-object v0

    move-object v14, v0

    goto :goto_b

    :cond_9
    move-object v14, v15

    :goto_b
    invoke-virtual {v6}, Lmb/l;->l()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v6}, Lmb/l;->m()Z

    move-result v0

    if-nez v0, :cond_a

    const/4 v0, 0x1

    goto :goto_c

    :cond_a
    const/4 v0, 0x0

    :goto_c
    invoke-static {v4, v6}, Lcom/ui/wifiman/model/ubiquiti/cloud/a;->b(Lcom/ui/wifiman/model/ubiquiti/cloud/a;Lmb/l;)Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    move-result-object v20

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/console/e;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v19

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v21, 0x0

    move-object v8, v1

    move-object v9, v7

    move-object v2, v15

    move-object v15, v0

    invoke-direct/range {v8 .. v23}, Lcom/ui/wifiman/model/ubiquiti/console/e;-><init>(Ljava/lang/String;Lh9/a;Lcom/ui/common/semver/SemVer;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/Boolean;Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;Lcom/ui/wifiman/model/ubiquiti/console/e$a$c;Lcom/ui/wifiman/model/ubiquiti/console/e$a$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v24

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Lmb/l;->j()Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_c

    invoke-static {v15}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_d

    :cond_b
    move-object v15, v2

    :goto_d
    if-eqz v15, :cond_c

    invoke-static {v7}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->a(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    move-result-object v1

    move-object/from16 v2, v25

    invoke-interface {v2, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    :cond_c
    move-object/from16 v2, v25

    :goto_e
    move-object/from16 v1, p1

    move-object v3, v2

    move-object v2, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_d
    move-object v0, v2

    move-object v2, v3

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$a;

    invoke-direct {v1, v0, v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$a;-><init>(Ljava/util/List;Ljava/util/Map;)V

    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/a$b$a;->a(Ljava/util/List;)Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$a;

    move-result-object p1

    return-object p1
.end method
