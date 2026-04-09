.class public final Lw/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:I


# instance fields
.field private final a:LV/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, LV/b;->d:I

    sput v0, Lw/c;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LV/b;

    const/16 v1, 0x10

    new-array v1, v1, [Lw/f$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, Lw/c;->a:LV/b;

    return-void
.end method

.method public static final synthetic a(Lw/c;)LV/b;
    .locals 0

    iget-object p0, p0, Lw/c;->a:LV/b;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)V
    .locals 6

    iget-object v0, p0, Lw/c;->a:LV/b;

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    new-array v2, v1, [LIi/n;

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_0

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v5

    aget-object v5, v5, v4

    check-cast v5, Lw/f$a;

    invoke-virtual {v5}, Lw/f$a;->a()LIi/n;

    move-result-object v5

    aput-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v0, v2, v3

    invoke-interface {v0, p1}, LIi/n;->cancel(Ljava/lang/Throwable;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lw/c;->a:LV/b;

    invoke-virtual {p1}, LV/b;->s()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "uncancelled requests present"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Lw/f$a;)Z
    .locals 8

    const/4 v0, 0x1

    invoke-virtual {p1}, Lw/f$a;->b()Lmh/a;

    move-result-object v1

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll0/i;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lw/f$a;->a()LIi/n;

    move-result-object p1

    sget-object v0, LYg/u;->b:LYg/u$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return v2

    :cond_0
    invoke-virtual {p1}, Lw/f$a;->a()LIi/n;

    move-result-object v3

    new-instance v4, Lw/c$a;

    invoke-direct {v4, p0, p1}, Lw/c$a;-><init>(Lw/c;Lw/f$a;)V

    invoke-interface {v3, v4}, LIi/n;->B(Lmh/l;)V

    iget-object v3, p0, Lw/c;->a:LV/b;

    new-instance v4, Lsh/i;

    invoke-virtual {v3}, LV/b;->o()I

    move-result v3

    sub-int/2addr v3, v0

    invoke-direct {v4, v2, v3}, Lsh/i;-><init>(II)V

    invoke-virtual {v4}, Lsh/g;->i()I

    move-result v3

    invoke-virtual {v4}, Lsh/g;->j()I

    move-result v4

    if-gt v3, v4, :cond_4

    :goto_0
    iget-object v5, p0, Lw/c;->a:LV/b;

    invoke-virtual {v5}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v5

    aget-object v5, v5, v4

    check-cast v5, Lw/f$a;

    invoke-virtual {v5}, Lw/f$a;->b()Lmh/a;

    move-result-object v5

    invoke-interface {v5}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll0/i;

    if-nez v5, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v1, v5}, Ll0/i;->t(Ll0/i;)Ll0/i;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v1, p0, Lw/c;->a:LV/b;

    add-int/2addr v4, v0

    invoke-virtual {v1, v4, p1}, LV/b;->a(ILjava/lang/Object;)V

    return v0

    :cond_2
    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    new-instance v5, Ljava/util/concurrent/CancellationException;

    const-string v6, "bringIntoView call interrupted by a newer, non-overlapping call"

    invoke-direct {v5, v6}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    iget-object v6, p0, Lw/c;->a:LV/b;

    invoke-virtual {v6}, LV/b;->o()I

    move-result v6

    sub-int/2addr v6, v0

    if-gt v6, v4, :cond_3

    :goto_1
    iget-object v7, p0, Lw/c;->a:LV/b;

    invoke-virtual {v7}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v7

    aget-object v7, v7, v4

    check-cast v7, Lw/f$a;

    invoke-virtual {v7}, Lw/f$a;->a()LIi/n;

    move-result-object v7

    invoke-interface {v7, v5}, LIi/n;->cancel(Ljava/lang/Throwable;)Z

    if-eq v6, v4, :cond_3

    add-int/2addr v6, v0

    goto :goto_1

    :cond_3
    :goto_2
    if-eq v4, v3, :cond_4

    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lw/c;->a:LV/b;

    invoke-virtual {v1, v2, p1}, LV/b;->a(ILjava/lang/Object;)V

    return v0
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lw/c;->a:LV/b;

    new-instance v1, Lsh/i;

    invoke-virtual {v0}, LV/b;->o()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lsh/i;-><init>(II)V

    invoke-virtual {v1}, Lsh/g;->i()I

    move-result v0

    invoke-virtual {v1}, Lsh/g;->j()I

    move-result v1

    if-gt v0, v1, :cond_0

    :goto_0
    iget-object v2, p0, Lw/c;->a:LV/b;

    invoke-virtual {v2}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v2

    aget-object v2, v2, v0

    check-cast v2, Lw/f$a;

    invoke-virtual {v2}, Lw/f$a;->a()LIi/n;

    move-result-object v2

    sget-object v3, LYg/J;->a:LYg/J;

    invoke-static {v3}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    if-eq v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lw/c;->a:LV/b;

    invoke-virtual {v0}, LV/b;->h()V

    return-void
.end method
