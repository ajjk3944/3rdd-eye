.class final Landroidx/compose/foundation/layout/c;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/p0;


# instance fields
.field private n:Lf0/c;

.field private o:Z


# direct methods
.method public constructor <init>(Lf0/c;Z)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/c;->n:Lf0/c;

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/c;->o:Z

    return-void
.end method


# virtual methods
.method public final D2()Lf0/c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/c;->n:Lf0/c;

    return-object v0
.end method

.method public final E2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/c;->o:Z

    return v0
.end method

.method public F2(LY0/d;Ljava/lang/Object;)Landroidx/compose/foundation/layout/c;
    .locals 0

    return-object p0
.end method

.method public final G2(Lf0/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/c;->n:Lf0/c;

    return-void
.end method

.method public final H2(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/c;->o:Z

    return-void
.end method

.method public bridge synthetic M(LY0/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/layout/c;->F2(LY0/d;Ljava/lang/Object;)Landroidx/compose/foundation/layout/c;

    move-result-object p1

    return-object p1
.end method
