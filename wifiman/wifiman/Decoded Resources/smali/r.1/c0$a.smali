.class final Lr/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr/c0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lr/m;
    .locals 1

    invoke-static {}, Lr/c0;->o()Lr/m;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lr/m;
    .locals 1

    invoke-static {}, Lr/c0;->q()Lr/m;

    move-result-object v0

    return-object v0
.end method
