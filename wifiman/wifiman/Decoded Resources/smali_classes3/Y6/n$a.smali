.class LY6/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lej/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY6/n;->t0()Lej/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LY6/n;


# direct methods
.method constructor <init>(LY6/n;)V
    .locals 0

    iput-object p1, p0, LY6/n$a;->a:LY6/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public Z(Lej/e;J)V
    .locals 1

    iget-object v0, p0, LY6/n$a;->a:LY6/n;

    invoke-static {v0}, LY6/n;->u0(LY6/n;)Lej/f;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lej/B;->Z(Lej/e;J)V

    return-void
.end method

.method public c()Lej/E;
    .locals 1

    sget-object v0, Lej/E;->f:Lej/E;

    return-object v0
.end method

.method public close()V
    .locals 3

    iget-object v0, p0, LY6/n$a;->a:LY6/n;

    invoke-virtual {v0}, LY6/o;->T()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LY6/n$a;->a:LY6/n;

    iget v1, v0, LY6/o;->a:I

    add-int/lit8 v2, v1, -0x1

    iput v2, v0, LY6/o;->a:I

    iget-object v0, v0, LY6/o;->d:[I

    add-int/lit8 v1, v1, -0x2

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return-void

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, LY6/n$a;->a:LY6/n;

    invoke-static {v0}, LY6/n;->u0(LY6/n;)Lej/f;

    move-result-object v0

    invoke-interface {v0}, Lej/f;->flush()V

    return-void
.end method
