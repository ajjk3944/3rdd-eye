.class final Landroidx/compose/ui/platform/x$r;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/x;->W0(ZLjava/util/ArrayList;Lo/z;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/platform/x$r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/x$r;

    invoke-direct {v0}, Landroidx/compose/ui/platform/x$r;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/x$r;->a:Landroidx/compose/ui/platform/x$r;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/n;LJ0/n;)Ljava/lang/Integer;
    .locals 3

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    sget-object v0, LJ0/q;->a:LJ0/q;

    invoke-virtual {v0}, LJ0/q;->H()LJ0/v;

    move-result-object v1

    sget-object v2, Landroidx/compose/ui/platform/x$r$a;->a:Landroidx/compose/ui/platform/x$r$a;

    invoke-virtual {p1, v1, v2}, LJ0/j;->k(LJ0/v;Lmh/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p2}, LJ0/n;->w()LJ0/j;

    move-result-object p2

    invoke-virtual {v0}, LJ0/q;->H()LJ0/v;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/platform/x$r$b;->a:Landroidx/compose/ui/platform/x$r$b;

    invoke-virtual {p2, v0, v1}, LJ0/j;->k(LJ0/v;Lmh/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/n;

    check-cast p2, LJ0/n;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/x$r;->a(LJ0/n;LJ0/n;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
