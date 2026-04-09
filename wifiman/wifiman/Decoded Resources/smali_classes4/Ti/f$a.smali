.class final LTi/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIi/n;
.implements LIi/a1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTi/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field public final a:LIi/p;

.field public final b:Ljava/lang/Object;

.field final synthetic c:LTi/f;


# direct methods
.method public constructor <init>(LTi/f;LIi/p;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LTi/f$a;->c:LTi/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LTi/f$a;->a:LIi/p;

    iput-object p3, p0, LTi/f$a;->b:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a(LTi/f;LTi/f$a;Ljava/lang/Throwable;LYg/J;Ldh/i;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LTi/f$a;->h(LTi/f;LTi/f$a;Ljava/lang/Throwable;LYg/J;Ldh/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LTi/f;LTi/f$a;Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LTi/f$a;->e(LTi/f;LTi/f$a;Ljava/lang/Throwable;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LTi/f;LTi/f$a;Ljava/lang/Throwable;)LYg/J;
    .locals 0

    iget-object p1, p1, LTi/f$a;->b:Ljava/lang/Object;

    invoke-virtual {p0, p1}, LTi/f;->d(Ljava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final h(LTi/f;LTi/f$a;Ljava/lang/Throwable;LYg/J;Ldh/i;)LYg/J;
    .locals 0

    invoke-static {}, LTi/f;->w()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    iget-object p3, p1, LTi/f$a;->b:Ljava/lang/Object;

    invoke-virtual {p2, p0, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p1, LTi/f$a;->b:Ljava/lang/Object;

    invoke-virtual {p0, p1}, LTi/f;->d(Ljava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public B(Lmh/l;)V
    .locals 1

    iget-object v0, p0, LTi/f$a;->a:LIi/p;

    invoke-virtual {v0, p1}, LIi/p;->B(Lmh/l;)V

    return-void
.end method

.method public C0(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LTi/f$a;->a:LIi/p;

    invoke-virtual {v0, p1}, LIi/p;->C0(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic J(LIi/J;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LYg/J;

    invoke-virtual {p0, p1, p2}, LTi/f$a;->f(LIi/J;LYg/J;)V

    return-void
.end method

.method public b(LNi/z;I)V
    .locals 1

    iget-object v0, p0, LTi/f$a;->a:LIi/p;

    invoke-virtual {v0, p1, p2}, LIi/p;->b(LNi/z;I)V

    return-void
.end method

.method public bridge synthetic b0(Ljava/lang/Object;Lmh/q;)V
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1, p2}, LTi/f$a;->d(LYg/J;Lmh/q;)V

    return-void
.end method

.method public cancel(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, LTi/f$a;->a:LIi/p;

    invoke-virtual {v0, p1}, LIi/p;->cancel(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public d(LYg/J;Lmh/q;)V
    .locals 2

    invoke-static {}, LTi/f;->w()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    iget-object v0, p0, LTi/f$a;->c:LTi/f;

    iget-object v1, p0, LTi/f$a;->b:Ljava/lang/Object;

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p0, LTi/f$a;->a:LIi/p;

    iget-object v0, p0, LTi/f$a;->c:LTi/f;

    new-instance v1, LTi/e;

    invoke-direct {v1, v0, p0}, LTi/e;-><init>(LTi/f;LTi/f$a;)V

    invoke-virtual {p2, p1, v1}, LIi/p;->M(Ljava/lang/Object;Lmh/l;)V

    return-void
.end method

.method public f(LIi/J;LYg/J;)V
    .locals 1

    iget-object v0, p0, LTi/f$a;->a:LIi/p;

    invoke-virtual {v0, p1, p2}, LIi/p;->J(LIi/J;Ljava/lang/Object;)V

    return-void
.end method

.method public g(LYg/J;Ljava/lang/Object;Lmh/q;)Ljava/lang/Object;
    .locals 2

    iget-object p3, p0, LTi/f$a;->c:LTi/f;

    iget-object v0, p0, LTi/f$a;->a:LIi/p;

    new-instance v1, LTi/d;

    invoke-direct {v1, p3, p0}, LTi/d;-><init>(LTi/f;LTi/f$a;)V

    invoke-virtual {v0, p1, p2, v1}, LIi/p;->p(Ljava/lang/Object;Ljava/lang/Object;Lmh/q;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {}, LTi/f;->w()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    iget-object p3, p0, LTi/f$a;->c:LTi/f;

    iget-object v0, p0, LTi/f$a;->b:Ljava/lang/Object;

    invoke-virtual {p2, p3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public getContext()Ldh/i;
    .locals 1

    iget-object v0, p0, LTi/f$a;->a:LIi/p;

    invoke-virtual {v0}, LIi/p;->getContext()Ldh/i;

    move-result-object v0

    return-object v0
.end method

.method public isCompleted()Z
    .locals 1

    iget-object v0, p0, LTi/f$a;->a:LIi/p;

    invoke-virtual {v0}, LIi/p;->isCompleted()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic p(Ljava/lang/Object;Ljava/lang/Object;Lmh/q;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1, p2, p3}, LTi/f$a;->g(LYg/J;Ljava/lang/Object;Lmh/q;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public r(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LTi/f$a;->a:LIi/p;

    invoke-virtual {v0, p1}, LIi/p;->r(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LTi/f$a;->a:LIi/p;

    invoke-virtual {v0, p1}, LIi/p;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
