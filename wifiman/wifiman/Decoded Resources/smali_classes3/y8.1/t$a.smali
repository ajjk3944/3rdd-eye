.class final Ly8/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/t;-><init>(LZc/c;Lad/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/t;


# direct methods
.method constructor <init>(Ly8/t;)V
    .locals 0

    iput-object p1, p0, Ly8/t$a;->a:Ly8/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/J;)Ljava/util/List;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ly8/t$a;->a:Ly8/t;

    invoke-static {p1}, Ly8/t;->g(Ly8/t;)Ljava/util/LinkedList;

    move-result-object p1

    iget-object v0, p0, Ly8/t$a;->a:Ly8/t;

    monitor-enter p1

    :try_start_0
    invoke-static {v0}, Ly8/t;->g(Ly8/t;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-static {v0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, Ly8/t$a;->a(LYg/J;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
