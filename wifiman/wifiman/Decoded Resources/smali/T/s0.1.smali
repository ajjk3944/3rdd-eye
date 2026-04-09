.class public final LT/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/f;


# instance fields
.field private final a:LT/f;

.field private final b:I

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LT/f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/s0;->a:LT/f;

    iput p2, p0, LT/s0;->b:I

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 2

    iget-object v0, p0, LT/s0;->a:LT/f;

    iget v1, p0, LT/s0;->c:I

    if-nez v1, :cond_0

    iget v1, p0, LT/s0;->b:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr p1, v1

    invoke-interface {v0, p1, p2}, LT/f;->a(II)V

    return-void
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LT/s0;->a:LT/f;

    invoke-interface {v0}, LT/f;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public c(ILjava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LT/s0;->a:LT/f;

    iget v1, p0, LT/s0;->c:I

    if-nez v1, :cond_0

    iget v1, p0, LT/s0;->b:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr p1, v1

    invoke-interface {v0, p1, p2}, LT/f;->c(ILjava/lang/Object;)V

    return-void
.end method

.method public clear()V
    .locals 1

    const-string v0, "Clear is not valid on OffsetApplier"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, LT/s0;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LT/s0;->c:I

    iget-object v0, p0, LT/s0;->a:LT/f;

    invoke-interface {v0, p1}, LT/f;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public f(III)V
    .locals 2

    iget v0, p0, LT/s0;->c:I

    if-nez v0, :cond_0

    iget v0, p0, LT/s0;->b:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LT/s0;->a:LT/f;

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-interface {v1, p1, p2, p3}, LT/f;->f(III)V

    return-void
.end method

.method public g()V
    .locals 1

    iget v0, p0, LT/s0;->c:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "OffsetApplier up called with no corresponding down"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_1
    iget v0, p0, LT/s0;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LT/s0;->c:I

    iget-object v0, p0, LT/s0;->a:LT/f;

    invoke-interface {v0}, LT/f;->g()V

    return-void
.end method

.method public h(ILjava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LT/s0;->a:LT/f;

    iget v1, p0, LT/s0;->c:I

    if-nez v1, :cond_0

    iget v1, p0, LT/s0;->b:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr p1, v1

    invoke-interface {v0, p1, p2}, LT/f;->h(ILjava/lang/Object;)V

    return-void
.end method
