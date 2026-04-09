.class public final Landroidx/compose/ui/platform/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE0/n0;


# instance fields
.field private final a:I

.field private final b:Ljava/util/List;

.field private c:Ljava/lang/Float;

.field private d:Ljava/lang/Float;

.field private e:LJ0/h;

.field private f:LJ0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;LJ0/h;LJ0/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/ui/platform/i1;->a:I

    iput-object p2, p0, Landroidx/compose/ui/platform/i1;->b:Ljava/util/List;

    iput-object p3, p0, Landroidx/compose/ui/platform/i1;->c:Ljava/lang/Float;

    iput-object p4, p0, Landroidx/compose/ui/platform/i1;->d:Ljava/lang/Float;

    iput-object p5, p0, Landroidx/compose/ui/platform/i1;->e:LJ0/h;

    iput-object p6, p0, Landroidx/compose/ui/platform/i1;->f:LJ0/h;

    return-void
.end method


# virtual methods
.method public final a()LJ0/h;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/i1;->e:LJ0/h;

    return-object v0
.end method

.method public final b()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/i1;->c:Ljava/lang/Float;

    return-object v0
.end method

.method public final c()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/i1;->d:Ljava/lang/Float;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/platform/i1;->a:I

    return v0
.end method

.method public final e()LJ0/h;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/i1;->f:LJ0/h;

    return-object v0
.end method

.method public final f(LJ0/h;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/i1;->e:LJ0/h;

    return-void
.end method

.method public final g(Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/i1;->c:Ljava/lang/Float;

    return-void
.end method

.method public final h(Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/i1;->d:Ljava/lang/Float;

    return-void
.end method

.method public h0()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/i1;->b:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final i(LJ0/h;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/i1;->f:LJ0/h;

    return-void
.end method
