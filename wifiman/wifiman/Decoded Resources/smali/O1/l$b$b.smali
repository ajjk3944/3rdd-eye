.class public final LO1/l$b$b;
.super LO1/l$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO1/l$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lmh/p;

.field private final b:LIi/x;

.field private final c:LO1/m;

.field private final d:Ldh/i;


# direct methods
.method public constructor <init>(Lmh/p;LIi/x;LO1/m;Ldh/i;)V
    .locals 1

    const-string v0, "transform"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callerContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LO1/l$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LO1/l$b$b;->a:Lmh/p;

    iput-object p2, p0, LO1/l$b$b;->b:LIi/x;

    iput-object p3, p0, LO1/l$b$b;->c:LO1/m;

    iput-object p4, p0, LO1/l$b$b;->d:Ldh/i;

    return-void
.end method


# virtual methods
.method public final a()LIi/x;
    .locals 1

    iget-object v0, p0, LO1/l$b$b;->b:LIi/x;

    return-object v0
.end method

.method public final b()Ldh/i;
    .locals 1

    iget-object v0, p0, LO1/l$b$b;->d:Ldh/i;

    return-object v0
.end method

.method public c()LO1/m;
    .locals 1

    iget-object v0, p0, LO1/l$b$b;->c:LO1/m;

    return-object v0
.end method

.method public final d()Lmh/p;
    .locals 1

    iget-object v0, p0, LO1/l$b$b;->a:Lmh/p;

    return-object v0
.end method
