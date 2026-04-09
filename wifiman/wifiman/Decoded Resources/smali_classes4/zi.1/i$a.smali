.class public final Lzi/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzi/i;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:Ljava/lang/Object;

.field private b:I

.field final synthetic c:Lzi/i;


# direct methods
.method constructor <init>(Lzi/i;)V
    .locals 0

    iput-object p1, p0, Lzi/i$a;->c:Lzi/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x2

    iput p1, p0, Lzi/i$a;->b:I

    return-void
.end method

.method private final d()V
    .locals 2

    iget v0, p0, Lzi/i$a;->b:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lzi/i$a;->c:Lzi/i;

    invoke-static {v0}, Lzi/i;->c(Lzi/i;)Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lzi/i$a;->c:Lzi/i;

    invoke-static {v0}, Lzi/i;->d(Lzi/i;)Lmh/l;

    move-result-object v0

    iget-object v1, p0, Lzi/i$a;->a:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lzi/i$a;->a:Ljava/lang/Object;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    :goto_1
    iput v0, p0, Lzi/i$a;->b:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    iget v0, p0, Lzi/i$a;->b:I

    if-gez v0, :cond_0

    invoke-direct {p0}, Lzi/i$a;->d()V

    :cond_0
    iget v0, p0, Lzi/i$a;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lzi/i$a;->b:I

    if-gez v0, :cond_0

    invoke-direct {p0}, Lzi/i$a;->d()V

    :cond_0
    iget v0, p0, Lzi/i$a;->b:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzi/i$a;->a:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, -0x1

    iput v1, p0, Lzi/i$a;->b:I

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
