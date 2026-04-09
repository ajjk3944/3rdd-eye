.class public final LW5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW5/a$a;,
        LW5/a$b;,
        LW5/a$c;,
        LW5/a$d;,
        LW5/a$e;
    }
.end annotation


# static fields
.field public static final f:LW5/a$c;

.field public static final g:I


# instance fields
.field private final a:LW5/a$a;

.field private final b:LW5/a$b;

.field private final c:LW5/a$d;

.field private final d:LW5/a$e;

.field private final e:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LW5/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW5/a$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LW5/a;->f:LW5/a$c;

    const/16 v0, 0x8

    sput v0, LW5/a;->g:I

    return-void
.end method

.method private constructor <init>(LW5/a$a;LW5/a$b;LW5/a$d;LW5/a$e;J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LW5/a;->a:LW5/a$a;

    .line 4
    iput-object p2, p0, LW5/a;->b:LW5/a$b;

    .line 5
    iput-object p3, p0, LW5/a;->c:LW5/a$d;

    .line 6
    iput-object p4, p0, LW5/a;->d:LW5/a$e;

    .line 7
    iput-wide p5, p0, LW5/a;->e:J

    return-void
.end method

.method public synthetic constructor <init>(LW5/a$a;LW5/a$b;LW5/a$d;LW5/a$e;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, LW5/a;-><init>(LW5/a$a;LW5/a$b;LW5/a$d;LW5/a$e;J)V

    return-void
.end method


# virtual methods
.method public final a()LW5/a$a;
    .locals 1

    iget-object v0, p0, LW5/a;->a:LW5/a$a;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, LW5/a;->e:J

    return-wide v0
.end method

.method public final c()LW5/a$d;
    .locals 1

    iget-object v0, p0, LW5/a;->c:LW5/a$d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LW5/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LW5/a;

    iget-object v1, p0, LW5/a;->a:LW5/a$a;

    iget-object v3, p1, LW5/a;->a:LW5/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LW5/a;->b:LW5/a$b;

    iget-object v3, p1, LW5/a;->b:LW5/a$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LW5/a;->c:LW5/a$d;

    iget-object v3, p1, LW5/a;->c:LW5/a$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LW5/a;->d:LW5/a$e;

    iget-object v3, p1, LW5/a;->d:LW5/a$e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, LW5/a;->e:J

    iget-wide v5, p1, LW5/a;->e:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LW5/a;->a:LW5/a$a;

    invoke-virtual {v0}, LW5/a$a;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LW5/a;->b:LW5/a$b;

    invoke-virtual {v1}, LW5/a$b;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LW5/a;->c:LW5/a$d;

    invoke-virtual {v1}, LW5/a$d;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LW5/a;->d:LW5/a$e;

    invoke-virtual {v1}, LW5/a$e;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LW5/a;->e:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ChartStyle(axis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LW5/a;->a:LW5/a$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", columnChart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LW5/a;->b:LW5/a$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lineChart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LW5/a;->c:LW5/a$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", marker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LW5/a;->d:LW5/a$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", elevationOverlayColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LW5/a;->e:J

    invoke-static {v1, v2}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
