.class final LE0/c0$l;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/c0;->y3(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;


# direct methods
.method constructor <init>(Lmh/l;)V
    .locals 0

    iput-object p1, p0, LE0/c0$l;->a:Lmh/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LE0/c0$l;->a:Lmh/l;

    invoke-static {}, LE0/c0;->Y1()Landroidx/compose/ui/graphics/d;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LE0/c0;->Y1()Landroidx/compose/ui/graphics/d;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/d;->T()V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE0/c0$l;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
