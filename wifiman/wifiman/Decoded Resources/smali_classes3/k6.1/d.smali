.class public final Lk6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk6/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk6/d$a;
    }
.end annotation


# static fields
.field private static final f:Lk6/d$a;


# instance fields
.field private a:Ljava/lang/Float;

.field private b:Ljava/lang/Float;

.field private c:Ljava/lang/Float;

.field private d:Ljava/lang/Float;

.field private e:Lx6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk6/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk6/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lk6/d;->f:Lk6/d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lk6/d;->f:Lk6/d$a;

    invoke-virtual {v0}, Lk6/d$a;->a()Lx6/b;

    move-result-object v0

    iput-object v0, p0, Lk6/d;->e:Lx6/b;

    return-void
.end method

.method public static synthetic l(Lk6/d;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lx6/b;ILjava/lang/Object;)Lk6/d;
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    invoke-virtual {p0}, Lk6/d;->f()Lx6/b;

    move-result-object p5

    :cond_4
    invoke-virtual/range {p0 .. p5}, Lk6/d;->k(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lx6/b;)Lk6/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()F
    .locals 1

    iget-object v0, p0, Lk6/d;->d:Ljava/lang/Float;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, Lk6/d;->b:Ljava/lang/Float;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()F
    .locals 1

    iget-object v0, p0, Lk6/d;->c:Ljava/lang/Float;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()F
    .locals 1

    invoke-virtual {p0}, Lk6/d;->f()Lx6/b;

    move-result-object v0

    invoke-interface {v0}, Lx6/b;->d()F

    move-result v0

    return v0
.end method

.method public e()F
    .locals 1

    iget-object v0, p0, Lk6/d;->a:Ljava/lang/Float;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f()Lx6/b;
    .locals 1

    iget-object v0, p0, Lk6/d;->e:Lx6/b;

    return-object v0
.end method

.method public g()I
    .locals 1

    invoke-static {p0}, Lk6/b$a;->a(Lk6/b;)I

    move-result v0

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lk6/d;->a:Ljava/lang/Float;

    if-nez v0, :cond_1

    iget-object v0, p0, Lk6/d;->b:Ljava/lang/Float;

    if-nez v0, :cond_1

    iget-object v0, p0, Lk6/d;->c:Ljava/lang/Float;

    if-nez v0, :cond_1

    iget-object v0, p0, Lk6/d;->d:Ljava/lang/Float;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final i()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lk6/d;->a:Ljava/lang/Float;

    iput-object v0, p0, Lk6/d;->b:Ljava/lang/Float;

    iput-object v0, p0, Lk6/d;->c:Ljava/lang/Float;

    iput-object v0, p0, Lk6/d;->d:Ljava/lang/Float;

    sget-object v0, Lk6/d;->f:Lk6/d$a;

    invoke-virtual {v0}, Lk6/d$a;->a()Lx6/b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lk6/d;->j(Lx6/b;)V

    return-void
.end method

.method public j(Lx6/b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lk6/d;->e:Lx6/b;

    return-void
.end method

.method public final k(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lx6/b;)Lk6/d;
    .locals 1

    const-string/jumbo v0, "chartEntryModel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    iget-object v0, p0, Lk6/d;->a:Ljava/lang/Float;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0}, Lk6/d;->e()F

    move-result v0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lk6/d;->a:Ljava/lang/Float;

    :cond_1
    if-eqz p2, :cond_3

    iget-object p1, p0, Lk6/d;->b:Ljava/lang/Float;

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0}, Lk6/d;->b()F

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    :cond_2
    iput-object p2, p0, Lk6/d;->b:Ljava/lang/Float;

    :cond_3
    if-eqz p3, :cond_5

    iget-object p1, p0, Lk6/d;->c:Ljava/lang/Float;

    if-eqz p1, :cond_4

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0}, Lk6/d;->c()F

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    :cond_4
    iput-object p3, p0, Lk6/d;->c:Ljava/lang/Float;

    :cond_5
    if-eqz p4, :cond_7

    iget-object p1, p0, Lk6/d;->d:Ljava/lang/Float;

    if-eqz p1, :cond_6

    invoke-virtual {p4}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0}, Lk6/d;->a()F

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p4

    :cond_6
    iput-object p4, p0, Lk6/d;->d:Ljava/lang/Float;

    :cond_7
    invoke-virtual {p0, p5}, Lk6/d;->j(Lx6/b;)V

    return-object p0
.end method
