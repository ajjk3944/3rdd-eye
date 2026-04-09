.class LQ2/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ2/h;->a(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:LQ2/h;


# direct methods
.method constructor <init>(LQ2/h;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, LQ2/h$a;->b:LQ2/h;

    iput-object p2, p0, LQ2/h$a;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDraw()V
    .locals 1

    new-instance v0, LQ2/h$a$a;

    invoke-direct {v0, p0, p0}, LQ2/h$a$a;-><init>(LQ2/h$a;Landroid/view/ViewTreeObserver$OnDrawListener;)V

    invoke-static {v0}, LW2/l;->u(Ljava/lang/Runnable;)V

    return-void
.end method
