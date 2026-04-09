.class final Ln8/a$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/a;


# direct methods
.method constructor <init>(Ln8/a;)V
    .locals 0

    iput-object p1, p0, Ln8/a$t;->a:Ln8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ln8/a;Ljava/util/Map;Ljava/util/Map$Entry;)LKe/a$h;
    .locals 0

    invoke-static {p0, p1, p2}, Ln8/a$t;->c(Ln8/a;Ljava/util/Map;Ljava/util/Map$Entry;)LKe/a$h;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ln8/a;Ljava/util/Map;Ljava/util/Map$Entry;)LKe/a$h;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p0, p2, p1}, Ln8/a;->p(Ln8/a;Ljava/util/List;Ljava/util/Map;)LKe/a$h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/a;

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Ln8/a$t;->b(LCc/a;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(LCc/a;Ljava/util/Map;)Ljava/util/List;
    .locals 4

    const-string/jumbo v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "signalStats"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LCc/a;->m()Ljava/util/TreeSet;

    move-result-object p1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lle/i;

    invoke-virtual {v2}, Lle/i;->o()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LS8/i;->a(Ljava/lang/String;)LS8/i;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, LZg/U;->y(Ljava/util/Map;)Lzi/j;

    move-result-object p1

    new-instance v0, Ln8/a$t$a;

    invoke-direct {v0}, Ln8/a$t$a;-><init>()V

    invoke-static {p1, v0}, Lzi/m;->T(Lzi/j;Ljava/util/Comparator;)Lzi/j;

    move-result-object p1

    iget-object v0, p0, Ln8/a$t;->a:Ln8/a;

    new-instance v1, Ln8/d;

    invoke-direct {v1, v0, p2}, Ln8/d;-><init>(Ln8/a;Ljava/util/Map;)V

    invoke-static {p1, v1}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    invoke-static {p1}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
