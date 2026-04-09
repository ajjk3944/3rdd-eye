.class final Lre/q$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/q;-><init>(Lcom/ui/wmw/g;Lre/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lre/q$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/q$f;

    invoke-direct {v0}, Lre/q$f;-><init>()V

    sput-object v0, Lre/q$f;->a:Lre/q$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/HashMap;Lre/q$c;)Ljava/util/HashMap;
    .locals 2

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p1

    :try_start_0
    instance-of v0, p2, Lre/q$c$a;

    if-eqz v0, :cond_0

    check-cast p2, Lre/q$c$a;

    invoke-virtual {p2}, Lre/q$c$a;->a()Lre/a$a;

    move-result-object p2

    new-instance v0, Lre/q$a;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    invoke-direct {v0, v1}, Lre/q$a;-><init>(Ljava/util/LinkedList;)V

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p2, LYg/J;->a:LYg/J;

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    instance-of v0, p2, Lre/q$c$b;

    if-eqz v0, :cond_1

    check-cast p2, Lre/q$c$b;

    invoke-virtual {p2}, Lre/q$c$b;->a()Lre/a$a;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
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

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/HashMap;

    check-cast p2, Lre/q$c;

    invoke-virtual {p0, p1, p2}, Lre/q$f;->a(Ljava/util/HashMap;Lre/q$c;)Ljava/util/HashMap;

    move-result-object p1

    return-object p1
.end method
