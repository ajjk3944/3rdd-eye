.class public abstract Ls0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/g$a;,
        Ls0/g$b;,
        Ls0/g$c;,
        Ls0/g$d;,
        Ls0/g$e;,
        Ls0/g$f;,
        Ls0/g$g;,
        Ls0/g$h;,
        Ls0/g$i;,
        Ls0/g$j;,
        Ls0/g$k;,
        Ls0/g$l;,
        Ls0/g$m;,
        Ls0/g$n;,
        Ls0/g$o;,
        Ls0/g$p;,
        Ls0/g$q;,
        Ls0/g$r;,
        Ls0/g$s;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:Z


# direct methods
.method private constructor <init>(ZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Ls0/g;->a:Z

    iput-boolean p2, p0, Ls0/g;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    :cond_1
    const/4 p3, 0x0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Ls0/g;-><init>(ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ls0/g;-><init>(ZZ)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Ls0/g;->a:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Ls0/g;->b:Z

    return v0
.end method
