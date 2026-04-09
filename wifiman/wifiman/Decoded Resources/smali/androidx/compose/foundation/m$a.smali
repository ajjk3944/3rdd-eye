.class final Landroidx/compose/foundation/m$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/m;->a(ILT/l;II)Landroidx/compose/foundation/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/m$a;->a:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/compose/foundation/o;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/o;

    iget v1, p0, Landroidx/compose/foundation/m$a;->a:I

    invoke-direct {v0, v1}, Landroidx/compose/foundation/o;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/m$a;->a()Landroidx/compose/foundation/o;

    move-result-object v0

    return-object v0
.end method
