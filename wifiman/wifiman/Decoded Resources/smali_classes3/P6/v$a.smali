.class LP6/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP6/v;->a()Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LP6/v;


# direct methods
.method constructor <init>(LP6/v;)V
    .locals 0

    iput-object p1, p0, LP6/v$a;->a:LP6/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/t;)V
    .locals 4

    iget-object v0, p0, LP6/v$a;->a:LP6/v;

    iget-object v0, v0, LP6/v;->b:LP6/x;

    invoke-interface {v0}, LP6/x;->a()Z

    move-result v0

    new-instance v1, LP6/v$a$a;

    invoke-direct {v1, p0, p1}, LP6/v$a$a;-><init>(LP6/v$a;Lgg/t;)V

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/h;->h(Ljava/lang/Object;)V

    iget-object v0, p0, LP6/v$a;->a:LP6/v;

    iget-object v0, v0, LP6/v;->a:Landroid/content/Context;

    new-instance v2, Landroid/content/IntentFilter;

    const-string/jumbo v3, "android.location.MODE_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v0, LP6/v$a$b;

    invoke-direct {v0, p0, v1}, LP6/v$a$b;-><init>(LP6/v$a;Landroid/content/BroadcastReceiver;)V

    invoke-interface {p1, v0}, Lgg/t;->d(Lkg/e;)V

    return-void
.end method
