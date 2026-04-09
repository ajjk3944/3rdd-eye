.class final LO1/l$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO1/l;-><init>(Lmh/a;LO1/j;Ljava/util/List;LO1/a;LIi/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LO1/l;


# direct methods
.method constructor <init>(LO1/l;)V
    .locals 0

    iput-object p1, p0, LO1/l$d;->a:LO1/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LO1/l$d;->a:LO1/l;

    invoke-static {v0}, LO1/l;->f(LO1/l;)LLi/z;

    move-result-object v0

    new-instance v1, LO1/g;

    invoke-direct {v1, p1}, LO1/g;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    :goto_0
    sget-object p1, LO1/l;->k:LO1/l$a;

    invoke-virtual {p1}, LO1/l$a;->b()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LO1/l$d;->a:LO1/l;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, LO1/l$a;->a()Ljava/util/Set;

    move-result-object p1

    invoke-static {v1}, LO1/l;->g(LO1/l;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LO1/l$d;->a(Ljava/lang/Throwable;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
