.class public final Lui/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lui/o;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:Z

.field final synthetic b:Lui/o;


# direct methods
.method constructor <init>(Lui/o;)V
    .locals 0

    iput-object p1, p0, Lui/o$a;->b:Lui/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lui/o$a;->a:Z

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-boolean v0, p0, Lui/o$a;->a:Z

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lui/o$a;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lui/o$a;->a:Z

    iget-object v0, p0, Lui/o$a;->b:Lui/o;

    invoke-virtual {v0}, Lui/o;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
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
