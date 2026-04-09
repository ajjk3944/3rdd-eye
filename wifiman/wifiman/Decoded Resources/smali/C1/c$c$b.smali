.class public final LC1/c$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC1/c$c;->f(LC1/c$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LC1/c$c;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(LC1/c$c;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, LC1/c$c$b;->a:LC1/c$c;

    iput-object p2, p0, LC1/c$c$b;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 1

    iget-object v0, p0, LC1/c$c$b;->a:LC1/c$c;

    invoke-virtual {v0}, LC1/c$b;->d()LC1/c$d;

    move-result-object v0

    invoke-interface {v0}, LC1/c$d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, LC1/c$c$b;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    const/4 v0, 0x1

    return v0
.end method
