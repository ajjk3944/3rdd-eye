.class LOh/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LBh/e;

.field private final b:LOh/i;

.field private final c:Lpi/d0;

.field private final d:LOh/a;


# direct methods
.method public constructor <init>(LBh/e;LOh/i;Lpi/d0;LOh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOh/h;->a:LBh/e;

    iput-object p2, p0, LOh/h;->b:LOh/i;

    iput-object p3, p0, LOh/h;->c:Lpi/d0;

    iput-object p4, p0, LOh/h;->d:LOh/a;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LOh/h;->a:LBh/e;

    iget-object v1, p0, LOh/h;->b:LOh/i;

    iget-object v2, p0, LOh/h;->c:Lpi/d0;

    iget-object v3, p0, LOh/h;->d:LOh/a;

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    invoke-static {v0, v1, v2, v3, p1}, LOh/i;->i(LBh/e;LOh/i;Lpi/d0;LOh/a;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method
