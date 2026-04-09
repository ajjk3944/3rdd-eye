.class public final Lcom/ui/wifiman/model/android/secure/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/android/secure/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/android/secure/a;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/android/secure/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/android/secure/a$d;->a:Lcom/ui/wifiman/model/android/secure/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/android/secure/a$d;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/android/secure/a$d;->a:Lcom/ui/wifiman/model/android/secure/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/android/secure/a;->e(Lcom/ui/wifiman/model/android/secure/a;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/android/secure/a$d;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/ui/wifiman/model/android/secure/a;->c(Lcom/ui/wifiman/model/android/secure/a;Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    new-instance v1, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$Error$StorageError;

    const-string v2, "AndroidKeystorePassphraseManager failed to open secure storage. Keystore probably corrupted"

    invoke-direct {v1, v2, v0}, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$Error$StorageError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
