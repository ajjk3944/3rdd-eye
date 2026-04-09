.class final Lk6/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk6/d;
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
    invoke-direct {p0}, Lk6/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lx6/b;
    .locals 1

    new-instance v0, Lk6/d$a$a;

    invoke-direct {v0}, Lk6/d$a$a;-><init>()V

    return-object v0
.end method
