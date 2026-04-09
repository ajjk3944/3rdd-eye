.class public final LJ/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ/d$a;
    }
.end annotation


# static fields
.field public static final e:LJ/d$a;

.field private static final f:LJ/d;


# instance fields
.field private final a:Z

.field private final b:J

.field private final c:LW0/i;

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LJ/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LJ/d;->e:LJ/d$a;

    new-instance v0, LJ/d;

    sget-object v1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v1}, Ll0/g$a;->b()J

    move-result-wide v4

    sget-object v6, LW0/i;->Ltr:LW0/i;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v3, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, LJ/d;-><init>(ZJLW0/i;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LJ/d;->f:LJ/d;

    return-void
.end method

.method private constructor <init>(ZJLW0/i;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, LJ/d;->a:Z

    .line 4
    iput-wide p2, p0, LJ/d;->b:J

    .line 5
    iput-object p4, p0, LJ/d;->c:LW0/i;

    .line 6
    iput-boolean p5, p0, LJ/d;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(ZJLW0/i;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LJ/d;-><init>(ZJLW0/i;Z)V

    return-void
.end method

.method public static final synthetic a()LJ/d;
    .locals 1

    sget-object v0, LJ/d;->f:LJ/d;

    return-object v0
.end method


# virtual methods
.method public final b()LW0/i;
    .locals 1

    iget-object v0, p0, LJ/d;->c:LW0/i;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, LJ/d;->d:Z

    return v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, LJ/d;->b:J

    return-wide v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, LJ/d;->a:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LJ/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LJ/d;

    iget-boolean v1, p0, LJ/d;->a:Z

    iget-boolean v3, p1, LJ/d;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, LJ/d;->b:J

    iget-wide v5, p1, LJ/d;->b:J

    invoke-static {v3, v4, v5, v6}, Ll0/g;->j(JJ)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LJ/d;->c:LW0/i;

    iget-object v3, p1, LJ/d;->c:LW0/i;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, LJ/d;->d:Z

    iget-boolean p1, p1, LJ/d;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, LJ/d;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LJ/d;->b:J

    invoke-static {v1, v2}, Ll0/g;->o(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LJ/d;->c:LW0/i;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LJ/d;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TextFieldHandleState(visible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LJ/d;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LJ/d;->b:J

    invoke-static {v1, v2}, Ll0/g;->t(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", direction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LJ/d;->c:LW0/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", handlesCrossed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LJ/d;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
