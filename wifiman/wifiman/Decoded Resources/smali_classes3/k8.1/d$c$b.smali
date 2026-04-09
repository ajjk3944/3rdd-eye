.class public final Lk8/d$c$b;
.super Lk8/d$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk8/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final b:D

.field private final c:I

.field private final d:Lmh/l;

.field private final e:Ljava/text/NumberFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(DILmh/l;Ljava/text/NumberFormat;)V
    .locals 1

    const-string/jumbo v0, "fromMeters"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "defaultNumberFormat"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, v0}, Lk8/d$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    iput-wide p1, p0, Lk8/d$c$b;->b:D

    .line 8
    iput p3, p0, Lk8/d$c$b;->c:I

    .line 9
    iput-object p4, p0, Lk8/d$c$b;->d:Lmh/l;

    .line 10
    iput-object p5, p0, Lk8/d$c$b;->e:Ljava/text/NumberFormat;

    return-void
.end method

.method public synthetic constructor <init>(DILmh/l;Ljava/text/NumberFormat;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const p3, 0x7f1103bb

    :cond_0
    move v3, p3

    and-int/lit8 p3, p6, 0x4

    if-eqz p3, :cond_1

    .line 1
    new-instance p4, Lk8/h;

    invoke-direct {p4}, Lk8/h;-><init>()V

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_2

    .line 2
    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p3}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object p5

    const/4 p3, 0x0

    .line 3
    invoke-virtual {p5, p3}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 4
    invoke-virtual {p5, p3}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-wide v1, p1

    .line 5
    invoke-direct/range {v0 .. v5}, Lk8/d$c$b;-><init>(DILmh/l;Ljava/text/NumberFormat;)V

    return-void
.end method

.method public static synthetic j(D)D
    .locals 0

    invoke-static {p0, p1}, Lk8/d$c$b;->k(D)D

    move-result-wide p0

    return-wide p0
.end method

.method private static final k(D)D
    .locals 0

    return-wide p0
.end method


# virtual methods
.method public e()Ljava/text/NumberFormat;
    .locals 1

    iget-object v0, p0, Lk8/d$c$b;->e:Ljava/text/NumberFormat;

    return-object v0
.end method

.method protected f()Lmh/l;
    .locals 1

    iget-object v0, p0, Lk8/d$c$b;->d:Lmh/l;

    return-object v0
.end method

.method public g()D
    .locals 2

    iget-wide v0, p0, Lk8/d$c$b;->b:D

    return-wide v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lk8/d$c$b;->c:I

    return v0
.end method
