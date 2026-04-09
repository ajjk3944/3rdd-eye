.class public final LL8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LL8/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL8/d;

    invoke-direct {v0}, LL8/d;-><init>()V

    sput-object v0, LL8/d;->a:LL8/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)Ljava/time/Duration;
    .locals 0

    invoke-static {p0, p1}, LL8/d;->c(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)Ljava/time/Duration;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)Ljava/time/Duration;
    .locals 2

    invoke-static {p0, p1}, Ljava/time/Duration;->between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;

    move-result-object p0

    invoke-static {p0}, Lj$/time/DesugarDuration;->toDaysPart(Ljava/time/Duration;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ljava/time/Duration;->minusDays(J)Ljava/time/Duration;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LYg/m;)Ljava/time/Duration;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/time/Duration;

    return-object p0
.end method


# virtual methods
.method public final b(J)Ls9/d;
    .locals 5

    const/16 v0, 0x3e8

    int-to-long v0, v0

    div-long/2addr p1, v0

    invoke-static {}, Ljava/time/LocalDateTime;->now()Ljava/time/LocalDateTime;

    move-result-object v0

    invoke-static {}, Ljava/time/LocalDateTime;->now()Ljava/time/LocalDateTime;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/time/LocalDateTime;->minusSeconds(J)Ljava/time/LocalDateTime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    move-result-object v2

    invoke-virtual {v0}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/time/Period;->between(Ljava/time/LocalDate;Ljava/time/LocalDate;)Ljava/time/Period;

    move-result-object v2

    new-instance v3, LL8/c;

    invoke-direct {v3, v1, v0}, LL8/c;-><init>(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)V

    invoke-static {v3}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    invoke-virtual {v2}, Ljava/time/Period;->getYears()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v2}, Ljava/time/Period;->getYears()I

    move-result p1

    const p2, 0x7f0f0006

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/time/Period;->getMonths()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v2}, Ljava/time/Period;->getMonths()I

    move-result p1

    const p2, 0x7f0f0004

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/time/Period;->getDays()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v2}, Ljava/time/Period;->getDays()I

    move-result p1

    const p2, 0x7f0f0001

    goto :goto_0

    :cond_2
    invoke-static {v0}, LL8/d;->d(LYg/m;)Ljava/time/Duration;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Duration;->toHours()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_3

    invoke-static {v0}, LL8/d;->d(LYg/m;)Ljava/time/Duration;

    move-result-object p1

    invoke-static {p1}, Lj$/time/DesugarDuration;->toHoursPart(Ljava/time/Duration;)I

    move-result p1

    const p2, 0x7f0f0002

    goto :goto_0

    :cond_3
    invoke-static {v0}, LL8/d;->d(LYg/m;)Ljava/time/Duration;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Duration;->toMinutes()J

    move-result-wide v1

    cmp-long v1, v1, v3

    if-lez v1, :cond_4

    invoke-static {v0}, LL8/d;->d(LYg/m;)Ljava/time/Duration;

    move-result-object p1

    invoke-static {p1}, Lj$/time/DesugarDuration;->toMinutesPart(Ljava/time/Duration;)I

    move-result p1

    const p2, 0x7f0f0003

    goto :goto_0

    :cond_4
    long-to-int p1, p1

    const p2, 0x7f0f0005

    :goto_0
    new-instance v0, Ls9/d$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, LL8/d$a;

    invoke-direct {v2, p2, p1}, LL8/d$a;-><init>(II)V

    invoke-direct {v0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    return-object v0
.end method
