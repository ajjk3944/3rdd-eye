.class public Ls3/r;
.super Lt3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ls3/r;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Z

.field private final c:Z

.field private final d:I

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/W;

    invoke-direct {v0}, Ls3/W;-><init>()V

    sput-object v0, Ls3/r;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZZII)V
    .locals 0

    invoke-direct {p0}, Lt3/a;-><init>()V

    iput p1, p0, Ls3/r;->a:I

    iput-boolean p2, p0, Ls3/r;->b:Z

    iput-boolean p3, p0, Ls3/r;->c:Z

    iput p4, p0, Ls3/r;->d:I

    iput p5, p0, Ls3/r;->e:I

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Ls3/r;->d:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Ls3/r;->e:I

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Ls3/r;->b:Z

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Ls3/r;->c:Z

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Ls3/r;->a:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, Ls3/r;->i()I

    move-result v1

    invoke-static {p1, v0, v1}, Lt3/b;->k(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Ls3/r;->f()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lt3/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Ls3/r;->g()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lt3/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x4

    invoke-virtual {p0}, Ls3/r;->b()I

    move-result v1

    invoke-static {p1, v0, v1}, Lt3/b;->k(Landroid/os/Parcel;II)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Ls3/r;->e()I

    move-result v1

    invoke-static {p1, v0, v1}, Lt3/b;->k(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
