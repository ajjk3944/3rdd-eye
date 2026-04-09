.class final Landroidx/compose/ui/platform/f1$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/platform/f1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/f1$a;

    invoke-direct {v0}, Landroidx/compose/ui/platform/f1$a;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/f1$a;->a:Landroidx/compose/ui/platform/f1$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/n0;Landroid/graphics/Matrix;)V
    .locals 0

    invoke-interface {p1, p2}, Landroidx/compose/ui/platform/n0;->K(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/platform/n0;

    check-cast p2, Landroid/graphics/Matrix;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/f1$a;->a(Landroidx/compose/ui/platform/n0;Landroid/graphics/Matrix;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
