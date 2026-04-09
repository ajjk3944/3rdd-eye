.class public final LF/r$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/r;->a(Landroidx/compose/ui/e;LL0/U;II)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:LL0/U;


# direct methods
.method public constructor <init>(IILL0/U;)V
    .locals 0

    iput p1, p0, LF/r$a;->a:I

    iput p2, p0, LF/r$a;->b:I

    iput-object p3, p0, LF/r$a;->c:LL0/U;

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

    invoke-virtual {p0, p1}, LF/r$a;->a(Landroidx/compose/ui/platform/B0;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
