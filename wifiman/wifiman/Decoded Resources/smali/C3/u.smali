.class public final LC3/u;
.super Lt3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LC3/u;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Landroid/os/IBinder;

.field private final c:Landroid/os/IBinder;

.field private final d:Landroid/app/PendingIntent;

.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC3/v;

    invoke-direct {v0}, LC3/v;-><init>()V

    sput-object v0, LC3/u;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lt3/a;-><init>()V

    iput p1, p0, LC3/u;->a:I

    iput-object p2, p0, LC3/u;->b:Landroid/os/IBinder;

    iput-object p3, p0, LC3/u;->c:Landroid/os/IBinder;

    iput-object p4, p0, LC3/u;->d:Landroid/app/PendingIntent;

    iput-object p5, p0, LC3/u;->e:Ljava/lang/String;

    return-void
.end method

.method public static b(LC3/P;)LC3/u;
    .locals 7

    new-instance v6, LC3/u;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x0

    move-object v0, v6

    move-object v3, p0

    invoke-direct/range {v0 .. v5}, LC3/u;-><init>(ILandroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Ljava/lang/String;)V

    return-object v6
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget v0, p0, LC3/u;->a:I

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    invoke-static {p1, v2, v0}, Lt3/b;->k(Landroid/os/Parcel;II)V

    iget-object v0, p0, LC3/u;->b:Landroid/os/IBinder;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3}, Lt3/b;->j(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v0, 0x3

    iget-object v2, p0, LC3/u;->c:Landroid/os/IBinder;

    invoke-static {p1, v0, v2, v3}, Lt3/b;->j(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v0, 0x4

    iget-object v2, p0, LC3/u;->d:Landroid/app/PendingIntent;

    invoke-static {p1, v0, v2, p2, v3}, Lt3/b;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x6

    iget-object v0, p0, LC3/u;->e:Ljava/lang/String;

    invoke-static {p1, p2, v0, v3}, Lt3/b;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v1}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
