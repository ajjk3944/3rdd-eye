.class public final synthetic LTe/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lma/a;

.field public final synthetic b:LTe/h;

.field public final synthetic c:Lmh/p;


# direct methods
.method public synthetic constructor <init>(Lma/a;LTe/h;Lmh/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTe/O;->a:Lma/a;

    iput-object p2, p0, LTe/O;->b:LTe/h;

    iput-object p3, p0, LTe/O;->c:Lmh/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LTe/O;->a:Lma/a;

    iget-object v1, p0, LTe/O;->b:LTe/h;

    iget-object v2, p0, LTe/O;->c:Lmh/p;

    check-cast p1, LTe/H;

    invoke-static {v0, v1, v2, p1}, LTe/Q;->b(Lma/a;LTe/h;Lmh/p;LTe/H;)Lm0/l0;

    move-result-object p1

    return-object p1
.end method
