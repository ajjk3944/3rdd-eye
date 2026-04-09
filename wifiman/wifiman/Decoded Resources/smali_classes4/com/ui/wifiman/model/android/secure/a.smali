.class public final Lcom/ui/wifiman/model/android/secure/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/android/secure/a$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/ui/wifiman/model/android/secure/a$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LYg/m;

.field private final c:Lgg/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/android/secure/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/android/secure/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/android/secure/a;->d:Lcom/ui/wifiman/model/android/secure/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedPrefFilename"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/android/secure/a;->a:Landroid/content/Context;

    new-instance p1, Lsc/b;

    invoke-direct {p1, p0}, Lsc/b;-><init>(Lcom/ui/wifiman/model/android/secure/a;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/android/secure/a;->b:LYg/m;

    new-instance p1, Lcom/ui/wifiman/model/android/secure/a$d;

    invoke-direct {p1, p0, p2}, Lcom/ui/wifiman/model/android/secure/a$d;-><init>(Lcom/ui/wifiman/model/android/secure/a;Ljava/lang/String;)V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/android/secure/a;->c:Lgg/z;

    return-void
.end method

.method public static synthetic b(Lcom/ui/wifiman/model/android/secure/a;)Landroidx/security/crypto/b;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/android/secure/a;->i(Lcom/ui/wifiman/model/android/secure/a;)Landroidx/security/crypto/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/ui/wifiman/model/android/secure/a;Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/android/secure/a;->f(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/android/secure/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/android/secure/a;->g(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/android/secure/a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/android/secure/a;->a:Landroid/content/Context;

    return-object p0
.end method

.method private final f(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 3

    invoke-direct {p0}, Lcom/ui/wifiman/model/android/secure/a;->h()Landroidx/security/crypto/b;

    move-result-object v0

    sget-object v1, Landroidx/security/crypto/a$d;->AES256_SIV:Landroidx/security/crypto/a$d;

    sget-object v2, Landroidx/security/crypto/a$e;->AES256_GCM:Landroidx/security/crypto/a$e;

    invoke-static {p1, p2, v0, v1, v2}, Landroidx/security/crypto/a;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/security/crypto/b;Landroidx/security/crypto/a$d;Landroidx/security/crypto/a$e;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string p2, "create(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final g(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/ui/wifiman/model/android/secure/a;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/shared_prefs/"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".xml"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result p1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Android keystore passphrase manager storage deleted: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, "; path: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Android keystore passphrase manager storage file non-existent; path: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x6

    invoke-static {p1, v0, v0, v1, v0}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    const-string p1, "AndroidKeyStore"

    invoke-static {p1}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    const-string v1, "_androidx_security_master_key_"

    invoke-virtual {p1, v1}, Ljava/security/KeyStore;->deleteEntry(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    const-string v1, "Error while Android keystore passphrase manager trying to reset storage"

    const/4 v2, 0x4

    invoke-static {v1, p1, v0, v2, v0}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_2
    return-void
.end method

.method private final h()Landroidx/security/crypto/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/android/secure/a;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/security/crypto/b;

    return-object v0
.end method

.method private static final i(Lcom/ui/wifiman/model/android/secure/a;)Landroidx/security/crypto/b;
    .locals 2

    new-instance v0, Landroidx/security/crypto/b$b;

    iget-object p0, p0, Lcom/ui/wifiman/model/android/secure/a;->a:Landroid/content/Context;

    invoke-direct {v0, p0}, Landroidx/security/crypto/b$b;-><init>(Landroid/content/Context;)V

    sget-object p0, Landroidx/security/crypto/b$c;->AES256_GCM:Landroidx/security/crypto/b$c;

    invoke-virtual {v0, p0}, Landroidx/security/crypto/b$b;->b(Landroidx/security/crypto/b$c;)Landroidx/security/crypto/b$b;

    move-result-object p0

    const-string v0, "setKeyScheme(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/security/crypto/b$b;->c(Z)Landroidx/security/crypto/b$b;

    :cond_0
    invoke-virtual {p0}, Landroidx/security/crypto/b$b;->a()Landroidx/security/crypto/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;)Lgg/z;
    .locals 2

    const-string v0, "passphrase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/android/secure/a;->c:Lgg/z;

    new-instance v1, Lcom/ui/wifiman/model/android/secure/a$c;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/android/secure/a$c;-><init>(Lcom/ui/wifiman/model/android/secure/a;Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string v0, "subscribeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public clear()Lgg/b;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/android/secure/a$b;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/android/secure/a$b;-><init>(Lcom/ui/wifiman/model/android/secure/a;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v0

    const-string v1, "subscribeOn(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
