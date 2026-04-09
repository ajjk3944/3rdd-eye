.class public final Lg2/i$b;
.super Lf2/r;
.source "SourceFile"

# interfaces
.implements Lf2/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final m:Landroidx/compose/ui/window/i;

.field private final n:Lmh/q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lg2/i;Landroidx/compose/ui/window/i;Lmh/q;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lf2/r;-><init>(Lf2/D;)V

    .line 4
    iput-object p2, p0, Lg2/i$b;->m:Landroidx/compose/ui/window/i;

    .line 5
    iput-object p3, p0, Lg2/i$b;->n:Lmh/q;

    return-void
.end method

.method public synthetic constructor <init>(Lg2/i;Landroidx/compose/ui/window/i;Lmh/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 1
    new-instance p2, Landroidx/compose/ui/window/i;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/window/i;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lg2/i$b;-><init>(Lg2/i;Landroidx/compose/ui/window/i;Lmh/q;)V

    return-void
.end method


# virtual methods
.method public final L()Lmh/q;
    .locals 1

    iget-object v0, p0, Lg2/i$b;->n:Lmh/q;

    return-object v0
.end method

.method public final M()Landroidx/compose/ui/window/i;
    .locals 1

    iget-object v0, p0, Lg2/i$b;->m:Landroidx/compose/ui/window/i;

    return-object v0
.end method
