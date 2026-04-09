.class final Landroidx/compose/ui/viewinterop/e$n;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/e;->g(LT/l;Landroidx/compose/ui/e;ILY0/d;Landroidx/lifecycle/o;Lq2/f;LY0/t;LT/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/viewinterop/e$n$a;
    }
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/viewinterop/e$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/viewinterop/e$n;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/e$n;-><init>()V

    sput-object v0, Landroidx/compose/ui/viewinterop/e$n;->a:Landroidx/compose/ui/viewinterop/e$n;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/G;LY0/t;)V
    .locals 2

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/e;->c(LE0/G;)Landroidx/compose/ui/viewinterop/i;

    move-result-object p1

    sget-object v0, Landroidx/compose/ui/viewinterop/e$n$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v1, 0x2

    if-ne p2, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutDirection(I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/G;

    check-cast p2, LY0/t;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/viewinterop/e$n;->a(LE0/G;LY0/t;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
