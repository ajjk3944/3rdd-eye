.class public final Landroidx/compose/ui/platform/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LJ0/j;

.field private final b:Lo/A;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LJ0/n;Lo/m;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/j1;->a:LJ0/j;

    invoke-static {}, Lo/p;->b()Lo/A;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/j1;->b:Lo/A;

    invoke-virtual {p1}, LJ0/n;->t()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJ0/n;

    invoke-virtual {v2}, LJ0/n;->o()I

    move-result v3

    invoke-virtual {p2, v3}, Lo/m;->a(I)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Landroidx/compose/ui/platform/j1;->b:Lo/A;

    invoke-virtual {v2}, LJ0/n;->o()I

    move-result v2

    invoke-virtual {v3, v2}, Lo/A;->f(I)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Lo/A;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->b:Lo/A;

    return-object v0
.end method

.method public final b()LJ0/j;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/j1;->a:LJ0/j;

    return-object v0
.end method
