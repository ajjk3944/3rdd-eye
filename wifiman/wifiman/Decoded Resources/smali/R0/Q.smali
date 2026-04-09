.class public final LR0/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR0/Q$c;
    }
.end annotation


# static fields
.field public static final d:LR0/Q$c;

.field private static final e:Lc0/k;


# instance fields
.field private final a:LL0/d;

.field private final b:J

.field private final c:LL0/S;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LR0/Q$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LR0/Q$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LR0/Q;->d:LR0/Q$c;

    sget-object v0, LR0/Q$a;->a:LR0/Q$a;

    sget-object v1, LR0/Q$b;->a:LR0/Q$b;

    invoke-static {v0, v1}, Lc0/l;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object v0

    sput-object v0, LR0/Q;->e:Lc0/k;

    return-void
.end method

.method private constructor <init>(LL0/d;JLL0/S;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LR0/Q;->a:LL0/d;

    .line 5
    invoke-virtual {p0}, LR0/Q;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p2, p3, v0, p1}, LL0/T;->c(JII)J

    move-result-wide p1

    iput-wide p1, p0, LR0/Q;->b:J

    if-eqz p4, :cond_0

    .line 6
    invoke-virtual {p4}, LL0/S;->r()J

    move-result-wide p1

    invoke-virtual {p0}, LR0/Q;->i()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    invoke-static {p1, p2, v0, p3}, LL0/T;->c(JII)J

    move-result-wide p1

    invoke-static {p1, p2}, LL0/S;->b(J)LL0/S;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LR0/Q;->c:LL0/S;

    return-void
.end method

.method public synthetic constructor <init>(LL0/d;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 7
    sget-object p2, LL0/S;->b:LL0/S$a;

    invoke-virtual {p2}, LL0/S$a;->a()J

    move-result-wide p2

    :cond_0
    move-wide v2, p2

    and-int/lit8 p2, p5, 0x4

    if-eqz p2, :cond_1

    const/4 p4, 0x0

    :cond_1
    move-object v4, p4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 8
    invoke-direct/range {v0 .. v5}, LR0/Q;-><init>(LL0/d;JLL0/S;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(LL0/d;JLL0/S;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LR0/Q;-><init>(LL0/d;JLL0/S;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;JLL0/S;)V
    .locals 7

    .line 12
    new-instance v6, LL0/d;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, p0

    move-object v1, v6

    move-wide v2, p2

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, LR0/Q;-><init>(LL0/d;JLL0/S;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 9
    const-string p1, ""

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_1

    .line 10
    sget-object p1, LL0/S;->b:LL0/S$a;

    invoke-virtual {p1}, LL0/S$a;->a()J

    move-result-wide p2

    :cond_1
    move-wide v2, p2

    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_2

    const/4 p4, 0x0

    :cond_2
    move-object v4, p4

    const/4 v5, 0x0

    move-object v0, p0

    .line 11
    invoke-direct/range {v0 .. v5}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLL0/S;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;)V

    return-void
.end method

.method public static final synthetic a()Lc0/k;
    .locals 1

    sget-object v0, LR0/Q;->e:Lc0/k;

    return-object v0
.end method

.method public static synthetic d(LR0/Q;LL0/d;JLL0/S;ILjava/lang/Object;)LR0/Q;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, LR0/Q;->a:LL0/d;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-wide p2, p0, LR0/Q;->b:J

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, LR0/Q;->c:LL0/S;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, LR0/Q;->b(LL0/d;JLL0/S;)LR0/Q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LR0/Q;Ljava/lang/String;JLL0/S;ILjava/lang/Object;)LR0/Q;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    iget-wide p2, p0, LR0/Q;->b:J

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    iget-object p4, p0, LR0/Q;->c:LL0/S;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, LR0/Q;->c(Ljava/lang/String;JLL0/S;)LR0/Q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(LL0/d;JLL0/S;)LR0/Q;
    .locals 7

    new-instance v6, LR0/Q;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, LR0/Q;-><init>(LL0/d;JLL0/S;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final c(Ljava/lang/String;JLL0/S;)LR0/Q;
    .locals 8

    new-instance v6, LR0/Q;

    new-instance v7, LL0/d;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v6

    move-object v1, v7

    move-wide v2, p2

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, LR0/Q;-><init>(LL0/d;JLL0/S;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LR0/Q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-wide v3, p0, LR0/Q;->b:J

    check-cast p1, LR0/Q;

    iget-wide v5, p1, LR0/Q;->b:J

    invoke-static {v3, v4, v5, v6}, LL0/S;->g(JJ)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LR0/Q;->c:LL0/S;

    iget-object v3, p1, LR0/Q;->c:LL0/S;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LR0/Q;->a:LL0/d;

    iget-object p1, p1, LR0/Q;->a:LL0/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public final f()LL0/d;
    .locals 1

    iget-object v0, p0, LR0/Q;->a:LL0/d;

    return-object v0
.end method

.method public final g()LL0/S;
    .locals 1

    iget-object v0, p0, LR0/Q;->c:LL0/S;

    return-object v0
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, LR0/Q;->b:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LR0/Q;->a:LL0/d;

    invoke-virtual {v0}, LL0/d;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LR0/Q;->b:J

    invoke-static {v1, v2}, LL0/S;->o(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LR0/Q;->c:LL0/S;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LL0/S;->r()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->o(J)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LR0/Q;->a:LL0/d;

    invoke-virtual {v0}, LL0/d;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TextFieldValue(text=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LR0/Q;->a:LL0/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\', selection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LR0/Q;->b:J

    invoke-static {v1, v2}, LL0/S;->q(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", composition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LR0/Q;->c:LL0/S;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
