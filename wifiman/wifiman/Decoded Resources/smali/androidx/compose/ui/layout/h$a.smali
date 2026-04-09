.class final Landroidx/compose/ui/layout/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/layout/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Object;

.field private b:Lmh/p;

.field private c:LT/U0;

.field private d:Z

.field private e:Z

.field private f:LT/q0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lmh/p;LT/U0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/compose/ui/layout/h$a;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Landroidx/compose/ui/layout/h$a;->b:Lmh/p;

    .line 4
    iput-object p3, p0, Landroidx/compose/ui/layout/h$a;->c:LT/U0;

    .line 5
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 p2, 0x0

    const/4 p3, 0x2

    invoke-static {p1, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/layout/h$a;->f:LT/q0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lmh/p;LT/U0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/layout/h$a;-><init>(Ljava/lang/Object;Lmh/p;LT/U0;)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$a;->f:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final b()LT/U0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$a;->c:LT/U0;

    return-object v0
.end method

.method public final c()Lmh/p;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$a;->b:Lmh/p;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/layout/h$a;->d:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/layout/h$a;->e:Z

    return v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$a;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final g(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$a;->f:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final h(LT/q0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/h$a;->f:LT/q0;

    return-void
.end method

.method public final i(LT/U0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/h$a;->c:LT/U0;

    return-void
.end method

.method public final j(Lmh/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/h$a;->b:Lmh/p;

    return-void
.end method

.method public final k(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/layout/h$a;->d:Z

    return-void
.end method

.method public final l(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/layout/h$a;->e:Z

    return-void
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/h$a;->a:Ljava/lang/Object;

    return-void
.end method
