.class public final Lvj/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvj/e;
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
    invoke-direct {p0}, Lvj/e$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lvj/e$a;ZLmh/l;)Lvj/f;
    .locals 0

    invoke-direct {p0, p1, p2}, Lvj/e$a;->b(ZLmh/l;)Lvj/f;

    move-result-object p0

    return-object p0
.end method

.method private final b(ZLmh/l;)Lvj/f;
    .locals 1

    new-instance v0, Lvj/f;

    invoke-direct {v0, p1}, Lvj/f;-><init>(Z)V

    invoke-interface {p2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
