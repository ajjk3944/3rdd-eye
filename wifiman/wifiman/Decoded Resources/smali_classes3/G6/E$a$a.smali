.class LG6/E$a$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG6/E$a;->a(Lgg/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/t;

.field final synthetic b:LG6/E$a;


# direct methods
.method constructor <init>(LG6/E$a;Lgg/t;)V
    .locals 0

    iput-object p1, p0, LG6/E$a$a;->b:LG6/E$a;

    iput-object p2, p0, LG6/E$a$a;->a:Lgg/t;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string/jumbo p1, "android.bluetooth.adapter.extra.STATE"

    const/4 v0, -0x1

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, LG6/E;->i1(I)LG6/E$b;

    move-result-object p1

    const-string p2, "Adapter state changed: %s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, v0}, LI6/q;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, LG6/E$a$a;->a:Lgg/t;

    invoke-interface {p2, p1}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method
