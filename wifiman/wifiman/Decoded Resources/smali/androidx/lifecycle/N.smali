.class public abstract Landroidx/lifecycle/N;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ld2/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld2/f;

    invoke-direct {v0}, Ld2/f;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/N;->a:Ld2/f;

    return-void
.end method


# virtual methods
.method public final T(Ljava/lang/String;Ljava/lang/AutoCloseable;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "closeable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/N;->a:Ld2/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ld2/f;->d(Ljava/lang/String;Ljava/lang/AutoCloseable;)V

    :cond_0
    return-void
.end method

.method public final U()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/N;->a:Ld2/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld2/f;->e()V

    :cond_0
    invoke-virtual {p0}, Landroidx/lifecycle/N;->W()V

    return-void
.end method

.method public final V(Ljava/lang/String;)Ljava/lang/AutoCloseable;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/N;->a:Ld2/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ld2/f;->g(Ljava/lang/String;)Ljava/lang/AutoCloseable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method protected W()V
    .locals 0

    return-void
.end method
