.class public final Lr3/B;
.super Lt3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lr3/B;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Z

.field private final b:Ljava/lang/String;

.field private final c:I

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr3/C;

    invoke-direct {v0}, Lr3/C;-><init>()V

    sput-object v0, Lr3/B;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ZLjava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Lt3/a;-><init>()V

    iput-boolean p1, p0, Lr3/B;->a:Z

    iput-object p2, p0, Lr3/B;->b:Ljava/lang/String;

    invoke-static {p3}, Lr3/I;->a(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lr3/B;->c:I

    invoke-static {p4}, Lr3/o;->a(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lr3/B;->d:I

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lr3/B;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lr3/B;->a:Z

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lr3/B;->d:I

    invoke-static {v0}, Lr3/o;->a(I)I

    move-result v0

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lr3/B;->c:I

    invoke-static {v0}, Lr3/I;->a(I)I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget-boolean v1, p0, Lr3/B;->a:Z

    invoke-static {p1, v0, v1}, Lt3/b;->c(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lr3/B;->b:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v2, v0, v1}, Lt3/b;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    iget v1, p0, Lr3/B;->c:I

    invoke-static {p1, v0, v1}, Lt3/b;->k(Landroid/os/Parcel;II)V

    const/4 v0, 0x4

    iget v1, p0, Lr3/B;->d:I

    invoke-static {p1, v0, v1}, Lt3/b;->k(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
