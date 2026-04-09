.class final LF/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/H;


# instance fields
.field private final b:LR0/H;

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(LR0/H;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/x0;->b:LR0/H;

    iput p2, p0, LF/x0;->c:I

    iput p3, p0, LF/x0;->d:I

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2

    iget-object v0, p0, LF/x0;->b:LR0/H;

    invoke-interface {v0, p1}, LR0/H;->a(I)I

    move-result v0

    if-ltz p1, :cond_0

    iget v1, p0, LF/x0;->d:I

    if-gt p1, v1, :cond_0

    iget v1, p0, LF/x0;->c:I

    invoke-static {v0, v1, p1}, LF/y0;->b(III)V

    :cond_0
    return v0
.end method

.method public b(I)I
    .locals 2

    iget-object v0, p0, LF/x0;->b:LR0/H;

    invoke-interface {v0, p1}, LR0/H;->b(I)I

    move-result v0

    if-ltz p1, :cond_0

    iget v1, p0, LF/x0;->c:I

    if-gt p1, v1, :cond_0

    iget v1, p0, LF/x0;->d:I

    invoke-static {v0, v1, p1}, LF/y0;->a(III)V

    :cond_0
    return v0
.end method
