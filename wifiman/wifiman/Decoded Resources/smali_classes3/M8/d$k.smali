.class final LM8/d$k;
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


# instance fields
.field final synthetic a:LM8/d;


# direct methods
.method constructor <init>(LM8/d;)V
    .locals 0

    iput-object p1, p0, LM8/d$k;->a:LM8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LS8/e;Lle/i;)Z
    .locals 0

    invoke-static {p0, p1}, LM8/d$k;->c(LS8/e;Lle/i;)Z

    move-result p0

    return p0
.end method

.method private static final c(LS8/e;Lle/i;)Z
    .locals 1

    const-string/jumbo v0, "signal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LS8/e;->d()I

    move-result p0

    invoke-virtual {p1}, Lle/i;->f()LS8/e;

    move-result-object p1

    invoke-virtual {p1}, LS8/e;->d()I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS8/e;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, LM8/d$k;->b(LS8/e;Ljava/util/List;)LBf/b;

    move-result-object p1

    return-object p1
.end method

.method public final b(LS8/e;Ljava/util/List;)LBf/b;
    .locals 3

    const-string/jumbo v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "signals"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM8/d$k;->a:LM8/d;

    invoke-virtual {p1}, LS8/e;->a()LS8/c;

    move-result-object v1

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p2

    new-instance v2, LM8/e;

    invoke-direct {v2, p1}, LM8/e;-><init>(LS8/e;)V

    invoke-virtual {v0, v1, p2, v2}, LM8/d;->J(LS8/c;Lzi/j;Lmh/l;)LBf/b;

    move-result-object p1

    return-object p1
.end method
