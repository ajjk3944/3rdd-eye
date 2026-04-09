.class public final LU7/a;
.super LW7/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU7/a$a;
    }
.end annotation


# static fields
.field public static final e:LU7/a$a;


# instance fields
.field private final c:I

.field private final d:LW7/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LU7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU7/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LU7/a;->e:LU7/a$a;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, LW7/f;-><init>()V

    iput p1, p0, LU7/a;->c:I

    invoke-virtual {p0}, LU7/a;->b()I

    move-result p1

    const/16 v0, -0x2d

    if-lt p1, v0, :cond_0

    sget-object p1, LW7/f$a;->EXCELLENT:LW7/f$a;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LU7/a;->b()I

    move-result p1

    const/16 v0, -0x3c

    if-lt p1, v0, :cond_1

    sget-object p1, LW7/f$a;->GOOD:LW7/f$a;

    goto :goto_0

    :cond_1
    sget-object p1, LW7/f$a;->POOR:LW7/f$a;

    :goto_0
    iput-object p1, p0, LU7/a;->d:LW7/f$a;

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, LU7/a;->c:I

    return v0
.end method

.method public c()I
    .locals 1

    const/16 v0, -0x14

    return v0
.end method

.method public d()I
    .locals 1

    const/16 v0, -0x5a

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LU7/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LU7/a;

    iget v1, p0, LU7/a;->c:I

    iget p1, p1, LU7/a;->c:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public h()LW7/f$a;
    .locals 1

    iget-object v0, p0, LU7/a;->d:LW7/f$a;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LU7/a;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, LU7/a;->c:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BluetoothSignalStrength(dbm="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
