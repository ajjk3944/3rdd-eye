.class public final LAg/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LAg/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LAg/e;

    invoke-direct {v0}, LAg/e;-><init>()V

    sput-object v0, LAg/e;->a:LAg/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/D;Lgg/D;)Lgg/z;
    .locals 1

    const-string v0, "s1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "s2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAg/e$a;->a:LAg/e$a;

    invoke-static {p1, p2, v0}, Lgg/z;->e0(Lgg/D;Lgg/D;Lkg/b;)Lgg/z;

    move-result-object p1

    const-string p2, "Single.zip(s1, s2, BiFun\u2026n { t, u -> Pair(t, u) })"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b(Lgg/D;Lgg/D;Lgg/D;)Lgg/z;
    .locals 1

    const-string v0, "s1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "s2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "s3"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAg/e$b;->a:LAg/e$b;

    invoke-static {p1, p2, p3, v0}, Lgg/z;->d0(Lgg/D;Lgg/D;Lgg/D;Lkg/g;)Lgg/z;

    move-result-object p1

    const-string p2, "Single.zip(s1, s2, s3, F\u2026 -> Triple(t1, t2, t3) })"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
