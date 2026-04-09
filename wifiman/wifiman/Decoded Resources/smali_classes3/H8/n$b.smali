.class public final LH8/n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/n;->a()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/n;


# direct methods
.method public constructor <init>(LH8/n;)V
    .locals 0

    iput-object p1, p0, LH8/n$b;->a:LH8/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 7

    const-string/jumbo v0, "getString(...)"

    :try_start_0
    const-string v1, "Creating Teleport notification channel"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v1, p0, LH8/n$b;->a:LH8/n;

    invoke-static {v1}, LH8/n;->c(LH8/n;)Landroid/content/Context;

    move-result-object v1

    const v4, 0x7f1102f8

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, LH8/n$b;->a:LH8/n;

    invoke-static {v4}, LH8/n;->c(LH8/n;)Landroid/content/Context;

    move-result-object v4

    const v5, 0x7f1102f7

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/app/NotificationChannel;

    sget-object v5, LO7/b;->TELEPORT:LO7/b;

    invoke-virtual {v5}, LO7/b;->getId()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x3

    invoke-direct {v0, v5, v1, v6}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v0, v4}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    iget-object v1, p0, LH8/n$b;->a:LH8/n;

    invoke-static {v1}, LH8/n;->d(LH8/n;)Landroid/app/NotificationManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    const-string/jumbo v0, "Teleport notification channel created"

    invoke-static {v0, v3, v2, v3}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
