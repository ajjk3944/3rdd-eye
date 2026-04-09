.class public final Landroidx/compose/foundation/m$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/m;->b(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLw/n;ZZ)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/o;

.field final synthetic b:Z

.field final synthetic c:Lw/n;

.field final synthetic d:Z

.field final synthetic e:Z


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/o;ZLw/n;ZZ)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/m$b;->a:Landroidx/compose/foundation/o;

    iput-boolean p2, p0, Landroidx/compose/foundation/m$b;->b:Z

    iput-object p3, p0, Landroidx/compose/foundation/m$b;->c:Lw/n;

    iput-boolean p4, p0, Landroidx/compose/foundation/m$b;->d:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/m$b;->e:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/B0;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/m$b;->a(Landroidx/compose/ui/platform/B0;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
