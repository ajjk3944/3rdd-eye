.class public abstract LG3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LG3/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    sput-object v0, LG3/b;->a:Ljava/lang/ClassLoader;

    return-void
.end method

.method public static a(Landroid/os/Parcel;)Ljava/util/ArrayList;
    .locals 1

    sget-object v0, LG3/b;->a:Ljava/lang/ClassLoader;

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method
