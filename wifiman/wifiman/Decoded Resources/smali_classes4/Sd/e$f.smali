.class final LSd/e$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/e;-><init>(LDc/e;LLd/f;LSd/a;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LSd/e$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSd/e$f;

    invoke-direct {v0}, LSd/e$f;-><init>()V

    sput-object v0, LSd/e$f;->a:LSd/e$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/Map;)Ll9/a;
    .locals 6

    const-string v0, "consoles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "devicesOnLan"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Linet/ipaddr/g;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDc/j;

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/ubiquiti/console/e;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/ubiquiti/console/e;->i()Lh9/a;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v0}, LDc/j;->k()Ljava/util/Set;

    move-result-object v4

    invoke-virtual {v3}, Lcom/ui/wifiman/model/ubiquiti/console/e;->i()Lh9/a;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance p1, Ll9/a;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/ubiquiti/console/e;->i()Lh9/a;

    move-result-object p2

    new-instance v0, LSd/d$b;

    invoke-direct {v0, v3, v1, p2}, LSd/d$b;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/e;Linet/ipaddr/g;Lh9/a;)V

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_2
    new-instance p1, Ll9/a;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, LSd/e$f;->a(Ljava/util/List;Ljava/util/Map;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
