.class final Ly0/H$b$a;
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
.field final synthetic a:Ly0/H;


# direct methods
.method constructor <init>(Ly0/H;)V
    .locals 0

    iput-object p1, p0, Ly0/H$b$a;->a:Ly0/H;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)V
    .locals 1

    iget-object v0, p0, Ly0/H$b$a;->a:Ly0/H;

    invoke-virtual {v0}, Ly0/H;->c()Lmh/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/MotionEvent;

    invoke-virtual {p0, p1}, Ly0/H$b$a;->a(Landroid/view/MotionEvent;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
