.class public abstract Ly0/P;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ly0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly0/n;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ly0/n;-><init>(Ljava/util/List;)V

    sput-object v0, Ly0/P;->a:Ly0/n;

    return-void
.end method

.method public static final a(Lmh/p;)Ly0/S;
    .locals 2

    new-instance v0, Ly0/T;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, p0}, Ly0/T;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lmh/p;)V

    return-object v0
.end method

.method public static final synthetic b()Ly0/n;
    .locals 1

    sget-object v0, Ly0/P;->a:Ly0/n;

    return-object v0
.end method

.method public static final c(Landroidx/compose/ui/e;Ljava/lang/Object;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;
    .locals 8

    new-instance v7, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lmh/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v7}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;
    .locals 8

    new-instance v7, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lmh/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v7}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method
