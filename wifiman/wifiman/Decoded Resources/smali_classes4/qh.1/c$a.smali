.class public final Lqh/c$a;
.super Lqh/c;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lqh/c;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lqh/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c()F
    .locals 1

    invoke-static {}, Lqh/c;->a()Lqh/c;

    move-result-object v0

    invoke-virtual {v0}, Lqh/c;->c()F

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    invoke-static {}, Lqh/c;->a()Lqh/c;

    move-result-object v0

    invoke-virtual {v0}, Lqh/c;->d()I

    move-result v0

    return v0
.end method

.method public g(I)I
    .locals 1

    invoke-static {}, Lqh/c;->a()Lqh/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqh/c;->g(I)I

    move-result p1

    return p1
.end method
