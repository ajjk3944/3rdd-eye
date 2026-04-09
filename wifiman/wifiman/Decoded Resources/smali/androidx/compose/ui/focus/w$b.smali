.class final Landroidx/compose/ui/focus/w$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/focus/w;->l(Landroidx/compose/ui/focus/FocusTargetNode;Ll0/i;ILmh/l;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/focus/FocusTargetNode;

.field final synthetic b:Ll0/i;

.field final synthetic c:I

.field final synthetic d:Lmh/l;


# direct methods
.method constructor <init>(Landroidx/compose/ui/focus/FocusTargetNode;Ll0/i;ILmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/w$b;->a:Landroidx/compose/ui/focus/FocusTargetNode;

    iput-object p2, p0, Landroidx/compose/ui/focus/w$b;->b:Ll0/i;

    iput p3, p0, Landroidx/compose/ui/focus/w$b;->c:I

    iput-object p4, p0, Landroidx/compose/ui/focus/w$b;->d:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LC0/e$a;)Ljava/lang/Boolean;
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/focus/w$b;->a:Landroidx/compose/ui/focus/FocusTargetNode;

    iget-object v1, p0, Landroidx/compose/ui/focus/w$b;->b:Ll0/i;

    iget v2, p0, Landroidx/compose/ui/focus/w$b;->c:I

    iget-object v3, p0, Landroidx/compose/ui/focus/w$b;->d:Lmh/l;

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/focus/w;->a(Landroidx/compose/ui/focus/FocusTargetNode;Ll0/i;ILmh/l;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    if-nez v0, :cond_1

    invoke-interface {p1}, LC0/e$a;->a()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LC0/e$a;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/w$b;->a(LC0/e$a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
