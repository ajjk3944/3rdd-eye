.class public final Landroidx/compose/foundation/relocation/e;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"


# instance fields
.field private n:LD/b;

.field private final o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LD/b;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/relocation/e;->n:LD/b;

    return-void
.end method

.method private final D2()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/relocation/e;->n:LD/b;

    instance-of v1, v0, Landroidx/compose/foundation/relocation/a;

    if-eqz v1, :cond_0

    const-string v1, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/foundation/relocation/a;

    invoke-virtual {v0}, Landroidx/compose/foundation/relocation/a;->b()LV/b;

    move-result-object v0

    invoke-virtual {v0, p0}, LV/b;->x(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final E2(LD/b;)V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/foundation/relocation/e;->D2()V

    instance-of v0, p1, Landroidx/compose/foundation/relocation/a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/relocation/a;

    invoke-virtual {v0}, Landroidx/compose/foundation/relocation/a;->b()LV/b;

    move-result-object v0

    invoke-virtual {v0, p0}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_0
    iput-object p1, p0, Landroidx/compose/foundation/relocation/e;->n:LD/b;

    return-void
.end method

.method public i2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/relocation/e;->o:Z

    return v0
.end method

.method public n2()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/relocation/e;->n:LD/b;

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/relocation/e;->E2(LD/b;)V

    return-void
.end method

.method public o2()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/relocation/e;->D2()V

    return-void
.end method
