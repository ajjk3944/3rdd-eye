.class public final LN3/l;
.super Lt3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LN3/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field private final b:Lr3/b;

.field private final c:Ls3/K;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN3/m;

    invoke-direct {v0}, LN3/m;-><init>()V

    sput-object v0, LN3/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILr3/b;Ls3/K;)V
    .locals 0

    invoke-direct {p0}, Lt3/a;-><init>()V

    iput p1, p0, LN3/l;->a:I

    iput-object p2, p0, LN3/l;->b:Lr3/b;

    iput-object p3, p0, LN3/l;->c:Ls3/K;

    return-void
.end method


# virtual methods
.method public final b()Lr3/b;
    .locals 1

    iget-object v0, p0, LN3/l;->b:Lr3/b;

    return-object v0
.end method

.method public final e()Ls3/K;
    .locals 1

    iget-object v0, p0, LN3/l;->c:Ls3/K;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, LN3/l;->a:I

    invoke-static {p1, v1, v2}, Lt3/b;->k(Landroid/os/Parcel;II)V

    iget-object v1, p0, LN3/l;->b:Lr3/b;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lt3/b;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    iget-object v2, p0, LN3/l;->c:Ls3/K;

    invoke-static {p1, v1, v2, p2, v3}, Lt3/b;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
