.class final Lz8/c$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz8/c;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz8/c$i$a;
    }
.end annotation


# static fields
.field public static final a:Lz8/c$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz8/c$i;

    invoke-direct {v0}, Lz8/c$i;-><init>()V

    sput-object v0, Lz8/c$i;->a:Lz8/c$i;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz8/c$a;)LEe/g;
    .locals 13

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lz8/c$a;->a()LS8/c;

    move-result-object v0

    invoke-virtual {p1}, Lz8/c$a;->b()LTe/e0;

    move-result-object v1

    invoke-virtual {p1}, Lz8/c$a;->c()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lz8/c$a;->d()Ljava/util/List;

    move-result-object p1

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v3

    if-eqz v1, :cond_0

    new-instance v11, LEe/g$a$a;

    new-instance v4, LTe/k0$a;

    invoke-direct {v4, v1}, LTe/k0$a;-><init>(LTe/e0;)V

    invoke-static {v4}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v9, 0x6

    const/4 v10, 0x0

    const-string/jumbo v5, "connected"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, v11

    invoke-direct/range {v4 .. v10}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    const/16 v5, 0xa

    if-nez v4, :cond_2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v2, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LTe/e0;

    new-instance v2, LTe/k0$a;

    invoke-direct {v2, v1}, LTe/k0$a;-><init>(LTe/e0;)V

    invoke-interface {v10, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, LEe/g$a$a;

    const-string/jumbo v7, "ap"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v6, v0

    invoke-direct/range {v6 .. v12}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    if-nez v1, :cond_8

    new-instance v1, LEe/g$a$b;

    new-instance v2, LTe/k0$b;

    const/4 v4, -0x1

    if-nez v0, :cond_3

    move v0, v4

    goto :goto_1

    :cond_3
    sget-object v6, Lz8/c$i$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v6, v0

    :goto_1
    const v6, 0x7f110245

    if-eq v0, v4, :cond_7

    const/4 v4, 0x1

    if-eq v0, v4, :cond_6

    const/4 v4, 0x2

    if-eq v0, v4, :cond_5

    const/4 v4, 0x3

    if-ne v0, v4, :cond_4

    new-instance v0, Ls9/d$b;

    invoke-direct {v0, v6}, Ls9/d$b;-><init>(I)V

    goto :goto_2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    new-instance v0, Ls9/d$b;

    const v4, 0x7f110247

    invoke-direct {v0, v4}, Ls9/d$b;-><init>(I)V

    goto :goto_2

    :cond_6
    new-instance v0, Ls9/d$b;

    const v4, 0x7f110246

    invoke-direct {v0, v4}, Ls9/d$b;-><init>(I)V

    goto :goto_2

    :cond_7
    new-instance v0, Ls9/d$b;

    invoke-direct {v0, v6}, Ls9/d$b;-><init>(I)V

    :goto_2
    invoke-direct {v2, v0}, LTe/k0$b;-><init>(Ls9/d;)V

    invoke-direct {v1, v2}, LEe/g$a$b;-><init>(LEe/g$b;)V

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    :goto_3
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    new-instance v8, Ls9/d$b;

    const v0, 0x7f110243

    invoke-direct {v8, v0}, Ls9/d$b;-><init>(I)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {p1, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTe/e0;

    new-instance v1, LTe/k0$a;

    invoke-direct {v1, v0}, LTe/k0$a;-><init>(LTe/e0;)V

    invoke-interface {v10, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    new-instance p1, LEe/g$a$a;

    const-string/jumbo v7, "apOtherBand"

    const/4 v9, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v6, p1

    invoke-direct/range {v6 .. v12}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-static {v3}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    new-instance v0, LEe/g;

    invoke-direct {v0, p1}, LEe/g;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz8/c$a;

    invoke-virtual {p0, p1}, Lz8/c$i;->a(Lz8/c$a;)LEe/g;

    move-result-object p1

    return-object p1
.end method
