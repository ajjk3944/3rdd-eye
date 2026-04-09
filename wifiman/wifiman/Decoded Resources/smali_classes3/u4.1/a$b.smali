.class public final Lu4/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lo4/a;

.field private f:Z

.field private g:Lo4/l;

.field private h:Lo4/o;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lu4/a$b;->a:Landroid/content/Context;

    iput-object v0, p0, Lu4/a$b;->b:Ljava/lang/String;

    iput-object v0, p0, Lu4/a$b;->c:Ljava/lang/String;

    iput-object v0, p0, Lu4/a$b;->d:Ljava/lang/String;

    iput-object v0, p0, Lu4/a$b;->e:Lo4/a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lu4/a$b;->f:Z

    iput-object v0, p0, Lu4/a$b;->g:Lo4/l;

    return-void
.end method

.method static synthetic a(Lu4/a$b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lu4/a$b;->a:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic b(Lu4/a$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lu4/a$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lu4/a$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lu4/a$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lu4/a$b;)Lo4/a;
    .locals 0

    iget-object p0, p0, Lu4/a$b;->e:Lo4/a;

    return-object p0
.end method

.method static synthetic e(Lu4/a$b;)Lo4/o;
    .locals 0

    iget-object p0, p0, Lu4/a$b;->h:Lo4/o;

    return-object p0
.end method

.method private g()Lo4/o;
    .locals 5

    iget-object v0, p0, Lu4/a$b;->g:Lo4/l;

    if-eqz v0, :cond_1

    invoke-static {}, Lo4/o;->i()Lo4/o;

    move-result-object v0

    iget-object v1, p0, Lu4/a$b;->g:Lo4/l;

    invoke-virtual {v0, v1}, Lo4/o;->a(Lo4/l;)Lo4/o;

    move-result-object v0

    invoke-virtual {v0}, Lo4/o;->d()Lo4/n;

    move-result-object v1

    invoke-virtual {v1}, Lo4/n;->i()LA4/D;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, LA4/D;->Y(I)LA4/D$c;

    move-result-object v1

    invoke-virtual {v1}, LA4/D$c;->Y()I

    move-result v1

    invoke-virtual {v0, v1}, Lo4/o;->h(I)Lo4/o;

    move-result-object v0

    new-instance v1, Lu4/d;

    iget-object v2, p0, Lu4/a$b;->a:Landroid/content/Context;

    iget-object v3, p0, Lu4/a$b;->b:Ljava/lang/String;

    iget-object v4, p0, Lu4/a$b;->c:Ljava/lang/String;

    invoke-direct {v1, v2, v3, v4}, Lu4/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lu4/a$b;->e:Lo4/a;

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lo4/o;->d()Lo4/n;

    move-result-object v2

    iget-object v3, p0, Lu4/a$b;->e:Lo4/a;

    invoke-virtual {v2, v1, v3}, Lo4/n;->r(Lo4/q;Lo4/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lo4/o;->d()Lo4/n;

    move-result-object v2

    invoke-static {v2, v1}, Lo4/c;->b(Lo4/n;Lo4/q;)V

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v1, "cannot read or generate keyset"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)[B
    .locals 1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    if-nez p2, :cond_0

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    :goto_0
    const/4 p2, 0x0

    :try_start_0
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    return-object p2

    :cond_1
    invoke-static {p0}, LB4/k;->a(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/io/CharConversionException;

    const-string/jumbo p2, "can\'t read keyset; the pref value %s is not a valid hex string"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p1, "keysetName cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private i([B)Lo4/o;
    .locals 0

    invoke-static {p1}, Lo4/b;->c([B)Lo4/p;

    move-result-object p1

    invoke-static {p1}, Lo4/c;->a(Lo4/p;)Lo4/n;

    move-result-object p1

    invoke-static {p1}, Lo4/o;->j(Lo4/n;)Lo4/o;

    move-result-object p1

    return-object p1
.end method

.method private j([B)Lo4/o;
    .locals 3

    :try_start_0
    new-instance v0, Lu4/c;

    invoke-direct {v0}, Lu4/c;-><init>()V

    iget-object v1, p0, Lu4/a$b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lu4/c;->b(Ljava/lang/String;)Lo4/a;

    move-result-object v0

    iput-object v0, p0, Lu4/a$b;->e:Lo4/a;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_3

    :try_start_1
    invoke-static {p1}, Lo4/b;->c([B)Lo4/p;

    move-result-object v0

    iget-object v1, p0, Lu4/a$b;->e:Lo4/a;

    invoke-static {v0, v1}, Lo4/n;->n(Lo4/p;Lo4/a;)Lo4/n;

    move-result-object v0

    invoke-static {v0}, Lo4/o;->j(Lo4/n;)Lo4/o;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    :try_start_2
    invoke-direct {p0, p1}, Lu4/a$b;->i([B)Lo4/o;

    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    return-object p1

    :catch_2
    throw v0

    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v0

    :goto_1
    :try_start_3
    invoke-direct {p0, p1}, Lu4/a$b;->i([B)Lo4/o;

    move-result-object p1

    invoke-static {}, Lu4/a;->c()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "cannot use Android Keystore, it\'ll be disabled"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    return-object p1

    :catch_5
    throw v0
.end method

.method private k()Lo4/a;
    .locals 5

    const-string/jumbo v0, "cannot use Android Keystore, it\'ll be disabled"

    invoke-static {}, Lu4/a;->b()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-static {}, Lu4/a;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Android Keystore requires at least Android M"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    :cond_0
    new-instance v1, Lu4/c;

    invoke-direct {v1}, Lu4/c;-><init>()V

    :try_start_0
    iget-object v3, p0, Lu4/a$b;->d:Ljava/lang/String;

    invoke-static {v3}, Lu4/c;->d(Ljava/lang/String;)Z

    move-result v3
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    iget-object v4, p0, Lu4/a$b;->d:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lu4/c;->b(Ljava/lang/String;)Lo4/a;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/ProviderException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    :goto_0
    if-eqz v3, :cond_1

    invoke-static {}, Lu4/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v2

    :cond_1
    new-instance v0, Ljava/security/KeyStoreException;

    iget-object v2, p0, Lu4/a$b;->d:Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string/jumbo v3, "the master key %s exists but is unusable"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v1

    :goto_1
    invoke-static {}, Lu4/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v2
.end method


# virtual methods
.method public declared-synchronized f()Lu4/a;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lu4/a$b;->b:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-static {}, Lu4/a;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lu4/a$b;->a:Landroid/content/Context;

    iget-object v2, p0, Lu4/a$b;->b:Ljava/lang/String;

    iget-object v3, p0, Lu4/a$b;->c:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lu4/a$b;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lu4/a$b;->d:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lu4/a$b;->k()Lo4/a;

    move-result-object v1

    iput-object v1, p0, Lu4/a$b;->e:Lo4/a;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_0
    :goto_0
    invoke-direct {p0}, Lu4/a$b;->g()Lo4/o;

    move-result-object v1

    iput-object v1, p0, Lu4/a$b;->h:Lo4/o;

    goto :goto_2

    :cond_1
    iget-object v2, p0, Lu4/a$b;->d:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-static {}, Lu4/a;->b()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-direct {p0, v1}, Lu4/a$b;->j([B)Lo4/o;

    move-result-object v1

    iput-object v1, p0, Lu4/a$b;->h:Lo4/o;

    goto :goto_2

    :cond_3
    :goto_1
    invoke-direct {p0, v1}, Lu4/a$b;->i([B)Lo4/o;

    move-result-object v1

    iput-object v1, p0, Lu4/a$b;->h:Lo4/o;

    :goto_2
    new-instance v1, Lu4/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lu4/a;-><init>(Lu4/a$b;Lu4/a$a;)V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v1

    :goto_3
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v1

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "keysetName cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_4
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public l(Lo4/l;)Lu4/a$b;
    .locals 0

    iput-object p1, p0, Lu4/a$b;->g:Lo4/l;

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lu4/a$b;
    .locals 1

    const-string/jumbo v0, "android-keystore://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lu4/a$b;->f:Z

    if-eqz v0, :cond_0

    iput-object p1, p0, Lu4/a$b;->d:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v0, "cannot call withMasterKeyUri() after calling doNotUseKeystore()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v0, "key URI must start with android-keystore://"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public n(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lu4/a$b;
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    iput-object p1, p0, Lu4/a$b;->a:Landroid/content/Context;

    iput-object p2, p0, Lu4/a$b;->b:Ljava/lang/String;

    iput-object p3, p0, Lu4/a$b;->c:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "need a keyset name"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "need an Android context"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
