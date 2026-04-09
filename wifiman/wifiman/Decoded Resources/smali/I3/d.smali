.class public final LI3/d;
.super Lt3/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI3/d$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LI3/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:J

.field private final b:I

.field private final c:Z

.field private final d:LC3/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI3/l;

    invoke-direct {v0}, LI3/l;-><init>()V

    sput-object v0, LI3/d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(JIZLC3/t;)V
    .locals 0

    invoke-direct {p0}, Lt3/a;-><init>()V

    iput-wide p1, p0, LI3/d;->a:J

    iput p3, p0, LI3/d;->b:I

    iput-boolean p4, p0, LI3/d;->c:Z

    iput-object p5, p0, LI3/d;->d:LC3/t;

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, LI3/d;->b:I

    return v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, LI3/d;->a:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, LI3/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LI3/d;

    iget-wide v2, p0, LI3/d;->a:J

    iget-wide v4, p1, LI3/d;->a:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget v0, p0, LI3/d;->b:I

    iget v2, p1, LI3/d;->b:I

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, LI3/d;->c:Z

    iget-boolean v2, p1, LI3/d;->c:Z

    if-ne v0, v2, :cond_1

    iget-object v0, p0, LI3/d;->d:LC3/t;

    iget-object p1, p1, LI3/d;->d:LC3/t;

    invoke-static {v0, p1}, Ls3/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, LI3/d;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget v1, p0, LI3/d;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-boolean v2, p0, LI3/d;->c:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ls3/o;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LastLocationRequest["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LI3/d;->a:J

    const-wide v3, 0x7fffffffffffffffL

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    const-string v1, "maxAge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LI3/d;->a:J

    invoke-static {v1, v2, v0}, LC3/w;->b(JLjava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    :cond_0
    iget v1, p0, LI3/d;->b:I

    if-eqz v1, :cond_1

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LI3/d;->b:I

    invoke-static {v1}, LI3/x;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-boolean v1, p0, LI3/d;->c:Z

    if-eqz v1, :cond_2

    const-string v1, ", bypass"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, LI3/d;->d:LC3/t;

    if-eqz v1, :cond_3

    const-string v1, ", impersonation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI3/d;->d:LC3/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_3
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0}, LI3/d;->e()J

    move-result-wide v2

    invoke-static {p1, v1, v2, v3}, Lt3/b;->n(Landroid/os/Parcel;IJ)V

    const/4 v1, 0x2

    invoke-virtual {p0}, LI3/d;->b()I

    move-result v2

    invoke-static {p1, v1, v2}, Lt3/b;->k(Landroid/os/Parcel;II)V

    const/4 v1, 0x3

    iget-boolean v2, p0, LI3/d;->c:Z

    invoke-static {p1, v1, v2}, Lt3/b;->c(Landroid/os/Parcel;IZ)V

    iget-object v1, p0, LI3/d;->d:LC3/t;

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-static {p1, v3, v1, p2, v2}, Lt3/b;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
