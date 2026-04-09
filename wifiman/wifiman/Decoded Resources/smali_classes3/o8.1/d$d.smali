.class final Lo8/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo8/d;-><init>(Lgd/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lo8/d$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo8/d$d;

    invoke-direct {v0}, Lo8/d$d;-><init>()V

    sput-object v0, Lo8/d$d;->a:Lo8/d$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ljava/util/List;
    .locals 6

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgd/g$b;

    if-nez p1, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    goto :goto_3

    :cond_0
    instance-of v0, p1, Lgd/g$b$a;

    if-nez v0, :cond_2

    instance-of v0, p1, Lgd/g$b$b;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {p1}, Lgd/g$b;->e()Ljava/util/TreeMap;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgd/a;

    invoke-virtual {v2}, Lgd/a;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2}, Lgd/a;->a()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    invoke-virtual {v2}, Lgd/a;->d()Ljava/lang/String;

    move-result-object v4

    :cond_3
    if-eqz v4, :cond_4

    new-instance v2, Ls9/d$c;

    invoke-direct {v2, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_4
    new-instance v2, Ls9/d$b;

    const v4, 0x7f110212

    invoke-direct {v2, v4}, Ls9/d$b;-><init>(I)V

    :goto_2
    invoke-virtual {p1}, Lgd/g$b;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v5, LKe/l;

    invoke-direct {v5, v3, v2, v4}, LKe/l;-><init>(Ljava/lang/Integer;Ls9/d;Ljava/lang/String;)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    move-object p1, v1

    :goto_3
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lo8/d$d;->a(Ll9/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
