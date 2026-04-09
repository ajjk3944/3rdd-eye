.class public final LI/f1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/f1;->a(Lmh/a;Lmh/p;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;)Li0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:Lmh/p;

.field final synthetic c:Lmh/l;

.field final synthetic d:Lmh/l;

.field final synthetic e:Lmh/l;

.field final synthetic f:Lmh/l;

.field final synthetic g:Lmh/l;

.field final synthetic h:Lmh/l;


# direct methods
.method constructor <init>(Lmh/l;Lmh/p;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LI/f1$b;->a:Lmh/l;

    iput-object p2, p0, LI/f1$b;->b:Lmh/p;

    iput-object p3, p0, LI/f1$b;->c:Lmh/l;

    iput-object p4, p0, LI/f1$b;->d:Lmh/l;

    iput-object p5, p0, LI/f1$b;->e:Lmh/l;

    iput-object p6, p0, LI/f1$b;->f:Lmh/l;

    iput-object p7, p0, LI/f1$b;->g:Lmh/l;

    iput-object p8, p0, LI/f1$b;->h:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public G0(Li0/b;)V
    .locals 3

    invoke-static {p1}, Li0/i;->b(Li0/b;)Landroid/view/DragEvent;

    move-result-object p1

    iget-object v0, p0, LI/f1$b;->e:Lmh/l;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/DragEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/DragEvent;->getY()F

    move-result p1

    invoke-static {v1, p1}, Ll0/h;->a(FF)J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    :cond_0
    return-void
.end method

.method public R1(Li0/b;)V
    .locals 1

    iget-object v0, p0, LI/f1$b;->c:Lmh/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    :cond_0
    return-void
.end method

.method public T(Li0/b;)V
    .locals 1

    iget-object v0, p0, LI/f1$b;->d:Lmh/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    :cond_0
    return-void
.end method

.method public c1(Li0/b;)Z
    .locals 2

    iget-object v0, p0, LI/f1$b;->a:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LI/f1$b;->b:Lmh/p;

    invoke-static {p1}, Li0/i;->b(Li0/b;)Landroid/view/DragEvent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/DragEvent;->getClipData()Landroid/content/ClipData;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/platform/l;->c(Landroid/content/ClipData;)Landroidx/compose/ui/platform/f0;

    move-result-object v1

    invoke-static {p1}, Li0/i;->b(Li0/b;)Landroid/view/DragEvent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/DragEvent;->getClipDescription()Landroid/content/ClipDescription;

    move-result-object p1

    invoke-static {p1}, Landroidx/compose/ui/platform/l;->d(Landroid/content/ClipDescription;)Landroidx/compose/ui/platform/g0;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public y0(Li0/b;)V
    .locals 1

    iget-object v0, p0, LI/f1$b;->h:Lmh/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    :cond_0
    return-void
.end method

.method public z1(Li0/b;)V
    .locals 1

    iget-object v0, p0, LI/f1$b;->f:Lmh/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    :cond_0
    return-void
.end method
