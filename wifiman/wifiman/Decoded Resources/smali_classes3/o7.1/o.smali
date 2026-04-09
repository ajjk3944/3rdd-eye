.class public final Lo7/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo7/o;

.field private static b:Li9/a;

.field private static c:Ljava/lang/String;

.field private static d:Z

.field public static e:Landroid/content/Context;

.field private static f:Lo7/q;

.field private static g:Lo7/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo7/o;

    invoke-direct {v0}, Lo7/o;-><init>()V

    sput-object v0, Lo7/o;->a:Lo7/o;

    const-string v0, "Discovery LIB"

    sput-object v0, Lo7/o;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Li9/a;
    .locals 1

    sget-object v0, Lo7/o;->b:Li9/a;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lo7/o;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lo7/b;
    .locals 1

    sget-object v0, Lo7/o;->g:Lo7/b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "services"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Lo7/q;
    .locals 1

    sget-object v0, Lo7/o;->f:Lo7/q;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "systemInfo"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e(Landroid/content/Context;)V
    .locals 3

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "context.applicationContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lo7/o;->f(Landroid/content/Context;)V

    sget-object v0, Lo7/q;->a:Lo7/q$a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lo7/q$a;->a(Landroid/content/Context;)Lo7/q;

    move-result-object v0

    sput-object v0, Lo7/o;->f:Lo7/q;

    sget-object v0, Lo7/b;->a:Lo7/b$a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo7/o;->d()Lo7/q;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lo7/b$a;->a(Landroid/content/Context;Lo7/q;)Lo7/b;

    move-result-object p1

    sput-object p1, Lo7/o;->g:Lo7/b;

    const/4 p1, 0x1

    sput-boolean p1, Lo7/o;->d:Z

    return-void
.end method

.method public final f(Landroid/content/Context;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lo7/o;->e:Landroid/content/Context;

    return-void
.end method
