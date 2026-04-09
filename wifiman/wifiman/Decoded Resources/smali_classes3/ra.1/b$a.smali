.class public abstract Lra/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lra/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lra/b$a$a;,
        Lra/b$a$b;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lra/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(F)F
    .locals 1

    invoke-virtual {p0}, Lra/b$a;->b()F

    move-result v0

    mul-float/2addr p1, v0

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    return p1
.end method

.method protected abstract b()F
.end method
