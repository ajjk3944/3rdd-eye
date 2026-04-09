.class public final Lnf/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnf/c$a;
    }
.end annotation


# static fields
.field public static final e:Lnf/c$a;


# instance fields
.field private final a:Z

.field private final b:Lnf/g;

.field private final c:Ls9/d;

.field private final d:Ls9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnf/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnf/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lnf/c;->e:Lnf/c$a;

    return-void
.end method

.method public constructor <init>(ZLnf/g;Ls9/d;Ls9/d;)V
    .locals 1

    const-string v0, "step"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unit"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lnf/c;->a:Z

    iput-object p2, p0, Lnf/c;->b:Lnf/g;

    iput-object p3, p0, Lnf/c;->c:Ls9/d;

    iput-object p4, p0, Lnf/c;->d:Ls9/d;

    return-void
.end method

.method public static synthetic b(Lnf/c;ZLnf/g;Ls9/d;Ls9/d;ILjava/lang/Object;)Lnf/c;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lnf/c;->a:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lnf/c;->b:Lnf/g;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lnf/c;->c:Ls9/d;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lnf/c;->d:Ls9/d;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lnf/c;->a(ZLnf/g;Ls9/d;Ls9/d;)Lnf/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ZLnf/g;Ls9/d;Ls9/d;)Lnf/c;
    .locals 1

    const-string v0, "step"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unit"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnf/c;

    invoke-direct {v0, p1, p2, p3, p4}, Lnf/c;-><init>(ZLnf/g;Ls9/d;Ls9/d;)V

    return-object v0
.end method

.method public final c()Lnf/g;
    .locals 1

    iget-object v0, p0, Lnf/c;->b:Lnf/g;

    return-object v0
.end method

.method public final d()Ls9/d;
    .locals 1

    iget-object v0, p0, Lnf/c;->d:Ls9/d;

    return-object v0
.end method

.method public final e()Ls9/d;
    .locals 1

    iget-object v0, p0, Lnf/c;->c:Ls9/d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnf/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lnf/c;

    iget-boolean v1, p0, Lnf/c;->a:Z

    iget-boolean v3, p1, Lnf/c;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lnf/c;->b:Lnf/g;

    iget-object v3, p1, Lnf/c;->b:Lnf/g;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lnf/c;->c:Ls9/d;

    iget-object v3, p1, Lnf/c;->c:Ls9/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lnf/c;->d:Ls9/d;

    iget-object p1, p1, Lnf/c;->d:Ls9/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lnf/c;->a:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lnf/c;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnf/c;->b:Lnf/g;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnf/c;->c:Ls9/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnf/c;->d:Ls9/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lnf/c;->a:Z

    iget-object v1, p0, Lnf/c;->b:Lnf/g;

    iget-object v2, p0, Lnf/c;->c:Ls9/d;

    iget-object v3, p0, Lnf/c;->d:Ls9/d;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AnimatedSpeedValueModel(visible="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", step="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", value="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", unit="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
