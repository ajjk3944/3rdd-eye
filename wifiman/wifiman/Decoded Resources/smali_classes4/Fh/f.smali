.class public final LFh/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSh/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFh/f$a;
    }
.end annotation


# static fields
.field public static final c:LFh/f$a;


# instance fields
.field private final a:Ljava/lang/Class;

.field private final b:LTh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LFh/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFh/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LFh/f;->c:LFh/f$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Class;LTh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LFh/f;->a:Ljava/lang/Class;

    .line 4
    iput-object p2, p0, LFh/f;->b:LTh/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;LTh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LFh/f;-><init>(Ljava/lang/Class;LTh/a;)V

    return-void
.end method


# virtual methods
.method public a()LTh/a;
    .locals 1

    iget-object v0, p0, LFh/f;->b:LTh/a;

    return-object v0
.end method

.method public b()LZh/b;
    .locals 1

    iget-object v0, p0, LFh/f;->a:Ljava/lang/Class;

    invoke-static {v0}, LGh/f;->e(Ljava/lang/Class;)LZh/b;

    move-result-object v0

    return-object v0
.end method

.method public c(LSh/x$d;[B)V
    .locals 1

    const-string p2, "visitor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, LFh/c;->a:LFh/c;

    iget-object v0, p0, LFh/f;->a:Ljava/lang/Class;

    invoke-virtual {p2, v0, p1}, LFh/c;->i(Ljava/lang/Class;LSh/x$d;)V

    return-void
.end method

.method public d(LSh/x$c;[B)V
    .locals 1

    const-string p2, "visitor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, LFh/c;->a:LFh/c;

    iget-object v0, p0, LFh/f;->a:Ljava/lang/Class;

    invoke-virtual {p2, v0, p1}, LFh/c;->b(Ljava/lang/Class;LSh/x$c;)V

    return-void
.end method

.method public final e()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, LFh/f;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LFh/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, LFh/f;->a:Ljava/lang/Class;

    check-cast p1, LFh/f;

    iget-object p1, p1, LFh/f;->a:Ljava/lang/Class;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getLocation()Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LFh/f;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v1, "getName(...)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/16 v3, 0x2e

    const/16 v4, 0x2f

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/t;->K(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".class"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LFh/f;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, LFh/f;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LFh/f;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
