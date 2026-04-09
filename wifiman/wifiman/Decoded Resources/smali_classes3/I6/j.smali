.class public abstract LI6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM6/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final N0(LO6/i;)Lgg/s;
    .locals 1

    new-instance v0, LI6/j$a;

    invoke-direct {v0, p0, p1}, LI6/j$a;-><init>(LI6/j;LO6/i;)V

    invoke-static {v0}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public S()LI6/i;
    .locals 1

    sget-object v0, LI6/i;->c:LI6/i;

    return-object v0
.end method

.method public a(LM6/j;)I
    .locals 1

    invoke-interface {p1}, LM6/j;->S()LI6/i;

    move-result-object p1

    iget p1, p1, LI6/i;->a:I

    invoke-virtual {p0}, LI6/j;->S()LI6/i;

    move-result-object v0

    iget v0, v0, LI6/i;->a:I

    sub-int/2addr p1, v0

    return p1
.end method

.method protected abstract b(Lgg/t;LO6/i;)V
.end method

.method protected abstract c(Landroid/os/DeadObjectException;)Lcom/polidea/rxandroidble3/exceptions/BleException;
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LM6/j;

    invoke-virtual {p0, p1}, LI6/j;->a(LM6/j;)I

    move-result p1

    return p1
.end method
