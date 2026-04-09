.class public final LS0/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
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
    invoke-direct {p0}, LS0/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LS0/e;
    .locals 1

    invoke-static {}, LS0/g;->a()LS0/f;

    move-result-object v0

    invoke-interface {v0}, LS0/f;->b()LS0/e;

    move-result-object v0

    return-object v0
.end method

.method public final b()LS0/e;
    .locals 1

    invoke-static {}, LS0/e;->b()LS0/e;

    move-result-object v0

    return-object v0
.end method
