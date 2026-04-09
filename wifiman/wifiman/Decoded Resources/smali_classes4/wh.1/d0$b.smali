.class public abstract Lwh/d0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "b"
.end annotation


# static fields
.field static final synthetic c:[Lth/l;


# instance fields
.field private final a:Lwh/a1$a;

.field final synthetic b:Lwh/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lwh/d0$b;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v2, "moduleData"

    const-string v3, "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lwh/d0$b;->c:[Lth/l;

    return-void
.end method

.method public constructor <init>(Lwh/d0;)V
    .locals 1

    iput-object p1, p0, Lwh/d0$b;->b:Lwh/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwh/e0;

    invoke-direct {v0, p1}, Lwh/e0;-><init>(Lwh/d0;)V

    invoke-static {v0}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object p1

    iput-object p1, p0, Lwh/d0$b;->a:Lwh/a1$a;

    return-void
.end method

.method static synthetic a(Lwh/d0;)LFh/k;
    .locals 0

    invoke-static {p0}, Lwh/d0$b;->c(Lwh/d0;)LFh/k;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lwh/d0;)LFh/k;
    .locals 0

    invoke-interface {p0}, Lkotlin/jvm/internal/h;->b()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Lwh/Z0;->a(Ljava/lang/Class;)LFh/k;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()LFh/k;
    .locals 3

    iget-object v0, p0, Lwh/d0$b;->a:Lwh/a1$a;

    sget-object v1, Lwh/d0$b;->c:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lwh/a1$b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LFh/k;

    return-object v0
.end method
