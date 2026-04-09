.class public final Landroidx/compose/foundation/relocation/f;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LD/a;
.implements LE0/A;
.implements LE0/A0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/relocation/f$a;
    }
.end annotation


# static fields
.field public static final q:Landroidx/compose/foundation/relocation/f$a;

.field public static final r:I


# instance fields
.field private n:LD/c;

.field private final o:Z

.field private p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/relocation/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/relocation/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/foundation/relocation/f;->q:Landroidx/compose/foundation/relocation/f$a;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/relocation/f;->r:I

    return-void
.end method

.method public constructor <init>(LD/c;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/relocation/f;->n:LD/c;

    return-void
.end method

.method public static final synthetic D2(Landroidx/compose/foundation/relocation/f;LC0/r;Lmh/a;)Ll0/i;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/relocation/f;->E2(Landroidx/compose/foundation/relocation/f;LC0/r;Lmh/a;)Ll0/i;

    move-result-object p0

    return-object p0
.end method

.method private static final E2(Landroidx/compose/foundation/relocation/f;LC0/r;Lmh/a;)Ll0/i;
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-boolean v0, p0, Landroidx/compose/foundation/relocation/f;->p:Z

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-static {p0}, LE0/k;->k(LE0/j;)LC0/r;

    move-result-object p0

    invoke-interface {p1}, LC0/r;->M()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_3

    return-object v1

    :cond_3
    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll0/i;

    if-nez p2, :cond_4

    return-object v1

    :cond_4
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/relocation/d;->a(LC0/r;LC0/r;Ll0/i;)Ll0/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final F2()LD/c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/relocation/f;->n:LD/c;

    return-object v0
.end method

.method public W()Ljava/lang/Object;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/relocation/f;->q:Landroidx/compose/foundation/relocation/f$a;

    return-object v0
.end method

.method public Y1(LC0/r;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/foundation/relocation/f;->p:Z

    return-void
.end method

.method public i2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/relocation/f;->o:Z

    return v0
.end method

.method public r1(LC0/r;Lmh/a;Ldh/e;)Ljava/lang/Object;
    .locals 7

    new-instance v4, Landroidx/compose/foundation/relocation/f$c;

    invoke-direct {v4, p0, p1, p2}, Landroidx/compose/foundation/relocation/f$c;-><init>(Landroidx/compose/foundation/relocation/f;LC0/r;Lmh/a;)V

    new-instance v6, Landroidx/compose/foundation/relocation/f$b;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/relocation/f$b;-><init>(Landroidx/compose/foundation/relocation/f;LC0/r;Lmh/a;Lmh/a;Ldh/e;)V

    invoke-static {v6, p3}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
