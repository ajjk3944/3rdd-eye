.class final LM8/d$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/d$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/d$i;

    invoke-direct {v0}, LM8/d$i;-><init>()V

    sput-object v0, LM8/d$i;->a:LM8/d$i;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/ui/wifi/channel/b;)Ljava/util/Map;
    .locals 5

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/wifi/channel/b;->a()LS8/e;

    move-result-object v0

    invoke-virtual {v0}, LS8/e;->a()LS8/c;

    move-result-object v0

    invoke-virtual {v0}, LS8/c;->getChannels()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LS8/e;

    invoke-virtual {v3}, LS8/e;->d()I

    move-result v3

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/wifi/channel/b;->a()LS8/e;

    move-result-object v4

    invoke-virtual {v4}, LS8/e;->d()I

    move-result v4

    if-ne v3, v4, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/16 p1, 0xa

    invoke-static {v1, p1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-static {p1}, LZg/U;->d(I)I

    move-result p1

    const/16 v0, 0x10

    invoke-static {p1, v0}, Lsh/m;->d(II)I

    move-result p1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LS8/e;

    invoke-virtual {v2}, LS8/e;->b()LS8/d;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/ui/wifi/channel/b;

    invoke-virtual {p0, p1}, LM8/d$i;->a(Lcom/ui/wifiman/ui/wifi/channel/b;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
