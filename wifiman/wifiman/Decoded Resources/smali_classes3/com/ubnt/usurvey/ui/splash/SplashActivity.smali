.class public final Lcom/ubnt/usurvey/ui/splash/SplashActivity;
.super Lf8/h1;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "CustomSplashScreen"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/usurvey/ui/splash/SplashActivity$a;,
        Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/ubnt/usurvey/ui/splash/SplashActivity;",
        "Lf8/h1;",
        "<init>",
        "()V",
        "LC1/c;",
        "LYg/J;",
        "T1",
        "(LC1/c;)V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;",
        "n1",
        "LYg/m;",
        "R1",
        "()Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;",
        "controller",
        "o1",
        "b",
        "a",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final o1:Lcom/ubnt/usurvey/ui/splash/SplashActivity$a;

.field static final synthetic p1:[Lth/l;

.field public static final q1:I


# instance fields
.field private final n1:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-string/jumbo v1, "getController()Lcom/ubnt/usurvey/ui/splash/SplashActivity$Controller;"

    const/4 v2, 0x0

    const-class v3, Lcom/ubnt/usurvey/ui/splash/SplashActivity;

    const-string/jumbo v4, "controller"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, Lcom/ubnt/usurvey/ui/splash/SplashActivity;->p1:[Lth/l;

    new-instance v0, Lcom/ubnt/usurvey/ui/splash/SplashActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ubnt/usurvey/ui/splash/SplashActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ubnt/usurvey/ui/splash/SplashActivity;->o1:Lcom/ubnt/usurvey/ui/splash/SplashActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/ubnt/usurvey/ui/splash/SplashActivity;->q1:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lf8/h1;-><init>()V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lcom/ubnt/usurvey/ui/splash/SplashActivity$c;

    invoke-direct {v1}, Lcom/ubnt/usurvey/ui/splash/SplashActivity$c;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;

    invoke-direct {v0, v1, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v1, Lcom/ubnt/usurvey/ui/splash/SplashActivity;->p1:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lcom/ubnt/usurvey/ui/splash/SplashActivity;->n1:LYg/m;

    return-void
.end method

.method public static synthetic P1(Lcom/ubnt/usurvey/ui/splash/SplashActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/ubnt/usurvey/ui/splash/SplashActivity;->U1(Lcom/ubnt/usurvey/ui/splash/SplashActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic Q1()LYg/J;
    .locals 1

    invoke-static {}, Lcom/ubnt/usurvey/ui/splash/SplashActivity;->S1()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method private final R1()Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/splash/SplashActivity;->n1:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;

    return-object v0
.end method

.method private static final S1()LYg/J;
    .locals 2

    const-string/jumbo v0, "Splash screen APP Setup completed"

    const-string/jumbo v1, "SPLASH"

    invoke-static {v0, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private final T1(LC1/c;)V
    .locals 1

    new-instance v0, LF8/b;

    invoke-direct {v0, p0}, LF8/b;-><init>(Lcom/ubnt/usurvey/ui/splash/SplashActivity;)V

    invoke-virtual {p1, v0}, LC1/c;->c(LC1/c$d;)V

    return-void
.end method

.method private static final U1(Lcom/ubnt/usurvey/ui/splash/SplashActivity;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string/jumbo v2, "Splash screen check."

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/ubnt/usurvey/ui/splash/SplashActivity;->R1()Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string/jumbo v0, "Splash screen dismissed."

    const-string/jumbo v1, "SPLASH"

    invoke-static {v0, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lcom/ubnt/usurvey/ui/splash/SplashActivity;->R1()Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;

    move-result-object p0

    invoke-interface {p0}, Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;->b()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    sget-object v0, LC1/c;->b:LC1/c$a;

    invoke-virtual {v0, p0}, LC1/c$a;->a(Landroid/app/Activity;)LC1/c;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ubnt/usurvey/ui/splash/SplashActivity;->T1(LC1/c;)V

    invoke-super {p0, p1}, Lf8/h1;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/ubnt/usurvey/ui/splash/SplashActivity;->R1()Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;

    move-result-object p1

    invoke-interface {p1}, Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;->a()Lgg/b;

    move-result-object v1

    sget-object v2, Lh8/c;->DESTROYED:Lh8/c;

    new-instance v5, LF8/a;

    invoke-direct {v5}, LF8/a;-><init>()V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lh8/k$a;->o(Lh8/k;Lgg/b;Lh8/c;Lmh/l;ZLmh/a;ILjava/lang/Object;)V

    return-void
.end method
