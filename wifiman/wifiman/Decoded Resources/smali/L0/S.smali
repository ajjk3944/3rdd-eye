.class public final LL0/S;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL0/S$a;
    }
.end annotation


# static fields
.field public static final b:LL0/S$a;

.field private static final c:J


# instance fields
.field private final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LL0/S$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LL0/S$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LL0/S;->b:LL0/S$a;

    const/4 v0, 0x0

    invoke-static {v0}, LL0/T;->a(I)J

    move-result-wide v0

    sput-wide v0, LL0/S;->c:J

    return-void
.end method

.method private synthetic constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LL0/S;->a:J

    return-void
.end method

.method public static final synthetic a()J
    .locals 2

    sget-wide v0, LL0/S;->c:J

    return-wide v0
.end method

.method public static final synthetic b(J)LL0/S;
    .locals 1

    new-instance v0, LL0/S;

    invoke-direct {v0, p0, p1}, LL0/S;-><init>(J)V

    return-object v0
.end method

.method public static c(J)J
    .locals 0

    return-wide p0
.end method

.method public static final d(JJ)Z
    .locals 2

    invoke-static {p0, p1}, LL0/S;->l(J)I

    move-result v0

    invoke-static {p2, p3}, LL0/S;->l(J)I

    move-result v1

    if-gt v0, v1, :cond_0

    invoke-static {p2, p3}, LL0/S;->k(J)I

    move-result p2

    invoke-static {p0, p1}, LL0/S;->k(J)I

    move-result p0

    if-gt p2, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final e(JI)Z
    .locals 1

    invoke-static {p0, p1}, LL0/S;->l(J)I

    move-result v0

    invoke-static {p0, p1}, LL0/S;->k(J)I

    move-result p0

    const/4 p1, 0x0

    if-ge p2, p0, :cond_0

    if-gt v0, p2, :cond_0

    const/4 p1, 0x1

    :cond_0
    return p1
.end method

.method public static f(JLjava/lang/Object;)Z
    .locals 4

    instance-of v0, p2, LL0/S;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p2, LL0/S;

    invoke-virtual {p2}, LL0/S;->r()J

    move-result-wide v2

    cmp-long p0, p0, v2

    if-eqz p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final g(JJ)Z
    .locals 0

    cmp-long p0, p0, p2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final h(J)Z
    .locals 1

    invoke-static {p0, p1}, LL0/S;->n(J)I

    move-result v0

    invoke-static {p0, p1}, LL0/S;->i(J)I

    move-result p0

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final i(J)I
    .locals 2

    const-wide v0, 0xffffffffL

    and-long/2addr p0, v0

    long-to-int p0, p0

    return p0
.end method

.method public static final j(J)I
    .locals 1

    invoke-static {p0, p1}, LL0/S;->k(J)I

    move-result v0

    invoke-static {p0, p1}, LL0/S;->l(J)I

    move-result p0

    sub-int/2addr v0, p0

    return v0
.end method

.method public static final k(J)I
    .locals 2

    invoke-static {p0, p1}, LL0/S;->n(J)I

    move-result v0

    invoke-static {p0, p1}, LL0/S;->i(J)I

    move-result v1

    if-le v0, v1, :cond_0

    invoke-static {p0, p1}, LL0/S;->n(J)I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LL0/S;->i(J)I

    move-result p0

    :goto_0
    return p0
.end method

.method public static final l(J)I
    .locals 2

    invoke-static {p0, p1}, LL0/S;->n(J)I

    move-result v0

    invoke-static {p0, p1}, LL0/S;->i(J)I

    move-result v1

    if-le v0, v1, :cond_0

    invoke-static {p0, p1}, LL0/S;->i(J)I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LL0/S;->n(J)I

    move-result p0

    :goto_0
    return p0
.end method

.method public static final m(J)Z
    .locals 1

    invoke-static {p0, p1}, LL0/S;->n(J)I

    move-result v0

    invoke-static {p0, p1}, LL0/S;->i(J)I

    move-result p0

    if-le v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final n(J)I
    .locals 1

    const/16 v0, 0x20

    shr-long/2addr p0, v0

    long-to-int p0, p0

    return p0
.end method

.method public static o(J)I
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Long;->hashCode(J)I

    move-result p0

    return p0
.end method

.method public static final p(JJ)Z
    .locals 2

    invoke-static {p0, p1}, LL0/S;->l(J)I

    move-result v0

    invoke-static {p2, p3}, LL0/S;->k(J)I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-static {p2, p3}, LL0/S;->l(J)I

    move-result p2

    invoke-static {p0, p1}, LL0/S;->k(J)I

    move-result p0

    if-ge p2, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static q(J)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TextRange("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p1}, LL0/S;->n(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p1}, LL0/S;->i(J)I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    iget-wide v0, p0, LL0/S;->a:J

    invoke-static {v0, v1, p1}, LL0/S;->f(JLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, LL0/S;->a:J

    invoke-static {v0, v1}, LL0/S;->o(J)I

    move-result v0

    return v0
.end method

.method public final synthetic r()J
    .locals 2

    iget-wide v0, p0, LL0/S;->a:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, LL0/S;->a:J

    invoke-static {v0, v1}, LL0/S;->q(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
