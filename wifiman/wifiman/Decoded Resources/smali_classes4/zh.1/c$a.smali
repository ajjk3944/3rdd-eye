.class public final Lzh/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzh/c;
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
    invoke-direct {p0}, Lzh/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lzh/f;)Lzh/c;
    .locals 1

    const-string v0, "functionTypeKind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lzh/f$a;->e:Lzh/f$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lzh/c;->Function:Lzh/c;

    goto :goto_0

    :cond_0
    sget-object v0, Lzh/f$d;->e:Lzh/f$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lzh/c;->SuspendFunction:Lzh/c;

    goto :goto_0

    :cond_1
    sget-object v0, Lzh/f$b;->e:Lzh/f$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lzh/c;->KFunction:Lzh/c;

    goto :goto_0

    :cond_2
    sget-object v0, Lzh/f$c;->e:Lzh/f$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lzh/c;->KSuspendFunction:Lzh/c;

    goto :goto_0

    :cond_3
    sget-object p1, Lzh/c;->UNKNOWN:Lzh/c;

    :goto_0
    return-object p1
.end method
