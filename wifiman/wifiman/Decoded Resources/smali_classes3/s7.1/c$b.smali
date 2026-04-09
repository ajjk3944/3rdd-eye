.class public final Ls7/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
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
    invoke-direct {p0}, Ls7/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmh/l;)Ls7/c;
    .locals 1

    const-string/jumbo v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls7/c$a;

    invoke-direct {v0}, Ls7/c$a;-><init>()V

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ls7/c$a;->a()Ls7/c;

    move-result-object p1

    return-object p1
.end method
