.class public final Lcom/ui/wmw/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wmw/WMWizard$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wmw/a$a;
    }
.end annotation


# static fields
.field public static final i:Lcom/ui/wmw/a$a;


# instance fields
.field private final a:Lh9/a;

.field private final b:Lh9/a;

.field private final c:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;

.field private final d:Ljava/util/UUID;

.field private final e:Ljava/util/UUID;

.field private final f:Ljava/util/UUID;

.field private final g:Ljava/util/UUID;

.field private final h:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wmw/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wmw/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wmw/a;->i:Lcom/ui/wmw/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lh9/a;Lh9/a;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "btleMac"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/ui/wmw/a;->a:Lh9/a;

    iput-object p3, p0, Lcom/ui/wmw/a;->b:Lh9/a;

    sget-object p2, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->d:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a;

    invoke-virtual {p2, p1}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a;->b(Landroid/content/Context;)Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wmw/a;->c:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;

    const-string p1, "e0373cc2-d3bc-4eac-9c6e-423d0fe5d738"

    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p2

    const-string p3, "fromString(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LT8/a$c;->b(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object p2

    iput-object p2, p0, Lcom/ui/wmw/a;->d:Ljava/util/UUID;

    const-string p2, "d587c47f-ac6e-4388-a31c-e6cd380ba043"

    invoke-static {p2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p2

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LT8/a$a;->a(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object p2

    iput-object p2, p0, Lcom/ui/wmw/a;->e:Ljava/util/UUID;

    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LT8/a$c;->b(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wmw/a;->f:Ljava/util/UUID;

    const-string p1, "9280f26c-a56f-43ea-b769-d5d732e1ac67"

    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LT8/a$a;->a(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wmw/a;->g:Ljava/util/UUID;

    new-instance p1, Lcom/ui/wmw/a$e;

    invoke-direct {p1}, Lcom/ui/wmw/a$e;-><init>()V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/ui/wmw/a$b;

    invoke-direct {p2, p0}, Lcom/ui/wmw/a$b;-><init>(Lcom/ui/wmw/a;)V

    invoke-virtual {p1, p2}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wmw/a$c;->a:Lcom/ui/wmw/a$c;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wmw/a;->h:Lgg/i;

    return-void
.end method

.method public static final synthetic b(Lcom/ui/wmw/a;)Lh9/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wmw/a;->b:Lh9/a;

    return-object p0
.end method

.method public static final synthetic c(Lcom/ui/wmw/a;)Lgg/z;
    .locals 0

    invoke-direct {p0}, Lcom/ui/wmw/a;->h()Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/ui/wmw/a;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Lcom/ui/wmw/a;->e:Ljava/util/UUID;

    return-object p0
.end method

.method public static final synthetic e(Lcom/ui/wmw/a;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Lcom/ui/wmw/a;->d:Ljava/util/UUID;

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/wmw/a;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Lcom/ui/wmw/a;->g:Ljava/util/UUID;

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wmw/a;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Lcom/ui/wmw/a;->f:Ljava/util/UUID;

    return-object p0
.end method

.method private final h()Lgg/z;
    .locals 2

    iget-object v0, p0, Lcom/ui/wmw/a;->c:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;

    invoke-virtual {v0}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->getState()Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/a$d;

    invoke-direct {v1, p0}, Lcom/ui/wmw/a$d;-><init>(Lcom/ui/wmw/a;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    const-string v1, "firstOrError(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/a;->h:Lgg/i;

    return-object v0
.end method

.method public i()Lh9/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/a;->a:Lh9/a;

    return-object v0
.end method
