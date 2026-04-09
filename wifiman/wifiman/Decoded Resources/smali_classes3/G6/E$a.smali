.class LG6/E$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG6/E;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:LG6/E;


# direct methods
.method constructor <init>(LG6/E;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, LG6/E$a;->b:LG6/E;

    iput-object p2, p0, LG6/E$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/t;)V
    .locals 4

    new-instance v0, LG6/E$a$a;

    invoke-direct {v0, p0, p1}, LG6/E$a$a;-><init>(LG6/E$a;Lgg/t;)V

    iget-object v1, p0, LG6/E$a;->a:Landroid/content/Context;

    new-instance v2, Landroid/content/IntentFilter;

    const-string/jumbo v3, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v1, LG6/E$a$b;

    invoke-direct {v1, p0, v0}, LG6/E$a$b;-><init>(LG6/E$a;Landroid/content/BroadcastReceiver;)V

    invoke-interface {p1, v1}, Lgg/t;->d(Lkg/e;)V

    return-void
.end method
