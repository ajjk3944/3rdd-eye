.class public final Lcom/ui/wifiman/model/android/secure/a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/android/secure/a$c;->a(Landroid/content/SharedPreferences;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/android/secure/a;

.field final synthetic b:Landroid/content/SharedPreferences;

.field final synthetic c:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/android/secure/a;Landroid/content/SharedPreferences;Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/android/secure/a$c$a;->a:Lcom/ui/wifiman/model/android/secure/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/android/secure/a$c$a;->b:Landroid/content/SharedPreferences;

    iput-object p3, p0, Lcom/ui/wifiman/model/android/secure/a$c$a;->c:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/android/secure/a$c$a;->a:Lcom/ui/wifiman/model/android/secure/a;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/ui/wifiman/model/android/secure/a$c$a;->b:Landroid/content/SharedPreferences;

    iget-object v2, p0, Lcom/ui/wifiman/model/android/secure/a$c$a;->c:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->getAlias()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/ui/wifiman/model/android/secure/a$c$a;->b:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/android/secure/a$c$a;->c:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->getAlias()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/ui/wifiman/model/android/secure/a$c$a;->c:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->getGenerator()Lmh/a;

    move-result-object v4

    invoke-interface {v4}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ui/wifiman/model/android/secure/a$c$a;->b:Landroid/content/SharedPreferences;

    iget-object v4, p0, Lcom/ui/wifiman/model/android/secure/a$c$a;->c:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->getAlias()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_1

    :goto_0
    :try_start_2
    monitor-exit v0

    invoke-interface {p1, v1}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :try_start_3
    new-instance v1, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$Error$StorageError;

    iget-object v4, p0, Lcom/ui/wifiman/model/android/secure/a$c$a;->c:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->getAlias()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "failed to obtain required passphrase "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4, v3, v2, v3}, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$Error$StorageError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1

    :catchall_1
    move-exception v1

    goto :goto_1

    :cond_2
    new-instance v1, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$Error$StorageError;

    iget-object v4, p0, Lcom/ui/wifiman/model/android/secure/a$c$a;->c:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->getAlias()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "failed to store required passphrase "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4, v3, v2, v3}, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$Error$StorageError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1
    :try_start_4
    monitor-exit v0

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method
