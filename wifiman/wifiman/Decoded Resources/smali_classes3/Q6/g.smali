.class public LQ6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ6/g$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LQ6/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:I

.field private b:I

.field private c:J

.field private d:I

.field private e:I

.field private f:Z

.field private g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ6/g$a;

    invoke-direct {v0}, LQ6/g$a;-><init>()V

    sput-object v0, LQ6/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IIJIIZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LQ6/g;->a:I

    .line 3
    iput p2, p0, LQ6/g;->b:I

    .line 4
    iput-wide p3, p0, LQ6/g;->c:J

    .line 5
    iput p6, p0, LQ6/g;->e:I

    .line 6
    iput p5, p0, LQ6/g;->d:I

    .line 7
    iput-boolean p7, p0, LQ6/g;->f:Z

    .line 8
    iput-boolean p8, p0, LQ6/g;->g:Z

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, LQ6/g;->a:I

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, LQ6/g;->b:I

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, LQ6/g;->c:J

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, LQ6/g;->d:I

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, LQ6/g;->e:I

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, LQ6/g;->f:Z

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_1

    move v1, v2

    :cond_1
    iput-boolean v1, p0, LQ6/g;->g:Z

    return-void
.end method


# virtual methods
.method public a(I)LQ6/g;
    .locals 10

    new-instance v9, LQ6/g;

    iget v1, p0, LQ6/g;->a:I

    iget-wide v3, p0, LQ6/g;->c:J

    iget v5, p0, LQ6/g;->d:I

    iget v6, p0, LQ6/g;->e:I

    iget-boolean v7, p0, LQ6/g;->f:Z

    iget-boolean v8, p0, LQ6/g;->g:Z

    move-object v0, v9

    move v2, p1

    invoke-direct/range {v0 .. v8}, LQ6/g;-><init>(IIJIIZZ)V

    return-object v9
.end method

.method public b()I
    .locals 1

    iget v0, p0, LQ6/g;->b:I

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, LQ6/g;->f:Z

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, LQ6/g;->d:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, LQ6/g;->e:I

    return v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, LQ6/g;->c:J

    return-wide v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, LQ6/g;->a:I

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, LQ6/g;->g:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget p2, p0, LQ6/g;->a:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LQ6/g;->b:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, LQ6/g;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget p2, p0, LQ6/g;->d:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LQ6/g;->e:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, LQ6/g;->f:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, LQ6/g;->g:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
