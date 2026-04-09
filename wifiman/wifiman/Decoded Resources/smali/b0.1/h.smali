.class public abstract Lb0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lb0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lb0/g;

    const/4 v1, 0x0

    new-array v2, v1, [J

    new-array v3, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3}, Lb0/g;-><init>(I[J[Ljava/lang/Object;)V

    sput-object v0, Lb0/h;->a:Lb0/g;

    return-void
.end method

.method public static final a()Lb0/g;
    .locals 1

    sget-object v0, Lb0/h;->a:Lb0/g;

    return-object v0
.end method
