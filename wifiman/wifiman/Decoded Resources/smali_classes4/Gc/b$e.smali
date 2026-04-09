.class final LGc/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGc/b;-><init>(Led/a;Lcom/ui/wifiman/model/vendor/d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LGc/b$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LGc/b$e;

    invoke-direct {v0}, LGc/b$e;-><init>()V

    sput-object v0, LGc/b$e;->a:LGc/b$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/Set;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "map"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "results"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    const-wide/16 v2, 0x1770

    add-long v13, v11, v2

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LGc/b$a;

    invoke-virtual {v2}, LGc/b$a;->b()Lh9/a;

    move-result-object v15

    new-instance v9, LGc/a$a;

    invoke-virtual {v2}, LGc/b$a;->a()Linet/ipaddr/g;

    move-result-object v4

    invoke-virtual {v2}, LGc/b$a;->b()Lh9/a;

    move-result-object v5

    invoke-virtual {v2}, LGc/b$a;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v6

    move-object v3, v9

    move-wide v7, v11

    move-object v2, v9

    move-wide v9, v13

    invoke-direct/range {v3 .. v10}, LGc/a$a;-><init>(Linet/ipaddr/g;Lh9/a;Lcom/ui/wifiman/model/vendor/d;JJ)V

    invoke-interface {v0, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    check-cast p2, Ljava/util/Set;

    invoke-virtual {p0, p1, p2}, LGc/b$e;->a(Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/Set;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    return-object p1
.end method
