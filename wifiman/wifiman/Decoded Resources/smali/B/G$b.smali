.class public final LB/G$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB/G;
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
    invoke-direct {p0}, LB/G$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lc0/h;)Lc0/k;
    .locals 2

    sget-object v0, LB/G$b$a;->a:LB/G$b$a;

    new-instance v1, LB/G$b$b;

    invoke-direct {v1, p1}, LB/G$b$b;-><init>(Lc0/h;)V

    invoke-static {v0, v1}, Lc0/l;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object p1

    return-object p1
.end method
