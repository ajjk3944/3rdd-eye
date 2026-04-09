.class final LD8/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/g;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LD8/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD8/g$a;

    invoke-direct {v0}, LD8/g$a;-><init>()V

    sput-object v0, LD8/g$a;->a:LD8/g$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ll9/a;)Laf/B;
    .locals 17

    move-object/from16 v0, p1

    const-string/jumbo v1, "hosts"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "<destruct>"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljd/a$b;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/network/hosts/NetworkHost;

    instance-of v4, v3, Lcom/ui/wifiman/model/network/hosts/NetworkHost$b;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_5

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljd/a$b;->b()LCc/a;

    move-result-object v4

    if-eqz v4, :cond_1

    sget-object v8, Lcom/ubnt/usurvey/product/m$c;->SMALL:Lcom/ubnt/usurvey/product/m$c;

    sget-object v9, LPe/a;->a:LPe/a;

    invoke-virtual {v9}, LPe/a;->o()Ls9/b;

    move-result-object v9

    invoke-static {v4, v8, v9}, Ln8/m;->e(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object v4

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    move-object v10, v4

    goto :goto_3

    :cond_1
    :goto_2
    sget-object v4, LPe/a;->a:LPe/a;

    invoke-virtual {v4}, LPe/a;->o()Ls9/b;

    move-result-object v4

    goto :goto_1

    :goto_3
    new-instance v11, Ls9/d$b;

    const v4, 0x7f1101fb

    invoke-direct {v11, v4}, Ls9/d$b;-><init>(I)V

    check-cast v3, Lcom/ui/wifiman/model/network/hosts/NetworkHost$b;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$b;->b()Ldd/i;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ldd/i;->d()Lb8/b;

    move-result-object v4

    move-object v13, v4

    goto :goto_4

    :cond_2
    move-object v13, v7

    :goto_4
    invoke-virtual {v3}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$b;->b()Ldd/i;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ldd/i;->f()Ljava/lang/Boolean;

    move-result-object v7

    :cond_3
    if-eqz v7, :cond_4

    move v12, v6

    goto :goto_5

    :cond_4
    move v12, v5

    :goto_5
    new-instance v3, Laf/A;

    const-string/jumbo v9, "gateway"

    move-object v8, v3

    invoke-direct/range {v8 .. v13}, Laf/A;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;ZLb8/b;)V

    goto :goto_8

    :cond_5
    instance-of v4, v3, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;

    if-eqz v4, :cond_9

    check-cast v3, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->a()Ljava/lang/String;

    move-result-object v9

    sget-object v4, LL8/e;->a:LL8/e;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, LL8/e;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v11

    if-eqz v11, :cond_6

    new-instance v4, Ls9/c$b;

    sget-object v8, LN9/b;->a:LN9/b;

    invoke-virtual {v8}, LN9/b;->B()Ls9/b;

    move-result-object v12

    const/16 v15, 0xc

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v10, v4

    invoke-direct/range {v10 .. v16}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_6
    sget-object v4, LN9/b;->a:LN9/b;

    invoke-virtual {v4}, LN9/b;->B()Ls9/b;

    move-result-object v4

    move-object v10, v4

    :goto_6
    new-instance v11, Ls9/d$c;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v11, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v3}, LD8/b;->a(Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;)Lb8/b;

    move-result-object v13

    invoke-virtual {v3}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->c()Ldd/i;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ldd/i;->f()Ljava/lang/Boolean;

    move-result-object v7

    :cond_7
    if-eqz v7, :cond_8

    move v12, v6

    goto :goto_7

    :cond_8
    move v12, v5

    :goto_7
    new-instance v3, Laf/A;

    move-object v8, v3

    invoke-direct/range {v8 .. v13}, Laf/A;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;ZLb8/b;)V

    :goto_8
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_a
    new-instance v0, Laf/B$a;

    invoke-direct {v0, v2}, Laf/B$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, LD8/g$a;->a(Ljava/util/List;Ll9/a;)Laf/B;

    move-result-object p1

    return-object p1
.end method
