.class public abstract Lui/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lui/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lui/v$a;,
        Lui/v$b;,
        Lui/v$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lmh/l;

.field private final c:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lmh/l;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lui/v;->a:Ljava/lang/String;

    iput-object p2, p0, Lui/v;->b:Lmh/l;

    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "must return "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lui/v;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lui/v;-><init>(Ljava/lang/String;Lmh/l;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lui/v;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b(LBh/z;)Z
    .locals 2

    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/a;->getReturnType()Lpi/S;

    move-result-object v0

    iget-object v1, p0, Lui/v;->b:Lmh/l;

    invoke-static {p1}, Lfi/e;->m(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p1

    invoke-interface {v1, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public c(LBh/z;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lui/f$a;->a(Lui/f;LBh/z;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
