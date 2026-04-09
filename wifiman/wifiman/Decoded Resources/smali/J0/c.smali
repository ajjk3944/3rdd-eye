.class public final LJ0/c;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/v0;


# instance fields
.field private n:Z

.field private o:Z

.field private p:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZZLmh/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-boolean p1, p0, LJ0/c;->n:Z

    iput-boolean p2, p0, LJ0/c;->o:Z

    iput-object p3, p0, LJ0/c;->p:Lmh/l;

    return-void
.end method


# virtual methods
.method public D0()Z
    .locals 1

    iget-boolean v0, p0, LJ0/c;->o:Z

    return v0
.end method

.method public final D2(Z)V
    .locals 0

    iput-boolean p1, p0, LJ0/c;->n:Z

    return-void
.end method

.method public final E2(Lmh/l;)V
    .locals 0

    iput-object p1, p0, LJ0/c;->p:Lmh/l;

    return-void
.end method

.method public S1()Z
    .locals 1

    iget-boolean v0, p0, LJ0/c;->n:Z

    return v0
.end method

.method public q(LJ0/w;)V
    .locals 1

    iget-object v0, p0, LJ0/c;->p:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
