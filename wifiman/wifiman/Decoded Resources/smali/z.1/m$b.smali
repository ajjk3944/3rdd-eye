.class public final Lz/m$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/m;
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
    invoke-direct {p0}, Lz/m$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lf0/c$b;)Lz/m;
    .locals 1

    new-instance v0, Lz/m$d;

    invoke-direct {v0, p1}, Lz/m$d;-><init>(Lf0/c$b;)V

    return-object v0
.end method

.method public final b(Lf0/c$c;)Lz/m;
    .locals 1

    new-instance v0, Lz/m$f;

    invoke-direct {v0, p1}, Lz/m$f;-><init>(Lf0/c$c;)V

    return-object v0
.end method
