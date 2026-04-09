.class public final LI3/i;
.super Lt3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LI3/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Z

.field private final d:Z

.field private final e:Z

.field private final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI3/r;

    invoke-direct {v0}, LI3/r;-><init>()V

    sput-object v0, LI3/i;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZZZZZ)V
    .locals 0

    invoke-direct {p0}, Lt3/a;-><init>()V

    iput-boolean p1, p0, LI3/i;->a:Z

    iput-boolean p2, p0, LI3/i;->b:Z

    iput-boolean p3, p0, LI3/i;->c:Z

    iput-boolean p4, p0, LI3/i;->d:Z

    iput-boolean p5, p0, LI3/i;->e:Z

    iput-boolean p6, p0, LI3/i;->f:Z

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, LI3/i;->f:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, LI3/i;->c:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, LI3/i;->d:Z

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, LI3/i;->a:Z

    return v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, LI3/i;->e:Z

    return v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, LI3/i;->b:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, LI3/i;->g()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lt3/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x2

    invoke-virtual {p0}, LI3/i;->j()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lt3/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x3

    invoke-virtual {p0}, LI3/i;->e()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lt3/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x4

    invoke-virtual {p0}, LI3/i;->f()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lt3/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x5

    invoke-virtual {p0}, LI3/i;->i()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lt3/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x6

    invoke-virtual {p0}, LI3/i;->b()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lt3/b;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
