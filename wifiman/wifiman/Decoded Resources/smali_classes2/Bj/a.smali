.class public abstract LBj/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAj/f;
.implements LAj/b;


# static fields
.field private static final n:Ljava/util/regex/Pattern;


# instance fields
.field private a:Ljava/util/Locale;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "\\s{2,}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, LBj/a;->n:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LBj/a;->b:Ljava/lang/String;

    iput-object v0, p0, LBj/a;->c:Ljava/lang/String;

    iput-object v0, p0, LBj/a;->d:Ljava/lang/String;

    iput-object v0, p0, LBj/a;->e:Ljava/lang/String;

    iput-object v0, p0, LBj/a;->f:Ljava/lang/String;

    iput-object v0, p0, LBj/a;->g:Ljava/lang/String;

    iput-object v0, p0, LBj/a;->h:Ljava/lang/String;

    iput-object v0, p0, LBj/a;->i:Ljava/lang/String;

    iput-object v0, p0, LBj/a;->j:Ljava/lang/String;

    iput-object v0, p0, LBj/a;->k:Ljava/lang/String;

    iput-object v0, p0, LBj/a;->l:Ljava/lang/String;

    const/16 v0, 0x32

    iput v0, p0, LBj/a;->m:I

    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0, p3, p4}, LBj/a;->h(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "%s"

    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LBj/a;->a:Ljava/util/Locale;

    const-string v1, "%d"

    if-eqz v0, :cond_0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {v0, v1, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {v1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    :goto_0
    const-string p4, "%n"

    invoke-virtual {p1, p4, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "%u"

    invoke-virtual {p1, p3, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private e(LAj/a;Z)Ljava/lang/String;
    .locals 2

    invoke-direct {p0, p1}, LBj/a;->k(LAj/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2}, LBj/a;->f(LAj/a;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, p2}, LBj/a;->j(LAj/a;Z)J

    move-result-wide p1

    invoke-direct {p0, v0, v1, p1, p2}, LBj/a;->d(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private i(LAj/a;)Ljava/lang/String;
    .locals 1

    invoke-interface {p1}, LAj/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LBj/a;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, LBj/a;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object p1, p0, LBj/a;->e:Ljava/lang/String;

    return-object p1

    :cond_0
    invoke-interface {p1}, LAj/a;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LBj/a;->g:Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object p1, p0, LBj/a;->f:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    iget-object p1, p0, LBj/a;->g:Ljava/lang/String;

    return-object p1

    :cond_1
    iget-object p1, p0, LBj/a;->c:Ljava/lang/String;

    return-object p1
.end method

.method private k(LAj/a;)Ljava/lang/String;
    .locals 4

    invoke-interface {p1}, LAj/a;->c()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    const-string p1, "-"

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method private l(LAj/a;)Ljava/lang/String;
    .locals 1

    invoke-interface {p1}, LAj/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LBj/a;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object p1, p0, LBj/a;->d:Ljava/lang/String;

    return-object p1

    :cond_0
    invoke-interface {p1}, LAj/a;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LBj/a;->f:Ljava/lang/String;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    iget-object p1, p0, LBj/a;->f:Ljava/lang/String;

    return-object p1

    :cond_1
    iget-object p1, p0, LBj/a;->b:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public a(LAj/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, LAj/a;->e()Z

    move-result p1

    const-string v1, " "

    if-eqz p1, :cond_0

    iget-object p1, p0, LBj/a;->k:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LBj/a;->l:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    iget-object p1, p0, LBj/a;->i:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LBj/a;->j:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    sget-object p1, LBj/a;->n:Ljava/util/regex/Pattern;

    invoke-virtual {p1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(LAj/a;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LBj/a;->e(LAj/a;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/util/Locale;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LBj/a;->r(Ljava/util/Locale;)LBj/a;

    move-result-object p1

    return-object p1
.end method

.method protected f(LAj/a;Z)Ljava/lang/String;
    .locals 1

    invoke-direct {p0, p1}, LBj/a;->l(LAj/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2}, LBj/a;->m(LAj/a;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, LBj/a;->i(LAj/a;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LBj/a;->h:Ljava/lang/String;

    return-object v0
.end method

.method protected h(J)Ljava/lang/String;
    .locals 0

    iget-object p1, p0, LBj/a;->h:Ljava/lang/String;

    return-object p1
.end method

.method protected j(LAj/a;Z)J
    .locals 0

    if-eqz p2, :cond_0

    iget p2, p0, LBj/a;->m:I

    invoke-interface {p1, p2}, LAj/a;->d(I)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LAj/a;->c()J

    move-result-wide p1

    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    return-wide p1
.end method

.method protected m(LAj/a;Z)Z
    .locals 2

    invoke-virtual {p0, p1, p2}, LBj/a;->j(LAj/a;Z)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x1

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public n(Ljava/lang/String;)LBj/a;
    .locals 0

    iput-object p1, p0, LBj/a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public o(Ljava/lang/String;)LBj/a;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LBj/a;->i:Ljava/lang/String;

    return-object p0
.end method

.method public p(Ljava/lang/String;)LBj/a;
    .locals 0

    iput-object p1, p0, LBj/a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public q(Ljava/lang/String;)LBj/a;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LBj/a;->j:Ljava/lang/String;

    return-object p0
.end method

.method public r(Ljava/util/Locale;)LBj/a;
    .locals 0

    iput-object p1, p0, LBj/a;->a:Ljava/util/Locale;

    return-object p0
.end method

.method public s(Ljava/lang/String;)LBj/a;
    .locals 0

    iput-object p1, p0, LBj/a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public t(Ljava/lang/String;)LBj/a;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LBj/a;->k:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SimpleTimeFormat [pattern="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LBj/a;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", futurePrefix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LBj/a;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", futureSuffix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LBj/a;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pastPrefix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LBj/a;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pastSuffix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LBj/a;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", roundingTolerance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LBj/a;->m:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/String;)LBj/a;
    .locals 0

    iput-object p1, p0, LBj/a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public v(Ljava/lang/String;)LBj/a;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LBj/a;->l:Ljava/lang/String;

    return-object p0
.end method

.method public w(Ljava/lang/String;)LBj/a;
    .locals 0

    iput-object p1, p0, LBj/a;->h:Ljava/lang/String;

    return-object p0
.end method

.method public x(Ljava/lang/String;)LBj/a;
    .locals 0

    iput-object p1, p0, LBj/a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public y(Ljava/lang/String;)LBj/a;
    .locals 0

    iput-object p1, p0, LBj/a;->b:Ljava/lang/String;

    return-object p0
.end method
