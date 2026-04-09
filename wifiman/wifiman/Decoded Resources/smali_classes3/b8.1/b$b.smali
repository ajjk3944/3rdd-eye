.class public final Lb8/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/b;
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
    invoke-direct {p0}, Lb8/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lb8/b;
    .locals 1

    const/16 v0, 0x32

    if-ge p1, v0, :cond_0

    new-instance v0, Lb8/b$c;

    invoke-direct {v0, p1}, Lb8/b$c;-><init>(I)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x64

    if-gt p1, v0, :cond_1

    new-instance v0, Lb8/b$e;

    invoke-direct {v0, p1}, Lb8/b$e;-><init>(I)V

    goto :goto_0

    :cond_1
    const/16 v0, 0xc8

    if-gt p1, v0, :cond_2

    new-instance v0, Lb8/b$d;

    invoke-direct {v0, p1}, Lb8/b$d;-><init>(I)V

    goto :goto_0

    :cond_2
    new-instance v0, Lb8/b$a;

    invoke-direct {v0, p1}, Lb8/b$a;-><init>(I)V

    :goto_0
    return-object v0
.end method
