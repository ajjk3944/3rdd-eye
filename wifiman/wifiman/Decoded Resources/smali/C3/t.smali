.class public final LC3/t;
.super Lt3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LC3/t;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:LC3/m;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/util/List;

.field private final f:LC3/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC3/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC3/m;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LC3/t;->g:LC3/m;

    new-instance v0, LC3/I;

    invoke-direct {v0}, LC3/I;-><init>()V

    sput-object v0, LC3/t;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {}, Landroid/os/Process;->myUid()I

    invoke-static {}, Landroid/os/Process;->myPid()I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LC3/t;)V
    .locals 1

    const-string v0, "packageName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt3/a;-><init>()V

    if-eqz p6, :cond_1

    invoke-virtual {p6}, LC3/t;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput p1, p0, LC3/t;->a:I

    iput-object p2, p0, LC3/t;->b:Ljava/lang/String;

    iput-object p3, p0, LC3/t;->c:Ljava/lang/String;

    const/4 p1, 0x0

    if-nez p4, :cond_3

    if-eqz p6, :cond_2

    iget-object p4, p6, LC3/t;->d:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object p4, p1

    :cond_3
    :goto_1
    iput-object p4, p0, LC3/t;->d:Ljava/lang/String;

    if-nez p5, :cond_5

    if-eqz p6, :cond_4

    iget-object p1, p6, LC3/t;->e:Ljava/util/List;

    :cond_4
    move-object p5, p1

    if-nez p5, :cond_5

    invoke-static {}, LC3/F;->C()LC3/F;

    move-result-object p5

    const-string p1, "of(...)"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    const-string p1, "<this>"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5}, LC3/F;->F(Ljava/util/Collection;)LC3/F;

    move-result-object p1

    const-string p2, "copyOf(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LC3/t;->e:Ljava/util/List;

    iput-object p6, p0, LC3/t;->f:LC3/t;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-object v0, p0, LC3/t;->f:LC3/t;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LC3/t;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, p0, LC3/t;->a:I

    check-cast p1, LC3/t;

    iget v2, p1, LC3/t;->a:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, LC3/t;->b:Ljava/lang/String;

    iget-object v2, p1, LC3/t;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LC3/t;->c:Ljava/lang/String;

    iget-object v2, p1, LC3/t;->c:Ljava/lang/String;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LC3/t;->d:Ljava/lang/String;

    iget-object v2, p1, LC3/t;->d:Ljava/lang/String;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LC3/t;->f:LC3/t;

    iget-object v2, p1, LC3/t;->f:LC3/t;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LC3/t;->e:Ljava/util/List;

    iget-object p1, p1, LC3/t;->e:Ljava/util/List;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 5

    iget v0, p0, LC3/t;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, LC3/t;->b:Ljava/lang/String;

    iget-object v2, p0, LC3/t;->c:Ljava/lang/String;

    iget-object v3, p0, LC3/t;->d:Ljava/lang/String;

    iget-object v4, p0, LC3/t;->f:LC3/t;

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, LC3/t;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x12

    iget-object v1, p0, LC3/t;->c:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    iget v0, p0, LC3/t;->a:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LC3/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LC3/t;->c:Ljava/lang/String;

    if-eqz v3, :cond_2

    const-string v4, "["

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, LC3/t;->b:Ljava/lang/String;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v2, v5, v6}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, LC3/t;->b:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1, v3, v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v3, "]"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v3, p0, LC3/t;->d:Ljava/lang/String;

    if-eqz v3, :cond_4

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LC3/t;->d:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_3
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LC3/t;->a:I

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    invoke-static {p1, v2, v0}, Lt3/b;->k(Landroid/os/Parcel;II)V

    iget-object v0, p0, LC3/t;->b:Ljava/lang/String;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3}, Lt3/b;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x4

    iget-object v2, p0, LC3/t;->c:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, Lt3/b;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x6

    iget-object v2, p0, LC3/t;->d:Ljava/lang/String;

    invoke-static {p1, v0, v2, v3}, Lt3/b;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x7

    iget-object v2, p0, LC3/t;->f:LC3/t;

    invoke-static {p1, v0, v2, p2, v3}, Lt3/b;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 p2, 0x8

    iget-object v0, p0, LC3/t;->e:Ljava/util/List;

    invoke-static {p1, p2, v0, v3}, Lt3/b;->t(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, v1}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
