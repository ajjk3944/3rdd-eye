.class LOh/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LOh/e;

.field private final b:LBh/l0;

.field private final c:LOh/a;

.field private final d:Lpi/v0;

.field private final e:LQh/j;


# direct methods
.method public constructor <init>(LOh/e;LBh/l0;LOh/a;Lpi/v0;LQh/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOh/d;->a:LOh/e;

    iput-object p2, p0, LOh/d;->b:LBh/l0;

    iput-object p3, p0, LOh/d;->c:LOh/a;

    iput-object p4, p0, LOh/d;->d:Lpi/v0;

    iput-object p5, p0, LOh/d;->e:LQh/j;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LOh/d;->a:LOh/e;

    iget-object v1, p0, LOh/d;->b:LBh/l0;

    iget-object v2, p0, LOh/d;->c:LOh/a;

    iget-object v3, p0, LOh/d;->d:Lpi/v0;

    iget-object v4, p0, LOh/d;->e:LQh/j;

    invoke-static {v0, v1, v2, v3, v4}, LOh/e;->a(LOh/e;LBh/l0;LOh/a;Lpi/v0;LQh/j;)Lpi/S;

    move-result-object v0

    return-object v0
.end method
