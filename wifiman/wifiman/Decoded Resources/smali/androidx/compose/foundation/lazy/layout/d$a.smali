.class final Landroidx/compose/foundation/lazy/layout/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/L;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/lazy/layout/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field final synthetic b:Landroidx/compose/foundation/lazy/layout/d;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/layout/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/d$a;->b:Landroidx/compose/foundation/lazy/layout/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/d$a;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    invoke-static {}, Landroidx/compose/foundation/lazy/layout/e;->a()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Landroidx/compose/foundation/lazy/layout/d$a;->c(IJ)V

    return-void
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/d$a;->a:Ljava/util/List;

    return-object v0
.end method

.method public c(IJ)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/d$a;->b:Landroidx/compose/foundation/lazy/layout/d;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/d;->c()Landroidx/compose/foundation/lazy/layout/h;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/d$a;->a:Ljava/util/List;

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/d$a;->b:Landroidx/compose/foundation/lazy/layout/d;

    invoke-static {v2}, Landroidx/compose/foundation/lazy/layout/d;->a(Landroidx/compose/foundation/lazy/layout/d;)LB/N;

    move-result-object v2

    invoke-virtual {v0, p1, p2, p3, v2}, Landroidx/compose/foundation/lazy/layout/h;->c(IJLB/N;)LB/O;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
