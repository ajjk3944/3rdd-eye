.class final Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/core/ui/sso/login/UiLoginVMImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/ui/core/ui/sso/login/g$b;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c$a;

    invoke-direct {v0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c$a;-><init>()V

    sput-object v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/ui/core/ui/sso/login/g$b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "scene"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "username"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "password"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->a:Lcom/ui/core/ui/sso/login/g$b;

    iput-object p2, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lcom/ui/core/ui/sso/login/g$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->a:Lcom/ui/core/ui/sso/login/g$b;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;

    iget-object v1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->a:Lcom/ui/core/ui/sso/login/g$b;

    iget-object v3, p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->a:Lcom/ui/core/ui/sso/login/g$b;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->c:Ljava/lang/String;

    iget-object p1, p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->c:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->a:Lcom/ui/core/ui/sso/login/g$b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->a:Lcom/ui/core/ui/sso/login/g$b;

    iget-object v1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->c:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "SavedState(scene="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", username="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", password="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string/jumbo p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->a:Lcom/ui/core/ui/sso/login/g$b;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$c;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
