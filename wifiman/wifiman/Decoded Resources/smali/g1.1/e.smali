.class public Lg1/e;
.super Lg1/a;
.source "SourceFile"

# interfaces
.implements Lh1/e;


# instance fields
.field protected final m0:Lg1/g;

.field final n0:Lg1/g$d;

.field protected o0:Ljava/util/ArrayList;

.field private p0:Lj1/j;


# direct methods
.method public constructor <init>(Lg1/g;Lg1/g$d;)V
    .locals 1

    invoke-direct {p0, p1}, Lg1/a;-><init>(Lg1/g;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg1/e;->o0:Ljava/util/ArrayList;

    iput-object p1, p0, Lg1/e;->m0:Lg1/g;

    iput-object p2, p0, Lg1/e;->n0:Lg1/g$d;

    return-void
.end method


# virtual methods
.method public a()Lj1/e;
    .locals 1

    invoke-virtual {p0}, Lg1/e;->u0()Lj1/j;

    move-result-object v0

    return-object v0
.end method

.method public apply()V
    .locals 0

    return-void
.end method

.method public varargs s0([Ljava/lang/Object;)Lg1/e;
    .locals 1

    iget-object v0, p0, Lg1/e;->o0:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-object p0
.end method

.method public t0()V
    .locals 0

    invoke-super {p0}, Lg1/a;->apply()V

    return-void
.end method

.method public u0()Lj1/j;
    .locals 1

    iget-object v0, p0, Lg1/e;->p0:Lj1/j;

    return-object v0
.end method

.method public v0()Lg1/g$d;
    .locals 1

    iget-object v0, p0, Lg1/e;->n0:Lg1/g$d;

    return-object v0
.end method
