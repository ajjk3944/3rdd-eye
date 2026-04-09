.class final Landroidx/compose/ui/platform/Q$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/platform/Q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/Q$a;

    invoke-direct {v0}, Landroidx/compose/ui/platform/Q$a;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/Q$a;->a:Landroidx/compose/ui/platform/Q$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ldh/i;
    .locals 4

    new-instance v0, Landroidx/compose/ui/platform/Q;

    invoke-static {}, Landroidx/compose/ui/platform/S;->a()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {}, LIi/c0;->c()LIi/H0;

    move-result-object v1

    new-instance v3, Landroidx/compose/ui/platform/Q$a$a;

    invoke-direct {v3, v2}, Landroidx/compose/ui/platform/Q$a$a;-><init>(Ldh/e;)V

    invoke-static {v1, v3}, LIi/i;->e(Ldh/i;Lmh/p;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Choreographer;

    :goto_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-static {v3}, LA1/i;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v3

    invoke-direct {v0, v1, v3, v2}, Landroidx/compose/ui/platform/Q;-><init>(Landroid/view/Choreographer;Landroid/os/Handler;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Landroidx/compose/ui/platform/Q;->y0()LT/g0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldh/a;->plus(Ldh/i;)Ldh/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/Q$a;->a()Ldh/i;

    move-result-object v0

    return-object v0
.end method
