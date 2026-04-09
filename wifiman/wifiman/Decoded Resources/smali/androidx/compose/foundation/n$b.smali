.class final Landroidx/compose/foundation/n$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/n;->q(LJ0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/n;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/n;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/n$b;->a:Landroidx/compose/foundation/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/n$b;->a:Landroidx/compose/foundation/n;

    invoke-virtual {v0}, Landroidx/compose/foundation/n;->D2()Landroidx/compose/foundation/o;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/o;->l()I

    move-result v0

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/n$b;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
