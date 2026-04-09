.class public final LN3/j;
.super Lt3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LN3/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:Ls3/I;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN3/k;

    invoke-direct {v0}, LN3/k;-><init>()V

    sput-object v0, LN3/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILs3/I;)V
    .locals 0

    invoke-direct {p0}, Lt3/a;-><init>()V

    iput p1, p0, LN3/j;->a:I

    iput-object p2, p0, LN3/j;->b:Ls3/I;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, LN3/j;->a:I

    invoke-static {p1, v1, v2}, Lt3/b;->k(Landroid/os/Parcel;II)V

    iget-object v1, p0, LN3/j;->b:Ls3/I;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v3, v1, p2, v2}, Lt3/b;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
