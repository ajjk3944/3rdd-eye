.class abstract LSh/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSh/x$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSh/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "a"
.end annotation


# instance fields
.field final synthetic a:LSh/h;


# direct methods
.method public constructor <init>(LSh/h;)V
    .locals 0

    iput-object p1, p0, LSh/h$a;->a:LSh/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LZh/f;Ldi/f;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldi/s;

    invoke-direct {v0, p2}, Ldi/s;-><init>(Ldi/f;)V

    invoke-virtual {p0, p1, v0}, LSh/h$a;->h(LZh/f;Ldi/g;)V

    return-void
.end method

.method public c(LZh/f;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LSh/h$a;->a:LSh/h;

    invoke-static {v0, p1, p2}, LSh/h;->N(LSh/h;LZh/f;Ljava/lang/Object;)Ldi/g;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, LSh/h$a;->h(LZh/f;Ldi/g;)V

    return-void
.end method

.method public d(LZh/f;)LSh/x$b;
    .locals 2

    new-instance v0, LSh/h$a$b;

    iget-object v1, p0, LSh/h$a;->a:LSh/h;

    invoke-direct {v0, v1, p1, p0}, LSh/h$a$b;-><init>(LSh/h;LZh/f;LSh/h$a;)V

    return-object v0
.end method

.method public e(LZh/f;LZh/b;LZh/f;)V
    .locals 1

    const-string v0, "enumClassId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enumEntryName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldi/k;

    invoke-direct {v0, p2, p3}, Ldi/k;-><init>(LZh/b;LZh/f;)V

    invoke-virtual {p0, p1, v0}, LSh/h$a;->h(LZh/f;Ldi/g;)V

    return-void
.end method

.method public f(LZh/f;LZh/b;)LSh/x$a;
    .locals 4

    const-string v0, "classId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LSh/h$a;->a:LSh/h;

    sget-object v2, LBh/g0;->a:LBh/g0;

    const-string v3, "NO_SOURCE"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p2, v2, v0}, LSh/h;->x(LZh/b;LBh/g0;Ljava/util/List;)LSh/x$a;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v1, LSh/h$a$a;

    invoke-direct {v1, p2, p0, p1, v0}, LSh/h$a$a;-><init>(LSh/x$a;LSh/h$a;LZh/f;Ljava/util/ArrayList;)V

    return-object v1
.end method

.method public abstract g(LZh/f;Ljava/util/ArrayList;)V
.end method

.method public abstract h(LZh/f;Ldi/g;)V
.end method
