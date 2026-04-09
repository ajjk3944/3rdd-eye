.class public final Lq/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/compose/animation/i;

.field private final b:Landroidx/compose/animation/k;

.field private final c:LT/m0;

.field private d:Lq/v;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/animation/i;Landroidx/compose/animation/k;FLq/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lq/i;->a:Landroidx/compose/animation/i;

    .line 3
    iput-object p2, p0, Lq/i;->b:Landroidx/compose/animation/k;

    .line 4
    invoke-static {p3}, LT/C0;->a(F)LT/m0;

    move-result-object p1

    iput-object p1, p0, Lq/i;->c:LT/m0;

    .line 5
    iput-object p4, p0, Lq/i;->d:Lq/v;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/animation/i;Landroidx/compose/animation/k;FLq/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    const/4 p5, 0x3

    const/4 p6, 0x0

    .line 6
    invoke-static {p4, p6, p5, p6}, Landroidx/compose/animation/a;->d(ZLmh/p;ILjava/lang/Object;)Lq/v;

    move-result-object p4

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lq/i;-><init>(Landroidx/compose/animation/i;Landroidx/compose/animation/k;FLq/v;)V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/compose/animation/k;
    .locals 1

    iget-object v0, p0, Lq/i;->b:Landroidx/compose/animation/k;

    return-object v0
.end method

.method public final b()Lq/v;
    .locals 1

    iget-object v0, p0, Lq/i;->d:Lq/v;

    return-object v0
.end method

.method public final c()Landroidx/compose/animation/i;
    .locals 1

    iget-object v0, p0, Lq/i;->a:Landroidx/compose/animation/i;

    return-object v0
.end method

.method public final d()F
    .locals 1

    iget-object v0, p0, Lq/i;->c:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method
