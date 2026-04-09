.class public final Laf/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laf/e0$a;,
        Laf/e0$b;
    }
.end annotation


# static fields
.field public static final a:Laf/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laf/e0;

    invoke-direct {v0}, Laf/e0;-><init>()V

    sput-object v0, Laf/e0;->a:Laf/e0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lhf/h;
    .locals 3

    new-instance v0, Lhf/h;

    sget-object v1, Lff/a;->DOWN:Lff/a;

    const/16 v2, 0x28

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-direct {v0, v1, v2}, Lhf/h;-><init>(Lff/a;[F)V

    return-object v0

    nop

    :array_0
    .array-data 4
        0x3f19999a    # 0.6f
        0x3f266666    # 0.65f
        0x3f333333    # 0.7f
        0x3f400000    # 0.75f
        0x3f4ccccd    # 0.8f
        0x3f4f5c29    # 0.81f
        0x3f3ae148    # 0.73f
        0x3f333333    # 0.7f
        0x3f51eb85    # 0.82f
        0x3f1eb852    # 0.62f
        0x3f2e147b    # 0.68f
        0x3f3ae148    # 0.73f
        0x3f400000    # 0.75f
        0x3f400000    # 0.75f
        0x3f4ccccd    # 0.8f
        0x3f6147ae    # 0.88f
        0x3f570a3d    # 0.84f
        0x3f63d70a    # 0.89f
        0x3f666666    # 0.9f
        0x3f68f5c3    # 0.91f
        0x3f6147ae    # 0.88f
        0x3f570a3d    # 0.84f
        0x3f4f5c29    # 0.81f
        0x3f400000    # 0.75f
        0x3f4ccccd    # 0.8f
        0x3f6147ae    # 0.88f
        0x3f570a3d    # 0.84f
        0x3f63d70a    # 0.89f
        0x3f666666    # 0.9f
        0x3f68f5c3    # 0.91f
        0x3f19999a    # 0.6f
        0x3f266666    # 0.65f
        0x3f333333    # 0.7f
        0x3f400000    # 0.75f
        0x3f4ccccd    # 0.8f
        0x3f4f5c29    # 0.81f
        0x3f3ae148    # 0.73f
        0x3f333333    # 0.7f
        0x3f51eb85    # 0.82f
        0x3f1eb852    # 0.62f
    .end array-data
.end method

.method public final b()Lhf/h;
    .locals 3

    new-instance v0, Lhf/h;

    sget-object v1, Lff/a;->UP:Lff/a;

    const/16 v2, 0x28

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-direct {v0, v1, v2}, Lhf/h;-><init>(Lff/a;[F)V

    return-object v0

    nop

    :array_0
    .array-data 4
        0x3f000000    # 0.5f
        0x3f0ccccd    # 0.55f
        0x3f0f5c29    # 0.56f
        0x3f51eb85    # 0.82f
        0x3f59999a    # 0.85f
        0x3f3d70a4    # 0.74f
        0x3f428f5c    # 0.76f
        0x3f19999a    # 0.6f
        0x3f266666    # 0.65f
        0x3f266666    # 0.65f
        0x3f23d70a    # 0.64f
        0x3f400000    # 0.75f
        0x3f333333    # 0.7f
        0x3f3851ec    # 0.72f
        0x3f400000    # 0.75f
        0x3f428f5c    # 0.76f
        0x3f4ccccd    # 0.8f
        0x3f3851ec    # 0.72f
        0x3f428f5c    # 0.76f
        0x3f4ccccd    # 0.8f
        0x3f51eb85    # 0.82f
        0x3f547ae1    # 0.83f
        0x3f3d70a4    # 0.74f
        0x3f51eb85    # 0.82f
        0x3f59999a    # 0.85f
        0x3f3d70a4    # 0.74f
        0x3f428f5c    # 0.76f
        0x3f19999a    # 0.6f
        0x3f266666    # 0.65f
        0x3f266666    # 0.65f
        0x3f23d70a    # 0.64f
        0x3f400000    # 0.75f
        0x3f333333    # 0.7f
        0x3f3851ec    # 0.72f
        0x3f400000    # 0.75f
        0x3f428f5c    # 0.76f
        0x3f4ccccd    # 0.8f
        0x3f3851ec    # 0.72f
        0x3f428f5c    # 0.76f
        0x3f4ccccd    # 0.8f
    .end array-data
.end method
