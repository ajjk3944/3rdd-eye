.class final Landroidx/compose/ui/layout/c;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/b;


# instance fields
.field private n:Lmh/q;

.field private o:Lmh/l;

.field private p:Lmh/p;


# direct methods
.method public constructor <init>(Lmh/q;Lmh/l;Lmh/p;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/c;->n:Lmh/q;

    iput-object p2, p0, Landroidx/compose/ui/layout/c;->o:Lmh/l;

    iput-object p3, p0, Landroidx/compose/ui/layout/c;->p:Lmh/p;

    return-void
.end method


# virtual methods
.method public final D2(Lmh/q;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/c;->n:Lmh/q;

    return-void
.end method

.method public final E2(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/c;->o:Lmh/l;

    return-void
.end method

.method public final F2(Lmh/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/c;->p:Lmh/p;

    return-void
.end method

.method public Q0(LC0/d;LC0/B;J)LC0/D;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/c;->n:Lmh/q;

    invoke-static {p3, p4}, LY0/b;->a(J)LY0/b;

    move-result-object p3

    invoke-interface {v0, p1, p2, p3}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC0/D;

    return-object p1
.end method

.method public S(J)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/c;->o:Lmh/l;

    invoke-static {p1, p2}, LY0/r;->b(J)LY0/r;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public k0(Landroidx/compose/ui/layout/t$a;LC0/r;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/c;->p:Lmh/p;

    invoke-interface {v0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method
