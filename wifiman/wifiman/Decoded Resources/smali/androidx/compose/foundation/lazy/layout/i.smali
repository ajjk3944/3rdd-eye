.class final Landroidx/compose/foundation/lazy/layout/i;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/A0;


# instance fields
.field private n:Landroidx/compose/foundation/lazy/layout/d;

.field private final o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/layout/d;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/i;->n:Landroidx/compose/foundation/lazy/layout/d;

    const-string p1, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/i;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final D2()Landroidx/compose/foundation/lazy/layout/d;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/i;->n:Landroidx/compose/foundation/lazy/layout/d;

    return-object v0
.end method

.method public E2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/i;->o:Ljava/lang/String;

    return-object v0
.end method

.method public final F2(Landroidx/compose/foundation/lazy/layout/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/i;->n:Landroidx/compose/foundation/lazy/layout/d;

    return-void
.end method

.method public bridge synthetic W()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/layout/i;->E2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
