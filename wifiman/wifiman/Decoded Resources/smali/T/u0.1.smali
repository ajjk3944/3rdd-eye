.class public final LT/u0;
.super LT/j1;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT/u0$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LT/u0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:LT/u0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT/u0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT/u0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LT/u0;->c:LT/u0$b;

    new-instance v0, LT/u0$a;

    invoke-direct {v0}, LT/u0$a;-><init>()V

    sput-object v0, LT/u0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    invoke-direct {p0, p1}, LT/j1;-><init>(F)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-virtual {p0}, LT/j1;->c()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method
