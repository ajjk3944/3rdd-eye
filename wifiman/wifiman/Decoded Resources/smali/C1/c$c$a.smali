.class public final LC1/c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC1/c$c;-><init>(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LC1/c$c;

.field final synthetic b:Landroid/app/Activity;


# direct methods
.method constructor <init>(LC1/c$c;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, LC1/c$c$a;->a:LC1/c$c;

    iput-object p2, p0, LC1/c$c$a;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-static {p2}, LC1/h;->a(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LC1/c$c$a;->a:LC1/c$c;

    invoke-static {p2}, LC1/i;->a(Ljava/lang/Object;)Landroid/window/SplashScreenView;

    move-result-object p2

    invoke-virtual {p1, p2}, LC1/c$c;->j(Landroid/window/SplashScreenView;)Z

    move-result p2

    invoke-virtual {p1, p2}, LC1/c$c;->k(Z)V

    iget-object p1, p0, LC1/c$c$a;->b:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    :cond_0
    return-void
.end method

.method public onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    return-void
.end method
