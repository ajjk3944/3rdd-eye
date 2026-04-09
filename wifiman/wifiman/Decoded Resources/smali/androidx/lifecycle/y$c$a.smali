.class public final Landroidx/lifecycle/y$c$a;
.super Landroidx/lifecycle/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/y$c;->onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/lifecycle/y;


# direct methods
.method constructor <init>(Landroidx/lifecycle/y;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/y$c$a;->this$0:Landroidx/lifecycle/y;

    invoke-direct {p0}, Landroidx/lifecycle/g;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/y$c$a;->this$0:Landroidx/lifecycle/y;

    invoke-virtual {p1}, Landroidx/lifecycle/y;->f()V

    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/y$c$a;->this$0:Landroidx/lifecycle/y;

    invoke-virtual {p1}, Landroidx/lifecycle/y;->g()V

    return-void
.end method
