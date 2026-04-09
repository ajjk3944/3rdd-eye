.class final Landroidx/compose/ui/window/b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/q;Lmh/a;Landroidx/compose/ui/window/r;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/k;

.field final synthetic b:Lmh/a;

.field final synthetic c:Landroidx/compose/ui/window/r;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:LY0/t;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/k;Lmh/a;Landroidx/compose/ui/window/r;Ljava/lang/String;LY0/t;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/b$b;->a:Landroidx/compose/ui/window/k;

    iput-object p2, p0, Landroidx/compose/ui/window/b$b;->b:Lmh/a;

    iput-object p3, p0, Landroidx/compose/ui/window/b$b;->c:Landroidx/compose/ui/window/r;

    iput-object p4, p0, Landroidx/compose/ui/window/b$b;->d:Ljava/lang/String;

    iput-object p5, p0, Landroidx/compose/ui/window/b$b;->e:LY0/t;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 4

    iget-object p1, p0, Landroidx/compose/ui/window/b$b;->a:Landroidx/compose/ui/window/k;

    invoke-virtual {p1}, Landroidx/compose/ui/window/k;->r()V

    iget-object p1, p0, Landroidx/compose/ui/window/b$b;->a:Landroidx/compose/ui/window/k;

    iget-object v0, p0, Landroidx/compose/ui/window/b$b;->b:Lmh/a;

    iget-object v1, p0, Landroidx/compose/ui/window/b$b;->c:Landroidx/compose/ui/window/r;

    iget-object v2, p0, Landroidx/compose/ui/window/b$b;->d:Ljava/lang/String;

    iget-object v3, p0, Landroidx/compose/ui/window/b$b;->e:LY0/t;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroidx/compose/ui/window/k;->t(Lmh/a;Landroidx/compose/ui/window/r;Ljava/lang/String;LY0/t;)V

    iget-object p1, p0, Landroidx/compose/ui/window/b$b;->a:Landroidx/compose/ui/window/k;

    new-instance v0, Landroidx/compose/ui/window/b$b$a;

    invoke-direct {v0, p1}, Landroidx/compose/ui/window/b$b$a;-><init>(Landroidx/compose/ui/window/k;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/b$b;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
