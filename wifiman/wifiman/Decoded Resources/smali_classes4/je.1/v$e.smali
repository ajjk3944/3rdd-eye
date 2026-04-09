.class final Lje/v$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje/v;-><init>(Lje/B;Lle/g;Lbe/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lje/v$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lje/v$e;

    invoke-direct {v0}, Lje/v$e;-><init>()V

    sput-object v0, Lje/v$e;->a:Lje/v$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lle/i;)Lje/v$a;
    .locals 0

    invoke-static {p0}, Lje/v$e;->c(Lle/i;)Lje/v$a;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lle/i;)Lje/v$a;
    .locals 12

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lje/v$a;

    invoke-virtual {p0}, Lle/i;->l()LS8/a;

    move-result-object v1

    invoke-virtual {p0}, Lle/i;->p()LS8/j;

    move-result-object v2

    new-instance v11, Lje/q;

    invoke-virtual {p0}, Lle/i;->f()LS8/e;

    move-result-object v3

    invoke-virtual {v3}, LS8/e;->a()LS8/c;

    move-result-object v4

    invoke-virtual {p0}, Lle/i;->e()Lh9/a;

    move-result-object v5

    invoke-virtual {p0}, Lle/i;->f()LS8/e;

    move-result-object v3

    invoke-virtual {v3}, LS8/e;->d()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {p0}, Lle/i;->f()LS8/e;

    move-result-object v3

    invoke-virtual {v3}, LS8/e;->b()LS8/d;

    move-result-object v9

    invoke-virtual {p0}, Lle/i;->m()Lke/a;

    move-result-object v10

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Lje/q;-><init>(LS8/c;Lh9/a;LS8/l;LW7/b;Ljava/lang/Integer;LS8/d;Lke/a;)V

    invoke-direct {v0, v1, v2, v11}, Lje/v$a;-><init>(LS8/a;LS8/j;Lje/q;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lje/v$e;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;)Ljava/util/Map;
    .locals 3

    const-string v0, "signals"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p1

    new-instance v0, Lje/w;

    invoke-direct {v0}, Lje/w;-><init>()V

    invoke-static {p1, v0}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lje/v$a;

    invoke-virtual {v2}, Lje/v$a;->b()Lje/q;

    move-result-object v2

    invoke-virtual {v2}, Lje/q;->c()LS8/c;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method
