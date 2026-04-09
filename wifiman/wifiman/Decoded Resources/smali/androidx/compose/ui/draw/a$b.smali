.class final Landroidx/compose/ui/draw/a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/draw/a;->F2(Lo0/c;)Lj0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/draw/a;

.field final synthetic b:Lj0/d;


# direct methods
.method constructor <init>(Landroidx/compose/ui/draw/a;Lj0/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/draw/a$b;->a:Landroidx/compose/ui/draw/a;

    iput-object p2, p0, Landroidx/compose/ui/draw/a$b;->b:Lj0/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/draw/a$b;->a:Landroidx/compose/ui/draw/a;

    invoke-virtual {v0}, Landroidx/compose/ui/draw/a;->D2()Lmh/l;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/draw/a$b;->b:Lj0/d;

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/draw/a$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
