.class final LLc/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLc/d;->g()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LLc/d$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LLc/d$d;

    invoke-direct {v0}, LLc/d$d;-><init>()V

    sput-object v0, LLc/d$d;->a:LLc/d$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls7/b;)Lgg/r;
    .locals 22

    move-object/from16 v0, p1

    const-string v1, "it"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ls7/b;->c()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr7/a;

    invoke-virtual {v3}, Lr7/a;->c()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ly7/d;

    if-eqz v5, :cond_1

    check-cast v3, Ly7/d;

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ly7/d;->b()Ljava/net/InetAddress;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v3}, Lee/b;->a(Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object v4

    :cond_2
    if-eqz v4, :cond_0

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v2}, LZg/v;->V0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    move-object v1, v8

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Linet/ipaddr/g;

    instance-of v3, v3, Linet/ipaddr/ipv4/b;

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_5
    move-object v2, v4

    :goto_2
    move-object v6, v2

    check-cast v6, Linet/ipaddr/g;

    const-class v1, Lt7/d;

    invoke-virtual {v0, v1}, Ls7/b;->d(Ljava/lang/Class;)Ls7/h;

    move-result-object v1

    check-cast v1, Lt7/d;

    if-eqz v1, :cond_6

    const-string v2, ""

    invoke-virtual {v1, v2}, Lt7/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    sget-object v2, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v2, v1}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v1

    move-object v7, v1

    goto :goto_3

    :cond_6
    move-object v7, v4

    :goto_3
    if-eqz v6, :cond_e

    if-eqz v7, :cond_e

    const-class v1, Lt7/g;

    invoke-virtual {v0, v1}, Ls7/b;->d(Ljava/lang/Class;)Ls7/h;

    move-result-object v1

    check-cast v1, Lt7/g;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lt7/g;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object v13, v1

    goto :goto_4

    :cond_7
    move-object v13, v4

    :goto_4
    new-instance v11, Lcom/ui/wifiman/model/vendor/d$c;

    sget-object v1, Lcom/ui/wifiman/model/vendor/d$d;->MIKROTIK:Lcom/ui/wifiman/model/vendor/d$d;

    invoke-direct {v11, v1}, Lcom/ui/wifiman/model/vendor/d$c;-><init>(Lcom/ui/wifiman/model/vendor/d$d;)V

    const-class v1, Ly7/j;

    invoke-virtual {v0, v1}, Ls7/b;->d(Ljava/lang/Class;)Ls7/h;

    move-result-object v1

    check-cast v1, Ly7/j;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ly7/j;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    move-object/from16 v18, v1

    goto :goto_5

    :cond_8
    move-object/from16 v18, v4

    :goto_5
    const-class v1, Ly7/f;

    invoke-virtual {v0, v1}, Ls7/b;->d(Ljava/lang/Class;)Ls7/h;

    move-result-object v1

    check-cast v1, Ly7/f;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Ly7/f;->a()Ljava/lang/String;

    move-result-object v1

    move-object v12, v1

    goto :goto_6

    :cond_9
    move-object v12, v4

    :goto_6
    const-class v1, Ly7/k;

    invoke-virtual {v0, v1}, Ls7/b;->d(Ljava/lang/Class;)Ls7/h;

    move-result-object v1

    check-cast v1, Ly7/k;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Ly7/k;->a()Ljava/lang/String;

    move-result-object v1

    move-object v14, v1

    goto :goto_7

    :cond_a
    move-object v14, v4

    :goto_7
    const-class v1, Ly7/h;

    invoke-virtual {v0, v1}, Ls7/b;->d(Ljava/lang/Class;)Ls7/h;

    move-result-object v1

    check-cast v1, Ly7/h;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ly7/h;->a()Ljava/lang/String;

    move-result-object v1

    move-object v15, v1

    goto :goto_8

    :cond_b
    move-object v15, v4

    :goto_8
    const-class v1, Ly7/i;

    invoke-virtual {v0, v1}, Ls7/b;->d(Ljava/lang/Class;)Ls7/h;

    move-result-object v1

    check-cast v1, Ly7/i;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ly7/i;->a()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v16, v1

    goto :goto_9

    :cond_c
    move-object/from16 v16, v4

    :goto_9
    const-class v1, Ly7/e;

    invoke-virtual {v0, v1}, Ls7/b;->d(Ljava/lang/Class;)Ls7/h;

    move-result-object v0

    check-cast v0, Ly7/e;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ly7/e;->a()Ljava/lang/String;

    move-result-object v4

    :cond_d
    move-object/from16 v17, v4

    sget-object v19, LCc/b$g$d;->b:LCc/b$g$d;

    const-wide/16 v0, 0x4e20

    add-long v20, v9, v0

    new-instance v0, LLc/a$a;

    move-object v5, v0

    invoke-direct/range {v5 .. v21}, LLc/a$a;-><init>(Linet/ipaddr/g;Lh9/a;Ljava/util/List;JLcom/ui/wifiman/model/vendor/d;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;LCc/b;J)V

    invoke-static {v0}, Lgg/n;->o(Ljava/lang/Object;)Lgg/n;

    move-result-object v0

    goto :goto_a

    :cond_e
    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object v0

    :goto_a
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls7/b;

    invoke-virtual {p0, p1}, LLc/d$d;->a(Ls7/b;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
