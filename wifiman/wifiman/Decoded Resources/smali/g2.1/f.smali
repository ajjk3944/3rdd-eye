.class public final Lg2/f;
.super Lf2/s;
.source "SourceFile"


# instance fields
.field private final h:Lg2/e;

.field private final i:Lmh/r;

.field private j:Lmh/l;

.field private k:Lmh/l;

.field private l:Lmh/l;

.field private m:Lmh/l;

.field private n:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lg2/e;Ljava/lang/String;Lmh/r;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lf2/s;-><init>(Lf2/D;Ljava/lang/String;)V

    iput-object p1, p0, Lg2/f;->h:Lg2/e;

    iput-object p3, p0, Lg2/f;->i:Lmh/r;

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Lf2/r;
    .locals 1

    invoke-virtual {p0}, Lg2/f;->f()Lg2/e$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Lf2/r;
    .locals 1

    invoke-virtual {p0}, Lg2/f;->g()Lg2/e$b;

    move-result-object v0

    return-object v0
.end method

.method public f()Lg2/e$b;
    .locals 2

    invoke-super {p0}, Lf2/s;->b()Lf2/r;

    move-result-object v0

    check-cast v0, Lg2/e$b;

    iget-object v1, p0, Lg2/f;->j:Lmh/l;

    invoke-virtual {v0, v1}, Lg2/e$b;->S(Lmh/l;)V

    iget-object v1, p0, Lg2/f;->k:Lmh/l;

    invoke-virtual {v0, v1}, Lg2/e$b;->T(Lmh/l;)V

    iget-object v1, p0, Lg2/f;->l:Lmh/l;

    invoke-virtual {v0, v1}, Lg2/e$b;->U(Lmh/l;)V

    iget-object v1, p0, Lg2/f;->m:Lmh/l;

    invoke-virtual {v0, v1}, Lg2/e$b;->V(Lmh/l;)V

    iget-object v1, p0, Lg2/f;->n:Lmh/l;

    invoke-virtual {v0, v1}, Lg2/e$b;->W(Lmh/l;)V

    return-object v0
.end method

.method protected g()Lg2/e$b;
    .locals 3

    new-instance v0, Lg2/e$b;

    iget-object v1, p0, Lg2/f;->h:Lg2/e;

    iget-object v2, p0, Lg2/f;->i:Lmh/r;

    invoke-direct {v0, v1, v2}, Lg2/e$b;-><init>(Lg2/e;Lmh/r;)V

    return-object v0
.end method

.method public final h(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lg2/f;->j:Lmh/l;

    return-void
.end method

.method public final i(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lg2/f;->k:Lmh/l;

    return-void
.end method

.method public final j(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lg2/f;->l:Lmh/l;

    return-void
.end method

.method public final k(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lg2/f;->m:Lmh/l;

    return-void
.end method

.method public final l(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lg2/f;->n:Lmh/l;

    return-void
.end method
