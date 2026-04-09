.class public final Ls3/d0;
.super Lt3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ls3/d0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:Landroid/os/Bundle;

.field b:[Lr3/d;

.field c:I

.field d:Ls3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/e0;

    invoke-direct {v0}, Ls3/e0;-><init>()V

    sput-object v0, Ls3/d0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Bundle;[Lr3/d;ILs3/e;)V
    .locals 0

    invoke-direct {p0}, Lt3/a;-><init>()V

    iput-object p1, p0, Ls3/d0;->a:Landroid/os/Bundle;

    iput-object p2, p0, Ls3/d0;->b:[Lr3/d;

    iput p3, p0, Ls3/d0;->c:I

    iput-object p4, p0, Ls3/d0;->d:Ls3/e;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Ls3/d0;->a:Landroid/os/Bundle;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lt3/b;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/4 v1, 0x2

    iget-object v2, p0, Ls3/d0;->b:[Lr3/d;

    invoke-static {p1, v1, v2, p2, v3}, Lt3/b;->s(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    iget v2, p0, Ls3/d0;->c:I

    invoke-static {p1, v1, v2}, Lt3/b;->k(Landroid/os/Parcel;II)V

    const/4 v1, 0x4

    iget-object v2, p0, Ls3/d0;->d:Ls3/e;

    invoke-static {p1, v1, v2, p2, v3}, Lt3/b;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
