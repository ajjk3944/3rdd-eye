.class public final Lji/c;
.super Lji/a;
.source "SourceFile"

# interfaces
.implements Lji/f;


# instance fields
.field private final c:LBh/a;

.field private final d:LZh/f;


# direct methods
.method public constructor <init>(LBh/a;Lpi/S;LZh/f;Lji/g;)V
    .locals 1

    const-string v0, "declarationDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receiverType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p4}, Lji/a;-><init>(Lpi/S;Lji/g;)V

    iput-object p1, p0, Lji/c;->c:LBh/a;

    iput-object p3, p0, Lji/c;->d:LZh/f;

    return-void
.end method


# virtual methods
.method public a()LZh/f;
    .locals 1

    iget-object v0, p0, Lji/c;->d:LZh/f;

    return-object v0
.end method

.method public c()LBh/a;
    .locals 1

    iget-object v0, p0, Lji/c;->c:LBh/a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cxt { "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lji/c;->c()LBh/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
