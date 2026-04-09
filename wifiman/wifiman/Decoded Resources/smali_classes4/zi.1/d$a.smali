.class public final Lzi/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzi/d;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/util/Iterator;

.field private b:I


# direct methods
.method constructor <init>(Lzi/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lzi/d;->d(Lzi/d;)Lzi/j;

    move-result-object v0

    invoke-interface {v0}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lzi/d$a;->a:Ljava/util/Iterator;

    invoke-static {p1}, Lzi/d;->c(Lzi/d;)I

    move-result p1

    iput p1, p0, Lzi/d$a;->b:I

    return-void
.end method

.method private final d()V
    .locals 1

    :goto_0
    iget v0, p0, Lzi/d$a;->b:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lzi/d$a;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzi/d$a;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    iget v0, p0, Lzi/d$a;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lzi/d$a;->b:I

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    invoke-direct {p0}, Lzi/d$a;->d()V

    iget-object v0, p0, Lzi/d$a;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lzi/d$a;->d()V

    iget-object v0, p0, Lzi/d$a;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
