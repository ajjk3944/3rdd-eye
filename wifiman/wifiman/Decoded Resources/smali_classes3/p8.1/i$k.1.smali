.class final Lp8/i$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lp8/i;


# direct methods
.method constructor <init>(Lp8/i;)V
    .locals 0

    iput-object p1, p0, Lp8/i$k;->a:Lp8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lp8/i$b;)LEe/g;
    .locals 7

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lp8/i$b$a;

    if-nez v0, :cond_2

    instance-of v0, p1, Lp8/i$b$b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lp8/i$b$c;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lp8/i$k;->a:Lp8/i;

    move-object v2, p1

    check-cast v2, Lp8/i$b$c;

    invoke-virtual {v2}, Lp8/i$b$c;->d()LLe/c;

    move-result-object v3

    invoke-virtual {v2}, Lp8/i$b$c;->e()Z

    move-result v4

    invoke-virtual {v2}, Lp8/i$b$c;->c()Ljava/util/Comparator;

    move-result-object v5

    invoke-virtual {v2}, Lp8/i$b$c;->a()Lmh/l;

    move-result-object v6

    invoke-static/range {v1 .. v6}, Lp8/i;->B0(Lp8/i;Lp8/i$b$c;LLe/c;ZLjava/util/Comparator;Lmh/l;)LEe/g;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    new-instance p1, LEe/g;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, LEe/g;-><init>(Ljava/util/List;)V

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp8/i$b;

    invoke-virtual {p0, p1}, Lp8/i$k;->a(Lp8/i$b;)LEe/g;

    move-result-object p1

    return-object p1
.end method
