.class final Ly0/H$b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/H$b;->h(Ly0/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly0/H$b;

.field final synthetic b:Ly0/H;


# direct methods
.method constructor <init>(Ly0/H$b;Ly0/H;)V
    .locals 0

    iput-object p1, p0, Ly0/H$b$b;->a:Ly0/H$b;

    iput-object p2, p0, Ly0/H$b$b;->b:Ly0/H;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ly0/H$b$b;->a:Ly0/H$b;

    iget-object v1, p0, Ly0/H$b$b;->b:Ly0/H;

    invoke-virtual {v1}, Ly0/H;->c()Lmh/l;

    move-result-object v1

    invoke-interface {v1, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ly0/H$a;->Dispatching:Ly0/H$a;

    goto :goto_0

    :cond_0
    sget-object p1, Ly0/H$a;->NotDispatching:Ly0/H$a;

    :goto_0
    invoke-static {v0, p1}, Ly0/H$b;->g(Ly0/H$b;Ly0/H$a;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ly0/H$b$b;->b:Ly0/H;

    invoke-virtual {v0}, Ly0/H;->c()Lmh/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/MotionEvent;

    invoke-virtual {p0, p1}, Ly0/H$b$b;->a(Landroid/view/MotionEvent;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
