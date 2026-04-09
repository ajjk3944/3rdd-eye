.class public final LV7/a$a;
.super LV7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV7/a$a$a;
    }
.end annotation


# static fields
.field public static final e:LV7/a$a$a;


# instance fields
.field private final c:I

.field private final d:LW7/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LV7/a$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LV7/a$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LV7/a$a;->e:LV7/a$a$a;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LV7/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, LV7/a$a;->c:I

    invoke-virtual {p0}, LV7/a$a;->b()I

    move-result p1

    const/16 v0, -0x50

    if-lt p1, v0, :cond_0

    sget-object p1, LW7/f$a;->EXCELLENT:LW7/f$a;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LV7/a$a;->b()I

    move-result p1

    const/16 v0, -0x64

    if-lt p1, v0, :cond_1

    sget-object p1, LW7/f$a;->GOOD:LW7/f$a;

    goto :goto_0

    :cond_1
    sget-object p1, LW7/f$a;->POOR:LW7/f$a;

    :goto_0
    iput-object p1, p0, LV7/a$a;->d:LW7/f$a;

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, LV7/a$a;->c:I

    return v0
.end method

.method public c()I
    .locals 1

    const/16 v0, -0x32

    return v0
.end method

.method public d()I
    .locals 1

    const/16 v0, -0x6e

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LV7/a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LV7/a$a;

    iget v1, p0, LV7/a$a;->c:I

    iget p1, p1, LV7/a$a;->c:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public h()LW7/f$a;
    .locals 1

    iget-object v0, p0, LV7/a$a;->d:LW7/f$a;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LV7/a$a;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, LV7/a$a;->c:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "G3(dbm="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
