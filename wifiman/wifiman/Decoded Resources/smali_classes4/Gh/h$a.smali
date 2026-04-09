.class public final LGh/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGh/h;
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
    invoke-direct {p0}, LGh/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LZh/f;)LGh/h;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LGh/f;->l(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LGh/v;

    check-cast p1, Ljava/lang/Enum;

    invoke-direct {v0, p2, p1}, LGh/v;-><init>(LZh/f;Ljava/lang/Enum;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/annotation/Annotation;

    if-eqz v0, :cond_1

    new-instance v0, LGh/i;

    check-cast p1, Ljava/lang/annotation/Annotation;

    invoke-direct {v0, p2, p1}, LGh/i;-><init>(LZh/f;Ljava/lang/annotation/Annotation;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, [Ljava/lang/Object;

    if-eqz v0, :cond_2

    new-instance v0, LGh/l;

    check-cast p1, [Ljava/lang/Object;

    invoke-direct {v0, p2, p1}, LGh/l;-><init>(LZh/f;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_3

    new-instance v0, LGh/r;

    check-cast p1, Ljava/lang/Class;

    invoke-direct {v0, p2, p1}, LGh/r;-><init>(LZh/f;Ljava/lang/Class;)V

    goto :goto_0

    :cond_3
    new-instance v0, LGh/x;

    invoke-direct {v0, p2, p1}, LGh/x;-><init>(LZh/f;Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method
