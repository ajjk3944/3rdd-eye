.class public final LV6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/request/e;


# instance fields
.field private final a:LKi/t;

.field private final b:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LKi/t;Lmh/l;)V
    .locals 1

    const-string/jumbo v0, "producerScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "failException"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV6/c;->a:LKi/t;

    iput-object p2, p0, LV6/c;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;LT2/d;LC2/a;Z)Z
    .locals 0

    const-string/jumbo p3, "resource"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "model"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p2, "dataSource"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LV6/c;->a:LKi/t;

    new-instance p3, LS6/j$d;

    invoke-static {p4}, LV6/d;->a(LC2/a;)LS6/a;

    move-result-object p4

    invoke-direct {p3, p1, p4}, LS6/j$d;-><init>(Ljava/lang/Object;LS6/a;)V

    invoke-static {p2, p3}, LKi/n;->b(LKi/w;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LV6/c;->a:LKi/t;

    invoke-interface {p1}, LKi/t;->g()LKi/w;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x1

    invoke-static {p1, p2, p3, p2}, LKi/w$a;->a(LKi/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    return p3
.end method

.method public b(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;LT2/d;Z)Z
    .locals 0

    const-string/jumbo p2, "target"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LV6/c;->b:Lmh/l;

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return p1
.end method
