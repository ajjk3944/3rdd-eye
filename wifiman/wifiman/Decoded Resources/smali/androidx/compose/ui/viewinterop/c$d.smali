.class final Landroidx/compose/ui/viewinterop/c$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/c;-><init>(Landroid/content/Context;LT/q;ILx0/b;Landroid/view/View;LE0/m0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/G;


# direct methods
.method constructor <init>(LE0/G;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c$d;->a:LE0/G;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LY0/d;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$d;->a:LE0/G;

    invoke-virtual {v0, p1}, LE0/G;->a(LY0/d;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY0/d;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c$d;->a(LY0/d;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
