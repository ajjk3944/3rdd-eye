.class public final LQ7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ7/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ7/d$a;
    }
.end annotation


# static fields
.field public static final d:LQ7/d$a;


# instance fields
.field private final a:Lcom/google/firebase/crashlytics/a;

.field private final b:LSj/a$c;

.field private final c:Landroid/content/pm/PackageManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LQ7/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQ7/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LQ7/d;->d:LQ7/d$a;

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/crashlytics/a;LSj/a$c;Landroid/content/pm/PackageManager;)V
    .locals 1

    const-string/jumbo v0, "crashlytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tree"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "packageManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ7/d;->a:Lcom/google/firebase/crashlytics/a;

    iput-object p2, p0, LQ7/d;->b:LSj/a$c;

    iput-object p3, p0, LQ7/d;->c:Landroid/content/pm/PackageManager;

    return-void
.end method

.method private final c(Landroid/content/Context;)V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    :try_start_0
    iget-object v0, p0, LQ7/d;->c:Landroid/content/pm/PackageManager;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, LQ7/b;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/InstallSourceInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, LQ7/c;->a(Landroid/content/pm/InstallSourceInfo;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, LQ7/d;->c:Landroid/content/pm/PackageManager;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_1
    :goto_0
    iget-object p1, p0, LQ7/d;->a:Lcom/google/firebase/crashlytics/a;

    if-nez v2, :cond_2

    const-string/jumbo v2, "unavailable/uninstalled"

    :cond_2
    const-string/jumbo v0, "installer_package"

    invoke-virtual {p1, v0, v2}, Lcom/google/firebase/crashlytics/a;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LQ7/d;->a:Lcom/google/firebase/crashlytics/a;

    invoke-virtual {v1, p1}, Lcom/google/firebase/crashlytics/a;->i(Ljava/lang/String;)V

    iget-object v1, p0, LQ7/d;->a:Lcom/google/firebase/crashlytics/a;

    invoke-virtual {v1, v0, p1}, Lcom/google/firebase/crashlytics/a;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 2

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQ7/d;->a:Lcom/google/firebase/crashlytics/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/firebase/crashlytics/a;->g(Z)V

    invoke-direct {p0, p1}, LQ7/d;->c(Landroid/content/Context;)V

    sget-object p1, LSj/a;->a:LSj/a$b;

    iget-object v0, p0, LQ7/d;->b:LSj/a$c;

    invoke-virtual {p1, v0}, LSj/a$b;->q(LSj/a$c;)V

    return-void
.end method
