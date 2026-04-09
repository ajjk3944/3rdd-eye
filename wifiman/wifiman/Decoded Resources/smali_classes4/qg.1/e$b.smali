.class final Lqg/e$b;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:Lqg/e$a;

.field final b:I

.field final c:I

.field final d:I

.field e:I


# direct methods
.method constructor <init>(Lqg/e$a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/e$b;->a:Lqg/e$a;

    iput p2, p0, Lqg/e$b;->b:I

    iput p3, p0, Lqg/e$b;->c:I

    shr-int/lit8 p1, p3, 0x2

    sub-int/2addr p3, p1

    iput p3, p0, Lqg/e$b;->d:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lqg/e$b;->a:Lqg/e$a;

    iget v1, p0, Lqg/e$b;->b:I

    invoke-virtual {v0, v1}, Lqg/e$a;->p(I)V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-static {p0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public d()V
    .locals 4

    iget v0, p0, Lqg/e$b;->e:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lqg/e$b;->d:I

    if-ne v0, v1, :cond_0

    const/4 v1, 0x0

    iput v1, p0, Lqg/e$b;->e:I

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDj/c;

    int-to-long v2, v0

    invoke-interface {v1, v2, v3}, LDj/c;->request(J)V

    goto :goto_0

    :cond_0
    iput v0, p0, Lqg/e$b;->e:I

    :goto_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lqg/e$b;->a:Lqg/e$a;

    iget v1, p0, Lqg/e$b;->b:I

    invoke-virtual {v0, v1, p1}, Lqg/e$a;->s(ILjava/lang/Object;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    iget v0, p0, Lqg/e$b;->c:I

    int-to-long v0, v0

    invoke-static {p0, p1, v0, v1}, Lyg/g;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;LDj/c;J)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lqg/e$b;->a:Lqg/e$a;

    iget v1, p0, Lqg/e$b;->b:I

    invoke-virtual {v0, v1, p1}, Lqg/e$a;->r(ILjava/lang/Throwable;)V

    return-void
.end method
