.class public final LD9/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD9/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LD9/o$a;-><init>()V

    return-void
.end method

.method public static synthetic a(LT/q0;)LD9/o;
    .locals 0

    invoke-static {p0}, LD9/o$a;->e(LT/q0;)LD9/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc0/m;LD9/o;)LT/q0;
    .locals 0

    invoke-static {p0, p1}, LD9/o$a;->d(Lc0/m;LD9/o;)LT/q0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lc0/m;LD9/o;)LT/q0;
    .locals 1

    const-string v0, "$this$Saver"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LD9/o;->a(LD9/o;)LT/q0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LT/q0;)LD9/o;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LD9/o;

    invoke-direct {v0, p0}, LD9/o;-><init>(LT/q0;)V

    return-object v0
.end method


# virtual methods
.method public final c()Lc0/k;
    .locals 2

    new-instance v0, LD9/m;

    invoke-direct {v0}, LD9/m;-><init>()V

    new-instance v1, LD9/n;

    invoke-direct {v1}, LD9/n;-><init>()V

    invoke-static {v0, v1}, Lc0/l;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object v0

    return-object v0
.end method
