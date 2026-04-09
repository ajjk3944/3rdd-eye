.class final Lcom/ui/wifiman/model/teleport/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/i;-><init>(Lcom/ui/wifiman/model/teleport/session/TeleportSession;LFd/D;Lcom/ui/wifiman/model/teleport/k;LLd/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/i$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/i$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/i$a;->a:Lcom/ui/wifiman/model/teleport/i$a;

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

    check-cast p1, Ll9/a;

    check-cast p2, Ljava/util/List;

    check-cast p3, Ljava/util/List;

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/model/teleport/i$a;->b(Ll9/a;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 17

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "<destruct>"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "tunnelStatuses"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "cloudConsoles"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->n()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    check-cast v0, Ljava/lang/Iterable;

    const/16 v5, 0xa

    invoke-static {v0, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-static {v6}, LZg/U;->d(I)I

    move-result v6

    const/16 v7, 0x10

    invoke-static {v6, v7}, Lsh/m;->d(II)I

    move-result v6

    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lcom/ui/wifiman/model/teleport/n$a;

    invoke-virtual {v9}, Lcom/ui/wifiman/model/teleport/n$a;->b()LKd/a;

    move-result-object v10

    invoke-virtual {v10}, LKd/a;->c()LKd/a$a;

    move-result-object v10

    invoke-virtual {v10}, LKd/a$a;->b()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->a(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v9}, Lcom/ui/wifiman/model/teleport/n$a;->b()LKd/a;

    move-result-object v9

    invoke-virtual {v9}, LKd/a;->c()LKd/a$a;

    move-result-object v9

    invoke-virtual {v9}, LKd/a$a;->b()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->a(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    move-result-object v9

    invoke-interface {v8, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    invoke-static {v1, v7}, Lsh/m;->d(II)I

    move-result v1

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/ui/wifiman/model/ubiquiti/console/e;

    invoke-virtual {v6}, Lcom/ui/wifiman/model/ubiquiti/console/e;->f()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->a(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Lcom/ui/wifiman/model/ubiquiti/console/e;->f()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->a(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    move-result-object v6

    invoke-interface {v5, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    new-instance v0, Lcom/ui/wifiman/model/teleport/i$a$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/i$a$a;-><init>()V

    invoke-static {v4, v0}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->n()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->a(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->a(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    move-result-object v6

    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v4, :cond_9

    if-nez v2, :cond_4

    :goto_4
    move v11, v7

    goto :goto_5

    :cond_4
    invoke-static {v2, v10}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    goto :goto_4

    :goto_5
    move-object v12, v4

    check-cast v12, Lcom/ui/wifiman/model/ubiquiti/console/e;

    check-cast v6, Lcom/ui/wifiman/model/teleport/n$a;

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lcom/ui/wifiman/model/teleport/n$a;->b()LKd/a;

    move-result-object v4

    move-object v13, v4

    goto :goto_6

    :cond_5
    move-object v13, v3

    :goto_6
    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/ui/wifiman/model/teleport/n$a;->a()LFd/B;

    move-result-object v4

    move-object v15, v4

    goto :goto_7

    :cond_6
    move-object v15, v3

    :goto_7
    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lcom/ui/wifiman/model/teleport/n$a;->c()Lcom/ui/wifiman/model/teleport/n$b;

    move-result-object v4

    if-nez v4, :cond_7

    goto :goto_9

    :cond_7
    :goto_8
    move-object v14, v4

    goto :goto_a

    :cond_8
    :goto_9
    sget-object v4, Lcom/ui/wifiman/model/teleport/n$b$b;->a:Lcom/ui/wifiman/model/teleport/n$b$b;

    goto :goto_8

    :goto_a
    new-instance v4, Lcom/ui/wifiman/model/teleport/h$a;

    const/16 v16, 0x0

    move-object v9, v4

    invoke-direct/range {v9 .. v16}, Lcom/ui/wifiman/model/teleport/h$a;-><init>(Ljava/lang/String;ZLcom/ui/wifiman/model/ubiquiti/console/e;LKd/a;Lcom/ui/wifiman/model/teleport/n$b;LFd/B;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_d

    :cond_9
    if-eqz v6, :cond_d

    check-cast v6, Lcom/ui/wifiman/model/teleport/n$a;

    invoke-virtual {v6}, Lcom/ui/wifiman/model/teleport/n$a;->b()LKd/a;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-virtual {v4}, LKd/a;->d()LKd/a$b;

    move-result-object v4

    goto :goto_b

    :cond_a
    move-object v4, v3

    :goto_b
    sget-object v9, LKd/a$b;->INVITATION_LINK:LKd/a$b;

    if-ne v4, v9, :cond_d

    if-nez v2, :cond_b

    move v11, v7

    goto :goto_c

    :cond_b
    invoke-static {v2, v10}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    move v11, v4

    :goto_c
    invoke-virtual {v6}, Lcom/ui/wifiman/model/teleport/n$a;->b()LKd/a;

    move-result-object v13

    invoke-virtual {v6}, Lcom/ui/wifiman/model/teleport/n$a;->a()LFd/B;

    move-result-object v15

    invoke-virtual {v6}, Lcom/ui/wifiman/model/teleport/n$a;->c()Lcom/ui/wifiman/model/teleport/n$b;

    move-result-object v4

    if-nez v4, :cond_c

    sget-object v4, Lcom/ui/wifiman/model/teleport/n$b$b;->a:Lcom/ui/wifiman/model/teleport/n$b$b;

    :cond_c
    move-object v14, v4

    new-instance v4, Lcom/ui/wifiman/model/teleport/h$c;

    const/4 v12, 0x0

    const/16 v16, 0x0

    move-object v9, v4

    invoke-direct/range {v9 .. v16}, Lcom/ui/wifiman/model/teleport/h$c;-><init>(Ljava/lang/String;ZLcom/ui/wifiman/model/ubiquiti/console/e;LKd/a;Lcom/ui/wifiman/model/teleport/n$b;LFd/B;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_d

    :cond_d
    move-object v4, v3

    :goto_d
    if-eqz v4, :cond_3

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_e
    return-object v1
.end method
