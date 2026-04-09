.class final Ls8/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls8/b;->s0(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ls8/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls8/b$c;

    invoke-direct {v0}, Ls8/b$c;-><init>()V

    sput-object v0, Ls8/b$c;->a:Ls8/b$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ls8/b$a;LGe/g;)Z
    .locals 0

    invoke-static {p0, p1}, Ls8/b$c;->d(Ls8/b$a;LGe/g;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lmh/l;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Ls8/b$c;->e(Lmh/l;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final d(Ls8/b$a;LGe/g;)Z
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LGe/g;->getId()Ljava/lang/String;

    move-result-object p1

    check-cast p0, Ls8/b$a$b;

    invoke-virtual {p0}, Ls8/b$a$b;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final e(Lmh/l;Ljava/lang/Object;)Z
    .locals 0

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/ArrayList;

    check-cast p2, Ls8/b$a;

    invoke-virtual {p0, p1, p2}, Ls8/b$c;->c(Ljava/util/ArrayList;Ls8/b$a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/util/ArrayList;Ls8/b$a;)Ljava/util/ArrayList;
    .locals 1

    const-string/jumbo v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p1

    :try_start_0
    instance-of v0, p2, Ls8/b$a$a;

    if-eqz v0, :cond_0

    check-cast p2, Ls8/b$a$a;

    invoke-virtual {p2}, Ls8/b$a$a;->a()LGe/g;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    instance-of v0, p2, Ls8/b$a$b;

    if-eqz v0, :cond_1

    new-instance v0, Ls8/c;

    invoke-direct {v0, p2}, Ls8/c;-><init>(Ls8/b$a;)V

    new-instance p2, Ls8/d;

    invoke-direct {p2, v0}, Ls8/d;-><init>(Lmh/l;)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->removeIf(Ljava/util/function/Predicate;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p1

    return-object p1

    :cond_1
    :try_start_1
    new-instance p2, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p2}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit p1

    throw p2
.end method
