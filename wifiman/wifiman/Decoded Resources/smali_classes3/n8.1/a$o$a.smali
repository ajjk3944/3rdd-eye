.class final Ln8/a$o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a$o;->a(LYg/s;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ln8/a$o$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/a$o$a;

    invoke-direct {v0}, Ln8/a$o$a;-><init>()V

    sput-object v0, Ln8/a$o$a;->a:Ln8/a$o$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LKe/m;Ljava/util/List;)Ljava/util/List;
    .locals 7

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "openPorts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v1, p2

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LKe/l;

    new-instance v3, LKe/a$e;

    invoke-virtual {v2}, LKe/l;->c()Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "portScanItem:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v2}, LKe/a$e;-><init>(Ljava/lang/String;LKe/l;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v1, p1, LKe/m$b;

    if-nez v1, :cond_3

    instance-of v1, p1, LKe/m$c;

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    instance-of p1, p1, LKe/m$a;

    if-eqz p1, :cond_2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, LKe/a$e;

    new-instance p2, LKe/l;

    new-instance v1, Ls9/d$b;

    const v2, 0x7f11020e

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    const/4 v2, 0x0

    invoke-direct {p2, v2, v1, v2}, LKe/l;-><init>(Ljava/lang/Integer;Ls9/d;Ljava/lang/String;)V

    const-string/jumbo v1, "portScanItem:empty"

    invoke-direct {p1, v1, p2}, LKe/a$e;-><init>(Ljava/lang/String;LKe/l;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_1
    sget-object p1, LKe/a$d;->a:LKe/a$d;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_2
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKe/m;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Ln8/a$o$a;->a(LKe/m;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
