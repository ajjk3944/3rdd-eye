.class final LM8/d$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/d$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/d$f;

    invoke-direct {v0}, LM8/d$f;-><init>()V

    sput-object v0, LM8/d$f;->a:LM8/d$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LS8/e;Ljava/util/List;)Ljava/util/List;
    .locals 4

    const-string/jumbo v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "signals"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lle/i;

    invoke-virtual {v2}, Lle/i;->f()LS8/e;

    move-result-object v2

    invoke-virtual {v2}, LS8/e;->a()LS8/c;

    move-result-object v2

    invoke-virtual {p1}, LS8/e;->a()LS8/c;

    move-result-object v3

    if-ne v2, v3, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS8/e;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, LM8/d$f;->a(LS8/e;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
