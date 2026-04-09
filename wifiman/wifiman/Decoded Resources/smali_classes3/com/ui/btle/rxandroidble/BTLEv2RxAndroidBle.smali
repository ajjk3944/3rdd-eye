.class public final Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a;,
        Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$Error;,
        Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$b;
    }
.end annotation


# static fields
.field public static final d:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a;

.field private static volatile e:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;


# instance fields
.field private final b:LG6/G;

.field private final c:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->d:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a;

    return-void
.end method

.method public constructor <init>(LG6/G;)V
    .locals 2

    const-string/jumbo v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->b:LG6/G;

    invoke-virtual {p1}, LG6/G;->d()Lgg/s;

    move-result-object p1

    new-instance v0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$c;

    invoke-direct {v0, p0}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$c;-><init>(Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lgg/s;->H0(Lgg/D;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->v()Lgg/s;

    move-result-object p1

    sget-object v0, Lcom/ui/btle/rxandroidble/a$a;->a:Lcom/ui/btle/rxandroidble/a$a;

    invoke-virtual {v0}, Lcom/ui/btle/rxandroidble/a$a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {p1, v1}, Lgg/s;->o0(Lgg/y;)Lgg/s;

    move-result-object p1

    new-instance v1, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$d;

    invoke-direct {v1, p0}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$d;-><init>(Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;)V

    invoke-virtual {p1, v1}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    sget-object v1, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e;->a:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$e;

    invoke-virtual {p1, v1}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object p1

    sget-object v1, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$f;->a:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$f;

    invoke-virtual {p1, v1}, Lgg/s;->G(Lkg/f;)Lgg/s;

    move-result-object p1

    new-instance v1, LU8/a;

    invoke-direct {v1}, LU8/a;-><init>()V

    invoke-virtual {p1, v1}, Lgg/s;->y(Lkg/a;)Lgg/s;

    move-result-object p1

    sget-object v1, Lgg/a;->LATEST:Lgg/a;

    invoke-virtual {p1, v1}, Lgg/s;->d1(Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {v0}, Lcom/ui/btle/rxandroidble/a$a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "client.observeStateChang\u2026)\n            .refCount()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->c:Lgg/i;

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->g()V

    return-void
.end method

.method public static final synthetic b(Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;LG6/G$a;)LT8/a$d;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->f(LG6/G$a;)LT8/a$d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;)LG6/G;
    .locals 0

    iget-object p0, p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->b:LG6/G;

    return-object p0
.end method

.method public static final synthetic d()Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;
    .locals 1

    sget-object v0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->e:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;

    return-object v0
.end method

.method public static final synthetic e(Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;)V
    .locals 0

    sput-object p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->e:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;

    return-void
.end method

.method private final f(LG6/G$a;)LT8/a$d;
    .locals 3

    sget-object v0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    new-instance p1, LT8/a$d$e;

    new-instance v0, LW8/c;

    iget-object v1, p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->b:LG6/G;

    invoke-direct {v0, v1}, LW8/c;-><init>(LG6/G;)V

    new-instance v1, LV8/f;

    iget-object v2, p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->b:LG6/G;

    invoke-direct {v1, v2}, LV8/f;-><init>(LG6/G;)V

    invoke-direct {p1, v0, v1}, LT8/a$d$e;-><init>(LT8/c;LT8/b$a;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, LT8/a$d$c;

    invoke-direct {p1}, LT8/a$d$c;-><init>()V

    goto :goto_0

    :cond_2
    new-instance p1, LT8/a$d$d;

    invoke-direct {p1}, LT8/a$d$d;-><init>()V

    goto :goto_0

    :cond_3
    new-instance p1, LT8/a$d$a;

    invoke-direct {p1}, LT8/a$d$a;-><init>()V

    goto :goto_0

    :cond_4
    new-instance p1, LT8/a$d$b;

    invoke-direct {p1}, LT8/a$d$b;-><init>()V

    :goto_0
    return-object p1
.end method

.method private static final g()V
    .locals 1

    sget-object v0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$g;->a:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$g;

    invoke-static {v0}, LX8/a;->c(Lmh/a;)V

    return-void
.end method


# virtual methods
.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->c:Lgg/i;

    return-object v0
.end method
