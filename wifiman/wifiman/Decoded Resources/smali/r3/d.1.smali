.class public Lr3/d;
.super Lt3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lr3/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr3/n;

    invoke-direct {v0}, Lr3/n;-><init>()V

    sput-object v0, Lr3/d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lt3/a;-><init>()V

    iput-object p1, p0, Lr3/d;->a:Ljava/lang/String;

    iput p2, p0, Lr3/d;->b:I

    iput-wide p3, p0, Lr3/d;->c:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lt3/a;-><init>()V

    iput-object p1, p0, Lr3/d;->a:Ljava/lang/String;

    iput-wide p2, p0, Lr3/d;->c:J

    const/4 p1, -0x1

    iput p1, p0, Lr3/d;->b:I

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lr3/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()J
    .locals 4

    iget-wide v0, p0, Lr3/d;->c:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    iget v0, p0, Lr3/d;->b:I

    int-to-long v0, v0

    :cond_0
    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Lr3/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Lr3/d;

    invoke-virtual {p0}, Lr3/d;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lr3/d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lr3/d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lr3/d;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lr3/d;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    invoke-virtual {p0}, Lr3/d;->e()J

    move-result-wide v2

    invoke-virtual {p1}, Lr3/d;->e()J

    move-result-wide v4

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final hashCode()I
    .locals 3

    invoke-virtual {p0}, Lr3/d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lr3/d;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ls3/o;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ls3/o;->c(Ljava/lang/Object;)Ls3/o$a;

    move-result-object v0

    const-string v1, "name"

    invoke-virtual {p0}, Lr3/d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ls3/o$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ls3/o$a;

    invoke-virtual {p0}, Lr3/d;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "version"

    invoke-virtual {v0, v2, v1}, Ls3/o$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ls3/o$a;

    invoke-virtual {v0}, Ls3/o$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lr3/d;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Lt3/b;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x2

    iget v1, p0, Lr3/d;->b:I

    invoke-static {p1, v0, v1}, Lt3/b;->k(Landroid/os/Parcel;II)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lr3/d;->e()J

    move-result-wide v1

    invoke-static {p1, v0, v1, v2}, Lt3/b;->n(Landroid/os/Parcel;IJ)V

    invoke-static {p1, p2}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
