.class public abstract Lli/N;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lli/N$a;,
        Lli/N$b;
    }
.end annotation


# instance fields
.field private final a:LWh/c;

.field private final b:LWh/g;

.field private final c:LBh/g0;


# direct methods
.method private constructor <init>(LWh/c;LWh/g;LBh/g0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lli/N;->a:LWh/c;

    .line 4
    iput-object p2, p0, Lli/N;->b:LWh/g;

    .line 5
    iput-object p3, p0, Lli/N;->c:LBh/g0;

    return-void
.end method

.method public synthetic constructor <init>(LWh/c;LWh/g;LBh/g0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lli/N;-><init>(LWh/c;LWh/g;LBh/g0;)V

    return-void
.end method


# virtual methods
.method public abstract a()LZh/c;
.end method

.method public final b()LWh/c;
    .locals 1

    iget-object v0, p0, Lli/N;->a:LWh/c;

    return-object v0
.end method

.method public final c()LBh/g0;
    .locals 1

    iget-object v0, p0, Lli/N;->c:LBh/g0;

    return-object v0
.end method

.method public final d()LWh/g;
    .locals 1

    iget-object v0, p0, Lli/N;->b:LWh/g;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lli/N;->a()LZh/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
